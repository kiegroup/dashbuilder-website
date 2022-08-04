package org.jboss.errai.ioc.client;

import com.google.gwt.event.logical.shared.HasAttachHandlers;
import com.google.gwt.event.shared.HasHandlers;
import com.google.gwt.user.client.EventListener;
import com.google.gwt.user.client.ui.ComplexPanel;
import com.google.gwt.user.client.ui.HasVisibility;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.HasWidgets.ForIsWidget;
import com.google.gwt.user.client.ui.IndexedPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.UIObject;
import com.google.gwt.user.client.ui.Widget;
import javax.enterprise.context.Dependent;
import org.dashbuilder.displayer.client.widgets.ExternalComponentEditor;
import org.dashbuilder.displayer.client.widgets.ExternalComponentEditorPopUp;
import org.gwtbootstrap3.client.ui.IsClosable;
import org.gwtbootstrap3.client.ui.Modal;
import org.gwtbootstrap3.client.ui.base.ComplexWidget;
import org.gwtbootstrap3.client.ui.base.HasId;
import org.gwtbootstrap3.client.ui.base.HasInlineStyle;
import org.gwtbootstrap3.client.ui.base.HasPull;
import org.gwtbootstrap3.client.ui.base.HasResponsiveness;
import org.gwtbootstrap3.client.ui.html.Div;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.uberfire.ext.widgets.common.client.common.popups.BaseModal;

public class Type_factory__o_d_d_c_w_ExternalComponentEditorPopUp__quals__j_e_i_Any_j_e_i_Default extends Factory<ExternalComponentEditorPopUp> { public Type_factory__o_d_d_c_w_ExternalComponentEditorPopUp__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(ExternalComponentEditorPopUp.class, "Type_factory__o_d_d_c_w_ExternalComponentEditorPopUp__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { ExternalComponentEditorPopUp.class, BaseModal.class, Modal.class, Div.class, ComplexWidget.class, ComplexPanel.class, Panel.class, Widget.class, UIObject.class, Object.class, HasVisibility.class, EventListener.class, HasAttachHandlers.class, HasHandlers.class, IsWidget.class, ForIsWidget.class, HasWidgets.class, Iterable.class, com.google.gwt.user.client.ui.IndexedPanel.ForIsWidget.class, IndexedPanel.class, HasId.class, HasResponsiveness.class, HasInlineStyle.class, HasPull.class, IsClosable.class });
  }

  public ExternalComponentEditorPopUp createInstance(final ContextManager contextManager) {
    final ExternalComponentEditorPopUp instance = new ExternalComponentEditorPopUp();
    setIncompleteInstance(instance);
    final ExternalComponentEditor ExternalComponentEditorPopUp_externalComponentEditor = (ExternalComponentEditor) contextManager.getInstance("Type_factory__o_d_d_c_w_ExternalComponentEditor__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ExternalComponentEditorPopUp_externalComponentEditor);
    ExternalComponentEditorPopUp_ExternalComponentEditor_externalComponentEditor(instance, ExternalComponentEditorPopUp_externalComponentEditor);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final ExternalComponentEditorPopUp instance) {
    instance.setup();
  }

  native static ExternalComponentEditor ExternalComponentEditorPopUp_ExternalComponentEditor_externalComponentEditor(ExternalComponentEditorPopUp instance) /*-{
    return instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentEditorPopUp::externalComponentEditor;
  }-*/;

  native static void ExternalComponentEditorPopUp_ExternalComponentEditor_externalComponentEditor(ExternalComponentEditorPopUp instance, ExternalComponentEditor value) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentEditorPopUp::externalComponentEditor = value;
  }-*/;
}