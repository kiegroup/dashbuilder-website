// .ui.xml template last modified: 1657649695426
package org.dashbuilder.displayer.client.widgets.filter;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class DateParameterEditorView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.dashbuilder.displayer.client.widgets.filter.DateParameterEditorView>, org.dashbuilder.displayer.client.widgets.filter.DateParameterEditorView.Binder {


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.dashbuilder.displayer.client.widgets.filter.DateParameterEditorView owner) {


    return new Widgets(owner).get_f_FlowPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.dashbuilder.displayer.client.widgets.filter.DateParameterEditorView owner;


    public Widgets(final org.dashbuilder.displayer.client.widgets.filter.DateParameterEditorView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.dashbuilder.displayer.client.widgets.filter.DateParameterEditorView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.dashbuilder.displayer.client.widgets.filter.DateParameterEditorView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.dashbuilder.displayer.client.widgets.filter.DateParameterEditorView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.dashbuilder.displayer.client.widgets.filter.DateParameterEditorView_BinderImpl_GenBundle) GWT.create(org.dashbuilder.displayer.client.widgets.filter.DateParameterEditorView_BinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 2 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.dashbuilder.displayer.client.widgets.filter.DateParameterEditorView_BinderImpl_GenCss_style style;
    private org.dashbuilder.displayer.client.widgets.filter.DateParameterEditorView_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private org.dashbuilder.displayer.client.widgets.filter.DateParameterEditorView_BinderImpl_GenCss_style build_style() {
      // Creation section.
      style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();

      return style;
    }

    /**
     * Getter for f_FlowPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel1() {
      return build_f_FlowPanel1();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel1 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel1.add(get_input());
      f_FlowPanel1.add(get_icon());

      return f_FlowPanel1;
    }

    /**
     * Getter for input called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.uberfire.ext.widgets.common.client.common.DatePicker get_input() {
      return build_input();
    }
    private org.uberfire.ext.widgets.common.client.common.DatePicker build_input() {
      // Creation section.
      final org.uberfire.ext.widgets.common.client.common.DatePicker input = (org.uberfire.ext.widgets.common.client.common.DatePicker) GWT.create(org.uberfire.ext.widgets.common.client.common.DatePicker.class);
      // Setup section.
      input.setStyleName("" + get_style().datePicker() + "");
      input.addStyleName("form-control");

      this.owner.input = input;

      return input;
    }

    /**
     * Getter for icon called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.Button get_icon() {
      return build_icon();
    }
    private org.gwtbootstrap3.client.ui.Button build_icon() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button icon = (org.gwtbootstrap3.client.ui.Button) GWT.create(org.gwtbootstrap3.client.ui.Button.class);
      // Setup section.
      icon.setStyleName("" + get_style().calendarIcon() + "");
      icon.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.CALENDAR);

      this.owner.icon = icon;

      return icon;
    }
  }
}
