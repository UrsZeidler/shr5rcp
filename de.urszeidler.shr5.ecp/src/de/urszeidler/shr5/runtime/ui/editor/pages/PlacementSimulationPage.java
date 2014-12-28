package de.urszeidler.shr5.runtime.ui.editor.pages;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;

import de.urszeidler.eclipse.shr5.AbstaktFernKampfwaffe;
import de.urszeidler.eclipse.shr5.AbstraktGegenstand;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.FeuerModus;
import de.urszeidler.eclipse.shr5.Feuerwaffe;
import de.urszeidler.eclipse.shr5.Kleidung;
import de.urszeidler.eclipse.shr5.Nahkampfwaffe;
import de.urszeidler.eclipse.shr5.ShrList;
import de.urszeidler.eclipse.shr5.gameplay.CombatTurn;
import de.urszeidler.eclipse.shr5.gameplay.Command;
import de.urszeidler.eclipse.shr5.gameplay.CommandWrapper;
import de.urszeidler.eclipse.shr5.gameplay.ComplexAction;
import de.urszeidler.eclipse.shr5.gameplay.DamageTest;
import de.urszeidler.eclipse.shr5.gameplay.DefensTestCmd;
import de.urszeidler.eclipse.shr5.gameplay.ExecutionProtocol;
import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;
import de.urszeidler.eclipse.shr5.gameplay.Initative;
import de.urszeidler.eclipse.shr5.gameplay.InitativePass;
import de.urszeidler.eclipse.shr5.gameplay.MeeleAttackCmd;
import de.urszeidler.eclipse.shr5.gameplay.RangedAttackCmd;
import de.urszeidler.eclipse.shr5.gameplay.SimpleAction;
import de.urszeidler.eclipse.shr5.gameplay.SkillTestCmd;
import de.urszeidler.eclipse.shr5.gameplay.SubjectCommand;
import de.urszeidler.eclipse.shr5.gameplay.util.CommandCallback;
import de.urszeidler.eclipse.shr5.gameplay.util.GameplayTools;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.eclipse.shr5.runtime.Team;
import de.urszeidler.eclipse.shr5.runtime.Zustand;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools.DamageCode;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.shr5.ecp.editor.pages.AbstractShr5Page;
import de.urszeidler.shr5.ecp.service.CombatViewer;
import de.urszeidler.shr5.ecp.service.ScriptService;
import de.urszeidler.shr5.ecp.service.ScriptViewer;
import de.urszeidler.shr5.scripting.Placement;
import de.urszeidler.shr5.scripting.Script;
import de.urszeidler.shr5.scripting.ScriptingFactory;
import de.urszeidler.shr5.scripting.Scripts;
import org.eclipse.swt.widgets.ProgressBar;

public class PlacementSimulationPage extends AbstractShr5Page<Placement> {
    // private DataBindingContext m_bindingContext;
    private Placement object;
    private EditingDomain editingDomain;
    private Label lblNewLabel;
    private Text text;
    // private IObservableList printedProtocol;
    private Map<Object, CharacterMetrik> metric = new HashMap<Object, PlacementSimulationPage.CharacterMetrik>();
    // private Map<Boolean, CharacterMetrik> playerMetric = new HashMap<Boolean, PlacementSimulationPage.CharacterMetrik>();
    private Group grpType;
    private CCombo combo;
    private Composite composite;
    private Table table;
    // private Collection<CharacterMetrik> cm;
    // private WritableList list = new WritableList();
    private TableViewer tableViewer;
    // private TableColumn tblclmnNewColumn;
    // private TableColumn tblclmnNewColumn_1;
    // private TableColumn tblclmnNewColumn_2;

    // private CharacterMetrik m;
    private TableColumn tblclmnName;
    private TableViewerColumn tableViewerColumn;
    private TableColumn tblclmnAttack;
    private TableViewerColumn tableViewerColumn_1;
    private TableColumn tblclmnDefense;
    private TableViewerColumn tableViewerColumn_2;
    private TableColumn tblclmnDamage;
    private TableViewerColumn tableViewerColumn_3;
    private TableColumn tblclmnIni;
    private TableViewerColumn tableViewerColumn_4;
    private Spinner spinner;
    private Composite composite_1;
    private Label lblRounds;
    private Label lblRuns;
    private ProgressBar progressBar;

    public class RCStatePredicate implements Predicate<RuntimeCharacter> {

        @Override
        public boolean apply(RuntimeCharacter input) {
            return input.getZustand() == Zustand.OK;
        }
    }

    public enum AttackType {
        melee, range1
    }

    private class ScriptPlacementSimulator implements ScriptViewer, CombatViewer {

        private AttackType defaultAttacktype = AttackType.melee;

        private PlacementMetric pmetric = new PlacementMetric();
        private CombatTurn combatTurn;
        private ScriptService scriptService;
        private CommandCallback simulationCallback;
        private List<RuntimeCharacter> enemies = new ArrayList<RuntimeCharacter>();
        private List<RuntimeCharacter> player;// = new ArrayList<RuntimeCharacter>();

        private Placement placement;

        private Script script;

        @Override
        public void setCombatTurn(CombatTurn kr) {
            // this.combatTurn = kr;
            doIniPass(kr.getCurrentTurn());

            if (kr.getCurrentTurn() == null) {
                combatTurn = createCombatTurn();
                if (!FluentIterable.from(enemies).filter(new RCStatePredicate()).isEmpty()
                        && !FluentIterable.from(player).filter(new RCStatePredicate()).isEmpty())
                    scriptService.setCombatTurn(combatTurn);
            }

        }

        @Override
        public void setPlacement(Placement placement) {
        }

        @Override
        public void setScript(Script script) {
        }

        @Override
        public CommandCallback getCmdCallback() {
            return simulationCallback;
        }

        @Override
        public void sendMessage(RuntimeCharacter character, String message) {
        }

        /**
         * Initalize the simulation and start.
         * 
         * @param count
         */
        public void runSimulation(int count) {
            // checkConstrains(object);
            metric.clear();
            progressBar.setMaximum(count-1);
            for (int i = 0; i < count; i++) {
                runOneSimulation();
                progressBar.setSelection(i);
            }
        }

        public void checkConstrains(Placement placement2) {
            StringBuffer stringBuffer = new StringBuffer();

            EList<Team> teams = placement2.getTeams();
            for (Team team : teams) {
                for (RuntimeCharacter rc : team.getMembers()) {
                    stringBuffer.append(checkConstrain(rc));
                }
            }
            for (RuntimeCharacter rc : placement2.getScript().getPlayer().getMembers()) {
                stringBuffer.append(checkConstrain(rc));
            }
            // getManagedForm().getForm().setHeadClient();
            text.setText(stringBuffer.toString());
        }

        private String checkConstrain(RuntimeCharacter rc) {
            StringBuffer stringBuffer = new StringBuffer();
            AbstraktGegenstand rightHand = rc.getRightHand();
            if (rightHand != null) {
                Fertigkeit fertigkeit = rightHand.getFertigkeit();
                if (fertigkeit == null)
                    stringBuffer.append(AdapterFactoryUtil.getInstance().getLabelProvider().getText(rc)).append(" right hand no skill\n");
            } else
                stringBuffer.append(AdapterFactoryUtil.getInstance().getLabelProvider().getText(rc)).append(" Right hand unset\n");

            if (rc.getLeftHand() != null) {
                if (rc.getLeftHand().getFertigkeit() == null)
                    stringBuffer.append(AdapterFactoryUtil.getInstance().getLabelProvider().getText(rc)).append(" right hand no skill\n");
            } else
                stringBuffer.append(AdapterFactoryUtil.getInstance().getLabelProvider().getText(rc)).append(" left hand unset\n");

            return stringBuffer.toString();
        }

        /**
         * Initalize the simulation and start.
         */
        private void runOneSimulation() {
            enemies.clear();
            scriptService = (ScriptService)getSite().getService(ScriptService.class);
            scriptService.registerScriptViewer(this);
            scriptService.registerCombatViewer(this);
            Script org_script = object.getScript();
            Scripts scripts = (Scripts)org_script.eContainer();
            int indexOfScript = scripts.getStories().indexOf(org_script);
            int placmentIndex = org_script.getPlacements().indexOf(object);
            EList<EObject> eResource = org_script.eResource().getContents();

            Collection<EObject> all = EcoreUtil.copyAll(eResource);

            script = findScript(new ArrayList<EObject>(all), indexOfScript);
            if (script == null)
                return;

            placement = script.getPlacements().get(placmentIndex);

            script.setHistory(ScriptingFactory.eINSTANCE.createScriptHistory());
            script.getHistory().setCommandStack(GameplayFactory.eINSTANCE.createExecutionStack());
            script.getHistory().getCommandStack().setProtocol(GameplayFactory.eINSTANCE.createExecutionProtocol());

            scriptService.setScript(script);
            //scriptService.setPlacement(placement);// object);
            placement.setActualDate(new Date(0L));

            simulationCallback = new SimlationCallBack();
            // scriptService.executeCommand(command);
            EList<Team> teams = placement.getTeams();
            for (Team team : teams) {
                for (RuntimeCharacter rc : team.getMembers()) {
                    fixCharater(rc);
                    enemies.add(rc);
                }
            }
            for (RuntimeCharacter rc : script.getPlayer().getMembers()) {
                fixCharater(rc);
            }
            player = script.getPlayer().getMembers();
            combatTurn = createCombatTurn();
            scriptService.setCombatTurn(combatTurn);

            boolean allEnemiesDead = FluentIterable.from(enemies).filter(new RCStatePredicate()).isEmpty();

            if (allEnemiesDead)
                pmetric.playerWins.incrementAndGet();

            placement.setActualDate(null);

            buildMetric(0);
            buildMetric(1);
            pmetric.samples.incrementAndGet();
            EList<Command> commands = script.getHistory().getCommandStack().getProtocol().getCommands();
            for (Command command : commands) {
                if (command instanceof CombatTurn) {
                    pmetric.combatRounds.incrementAndGet();
                }
            }

            scriptService.setScript(null);
        }

        private void buildMetric(int type) {
            ExecutionProtocol protocol = script.getHistory().getCommandStack().getProtocol();
            for (Iterator<EObject> iterator = protocol.eAllContents(); iterator.hasNext();) {
                EObject object = (EObject)iterator.next();
                if (object instanceof InitativePass) {
                    // InitativePass ini = (InitativePass)object;
                } else if (object instanceof MeeleAttackCmd || object instanceof RangedAttackCmd) {
                    SkillTestCmd mc = (SkillTestCmd)object;
                    CharacterMetrik metric2 = getMetric(mc, type);
                    metric2.attacks.incrementAndGet();
                    if (mc.getNetHits() > 0)
                        metric2.attacksHits.incrementAndGet();
                    else
                        metric2.attacksMissed.incrementAndGet();

                    EList<Command> subCommands = mc.getSubCommands();
                    for (Command command : subCommands) {
                        if (command instanceof DamageTest) {
                            DamageTest dt = (DamageTest)command;
                            DamageCode damageCode = ShadowrunTools.parseDamageCode(dt.getEffectiveDamage());
                            if (damageCode != null)
                                metric2.attackDamage.addAndGet(damageCode.getPower());

                        }
                    }
                } else if (object instanceof DefensTestCmd) {
                    DefensTestCmd dt = (DefensTestCmd)object;
                    CharacterMetrik metric2 = getMetric(dt, type);
                    metric2.defense.incrementAndGet();
                    if (dt.getNetHits() < 0)
                        metric2.defenseMissed.incrementAndGet();
                    else
                        metric2.defenseHits.incrementAndGet();
                } else if (object instanceof Initative) {
                    Initative ini = (Initative)object;
                    CharacterMetrik metric2 = getMetric(ini, type);
                    metric2.iniSum += ini.getIni();
                    metric2.inits.incrementAndGet();
                } else if (object instanceof DamageTest) {
                    DamageTest dt = (DamageTest)object;
                    CharacterMetrik metric2 = getMetric(dt, type);
                    metric2.damage.incrementAndGet();
                    DamageCode damageCode = ShadowrunTools.parseDamageCode(dt.getEffectiveDamage());
                    if (damageCode != null)
                        metric2.damageHits.addAndGet(damageCode.getPower());
                    else
                        metric2.damageMissed.incrementAndGet();

                }
            }
        }

        /**
         * Provides the orderd metric list from the map.
         * 
         * @return
         */
        private List<CharacterMetrik> getCalcedMetric() {
            Set<Entry<Object, CharacterMetrik>> entrySet = metric.entrySet();
            ArrayList<Entry<Object, CharacterMetrik>> list = new ArrayList<Entry<Object, CharacterMetrik>>(entrySet);
//            final List<RuntimeCharacter> players = player;
            Collections.sort(list, new Comparator<Entry<Object, CharacterMetrik>>() {

                @Override
                public int compare(Entry<Object, CharacterMetrik> o1, Entry<Object, CharacterMetrik> o2) {
                    int typeVal1 = 0;
                    int typeVal2 = 0;
                    if (o1.getKey() instanceof Boolean) {
                        typeVal1 = 200;
                        if ((Boolean)o1.getKey())
                            typeVal1++;
                    } else if (o1.getKey() instanceof String) {
                        typeVal1 = 100;
                        if (((String)o1.getKey()).startsWith("player"))
                            typeVal1++;
                    }
                    if (o2.getKey() instanceof Boolean) {
                        typeVal2 = 200;
                        if ((Boolean)o2.getKey())
                            typeVal2++;
                    } else if (o2.getKey() instanceof String) {
                        typeVal2 = 100;
                        if (((String)o2.getKey()).startsWith("player"))
                            typeVal2++;
                    }

                    return typeVal2 - typeVal1;
                }
            });

            return FluentIterable.from(list).transform(new Function<Entry<Object, CharacterMetrik>, CharacterMetrik>() {
                @Override
                public CharacterMetrik apply(Entry<Object, CharacterMetrik> input) {
                    return input.getValue();
                }
            }).toList();
        }

        /**
         * @param ini
         * @param type
         * @return
         */
        private CharacterMetrik getMetric(SubjectCommand ini, int type) {
            RuntimeCharacter subject = ini.getSubject();
            boolean player1 = player.contains(subject);
            String name = AdapterFactoryUtil.getInstance().getLabelProvider().getText(subject);
            name =( player1 ? "player " : "none player ")+ name;
            CharacterMetrik characterMetrik = null;
            switch (type) {
                case 0:
                    characterMetrik = metric.get(name);
                    if (characterMetrik == null) {
                        characterMetrik = new CharacterMetrik();
                        characterMetrik.metrikName = name;
                        metric.put(name, characterMetrik);
                    }
                    break;
                case 1:
                    characterMetrik = metric.get(player1);
                    if (characterMetrik == null) {
                        characterMetrik = new CharacterMetrik();
                        characterMetrik.metrikName = player1 ? "player" : "none player";// AdapterFactoryUtil.getInstance().getLabelProvider().getText(subject);
                        metric.put(player1, characterMetrik);
                    }
                default:
                    break;
            }
            return characterMetrik;
        }

        private Script findScript(List<EObject> all, final int indexOfScript) {
            for (Object object : all) {
                if (object instanceof ShrList) {
                    ShrList sl = (ShrList)object;
                    EList<EObject> entries = sl.getEntries();
                    for (EObject eObject : entries) {
                        if (eObject instanceof Scripts) {
                            Scripts s = (Scripts)eObject;
                            return s.getStories().get(indexOfScript);
                        }
                    }

                }
            }

            return null;// (Script)all.get(0);
        }

        private void fixCharater(RuntimeCharacter rc) {
            rc.setMentalDamage(0);
            rc.setPhysicalDamage(0);
            rc.setZustand(Zustand.OK);
            rc.getExtendetData().clear();

            ManagedCharacter character = rc.getCharacter();
            rc.getInUse().addAll(character.getInventar());
            if (rc.getArmor() == null)
                rc.setArmor(FluentIterable.from(character.getInventar()).filter(Kleidung.class).first().orNull());
            if (rc.getLeftHand() == null)
                rc.setLeftHand(FluentIterable.from(character.getInventar()).filter(Nahkampfwaffe.class).first().orNull());
            if (rc.getRightHand() == null)
                rc.setRightHand(FluentIterable.from(character.getInventar()).filter(Feuerwaffe.class).first().orNull());

        }

        /**
         * Creates and initialize a combat turn.
         * 
         * @return
         */
        private CombatTurn createCombatTurn() {
            CombatTurn combatTurn = GameplayFactory.eINSTANCE.createCombatTurn();
            combatTurn.setDate(placement.getActualDate());
            combatTurn.setCmdCallback(simulationCallback);

            combatTurn.getCombatants().addAll(placement.getScript().getPlayer().getMembers());
            EList<Team> teams = placement.getTeams();
            for (Team team : teams) {
                combatTurn.getCombatants().addAll(team.getMembers());
            }
            return combatTurn;
        }

        /**
         * Creates the action and execute it.
         */
        private void doIniPass(InitativePass currentTurn) {
            if (currentTurn == null)
                return;

            RuntimeCharacter target = findTarget(currentTurn);
            RuntimeCharacter subject = currentTurn.getSubject();
            CommandWrapper action = createIniAction(currentTurn, target, subject, defaultAttacktype);
            currentTurn.setAction(action);
            combatTurn.doTurn();
            doIniPass(combatTurn.getCurrentTurn());
        }

        /**
         * @param currentTurn
         * @param target
         * @param subject
         * @param attackType
         * @return
         */
        private CommandWrapper createIniAction(InitativePass currentTurn, RuntimeCharacter target, RuntimeCharacter subject, AttackType attackType) {
            if (target == null)
                return null;

            switch (attackType) {
                case melee:
                    Nahkampfwaffe meleeWeapon = GameplayTools.getMeleeWeapon(subject);
                    if (subject != null && meleeWeapon != null && target != null) {
                        ComplexAction action = GameplayTools.createMeleeAction(subject, target, meleeWeapon);
                        return action;
                    }
                    break;
                case range1:
                    AbstaktFernKampfwaffe rangedWeapon = GameplayTools.getRangedWeapon(subject);
                    Feuerwaffe feuerwaffe = (Feuerwaffe)rangedWeapon;
                    FeuerModus fireArmModus = GameplayTools.getFireArmModus(subject, feuerwaffe);
                    SimpleAction createRangedAction = GameplayTools.createRangedAction(currentTurn, 1, rangedWeapon, fireArmModus, target, 10);
                    if (createRangedAction == null) {
                        return createIniAction(currentTurn, target, subject, AttackType.melee);
                    }

                    return currentTurn.getAction();

                default:
                    break;
            }

            return null;
        }

        private RuntimeCharacter findTarget(InitativePass currentTurn) {
            if (player.contains(currentTurn.getSubject()))
                return FluentIterable.from(enemies).filter(new RCStatePredicate()).first().orNull();
            else
                return FluentIterable.from(player).filter(new RCStatePredicate()).first().orNull();
        }

    }

    private class SimlationCallBack implements CommandCallback {

        @Override
        public void prepareCommand(Command cmd, EStructuralFeature... eStructuralFeatures) {

        }

        @Override
        public void beforeExecute(Command cmd, EStructuralFeature... eStructuralFeatures) {

        }

        @Override
        public void beforeSubcommands(Command cmd, EStructuralFeature... eStructuralFeatures) {

        }

        @Override
        public void afterCommand(Command cmd, EStructuralFeature... eStructuralFeatures) {

        }

    }

    public class PlacementMetric {
        AtomicInteger samples = new AtomicInteger();
        AtomicInteger combatRounds = new AtomicInteger();
        AtomicInteger playerWins = new AtomicInteger();
    }

    public class CharacterMetrik {
        String metrikName;

        AtomicInteger attacks = new AtomicInteger();
        AtomicInteger attacksMissed = new AtomicInteger();
        AtomicInteger attacksHits = new AtomicInteger();
        AtomicInteger attackDamage = new AtomicInteger();
        AtomicInteger rattacks = new AtomicInteger();
        AtomicInteger rattacksMissed = new AtomicInteger();
        AtomicInteger rattacksHits = new AtomicInteger();
        AtomicInteger defense = new AtomicInteger();
        AtomicInteger defenseMissed = new AtomicInteger();
        AtomicInteger defenseHits = new AtomicInteger();
        AtomicInteger damage = new AtomicInteger();
        AtomicInteger damageMissed = new AtomicInteger();
        AtomicInteger damageHits = new AtomicInteger();
        AtomicInteger inits = new AtomicInteger();
        int iniSum = 0;

        public String getMetrikName() {
            return metrikName;
        }
    }

    /**
     * Create the form page.
     * 
     * @param id
     * @param title
     */
    public PlacementSimulationPage(String id, String title) {
        super(id, title);
    }

    public PlacementSimulationPage(FormEditor editor, String id, String title, Placement object, EditingDomain editingDomain, ReferenceManager manager) {
        super(editor, id, title, manager);
        this.object = object;
        this.editingDomain = editingDomain;
    }

    /**
     * Create the form page.
     * 
     * @param editor
     * @param id
     * @param title
     * @wbp.parser.constructor
     * @wbp.eval.method.parameter id "Some id"
     * @wbp.eval.method.parameter title "Some title"
     */
    public PlacementSimulationPage(FormEditor editor, String id, String title) {
        super(editor, id, title);
    }

    /**
     * Create contents of the form.
     * 
     * @param managedForm
     */
    @Override
    protected void createFormContent(IManagedForm managedForm) {
        FormToolkit toolkit = managedForm.getToolkit();
        ScrolledForm form = managedForm.getForm();
        form.setText("simulation for " + AdapterFactoryUtil.getInstance().getLabelProvider().getText(object));
        Composite body = form.getBody();
        toolkit.decorateFormHeading(form.getForm());
        toolkit.paintBordersFor(body);
        managedForm.getForm().getBody().setLayout(new GridLayout(3, false));

        Group grpControll = new Group(managedForm.getForm().getBody(), SWT.NONE);
        grpControll.setText("Controll");
        managedForm.getToolkit().adapt(grpControll);
        managedForm.getToolkit().paintBordersFor(grpControll);
        grpControll.setLayout(new GridLayout(2, false));
        new Label(grpControll, SWT.NONE);

        final Button btnNewButton = new Button(grpControll, SWT.NONE);
        btnNewButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                btnNewButton.setEnabled(false);
                progressBar.setVisible(true);
                final ScriptPlacementSimulator scriptPlacementSimulator = new ScriptPlacementSimulator();
                scriptPlacementSimulator.checkConstrains(object);
                int selectionIndex = combo.getSelectionIndex();
                if (selectionIndex == 1)
                    scriptPlacementSimulator.defaultAttacktype = AttackType.range1;
                Display.getCurrent().asyncExec(new Runnable() {

                    @Override
                    public void run() {
                        try {
                            scriptPlacementSimulator.runSimulation(spinner.getSelection());
                            printResult(scriptPlacementSimulator);
                            tableViewer.setInput(scriptPlacementSimulator.getCalcedMetric());
                        } catch (Exception e2) {
                          System.err.println(e2.fillInStackTrace());
                            text.setText("simulation not runable!!\n" + text.getText());
                        }
                        btnNewButton.setEnabled(true);
                        progressBar.setVisible(false);
                    }

                });
            }
        });
        managedForm.getToolkit().adapt(btnNewButton, true, true);
        btnNewButton.setText("run simulation");
        
        lblRuns = new Label(grpControll, SWT.NONE);
        managedForm.getToolkit().adapt(lblRuns, true, true);
        lblRuns.setText("runs");

        spinner = new Spinner(grpControll, SWT.BORDER);
        spinner.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        spinner.setMaximum(1000);
        spinner.setSelection(100);
        managedForm.getToolkit().adapt(spinner);
        managedForm.getToolkit().paintBordersFor(spinner);

        grpType = new Group(managedForm.getForm().getBody(), SWT.NONE);
        grpType.setLayout(new GridLayout(1, false));
        grpType.setLayoutData(new GridData(SWT.LEFT, SWT.FILL, false, false, 1, 1));
        grpType.setText("type");
        managedForm.getToolkit().adapt(grpType);
        managedForm.getToolkit().paintBordersFor(grpType);

        combo = new CCombo(grpType, SWT.BORDER);
        combo.setItems(new String[]{ "melee", "ranged" });
        combo.select(0);
        managedForm.getToolkit().adapt(combo);
        managedForm.getToolkit().paintBordersFor(combo);

        composite_1 = new Composite(managedForm.getForm().getBody(), SWT.NONE);
        composite_1.setLayout(new GridLayout(1, false));
        composite_1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
        managedForm.getToolkit().adapt(composite_1);
        managedForm.getToolkit().paintBordersFor(composite_1);

        lblNewLabel = new Label(composite_1, SWT.NONE);
        lblNewLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        managedForm.getToolkit().adapt(lblNewLabel, true, true);

        lblRounds = new Label(composite_1, SWT.NONE);
        lblRounds.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        managedForm.getToolkit().adapt(lblRounds, true, true);
        
        progressBar = new ProgressBar(composite_1, SWT.SMOOTH);
        progressBar.setMaximum(0);
        progressBar.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        progressBar.setVisible(false);
        managedForm.getToolkit().adapt(progressBar, true, true);

        composite = new Composite(managedForm.getForm().getBody(), SWT.NONE);
        composite.setLayout(new FillLayout(SWT.HORIZONTAL));
        composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, true, 3, 1));
        managedForm.getToolkit().adapt(composite);
        managedForm.getToolkit().paintBordersFor(composite);

        tableViewer = new TableViewer(composite, SWT.BORDER | SWT.FULL_SELECTION);
        table = tableViewer.getTable();
        table.setHeaderVisible(true);
        managedForm.getToolkit().paintBordersFor(table);
        tableViewer.setContentProvider(new ArrayContentProvider());

        tableViewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
        tableViewerColumn.setLabelProvider(new ColumnLabelProvider() {
            @Override
            public String getText(Object element) {
                if (element instanceof CharacterMetrik) {
                    CharacterMetrik cm = (CharacterMetrik)element;
                    return cm.metrikName;
                }
                return super.getText(element);
            }
        });
        tblclmnName = tableViewerColumn.getColumn();
        tblclmnName.setWidth(200);
        tblclmnName.setText("name");

        tableViewerColumn_1 = new TableViewerColumn(tableViewer, SWT.NONE);
        tblclmnAttack = tableViewerColumn_1.getColumn();
        tblclmnAttack.setWidth(100);
        tblclmnAttack.setText("attack%");
        tableViewerColumn_1.setLabelProvider(new ColumnLabelProvider() {
            @Override
            public String getText(Object element) {
                if (element instanceof CharacterMetrik) {
                    CharacterMetrik cm = (CharacterMetrik)element;
                    return String.format("%.2f", 100 * cm.attacksHits.floatValue() / cm.attacks.floatValue());
                }
                return super.getText(element);
            }
        });

        tableViewerColumn_2 = new TableViewerColumn(tableViewer, SWT.NONE);
        tableViewerColumn_2.setLabelProvider(new ColumnLabelProvider() {
            @Override
            public String getText(Object element) {
                if (element instanceof CharacterMetrik) {
                    CharacterMetrik cm = (CharacterMetrik)element;
                    return String.format("%.2f", 100 * cm.defenseHits.floatValue() / cm.defense.floatValue());
                }
                return super.getText(element);
            }

        });
        tblclmnDefense = tableViewerColumn_2.getColumn();
        tblclmnDefense.setWidth(100);
        tblclmnDefense.setText("defense%");

        tableViewerColumn_4 = new TableViewerColumn(tableViewer, SWT.NONE);
        tableViewerColumn_4.setLabelProvider(new ColumnLabelProvider() {
            @Override
            public String getText(Object element) {
                if (element instanceof CharacterMetrik) {
                    CharacterMetrik cm = (CharacterMetrik)element;
                    return String.format("%.2f", cm.iniSum / cm.inits.floatValue());
                }
                return super.getText(element);
            }

        });
        tblclmnIni = tableViewerColumn_4.getColumn();
        tblclmnIni.setWidth(100);
        tblclmnIni.setText("ini");

        tableViewerColumn_3 = new TableViewerColumn(tableViewer, SWT.NONE);
        tableViewerColumn_3.setLabelProvider(new ColumnLabelProvider() {
            @Override
            public String getText(Object element) {
                if (element instanceof CharacterMetrik) {
                    CharacterMetrik cm = (CharacterMetrik)element;
                    return String.format("%.2f", cm.attackDamage.floatValue() / cm.attacks.floatValue());
                }
                return super.getText(element);
            }

        });
        tblclmnDamage = tableViewerColumn_3.getColumn();
        tblclmnDamage.setWidth(100);
        tblclmnDamage.setText("damage");

        text = new Text(managedForm.getForm().getBody(), SWT.BORDER | SWT.WRAP | SWT.V_SCROLL | SWT.MULTI);
        GridData gd_text = new GridData(SWT.FILL, SWT.FILL, true, false, 3, 1);
        gd_text.heightHint = 80;
        text.setLayoutData(gd_text);
        managedForm.getToolkit().adapt(text, true, true);
        // m_bindingContext = initDataBindings();

    }

    private void printResult(ScriptPlacementSimulator scriptPlacementSimulator) {
        double wins = 100 * scriptPlacementSimulator.pmetric.playerWins.doubleValue() / scriptPlacementSimulator.pmetric.samples.doubleValue();
        double crounds = scriptPlacementSimulator.pmetric.combatRounds.doubleValue() / scriptPlacementSimulator.pmetric.samples.doubleValue();
        lblNewLabel.setText(String.format("player wins %.2f%%", wins));
        lblRounds.setText(String.format("number of combat rounds %.2f", crounds));
    }

    @Override
    protected EditingDomain getEditingDomain() {
        return editingDomain;
    }

}
