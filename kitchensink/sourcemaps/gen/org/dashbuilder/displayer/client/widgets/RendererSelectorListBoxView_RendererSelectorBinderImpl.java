// .ui.xml template last modified: 1657649695426
package org.dashbuilder.displayer.client.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class RendererSelectorListBoxView_RendererSelectorBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.dashbuilder.displayer.client.widgets.RendererSelectorListBoxView>, org.dashbuilder.displayer.client.widgets.RendererSelectorListBoxView.RendererSelectorBinder {


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.dashbuilder.displayer.client.widgets.RendererSelectorListBoxView owner) {


    return new Widgets(owner).get_mainPanel();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.dashbuilder.displayer.client.widgets.RendererSelectorListBoxView owner;


    public Widgets(final org.dashbuilder.displayer.client.widgets.RendererSelectorListBoxView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.dashbuilder.displayer.client.widgets.RendererSelectorListBoxView_RendererSelectorBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.dashbuilder.displayer.client.widgets.RendererSelectorListBoxView_RendererSelectorBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.dashbuilder.displayer.client.widgets.RendererSelectorListBoxView_RendererSelectorBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.dashbuilder.displayer.client.widgets.RendererSelectorListBoxView_RendererSelectorBinderImpl_GenBundle) GWT.create(org.dashbuilder.displayer.client.widgets.RendererSelectorListBoxView_RendererSelectorBinderImpl_GenBundle.class);
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
    private org.dashbuilder.displayer.client.widgets.RendererSelectorListBoxView_RendererSelectorBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private org.dashbuilder.displayer.client.widgets.RendererSelectorListBoxView_RendererSelectorBinderImpl_GenCss_style build_style() {
      // Creation section.
      final org.dashbuilder.displayer.client.widgets.RendererSelectorListBoxView_RendererSelectorBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();

      return style;
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
      mainPanel.add(get_listBox());
      mainPanel.addStyleName("" + get_style().mainPanelStyle() + "");
      mainPanel.setTitle("" + get_i18n().renderer_selector_title() + "");

      this.owner.mainPanel = mainPanel;

      return mainPanel;
    }

    /**
     * Getter for listBox called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.ListBox get_listBox() {
      return build_listBox();
    }
    private com.google.gwt.user.client.ui.ListBox build_listBox() {
      // Creation section.
      final com.google.gwt.user.client.ui.ListBox listBox = (com.google.gwt.user.client.ui.ListBox) GWT.create(com.google.gwt.user.client.ui.ListBox.class);
      // Setup section.

      this.owner.listBox = listBox;

      return listBox;
    }
  }
}
