package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.dashbuilder.client.editor.external.ExternalDragComponent;
import org.dashbuilder.displayer.client.widgets.ExternalComponentPresenter;
import org.dashbuilder.displayer.external.ExternalComponentMessageHelper;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.SyncBeanManager;
import org.uberfire.ext.layout.editor.client.api.LayoutDragComponent;

public class Type_factory__o_d_c_e_e_ExternalDragComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<ExternalDragComponent> { public Type_factory__o_d_c_e_e_ExternalDragComponent__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(ExternalDragComponent.class, "Type_factory__o_d_c_e_e_ExternalDragComponent__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { ExternalDragComponent.class, Object.class, LayoutDragComponent.class });
  }

  public ExternalDragComponent createInstance(final ContextManager contextManager) {
    final ExternalDragComponent instance = new ExternalDragComponent();
    setIncompleteInstance(instance);
    final SyncBeanManager ExternalDragComponent_beanManager = (SyncBeanManager) contextManager.getInstance("Producer_factory__o_j_e_i_c_c_SyncBeanManager__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ExternalDragComponent_beanManager);
    ExternalDragComponent_SyncBeanManager_beanManager(instance, ExternalDragComponent_beanManager);
    final ExternalComponentMessageHelper ExternalDragComponent_messageHelper = (ExternalComponentMessageHelper) contextManager.getInstance("Producer_factory__o_d_d_e_ExternalComponentMessageHelper__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ExternalDragComponent_messageHelper);
    ExternalDragComponent_ExternalComponentMessageHelper_messageHelper(instance, ExternalDragComponent_messageHelper);
    final ExternalComponentPresenter ExternalDragComponent_externalComponentPresenter = (ExternalComponentPresenter) contextManager.getInstance("Type_factory__o_d_d_c_w_ExternalComponentPresenter__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ExternalDragComponent_externalComponentPresenter);
    ExternalDragComponent_ExternalComponentPresenter_externalComponentPresenter(instance, ExternalDragComponent_externalComponentPresenter);
    setIncompleteInstance(null);
    return instance;
  }

  native static ExternalComponentMessageHelper ExternalDragComponent_ExternalComponentMessageHelper_messageHelper(ExternalDragComponent instance) /*-{
    return instance.@org.dashbuilder.client.editor.external.ExternalDragComponent::messageHelper;
  }-*/;

  native static void ExternalDragComponent_ExternalComponentMessageHelper_messageHelper(ExternalDragComponent instance, ExternalComponentMessageHelper value) /*-{
    instance.@org.dashbuilder.client.editor.external.ExternalDragComponent::messageHelper = value;
  }-*/;

  native static ExternalComponentPresenter ExternalDragComponent_ExternalComponentPresenter_externalComponentPresenter(ExternalDragComponent instance) /*-{
    return instance.@org.dashbuilder.client.editor.external.ExternalDragComponent::externalComponentPresenter;
  }-*/;

  native static void ExternalDragComponent_ExternalComponentPresenter_externalComponentPresenter(ExternalDragComponent instance, ExternalComponentPresenter value) /*-{
    instance.@org.dashbuilder.client.editor.external.ExternalDragComponent::externalComponentPresenter = value;
  }-*/;

  native static SyncBeanManager ExternalDragComponent_SyncBeanManager_beanManager(ExternalDragComponent instance) /*-{
    return instance.@org.dashbuilder.client.editor.external.ExternalDragComponent::beanManager;
  }-*/;

  native static void ExternalDragComponent_SyncBeanManager_beanManager(ExternalDragComponent instance, SyncBeanManager value) /*-{
    instance.@org.dashbuilder.client.editor.external.ExternalDragComponent::beanManager = value;
  }-*/;
}