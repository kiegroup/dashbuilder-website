// .ui.xml template last modified: 1657649695426
package org.dashbuilder.displayer.client.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class DisplayerSettingsEditorView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.dashbuilder.displayer.client.widgets.DisplayerSettingsEditorView>, org.dashbuilder.displayer.client.widgets.DisplayerSettingsEditorView.Binder {


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.dashbuilder.displayer.client.widgets.DisplayerSettingsEditorView owner) {


    return new Widgets(owner).get_mainPanel();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.dashbuilder.displayer.client.widgets.DisplayerSettingsEditorView owner;


    public Widgets(final org.dashbuilder.displayer.client.widgets.DisplayerSettingsEditorView owner) {
      this.owner = owner;
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.dashbuilder.displayer.client.widgets.DisplayerSettingsEditorView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.dashbuilder.displayer.client.widgets.DisplayerSettingsEditorView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.dashbuilder.displayer.client.widgets.DisplayerSettingsEditorView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.dashbuilder.displayer.client.widgets.DisplayerSettingsEditorView_BinderImpl_GenBundle) GWT.create(org.dashbuilder.displayer.client.widgets.DisplayerSettingsEditorView_BinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for mainPanel called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_mainPanel() {
      return build_mainPanel();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_mainPanel() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel mainPanel = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      mainPanel.add(get_propertyEditor());

      this.owner.mainPanel = mainPanel;

      return mainPanel;
    }

    /**
     * Getter for propertyEditor called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.uberfire.ext.properties.editor.client.PropertyEditorWidget get_propertyEditor() {
      return build_propertyEditor();
    }
    private org.uberfire.ext.properties.editor.client.PropertyEditorWidget build_propertyEditor() {
      // Creation section.
      final org.uberfire.ext.properties.editor.client.PropertyEditorWidget propertyEditor = (org.uberfire.ext.properties.editor.client.PropertyEditorWidget) GWT.create(org.uberfire.ext.properties.editor.client.PropertyEditorWidget.class);
      // Setup section.

      this.owner.propertyEditor = propertyEditor;

      return propertyEditor;
    }
  }
}
