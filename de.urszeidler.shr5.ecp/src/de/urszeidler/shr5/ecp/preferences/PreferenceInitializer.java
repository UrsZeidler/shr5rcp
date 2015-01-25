package de.urszeidler.shr5.ecp.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontData;

import de.urszeidler.commons.eclipse.preferences.editor.SeparatorFieldEditor;
import de.urszeidler.shr5.ecp.Activator;
import de.urszeidler.shr5.scripting.PlacementOptions;
import de.urszeidler.shr5.scripting.ScriptingPackage;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

    /*
     * (non-Javadoc)
     * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
     */
    public void initializeDefaultPreferences() {

        FontData[] defaultFont = JFaceResources.getDefaultFont().getFontData();
        FontData[] boldFont = new FontData[defaultFont.length];
        for (int i = 0; i < defaultFont.length; i++) {
            boldFont[i] = new FontData(defaultFont[i].getName(), defaultFont[i].getHeight(), SWT.BOLD);
        }
        FontData[] italic = new FontData[defaultFont.length];
        for (int i = 0; i < defaultFont.length; i++) {
            italic[i] = new FontData(defaultFont[0].getName(), defaultFont[0].getHeight() - 2, SWT.ITALIC);
        }
        FontData[] normal = new FontData[defaultFont.length];
        for (int i = 0; i < defaultFont.length; i++) {
            normal[i] = new FontData(defaultFont[0].getName(), defaultFont[0].getHeight() - 2, defaultFont[0].getStyle());
        }
        FontData[] header = new FontData[defaultFont.length];
        for (int i = 0; i < defaultFont.length; i++) {
            header[i] = new FontData(defaultFont[0].getName(), defaultFont[0].getHeight() + 2, SWT.BOLD);
        }

        IPreferenceStore store = Activator.getDefault().getPreferenceStore();
        store.setDefault(PreferenceConstants.FOOTER_GAP, 24);
        store.setDefault(PreferenceConstants.PAGE_MARGIN, 24);
        store.setDefault(PreferenceConstants.PRINT_PERSONA_DECRIPTION, true);
        store.setDefault(PreferenceConstants.PRINT_USEABLE_SKILLS, true);
        store.setDefault(PreferenceConstants.PRINT_CHARACTER_ADVACEMENTS, true);
        store.setDefault(PreferenceConstants.CURRENCY_SYMBOL, "¥");
        store.setDefault(PreferenceConstants.FONT_MAIN_HEADER, PreferenceConverter.getStoredRepresentation(boldFont));
        store.setDefault(PreferenceConstants.FONT_TABLE_HEADER, PreferenceConverter.getStoredRepresentation(italic));
        store.setDefault(PreferenceConstants.FONT_NORMAL_TEXT, PreferenceConverter.getStoredRepresentation(normal));
        store.setDefault(PreferenceConstants.FONT_HEAD1_TEXT, PreferenceConverter.getStoredRepresentation(header));

        store.setDefault(PreferenceConstants.DEFAUL_PROJECT_NAME, Activator.DEFAUL_PROJECT_NAME);
        
        EList<EEnumLiteral> eLiterals = ScriptingPackage.Literals.PLACEMENT_OPTIONS.getELiterals();
        for (EEnumLiteral eEnumLiteral : eLiterals) {
            PreferenceConverter.setDefault(store, PreferenceConstants.SCRIPT_GRAPH_COLOR_BG+eEnumLiteral.getName(),
                    ColorConstants.blue.getRGB() );
            PreferenceConverter.setDefault(store, PreferenceConstants.SCRIPT_GRAPH_COLOR_FG+eEnumLiteral.getName(),
                    ColorConstants.black.getRGB() );
        }

        
        PreferenceConverter.setDefault(store, PreferenceConstants.SCRIPT_GRAPH_COLOR_BG+PlacementOptions.COMBAT,
                ColorConstants.red.getRGB() );
        PreferenceConverter.setDefault(store, PreferenceConstants.SCRIPT_GRAPH_COLOR_FG+PlacementOptions.COMBAT,
                ColorConstants.white.getRGB() );
        PreferenceConverter.setDefault(store, PreferenceConstants.SCRIPT_GRAPH_COLOR_BG+PlacementOptions.HOME_GROUND,
                ColorConstants.green.getRGB() );
        PreferenceConverter.setDefault(store, PreferenceConstants.SCRIPT_GRAPH_COLOR_FG+PlacementOptions.HOME_GROUND,
                ColorConstants.black.getRGB() );
        
        
//        store.setDefault(PreferenceConstants.SCRIPT_GRAPH_COLOR_BG+"", );
 
        
    }

}
