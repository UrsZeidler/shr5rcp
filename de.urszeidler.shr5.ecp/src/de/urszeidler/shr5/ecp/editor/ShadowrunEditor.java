/**
 * 
 */
package de.urszeidler.shr5.ecp.editor;

import org.eclipse.ui.PartInitException;

import de.urszeidler.eclipse.shr5.AbstractMatrixDevice;
import de.urszeidler.eclipse.shr5.AbstraktFokus;
import de.urszeidler.eclipse.shr5.AbstraktGegenstand;
import de.urszeidler.eclipse.shr5.AbstraktModifikatoren;
import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.Credstick;
import de.urszeidler.eclipse.shr5.CredstickTransaction;
import de.urszeidler.eclipse.shr5.Drug;
import de.urszeidler.eclipse.shr5.Fahrzeug;
import de.urszeidler.eclipse.shr5.FernkampfwaffeModifikator;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.FertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.Feuerwaffe;
import de.urszeidler.eclipse.shr5.Gegenstand;
import de.urszeidler.eclipse.shr5.Geist;
import de.urszeidler.eclipse.shr5.Kleidung;
import de.urszeidler.eclipse.shr5.KomplexeForm;
import de.urszeidler.eclipse.shr5.LifestyleOption;
import de.urszeidler.eclipse.shr5.Magazin;
import de.urszeidler.eclipse.shr5.MagischeTradition;
import de.urszeidler.eclipse.shr5.MetaMagie;
import de.urszeidler.eclipse.shr5.Modifizierbar;
import de.urszeidler.eclipse.shr5.Munition;
import de.urszeidler.eclipse.shr5.Nahkampfwaffe;
import de.urszeidler.eclipse.shr5.Projektilwaffe;
import de.urszeidler.eclipse.shr5.Reichweite;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.ShrList;
import de.urszeidler.eclipse.shr5.Software;
import de.urszeidler.eclipse.shr5.SourceBook;
import de.urszeidler.eclipse.shr5.Spezies;
import de.urszeidler.eclipse.shr5.SubstanceContainer;
import de.urszeidler.eclipse.shr5.Toxin;
import de.urszeidler.eclipse.shr5.Vertrag;
import de.urszeidler.eclipse.shr5.WeaponMount;
import de.urszeidler.eclipse.shr5.Wurfwaffe;
import de.urszeidler.eclipse.shr5.Zauber;
import de.urszeidler.eclipse.shr5.util.Shr5Switch;
import de.urszeidler.eclipse.shr5Management.CharacterGenerator;
import de.urszeidler.eclipse.shr5Management.CharacterGroup;
import de.urszeidler.eclipse.shr5Management.FreeStyleGenerator;
import de.urszeidler.eclipse.shr5Management.GamemasterManagement;
import de.urszeidler.eclipse.shr5Management.GeneratorState;
import de.urszeidler.eclipse.shr5Management.GruntGroup;
import de.urszeidler.eclipse.shr5Management.LifeModule;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.ModuleChange;
import de.urszeidler.eclipse.shr5Management.Pack;
import de.urszeidler.eclipse.shr5Management.PlayerCharacter;
import de.urszeidler.eclipse.shr5Management.PlayerManagement;
import de.urszeidler.eclipse.shr5Management.Shr5Generator;
import de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator;
import de.urszeidler.eclipse.shr5Management.Shr5System;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.SumToTenGenerator;
import de.urszeidler.eclipse.shr5Management.util.Shr5managementSwitch;
import de.urszeidler.shr5.ecp.editor.pages.BeschreibbarContainterPage;
import de.urszeidler.shr5.ecp.editor.pages.ContractPage;
import de.urszeidler.shr5.ecp.editor.pages.DefaultEmfFormsPage;
import de.urszeidler.shr5.ecp.editor.pages.FernkampfwaffePage;
import de.urszeidler.shr5.ecp.editor.pages.FertigkeitPage;
import de.urszeidler.shr5.ecp.editor.pages.FeuerwaffePage;
import de.urszeidler.shr5.ecp.editor.pages.GegenstandPage;
import de.urszeidler.shr5.ecp.editor.pages.GeneratorSystemPage;
import de.urszeidler.shr5.ecp.editor.pages.GruntGroupPage;
import de.urszeidler.shr5.ecp.editor.pages.Messages;
import de.urszeidler.shr5.ecp.editor.pages.ModifikatorPage;
import de.urszeidler.shr5.ecp.editor.pages.ModifizierbarPage;
import de.urszeidler.shr5.ecp.editor.pages.ModuleChangePage;
import de.urszeidler.shr5.ecp.editor.pages.PrintPreviewPage;
import de.urszeidler.shr5.ecp.editor.pages.ReichweitePage;
import de.urszeidler.shr5.ecp.editor.pages.SoftwarePage;
import de.urszeidler.shr5.ecp.editor.pages.SourceBookPage;
import de.urszeidler.shr5.ecp.editor.pages.SpeziesPage;
import de.urszeidler.shr5.ecp.editor.pages.SubstancePage;
import de.urszeidler.shr5.ecp.editor.pages.TransactionsPage;
import de.urszeidler.shr5.ecp.editor.pages.VariousItemsPage;
import de.urszeidler.shr5.ecp.editor.pages.VariousObjectsPage;
import de.urszeidler.shr5.ecp.editor.pages.VehiclePage;
import de.urszeidler.shr5.ecp.editor.pages.character.AbstraktPersonaPage;
import de.urszeidler.shr5.ecp.editor.pages.character.CharacterAdvancementPage;
import de.urszeidler.shr5.ecp.editor.pages.character.CharacterDiaryPage;
import de.urszeidler.shr5.ecp.editor.pages.character.CommitedCharacterPage;
import de.urszeidler.shr5.ecp.editor.pages.character.ManagedCharacterPage;
import de.urszeidler.shr5.ecp.editor.pages.generator.AbstractGeneratorPage;
import de.urszeidler.shr5.ecp.editor.pages.generator.FreeStyleGeneratorPage;
import de.urszeidler.shr5.ecp.editor.pages.generator.Shr5GeneratorPage;
import de.urszeidler.shr5.ecp.editor.pages.generator.Shr5KarmaGeneratorPage;
import de.urszeidler.shr5.ecp.printer.PersonaPrinter;

/**
 * An editor capable of handling several object types
 * 
 * @author urs
 */
public class ShadowrunEditor extends AbstractShr5Editor {
    private static final String EMPTY = ""; //$NON-NLS-1$
    private ShrEditingState editingMode = ShrEditingState.CUSTOM;
    public static final String id = "de.urszeidler.eclipse.shadowrun.presentation.editors.ShadowrunEditorID"; //$NON-NLS-1$

    @Override
    protected void addPages() {

        // the switch creates all the pages
        Shr5Switch<Object> shadowrunSwitch = new Shr5Switch<Object>() {
            @Override
            public Object caseSourceBook(SourceBook object) {
                try {
                    addPage(new SourceBookPage(ShadowrunEditor.this, EMPTY, labelProvider.getText(object.eClass()), object, editingDomain, manager));
                } catch (PartInitException e) {
                    logError("error creating SourceBookPage", e);//$NON-NLS-1$
                }
                return null;
            }

            @Override
            public Object caseSpezies(Spezies object) {
                try {
                    addPage(new SpeziesPage(ShadowrunEditor.this, EMPTY, labelProvider.getText(object.eClass()), object, editingDomain, manager));
                } catch (PartInitException e) {
                    logError("error creating SpeziesPage", e);//$NON-NLS-1$
                }
                return null;
            }

            @Override
            public Object caseCredstickTransaction(CredstickTransaction object) {
                try {
                    addPage(new TransactionsPage(ShadowrunEditor.this, EMPTY, labelProvider.getText(object.eClass()), object, editingDomain, manager));
                } catch (PartInitException e) {
                    logError("error creating FertigkeitPage", e);//$NON-NLS-1$
                }
                return null;
            }
            
            @Override
            public Object caseFertigkeitsGruppe(FertigkeitsGruppe object) {
                try {
                    addPage(new FertigkeitPage(ShadowrunEditor.this, EMPTY, labelProvider.getText(object.eClass()), object, editingDomain, manager));
                } catch (PartInitException e) {
                    logError("error creating FertigkeitPage", e);//$NON-NLS-1$
                }
                return null;
            }

            @Override
            public Object caseFertigkeit(Fertigkeit object) {
                try {
                    addPage(new FertigkeitPage(ShadowrunEditor.this, EMPTY, labelProvider.getText(object.eClass()), object, editingDomain, manager));
                } catch (PartInitException e) {
                    logError("error creating FertigkeitPage", e);//$NON-NLS-1$
                }
                return null;
            }

            @Override
            public Object caseReichweite(Reichweite object) {
                try {
                    addPage(new ReichweitePage(ShadowrunEditor.this, EMPTY, labelProvider.getText(object.eClass()), object, editingDomain, manager));
                } catch (PartInitException e) {
                    logError("error creating ReichweitePage", e);//$NON-NLS-1$
                }
                return null;
            }

            @Override
            public Object caseSoftware(Software object) {
                try {
                    addPage(new SoftwarePage(ShadowrunEditor.this, EMPTY, labelProvider.getText(object.eClass()), object, editingDomain, manager));
                } catch (PartInitException e) {
                    logError("error creating SoftwarePage", e);//$NON-NLS-1$
                }
                return null;

            }

            @Override
            public Object caseVertrag(Vertrag object) {
                try {
                    addPage(new ContractPage(ShadowrunEditor.this, EMPTY, labelProvider.getText(object.eClass()), object, editingDomain, manager));
                } catch (PartInitException e) {
                    logError("error creating ContractPage", e);//$NON-NLS-1$
                }
                return null;
            }

            @Override
            public Object caseFahrzeug(Fahrzeug object) {
                try {
                    addPage(new VehiclePage(ShadowrunEditor.this, EMPTY, labelProvider.getText(object.eClass()), object, editingDomain, manager));
                } catch (PartInitException e) {
                    logError("error creating VehiclePage", e);//$NON-NLS-1$
                }
                return null;
            }

            @Override
            public Object caseCredstick(Credstick object) {
                try {
                    addPage(new GegenstandPage(ShadowrunEditor.this, EMPTY, labelProvider.getText(Shr5Package.Literals.CREDSTICK), object,
                            editingDomain, manager));
                } catch (PartInitException e) {
                    logError("error creating GegenstandPage", e);//$NON-NLS-1$
                }
                return null;
            }

            @Override
            public Object caseMunition(Munition object) {
                try {
                    addPage(new GegenstandPage(ShadowrunEditor.this, EMPTY, labelProvider.getText(object.eClass()), object, editingDomain, manager));
                } catch (PartInitException e) {
                    logError("error creating GegenstandPage", e);//$NON-NLS-1$
                }
                return null;
            }

            @Override
            public Object caseSubstanceContainer(SubstanceContainer object) {
                try {
                    addPage(new GegenstandPage(ShadowrunEditor.this, EMPTY, labelProvider.getText(object.eClass()), object, editingDomain, manager));
                } catch (PartInitException e) {
                    logError("error creating GegenstandPage", e);//$NON-NLS-1$
                }
                return null;
            }

            @Override
            public Object caseAbstractMatrixDevice(AbstractMatrixDevice object) {
                try {
                    addPage(new GegenstandPage(ShadowrunEditor.this, EMPTY, labelProvider.getText(object.eClass()), object, editingDomain, manager));
                } catch (PartInitException e) {
                    logError("error creating GegenstandPage", e);//$NON-NLS-1$
                }
                return null;
            }

            @Override
            public Object caseAbstraktFokus(AbstraktFokus object) {
                try {
                    addPage(new GegenstandPage(ShadowrunEditor.this, EMPTY, labelProvider.getText(object.eClass()), object, editingDomain, manager));
                } catch (PartInitException e) {
                    logError("error creating GegenstandPage", e);//$NON-NLS-1$
                }
                return null;
            }

            @Override
            public Object caseDrug(Drug object) {
                try {
                    addPage(new SubstancePage(ShadowrunEditor.this, EMPTY, labelProvider.getText(object.eClass()), object, editingDomain, manager));
                } catch (PartInitException e) {
                    logError("error creating SubstancePage", e);//$NON-NLS-1$
                }
                return null;
            }

            @Override
            public Object caseToxin(Toxin object) {
                try {
                    addPage(new SubstancePage(ShadowrunEditor.this, EMPTY, labelProvider.getText(object.eClass()), object, editingDomain, manager));
                } catch (PartInitException e) {
                    logError("error creating SubstancePage", e);//$NON-NLS-1$
                }
                return null;
            }

            // @Override
            // public Object caseCyberdeck(Cyberdeck object) {
            // try {
            // addPage(new GegenstandPage(ShadowrunEditor.this, EMPTY, labelProvider.getText(Shr5Package.Literals.CYBERDECK), object, editingDomain,
            // manager));
            // } catch (PartInitException e) {
            //                    logError("error creating GegenstandPage", e);//$NON-NLS-1$
            // }
            // return null;
            // }

            @Override
            public Object caseGegenstand(Gegenstand object) {
                try {
                    addPage(new GegenstandPage(ShadowrunEditor.this, EMPTY, labelProvider.getText(object.eClass()), object, editingDomain, manager));
                    if (object.getWifi() != null)
                        addPage(new GegenstandPage(ShadowrunEditor.this, EMPTY, labelProvider.getText(object.getWifi()),
                                (AbstraktGegenstand)object.getWifi(), editingDomain, manager));
                } catch (PartInitException e) {
                    logError("error creating GegenstandPage", e);//$NON-NLS-1$
                }
                return null;
            }

            @Override
            public Object caseKleidung(Kleidung object) {
                try {
                    addPage(new GegenstandPage(ShadowrunEditor.this, EMPTY, labelProvider.getText(object.eClass()), object, editingDomain, manager));
                } catch (PartInitException e) {
                    logError("error creating GegenstandPage", e);//$NON-NLS-1$
                }
                return null;
            }

            @Override
            public Object caseMagazin(Magazin object) {
                try {
                    addPage(new GegenstandPage(ShadowrunEditor.this, EMPTY, labelProvider.getText(object.eClass()), object, editingDomain, manager));
                } catch (PartInitException e) {
                    logError("error creating GegenstandPage", e);//$NON-NLS-1$
                }
                return null;
            }

            @Override
            public Object caseNahkampfwaffe(Nahkampfwaffe object) {
                try {
                    addPage(new FernkampfwaffePage(ShadowrunEditor.this, EMPTY, labelProvider.getText(object.eClass()), object, editingDomain, manager));
                } catch (PartInitException e) {
                    logError("error creating NahkampwaffePage", e);//$NON-NLS-1$
                }
                return null;
            }

            @Override
            public Object caseFeuerwaffe(Feuerwaffe object) {
                try {
                    addPage(new FeuerwaffePage(ShadowrunEditor.this, EMPTY, labelProvider.getText(object.eClass()), object, editingDomain, manager));
                    if (object.getMagazin() != null)
                        addPage(new GegenstandPage(ShadowrunEditor.this, EMPTY, labelProvider.getText(object.getMagazin()), object.getMagazin(),
                                editingDomain, manager));
                    if (object.getWifi() != null)
                        addPage(new GegenstandPage(ShadowrunEditor.this, EMPTY, labelProvider.getText(object.getWifi()),
                                (AbstraktGegenstand)object.getWifi(), editingDomain, manager));

                } catch (PartInitException e) {
                    logError("error creating FeuerwaffePage", e);//$NON-NLS-1$
                }
                return null;
            }
            @Override
            public Object caseMagischeTradition(MagischeTradition object) {
                try {
                    addPage(new VariousObjectsPage(ShadowrunEditor.this, EMPTY, labelProvider.getText(object.eClass()), object, editingDomain, manager));
                } catch (PartInitException e) {
                    logError("error creating VariousObjectsPage", e);//$NON-NLS-1$
                }
                return null;
            }
            @Override
            public Object caseFernkampfwaffeModifikator(FernkampfwaffeModifikator object) {
                try {
                    addPage(new VariousItemsPage(ShadowrunEditor.this, EMPTY, labelProvider.getText(object.eClass()), object, editingDomain, manager));
                } catch (PartInitException e) {
                    logError("error creating VariousItemsPage", e);//$NON-NLS-1$
                }
                return null;
            }
            
            @Override
            public Object caseWeaponMount(WeaponMount object) {
                try {
                    addPage(new VariousItemsPage(ShadowrunEditor.this, EMPTY, labelProvider.getText(object.eClass()), object, editingDomain, manager));
                } catch (PartInitException e) {
                    logError("error creating VariousItemsPage", e);//$NON-NLS-1$
                }
                return null;
            }

            @Override
            public Object caseLifestyleOption(LifestyleOption object) {
                try {
                    addPage(new VariousItemsPage(ShadowrunEditor.this, EMPTY, labelProvider.getText(object.eClass()), object, editingDomain, manager));
                } catch (PartInitException e) {
                    logError("error creating VariousItemsPage", e);//$NON-NLS-1$
                }
                return null;
            }

            @Override
            public Object caseMetaMagie(MetaMagie object) {
                try {
                    addPage(new VariousObjectsPage(ShadowrunEditor.this, EMPTY, labelProvider.getText(object.eClass()), object, editingDomain,
                            manager));
                } catch (PartInitException e) {
                    logError("error creating VariousObjectsPage", e);//$NON-NLS-1$
                }
                return null;
            }

            @Override
            public Object caseKomplexeForm(KomplexeForm object) {
                try {
                    addPage(new VariousObjectsPage(ShadowrunEditor.this, EMPTY, labelProvider.getText(object.eClass()), object, editingDomain,
                            manager));
                } catch (PartInitException e) {
                    logError("error creating VariousObjectsPage", e);//$NON-NLS-1$
                }
                return null;
            }

            @Override
            public Object caseZauber(Zauber object) {
                try {
                    addPage(new VariousObjectsPage(ShadowrunEditor.this, EMPTY, labelProvider.getText(object.eClass()), object, editingDomain,
                            manager));
                } catch (PartInitException e) {
                    logError("error creating VariousObjectsPage", e);//$NON-NLS-1$
                }
                return null;
            }

            @Override
            public Object caseGeist(Geist object) {
                try {
                    addPage(new VariousObjectsPage(ShadowrunEditor.this, EMPTY, labelProvider.getText(object.eClass()), object, editingDomain,
                            manager));
                } catch (PartInitException e) {
                    logError("error creating VariousObjectsPage", e);//$NON-NLS-1$
                }
                return null;
            }

            @Override
            public Object caseShrList(ShrList object) {
                try {
                    addPage(new BeschreibbarContainterPage(ShadowrunEditor.this, EMPTY, labelProvider.getText(object.eClass()), object,
                            editingDomain, manager, Shr5Package.Literals.SHR_LIST__ENTRIES));
                } catch (PartInitException e) {
                    logError("error creating FertigkeitPage", e);//$NON-NLS-1$
                }
                return null;
            }

            @Override
            public Object caseAbstraktPersona(AbstraktPersona object) {
                try {
                    addPage(new AbstraktPersonaPage(ShadowrunEditor.this, EMPTY, labelProvider.getText(object.eClass()), object, editingDomain,
                            manager));
                } catch (PartInitException e) {
                    logError("error creating FertigkeitPage", e);//$NON-NLS-1$
                }
                return null;
            }

            @Override
            public Object caseProjektilwaffe(Projektilwaffe object) {
                try {
                    addPage(new FernkampfwaffePage(ShadowrunEditor.this, EMPTY, labelProvider.getText(object.eClass()), object, editingDomain,
                            manager));
                } catch (PartInitException e) {
                    logError("error creating FernkampfwaffePage", e);//$NON-NLS-1$
                }
                return null;
            }

            @Override
            public Object caseWurfwaffe(Wurfwaffe object) {
                try {
                    addPage(new FernkampfwaffePage(ShadowrunEditor.this, EMPTY, labelProvider.getText(object.eClass()), object, editingDomain,
                            manager));
                } catch (PartInitException e) {
                    logError("error creating FernkampfwaffePage", e);//$NON-NLS-1$
                }
                return null;
            }

            @Override
            public Object caseModifizierbar(Modifizierbar object) {
                try {
                    addPage(new ModifizierbarPage(ShadowrunEditor.this, EMPTY, Messages.ShadowrunEditor_page_modifications, object, editingDomain,
                            manager));
                } catch (PartInitException e) {
                    logError("error creating ModifizierbarPage", e);//$NON-NLS-1$
                }
                return super.caseModifizierbar(object);
            }

            @Override
            public Integer caseAbstraktModifikatoren(AbstraktModifikatoren object) {
                try {
                    addPage(new ModifikatorPage(ShadowrunEditor.this, EMPTY, labelProvider.getText(object.eClass()), object, editingDomain, manager));
                } catch (PartInitException e) {
                    logError("error creating ModifizierbarPage", e);//$NON-NLS-1$
                }
                return null;
            }

        };

        shadowrunSwitch.doSwitch(theEObject);

        Shr5managementSwitch<Object> shr5managementSwitch = new Shr5managementSwitch<Object>() {

            @Override
            public Object caseFreeStyleGenerator(FreeStyleGenerator object) {
                try {
                    addPage(new FreeStyleGeneratorPage(ShadowrunEditor.this, EMPTY, Messages.ShadowrunEditor_page_freestyle_generator, object,
                            editingDomain, manager));

                    addPage(new PrintPreviewPage(ShadowrunEditor.this, EMPTY, Messages.ShadowrunEditor_shr5_generator_sheet, PersonaPrinter
                            .getInstance().createShr5CharacterGeneratorPrintFactory(object)));

                } catch (PartInitException e) {
                    logError("error creating ModifizierbarPage", e);//$NON-NLS-1$
                }
                return super.caseFreeStyleGenerator(object);
            }

            @Override
            public Object caseShr5Generator(Shr5Generator object) {
                try {
                    addPage(new Shr5GeneratorPage(ShadowrunEditor.this, EMPTY, Messages.ShadowrunEditor_page_shr5_generator, object, editingDomain,
                            manager));

                    addPage(new PrintPreviewPage(ShadowrunEditor.this, EMPTY, Messages.ShadowrunEditor_shr5_generator_sheet, PersonaPrinter
                            .getInstance().createShr5CharacterGeneratorPrintFactory(object)));

                } catch (PartInitException e) {
                    logError("error creating ModifizierbarPage", e);//$NON-NLS-1$
                }
                return super.caseShr5Generator(object);
            }

            @Override
            public Object caseSumToTenGenerator(SumToTenGenerator object) {
                return super.caseSumToTenGenerator(object);
            }
 
            @Override
            public Object caseShr5KarmaGenerator(Shr5KarmaGenerator object) {
                try {
                    addPage(new Shr5KarmaGeneratorPage(ShadowrunEditor.this, EMPTY, Messages.ShadowrunEditor_Karama_Generator, object, editingDomain,
                            manager));
                    addPage(new PrintPreviewPage(ShadowrunEditor.this, EMPTY, Messages.ShadowrunEditor_shr5_generator_sheet, PersonaPrinter
                            .getInstance().createShr5CharacterGeneratorPrintFactory(object)));
                } catch (PartInitException e) {
                    logError("error creating ModifizierbarPage", e);//$NON-NLS-1$
                }
                return super.caseShr5KarmaGenerator(object);
            }

            @Override
            public Object caseManagedCharacter(ManagedCharacter object) {
                try {
                    if (object.getGeneratorSrc() != null)
                        if (object.getGeneratorSrc().getState() == GeneratorState.COMMITED) {
                            addPage(new CommitedCharacterPage(ShadowrunEditor.this, AbstractGeneratorPage.COMMITED,
                                    "Overview", object, editingDomain, manager));
                        }
                    addPage(new AbstraktPersonaPage(ShadowrunEditor.this, AbstractGeneratorPage.PERSONA, Messages.ShadowrunEditor_page_persona,
                            object.getPersona(), editingDomain, manager));
                    addPage(new ManagedCharacterPage(ShadowrunEditor.this, AbstractGeneratorPage.PERSONA_INVENTAR,
                            Messages.ShadowrunEditor_page_character, object, editingDomain, manager));

                    if(object instanceof PlayerCharacter){
                        if(((PlayerCharacter)object).getDiary()==null)
                            ((PlayerCharacter)object).setDiary(Shr5managementFactory.eINSTANCE.createCharacterDiary());
                        addPage(new CharacterDiaryPage(ShadowrunEditor.this, AbstractGeneratorPage.PERSONA_INVENTAR,
                                "Diary", ((PlayerCharacter)object).getDiary(), editingDomain, manager));
                    }
                    
                    addPage(new CharacterAdvancementPage(ShadowrunEditor.this, AbstractGeneratorPage.PERSONA_ADVANCEMENT,
                            Messages.ShadowrunEditor_page_advacement, object, editingDomain, manager));

                    addPage(new PrintPreviewPage(ShadowrunEditor.this, AbstractGeneratorPage.PERSONA_PRINTER,
                            Messages.ShadowrunEditor_page_character_sheet, PersonaPrinter.getInstance().createPrintFactory(object)));

                    if (object.getGeneratorSrc() != null)
                        this.doSwitch(object.getGeneratorSrc());

                } catch (PartInitException e) {
                    logError("error creating ManagedCharacterPage", e);//$NON-NLS-1$
                }
                return super.caseManagedCharacter(object);
            }

            @Override
            public Object caseGruntGroup(GruntGroup object) {
                try {
                    addPage(new GruntGroupPage(ShadowrunEditor.this, EMPTY, Messages.ShadowrunEditor_page_grount_group, object, editingDomain,
                            manager));
                    addPage(new PrintPreviewPage(ShadowrunEditor.this, AbstractGeneratorPage.PERSONA_PRINTER,
                            Messages.ShadowrunEditor_page_grunt_group_sheet, PersonaPrinter.getInstance().createGruntPrintFactory(object)));

                } catch (PartInitException e) {
                    logError("error creating GruntPage", e);//$NON-NLS-1$
                }
                return super.caseGruntGroup(object);
            }

            @Override
            public Object caseCharacterGroup(CharacterGroup object) {
                try {
                    addPage(new BeschreibbarContainterPage(ShadowrunEditor.this, EMPTY, Messages.ShadowrunEditor_page_character_group, object,
                            editingDomain, manager, Shr5managementPackage.Literals.CHARACTER_GROUP__MEMBERS, Messages.ShadowrunEditor_members));
                    addPage(new PrintPreviewPage(ShadowrunEditor.this, AbstractGeneratorPage.PERSONA_PRINTER,
                            Messages.ShadowrunEditor_page_character_group_sheet, PersonaPrinter.getInstance()
                                    .createCharacterGroupPrintFactory(object)));

                } catch (PartInitException e) {
                    logError("error creating BeschreibbarContainterPage", e);//$NON-NLS-1$
                }
                return super.caseCharacterGroup(object);
            }

            @Override
            public Object caseGamemasterManagement(GamemasterManagement object) {
                try {
                    // addPage(new GenericBasicBeschreibbarPage(ShadowrunEditor.this, EMPTY, EMPTY, object, editingDomain, manager));
                    addPage(new BeschreibbarContainterPage(ShadowrunEditor.this, EMPTY, labelProvider.getText(object.eClass()), object,
                            editingDomain, manager, Shr5managementPackage.Literals.PLAYER_MANAGEMENT__ENTRIES,
                            Shr5managementPackage.Literals.PLAYER_MANAGEMENT__GENERATORS, Shr5managementPackage.Literals.PLAYER_MANAGEMENT__GROUPS,
                            Shr5managementPackage.Literals.GAMEMASTER_MANAGEMENT__GRUNTS));
                } catch (PartInitException e) {
                    logError("error creating FertigkeitPage", e);//$NON-NLS-1$
                }
                return this;
            }

            @Override
            public Object casePlayerManagement(PlayerManagement object) {
                try {
                    // addPage(new GenericBasicBeschreibbarPage(ShadowrunEditor.this, EMPTY, EMPTY, object, editingDomain, manager));
                    addPage(new BeschreibbarContainterPage(ShadowrunEditor.this, EMPTY, labelProvider.getText(object.eClass()), object,
                            editingDomain, manager, Shr5managementPackage.Literals.PLAYER_MANAGEMENT__ENTRIES,
                            Shr5managementPackage.Literals.PLAYER_MANAGEMENT__GENERATORS, Shr5managementPackage.Literals.PLAYER_MANAGEMENT__GROUPS));
                } catch (PartInitException e) {
                    logError("error creating FertigkeitPage", e);//$NON-NLS-1$
                }
                return this;
            }

            @Override
            public Object caseShr5System(Shr5System object) {
                try {
                    addPage(new GeneratorSystemPage(ShadowrunEditor.this, AbstractGeneratorPage.PERSONA, Messages.ShadowrunEditor_page_persona,
                            object, editingDomain, manager));
                } catch (PartInitException e) {
                    logError("error creating GeneratorSystemPage", e);//$NON-NLS-1$
                }
                return this;
            }

            @SuppressWarnings("rawtypes")
            @Override
            public Object caseCharacterGenerator(CharacterGenerator object) {

                GeneratorState state = object.getState();
                switch (state) {
                    case COMMITED:
                        editingMode = ShrEditingState.READONLY;
                        break;

                    default:
                        editingMode = ShrEditingState.EDITABLE;
                        break;
                }

                return super.caseCharacterGenerator(object);
            }

            @Override
            public Object casePack(Pack object) {
                try {
                    addPage(new VariousItemsPage(ShadowrunEditor.this, EMPTY, labelProvider.getText(object.eClass()), object, editingDomain, manager));
                } catch (PartInitException e) {
                    logError("error creating VariousItemsPage", e);//$NON-NLS-1$
                }
                return super.casePack(object);
            }
            
            @Override
            public Object caseLifeModule(LifeModule object) {
                try {
                    addPage(new VariousObjectsPage(ShadowrunEditor.this, EMPTY, labelProvider.getText(object.eClass()), object, editingDomain, manager));
                } catch (PartInitException e) {
                    logError("error creating VariousItemsPage", e);//$NON-NLS-1$
                }
                return super.caseLifeModule(object);
            }
            
            @Override
            public Object caseModuleChange(ModuleChange object) {
                try {
                    addPage(new ModuleChangePage(ShadowrunEditor.this, EMPTY, labelProvider.getText(object.eClass()), object, editingDomain, manager));
                } catch (PartInitException e) {
                    logError("error creating VariousItemsPage", e);//$NON-NLS-1$
                }
                return super.caseModuleChange(object);
            }
        };
        shr5managementSwitch.doSwitch(theEObject);

        try {
            addPage(new DefaultEmfFormsPage(ShadowrunEditor.this, "Default_EMF_Form_Page", "default form", theEObject)); //$NON-NLS-1$
        } catch (PartInitException e) {
            logError("error creating DefaultEmfFormsPage", e);//$NON-NLS-1$
        }
    }

}
