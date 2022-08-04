// .ui.xml template last modified: 1657649695426
package org.dashbuilder.displayer.client.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class DisplayerTypeSelectorView_ViewBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.dashbuilder.displayer.client.widgets.DisplayerTypeSelectorView>, org.dashbuilder.displayer.client.widgets.DisplayerTypeSelectorView.ViewBinder {


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.dashbuilder.displayer.client.widgets.DisplayerTypeSelectorView owner) {


    return new Widgets(owner).get_f_TabPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.dashbuilder.displayer.client.widgets.DisplayerTypeSelectorView owner;


    public Widgets(final org.dashbuilder.displayer.client.widgets.DisplayerTypeSelectorView owner) {
      this.owner = owner;
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.dashbuilder.displayer.client.widgets.DisplayerTypeSelectorView_ViewBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.dashbuilder.displayer.client.widgets.DisplayerTypeSelectorView_ViewBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.dashbuilder.displayer.client.widgets.DisplayerTypeSelectorView_ViewBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.dashbuilder.displayer.client.widgets.DisplayerTypeSelectorView_ViewBinderImpl_GenBundle) GWT.create(org.dashbuilder.displayer.client.widgets.DisplayerTypeSelectorView_ViewBinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for f_TabPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private org.gwtbootstrap3.client.ui.TabPanel get_f_TabPanel1() {
      return build_f_TabPanel1();
    }
    private org.gwtbootstrap3.client.ui.TabPanel build_f_TabPanel1() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabPanel f_TabPanel1 = (org.gwtbootstrap3.client.ui.TabPanel) GWT.create(org.gwtbootstrap3.client.ui.TabPanel.class);
      // Setup section.
      f_TabPanel1.add(get_navTabs());
      f_TabPanel1.add(get_f_TabContent2());
      f_TabPanel1.setTabPosition(org.gwtbootstrap3.client.ui.constants.TabPosition.LEFT);

      return f_TabPanel1;
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

    /**
     * Getter for f_TabContent2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.TabContent get_f_TabContent2() {
      return build_f_TabContent2();
    }
    private org.gwtbootstrap3.client.ui.TabContent build_f_TabContent2() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabContent f_TabContent2 = (org.gwtbootstrap3.client.ui.TabContent) GWT.create(org.gwtbootstrap3.client.ui.TabContent.class);
      // Setup section.
      f_TabContent2.add(get_displayerSubTypePane());

      return f_TabContent2;
    }

    /**
     * Getter for displayerSubTypePane called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.TabPane get_displayerSubTypePane() {
      return build_displayerSubTypePane();
    }
    private org.gwtbootstrap3.client.ui.TabPane build_displayerSubTypePane() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabPane displayerSubTypePane = (org.gwtbootstrap3.client.ui.TabPane) GWT.create(org.gwtbootstrap3.client.ui.TabPane.class);
      // Setup section.

      this.owner.displayerSubTypePane = displayerSubTypePane;

      return displayerSubTypePane;
    }
  }
}
