package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import javax.enterprise.context.ApplicationScoped;
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
import org.jboss.errai.ioc.client.container.SyncBeanManager;
import org.uberfire.client.mvp.ActivityBeansCache;
import org.uberfire.ext.layout.editor.api.PerspectiveServices;
import org.uberfire.ext.layout.editor.api.editor.LayoutTemplate;
import org.uberfire.ext.layout.editor.client.generator.BootstrapLayoutGenerator;
import org.uberfire.ext.layout.editor.client.generator.LayoutGenerator;
import org.uberfire.ext.plugin.client.perspective.editor.generator.PerspectiveEditorActivity;
import org.uberfire.ext.plugin.client.perspective.editor.generator.PerspectiveEditorGenerator;
import org.uberfire.ext.plugin.event.PluginAdded;
import org.uberfire.ext.plugin.event.PluginDeleted;
import org.uberfire.ext.plugin.event.PluginRenamed;
import org.uberfire.ext.plugin.event.PluginSaved;

public class Type_factory__o_u_e_p_c_p_e_g_PerspectiveEditorGenerator__quals__j_e_i_Any_j_e_i_Default extends Factory<PerspectiveEditorGenerator> { private class Type_factory__o_u_e_p_c_p_e_g_PerspectiveEditorGenerator__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends PerspectiveEditorGenerator implements Proxy<PerspectiveEditorGenerator> {
    private final ProxyHelper<PerspectiveEditorGenerator> proxyHelper = new ProxyHelperImpl<PerspectiveEditorGenerator>("Type_factory__o_u_e_p_c_p_e_g_PerspectiveEditorGenerator__quals__j_e_i_Any_j_e_i_Default");
    public Type_factory__o_u_e_p_c_p_e_g_PerspectiveEditorGenerator__quals__j_e_i_Any_j_e_i_DefaultProxyImpl() {
      super(null, null, null, null);
    }

    public void initProxyProperties(final PerspectiveEditorGenerator instance) {

    }

    public PerspectiveEditorGenerator asBeanType() {
      return this;
    }

    public void setInstance(final PerspectiveEditorGenerator instance) {
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

    @Override public void loadPerspectives() {
      if (proxyHelper != null) {
        final PerspectiveEditorGenerator proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.loadPerspectives();
      } else {
        super.loadPerspectives();
      }
    }

    @Override public void generatePerspective(String layoutEditorModel) {
      if (proxyHelper != null) {
        final PerspectiveEditorGenerator proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.generatePerspective(layoutEditorModel);
      } else {
        super.generatePerspective(layoutEditorModel);
      }
    }

    @Override public PerspectiveEditorActivity generatePerspective(LayoutTemplate layoutTemplate) {
      if (proxyHelper != null) {
        final PerspectiveEditorGenerator proxiedInstance = proxyHelper.getInstance(this);
        final PerspectiveEditorActivity retVal = proxiedInstance.generatePerspective(layoutTemplate);
        return retVal;
      } else {
        return super.generatePerspective(layoutTemplate);
      }
    }

    @Override public void removePerspective(String perspectiveName) {
      if (proxyHelper != null) {
        final PerspectiveEditorGenerator proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.removePerspective(perspectiveName);
      } else {
        super.removePerspective(perspectiveName);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final PerspectiveEditorGenerator proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_u_e_p_c_p_e_g_PerspectiveEditorGenerator__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(PerspectiveEditorGenerator.class, "Type_factory__o_u_e_p_c_p_e_g_PerspectiveEditorGenerator__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, true, null, true));
    handle.setAssignableTypes(new Class[] { PerspectiveEditorGenerator.class, Object.class });
  }

  public void init(final Context context) {
    CDI.subscribe("org.uberfire.ext.plugin.event.PluginAdded", new AbstractCDIEventCallback<PluginAdded>() {
      public void fireEvent(final PluginAdded event) {
        final PerspectiveEditorGenerator instance = Factory.maybeUnwrapProxy((PerspectiveEditorGenerator) context.getInstance("Type_factory__o_u_e_p_c_p_e_g_PerspectiveEditorGenerator__quals__j_e_i_Any_j_e_i_Default"));
        PerspectiveEditorGenerator_onPlugInAdded_PluginAdded(instance, event);
      }
      public String toString() {
        return "Observer: org.uberfire.ext.plugin.event.PluginAdded []";
      }
    });
    ErraiBus.get().subscribe("cdi.event:org.uberfire.ext.plugin.event.PluginAdded", CDI.ROUTING_CALLBACK);
    CDI.subscribe("org.uberfire.ext.plugin.event.PluginSaved", new AbstractCDIEventCallback<PluginSaved>() {
      public void fireEvent(final PluginSaved event) {
        final PerspectiveEditorGenerator instance = Factory.maybeUnwrapProxy((PerspectiveEditorGenerator) context.getInstance("Type_factory__o_u_e_p_c_p_e_g_PerspectiveEditorGenerator__quals__j_e_i_Any_j_e_i_Default"));
        PerspectiveEditorGenerator_onPlugInSaved_PluginSaved(instance, event);
      }
      public String toString() {
        return "Observer: org.uberfire.ext.plugin.event.PluginSaved []";
      }
    });
    ErraiBus.get().subscribe("cdi.event:org.uberfire.ext.plugin.event.PluginSaved", CDI.ROUTING_CALLBACK);
    CDI.subscribe("org.uberfire.ext.plugin.event.PluginRenamed", new AbstractCDIEventCallback<PluginRenamed>() {
      public void fireEvent(final PluginRenamed event) {
        final PerspectiveEditorGenerator instance = Factory.maybeUnwrapProxy((PerspectiveEditorGenerator) context.getInstance("Type_factory__o_u_e_p_c_p_e_g_PerspectiveEditorGenerator__quals__j_e_i_Any_j_e_i_Default"));
        PerspectiveEditorGenerator_onPlugInRenamed_PluginRenamed(instance, event);
      }
      public String toString() {
        return "Observer: org.uberfire.ext.plugin.event.PluginRenamed []";
      }
    });
    ErraiBus.get().subscribe("cdi.event:org.uberfire.ext.plugin.event.PluginRenamed", CDI.ROUTING_CALLBACK);
    CDI.subscribe("org.uberfire.ext.plugin.event.PluginDeleted", new AbstractCDIEventCallback<PluginDeleted>() {
      public void fireEvent(final PluginDeleted event) {
        final PerspectiveEditorGenerator instance = Factory.maybeUnwrapProxy((PerspectiveEditorGenerator) context.getInstance("Type_factory__o_u_e_p_c_p_e_g_PerspectiveEditorGenerator__quals__j_e_i_Any_j_e_i_Default"));
        PerspectiveEditorGenerator_onPlugInDeleted_PluginDeleted(instance, event);
      }
      public String toString() {
        return "Observer: org.uberfire.ext.plugin.event.PluginDeleted []";
      }
    });
    ErraiBus.get().subscribe("cdi.event:org.uberfire.ext.plugin.event.PluginDeleted", CDI.ROUTING_CALLBACK);
  }

  public PerspectiveEditorGenerator createInstance(final ContextManager contextManager) {
    final Caller<PerspectiveServices> _perspectiveServices_3 = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { PerspectiveServices.class }, new Annotation[] { });
    final SyncBeanManager _beanManager_0 = (SyncBeanManager) contextManager.getInstance("Producer_factory__o_j_e_i_c_c_SyncBeanManager__quals__j_e_i_Any_j_e_i_Default");
    final ActivityBeansCache _activityBeansCache_1 = (ActivityBeansCache) contextManager.getInstance("Type_factory__o_u_c_m_ActivityBeansCache__quals__j_e_i_Any_j_e_i_Default");
    final LayoutGenerator _layoutGenerator_2 = (BootstrapLayoutGenerator) contextManager.getInstance("Type_factory__o_u_e_l_e_c_g_BootstrapLayoutGenerator__quals__j_e_i_Any_j_e_i_Default");
    final PerspectiveEditorGenerator instance = new PerspectiveEditorGenerator(_beanManager_0, _activityBeansCache_1, _layoutGenerator_2, _perspectiveServices_3);
    registerDependentScopedReference(instance, _perspectiveServices_3);
    registerDependentScopedReference(instance, _beanManager_0);
    registerDependentScopedReference(instance, _layoutGenerator_2);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final PerspectiveEditorGenerator instance) {
    instance.loadPerspectives();
  }

  private Proxy createProxyWithErrorMessage() {
    try {
      return new Type_factory__o_u_e_p_c_p_e_g_PerspectiveEditorGenerator__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    } catch (Throwable t) {
      throw new RuntimeException("While creating a proxy for org.uberfire.ext.plugin.client.perspective.editor.generator.PerspectiveEditorGenerator an exception was thrown from this constructor: @javax.inject.Inject()  public org.uberfire.ext.plugin.client.perspective.editor.generator.PerspectiveEditorGenerator ([org.jboss.errai.ioc.client.container.SyncBeanManager, org.uberfire.client.mvp.ActivityBeansCache, org.uberfire.ext.layout.editor.client.generator.LayoutGenerator, org.jboss.errai.common.client.api.Caller])\nTo fix this problem, add a no-argument public or protected constructor for use in proxying.", t);
    }
  }

  public Proxy createProxy(final Context context) {
    final Proxy<PerspectiveEditorGenerator> proxyImpl = createProxyWithErrorMessage();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  public native static void PerspectiveEditorGenerator_onPlugInRenamed_PluginRenamed(PerspectiveEditorGenerator instance, PluginRenamed a0) /*-{
    instance.@org.uberfire.ext.plugin.client.perspective.editor.generator.PerspectiveEditorGenerator::onPlugInRenamed(Lorg/uberfire/ext/plugin/event/PluginRenamed;)(a0);
  }-*/;

  public native static void PerspectiveEditorGenerator_onPlugInAdded_PluginAdded(PerspectiveEditorGenerator instance, PluginAdded a0) /*-{
    instance.@org.uberfire.ext.plugin.client.perspective.editor.generator.PerspectiveEditorGenerator::onPlugInAdded(Lorg/uberfire/ext/plugin/event/PluginAdded;)(a0);
  }-*/;

  public native static void PerspectiveEditorGenerator_onPlugInDeleted_PluginDeleted(PerspectiveEditorGenerator instance, PluginDeleted a0) /*-{
    instance.@org.uberfire.ext.plugin.client.perspective.editor.generator.PerspectiveEditorGenerator::onPlugInDeleted(Lorg/uberfire/ext/plugin/event/PluginDeleted;)(a0);
  }-*/;

  public native static void PerspectiveEditorGenerator_onPlugInSaved_PluginSaved(PerspectiveEditorGenerator instance, PluginSaved a0) /*-{
    instance.@org.uberfire.ext.plugin.client.perspective.editor.generator.PerspectiveEditorGenerator::onPlugInSaved(Lorg/uberfire/ext/plugin/event/PluginSaved;)(a0);
  }-*/;
}