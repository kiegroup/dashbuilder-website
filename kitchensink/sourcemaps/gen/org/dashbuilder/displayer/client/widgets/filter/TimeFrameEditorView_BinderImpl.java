// .ui.xml template last modified: 1657649695426
package org.dashbuilder.displayer.client.widgets.filter;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class TimeFrameEditorView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.dashbuilder.displayer.client.widgets.filter.TimeFrameEditorView>, org.dashbuilder.displayer.client.widgets.filter.TimeFrameEditorView.Binder {


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.dashbuilder.displayer.client.widgets.filter.TimeFrameEditorView owner) {


    return new Widgets(owner).get_f_VerticalPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.dashbuilder.displayer.client.widgets.filter.TimeFrameEditorView owner;


    final com.google.gwt.event.dom.client.ChangeHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ChangeHandler() {
      public void onChange(com.google.gwt.event.dom.client.ChangeEvent event) {
        owner.onFirstMonthSelected((com.google.gwt.event.dom.client.ChangeEvent) event);
      }
    };

    public Widgets(final org.dashbuilder.displayer.client.widgets.filter.TimeFrameEditorView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_i18n();  // more than one getter call detected. Type: IMPORTED, precedence: 1
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.dashbuilder.displayer.client.widgets.filter.TimeFrameEditorView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.dashbuilder.displayer.client.widgets.filter.TimeFrameEditorView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.dashbuilder.displayer.client.widgets.filter.TimeFrameEditorView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.dashbuilder.displayer.client.widgets.filter.TimeFrameEditorView_BinderImpl_GenBundle) GWT.create(org.dashbuilder.displayer.client.widgets.filter.TimeFrameEditorView_BinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for i18n called 3 times. Type: IMPORTED. Build precedence: 1.
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
     * Getter for style called 3 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.dashbuilder.displayer.client.widgets.filter.TimeFrameEditorView_BinderImpl_GenCss_style style;
    private org.dashbuilder.displayer.client.widgets.filter.TimeFrameEditorView_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private org.dashbuilder.displayer.client.widgets.filter.TimeFrameEditorView_BinderImpl_GenCss_style build_style() {
      // Creation section.
      style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
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
      f_VerticalPanel1.add(get_f_Label2());
      f_VerticalPanel1.add(get_fromEditor());
      f_VerticalPanel1.add(get_f_Label3());
      f_VerticalPanel1.add(get_toEditor());
      f_VerticalPanel1.add(get_firstMonthLabel());
      f_VerticalPanel1.add(get_firstMonthList());

      return f_VerticalPanel1;
    }

    /**
     * Getter for f_Label2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label2() {
      return build_f_Label2();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label2() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label2 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label2.setStyleName("" + get_style().labelFont() + "");
      f_Label2.setText("" + get_i18n().timeframe_from() + "");

      return f_Label2;
    }

    /**
     * Getter for fromEditor called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.dashbuilder.displayer.client.widgets.filter.TimeInstantEditor get_fromEditor() {
      return build_fromEditor();
    }
    private org.dashbuilder.displayer.client.widgets.filter.TimeInstantEditor build_fromEditor() {
      // Creation section.
      final org.dashbuilder.displayer.client.widgets.filter.TimeInstantEditor fromEditor = owner.fromEditor;
      assert fromEditor != null : "UiField fromEditor with 'provided = true' was null";
      // Setup section.

      return fromEditor;
    }

    /**
     * Getter for f_Label3 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label3() {
      return build_f_Label3();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label3() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label3 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label3.setStyleName("" + get_style().labelFont() + "");
      f_Label3.setText("" + get_i18n().timeframe_to() + "");

      return f_Label3;
    }

    /**
     * Getter for toEditor called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.dashbuilder.displayer.client.widgets.filter.TimeInstantEditor get_toEditor() {
      return build_toEditor();
    }
    private org.dashbuilder.displayer.client.widgets.filter.TimeInstantEditor build_toEditor() {
      // Creation section.
      final org.dashbuilder.displayer.client.widgets.filter.TimeInstantEditor toEditor = owner.toEditor;
      assert toEditor != null : "UiField toEditor with 'provided = true' was null";
      // Setup section.

      return toEditor;
    }

    /**
     * Getter for firstMonthLabel called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Label get_firstMonthLabel() {
      return build_firstMonthLabel();
    }
    private com.google.gwt.user.client.ui.Label build_firstMonthLabel() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label firstMonthLabel = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      firstMonthLabel.setStyleName("" + get_style().labelFont() + "");
      firstMonthLabel.setVisible(false);
      firstMonthLabel.setText("" + get_i18n().timeframe_first_month_year() + "");

      this.owner.firstMonthLabel = firstMonthLabel;

      return firstMonthLabel;
    }

    /**
     * Getter for firstMonthList called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.ListBox get_firstMonthList() {
      return build_firstMonthList();
    }
    private org.gwtbootstrap3.client.ui.ListBox build_firstMonthList() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListBox firstMonthList = (org.gwtbootstrap3.client.ui.ListBox) GWT.create(org.gwtbootstrap3.client.ui.ListBox.class);
      // Setup section.
      firstMonthList.setVisible(false);
      firstMonthList.addChangeHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

      this.owner.firstMonthList = firstMonthList;

      return firstMonthList;
    }
  }
}
