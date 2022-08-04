// .ui.xml template last modified: 1657649691864
package org.dashbuilder.common.client.editor;

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

public class ValueBoxEditorView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.dashbuilder.common.client.editor.ValueBoxEditorView>, org.dashbuilder.common.client.editor.ValueBoxEditorView.Binder {

  interface Template extends SafeHtmlTemplates {
    @Template("<span id='{0}'></span>")
    SafeHtml html1(String arg0);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.dashbuilder.common.client.editor.ValueBoxEditorView owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.dashbuilder.common.client.editor.ValueBoxEditorView owner;


    public Widgets(final org.dashbuilder.common.client.editor.ValueBoxEditorView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1(get_domId0());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.dashbuilder.common.client.editor.ValueBoxEditorView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.dashbuilder.common.client.editor.ValueBoxEditorView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.dashbuilder.common.client.editor.ValueBoxEditorView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.dashbuilder.common.client.editor.ValueBoxEditorView_BinderImpl_GenBundle) GWT.create(org.dashbuilder.common.client.editor.ValueBoxEditorView_BinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 1 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.dashbuilder.common.client.editor.ValueBoxEditorView_BinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private org.dashbuilder.common.client.editor.ValueBoxEditorView_BinderImpl_GenCss_style build_style() {
      // Creation section.
      final org.dashbuilder.common.client.editor.ValueBoxEditorView_BinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
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

        // Detach section.
        __attachRecord__.detach();
      }
      f_HTMLPanel1.addAndReplaceElement(get_errorTooltip(), get_domId0Element().get());

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
     * Getter for errorTooltip called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.Tooltip get_errorTooltip() {
      return build_errorTooltip();
    }
    private org.gwtbootstrap3.client.ui.Tooltip build_errorTooltip() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Tooltip errorTooltip = (org.gwtbootstrap3.client.ui.Tooltip) GWT.create(org.gwtbootstrap3.client.ui.Tooltip.class);
      // Setup section.
      errorTooltip.add(get_contents());
      errorTooltip.setContainer("body");
      errorTooltip.setTitle("");

      this.owner.errorTooltip = errorTooltip;

      return errorTooltip;
    }

    /**
     * Getter for contents called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.SimplePanel get_contents() {
      return build_contents();
    }
    private com.google.gwt.user.client.ui.SimplePanel build_contents() {
      // Creation section.
      final com.google.gwt.user.client.ui.SimplePanel contents = (com.google.gwt.user.client.ui.SimplePanel) GWT.create(com.google.gwt.user.client.ui.SimplePanel.class);
      // Setup section.
      contents.setStylePrimaryName("" + get_style().contents() + "");

      this.owner.contents = contents;

      return contents;
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
