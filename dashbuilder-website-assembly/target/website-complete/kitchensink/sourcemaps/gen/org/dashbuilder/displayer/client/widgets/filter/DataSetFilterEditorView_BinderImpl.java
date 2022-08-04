// .ui.xml template last modified: 1657649695426
package org.dashbuilder.displayer.client.widgets.filter;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class DataSetFilterEditorView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.dashbuilder.displayer.client.widgets.filter.DataSetFilterEditorView>, org.dashbuilder.displayer.client.widgets.filter.DataSetFilterEditorView.Binder {


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.dashbuilder.displayer.client.widgets.filter.DataSetFilterEditorView owner) {


    return new Widgets(owner).get_f_FlowPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.dashbuilder.displayer.client.widgets.filter.DataSetFilterEditorView owner;


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onAddFilterClicked((com.google.gwt.event.dom.client.ClickEvent) event);
      }
    };

    final com.google.gwt.event.dom.client.ChangeHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ChangeHandler() {
      public void onChange(com.google.gwt.event.dom.client.ChangeEvent event) {
        owner.onNewFilterSelected((com.google.gwt.event.dom.client.ChangeEvent) event);
      }
    };

    public Widgets(final org.dashbuilder.displayer.client.widgets.filter.DataSetFilterEditorView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_i18n();  // more than one getter call detected. Type: IMPORTED, precedence: 1
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.dashbuilder.displayer.client.widgets.filter.DataSetFilterEditorView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.dashbuilder.displayer.client.widgets.filter.DataSetFilterEditorView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.dashbuilder.displayer.client.widgets.filter.DataSetFilterEditorView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.dashbuilder.displayer.client.widgets.filter.DataSetFilterEditorView_BinderImpl_GenBundle) GWT.create(org.dashbuilder.displayer.client.widgets.filter.DataSetFilterEditorView_BinderImpl_GenBundle.class);
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
     * Getter for style called 1 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.dashbuilder.displayer.client.widgets.filter.DataSetFilterEditorView_BinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private org.dashbuilder.displayer.client.widgets.filter.DataSetFilterEditorView_BinderImpl_GenCss_style build_style() {
      // Creation section.
      final org.dashbuilder.displayer.client.widgets.filter.DataSetFilterEditorView_BinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
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
      f_FlowPanel1.add(get_filterListPanel());
      f_FlowPanel1.add(get_addFilterPanel());
      f_FlowPanel1.add(get_addFilterButton());

      return f_FlowPanel1;
    }

    /**
     * Getter for filterListPanel called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_filterListPanel() {
      return build_filterListPanel();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_filterListPanel() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel filterListPanel = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.

      this.owner.filterListPanel = filterListPanel;

      return filterListPanel;
    }

    /**
     * Getter for addFilterPanel called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_addFilterPanel() {
      return build_addFilterPanel();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_addFilterPanel() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel addFilterPanel = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      addFilterPanel.add(get_newFilterListBox());
      addFilterPanel.add(get_filterDeleteIcon());
      addFilterPanel.setVisible(false);

      this.owner.addFilterPanel = addFilterPanel;

      return addFilterPanel;
    }

    /**
     * Getter for newFilterListBox called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.ListBox get_newFilterListBox() {
      return build_newFilterListBox();
    }
    private org.gwtbootstrap3.client.ui.ListBox build_newFilterListBox() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListBox newFilterListBox = (org.gwtbootstrap3.client.ui.ListBox) GWT.create(org.gwtbootstrap3.client.ui.ListBox.class);
      // Setup section.
      newFilterListBox.addStyleName("" + get_style().filterEditorMargin() + "");
      newFilterListBox.setWidth("240px");
      newFilterListBox.addChangeHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

      this.owner.newFilterListBox = newFilterListBox;

      return newFilterListBox;
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
     * Getter for addFilterButton called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.Button get_addFilterButton() {
      return build_addFilterButton();
    }
    private org.gwtbootstrap3.client.ui.Button build_addFilterButton() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button addFilterButton = (org.gwtbootstrap3.client.ui.Button) GWT.create(org.gwtbootstrap3.client.ui.Button.class);
      // Setup section.
      addFilterButton.setText("" + get_i18n().common_button_addnew() + "");
      addFilterButton.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.LINK);
      addFilterButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

      this.owner.addFilterButton = addFilterButton;

      return addFilterButton;
    }
  }
}
