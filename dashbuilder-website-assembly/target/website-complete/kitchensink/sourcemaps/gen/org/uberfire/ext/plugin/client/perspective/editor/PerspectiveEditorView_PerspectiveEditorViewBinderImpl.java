// .ui.xml template last modified: 1657649687133
package org.uberfire.ext.plugin.client.perspective.editor;

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

public class PerspectiveEditorView_PerspectiveEditorViewBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorView>, org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorView.PerspectiveEditorViewBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<span id='{0}'></span>")
    SafeHtml html1(String arg0);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorView owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorView owner;


    public Widgets(final org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorView owner) {
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
    private org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorView_PerspectiveEditorViewBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorView_PerspectiveEditorViewBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorView_PerspectiveEditorViewBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorView_PerspectiveEditorViewBinderImpl_GenBundle) GWT.create(org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorView_PerspectiveEditorViewBinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 2 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorView_PerspectiveEditorViewBinderImpl_GenCss_style style;
    private org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorView_PerspectiveEditorViewBinderImpl_GenCss_style get_style() {
      return style;
    }
    private org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorView_PerspectiveEditorViewBinderImpl_GenCss_style build_style() {
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
      f_HTMLPanel1.addStyleName("" + get_style().content() + "");

      {
        // Attach section.
        UiBinderUtil.TempAttachment __attachRecord__ = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());

        get_domId0Element().get();

        // Detach section.
        __attachRecord__.detach();
      }
      f_HTMLPanel1.addAndReplaceElement(get_layoutEditor(), get_domId0Element().get());

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
     * Getter for layoutEditor called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_layoutEditor() {
      return build_layoutEditor();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_layoutEditor() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel layoutEditor = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      layoutEditor.addStyleName("" + get_style().layout() + "");

      this.owner.layoutEditor = layoutEditor;

      return layoutEditor;
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
