// .ui.xml template last modified: 1657649695426
package org.dashbuilder.displayer.client.widgets.filter;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class NumberParameterEditorView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.dashbuilder.displayer.client.widgets.filter.NumberParameterEditorView>, org.dashbuilder.displayer.client.widgets.filter.NumberParameterEditorView.Binder {


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.dashbuilder.displayer.client.widgets.filter.NumberParameterEditorView owner) {


    return new Widgets(owner).get_form();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.dashbuilder.displayer.client.widgets.filter.NumberParameterEditorView owner;


    public Widgets(final org.dashbuilder.displayer.client.widgets.filter.NumberParameterEditorView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.dashbuilder.displayer.client.widgets.filter.NumberParameterEditorView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.dashbuilder.displayer.client.widgets.filter.NumberParameterEditorView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.dashbuilder.displayer.client.widgets.filter.NumberParameterEditorView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.dashbuilder.displayer.client.widgets.filter.NumberParameterEditorView_BinderImpl_GenBundle) GWT.create(org.dashbuilder.displayer.client.widgets.filter.NumberParameterEditorView_BinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 1 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.dashbuilder.displayer.client.widgets.filter.NumberParameterEditorView_BinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private org.dashbuilder.displayer.client.widgets.filter.NumberParameterEditorView_BinderImpl_GenCss_style build_style() {
      // Creation section.
      final org.dashbuilder.displayer.client.widgets.filter.NumberParameterEditorView_BinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();

      return style;
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
      form.add(get_input());
      form.addStyleName("" + get_style().fieldEditorMargin() + "");
      form.setValidationState(org.gwtbootstrap3.client.ui.constants.ValidationState.NONE);

      this.owner.form = form;

      return form;
    }

    /**
     * Getter for input called 1 times. Type: DEFAULT. Build precedence: 2.
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
  }
}
