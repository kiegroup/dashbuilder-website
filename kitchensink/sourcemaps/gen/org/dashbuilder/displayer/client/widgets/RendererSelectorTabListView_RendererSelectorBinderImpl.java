// .ui.xml template last modified: 1657649695426
package org.dashbuilder.displayer.client.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class RendererSelectorTabListView_RendererSelectorBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.dashbuilder.displayer.client.widgets.RendererSelectorTabListView>, org.dashbuilder.displayer.client.widgets.RendererSelectorTabListView.RendererSelectorBinder {


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.dashbuilder.displayer.client.widgets.RendererSelectorTabListView owner) {


    return new Widgets(owner).get_tabPanel();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.dashbuilder.displayer.client.widgets.RendererSelectorTabListView owner;


    public Widgets(final org.dashbuilder.displayer.client.widgets.RendererSelectorTabListView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.dashbuilder.displayer.client.widgets.RendererSelectorTabListView_RendererSelectorBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.dashbuilder.displayer.client.widgets.RendererSelectorTabListView_RendererSelectorBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.dashbuilder.displayer.client.widgets.RendererSelectorTabListView_RendererSelectorBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.dashbuilder.displayer.client.widgets.RendererSelectorTabListView_RendererSelectorBinderImpl_GenBundle) GWT.create(org.dashbuilder.displayer.client.widgets.RendererSelectorTabListView_RendererSelectorBinderImpl_GenBundle.class);
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
    private org.dashbuilder.displayer.client.widgets.RendererSelectorTabListView_RendererSelectorBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private org.dashbuilder.displayer.client.widgets.RendererSelectorTabListView_RendererSelectorBinderImpl_GenCss_style build_style() {
      // Creation section.
      final org.dashbuilder.displayer.client.widgets.RendererSelectorTabListView_RendererSelectorBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();

      return style;
    }

    /**
     * Getter for tabPanel called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private org.gwtbootstrap3.client.ui.TabPanel get_tabPanel() {
      return build_tabPanel();
    }
    private org.gwtbootstrap3.client.ui.TabPanel build_tabPanel() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabPanel tabPanel = (org.gwtbootstrap3.client.ui.TabPanel) GWT.create(org.gwtbootstrap3.client.ui.TabPanel.class);
      // Setup section.
      tabPanel.add(get_tabContent());
      tabPanel.add(get_navTabs());
      tabPanel.addStyleName("" + get_style().mainPanelStyle() + "");
      tabPanel.setTabPosition(org.gwtbootstrap3.client.ui.constants.TabPosition.TOP);
      tabPanel.setTitle("" + get_i18n().renderer_selector_title() + "");

      this.owner.tabPanel = tabPanel;

      return tabPanel;
    }

    /**
     * Getter for tabContent called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.TabContent get_tabContent() {
      return build_tabContent();
    }
    private org.gwtbootstrap3.client.ui.TabContent build_tabContent() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabContent tabContent = (org.gwtbootstrap3.client.ui.TabContent) GWT.create(org.gwtbootstrap3.client.ui.TabContent.class);
      // Setup section.

      this.owner.tabContent = tabContent;

      return tabContent;
    }

    /**
     * Getter for navTabs called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.NavTabs get_navTabs() {
      return build_navTabs();
    }
    private org.gwtbootstrap3.client.ui.NavTabs build_navTabs() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavTabs navTabs = (org.gwtbootstrap3.client.ui.NavTabs) GWT.create(org.gwtbootstrap3.client.ui.NavTabs.class);
      // Setup section.

      this.owner.navTabs = navTabs;

      return navTabs;
    }
  }
}
