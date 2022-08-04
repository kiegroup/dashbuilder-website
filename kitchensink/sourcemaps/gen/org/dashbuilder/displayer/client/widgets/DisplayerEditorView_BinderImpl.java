// .ui.xml template last modified: 1657649695426
package org.dashbuilder.displayer.client.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeUri;
import com.google.gwt.safehtml.shared.UriUtils;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class DisplayerEditorView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.dashbuilder.displayer.client.widgets.DisplayerEditorView>, org.dashbuilder.displayer.client.widgets.DisplayerEditorView.Binder {

  interface Template extends SafeHtmlTemplates {
    @Template("<span id='{0}'></span>  <span id='{1}'></span>")
    SafeHtml html1(String arg0, String arg1);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.dashbuilder.displayer.client.widgets.DisplayerEditorView owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.dashbuilder.displayer.client.widgets.DisplayerEditorView owner;


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onTypeSelected((com.google.gwt.event.dom.client.ClickEvent) event);
      }
    };

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onDataSelected((com.google.gwt.event.dom.client.ClickEvent) event);
      }
    };

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onSettingsSelected((com.google.gwt.event.dom.client.ClickEvent) event);
      }
    };

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onExternalComponentSettingsSelected((com.google.gwt.event.dom.client.ClickEvent) event);
      }
    };

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames5 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onRawTableChecked((com.google.gwt.event.dom.client.ClickEvent) event);
      }
    };

    public Widgets(final org.dashbuilder.displayer.client.widgets.DisplayerEditorView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_i18n();  // more than one getter call detected. Type: IMPORTED, precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1(get_domId0(), get_domId1());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.dashbuilder.displayer.client.widgets.DisplayerEditorView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.dashbuilder.displayer.client.widgets.DisplayerEditorView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.dashbuilder.displayer.client.widgets.DisplayerEditorView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.dashbuilder.displayer.client.widgets.DisplayerEditorView_BinderImpl_GenBundle) GWT.create(org.dashbuilder.displayer.client.widgets.DisplayerEditorView_BinderImpl_GenBundle.class);
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
     * Getter for style called 5 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.dashbuilder.displayer.client.widgets.DisplayerEditorView_BinderImpl_GenCss_style style;
    private org.dashbuilder.displayer.client.widgets.DisplayerEditorView_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private org.dashbuilder.displayer.client.widgets.DisplayerEditorView_BinderImpl_GenCss_style build_style() {
      // Creation section.
      style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();

      return style;
    }

    /**
     * Getter for f_HTMLPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel1() {
      return build_f_HTMLPanel1();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template_html1().asString());
      // Setup section.

      {
        // Attach section.
        UiBinderUtil.TempAttachment __attachRecord__ = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());

        get_domId0Element().get();
        get_domId1Element().get();

        // Detach section.
        __attachRecord__.detach();
      }
      f_HTMLPanel1.addAndReplaceElement(get_f_NavTabs2(), get_domId0Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_Container3(), get_domId1Element().get());

      return f_HTMLPanel1;
    }

    /**
     * Getter for domId0 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId0;
    private java.lang.String get_domId0() {
      return domId0;
    }
    private java.lang.String build_domId0() {
      // Creation section.
      domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId0;
    }

    /**
     * Getter for f_NavTabs2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.NavTabs get_f_NavTabs2() {
      return build_f_NavTabs2();
    }
    private org.gwtbootstrap3.client.ui.NavTabs build_f_NavTabs2() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavTabs f_NavTabs2 = (org.gwtbootstrap3.client.ui.NavTabs) GWT.create(org.gwtbootstrap3.client.ui.NavTabs.class);
      // Setup section.
      f_NavTabs2.add(get_optionType());
      f_NavTabs2.add(get_optionData());
      f_NavTabs2.add(get_optionSettings());
      f_NavTabs2.add(get_optionComponentSettings());

      return f_NavTabs2;
    }

    /**
     * Getter for optionType called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.TabListItem get_optionType() {
      return build_optionType();
    }
    private org.gwtbootstrap3.client.ui.TabListItem build_optionType() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabListItem optionType = (org.gwtbootstrap3.client.ui.TabListItem) GWT.create(org.gwtbootstrap3.client.ui.TabListItem.class);
      // Setup section.
      optionType.setText("" + get_i18n().displayer_editor_tab_type() + "");
      optionType.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

      this.owner.optionType = optionType;

      return optionType;
    }

    /**
     * Getter for optionData called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.TabListItem get_optionData() {
      return build_optionData();
    }
    private org.gwtbootstrap3.client.ui.TabListItem build_optionData() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabListItem optionData = (org.gwtbootstrap3.client.ui.TabListItem) GWT.create(org.gwtbootstrap3.client.ui.TabListItem.class);
      // Setup section.
      optionData.setText("" + get_i18n().displayer_editor_tab_data() + "");
      optionData.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

      this.owner.optionData = optionData;

      return optionData;
    }

    /**
     * Getter for optionSettings called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.TabListItem get_optionSettings() {
      return build_optionSettings();
    }
    private org.gwtbootstrap3.client.ui.TabListItem build_optionSettings() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabListItem optionSettings = (org.gwtbootstrap3.client.ui.TabListItem) GWT.create(org.gwtbootstrap3.client.ui.TabListItem.class);
      // Setup section.
      optionSettings.setText("" + get_i18n().displayer_editor_tab_display() + "");
      optionSettings.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3);

      this.owner.optionSettings = optionSettings;

      return optionSettings;
    }

    /**
     * Getter for optionComponentSettings called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.TabListItem get_optionComponentSettings() {
      return build_optionComponentSettings();
    }
    private org.gwtbootstrap3.client.ui.TabListItem build_optionComponentSettings() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabListItem optionComponentSettings = (org.gwtbootstrap3.client.ui.TabListItem) GWT.create(org.gwtbootstrap3.client.ui.TabListItem.class);
      // Setup section.
      optionComponentSettings.setText("" + get_i18n().componentEditor() + "");
      optionComponentSettings.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4);

      this.owner.optionComponentSettings = optionComponentSettings;

      return optionComponentSettings;
    }

    /**
     * Getter for domId0Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId0Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId0Element() {
      return domId0Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId0Element() {
      // Creation section.
      domId0Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId0());
      // Setup section.

      return domId0Element;
    }

    /**
     * Getter for domId1 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId1;
    private java.lang.String get_domId1() {
      return domId1;
    }
    private java.lang.String build_domId1() {
      // Creation section.
      domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId1;
    }

    /**
     * Getter for f_Container3 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.Container get_f_Container3() {
      return build_f_Container3();
    }
    private org.gwtbootstrap3.client.ui.Container build_f_Container3() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Container f_Container3 = (org.gwtbootstrap3.client.ui.Container) GWT.create(org.gwtbootstrap3.client.ui.Container.class);
      // Setup section.
      f_Container3.add(get_f_Row4());
      f_Container3.addStyleName("" + get_style().mainContainer() + "");
      f_Container3.setFluid(true);

      return f_Container3;
    }

    /**
     * Getter for f_Row4 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row4() {
      return build_f_Row4();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row4() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row4 = (org.gwtbootstrap3.client.ui.Row) GWT.create(org.gwtbootstrap3.client.ui.Row.class);
      // Setup section.
      f_Row4.add(get_westColumn());
      f_Row4.add(get_centerColumn());

      return f_Row4;
    }

    /**
     * Getter for westColumn called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.Column get_westColumn() {
      return build_westColumn();
    }
    private org.gwtbootstrap3.client.ui.Column build_westColumn() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column westColumn = new org.gwtbootstrap3.client.ui.Column("MD_3");
      // Setup section.
      westColumn.add(get_viewAsTableButtonRow());
      westColumn.add(get_f_Row6());

      this.owner.westColumn = westColumn;

      return westColumn;
    }

    /**
     * Getter for viewAsTableButtonRow called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Row get_viewAsTableButtonRow() {
      return build_viewAsTableButtonRow();
    }
    private org.gwtbootstrap3.client.ui.Row build_viewAsTableButtonRow() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row viewAsTableButtonRow = (org.gwtbootstrap3.client.ui.Row) GWT.create(org.gwtbootstrap3.client.ui.Row.class);
      // Setup section.
      viewAsTableButtonRow.add(get_f_Column5());
      viewAsTableButtonRow.addStyleName("" + get_style().viewAsTableButtonRow() + "");
      viewAsTableButtonRow.setVisible(false);

      this.owner.viewAsTableButtonRow = viewAsTableButtonRow;

      return viewAsTableButtonRow;
    }

    /**
     * Getter for f_Column5 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column5() {
      return build_f_Column5();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column5() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column5 = new org.gwtbootstrap3.client.ui.Column("MD_12");
      // Setup section.
      f_Column5.add(get_viewAsTableButton());

      return f_Column5;
    }

    /**
     * Getter for viewAsTableButton called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.CheckBox get_viewAsTableButton() {
      return build_viewAsTableButton();
    }
    private org.gwtbootstrap3.client.ui.CheckBox build_viewAsTableButton() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.CheckBox viewAsTableButton = (org.gwtbootstrap3.client.ui.CheckBox) GWT.create(org.gwtbootstrap3.client.ui.CheckBox.class);
      // Setup section.
      viewAsTableButton.addStyleName("" + get_style().viewAsTableButton() + "");
      viewAsTableButton.setText("" + get_i18n().displayer_editor_view_as_table() + "");
      viewAsTableButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames5);

      this.owner.viewAsTableButton = viewAsTableButton;

      return viewAsTableButton;
    }

    /**
     * Getter for f_Row6 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row6() {
      return build_f_Row6();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row6() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row6 = (org.gwtbootstrap3.client.ui.Row) GWT.create(org.gwtbootstrap3.client.ui.Row.class);
      // Setup section.
      f_Row6.add(get_leftColumn());

      return f_Row6;
    }

    /**
     * Getter for leftColumn called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_leftColumn() {
      return build_leftColumn();
    }
    private org.gwtbootstrap3.client.ui.Column build_leftColumn() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column leftColumn = new org.gwtbootstrap3.client.ui.Column("MD_12");
      // Setup section.
      leftColumn.addStyleName("" + get_style().leftColumn() + "");

      this.owner.leftColumn = leftColumn;

      return leftColumn;
    }

    /**
     * Getter for centerColumn called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.Column get_centerColumn() {
      return build_centerColumn();
    }
    private org.gwtbootstrap3.client.ui.Column build_centerColumn() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column centerColumn = new org.gwtbootstrap3.client.ui.Column("MD_9");
      // Setup section.
      centerColumn.addStyleName("" + get_style().centerColumn() + "");

      this.owner.centerColumn = centerColumn;

      return centerColumn;
    }

    /**
     * Getter for domId1Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId1Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId1Element() {
      return domId1Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId1Element() {
      // Creation section.
      domId1Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId1());
      // Setup section.

      return domId1Element;
    }
  }
}
