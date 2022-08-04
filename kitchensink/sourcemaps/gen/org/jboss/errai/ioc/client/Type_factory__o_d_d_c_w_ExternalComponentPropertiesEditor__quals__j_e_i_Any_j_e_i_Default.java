package org.jboss.errai.ioc.client;

import com.google.gwt.user.client.ui.IsWidget;
import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.dashbuilder.displayer.client.widgets.ExternalComponentPropertiesEditor;
import org.dashbuilder.displayer.client.widgets.ExternalComponentPropertiesEditor.View;
import org.dashbuilder.displayer.client.widgets.ExternalComponentPropertiesEditorView;
import org.dashbuilder.external.service.ComponentService;
import org.jboss.errai.common.client.api.Caller;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.uberfire.ext.widgets.common.client.common.BusyIndicatorView;

public class Type_factory__o_d_d_c_w_ExternalComponentPropertiesEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<ExternalComponentPropertiesEditor> { public Type_factory__o_d_d_c_w_ExternalComponentPropertiesEditor__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(ExternalComponentPropertiesEditor.class, "Type_factory__o_d_d_c_w_ExternalComponentPropertiesEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { ExternalComponentPropertiesEditor.class, Object.class, IsWidget.class });
  }

  public ExternalComponentPropertiesEditor createInstance(final ContextManager contextManager) {
    final ExternalComponentPropertiesEditor instance = new ExternalComponentPropertiesEditor();
    setIncompleteInstance(instance);
    final Caller ExternalComponentPropertiesEditor_externalComponentService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { ComponentService.class }, new Annotation[] { });
    registerDependentScopedReference(instance, ExternalComponentPropertiesEditor_externalComponentService);
    ExternalComponentPropertiesEditor_Caller_externalComponentService(instance, ExternalComponentPropertiesEditor_externalComponentService);
    final BusyIndicatorView ExternalComponentPropertiesEditor_loading = (BusyIndicatorView) contextManager.getInstance("Type_factory__o_u_e_w_c_c_c_BusyIndicatorView__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ExternalComponentPropertiesEditor_loading);
    ExternalComponentPropertiesEditor_BusyIndicatorView_loading(instance, ExternalComponentPropertiesEditor_loading);
    final ExternalComponentPropertiesEditorView ExternalComponentPropertiesEditor_view = (ExternalComponentPropertiesEditorView) contextManager.getInstance("Type_factory__o_d_d_c_w_ExternalComponentPropertiesEditorView__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ExternalComponentPropertiesEditor_view);
    ExternalComponentPropertiesEditor_View_view(instance, ExternalComponentPropertiesEditor_view);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final ExternalComponentPropertiesEditor instance) {
    instance.init();
  }

  native static View ExternalComponentPropertiesEditor_View_view(ExternalComponentPropertiesEditor instance) /*-{
    return instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentPropertiesEditor::view;
  }-*/;

  native static void ExternalComponentPropertiesEditor_View_view(ExternalComponentPropertiesEditor instance, View value) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentPropertiesEditor::view = value;
  }-*/;

  native static BusyIndicatorView ExternalComponentPropertiesEditor_BusyIndicatorView_loading(ExternalComponentPropertiesEditor instance) /*-{
    return instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentPropertiesEditor::loading;
  }-*/;

  native static void ExternalComponentPropertiesEditor_BusyIndicatorView_loading(ExternalComponentPropertiesEditor instance, BusyIndicatorView value) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentPropertiesEditor::loading = value;
  }-*/;

  native static Caller ExternalComponentPropertiesEditor_Caller_externalComponentService(ExternalComponentPropertiesEditor instance) /*-{
    return instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentPropertiesEditor::externalComponentService;
  }-*/;

  native static void ExternalComponentPropertiesEditor_Caller_externalComponentService(ExternalComponentPropertiesEditor instance, Caller<ComponentService> value) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentPropertiesEditor::externalComponentService = value;
  }-*/;
}