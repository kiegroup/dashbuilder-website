// .ui.xml template last modified: 1657649695426
package org.dashbuilder.displayer.client.widgets.filter;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class MultipleNumberParameterEditorView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.dashbuilder.displayer.client.widgets.filter.MultipleNumberParameterEditorView>, org.dashbuilder.displayer.client.widgets.filter.MultipleNumberParameterEditorView.Binder {


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.dashbuilder.displayer.client.widgets.filter.MultipleNumberParameterEditorView owner) {


    return new Widgets(owner).get_form();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.dashbuilder.displayer.client.widgets.filter.MultipleNumberParameterEditorView owner;


    public Widgets(final org.dashbuilder.displayer.client.widgets.filter.MultipleNumberParameterEditorView owner) {
      this.owner = owner;
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.dashbuilder.displayer.client.widgets.filter.MultipleNumberParameterEditorView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.dashbuilder.displayer.client.widgets.filter.MultipleNumberParameterEditorView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.dashbuilder.displayer.client.widgets.filter.MultipleNumberParameterEditorView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.dashbuilder.displayer.client.widgets.filter.MultipleNumberParameterEditorView_BinderImpl_GenBundle) GWT.create(org.dashbuilder.displayer.client.widgets.filter.MultipleNumberParameterEditorView_BinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for i18n called 1 times. Type: IMPORTED. Build precedence: 1.
     */
    private org.dashbuilder.displayer.client.resources.i18n.CommonConstants get_i18n() {
      return build_i18n();
    }
    private org.dashbuilder.displayer.client.resources.i18n.CommonConstants build_i18n() {
      // Creation section.
      final org.dashbuilder.displayer.client.resources.i18n.CommonConstants i18n = (org.dashbuilder.displayer.client.resources.i18n.CommonConstants) GWT.create(org.dashbuilder.displayer.client.resources.i18n.CommonConstants.class);
      // Setup section.

      return i18n;
    }

    /**
     * Getter for form called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private org.gwtbootstrap3.client.ui.FormGroup get_form() {
      return build_form();
    }
    private org.gwtbootstrap3.client.ui.FormGroup build_form() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormGroup form = (org.gwtbootstrap3.client.ui.FormGroup) GWT.create(org.gwtbootstrap3.client.ui.FormGroup.class);
      // Setup section.
      form.add(get_f_HorizontalPanel1());
      form.setValidationState(org.gwtbootstrap3.client.ui.constants.ValidationState.NONE);

      this.owner.form = form;

      return form;
    }

    /**
     * Getter for f_HorizontalPanel1 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel1() {
      return build_f_HorizontalPanel1();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel1 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel1.add(get_input());
      f_HorizontalPanel1.add(get_f_Tooltip2());

      return f_HorizontalPanel1;
    }

    /**
     * Getter for input called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.TextBox get_input() {
      return build_input();
    }
    private org.gwtbootstrap3.client.ui.TextBox build_input() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TextBox input = (org.gwtbootstrap3.client.ui.TextBox) GWT.create(org.gwtbootstrap3.client.ui.TextBox.class);
      // Setup section.

      this.owner.input = input;

      return input;
    }

    /**
     * Getter for f_Tooltip2 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Tooltip get_f_Tooltip2() {
      return build_f_Tooltip2();
    }
    private org.gwtbootstrap3.client.ui.Tooltip build_f_Tooltip2() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Tooltip f_Tooltip2 = (org.gwtbootstrap3.client.ui.Tooltip) GWT.create(org.gwtbootstrap3.client.ui.Tooltip.class);
      // Setup section.
      f_Tooltip2.add(get_hintIcon());
      f_Tooltip2.setPlacement(org.gwtbootstrap3.client.ui.constants.Placement.RIGHT);
      f_Tooltip2.setTitle("" + get_i18n().multiple_input_descriptions() + "");
      f_Tooltip2.setIsAnimated(true);

      return f_Tooltip2;
    }

    /**
     * Getter for hintIcon called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.Icon get_hintIcon() {
      return build_hintIcon();
    }
    private org.gwtbootstrap3.client.ui.Icon build_hintIcon() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Icon hintIcon = new org.gwtbootstrap3.client.ui.Icon(org.gwtbootstrap3.client.ui.constants.IconType.QUESTION_CIRCLE);
      // Setup section.

      return hintIcon;
    }
  }
}
