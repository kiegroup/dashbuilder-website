// .ui.xml template last modified: 1657649691864
package org.dashbuilder.common.client.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class AlertPanelView_ViewBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.dashbuilder.common.client.widgets.AlertPanelView>, org.dashbuilder.common.client.widgets.AlertPanelView.ViewBinder {


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.dashbuilder.common.client.widgets.AlertPanelView owner) {


    return new Widgets(owner).get_alert();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.dashbuilder.common.client.widgets.AlertPanelView owner;


    public Widgets(final org.dashbuilder.common.client.widgets.AlertPanelView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_i18nCommon();  // more than one getter call detected. Type: IMPORTED, precedence: 1
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.dashbuilder.common.client.widgets.AlertPanelView_ViewBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.dashbuilder.common.client.widgets.AlertPanelView_ViewBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.dashbuilder.common.client.widgets.AlertPanelView_ViewBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.dashbuilder.common.client.widgets.AlertPanelView_ViewBinderImpl_GenBundle) GWT.create(org.dashbuilder.common.client.widgets.AlertPanelView_ViewBinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for i18nCommon called 2 times. Type: IMPORTED. Build precedence: 1.
     */
    private org.uberfire.ext.widgets.common.client.resources.i18n.CommonConstants i18nCommon;
    private org.uberfire.ext.widgets.common.client.resources.i18n.CommonConstants get_i18nCommon() {
      return i18nCommon;
    }
    private org.uberfire.ext.widgets.common.client.resources.i18n.CommonConstants build_i18nCommon() {
      // Creation section.
      i18nCommon = (org.uberfire.ext.widgets.common.client.resources.i18n.CommonConstants) GWT.create(org.uberfire.ext.widgets.common.client.resources.i18n.CommonConstants.class);
      // Setup section.

      return i18nCommon;
    }

    /**
     * Getter for style called 3 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.dashbuilder.common.client.widgets.AlertPanelView_ViewBinderImpl_GenCss_style style;
    private org.dashbuilder.common.client.widgets.AlertPanelView_ViewBinderImpl_GenCss_style get_style() {
      return style;
    }
    private org.dashbuilder.common.client.widgets.AlertPanelView_ViewBinderImpl_GenCss_style build_style() {
      // Creation section.
      style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();

      return style;
    }

    /**
     * Getter for alert called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private org.gwtbootstrap3.client.ui.Alert get_alert() {
      return build_alert();
    }
    private org.gwtbootstrap3.client.ui.Alert build_alert() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Alert alert = (org.gwtbootstrap3.client.ui.Alert) GWT.create(org.gwtbootstrap3.client.ui.Alert.class);
      // Setup section.
      alert.add(get_f_FlowPanel1());

      this.owner.alert = alert;

      return alert;
    }

    /**
     * Getter for f_FlowPanel1 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel1() {
      return build_f_FlowPanel1();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel1 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel1.add(get_okButton());
      f_FlowPanel1.add(get_cancelButton());
      f_FlowPanel1.addStyleName("" + get_style().buttonsPanel() + "");

      return f_FlowPanel1;
    }

    /**
     * Getter for okButton called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Button get_okButton() {
      return build_okButton();
    }
    private org.gwtbootstrap3.client.ui.Button build_okButton() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button okButton = (org.gwtbootstrap3.client.ui.Button) GWT.create(org.gwtbootstrap3.client.ui.Button.class);
      // Setup section.
      okButton.addStyleName("" + get_style().button() + "");
      okButton.setText("" + get_i18nCommon().OK() + "");
      okButton.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.DEFAULT);

      this.owner.okButton = okButton;

      return okButton;
    }

    /**
     * Getter for cancelButton called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Button get_cancelButton() {
      return build_cancelButton();
    }
    private org.gwtbootstrap3.client.ui.Button build_cancelButton() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button cancelButton = (org.gwtbootstrap3.client.ui.Button) GWT.create(org.gwtbootstrap3.client.ui.Button.class);
      // Setup section.
      cancelButton.addStyleName("" + get_style().button() + "");
      cancelButton.setText("" + get_i18nCommon().Cancel() + "");
      cancelButton.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.DEFAULT);

      this.owner.cancelButton = cancelButton;

      return cancelButton;
    }
  }
}
