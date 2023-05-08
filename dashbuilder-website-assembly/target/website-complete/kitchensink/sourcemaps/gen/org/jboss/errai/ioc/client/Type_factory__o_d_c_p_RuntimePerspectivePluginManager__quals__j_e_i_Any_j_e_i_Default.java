package org.jboss.errai.ioc.client;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.client.navigation.plugin.PerspectivePluginManager;
import org.dashbuilder.client.plugins.RuntimePerspectivePluginManager;
import org.dashbuilder.navigation.NavGroup;
import org.dashbuilder.navigation.NavItem;
import org.dashbuilder.navigation.layout.LayoutTemplateContext;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;
import org.uberfire.ext.layout.editor.api.editor.LayoutTemplate;
import org.uberfire.ext.layout.editor.client.generator.BootstrapLayoutGenerator;
import org.uberfire.ext.layout.editor.client.generator.LayoutGenerator;
import org.uberfire.mvp.ParameterizedCommand;

public class Type_factory__o_d_c_p_RuntimePerspectivePluginManager__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimePerspectivePluginManager> { private class Type_factory__o_d_c_p_RuntimePerspectivePluginManager__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends RuntimePerspectivePluginManager implements Proxy<RuntimePerspectivePluginManager> {
    private final ProxyHelper<RuntimePerspectivePluginManager> proxyHelper = new ProxyHelperImpl<RuntimePerspectivePluginManager>("Type_factory__o_d_c_p_RuntimePerspectivePluginManager__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final RuntimePerspectivePluginManager instance) {

    }

    public RuntimePerspectivePluginManager asBeanType() {
      return this;
    }

    public void setInstance(final RuntimePerspectivePluginManager instance) {
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

    @Override public boolean isRuntimePerspective(NavItem navItem) {
      if (proxyHelper != null) {
        final RuntimePerspectivePluginManager proxiedInstance = proxyHelper.getInstance(this);
        final boolean retVal = proxiedInstance.isRuntimePerspective(navItem);
        return retVal;
      } else {
        return super.isRuntimePerspective(navItem);
      }
    }

    @Override public boolean isRuntimePerspective(String perspectiveId) {
      if (proxyHelper != null) {
        final RuntimePerspectivePluginManager proxiedInstance = proxyHelper.getInstance(this);
        final boolean retVal = proxiedInstance.isRuntimePerspective(perspectiveId);
        return retVal;
      } else {
        return super.isRuntimePerspective(perspectiveId);
      }
    }

    @Override public String getRuntimePerspectiveId(NavItem navItem) {
      if (proxyHelper != null) {
        final RuntimePerspectivePluginManager proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.getRuntimePerspectiveId(navItem);
        return retVal;
      } else {
        return super.getRuntimePerspectiveId(navItem);
      }
    }

    @Override public boolean existsPerspectivePlugin(String perspectiveName) {
      if (proxyHelper != null) {
        final RuntimePerspectivePluginManager proxiedInstance = proxyHelper.getInstance(this);
        final boolean retVal = proxiedInstance.existsPerspectivePlugin(perspectiveName);
        return retVal;
      } else {
        return super.existsPerspectivePlugin(perspectiveName);
      }
    }

    @Override public void getLayoutTemplateInfo(String perspectiveName, ParameterizedCommand callback) {
      if (proxyHelper != null) {
        final RuntimePerspectivePluginManager proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.getLayoutTemplateInfo(perspectiveName, callback);
      } else {
        super.getLayoutTemplateInfo(perspectiveName, callback);
      }
    }

    @Override public void getLayoutTemplateInfo(LayoutTemplate layoutTemplate, ParameterizedCommand callback) {
      if (proxyHelper != null) {
        final RuntimePerspectivePluginManager proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.getLayoutTemplateInfo(layoutTemplate, callback);
      } else {
        super.getLayoutTemplateInfo(layoutTemplate, callback);
      }
    }

    @Override public void buildPerspectiveWidget(String perspectiveName, LayoutTemplateContext layoutCtx, ParameterizedCommand afterBuild, ParameterizedCommand onInfiniteRecursion) {
      if (proxyHelper != null) {
        final RuntimePerspectivePluginManager proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.buildPerspectiveWidget(perspectiveName, layoutCtx, afterBuild, onInfiniteRecursion);
      } else {
        super.buildPerspectiveWidget(perspectiveName, layoutCtx, afterBuild, onInfiniteRecursion);
      }
    }

    @Override public NavGroup getLastBuildPerspectiveNavGroup() {
      if (proxyHelper != null) {
        final RuntimePerspectivePluginManager proxiedInstance = proxyHelper.getInstance(this);
        final NavGroup retVal = proxiedInstance.getLastBuildPerspectiveNavGroup();
        return retVal;
      } else {
        return super.getLastBuildPerspectiveNavGroup();
      }
    }

    @Override public void setTemplates(List templates) {
      if (proxyHelper != null) {
        final RuntimePerspectivePluginManager proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.setTemplates(templates);
      } else {
        super.setTemplates(templates);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final RuntimePerspectivePluginManager proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_p_RuntimePerspectivePluginManager__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(RuntimePerspectivePluginManager.class, "Type_factory__o_d_c_p_RuntimePerspectivePluginManager__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { RuntimePerspectivePluginManager.class, Object.class, PerspectivePluginManager.class });
  }

  public RuntimePerspectivePluginManager createInstance(final ContextManager contextManager) {
    final RuntimePerspectivePluginManager instance = new RuntimePerspectivePluginManager();
    setIncompleteInstance(instance);
    final BootstrapLayoutGenerator RuntimePerspectivePluginManager_layoutGenerator = (BootstrapLayoutGenerator) contextManager.getInstance("Type_factory__o_u_e_l_e_c_g_BootstrapLayoutGenerator__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, RuntimePerspectivePluginManager_layoutGenerator);
    RuntimePerspectivePluginManager_LayoutGenerator_layoutGenerator(instance, RuntimePerspectivePluginManager_layoutGenerator);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<RuntimePerspectivePluginManager> proxyImpl = new Type_factory__o_d_c_p_RuntimePerspectivePluginManager__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  native static LayoutGenerator RuntimePerspectivePluginManager_LayoutGenerator_layoutGenerator(RuntimePerspectivePluginManager instance) /*-{
    return instance.@org.dashbuilder.client.plugins.RuntimePerspectivePluginManager::layoutGenerator;
  }-*/;

  native static void RuntimePerspectivePluginManager_LayoutGenerator_layoutGenerator(RuntimePerspectivePluginManager instance, LayoutGenerator value) /*-{
    instance.@org.dashbuilder.client.plugins.RuntimePerspectivePluginManager::layoutGenerator = value;
  }-*/;
}