// .ui.xml template last modified: 1657649695426
package org.dashbuilder.displayer.client.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import org.gwtbootstrap3.client.ui.ModalBody;

public class DisplayerEditorPopup_BinderImpl implements UiBinder<org.gwtbootstrap3.client.ui.ModalBody, org.dashbuilder.displayer.client.widgets.DisplayerEditorPopup>, org.dashbuilder.displayer.client.widgets.DisplayerEditorPopup.Binder {


  public org.gwtbootstrap3.client.ui.ModalBody createAndBindUi(final org.dashbuilder.displayer.client.widgets.DisplayerEditorPopup owner) {


    return new Widgets(owner).get_f_ModalBody1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.dashbuilder.displayer.client.widgets.DisplayerEditorPopup owner;


    public Widgets(final org.dashbuilder.displayer.client.widgets.DisplayerEditorPopup owner) {
      this.owner = owner;
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.dashbuilder.displayer.client.widgets.DisplayerEditorPopup_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.dashbuilder.displayer.client.widgets.DisplayerEditorPopup_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.dashbuilder.displayer.client.widgets.DisplayerEditorPopup_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.dashbuilder.displayer.client.widgets.DisplayerEditorPopup_BinderImpl_GenBundle) GWT.create(org.dashbuilder.displayer.client.widgets.DisplayerEditorPopup_BinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for i18n called 0 times. Type: IMPORTED. Build precedence: 1.
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
     * Getter for f_ModalBody1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private org.gwtbootstrap3.client.ui.ModalBody get_f_ModalBody1() {
      return build_f_ModalBody1();
    }
    private org.gwtbootstrap3.client.ui.ModalBody build_f_ModalBody1() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ModalBody f_ModalBody1 = (org.gwtbootstrap3.client.ui.ModalBody) GWT.create(org.gwtbootstrap3.client.ui.ModalBody.class);
      // Setup section.
      f_ModalBody1.add(get_editor());

      return f_ModalBody1;
    }

    /**
     * Getter for editor called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.dashbuilder.displayer.client.widgets.DisplayerEditor get_editor() {
      return build_editor();
    }
    private org.dashbuilder.displayer.client.widgets.DisplayerEditor build_editor() {
      // Creation section.
      final org.dashbuilder.displayer.client.widgets.DisplayerEditor editor = owner.editor;
      assert editor != null : "UiField editor with 'provided = true' was null";
      // Setup section.

      return editor;
    }
  }
}
