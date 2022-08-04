// .ui.xml template last modified: 1657649691864
package org.dashbuilder.common.client.editor.file;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class FileUploadEditorView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.dashbuilder.common.client.editor.file.FileUploadEditorView>, org.dashbuilder.common.client.editor.file.FileUploadEditorView.Binder {


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.dashbuilder.common.client.editor.file.FileUploadEditorView owner) {


    return new Widgets(owner).get_mainPanel();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.dashbuilder.common.client.editor.file.FileUploadEditorView owner;


    public Widgets(final org.dashbuilder.common.client.editor.file.FileUploadEditorView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.dashbuilder.common.client.editor.file.FileUploadEditorView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.dashbuilder.common.client.editor.file.FileUploadEditorView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.dashbuilder.common.client.editor.file.FileUploadEditorView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.dashbuilder.common.client.editor.file.FileUploadEditorView_BinderImpl_GenBundle) GWT.create(org.dashbuilder.common.client.editor.file.FileUploadEditorView_BinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for i18n called 1 times. Type: IMPORTED. Build precedence: 1.
     */
    private org.dashbuilder.common.client.resources.i18n.DashbuilderCommonConstants get_i18n() {
      return build_i18n();
    }
    private org.dashbuilder.common.client.resources.i18n.DashbuilderCommonConstants build_i18n() {
      // Creation section.
      final org.dashbuilder.common.client.resources.i18n.DashbuilderCommonConstants i18n = (org.dashbuilder.common.client.resources.i18n.DashbuilderCommonConstants) GWT.create(org.dashbuilder.common.client.resources.i18n.DashbuilderCommonConstants.class);
      // Setup section.

      return i18n;
    }

    /**
     * Getter for style called 2 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.dashbuilder.common.client.editor.file.FileUploadEditorView_BinderImpl_GenCss_style style;
    private org.dashbuilder.common.client.editor.file.FileUploadEditorView_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private org.dashbuilder.common.client.editor.file.FileUploadEditorView_BinderImpl_GenCss_style build_style() {
      // Creation section.
      style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();

      return style;
    }

    /**
     * Getter for mainPanel called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_mainPanel() {
      return build_mainPanel();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_mainPanel() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel mainPanel = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      mainPanel.add(get_formPanel());
      mainPanel.add(get_fileLabel());
      mainPanel.add(get_loadingIcon());
      mainPanel.addStyleName("" + get_style().mainPanel() + "");

      this.owner.mainPanel = mainPanel;

      return mainPanel;
    }

    /**
     * Getter for formPanel called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.FormPanel get_formPanel() {
      return build_formPanel();
    }
    private com.google.gwt.user.client.ui.FormPanel build_formPanel() {
      // Creation section.
      final com.google.gwt.user.client.ui.FormPanel formPanel = (com.google.gwt.user.client.ui.FormPanel) GWT.create(com.google.gwt.user.client.ui.FormPanel.class);
      // Setup section.
      formPanel.add(get_errorTooltip());
      formPanel.addStyleName("" + get_style().form() + "");

      this.owner.formPanel = formPanel;

      return formPanel;
    }

    /**
     * Getter for errorTooltip called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Tooltip get_errorTooltip() {
      return build_errorTooltip();
    }
    private org.gwtbootstrap3.client.ui.Tooltip build_errorTooltip() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Tooltip errorTooltip = (org.gwtbootstrap3.client.ui.Tooltip) GWT.create(org.gwtbootstrap3.client.ui.Tooltip.class);
      // Setup section.
      errorTooltip.add(get_fileUpload());
      errorTooltip.setContainer("body");
      errorTooltip.setTitle("");

      this.owner.errorTooltip = errorTooltip;

      return errorTooltip;
    }

    /**
     * Getter for fileUpload called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.uberfire.ext.widgets.common.client.common.FileUpload get_fileUpload() {
      return build_fileUpload();
    }
    private org.uberfire.ext.widgets.common.client.common.FileUpload build_fileUpload() {
      // Creation section.
      final org.uberfire.ext.widgets.common.client.common.FileUpload fileUpload = owner.fileUpload;
      assert fileUpload != null : "UiField fileUpload with 'provided = true' was null";
      // Setup section.
      fileUpload.setName("fileUpload");

      return fileUpload;
    }

    /**
     * Getter for fileLabel called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.Label get_fileLabel() {
      return build_fileLabel();
    }
    private org.gwtbootstrap3.client.ui.Label build_fileLabel() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Label fileLabel = (org.gwtbootstrap3.client.ui.Label) GWT.create(org.gwtbootstrap3.client.ui.Label.class);
      // Setup section.
      fileLabel.setVisible(false);
      fileLabel.setTitle("" + get_i18n().currentFilePath() + "");

      this.owner.fileLabel = fileLabel;

      return fileLabel;
    }

    /**
     * Getter for loadingIcon called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.Icon get_loadingIcon() {
      return build_loadingIcon();
    }
    private org.gwtbootstrap3.client.ui.Icon build_loadingIcon() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Icon loadingIcon = new org.gwtbootstrap3.client.ui.Icon(org.gwtbootstrap3.client.ui.constants.IconType.REFRESH);
      // Setup section.
      loadingIcon.setSpin(true);

      this.owner.loadingIcon = loadingIcon;

      return loadingIcon;
    }
  }
}
