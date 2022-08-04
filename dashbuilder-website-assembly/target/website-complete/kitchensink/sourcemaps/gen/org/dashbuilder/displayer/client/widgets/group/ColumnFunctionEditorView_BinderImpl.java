// .ui.xml template last modified: 1657649695426
package org.dashbuilder.displayer.client.widgets.group;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class ColumnFunctionEditorView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.dashbuilder.displayer.client.widgets.group.ColumnFunctionEditorView>, org.dashbuilder.displayer.client.widgets.group.ColumnFunctionEditorView.Binder {


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.dashbuilder.displayer.client.widgets.group.ColumnFunctionEditorView owner) {


    return new Widgets(owner).get_f_VerticalPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.dashbuilder.displayer.client.widgets.group.ColumnFunctionEditorView owner;


    final com.google.gwt.event.dom.client.ChangeHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ChangeHandler() {
      public void onChange(com.google.gwt.event.dom.client.ChangeEvent event) {
        owner.onColumnSelected((com.google.gwt.event.dom.client.ChangeEvent) event);
      }
    };

    final com.google.gwt.event.dom.client.ChangeHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ChangeHandler() {
      public void onChange(com.google.gwt.event.dom.client.ChangeEvent event) {
        owner.onFunctionSelected((com.google.gwt.event.dom.client.ChangeEvent) event);
      }
    };

    public Widgets(final org.dashbuilder.displayer.client.widgets.group.ColumnFunctionEditorView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.dashbuilder.displayer.client.widgets.group.ColumnFunctionEditorView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.dashbuilder.displayer.client.widgets.group.ColumnFunctionEditorView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.dashbuilder.displayer.client.widgets.group.ColumnFunctionEditorView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.dashbuilder.displayer.client.widgets.group.ColumnFunctionEditorView_BinderImpl_GenBundle) GWT.create(org.dashbuilder.displayer.client.widgets.group.ColumnFunctionEditorView_BinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 1 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.dashbuilder.displayer.client.widgets.group.ColumnFunctionEditorView_BinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private org.dashbuilder.displayer.client.widgets.group.ColumnFunctionEditorView_BinderImpl_GenCss_style build_style() {
      // Creation section.
      final org.dashbuilder.displayer.client.widgets.group.ColumnFunctionEditorView_BinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();

      return style;
    }

    /**
     * Getter for f_VerticalPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.VerticalPanel get_f_VerticalPanel1() {
      return build_f_VerticalPanel1();
    }
    private com.google.gwt.user.client.ui.VerticalPanel build_f_VerticalPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel1 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
      // Setup section.
      f_VerticalPanel1.add(get_f_HorizontalPanel2());
      f_VerticalPanel1.add(get_columnDetailsPanel());

      return f_VerticalPanel1;
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
      f_HorizontalPanel2.add(get_columnListBox());
      f_HorizontalPanel2.add(get_functionListBox());
      f_HorizontalPanel2.add(get_columnDeleteIcon());
      f_HorizontalPanel2.add(get_columnExpandIcon());

      return f_HorizontalPanel2;
    }

    /**
     * Getter for columnListBox called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.ListBox get_columnListBox() {
      return build_columnListBox();
    }
    private org.gwtbootstrap3.client.ui.ListBox build_columnListBox() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListBox columnListBox = (org.gwtbootstrap3.client.ui.ListBox) GWT.create(org.gwtbootstrap3.client.ui.ListBox.class);
      // Setup section.
      columnListBox.setWidth("120px");
      columnListBox.addChangeHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

      this.owner.columnListBox = columnListBox;

      return columnListBox;
    }

    /**
     * Getter for functionListBox called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.ListBox get_functionListBox() {
      return build_functionListBox();
    }
    private org.gwtbootstrap3.client.ui.ListBox build_functionListBox() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListBox functionListBox = (org.gwtbootstrap3.client.ui.ListBox) GWT.create(org.gwtbootstrap3.client.ui.ListBox.class);
      // Setup section.
      functionListBox.setWidth("80px");
      functionListBox.addChangeHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

      this.owner.functionListBox = functionListBox;

      return functionListBox;
    }

    /**
     * Getter for columnDeleteIcon called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Icon get_columnDeleteIcon() {
      return build_columnDeleteIcon();
    }
    private org.gwtbootstrap3.client.ui.Icon build_columnDeleteIcon() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Icon columnDeleteIcon = new org.gwtbootstrap3.client.ui.Icon(org.gwtbootstrap3.client.ui.constants.IconType.REMOVE);
      // Setup section.
      columnDeleteIcon.setVisible(false);
      columnDeleteIcon.setSize(org.gwtbootstrap3.client.ui.constants.IconSize.LARGE);

      this.owner.columnDeleteIcon = columnDeleteIcon;

      return columnDeleteIcon;
    }

    /**
     * Getter for columnExpandIcon called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Icon get_columnExpandIcon() {
      return build_columnExpandIcon();
    }
    private org.gwtbootstrap3.client.ui.Icon build_columnExpandIcon() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Icon columnExpandIcon = new org.gwtbootstrap3.client.ui.Icon(org.gwtbootstrap3.client.ui.constants.IconType.ARROW_DOWN);
      // Setup section.
      columnExpandIcon.setVisible(false);
      columnExpandIcon.setSize(org.gwtbootstrap3.client.ui.constants.IconSize.LARGE);

      this.owner.columnExpandIcon = columnExpandIcon;

      return columnExpandIcon;
    }

    /**
     * Getter for columnDetailsPanel called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_columnDetailsPanel() {
      return build_columnDetailsPanel();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_columnDetailsPanel() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel columnDetailsPanel = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      columnDetailsPanel.add(get_columnDetailsEditor());
      columnDetailsPanel.setStyleName("" + get_style().columnDetailsPanel() + "");
      columnDetailsPanel.setVisible(false);

      this.owner.columnDetailsPanel = columnDetailsPanel;

      return columnDetailsPanel;
    }

    /**
     * Getter for columnDetailsEditor called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.dashbuilder.displayer.client.widgets.group.ColumnDetailsEditor get_columnDetailsEditor() {
      return build_columnDetailsEditor();
    }
    private org.dashbuilder.displayer.client.widgets.group.ColumnDetailsEditor build_columnDetailsEditor() {
      // Creation section.
      final org.dashbuilder.displayer.client.widgets.group.ColumnDetailsEditor columnDetailsEditor = owner.columnDetailsEditor;
      assert columnDetailsEditor != null : "UiField columnDetailsEditor with 'provided = true' was null";
      // Setup section.

      return columnDetailsEditor;
    }
  }
}
