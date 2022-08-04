package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Event;
import org.dashbuilder.client.navigation.NavigationManager;
import org.dashbuilder.client.navigation.impl.NavigationManagerImpl;
import org.dashbuilder.client.navigation.plugin.PerspectivePluginManager;
import org.dashbuilder.client.navigation.plugin.PerspectivePluginManagerImpl;
import org.dashbuilder.navigation.NavGroup;
import org.dashbuilder.navigation.NavItem;
import org.dashbuilder.navigation.event.PerspectivePluginsChangedEvent;
import org.dashbuilder.navigation.layout.LayoutTemplateContext;
import org.dashbuilder.navigation.service.PerspectivePluginServices;
import org.jboss.errai.bus.client.ErraiBus;
import org.jboss.errai.common.client.api.Caller;
import org.jboss.errai.enterprise.client.cdi.AbstractCDIEventCallback;
import org.jboss.errai.enterprise.client.cdi.api.CDI;
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
import org.uberfire.ext.plugin.event.PluginAdded;
import org.uberfire.ext.plugin.event.PluginDeleted;
import org.uberfire.ext.plugin.event.PluginRenamed;
import org.uberfire.ext.plugin.event.PluginSaved;
import org.uberfire.ext.plugin.model.Plugin;
import org.uberfire.mvp.ParameterizedCommand;

public class Type_factory__o_d_c_n_p_PerspectivePluginManagerImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<PerspectivePluginManagerImpl> { private class Type_factory__o_d_c_n_p_PerspectivePluginManagerImpl__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends PerspectivePluginManagerImpl implements Proxy<PerspectivePluginManagerImpl> {
    private final ProxyHelper<PerspectivePluginManagerImpl> proxyHelper = new ProxyHelperImpl<PerspectivePluginManagerImpl>("Type_factory__o_d_c_n_p_PerspectivePluginManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    public Type_factory__o_d_c_n_p_PerspectivePluginManagerImpl__quals__j_e_i_Any_j_e_i_DefaultProxyImpl() {
      super(null, null, null, null);
    }

    public void initProxyProperties(final PerspectivePluginManagerImpl instance) {

    }

    public PerspectivePluginManagerImpl asBeanType() {
      return this;
    }

    public void setInstance(final PerspectivePluginManagerImpl instance) {
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

    @Override public void getPerspectivePlugins(ParameterizedCommand callback) {
      if (proxyHelper != null) {
        final PerspectivePluginManagerImpl proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.getPerspectivePlugins(callback);
      } else {
        super.getPerspectivePlugins(callback);
      }
    }

    @Override public boolean isRuntimePerspective(Plugin plugin) {
      if (proxyHelper != null) {
        final PerspectivePluginManagerImpl proxiedInstance = proxyHelper.getInstance(this);
        final boolean retVal = proxiedInstance.isRuntimePerspective(plugin);
        return retVal;
      } else {
        return super.isRuntimePerspective(plugin);
      }
    }

    @Override public boolean isRuntimePerspective(NavItem navItem) {
      if (proxyHelper != null) {
        final PerspectivePluginManagerImpl proxiedInstance = proxyHelper.getInstance(this);
        final boolean retVal = proxiedInstance.isRuntimePerspective(navItem);
        return retVal;
      } else {
        return super.isRuntimePerspective(navItem);
      }
    }

    @Override public boolean isRuntimePerspective(String perspectiveId) {
      if (proxyHelper != null) {
        final PerspectivePluginManagerImpl proxiedInstance = proxyHelper.getInstance(this);
        final boolean retVal = proxiedInstance.isRuntimePerspective(perspectiveId);
        return retVal;
      } else {
        return super.isRuntimePerspective(perspectiveId);
      }
    }

    @Override public String getRuntimePerspectiveId(NavItem navItem) {
      if (proxyHelper != null) {
        final PerspectivePluginManagerImpl proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.getRuntimePerspectiveId(navItem);
        return retVal;
      } else {
        return super.getRuntimePerspectiveId(navItem);
      }
    }

    @Override public boolean existsPerspectivePlugin(String perspectiveName) {
      if (proxyHelper != null) {
        final PerspectivePluginManagerImpl proxiedInstance = proxyHelper.getInstance(this);
        final boolean retVal = proxiedInstance.existsPerspectivePlugin(perspectiveName);
        return retVal;
      } else {
        return super.existsPerspectivePlugin(perspectiveName);
      }
    }

    @Override public void getLayoutTemplateInfo(String perspectiveName, ParameterizedCommand callback) {
      if (proxyHelper != null) {
        final PerspectivePluginManagerImpl proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.getLayoutTemplateInfo(perspectiveName, callback);
      } else {
        super.getLayoutTemplateInfo(perspectiveName, callback);
      }
    }

    @Override public void getLayoutTemplateInfo(LayoutTemplate layoutTemplate, ParameterizedCommand callback) {
      if (proxyHelper != null) {
        final PerspectivePluginManagerImpl proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.getLayoutTemplateInfo(layoutTemplate, callback);
      } else {
        super.getLayoutTemplateInfo(layoutTemplate, callback);
      }
    }

    @Override public void buildPerspectiveWidget(String perspectiveName, LayoutTemplateContext layoutCtx, ParameterizedCommand afterBuild, ParameterizedCommand onInfiniteRecursion) {
      if (proxyHelper != null) {
        final PerspectivePluginManagerImpl proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.buildPerspectiveWidget(perspectiveName, layoutCtx, afterBuild, onInfiniteRecursion);
      } else {
        super.buildPerspectiveWidget(perspectiveName, layoutCtx, afterBuild, onInfiniteRecursion);
      }
    }

    @Override public NavGroup getLastBuildPerspectiveNavGroup() {
      if (proxyHelper != null) {
        final PerspectivePluginManagerImpl proxiedInstance = proxyHelper.getInstance(this);
        final NavGroup retVal = proxiedInstance.getLastBuildPerspectiveNavGroup();
        return retVal;
      } else {
        return super.getLastBuildPerspectiveNavGroup();
      }
    }

    @Override public void onPlugInAdded(PluginAdded event) {
      if (proxyHelper != null) {
        final PerspectivePluginManagerImpl proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.onPlugInAdded(event);
      } else {
        super.onPlugInAdded(event);
      }
    }

    @Override public void onPlugInSaved(PluginSaved event) {
      if (proxyHelper != null) {
        final PerspectivePluginManagerImpl proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.onPlugInSaved(event);
      } else {
        super.onPlugInSaved(event);
      }
    }

    @Override public void onPlugInRenamed(PluginRenamed event) {
      if (proxyHelper != null) {
        final PerspectivePluginManagerImpl proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.onPlugInRenamed(event);
      } else {
        super.onPlugInRenamed(event);
      }
    }

    @Override public void onPlugInDeleted(PluginDeleted event) {
      if (proxyHelper != null) {
        final PerspectivePluginManagerImpl proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.onPlugInDeleted(event);
      } else {
        super.onPlugInDeleted(event);
      }
    }

    @Override public void loadPlugins() {
      if (proxyHelper != null) {
        final PerspectivePluginManagerImpl proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.loadPlugins();
      } else {
        super.loadPlugins();
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final PerspectivePluginManagerImpl proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_n_p_PerspectivePluginManagerImpl__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(PerspectivePluginManagerImpl.class, "Type_factory__o_d_c_n_p_PerspectivePluginManagerImpl__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, true, null, true));
    handle.setAssignableTypes(new Class[] { PerspectivePluginManagerImpl.class, Object.class, PerspectivePluginManager.class });
  }

  public void init(final Context context) {
    CDI.subscribe("org.uberfire.ext.plugin.event.PluginAdded", new AbstractCDIEventCallback<PluginAdded>() {
      public void fireEvent(final PluginAdded event) {
        final PerspectivePluginManagerImpl instance = Factory.maybeUnwrapProxy((PerspectivePluginManagerImpl) context.getInstance("Type_factory__o_d_c_n_p_PerspectivePluginManagerImpl__quals__j_e_i_Any_j_e_i_Default"));
        instance.onPlugInAdded(event);
      }
      public String toString() {
        return "Observer: org.uberfire.ext.plugin.event.PluginAdded []";
      }
    });
    ErraiBus.get().subscribe("cdi.event:org.uberfire.ext.plugin.event.PluginAdded", CDI.ROUTING_CALLBACK);
    CDI.subscribe("org.uberfire.ext.plugin.event.PluginSaved", new AbstractCDIEventCallback<PluginSaved>() {
      public void fireEvent(final PluginSaved event) {
        final PerspectivePluginManagerImpl instance = Factory.maybeUnwrapProxy((PerspectivePluginManagerImpl) context.getInstance("Type_factory__o_d_c_n_p_PerspectivePluginManagerImpl__quals__j_e_i_Any_j_e_i_Default"));
        instance.onPlugInSaved(event);
      }
      public String toString() {
        return "Observer: org.uberfire.ext.plugin.event.PluginSaved []";
      }
    });
    ErraiBus.get().subscribe("cdi.event:org.uberfire.ext.plugin.event.PluginSaved", CDI.ROUTING_CALLBACK);
    CDI.subscribe("org.uberfire.ext.plugin.event.PluginRenamed", new AbstractCDIEventCallback<PluginRenamed>() {
      public void fireEvent(final PluginRenamed event) {
        final PerspectivePluginManagerImpl instance = Factory.maybeUnwrapProxy((PerspectivePluginManagerImpl) context.getInstance("Type_factory__o_d_c_n_p_PerspectivePluginManagerImpl__quals__j_e_i_Any_j_e_i_Default"));
        instance.onPlugInRenamed(event);
      }
      public String toString() {
        return "Observer: org.uberfire.ext.plugin.event.PluginRenamed []";
      }
    });
    ErraiBus.get().subscribe("cdi.event:org.uberfire.ext.plugin.event.PluginRenamed", CDI.ROUTING_CALLBACK);
    CDI.subscribe("org.uberfire.ext.plugin.event.PluginDeleted", new AbstractCDIEventCallback<PluginDeleted>() {
      public void fireEvent(final PluginDeleted event) {
        final PerspectivePluginManagerImpl instance = Factory.maybeUnwrapProxy((PerspectivePluginManagerImpl) context.getInstance("Type_factory__o_d_c_n_p_PerspectivePluginManagerImpl__quals__j_e_i_Any_j_e_i_Default"));
        instance.onPlugInDeleted(event);
      }
      public String toString() {
        return "Observer: org.uberfire.ext.plugin.event.PluginDeleted []";
      }
    });
    ErraiBus.get().subscribe("cdi.event:org.uberfire.ext.plugin.event.PluginDeleted", CDI.ROUTING_CALLBACK);
  }

  public PerspectivePluginManagerImpl createInstance(final ContextManager contextManager) {
    final Event<PerspectivePluginsChangedEvent> _perspectivesChangedEvent_3 = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { PerspectivePluginsChangedEvent.class }, new Annotation[] { });
    final NavigationManager _navigationManager_1 = (NavigationManagerImpl) contextManager.getInstance("Type_factory__o_d_c_n_i_NavigationManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    final Caller<PerspectivePluginServices> _pluginServices_2 = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { PerspectivePluginServices.class }, new Annotation[] { });
    final LayoutGenerator _layoutGenerator_0 = (BootstrapLayoutGenerator) contextManager.getInstance("Type_factory__o_u_e_l_e_c_g_BootstrapLayoutGenerator__quals__j_e_i_Any_j_e_i_Default");
    final PerspectivePluginManagerImpl instance = new PerspectivePluginManagerImpl(_layoutGenerator_0, _navigationManager_1, _pluginServices_2, _perspectivesChangedEvent_3);
    registerDependentScopedReference(instance, _perspectivesChangedEvent_3);
    registerDependentScopedReference(instance, _pluginServices_2);
    registerDependentScopedReference(instance, _layoutGenerator_0);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  private Proxy createProxyWithErrorMessage() {
    try {
      return new Type_factory__o_d_c_n_p_PerspectivePluginManagerImpl__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    } catch (Throwable t) {
      throw new RuntimeException("While creating a proxy for org.dashbuilder.client.navigation.plugin.PerspectivePluginManagerImpl an exception was thrown from this constructor: @javax.inject.Inject()  public org.dashbuilder.client.navigation.plugin.PerspectivePluginManagerImpl ([org.uberfire.ext.layout.editor.client.generator.LayoutGenerator, org.dashbuilder.client.navigation.NavigationManager, org.jboss.errai.common.client.api.Caller, javax.enterprise.event.Event])\nTo fix this problem, add a no-argument public or protected constructor for use in proxying.", t);
    }
  }

  public Proxy createProxy(final Context context) {
    final Proxy<PerspectivePluginManagerImpl> proxyImpl = createProxyWithErrorMessage();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }
}