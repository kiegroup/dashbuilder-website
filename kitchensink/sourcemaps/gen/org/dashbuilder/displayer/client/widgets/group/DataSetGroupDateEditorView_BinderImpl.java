// .ui.xml template last modified: 1657649695426
package org.dashbuilder.displayer.client.widgets.group;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class DataSetGroupDateEditorView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.dashbuilder.displayer.client.widgets.group.DataSetGroupDateEditorView>, org.dashbuilder.displayer.client.widgets.group.DataSetGroupDateEditorView.Binder {


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.dashbuilder.displayer.client.widgets.group.DataSetGroupDateEditorView owner) {


    return new Widgets(owner).get_f_FlowPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.dashbuilder.displayer.client.widgets.group.DataSetGroupDateEditorView owner;


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onFixedModeSelected((com.google.gwt.event.dom.client.ClickEvent) event);
      }
    };

    final com.google.gwt.event.dom.client.ChangeHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ChangeHandler() {
      public void onChange(com.google.gwt.event.dom.client.ChangeEvent event) {
        owner.onIntervalTypeSelected((com.google.gwt.event.dom.client.ChangeEvent) event);
      }
    };

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onEmptyIntervalsChanged((com.google.gwt.event.dom.client.ClickEvent) event);
      }
    };

    final com.google.gwt.event.dom.client.ChangeHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4 = new com.google.gwt.event.dom.client.ChangeHandler() {
      public void onChange(com.google.gwt.event.dom.client.ChangeEvent event) {
        owner.onMaxIntervalsChanged((com.google.gwt.event.dom.client.ChangeEvent) event);
      }
    };

    final com.google.gwt.event.dom.client.ChangeHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames5 = new com.google.gwt.event.dom.client.ChangeHandler() {
      public void onChange(com.google.gwt.event.dom.client.ChangeEvent event) {
        owner.onFirstDaySelected((com.google.gwt.event.dom.client.ChangeEvent) event);
      }
    };

    final com.google.gwt.event.dom.client.ChangeHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames6 = new com.google.gwt.event.dom.client.ChangeHandler() {
      public void onChange(com.google.gwt.event.dom.client.ChangeEvent event) {
        owner.onFirstMonthSelected((com.google.gwt.event.dom.client.ChangeEvent) event);
      }
    };

    public Widgets(final org.dashbuilder.displayer.client.widgets.group.DataSetGroupDateEditorView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_i18n();  // more than one getter call detected. Type: IMPORTED, precedence: 1
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.dashbuilder.displayer.client.widgets.group.DataSetGroupDateEditorView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.dashbuilder.displayer.client.widgets.group.DataSetGroupDateEditorView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.dashbuilder.displayer.client.widgets.group.DataSetGroupDateEditorView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.dashbuilder.displayer.client.widgets.group.DataSetGroupDateEditorView_BinderImpl_GenBundle) GWT.create(org.dashbuilder.displayer.client.widgets.group.DataSetGroupDateEditorView_BinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for i18n called 6 times. Type: IMPORTED. Build precedence: 1.
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
     * Getter for style called 8 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.dashbuilder.displayer.client.widgets.group.DataSetGroupDateEditorView_BinderImpl_GenCss_style style;
    private org.dashbuilder.displayer.client.widgets.group.DataSetGroupDateEditorView_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private org.dashbuilder.displayer.client.widgets.group.DataSetGroupDateEditorView_BinderImpl_GenCss_style build_style() {
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
      f_FlowPanel1.add(get_f_HorizontalPanel2());
      f_FlowPanel1.add(get_f_HorizontalPanel4());
      f_FlowPanel1.add(get_f_FlowPanel6());
      f_FlowPanel1.add(get_maxIntervalsGroup());
      f_FlowPanel1.add(get_firstDayPanel());
      f_FlowPanel1.add(get_firstMonthPanel());

      return f_FlowPanel1;
    }

    /**
     * Getter for f_HorizontalPanel2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel2() {
      return build_f_HorizontalPanel2();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel2() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel2 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel2.add(get_fixedStrategyCheckBox());
      f_HorizontalPanel2.add(get_f_Label3());

      return f_HorizontalPanel2;
    }

    /**
     * Getter for fixedStrategyCheckBox called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.CheckBox get_fixedStrategyCheckBox() {
      return build_fixedStrategyCheckBox();
    }
    private org.gwtbootstrap3.client.ui.CheckBox build_fixedStrategyCheckBox() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.CheckBox fixedStrategyCheckBox = (org.gwtbootstrap3.client.ui.CheckBox) GWT.create(org.gwtbootstrap3.client.ui.CheckBox.class);
      // Setup section.
      fixedStrategyCheckBox.setStyleName("" + get_style().checkBox() + "");
      fixedStrategyCheckBox.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

      this.owner.fixedStrategyCheckBox = fixedStrategyCheckBox;

      return fixedStrategyCheckBox;
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
      f_Label3.setStyleName("" + get_style().labelFont() + "");
      f_Label3.setText("" + get_i18n().dataset_groupdate_fixed_intervals() + "");

      return f_Label3;
    }

    /**
     * Getter for f_HorizontalPanel4 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel4() {
      return build_f_HorizontalPanel4();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel4() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel4 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel4.add(get_emptyIntervalsCheckBox());
      f_HorizontalPanel4.add(get_f_Label5());

      return f_HorizontalPanel4;
    }

    /**
     * Getter for emptyIntervalsCheckBox called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.CheckBox get_emptyIntervalsCheckBox() {
      return build_emptyIntervalsCheckBox();
    }
    private org.gwtbootstrap3.client.ui.CheckBox build_emptyIntervalsCheckBox() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.CheckBox emptyIntervalsCheckBox = (org.gwtbootstrap3.client.ui.CheckBox) GWT.create(org.gwtbootstrap3.client.ui.CheckBox.class);
      // Setup section.
      emptyIntervalsCheckBox.setStyleName("" + get_style().checkBox() + "");
      emptyIntervalsCheckBox.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3);

      this.owner.emptyIntervalsCheckBox = emptyIntervalsCheckBox;

      return emptyIntervalsCheckBox;
    }

    /**
     * Getter for f_Label5 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label5() {
      return build_f_Label5();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label5() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label5 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label5.setStyleName("" + get_style().labelFont() + "");
      f_Label5.setText("" + get_i18n().dataset_groupdate_empty_intervals() + "");

      return f_Label5;
    }

    /**
     * Getter for f_FlowPanel6 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel6() {
      return build_f_FlowPanel6();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel6() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel6 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel6.add(get_f_Label7());
      f_FlowPanel6.add(get_intervalTypeListBox());

      return f_FlowPanel6;
    }

    /**
     * Getter for f_Label7 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label7() {
      return build_f_Label7();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label7() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label7 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label7.setStyleName("" + get_style().labelFont() + "");
      f_Label7.setText("" + get_i18n().dataset_groupdate_interval_type() + "");

      return f_Label7;
    }

    /**
     * Getter for intervalTypeListBox called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.ListBox get_intervalTypeListBox() {
      return build_intervalTypeListBox();
    }
    private org.gwtbootstrap3.client.ui.ListBox build_intervalTypeListBox() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListBox intervalTypeListBox = (org.gwtbootstrap3.client.ui.ListBox) GWT.create(org.gwtbootstrap3.client.ui.ListBox.class);
      // Setup section.
      intervalTypeListBox.setWidth("130px");
      intervalTypeListBox.addChangeHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

      this.owner.intervalTypeListBox = intervalTypeListBox;

      return intervalTypeListBox;
    }

    /**
     * Getter for maxIntervalsGroup called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_maxIntervalsGroup() {
      return build_maxIntervalsGroup();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_maxIntervalsGroup() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel maxIntervalsGroup = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      maxIntervalsGroup.add(get_f_Label8());
      maxIntervalsGroup.add(get_maxIntervalsTextBox());
      maxIntervalsGroup.setVisible(false);

      this.owner.maxIntervalsGroup = maxIntervalsGroup;

      return maxIntervalsGroup;
    }

    /**
     * Getter for f_Label8 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label8() {
      return build_f_Label8();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label8() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label8 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label8.setStyleName("" + get_style().labelFont() + "");
      f_Label8.setText("" + get_i18n().dataset_groupdate_max_intervals() + "");

      return f_Label8;
    }

    /**
     * Getter for maxIntervalsTextBox called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.TextBox get_maxIntervalsTextBox() {
      return build_maxIntervalsTextBox();
    }
    private org.gwtbootstrap3.client.ui.TextBox build_maxIntervalsTextBox() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TextBox maxIntervalsTextBox = (org.gwtbootstrap3.client.ui.TextBox) GWT.create(org.gwtbootstrap3.client.ui.TextBox.class);
      // Setup section.
      maxIntervalsTextBox.setWidth("130px");
      maxIntervalsTextBox.addChangeHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4);

      this.owner.maxIntervalsTextBox = maxIntervalsTextBox;

      return maxIntervalsTextBox;
    }

    /**
     * Getter for firstDayPanel called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_firstDayPanel() {
      return build_firstDayPanel();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_firstDayPanel() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel firstDayPanel = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      firstDayPanel.add(get_f_Label9());
      firstDayPanel.add(get_firstDayListBox());
      firstDayPanel.setVisible(false);

      this.owner.firstDayPanel = firstDayPanel;

      return firstDayPanel;
    }

    /**
     * Getter for f_Label9 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label9() {
      return build_f_Label9();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label9() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label9 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label9.setStyleName("" + get_style().labelFont() + "");
      f_Label9.setText("" + get_i18n().dataset_groupdate_firstday() + "");

      return f_Label9;
    }

    /**
     * Getter for firstDayListBox called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.ListBox get_firstDayListBox() {
      return build_firstDayListBox();
    }
    private org.gwtbootstrap3.client.ui.ListBox build_firstDayListBox() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListBox firstDayListBox = (org.gwtbootstrap3.client.ui.ListBox) GWT.create(org.gwtbootstrap3.client.ui.ListBox.class);
      // Setup section.
      firstDayListBox.setWidth("130px");
      firstDayListBox.addChangeHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames5);

      this.owner.firstDayListBox = firstDayListBox;

      return firstDayListBox;
    }

    /**
     * Getter for firstMonthPanel called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_firstMonthPanel() {
      return build_firstMonthPanel();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_firstMonthPanel() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel firstMonthPanel = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      firstMonthPanel.add(get_f_Label10());
      firstMonthPanel.add(get_firstMonthListBox());
      firstMonthPanel.setVisible(false);

      this.owner.firstMonthPanel = firstMonthPanel;

      return firstMonthPanel;
    }

    /**
     * Getter for f_Label10 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label10() {
      return build_f_Label10();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label10() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label10 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label10.setStyleName("" + get_style().labelFont() + "");
      f_Label10.setText("" + get_i18n().dataset_groupdate_firstmonth() + "");

      return f_Label10;
    }

    /**
     * Getter for firstMonthListBox called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.ListBox get_firstMonthListBox() {
      return build_firstMonthListBox();
    }
    private org.gwtbootstrap3.client.ui.ListBox build_firstMonthListBox() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListBox firstMonthListBox = (org.gwtbootstrap3.client.ui.ListBox) GWT.create(org.gwtbootstrap3.client.ui.ListBox.class);
      // Setup section.
      firstMonthListBox.setWidth("130px");
      firstMonthListBox.addChangeHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames6);

      this.owner.firstMonthListBox = firstMonthListBox;

      return firstMonthListBox;
    }
  }
}
