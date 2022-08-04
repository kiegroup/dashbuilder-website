// .ui.xml template last modified: 1657649687133
package org.uberfire.ext.plugin.client.perspective.editor.layout.editor.popups;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class EditTargetDiv_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.uberfire.ext.plugin.client.perspective.editor.layout.editor.popups.EditTargetDiv>, org.uberfire.ext.plugin.client.perspective.editor.layout.editor.popups.EditTargetDiv.Binder {


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.uberfire.ext.plugin.client.perspective.editor.layout.editor.popups.EditTargetDiv owner) {


    return new Widgets(owner).get_f_Panel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.uberfire.ext.plugin.client.perspective.editor.layout.editor.popups.EditTargetDiv owner;


    public Widgets(final org.uberfire.ext.plugin.client.perspective.editor.layout.editor.popups.EditTargetDiv owner) {
      this.owner = owner;
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.uberfire.ext.plugin.client.perspective.editor.layout.editor.popups.EditTargetDiv_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.uberfire.ext.plugin.client.perspective.editor.layout.editor.popups.EditTargetDiv_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.uberfire.ext.plugin.client.perspective.editor.layout.editor.popups.EditTargetDiv_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.uberfire.ext.plugin.client.perspective.editor.layout.editor.popups.EditTargetDiv_BinderImpl_GenBundle) GWT.create(org.uberfire.ext.plugin.client.perspective.editor.layout.editor.popups.EditTargetDiv_BinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
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
     * Getter for i18n called 0 times. Type: IMPORTED. Build precedence: 1.
     */
    private org.uberfire.ext.plugin.client.resources.i18n.CommonConstants get_i18n() {
      return build_i18n();
    }
    private org.uberfire.ext.plugin.client.resources.i18n.CommonConstants build_i18n() {
      // Creation section.
      final org.uberfire.ext.plugin.client.resources.i18n.CommonConstants i18n = (org.uberfire.ext.plugin.client.resources.i18n.CommonConstants) GWT.create(org.uberfire.ext.plugin.client.resources.i18n.CommonConstants.class);
      // Setup section.

      return i18n;
    }

    /**
     * Getter for f_Panel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel1() {
      return build_f_Panel1();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel1() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel1 = (org.gwtbootstrap3.client.ui.Panel) GWT.create(org.gwtbootstrap3.client.ui.Panel.class);
      // Setup section.
      f_Panel1.add(get_propertyEditor());

      return f_Panel1;
    }

    /**
     * Getter for propertyEditor called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.uberfire.ext.properties.editor.client.PropertyEditorWidget get_propertyEditor() {
      return build_propertyEditor();
    }
    private org.uberfire.ext.properties.editor.client.PropertyEditorWidget build_propertyEditor() {
      // Creation section.
      final org.uberfire.ext.properties.editor.client.PropertyEditorWidget propertyEditor = (org.uberfire.ext.properties.editor.client.PropertyEditorWidget) GWT.create(org.uberfire.ext.properties.editor.client.PropertyEditorWidget.class);
      // Setup section.

      this.owner.propertyEditor = propertyEditor;

      return propertyEditor;
    }
  }
}
