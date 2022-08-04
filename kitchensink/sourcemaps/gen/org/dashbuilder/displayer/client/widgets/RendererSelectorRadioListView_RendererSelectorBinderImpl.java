// .ui.xml template last modified: 1657649695426
package org.dashbuilder.displayer.client.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class RendererSelectorRadioListView_RendererSelectorBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.dashbuilder.displayer.client.widgets.RendererSelectorRadioListView>, org.dashbuilder.displayer.client.widgets.RendererSelectorRadioListView.RendererSelectorBinder {


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.dashbuilder.displayer.client.widgets.RendererSelectorRadioListView owner) {


    return new Widgets(owner).get_radioButtonsPanel();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.dashbuilder.displayer.client.widgets.RendererSelectorRadioListView owner;


    public Widgets(final org.dashbuilder.displayer.client.widgets.RendererSelectorRadioListView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.dashbuilder.displayer.client.widgets.RendererSelectorRadioListView_RendererSelectorBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.dashbuilder.displayer.client.widgets.RendererSelectorRadioListView_RendererSelectorBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.dashbuilder.displayer.client.widgets.RendererSelectorRadioListView_RendererSelectorBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.dashbuilder.displayer.client.widgets.RendererSelectorRadioListView_RendererSelectorBinderImpl_GenBundle) GWT.create(org.dashbuilder.displayer.client.widgets.RendererSelectorRadioListView_RendererSelectorBinderImpl_GenBundle.class);
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
     * Getter for style called 1 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.dashbuilder.displayer.client.widgets.RendererSelectorRadioListView_RendererSelectorBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private org.dashbuilder.displayer.client.widgets.RendererSelectorRadioListView_RendererSelectorBinderImpl_GenCss_style build_style() {
      // Creation section.
      final org.dashbuilder.displayer.client.widgets.RendererSelectorRadioListView_RendererSelectorBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();

      return style;
    }

    /**
     * Getter for radioButtonsPanel called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_radioButtonsPanel() {
      return build_radioButtonsPanel();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_radioButtonsPanel() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel radioButtonsPanel = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      radioButtonsPanel.addStyleName("" + get_style().mainPanelStyle() + "");
      radioButtonsPanel.setSpacing(10);
      radioButtonsPanel.setTitle("" + get_i18n().renderer_selector_title() + "");

      this.owner.radioButtonsPanel = radioButtonsPanel;

      return radioButtonsPanel;
    }
  }
}
