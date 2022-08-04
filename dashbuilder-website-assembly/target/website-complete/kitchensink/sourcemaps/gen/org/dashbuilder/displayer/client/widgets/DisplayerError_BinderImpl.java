// .ui.xml template last modified: 1657649695426
package org.dashbuilder.displayer.client.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class DisplayerError_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.dashbuilder.displayer.client.widgets.DisplayerError>, org.dashbuilder.displayer.client.widgets.DisplayerError.Binder {


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.dashbuilder.displayer.client.widgets.DisplayerError owner) {


    return new Widgets(owner).get_f_FlowPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.dashbuilder.displayer.client.widgets.DisplayerError owner;


    public Widgets(final org.dashbuilder.displayer.client.widgets.DisplayerError owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_i18n();  // more than one getter call detected. Type: IMPORTED, precedence: 1
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.dashbuilder.displayer.client.widgets.DisplayerError_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.dashbuilder.displayer.client.widgets.DisplayerError_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.dashbuilder.displayer.client.widgets.DisplayerError_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.dashbuilder.displayer.client.widgets.DisplayerError_BinderImpl_GenBundle) GWT.create(org.dashbuilder.displayer.client.widgets.DisplayerError_BinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for i18n called 2 times. Type: IMPORTED. Build precedence: 1.
     */
    private org.dashbuilder.displayer.client.resources.i18n.CommonConstants i18n;
    private org.dashbuilder.displayer.client.resources.i18n.CommonConstants get_i18n() {
      return i18n;
    }
    private org.dashbuilder.displayer.client.resources.i18n.CommonConstants build_i18n() {
      // Creation section.
      i18n = (org.dashbuilder.displayer.client.resources.i18n.CommonConstants) GWT.create(org.dashbuilder.displayer.client.resources.i18n.CommonConstants.class);
      // Setup section.

      return i18n;
    }

    /**
     * Getter for style called 5 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.dashbuilder.displayer.client.widgets.DisplayerError_BinderImpl_GenCss_style style;
    private org.dashbuilder.displayer.client.widgets.DisplayerError_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private org.dashbuilder.displayer.client.widgets.DisplayerError_BinderImpl_GenCss_style build_style() {
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
      f_FlowPanel1.add(get_errorMessageRow());
      f_FlowPanel1.add(get_errorCauseRow());
      f_FlowPanel1.addStyleName("" + get_style().errorPanel() + "");

      return f_FlowPanel1;
    }

    /**
     * Getter for errorMessageRow called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.Row get_errorMessageRow() {
      return build_errorMessageRow();
    }
    private org.gwtbootstrap3.client.ui.Row build_errorMessageRow() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row errorMessageRow = (org.gwtbootstrap3.client.ui.Row) GWT.create(org.gwtbootstrap3.client.ui.Row.class);
      // Setup section.
      errorMessageRow.add(get_f_Column2());
      errorMessageRow.add(get_f_Column4());
      errorMessageRow.addStyleName("" + get_style().errorRow() + "");

      this.owner.errorMessageRow = errorMessageRow;

      return errorMessageRow;
    }

    /**
     * Getter for f_Column2 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column2() {
      return build_f_Column2();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column2() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column2 = new org.gwtbootstrap3.client.ui.Column("MD_1");
      // Setup section.
      f_Column2.add(get_f_Label3());

      return f_Column2;
    }

    /**
     * Getter for f_Label3 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label3() {
      return build_f_Label3();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label3() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label3 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label3.addStyleName("" + get_style().errorLabel() + "");
      f_Label3.setText("" + get_i18n().error() + "");

      return f_Label3;
    }

    /**
     * Getter for f_Column4 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column4() {
      return build_f_Column4();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column4() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column4 = new org.gwtbootstrap3.client.ui.Column("MD_3");
      // Setup section.
      f_Column4.add(get_errorMessage());

      return f_Column4;
    }

    /**
     * Getter for errorMessage called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HTML get_errorMessage() {
      return build_errorMessage();
    }
    private com.google.gwt.user.client.ui.HTML build_errorMessage() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTML errorMessage = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
      // Setup section.
      errorMessage.setText("");

      this.owner.errorMessage = errorMessage;

      return errorMessage;
    }

    /**
     * Getter for errorCauseRow called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.Row get_errorCauseRow() {
      return build_errorCauseRow();
    }
    private org.gwtbootstrap3.client.ui.Row build_errorCauseRow() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row errorCauseRow = (org.gwtbootstrap3.client.ui.Row) GWT.create(org.gwtbootstrap3.client.ui.Row.class);
      // Setup section.
      errorCauseRow.add(get_f_Column5());
      errorCauseRow.add(get_f_Column7());
      errorCauseRow.addStyleName("" + get_style().errorRow() + "");

      this.owner.errorCauseRow = errorCauseRow;

      return errorCauseRow;
    }

    /**
     * Getter for f_Column5 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column5() {
      return build_f_Column5();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column5() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column5 = new org.gwtbootstrap3.client.ui.Column("MD_1");
      // Setup section.
      f_Column5.add(get_f_Label6());

      return f_Column5;
    }

    /**
     * Getter for f_Label6 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label6() {
      return build_f_Label6();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label6() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label6 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label6.addStyleName("" + get_style().errorLabel() + "");
      f_Label6.setText("" + get_i18n().cause() + "");

      return f_Label6;
    }

    /**
     * Getter for f_Column7 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column7() {
      return build_f_Column7();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column7() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column7 = new org.gwtbootstrap3.client.ui.Column("MD_3");
      // Setup section.
      f_Column7.add(get_errorCause());

      return f_Column7;
    }

    /**
     * Getter for errorCause called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HTML get_errorCause() {
      return build_errorCause();
    }
    private com.google.gwt.user.client.ui.HTML build_errorCause() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTML errorCause = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
      // Setup section.
      errorCause.setText("");

      this.owner.errorCause = errorCause;

      return errorCause;
    }
  }
}
