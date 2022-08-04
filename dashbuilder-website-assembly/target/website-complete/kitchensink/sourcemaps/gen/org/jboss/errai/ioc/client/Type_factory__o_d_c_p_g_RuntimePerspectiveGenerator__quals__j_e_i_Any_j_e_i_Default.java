package org.jboss.errai.ioc.client;

import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.client.perspective.generator.RuntimePerspectiveGenerator;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;
import org.jboss.errai.ioc.client.container.SyncBeanManager;
import org.uberfire.client.mvp.ActivityBeansCache;
import org.uberfire.ext.layout.editor.api.editor.LayoutTemplate;
import org.uberfire.ext.layout.editor.client.generator.BootstrapLayoutGenerator;
import org.uberfire.ext.layout.editor.client.generator.LayoutGenerator;
import org.uberfire.ext.plugin.client.perspective.editor.generator.PerspectiveEditorActivity;

public class Type_factory__o_d_c_p_g_RuntimePerspectiveGenerator__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimePerspectiveGenerator> { private class Type_factory__o_d_c_p_g_RuntimePerspectiveGenerator__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends RuntimePerspectiveGenerator implements Proxy<RuntimePerspectiveGenerator> {
    private final ProxyHelper<RuntimePerspectiveGenerator> proxyHelper = new ProxyHelperImpl<RuntimePerspectiveGenerator>("Type_factory__o_d_c_p_g_RuntimePerspectiveGenerator__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final RuntimePerspectiveGenerator instance) {

    }

    public RuntimePerspectiveGenerator asBeanType() {
      return this;
    }

    public void setInstance(final RuntimePerspectiveGenerator instance) {
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

    @Override public PerspectiveEditorActivity generatePerspective(LayoutTemplate layoutTemplate) {
      if (proxyHelper != null) {
        final RuntimePerspectiveGenerator proxiedInstance = proxyHelper.getInstance(this);
        final PerspectiveEditorActivity retVal = proxiedInstance.generatePerspective(layoutTemplate);
        return retVal;
      } else {
        return super.generatePerspective(layoutTemplate);
      }
    }

    @Override public void unregisterPerspective(LayoutTemplate layoutTemplate) {
      if (proxyHelper != null) {
        final RuntimePerspectiveGenerator proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.unregisterPerspective(layoutTemplate);
      } else {
        super.unregisterPerspective(layoutTemplate);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final RuntimePerspectiveGenerator proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_p_g_RuntimePerspectiveGenerator__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(RuntimePerspectiveGenerator.class, "Type_factory__o_d_c_p_g_RuntimePerspectiveGenerator__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { RuntimePerspectiveGenerator.class, Object.class });
  }

  public RuntimePerspectiveGenerator createInstance(final ContextManager contextManager) {
    final RuntimePerspectiveGenerator instance = new RuntimePerspectiveGenerator();
    setIncompleteInstance(instance);
    final BootstrapLayoutGenerator RuntimePerspectiveGenerator_layoutGenerator = (BootstrapLayoutGenerator) contextManager.getInstance("Type_factory__o_u_e_l_e_c_g_BootstrapLayoutGenerator__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, RuntimePerspectiveGenerator_layoutGenerator);
    RuntimePerspectiveGenerator_LayoutGenerator_layoutGenerator(instance, RuntimePerspectiveGenerator_layoutGenerator);
    final SyncBeanManager RuntimePerspectiveGenerator_beanManager = (SyncBeanManager) contextManager.getInstance("Producer_factory__o_j_e_i_c_c_SyncBeanManager__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, RuntimePerspectiveGenerator_beanManager);
    RuntimePerspectiveGenerator_SyncBeanManager_beanManager(instance, RuntimePerspectiveGenerator_beanManager);
    final ActivityBeansCache RuntimePerspectiveGenerator_activityBeansCache = (ActivityBeansCache) contextManager.getInstance("Type_factory__o_u_c_m_ActivityBeansCache__quals__j_e_i_Any_j_e_i_Default");
    RuntimePerspectiveGenerator_ActivityBeansCache_activityBeansCache(instance, RuntimePerspectiveGenerator_activityBeansCache);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<RuntimePerspectiveGenerator> proxyImpl = new Type_factory__o_d_c_p_g_RuntimePerspectiveGenerator__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  native static LayoutGenerator RuntimePerspectiveGenerator_LayoutGenerator_layoutGenerator(RuntimePerspectiveGenerator instance) /*-{
    return instance.@org.dashbuilder.client.perspective.generator.RuntimePerspectiveGenerator::layoutGenerator;
  }-*/;

  native static void RuntimePerspectiveGenerator_LayoutGenerator_layoutGenerator(RuntimePerspectiveGenerator instance, LayoutGenerator value) /*-{
    instance.@org.dashbuilder.client.perspective.generator.RuntimePerspectiveGenerator::layoutGenerator = value;
  }-*/;

  native static ActivityBeansCache RuntimePerspectiveGenerator_ActivityBeansCache_activityBeansCache(RuntimePerspectiveGenerator instance) /*-{
    return instance.@org.dashbuilder.client.perspective.generator.RuntimePerspectiveGenerator::activityBeansCache;
  }-*/;

  native static void RuntimePerspectiveGenerator_ActivityBeansCache_activityBeansCache(RuntimePerspectiveGenerator instance, ActivityBeansCache value) /*-{
    instance.@org.dashbuilder.client.perspective.generator.RuntimePerspectiveGenerator::activityBeansCache = value;
  }-*/;

  native static SyncBeanManager RuntimePerspectiveGenerator_SyncBeanManager_beanManager(RuntimePerspectiveGenerator instance) /*-{
    return instance.@org.dashbuilder.client.perspective.generator.RuntimePerspectiveGenerator::beanManager;
  }-*/;

  native static void RuntimePerspectiveGenerator_SyncBeanManager_beanManager(RuntimePerspectiveGenerator instance, SyncBeanManager value) /*-{
    instance.@org.dashbuilder.client.perspective.generator.RuntimePerspectiveGenerator::beanManager = value;
  }-*/;
}