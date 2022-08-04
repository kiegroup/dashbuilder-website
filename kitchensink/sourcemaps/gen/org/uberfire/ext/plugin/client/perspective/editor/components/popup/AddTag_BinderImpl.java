// .ui.xml template last modified: 1657649687133
package org.uberfire.ext.plugin.client.perspective.editor.components.popup;

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

public class AddTag_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.uberfire.ext.plugin.client.perspective.editor.components.popup.AddTag>, org.uberfire.ext.plugin.client.perspective.editor.components.popup.AddTag.Binder {

  interface Template extends SafeHtmlTemplates {
    @Template("" + "{0}" + "")
    SafeHtml html1(String arg0);
     
    @Template("" + "{0}" + "")
    SafeHtml html2(String arg0);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.uberfire.ext.plugin.client.perspective.editor.components.popup.AddTag owner) {


    return new Widgets(owner).get_f_Form1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.uberfire.ext.plugin.client.perspective.editor.components.popup.AddTag owner;


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.addTag((com.google.gwt.event.dom.client.ClickEvent) event);
      }
    };

    public Widgets(final org.uberfire.ext.plugin.client.perspective.editor.components.popup.AddTag owner) {
      this.owner = owner;
      build_i18n();  // more than one getter call detected. Type: IMPORTED, precedence: 1
    }

    SafeHtml template_html1() {
      return template.html1("" + get_i18n().TagName() + "");
    }
    SafeHtml template_html2() {
      return template.html2("" + get_i18n().TagLabel() + "");
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.uberfire.ext.plugin.client.perspective.editor.components.popup.AddTag_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.uberfire.ext.plugin.client.perspective.editor.components.popup.AddTag_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.uberfire.ext.plugin.client.perspective.editor.components.popup.AddTag_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.uberfire.ext.plugin.client.perspective.editor.components.popup.AddTag_BinderImpl_GenBundle) GWT.create(org.uberfire.ext.plugin.client.perspective.editor.components.popup.AddTag_BinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for i18n called 4 times. Type: IMPORTED. Build precedence: 1.
     */
    private org.uberfire.ext.plugin.client.resources.i18n.CommonConstants i18n;
    private org.uberfire.ext.plugin.client.resources.i18n.CommonConstants get_i18n() {
      return i18n;
    }
    private org.uberfire.ext.plugin.client.resources.i18n.CommonConstants build_i18n() {
      // Creation section.
      i18n = (org.uberfire.ext.plugin.client.resources.i18n.CommonConstants) GWT.create(org.uberfire.ext.plugin.client.resources.i18n.CommonConstants.class);
      // Setup section.

      return i18n;
    }

    /**
     * Getter for res called 0 times. Type: IMPORTED. Build precedence: 1.
     */
    private org.uberfire.ext.plugin.client.resources.WebAppResource get_res() {
      return build_res();
    }
    private org.uberfire.ext.plugin.client.resources.WebAppResource build_res() {
      // Creation section.
      final org.uberfire.ext.plugin.client.resources.WebAppResource res = (org.uberfire.ext.plugin.client.resources.WebAppResource) GWT.create(org.uberfire.ext.plugin.client.resources.WebAppResource.class);
      // Setup section.

      return res;
    }

    /**
     * Getter for f_Form1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private org.gwtbootstrap3.client.ui.Form get_f_Form1() {
      return build_f_Form1();
    }
    private org.gwtbootstrap3.client.ui.Form build_f_Form1() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Form f_Form1 = (org.gwtbootstrap3.client.ui.Form) GWT.create(org.gwtbootstrap3.client.ui.Form.class);
      // Setup section.
      f_Form1.add(get_tagControlGroup());
      f_Form1.add(get_f_FormGroup6());

      return f_Form1;
    }

    /**
     * Getter for tagControlGroup called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.FormGroup get_tagControlGroup() {
      return build_tagControlGroup();
    }
    private org.gwtbootstrap3.client.ui.FormGroup build_tagControlGroup() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormGroup tagControlGroup = (org.gwtbootstrap3.client.ui.FormGroup) GWT.create(org.gwtbootstrap3.client.ui.FormGroup.class);
      // Setup section.
      tagControlGroup.add(get_f_FlowPanel2());
      tagControlGroup.add(get_f_FlowPanel4());
      tagControlGroup.add(get_f_FlowPanel5());

      this.owner.tagControlGroup = tagControlGroup;

      return tagControlGroup;
    }

    /**
     * Getter for f_FlowPanel2 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel2() {
      return build_f_FlowPanel2();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel2() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel2 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel2.add(get_f_FormLabel3());
      f_FlowPanel2.add(get_tagInline());
      f_FlowPanel2.addStyleName("col-sm-3");

      return f_FlowPanel2;
    }

    /**
     * Getter for f_FormLabel3 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.FormLabel get_f_FormLabel3() {
      return build_f_FormLabel3();
    }
    private org.gwtbootstrap3.client.ui.FormLabel build_f_FormLabel3() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormLabel f_FormLabel3 = (org.gwtbootstrap3.client.ui.FormLabel) GWT.create(org.gwtbootstrap3.client.ui.FormLabel.class);
      // Setup section.
      f_FormLabel3.setHTML(template_html1().asString());
      f_FormLabel3.setFor("tag");

      return f_FormLabel3;
    }

    /**
     * Getter for tagInline called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.HelpBlock get_tagInline() {
      return build_tagInline();
    }
    private org.gwtbootstrap3.client.ui.HelpBlock build_tagInline() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.HelpBlock tagInline = (org.gwtbootstrap3.client.ui.HelpBlock) GWT.create(org.gwtbootstrap3.client.ui.HelpBlock.class);
      // Setup section.

      this.owner.tagInline = tagInline;

      return tagInline;
    }

    /**
     * Getter for f_FlowPanel4 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel4() {
      return build_f_FlowPanel4();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel4() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel4 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel4.add(get_tag());
      f_FlowPanel4.addStyleName("col-sm-6");

      return f_FlowPanel4;
    }

    /**
     * Getter for tag called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.TextBox get_tag() {
      return build_tag();
    }
    private org.gwtbootstrap3.client.ui.TextBox build_tag() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TextBox tag = (org.gwtbootstrap3.client.ui.TextBox) GWT.create(org.gwtbootstrap3.client.ui.TextBox.class);
      // Setup section.
      tag.setPlaceholder("" + get_i18n().TagNameHolder() + "");

      this.owner.tag = tag;

      return tag;
    }

    /**
     * Getter for f_FlowPanel5 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel5() {
      return build_f_FlowPanel5();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel5() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel5 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel5.add(get_addTag());
      f_FlowPanel5.addStyleName("col-sm-3");

      return f_FlowPanel5;
    }

    /**
     * Getter for addTag called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.Button get_addTag() {
      return build_addTag();
    }
    private org.gwtbootstrap3.client.ui.Button build_addTag() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button addTag = (org.gwtbootstrap3.client.ui.Button) GWT.create(org.gwtbootstrap3.client.ui.Button.class);
      // Setup section.
      addTag.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.PLUS);
      addTag.setText("" + get_i18n().AddTag() + "");
      addTag.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      addTag.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

      return addTag;
    }

    /**
     * Getter for f_FormGroup6 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.FormGroup get_f_FormGroup6() {
      return build_f_FormGroup6();
    }
    private org.gwtbootstrap3.client.ui.FormGroup build_f_FormGroup6() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormGroup f_FormGroup6 = (org.gwtbootstrap3.client.ui.FormGroup) GWT.create(org.gwtbootstrap3.client.ui.FormGroup.class);
      // Setup section.
      f_FormGroup6.add(get_f_FormLabel7());
      f_FormGroup6.add(get_f_FlowPanel8());

      return f_FormGroup6;
    }

    /**
     * Getter for f_FormLabel7 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.FormLabel get_f_FormLabel7() {
      return build_f_FormLabel7();
    }
    private org.gwtbootstrap3.client.ui.FormLabel build_f_FormLabel7() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormLabel f_FormLabel7 = (org.gwtbootstrap3.client.ui.FormLabel) GWT.create(org.gwtbootstrap3.client.ui.FormLabel.class);
      // Setup section.
      f_FormLabel7.setHTML(template_html2().asString());
      f_FormLabel7.addStyleName("col-sm-12");

      return f_FormLabel7;
    }

    /**
     * Getter for f_FlowPanel8 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel8() {
      return build_f_FlowPanel8();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel8() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel8 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel8.add(get_tags());
      f_FlowPanel8.addStyleName("col-sm-12");

      return f_FlowPanel8;
    }

    /**
     * Getter for tags called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_tags() {
      return build_tags();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_tags() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel tags = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.

      this.owner.tags = tags;

      return tags;
    }
  }
}
