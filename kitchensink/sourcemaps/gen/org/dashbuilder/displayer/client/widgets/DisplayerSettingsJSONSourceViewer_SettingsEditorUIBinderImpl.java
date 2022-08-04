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

public class DisplayerSettingsJSONSourceViewer_SettingsEditorUIBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.dashbuilder.displayer.client.widgets.DisplayerSettingsJSONSourceViewer>, org.dashbuilder.displayer.client.widgets.DisplayerSettingsJSONSourceViewer.SettingsEditorUIBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<div class='well'> <span id='{0}'></span> </div>")
    SafeHtml html1(String arg0);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.dashbuilder.displayer.client.widgets.DisplayerSettingsJSONSourceViewer owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.dashbuilder.displayer.client.widgets.DisplayerSettingsJSONSourceViewer owner;


    public Widgets(final org.dashbuilder.displayer.client.widgets.DisplayerSettingsJSONSourceViewer owner) {
      this.owner = owner;
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1(get_domId0());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.dashbuilder.displayer.client.widgets.DisplayerSettingsJSONSourceViewer_SettingsEditorUIBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.dashbuilder.displayer.client.widgets.DisplayerSettingsJSONSourceViewer_SettingsEditorUIBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.dashbuilder.displayer.client.widgets.DisplayerSettingsJSONSourceViewer_SettingsEditorUIBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.dashbuilder.displayer.client.widgets.DisplayerSettingsJSONSourceViewer_SettingsEditorUIBinderImpl_GenBundle) GWT.create(org.dashbuilder.displayer.client.widgets.DisplayerSettingsJSONSourceViewer_SettingsEditorUIBinderImpl_GenBundle.class);
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
     * Getter for f_HTMLPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel1() {
      return build_f_HTMLPanel1();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template_html1().asString());
      // Setup section.
      f_HTMLPanel1.setWidth("95%");

      {
        // Attach section.
        UiBinderUtil.TempAttachment __attachRecord__ = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());

        get_domId0Element().get();

        // Detach section.
        __attachRecord__.detach();
      }
      f_HTMLPanel1.addAndReplaceElement(get_f_FieldSet2(), get_domId0Element().get());

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
     * Getter for f_FieldSet2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.FieldSet get_f_FieldSet2() {
      return build_f_FieldSet2();
    }
    private org.gwtbootstrap3.client.ui.FieldSet build_f_FieldSet2() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FieldSet f_FieldSet2 = (org.gwtbootstrap3.client.ui.FieldSet) GWT.create(org.gwtbootstrap3.client.ui.FieldSet.class);
      // Setup section.
      f_FieldSet2.add(get_f_Heading3());
      f_FieldSet2.add(get_jsonSourceViewer());

      return f_FieldSet2;
    }

    /**
     * Getter for f_Heading3 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading3() {
      return build_f_Heading3();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading3() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading3 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading3.setText("" + get_i18n().settingsJsonSource_caption() + "");

      return f_Heading3;
    }

    /**
     * Getter for jsonSourceViewer called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.dashbuilder.common.client.JsonSourceViewer get_jsonSourceViewer() {
      return build_jsonSourceViewer();
    }
    private org.dashbuilder.common.client.JsonSourceViewer build_jsonSourceViewer() {
      // Creation section.
      final org.dashbuilder.common.client.JsonSourceViewer jsonSourceViewer = (org.dashbuilder.common.client.JsonSourceViewer) GWT.create(org.dashbuilder.common.client.JsonSourceViewer.class);
      // Setup section.

      this.owner.jsonSourceViewer = jsonSourceViewer;

      return jsonSourceViewer;
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
  }
}
