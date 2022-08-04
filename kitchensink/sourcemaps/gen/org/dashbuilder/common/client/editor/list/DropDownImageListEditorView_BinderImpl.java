// .ui.xml template last modified: 1657649691864
package org.dashbuilder.common.client.editor.list;

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

public class DropDownImageListEditorView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.dashbuilder.common.client.editor.list.DropDownImageListEditorView>, org.dashbuilder.common.client.editor.list.DropDownImageListEditorView.Binder {

  interface Template extends SafeHtmlTemplates {
    @Template("<span id='{0}'></span>")
    SafeHtml html1(String arg0);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.dashbuilder.common.client.editor.list.DropDownImageListEditorView owner) {


    return new Widgets(owner).get_errorPanel();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.dashbuilder.common.client.editor.list.DropDownImageListEditorView owner;


    public Widgets(final org.dashbuilder.common.client.editor.list.DropDownImageListEditorView owner) {
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
    private org.dashbuilder.common.client.editor.list.DropDownImageListEditorView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.dashbuilder.common.client.editor.list.DropDownImageListEditorView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.dashbuilder.common.client.editor.list.DropDownImageListEditorView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.dashbuilder.common.client.editor.list.DropDownImageListEditorView_BinderImpl_GenBundle) GWT.create(org.dashbuilder.common.client.editor.list.DropDownImageListEditorView_BinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 2 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.dashbuilder.common.client.editor.list.DropDownImageListEditorView_BinderImpl_GenCss_style style;
    private org.dashbuilder.common.client.editor.list.DropDownImageListEditorView_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private org.dashbuilder.common.client.editor.list.DropDownImageListEditorView_BinderImpl_GenCss_style build_style() {
      // Creation section.
      style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();

      this.owner.style = style;

      return style;
    }

    /**
     * Getter for errorPanel called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_errorPanel() {
      return build_errorPanel();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_errorPanel() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel errorPanel = new com.google.gwt.user.client.ui.HTMLPanel(template_html1().asString());
      // Setup section.
      errorPanel.addStyleName("" + get_style().errorPanel() + "");

      {
        // Attach section.
        UiBinderUtil.TempAttachment __attachRecord__ = UiBinderUtil.attachToDom(errorPanel.getElement());

        get_domId0Element().get();

        // Detach section.
        __attachRecord__.detach();
      }
      errorPanel.addAndReplaceElement(get_errorTooltip(), get_domId0Element().get());

      this.owner.errorPanel = errorPanel;

      return errorPanel;
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
      errorTooltip.add(get_helpPanel());
      errorTooltip.setContainer("body");
      errorTooltip.setTitle("");

      this.owner.errorTooltip = errorTooltip;

      return errorTooltip;
    }

    /**
     * Getter for helpPanel called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_helpPanel() {
      return build_helpPanel();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_helpPanel() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel helpPanel = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      helpPanel.add(get_dropDown());

      this.owner.helpPanel = helpPanel;

      return helpPanel;
    }

    /**
     * Getter for dropDown called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.DropDown get_dropDown() {
      return build_dropDown();
    }
    private org.gwtbootstrap3.client.ui.DropDown build_dropDown() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.DropDown dropDown = (org.gwtbootstrap3.client.ui.DropDown) GWT.create(org.gwtbootstrap3.client.ui.DropDown.class);
      // Setup section.
      dropDown.add(get_dropDownAnchor());
      dropDown.add(get_dropDownMenu());
      dropDown.addStyleName("" + get_style().dropDown() + "");

      this.owner.dropDown = dropDown;

      return dropDown;
    }

    /**
     * Getter for dropDownAnchor called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Anchor get_dropDownAnchor() {
      return build_dropDownAnchor();
    }
    private org.gwtbootstrap3.client.ui.Anchor build_dropDownAnchor() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Anchor dropDownAnchor = (org.gwtbootstrap3.client.ui.Anchor) GWT.create(org.gwtbootstrap3.client.ui.Anchor.class);
      // Setup section.
      dropDownAnchor.setDataToggle(org.gwtbootstrap3.client.ui.constants.Toggle.DROPDOWN);

      this.owner.dropDownAnchor = dropDownAnchor;

      return dropDownAnchor;
    }

    /**
     * Getter for dropDownMenu called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.DropDownMenu get_dropDownMenu() {
      return build_dropDownMenu();
    }
    private org.gwtbootstrap3.client.ui.DropDownMenu build_dropDownMenu() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.DropDownMenu dropDownMenu = (org.gwtbootstrap3.client.ui.DropDownMenu) GWT.create(org.gwtbootstrap3.client.ui.DropDownMenu.class);
      // Setup section.

      this.owner.dropDownMenu = dropDownMenu;

      return dropDownMenu;
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
