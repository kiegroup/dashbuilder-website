package org.jboss.errai.ioc.client;

import elemental2.core.JsArray;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.displayer.client.component.function.ComponentFunctionLocator;
import org.dashbuilder.displayer.external.ExternalComponentFunction;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;
import org.jboss.errai.ioc.client.container.SyncBeanManager;

public class Type_factory__o_d_d_c_c_f_ComponentFunctionLocator__quals__j_e_i_Any_j_e_i_Default extends Factory<ComponentFunctionLocator> { private class Type_factory__o_d_d_c_c_f_ComponentFunctionLocator__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends ComponentFunctionLocator implements Proxy<ComponentFunctionLocator> {
    private final ProxyHelper<ComponentFunctionLocator> proxyHelper = new ProxyHelperImpl<ComponentFunctionLocator>("Type_factory__o_d_d_c_c_f_ComponentFunctionLocator__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final ComponentFunctionLocator instance) {

    }

    public ComponentFunctionLocator asBeanType() {
      return this;
    }

    public void setInstance(final ComponentFunctionLocator instance) {
      proxyHelper.setInstance(instance);
    }

    public void clearInstance() {
      proxyHelper.clearInstance();
    }

    public void setProxyContext(final Context context) {
      proxyHelper.setProxyContext(context);
    }

    public Context getProxyContext() {
      return proxyHelper.getProxyContext();
    }

    public Object unwrap() {
      return proxyHelper.getInstance(this);
    }

    public boolean equals(Object obj) {
      obj = Factory.maybeUnwrapProxy(obj);
      return proxyHelper.getInstance(this).equals(obj);
    }

    @Override public Optional findFunctionByName(String name) {
      if (proxyHelper != null) {
        final ComponentFunctionLocator proxiedInstance = proxyHelper.getInstance(this);
        final Optional retVal = proxiedInstance.findFunctionByName(name);
        return retVal;
      } else {
        return super.findFunctionByName(name);
      }
    }

    @Override public void registerFunction(ExternalComponentFunction function) {
      if (proxyHelper != null) {
        final ComponentFunctionLocator proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.registerFunction(function);
      } else {
        super.registerFunction(function);
      }
    }

    @Override public JsArray listFunctions() {
      if (proxyHelper != null) {
        final ComponentFunctionLocator proxiedInstance = proxyHelper.getInstance(this);
        final JsArray retVal = proxiedInstance.listFunctions();
        return retVal;
      } else {
        return super.listFunctions();
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final ComponentFunctionLocator proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_d_c_c_f_ComponentFunctionLocator__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(ComponentFunctionLocator.class, "Type_factory__o_d_d_c_c_f_ComponentFunctionLocator__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { ComponentFunctionLocator.class, Object.class });
  }

  public ComponentFunctionLocator createInstance(final ContextManager contextManager) {
    final ComponentFunctionLocator instance = new ComponentFunctionLocator();
    setIncompleteInstance(instance);
    final SyncBeanManager ComponentFunctionLocator_beanManager = (SyncBeanManager) contextManager.getInstance("Producer_factory__o_j_e_i_c_c_SyncBeanManager__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ComponentFunctionLocator_beanManager);
    ComponentFunctionLocator_SyncBeanManager_beanManager(instance, ComponentFunctionLocator_beanManager);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final ComponentFunctionLocator instance) {
    ComponentFunctionLocator_loadFunctions(instance);
  }

  public Proxy createProxy(final Context context) {
    final Proxy<ComponentFunctionLocator> proxyImpl = new Type_factory__o_d_d_c_c_f_ComponentFunctionLocator__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  native static SyncBeanManager ComponentFunctionLocator_SyncBeanManager_beanManager(ComponentFunctionLocator instance) /*-{
    return instance.@org.dashbuilder.displayer.client.component.function.ComponentFunctionLocator::beanManager;
  }-*/;

  native static void ComponentFunctionLocator_SyncBeanManager_beanManager(ComponentFunctionLocator instance, SyncBeanManager value) /*-{
    instance.@org.dashbuilder.displayer.client.component.function.ComponentFunctionLocator::beanManager = value;
  }-*/;

  public native static void ComponentFunctionLocator_loadFunctions(ComponentFunctionLocator instance) /*-{
    instance.@org.dashbuilder.displayer.client.component.function.ComponentFunctionLocator::loadFunctions()();
  }-*/;
}