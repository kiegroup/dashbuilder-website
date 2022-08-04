// .ui.xml template last modified: 1657649695426
package org.dashbuilder.displayer.client.widgets.filter;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class TimeAmountEditorView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.dashbuilder.displayer.client.widgets.filter.TimeAmountEditorView>, org.dashbuilder.displayer.client.widgets.filter.TimeAmountEditorView.Binder {


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.dashbuilder.displayer.client.widgets.filter.TimeAmountEditorView owner) {


    return new Widgets(owner).get_f_HorizontalPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.dashbuilder.displayer.client.widgets.filter.TimeAmountEditorView owner;


    final com.google.gwt.event.dom.client.ChangeHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ChangeHandler() {
      public void onChange(com.google.gwt.event.dom.client.ChangeEvent event) {
        owner.onFilterSelected((com.google.gwt.event.dom.client.ChangeEvent) event);
      }
    };

    public Widgets(final org.dashbuilder.displayer.client.widgets.filter.TimeAmountEditorView owner) {
      this.owner = owner;
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.dashbuilder.displayer.client.widgets.filter.TimeAmountEditorView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.dashbuilder.displayer.client.widgets.filter.TimeAmountEditorView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.dashbuilder.displayer.client.widgets.filter.TimeAmountEditorView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.dashbuilder.displayer.client.widgets.filter.TimeAmountEditorView_BinderImpl_GenBundle) GWT.create(org.dashbuilder.displayer.client.widgets.filter.TimeAmountEditorView_BinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for f_HorizontalPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel1() {
      return build_f_HorizontalPanel1();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel1 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel1.add(get_f_InputGroup2());
      f_HorizontalPanel1.add(get_typeList());

      return f_HorizontalPanel1;
    }

    /**
     * Getter for f_InputGroup2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.InputGroup get_f_InputGroup2() {
      return build_f_InputGroup2();
    }
    private org.gwtbootstrap3.client.ui.InputGroup build_f_InputGroup2() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.InputGroup f_InputGroup2 = (org.gwtbootstrap3.client.ui.InputGroup) GWT.create(org.gwtbootstrap3.client.ui.InputGroup.class);
      // Setup section.
      f_InputGroup2.add(get_minusIcon());
      f_InputGroup2.add(get_input());
      f_InputGroup2.add(get_plusIcon());

      return f_InputGroup2;
    }

    /**
     * Getter for minusIcon called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.InputGroupAddon get_minusIcon() {
      return build_minusIcon();
    }
    private org.gwtbootstrap3.client.ui.InputGroupAddon build_minusIcon() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.InputGroupAddon minusIcon = (org.gwtbootstrap3.client.ui.InputGroupAddon) GWT.create(org.gwtbootstrap3.client.ui.InputGroupAddon.class);
      // Setup section.
      minusIcon.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.MINUS);

      this.owner.minusIcon = minusIcon;

      return minusIcon;
    }

    /**
     * Getter for input called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.uberfire.ext.widgets.common.client.common.NumericLongTextBox get_input() {
      return build_input();
    }
    private org.uberfire.ext.widgets.common.client.common.NumericLongTextBox build_input() {
      // Creation section.
      final org.uberfire.ext.widgets.common.client.common.NumericLongTextBox input = (org.uberfire.ext.widgets.common.client.common.NumericLongTextBox) GWT.create(org.uberfire.ext.widgets.common.client.common.NumericLongTextBox.class);
      // Setup section.
      input.setWidth("32px");

      this.owner.input = input;

      return input;
    }

    /**
     * Getter for plusIcon called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.InputGroupAddon get_plusIcon() {
      return build_plusIcon();
    }
    private org.gwtbootstrap3.client.ui.InputGroupAddon build_plusIcon() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.InputGroupAddon plusIcon = (org.gwtbootstrap3.client.ui.InputGroupAddon) GWT.create(org.gwtbootstrap3.client.ui.InputGroupAddon.class);
      // Setup section.
      plusIcon.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.PLUS);

      this.owner.plusIcon = plusIcon;

      return plusIcon;
    }

    /**
     * Getter for typeList called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.ListBox get_typeList() {
      return build_typeList();
    }
    private org.gwtbootstrap3.client.ui.ListBox build_typeList() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListBox typeList = (org.gwtbootstrap3.client.ui.ListBox) GWT.create(org.gwtbootstrap3.client.ui.ListBox.class);
      // Setup section.
      typeList.setWidth("100px");
      typeList.addChangeHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

      this.owner.typeList = typeList;

      return typeList;
    }
  }
}
