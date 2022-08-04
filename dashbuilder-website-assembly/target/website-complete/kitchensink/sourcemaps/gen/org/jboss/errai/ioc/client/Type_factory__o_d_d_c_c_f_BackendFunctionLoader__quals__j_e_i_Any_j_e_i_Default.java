package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import org.dashbuilder.displayer.client.component.function.BackendFunctionLoader;
import org.dashbuilder.displayer.client.component.function.ComponentFunctionLocator;
import org.dashbuilder.external.service.BackendComponentFunctionService;
import org.jboss.errai.common.client.api.Caller;
import org.jboss.errai.ioc.client.api.EntryPoint;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_d_c_c_f_BackendFunctionLoader__quals__j_e_i_Any_j_e_i_Default extends Factory<BackendFunctionLoader> { public Type_factory__o_d_d_c_c_f_BackendFunctionLoader__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(BackendFunctionLoader.class, "Type_factory__o_d_d_c_c_f_BackendFunctionLoader__quals__j_e_i_Any_j_e_i_Default", EntryPoint.class, true, null, true));
    handle.setAssignableTypes(new Class[] { BackendFunctionLoader.class, Object.class });
  }

  public BackendFunctionLoader createInstance(final ContextManager contextManager) {
    final BackendFunctionLoader instance = new BackendFunctionLoader();
    setIncompleteInstance(instance);
    final Caller BackendFunctionLoader_backendFunctionLoaderService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { BackendComponentFunctionService.class }, new Annotation[] { });
    registerDependentScopedReference(instance, BackendFunctionLoader_backendFunctionLoaderService);
    BackendFunctionLoader_Caller_backendFunctionLoaderService(instance, BackendFunctionLoader_backendFunctionLoaderService);
    final ComponentFunctionLocator BackendFunctionLoader_componentFunctionLocator = (ComponentFunctionLocator) contextManager.getInstance("Type_factory__o_d_d_c_c_f_ComponentFunctionLocator__quals__j_e_i_Any_j_e_i_Default");
    BackendFunctionLoader_ComponentFunctionLocator_componentFunctionLocator(instance, BackendFunctionLoader_componentFunctionLocator);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final BackendFunctionLoader instance) {
    instance.loadBackendFunctions();
  }

  native static Caller BackendFunctionLoader_Caller_backendFunctionLoaderService(BackendFunctionLoader instance) /*-{
    return instance.@org.dashbuilder.displayer.client.component.function.BackendFunctionLoader::backendFunctionLoaderService;
  }-*/;

  native static void BackendFunctionLoader_Caller_backendFunctionLoaderService(BackendFunctionLoader instance, Caller<BackendComponentFunctionService> value) /*-{
    instance.@org.dashbuilder.displayer.client.component.function.BackendFunctionLoader::backendFunctionLoaderService = value;
  }-*/;

  native static ComponentFunctionLocator BackendFunctionLoader_ComponentFunctionLocator_componentFunctionLocator(BackendFunctionLoader instance) /*-{
    return instance.@org.dashbuilder.displayer.client.component.function.BackendFunctionLoader::componentFunctionLocator;
  }-*/;

  native static void BackendFunctionLoader_ComponentFunctionLocator_componentFunctionLocator(BackendFunctionLoader instance, ComponentFunctionLocator value) /*-{
    instance.@org.dashbuilder.displayer.client.component.function.BackendFunctionLoader::componentFunctionLocator = value;
  }-*/;
}