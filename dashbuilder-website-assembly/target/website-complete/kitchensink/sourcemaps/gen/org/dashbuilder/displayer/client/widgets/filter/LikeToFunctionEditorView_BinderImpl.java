// .ui.xml template last modified: 1657649695426
package org.dashbuilder.displayer.client.widgets.filter;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class LikeToFunctionEditorView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.dashbuilder.displayer.client.widgets.filter.LikeToFunctionEditorView>, org.dashbuilder.displayer.client.widgets.filter.LikeToFunctionEditorView.Binder {


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.dashbuilder.displayer.client.widgets.filter.LikeToFunctionEditorView owner) {


    return new Widgets(owner).get_form();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.dashbuilder.displayer.client.widgets.filter.LikeToFunctionEditorView owner;


    final com.google.gwt.event.dom.client.ChangeHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ChangeHandler() {
      public void onChange(com.google.gwt.event.dom.client.ChangeEvent event) {
        owner.onPatternChanged((com.google.gwt.event.dom.client.ChangeEvent) event);
      }
    };

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onCaseChanged((com.google.gwt.event.dom.client.ClickEvent) event);
      }
    };

    public Widgets(final org.dashbuilder.displayer.client.widgets.filter.LikeToFunctionEditorView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_i18n();  // more than one getter call detected. Type: IMPORTED, precedence: 1
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.dashbuilder.displayer.client.widgets.filter.LikeToFunctionEditorView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.dashbuilder.displayer.client.widgets.filter.LikeToFunctionEditorView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.dashbuilder.displayer.client.widgets.filter.LikeToFunctionEditorView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.dashbuilder.displayer.client.widgets.filter.LikeToFunctionEditorView_BinderImpl_GenBundle) GWT.create(org.dashbuilder.displayer.client.widgets.filter.LikeToFunctionEditorView_BinderImpl_GenBundle.class);
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
     * Getter for style called 2 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.dashbuilder.displayer.client.widgets.filter.LikeToFunctionEditorView_BinderImpl_GenCss_style style;
    private org.dashbuilder.displayer.client.widgets.filter.LikeToFunctionEditorView_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private org.dashbuilder.displayer.client.widgets.filter.LikeToFunctionEditorView_BinderImpl_GenCss_style build_style() {
      // Creation section.
      style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();

      return style;
    }

    /**
     * Getter for form called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private org.gwtbootstrap3.client.ui.FormGroup get_form() {
      return build_form();
    }
    private org.gwtbootstrap3.client.ui.FormGroup build_form() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormGroup form = (org.gwtbootstrap3.client.ui.FormGroup) GWT.create(org.gwtbootstrap3.client.ui.FormGroup.class);
      // Setup section.
      form.add(get_f_HorizontalPanel1());
      form.add(get_f_HorizontalPanel4());
      form.setValidationState(org.gwtbootstrap3.client.ui.constants.ValidationState.NONE);

      this.owner.form = form;

      return form;
    }

    /**
     * Getter for f_HorizontalPanel1 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel1() {
      return build_f_HorizontalPanel1();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel1 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel1.add(get_searchPatternTextBox());
      f_HorizontalPanel1.add(get_f_Tooltip2());

      return f_HorizontalPanel1;
    }

    /**
     * Getter for searchPatternTextBox called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.TextBox get_searchPatternTextBox() {
      return build_searchPatternTextBox();
    }
    private org.gwtbootstrap3.client.ui.TextBox build_searchPatternTextBox() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TextBox searchPatternTextBox = (org.gwtbootstrap3.client.ui.TextBox) GWT.create(org.gwtbootstrap3.client.ui.TextBox.class);
      // Setup section.
      searchPatternTextBox.addChangeHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

      this.owner.searchPatternTextBox = searchPatternTextBox;

      return searchPatternTextBox;
    }

    /**
     * Getter for f_Tooltip2 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Tooltip get_f_Tooltip2() {
      return build_f_Tooltip2();
    }
    private org.gwtbootstrap3.client.ui.Tooltip build_f_Tooltip2() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Tooltip f_Tooltip2 = (org.gwtbootstrap3.client.ui.Tooltip) GWT.create(org.gwtbootstrap3.client.ui.Tooltip.class);
      // Setup section.
      f_Tooltip2.add(get_f_Icon3());
      f_Tooltip2.setPlacement(org.gwtbootstrap3.client.ui.constants.Placement.RIGHT);
      f_Tooltip2.setTitle("" + get_i18n().like_to_pattern_instructions() + "");
      f_Tooltip2.setIsAnimated(true);

      return f_Tooltip2;
    }

    /**
     * Getter for f_Icon3 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.Icon get_f_Icon3() {
      return build_f_Icon3();
    }
    private org.gwtbootstrap3.client.ui.Icon build_f_Icon3() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Icon f_Icon3 = new org.gwtbootstrap3.client.ui.Icon(org.gwtbootstrap3.client.ui.constants.IconType.QUESTION_CIRCLE);
      // Setup section.

      return f_Icon3;
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
      f_HorizontalPanel4.add(get_caseSensitiveCheckbox());
      f_HorizontalPanel4.add(get_f_Label5());

      return f_HorizontalPanel4;
    }

    /**
     * Getter for caseSensitiveCheckbox called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.CheckBox get_caseSensitiveCheckbox() {
      return build_caseSensitiveCheckbox();
    }
    private org.gwtbootstrap3.client.ui.CheckBox build_caseSensitiveCheckbox() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.CheckBox caseSensitiveCheckbox = (org.gwtbootstrap3.client.ui.CheckBox) GWT.create(org.gwtbootstrap3.client.ui.CheckBox.class);
      // Setup section.
      caseSensitiveCheckbox.setStyleName("" + get_style().checkBox() + "");
      caseSensitiveCheckbox.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

      this.owner.caseSensitiveCheckbox = caseSensitiveCheckbox;

      return caseSensitiveCheckbox;
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
      f_Label5.setText("" + get_i18n().case_sensitive() + "");

      return f_Label5;
    }
  }
}
