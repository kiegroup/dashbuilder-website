package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.dashbuilder.displayer.client.component.ExternalComponentDispatcher;
import org.dashbuilder.displayer.client.component.ExternalComponentListener;
import org.dashbuilder.displayer.client.widgets.ExternalComponentPresenter;
import org.dashbuilder.displayer.client.widgets.ExternalComponentPresenter.View;
import org.dashbuilder.displayer.client.widgets.ExternalComponentView;
import org.dashbuilder.displayer.external.ExternalComponentMessageHelper;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_d_c_w_ExternalComponentPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<ExternalComponentPresenter> { public Type_factory__o_d_d_c_w_ExternalComponentPresenter__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(ExternalComponentPresenter.class, "Type_factory__o_d_d_c_w_ExternalComponentPresenter__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { ExternalComponentPresenter.class, Object.class, ExternalComponentListener.class });
  }

  public ExternalComponentPresenter createInstance(final ContextManager contextManager) {
    final ExternalComponentPresenter instance = new ExternalComponentPresenter();
    setIncompleteInstance(instance);
    final ExternalComponentDispatcher ExternalComponentPresenter_dispatcher = (ExternalComponentDispatcher) contextManager.getInstance("Type_factory__o_d_d_c_c_ExternalComponentDispatcher__quals__j_e_i_Any_j_e_i_Default");
    ExternalComponentPresenter_ExternalComponentDispatcher_dispatcher(instance, ExternalComponentPresenter_dispatcher);
    final ExternalComponentMessageHelper ExternalComponentPresenter_messageHelper = (ExternalComponentMessageHelper) contextManager.getInstance("Producer_factory__o_d_d_e_ExternalComponentMessageHelper__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ExternalComponentPresenter_messageHelper);
    ExternalComponentPresenter_ExternalComponentMessageHelper_messageHelper(instance, ExternalComponentPresenter_messageHelper);
    final ExternalComponentView ExternalComponentPresenter_view = (ExternalComponentView) contextManager.getInstance("Type_factory__o_d_d_c_w_ExternalComponentView__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ExternalComponentPresenter_view);
    ExternalComponentPresenter_View_view(instance, ExternalComponentPresenter_view);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ExternalComponentPresenter) instance, contextManager);
  }

  public void destroyInstanceHelper(final ExternalComponentPresenter instance, final ContextManager contextManager) {
    instance.destroy();
  }

  public void invokePostConstructs(final ExternalComponentPresenter instance) {
    instance.init();
  }

  native static View ExternalComponentPresenter_View_view(ExternalComponentPresenter instance) /*-{
    return instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentPresenter::view;
  }-*/;

  native static void ExternalComponentPresenter_View_view(ExternalComponentPresenter instance, View value) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentPresenter::view = value;
  }-*/;

  native static ExternalComponentDispatcher ExternalComponentPresenter_ExternalComponentDispatcher_dispatcher(ExternalComponentPresenter instance) /*-{
    return instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentPresenter::dispatcher;
  }-*/;

  native static void ExternalComponentPresenter_ExternalComponentDispatcher_dispatcher(ExternalComponentPresenter instance, ExternalComponentDispatcher value) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentPresenter::dispatcher = value;
  }-*/;

  native static ExternalComponentMessageHelper ExternalComponentPresenter_ExternalComponentMessageHelper_messageHelper(ExternalComponentPresenter instance) /*-{
    return instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentPresenter::messageHelper;
  }-*/;

  native static void ExternalComponentPresenter_ExternalComponentMessageHelper_messageHelper(ExternalComponentPresenter instance, ExternalComponentMessageHelper value) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentPresenter::messageHelper = value;
  }-*/;
}