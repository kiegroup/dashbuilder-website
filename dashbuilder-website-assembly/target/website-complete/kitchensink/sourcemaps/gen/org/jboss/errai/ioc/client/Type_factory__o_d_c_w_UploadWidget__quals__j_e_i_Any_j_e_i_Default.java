package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.dashbuilder.client.RuntimeClientLoader;
import org.dashbuilder.client.screens.RouterScreen;
import org.dashbuilder.client.widgets.UploadWidget;
import org.dashbuilder.client.widgets.UploadWidget.View;
import org.dashbuilder.client.widgets.view.UploadWidgetView;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ui.client.local.api.elemental2.IsElement;

public class Type_factory__o_d_c_w_UploadWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<UploadWidget> { public Type_factory__o_d_c_w_UploadWidget__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(UploadWidget.class, "Type_factory__o_d_c_w_UploadWidget__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { UploadWidget.class, Object.class, IsElement.class, org.jboss.errai.common.client.api.elemental2.IsElement.class });
  }

  public UploadWidget createInstance(final ContextManager contextManager) {
    final UploadWidget instance = new UploadWidget();
    setIncompleteInstance(instance);
    final UploadWidgetView UploadWidget_view = (UploadWidgetView) contextManager.getInstance("Type_factory__o_d_c_w_v_UploadWidgetView__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, UploadWidget_view);
    UploadWidget_View_view(instance, UploadWidget_view);
    final RouterScreen UploadWidget_routerScreen = (RouterScreen) contextManager.getInstance("Type_factory__o_d_c_s_RouterScreen__quals__j_e_i_Any_j_e_i_Default");
    UploadWidget_RouterScreen_routerScreen(instance, UploadWidget_routerScreen);
    final RuntimeClientLoader UploadWidget_runtimeClientLoader = (RuntimeClientLoader) contextManager.getInstance("Type_factory__o_d_c_RuntimeClientLoader__quals__j_e_i_Any_j_e_i_Default");
    UploadWidget_RuntimeClientLoader_runtimeClientLoader(instance, UploadWidget_runtimeClientLoader);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final UploadWidget instance) {
    instance.init();
  }

  native static View UploadWidget_View_view(UploadWidget instance) /*-{
    return instance.@org.dashbuilder.client.widgets.UploadWidget::view;
  }-*/;

  native static void UploadWidget_View_view(UploadWidget instance, View value) /*-{
    instance.@org.dashbuilder.client.widgets.UploadWidget::view = value;
  }-*/;

  native static RouterScreen UploadWidget_RouterScreen_routerScreen(UploadWidget instance) /*-{
    return instance.@org.dashbuilder.client.widgets.UploadWidget::routerScreen;
  }-*/;

  native static void UploadWidget_RouterScreen_routerScreen(UploadWidget instance, RouterScreen value) /*-{
    instance.@org.dashbuilder.client.widgets.UploadWidget::routerScreen = value;
  }-*/;

  native static RuntimeClientLoader UploadWidget_RuntimeClientLoader_runtimeClientLoader(UploadWidget instance) /*-{
    return instance.@org.dashbuilder.client.widgets.UploadWidget::runtimeClientLoader;
  }-*/;

  native static void UploadWidget_RuntimeClientLoader_runtimeClientLoader(UploadWidget instance, RuntimeClientLoader value) /*-{
    instance.@org.dashbuilder.client.widgets.UploadWidget::runtimeClientLoader = value;
  }-*/;
}