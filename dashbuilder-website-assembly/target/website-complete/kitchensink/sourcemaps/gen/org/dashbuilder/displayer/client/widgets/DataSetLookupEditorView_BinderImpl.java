// .ui.xml template last modified: 1657649695426
package org.dashbuilder.displayer.client.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class DataSetLookupEditorView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.dashbuilder.displayer.client.widgets.DataSetLookupEditorView>, org.dashbuilder.displayer.client.widgets.DataSetLookupEditorView.Binder {


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.dashbuilder.displayer.client.widgets.DataSetLookupEditorView owner) {


    return new Widgets(owner).get_f_FlowPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.dashbuilder.displayer.client.widgets.DataSetLookupEditorView owner;


    final com.google.gwt.event.dom.client.ChangeHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ChangeHandler() {
      public void onChange(com.google.gwt.event.dom.client.ChangeEvent event) {
        owner.onDataSetSelected((com.google.gwt.event.dom.client.ChangeEvent) event);
      }
    };

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onAddColumnClicked((com.google.gwt.event.dom.client.ClickEvent) event);
      }
    };

    final com.google.gwt.event.dom.client.ChangeHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3 = new com.google.gwt.event.dom.client.ChangeHandler() {
      public void onChange(com.google.gwt.event.dom.client.ChangeEvent event) {
        owner.onGroupColumnChanged((com.google.gwt.event.dom.client.ChangeEvent) event);
      }
    };

    public Widgets(final org.dashbuilder.displayer.client.widgets.DataSetLookupEditorView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_i18n();  // more than one getter call detected. Type: IMPORTED, precedence: 1
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.dashbuilder.displayer.client.widgets.DataSetLookupEditorView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.dashbuilder.displayer.client.widgets.DataSetLookupEditorView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.dashbuilder.displayer.client.widgets.DataSetLookupEditorView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.dashbuilder.displayer.client.widgets.DataSetLookupEditorView_BinderImpl_GenBundle) GWT.create(org.dashbuilder.displayer.client.widgets.DataSetLookupEditorView_BinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for i18n called 5 times. Type: IMPORTED. Build precedence: 1.
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
     * Getter for style called 11 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.dashbuilder.displayer.client.widgets.DataSetLookupEditorView_BinderImpl_GenCss_style style;
    private org.dashbuilder.displayer.client.widgets.DataSetLookupEditorView_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private org.dashbuilder.displayer.client.widgets.DataSetLookupEditorView_BinderImpl_GenCss_style build_style() {
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
      f_FlowPanel1.add(get_filtersControlPanel());
      f_FlowPanel1.add(get_groupControlPanel());
      f_FlowPanel1.add(get_columnsControlPanel());

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
      f_FlowPanel2.add(get_statusLabel());
      f_FlowPanel2.add(get_f_Label3());
      f_FlowPanel2.add(get_dataSetListBox());
      f_FlowPanel2.setStyleName("" + get_style().cellPaddingPanel() + "");

      return f_FlowPanel2;
    }

    /**
     * Getter for statusLabel called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Label get_statusLabel() {
      return build_statusLabel();
    }
    private org.gwtbootstrap3.client.ui.Label build_statusLabel() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Label statusLabel = (org.gwtbootstrap3.client.ui.Label) GWT.create(org.gwtbootstrap3.client.ui.Label.class);
      // Setup section.
      statusLabel.setStyleName("" + get_style().statusLabel() + "");
      statusLabel.setVisible(false);

      this.owner.statusLabel = statusLabel;

      return statusLabel;
    }

    /**
     * Getter for f_Label3 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label3() {
      return build_f_Label3();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label3() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label3 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label3.setStyleName("" + get_style().sectionLabel() + "");
      f_Label3.setText("" + get_i18n().dataset_dataset() + "");

      return f_Label3;
    }

    /**
     * Getter for dataSetListBox called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.ListBox get_dataSetListBox() {
      return build_dataSetListBox();
    }
    private org.gwtbootstrap3.client.ui.ListBox build_dataSetListBox() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListBox dataSetListBox = (org.gwtbootstrap3.client.ui.ListBox) GWT.create(org.gwtbootstrap3.client.ui.ListBox.class);
      // Setup section.
      dataSetListBox.setWidth("200px");
      dataSetListBox.addChangeHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

      this.owner.dataSetListBox = dataSetListBox;

      return dataSetListBox;
    }

    /**
     * Getter for filtersControlPanel called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_filtersControlPanel() {
      return build_filtersControlPanel();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_filtersControlPanel() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel filtersControlPanel = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      filtersControlPanel.add(get_f_Label4());
      filtersControlPanel.add(get_filterEditor());
      filtersControlPanel.setStyleName("" + get_style().cellPaddingPanel() + "");
      filtersControlPanel.setVisible(false);

      this.owner.filtersControlPanel = filtersControlPanel;

      return filtersControlPanel;
    }

    /**
     * Getter for f_Label4 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label4() {
      return build_f_Label4();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label4() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label4 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label4.setStyleName("" + get_style().sectionLabel() + "");
      f_Label4.setText("" + get_i18n().dataset_filters() + "");

      return f_Label4;
    }

    /**
     * Getter for filterEditor called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.dashbuilder.displayer.client.widgets.filter.DataSetFilterEditor get_filterEditor() {
      return build_filterEditor();
    }
    private org.dashbuilder.displayer.client.widgets.filter.DataSetFilterEditor build_filterEditor() {
      // Creation section.
      final org.dashbuilder.displayer.client.widgets.filter.DataSetFilterEditor filterEditor = owner.filterEditor;
      assert filterEditor != null : "UiField filterEditor with 'provided = true' was null";
      // Setup section.

      return filterEditor;
    }

    /**
     * Getter for groupControlPanel called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_groupControlPanel() {
      return build_groupControlPanel();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_groupControlPanel() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel groupControlPanel = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      groupControlPanel.add(get_groupControlLabel());
      groupControlPanel.add(get_f_HorizontalPanel5());
      groupControlPanel.add(get_groupDatePanel());
      groupControlPanel.setStyleName("" + get_style().cellPaddingPanel() + "");
      groupControlPanel.setVisible(false);

      this.owner.groupControlPanel = groupControlPanel;

      return groupControlPanel;
    }

    /**
     * Getter for groupControlLabel called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Label get_groupControlLabel() {
      return build_groupControlLabel();
    }
    private com.google.gwt.user.client.ui.Label build_groupControlLabel() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label groupControlLabel = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      groupControlLabel.setStyleName("" + get_style().sectionLabel() + "");
      groupControlLabel.setText("" + get_i18n().dataset_rows() + "");

      this.owner.groupControlLabel = groupControlLabel;

      return groupControlLabel;
    }

    /**
     * Getter for f_HorizontalPanel5 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel5() {
      return build_f_HorizontalPanel5();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel5() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel5 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel5.add(get_groupColumnListBox());
      f_HorizontalPanel5.add(get_groupDetailsIcon());
      f_HorizontalPanel5.setStyleName("" + get_style().cellPaddingPanel() + "");

      return f_HorizontalPanel5;
    }

    /**
     * Getter for groupColumnListBox called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.ListBox get_groupColumnListBox() {
      return build_groupColumnListBox();
    }
    private org.gwtbootstrap3.client.ui.ListBox build_groupColumnListBox() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListBox groupColumnListBox = (org.gwtbootstrap3.client.ui.ListBox) GWT.create(org.gwtbootstrap3.client.ui.ListBox.class);
      // Setup section.
      groupColumnListBox.setWidth("200px");
      groupColumnListBox.addChangeHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3);

      this.owner.groupColumnListBox = groupColumnListBox;

      return groupColumnListBox;
    }

    /**
     * Getter for groupDetailsIcon called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.Icon get_groupDetailsIcon() {
      return build_groupDetailsIcon();
    }
    private org.gwtbootstrap3.client.ui.Icon build_groupDetailsIcon() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Icon groupDetailsIcon = new org.gwtbootstrap3.client.ui.Icon(org.gwtbootstrap3.client.ui.constants.IconType.ARROW_DOWN);
      // Setup section.
      groupDetailsIcon.setSize(org.gwtbootstrap3.client.ui.constants.IconSize.LARGE);

      this.owner.groupDetailsIcon = groupDetailsIcon;

      return groupDetailsIcon;
    }

    /**
     * Getter for groupDatePanel called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_groupDatePanel() {
      return build_groupDatePanel();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_groupDatePanel() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel groupDatePanel = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      groupDatePanel.add(get_groupDateEditor());
      groupDatePanel.setStyleName("" + get_style().groupDatePanel() + "");
      groupDatePanel.setVisible(false);

      this.owner.groupDatePanel = groupDatePanel;

      return groupDatePanel;
    }

    /**
     * Getter for groupDateEditor called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.dashbuilder.displayer.client.widgets.group.DataSetGroupDateEditor get_groupDateEditor() {
      return build_groupDateEditor();
    }
    private org.dashbuilder.displayer.client.widgets.group.DataSetGroupDateEditor build_groupDateEditor() {
      // Creation section.
      final org.dashbuilder.displayer.client.widgets.group.DataSetGroupDateEditor groupDateEditor = owner.groupDateEditor;
      assert groupDateEditor != null : "UiField groupDateEditor with 'provided = true' was null";
      // Setup section.

      return groupDateEditor;
    }

    /**
     * Getter for columnsControlPanel called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_columnsControlPanel() {
      return build_columnsControlPanel();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_columnsControlPanel() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel columnsControlPanel = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      columnsControlPanel.add(get_columnsControlLabel());
      columnsControlPanel.add(get_columnsPanel());
      columnsControlPanel.add(get_addColumnButton());
      columnsControlPanel.setStyleName("" + get_style().cellPaddingPanel() + "");
      columnsControlPanel.setVisible(false);

      this.owner.columnsControlPanel = columnsControlPanel;

      return columnsControlPanel;
    }

    /**
     * Getter for columnsControlLabel called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Label get_columnsControlLabel() {
      return build_columnsControlLabel();
    }
    private com.google.gwt.user.client.ui.Label build_columnsControlLabel() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label columnsControlLabel = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      columnsControlLabel.setStyleName("" + get_style().sectionLabel() + "");
      columnsControlLabel.setText("" + get_i18n().dataset_columns() + "");

      this.owner.columnsControlLabel = columnsControlLabel;

      return columnsControlLabel;
    }

    /**
     * Getter for columnsPanel called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_columnsPanel() {
      return build_columnsPanel();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_columnsPanel() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel columnsPanel = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.

      this.owner.columnsPanel = columnsPanel;

      return columnsPanel;
    }

    /**
     * Getter for addColumnButton called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Button get_addColumnButton() {
      return build_addColumnButton();
    }
    private org.gwtbootstrap3.client.ui.Button build_addColumnButton() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button addColumnButton = (org.gwtbootstrap3.client.ui.Button) GWT.create(org.gwtbootstrap3.client.ui.Button.class);
      // Setup section.
      addColumnButton.setVisible(false);
      addColumnButton.setText("" + get_i18n().common_button_addnew() + "");
      addColumnButton.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.LINK);
      addColumnButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

      this.owner.addColumnButton = addColumnButton;

      return addColumnButton;
    }
  }
}
