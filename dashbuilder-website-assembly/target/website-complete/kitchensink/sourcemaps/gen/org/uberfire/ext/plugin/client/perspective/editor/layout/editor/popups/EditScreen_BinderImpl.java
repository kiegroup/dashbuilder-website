// .ui.xml template last modified: 1657649687133
package org.uberfire.ext.plugin.client.perspective.editor.layout.editor.popups;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class EditScreen_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.uberfire.ext.plugin.client.perspective.editor.layout.editor.popups.EditScreen>, org.uberfire.ext.plugin.client.perspective.editor.layout.editor.popups.EditScreen.Binder {


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.uberfire.ext.plugin.client.perspective.editor.layout.editor.popups.EditScreen owner) {


    return new Widgets(owner).get_f_Panel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.uberfire.ext.plugin.client.perspective.editor.layout.editor.popups.EditScreen owner;


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.add((com.google.gwt.event.dom.client.ClickEvent) event);
      }
    };

    public Widgets(final org.uberfire.ext.plugin.client.perspective.editor.layout.editor.popups.EditScreen owner) {
      this.owner = owner;
      build_i18n();  // more than one getter call detected. Type: IMPORTED, precedence: 1
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.uberfire.ext.plugin.client.perspective.editor.layout.editor.popups.EditScreen_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.uberfire.ext.plugin.client.perspective.editor.layout.editor.popups.EditScreen_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.uberfire.ext.plugin.client.perspective.editor.layout.editor.popups.EditScreen_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.uberfire.ext.plugin.client.perspective.editor.layout.editor.popups.EditScreen_BinderImpl_GenBundle) GWT.create(org.uberfire.ext.plugin.client.perspective.editor.layout.editor.popups.EditScreen_BinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for res called 1 times. Type: IMPORTED. Build precedence: 1.
     */
    private org.uberfire.ext.plugin.client.resources.WebAppResource get_res() {
      return build_res();
    }
    private org.uberfire.ext.plugin.client.resources.WebAppResource build_res() {
      // Creation section.
      final org.uberfire.ext.plugin.client.resources.WebAppResource res = (org.uberfire.ext.plugin.client.resources.WebAppResource) GWT.create(org.uberfire.ext.plugin.client.resources.WebAppResource.class);
      // Setup section.

      return res;
    }

    /**
     * Getter for i18n called 6 times. Type: IMPORTED. Build precedence: 1.
     */
    private org.uberfire.ext.plugin.client.resources.i18n.CommonConstants i18n;
    private org.uberfire.ext.plugin.client.resources.i18n.CommonConstants get_i18n() {
      return i18n;
    }
    private org.uberfire.ext.plugin.client.resources.i18n.CommonConstants build_i18n() {
      // Creation section.
      i18n = (org.uberfire.ext.plugin.client.resources.i18n.CommonConstants) GWT.create(org.uberfire.ext.plugin.client.resources.i18n.CommonConstants.class);
      // Setup section.

      return i18n;
    }

    /**
     * Getter for f_Panel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel1() {
      return build_f_Panel1();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel1() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel1 = (org.gwtbootstrap3.client.ui.Panel) GWT.create(org.gwtbootstrap3.client.ui.Panel.class);
      // Setup section.
      f_Panel1.add(get_f_PanelGroup2());
      f_Panel1.add(get_propertyEditor());

      return f_Panel1;
    }

    /**
     * Getter for f_PanelGroup2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.PanelGroup get_f_PanelGroup2() {
      return build_f_PanelGroup2();
    }
    private org.gwtbootstrap3.client.ui.PanelGroup build_f_PanelGroup2() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelGroup f_PanelGroup2 = (org.gwtbootstrap3.client.ui.PanelGroup) GWT.create(org.gwtbootstrap3.client.ui.PanelGroup.class);
      // Setup section.
      f_PanelGroup2.add(get_f_Panel3());

      return f_PanelGroup2;
    }

    /**
     * Getter for f_Panel3 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel3() {
      return build_f_Panel3();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel3() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel3 = (org.gwtbootstrap3.client.ui.Panel) GWT.create(org.gwtbootstrap3.client.ui.Panel.class);
      // Setup section.
      f_Panel3.add(get_f_PanelHeader4());
      f_Panel3.add(get_f_PanelCollapse7());

      return f_Panel3;
    }

    /**
     * Getter for f_PanelHeader4 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader4() {
      return build_f_PanelHeader4();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader4() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader4 = (org.gwtbootstrap3.client.ui.PanelHeader) GWT.create(org.gwtbootstrap3.client.ui.PanelHeader.class);
      // Setup section.
      f_PanelHeader4.add(get_f_Heading5());

      return f_PanelHeader4;
    }

    /**
     * Getter for f_Heading5 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading5() {
      return build_f_Heading5();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading5() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading5 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading5.add(get_f_Anchor6());

      return f_Heading5;
    }

    /**
     * Getter for f_Anchor6 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Anchor get_f_Anchor6() {
      return build_f_Anchor6();
    }
    private org.gwtbootstrap3.client.ui.Anchor build_f_Anchor6() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Anchor f_Anchor6 = (org.gwtbootstrap3.client.ui.Anchor) GWT.create(org.gwtbootstrap3.client.ui.Anchor.class);
      // Setup section.
      f_Anchor6.addStyleName("collapsed");
      f_Anchor6.setDataToggle(org.gwtbootstrap3.client.ui.constants.Toggle.COLLAPSE);
      f_Anchor6.setText("" + get_i18n().AddNewParameter() + "");
      f_Anchor6.setDataTarget("#collapsePersistence");

      return f_Anchor6;
    }

    /**
     * Getter for f_PanelCollapse7 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelCollapse get_f_PanelCollapse7() {
      return build_f_PanelCollapse7();
    }
    private org.gwtbootstrap3.client.ui.PanelCollapse build_f_PanelCollapse7() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelCollapse f_PanelCollapse7 = (org.gwtbootstrap3.client.ui.PanelCollapse) GWT.create(org.gwtbootstrap3.client.ui.PanelCollapse.class);
      // Setup section.
      f_PanelCollapse7.add(get_f_PanelBody8());
      f_PanelCollapse7.setId("collapsePersistence");

      return f_PanelCollapse7;
    }

    /**
     * Getter for f_PanelBody8 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody8() {
      return build_f_PanelBody8();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody8() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody8 = (org.gwtbootstrap3.client.ui.PanelBody) GWT.create(org.gwtbootstrap3.client.ui.PanelBody.class);
      // Setup section.
      f_PanelBody8.add(get_paramKeyControlGroup());
      f_PanelBody8.add(get_f_FormGroup11());
      f_PanelBody8.add(get_add());

      return f_PanelBody8;
    }

    /**
     * Getter for paramKeyControlGroup called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.FormGroup get_paramKeyControlGroup() {
      return build_paramKeyControlGroup();
    }
    private org.gwtbootstrap3.client.ui.FormGroup build_paramKeyControlGroup() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormGroup paramKeyControlGroup = (org.gwtbootstrap3.client.ui.FormGroup) GWT.create(org.gwtbootstrap3.client.ui.FormGroup.class);
      // Setup section.
      paramKeyControlGroup.add(get_paramKeyInline());
      paramKeyControlGroup.add(get_f_FormLabel9());
      paramKeyControlGroup.add(get_f_FlowPanel10());

      this.owner.paramKeyControlGroup = paramKeyControlGroup;

      return paramKeyControlGroup;
    }

    /**
     * Getter for paramKeyInline called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.HelpBlock get_paramKeyInline() {
      return build_paramKeyInline();
    }
    private org.gwtbootstrap3.client.ui.HelpBlock build_paramKeyInline() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.HelpBlock paramKeyInline = (org.gwtbootstrap3.client.ui.HelpBlock) GWT.create(org.gwtbootstrap3.client.ui.HelpBlock.class);
      // Setup section.

      this.owner.paramKeyInline = paramKeyInline;

      return paramKeyInline;
    }

    /**
     * Getter for f_FormLabel9 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.FormLabel get_f_FormLabel9() {
      return build_f_FormLabel9();
    }
    private org.gwtbootstrap3.client.ui.FormLabel build_f_FormLabel9() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormLabel f_FormLabel9 = (org.gwtbootstrap3.client.ui.FormLabel) GWT.create(org.gwtbootstrap3.client.ui.FormLabel.class);
      // Setup section.
      f_FormLabel9.addStyleName("col-lg-3");
      f_FormLabel9.setFor("key");
      f_FormLabel9.setText("" + get_i18n().ParamKey() + "");

      return f_FormLabel9;
    }

    /**
     * Getter for f_FlowPanel10 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel10() {
      return build_f_FlowPanel10();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel10() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel10 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel10.add(get_key());
      f_FlowPanel10.addStyleName("col-lg-9");

      return f_FlowPanel10;
    }

    /**
     * Getter for key called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.TextBox get_key() {
      return build_key();
    }
    private org.gwtbootstrap3.client.ui.TextBox build_key() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TextBox key = (org.gwtbootstrap3.client.ui.TextBox) GWT.create(org.gwtbootstrap3.client.ui.TextBox.class);
      // Setup section.
      key.setPlaceholder("" + get_i18n().ParamKeyPlaceHolder() + "");

      this.owner.key = key;

      return key;
    }

    /**
     * Getter for f_FormGroup11 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.FormGroup get_f_FormGroup11() {
      return build_f_FormGroup11();
    }
    private org.gwtbootstrap3.client.ui.FormGroup build_f_FormGroup11() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormGroup f_FormGroup11 = (org.gwtbootstrap3.client.ui.FormGroup) GWT.create(org.gwtbootstrap3.client.ui.FormGroup.class);
      // Setup section.
      f_FormGroup11.add(get_f_FormLabel12());
      f_FormGroup11.add(get_f_FlowPanel13());

      return f_FormGroup11;
    }

    /**
     * Getter for f_FormLabel12 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.FormLabel get_f_FormLabel12() {
      return build_f_FormLabel12();
    }
    private org.gwtbootstrap3.client.ui.FormLabel build_f_FormLabel12() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormLabel f_FormLabel12 = (org.gwtbootstrap3.client.ui.FormLabel) GWT.create(org.gwtbootstrap3.client.ui.FormLabel.class);
      // Setup section.
      f_FormLabel12.addStyleName("col-lg-3");
      f_FormLabel12.setFor("value");
      f_FormLabel12.setText("" + get_i18n().ParamValue() + "");

      return f_FormLabel12;
    }

    /**
     * Getter for f_FlowPanel13 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel13() {
      return build_f_FlowPanel13();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel13() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel13 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel13.add(get_value());
      f_FlowPanel13.addStyleName("col-lg-9");

      return f_FlowPanel13;
    }

    /**
     * Getter for value called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.TextBox get_value() {
      return build_value();
    }
    private org.gwtbootstrap3.client.ui.TextBox build_value() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TextBox value = (org.gwtbootstrap3.client.ui.TextBox) GWT.create(org.gwtbootstrap3.client.ui.TextBox.class);
      // Setup section.
      value.addStyleName("col-sm-9");
      value.setPlaceholder("" + get_i18n().ParamValuePlaceHolder() + "");

      this.owner.value = value;

      return value;
    }

    /**
     * Getter for add called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Button get_add() {
      return build_add();
    }
    private org.gwtbootstrap3.client.ui.Button build_add() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button add = (org.gwtbootstrap3.client.ui.Button) GWT.create(org.gwtbootstrap3.client.ui.Button.class);
      // Setup section.
      add.setText("" + "" + "" + get_i18n().Add() + "" + "" + "");
      add.addStyleName("" + get_res().CSS().buttonAddParameter() + "");
      add.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      add.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

      return add;
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
