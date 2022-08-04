// .ui.xml template last modified: 1657649695426
package org.dashbuilder.displayer.client.widgets.filter;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class ColumnFilterEditorView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.dashbuilder.displayer.client.widgets.filter.ColumnFilterEditorView>, org.dashbuilder.displayer.client.widgets.filter.ColumnFilterEditorView.Binder {


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.dashbuilder.displayer.client.widgets.filter.ColumnFilterEditorView owner) {


    return new Widgets(owner).get_f_FlowPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.dashbuilder.displayer.client.widgets.filter.ColumnFilterEditorView owner;


    final com.google.gwt.event.dom.client.ChangeHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ChangeHandler() {
      public void onChange(com.google.gwt.event.dom.client.ChangeEvent event) {
        owner.onFilterSelected((com.google.gwt.event.dom.client.ChangeEvent) event);
      }
    };

    public Widgets(final org.dashbuilder.displayer.client.widgets.filter.ColumnFilterEditorView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.dashbuilder.displayer.client.widgets.filter.ColumnFilterEditorView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.dashbuilder.displayer.client.widgets.filter.ColumnFilterEditorView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.dashbuilder.displayer.client.widgets.filter.ColumnFilterEditorView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.dashbuilder.displayer.client.widgets.filter.ColumnFilterEditorView_BinderImpl_GenBundle) GWT.create(org.dashbuilder.displayer.client.widgets.filter.ColumnFilterEditorView_BinderImpl_GenBundle.class);
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
     * Getter for style called 2 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.dashbuilder.displayer.client.widgets.filter.ColumnFilterEditorView_BinderImpl_GenCss_style style;
    private org.dashbuilder.displayer.client.widgets.filter.ColumnFilterEditorView_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private org.dashbuilder.displayer.client.widgets.filter.ColumnFilterEditorView_BinderImpl_GenCss_style build_style() {
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
      f_FlowPanel1.add(get_f_FlowPanel2());
      f_FlowPanel1.add(get_filterDetailsPanel());
      f_FlowPanel1.setStyleName("" + get_style().filterPadding() + "");

      return f_FlowPanel1;
    }

    /**
     * Getter for f_FlowPanel2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel2() {
      return build_f_FlowPanel2();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel2() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel2 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel2.add(get_filterExpandIcon());
      f_FlowPanel2.add(get_filterListBox());
      f_FlowPanel2.add(get_filterDeleteIcon());
      f_FlowPanel2.addStyleName("form-inline");

      return f_FlowPanel2;
    }

    /**
     * Getter for filterExpandIcon called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Button get_filterExpandIcon() {
      return build_filterExpandIcon();
    }
    private org.gwtbootstrap3.client.ui.Button build_filterExpandIcon() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button filterExpandIcon = (org.gwtbootstrap3.client.ui.Button) GWT.create(org.gwtbootstrap3.client.ui.Button.class);
      // Setup section.
      filterExpandIcon.setVisible(false);
      filterExpandIcon.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.ANGLE_DOWN);
      filterExpandIcon.setIconSize(org.gwtbootstrap3.client.ui.constants.IconSize.LARGE);
      filterExpandIcon.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.LINK);
      filterExpandIcon.setIconFixedWidth(true);

      this.owner.filterExpandIcon = filterExpandIcon;

      return filterExpandIcon;
    }

    /**
     * Getter for filterListBox called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.ListBox get_filterListBox() {
      return build_filterListBox();
    }
    private org.gwtbootstrap3.client.ui.ListBox build_filterListBox() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListBox filterListBox = (org.gwtbootstrap3.client.ui.ListBox) GWT.create(org.gwtbootstrap3.client.ui.ListBox.class);
      // Setup section.
      filterListBox.setWidth("240px");
      filterListBox.addChangeHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

      this.owner.filterListBox = filterListBox;

      return filterListBox;
    }

    /**
     * Getter for filterDeleteIcon called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Button get_filterDeleteIcon() {
      return build_filterDeleteIcon();
    }
    private org.gwtbootstrap3.client.ui.Button build_filterDeleteIcon() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button filterDeleteIcon = (org.gwtbootstrap3.client.ui.Button) GWT.create(org.gwtbootstrap3.client.ui.Button.class);
      // Setup section.
      filterDeleteIcon.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.TRASH);
      filterDeleteIcon.setIconSize(org.gwtbootstrap3.client.ui.constants.IconSize.LARGE);
      filterDeleteIcon.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.LINK);
      filterDeleteIcon.setTitle("" + get_i18n().removeFilter() + "");
      filterDeleteIcon.setIconFixedWidth(true);

      this.owner.filterDeleteIcon = filterDeleteIcon;

      return filterDeleteIcon;
    }

    /**
     * Getter for filterDetailsPanel called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_filterDetailsPanel() {
      return build_filterDetailsPanel();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_filterDetailsPanel() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel filterDetailsPanel = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      filterDetailsPanel.setStyleName("" + get_style().filterDetailsPanel() + "");
      filterDetailsPanel.setVisible(false);

      this.owner.filterDetailsPanel = filterDetailsPanel;

      return filterDetailsPanel;
    }
  }
}
