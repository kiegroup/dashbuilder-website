package org.jboss.errai.ioc.client;

import com.google.gwt.user.client.ui.IsWidget;
import javax.enterprise.context.ApplicationScoped;
import org.gwtbootstrap3.client.ui.Modal;
import org.jboss.errai.bus.client.ErraiBus;
import org.jboss.errai.enterprise.client.cdi.AbstractCDIEventCallback;
import org.jboss.errai.enterprise.client.cdi.api.CDI;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;
import org.uberfire.client.mvp.PlaceManager;
import org.uberfire.client.mvp.PlaceManagerImpl;
import org.uberfire.ext.layout.editor.client.api.HasConfiguration;
import org.uberfire.ext.layout.editor.client.api.HasModalConfiguration;
import org.uberfire.ext.layout.editor.client.api.LayoutDragComponent;
import org.uberfire.ext.layout.editor.client.api.ModalConfigurationContext;
import org.uberfire.ext.layout.editor.client.api.RenderingContext;
import org.uberfire.ext.plugin.client.perspective.editor.layout.editor.ScreenLayoutDragComponent;
import org.uberfire.ext.plugin.event.NewPluginRegistered;
import org.uberfire.ext.plugin.event.PluginUnregistered;
import org.uberfire.ext.properties.editor.model.PropertyEditorChangeEvent;

public class Type_factory__o_u_e_p_c_p_e_l_e_ScreenLayoutDragComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<ScreenLayoutDragComponent> { private class Type_factory__o_u_e_p_c_p_e_l_e_ScreenLayoutDragComponent__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends ScreenLayoutDragComponent implements Proxy<ScreenLayoutDragComponent> {
    private final ProxyHelper<ScreenLayoutDragComponent> proxyHelper = new ProxyHelperImpl<ScreenLayoutDragComponent>("Type_factory__o_u_e_p_c_p_e_l_e_ScreenLayoutDragComponent__quals__j_e_i_Any_j_e_i_Default");
    public Type_factory__o_u_e_p_c_p_e_l_e_ScreenLayoutDragComponent__quals__j_e_i_Any_j_e_i_DefaultProxyImpl() {
      super(null);
    }

    public void initProxyProperties(final ScreenLayoutDragComponent instance) {

    }

    public ScreenLayoutDragComponent asBeanType() {
      return this;
    }

    public void setInstance(final ScreenLayoutDragComponent instance) {
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

    @Override public void setup() {
      if (proxyHelper != null) {
        final ScreenLayoutDragComponent proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.setup();
      } else {
        super.setup();
      }
    }

    @Override public String getDragComponentTitle() {
      if (proxyHelper != null) {
        final ScreenLayoutDragComponent proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.getDragComponentTitle();
        return retVal;
      } else {
        return super.getDragComponentTitle();
      }
    }

    @Override public String getDragComponentIconClass() {
      if (proxyHelper != null) {
        final ScreenLayoutDragComponent proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.getDragComponentIconClass();
        return retVal;
      } else {
        return super.getDragComponentIconClass();
      }
    }

    @Override public IsWidget getPreviewWidget(RenderingContext ctx) {
      if (proxyHelper != null) {
        final ScreenLayoutDragComponent proxiedInstance = proxyHelper.getInstance(this);
        final IsWidget retVal = proxiedInstance.getPreviewWidget(ctx);
        return retVal;
      } else {
        return super.getPreviewWidget(ctx);
      }
    }

    @Override public void removeCurrentWidget(RenderingContext ctx) {
      if (proxyHelper != null) {
        final ScreenLayoutDragComponent proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.removeCurrentWidget(ctx);
      } else {
        super.removeCurrentWidget(ctx);
      }
    }

    @Override public IsWidget getShowWidget(RenderingContext ctx) {
      if (proxyHelper != null) {
        final ScreenLayoutDragComponent proxiedInstance = proxyHelper.getInstance(this);
        final IsWidget retVal = proxiedInstance.getShowWidget(ctx);
        return retVal;
      } else {
        return super.getShowWidget(ctx);
      }
    }

    @Override public Modal getConfigurationModal(ModalConfigurationContext ctx) {
      if (proxyHelper != null) {
        final ScreenLayoutDragComponent proxiedInstance = proxyHelper.getInstance(this);
        final Modal retVal = proxiedInstance.getConfigurationModal(ctx);
        return retVal;
      } else {
        return super.getConfigurationModal(ctx);
      }
    }

    @Override public void observeEditComponentEventFromPropertyEditor(PropertyEditorChangeEvent event) {
      if (proxyHelper != null) {
        final ScreenLayoutDragComponent proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.observeEditComponentEventFromPropertyEditor(event);
      } else {
        super.observeEditComponentEventFromPropertyEditor(event);
      }
    }

    @Override public void onNewPluginRegistered(NewPluginRegistered newPluginRegistered) {
      if (proxyHelper != null) {
        final ScreenLayoutDragComponent proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.onNewPluginRegistered(newPluginRegistered);
      } else {
        super.onNewPluginRegistered(newPluginRegistered);
      }
    }

    @Override public void onPluginUnregistered(PluginUnregistered pluginUnregistered) {
      if (proxyHelper != null) {
        final ScreenLayoutDragComponent proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.onPluginUnregistered(pluginUnregistered);
      } else {
        super.onPluginUnregistered(pluginUnregistered);
      }
    }

    @Override protected void updateScreensList() {
      if (proxyHelper != null) {
        final ScreenLayoutDragComponent proxiedInstance = proxyHelper.getInstance(this);
        ScreenLayoutDragComponent_updateScreensList(proxiedInstance);
      } else {
        super.updateScreensList();
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final ScreenLayoutDragComponent proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_u_e_p_c_p_e_l_e_ScreenLayoutDragComponent__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(ScreenLayoutDragComponent.class, "Type_factory__o_u_e_p_c_p_e_l_e_ScreenLayoutDragComponent__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { ScreenLayoutDragComponent.class, Object.class, LayoutDragComponent.class, HasModalConfiguration.class, HasConfiguration.class });
  }

  public void init(final Context context) {
    CDI.subscribeLocal("org.uberfire.ext.properties.editor.model.PropertyEditorChangeEvent", new AbstractCDIEventCallback<PropertyEditorChangeEvent>() {
      public void fireEvent(final PropertyEditorChangeEvent event) {
        final ScreenLayoutDragComponent instance = Factory.maybeUnwrapProxy((ScreenLayoutDragComponent) context.getInstance("Type_factory__o_u_e_p_c_p_e_l_e_ScreenLayoutDragComponent__quals__j_e_i_Any_j_e_i_Default"));
        instance.observeEditComponentEventFromPropertyEditor(event);
      }
      public String toString() {
        return "Observer: org.uberfire.ext.properties.editor.model.PropertyEditorChangeEvent []";
      }
    });
    CDI.subscribe("org.uberfire.ext.plugin.event.NewPluginRegistered", new AbstractCDIEventCallback<NewPluginRegistered>() {
      public void fireEvent(final NewPluginRegistered event) {
        final ScreenLayoutDragComponent instance = Factory.maybeUnwrapProxy((ScreenLayoutDragComponent) context.getInstance("Type_factory__o_u_e_p_c_p_e_l_e_ScreenLayoutDragComponent__quals__j_e_i_Any_j_e_i_Default"));
        instance.onNewPluginRegistered(event);
      }
      public String toString() {
        return "Observer: org.uberfire.ext.plugin.event.NewPluginRegistered []";
      }
    });
    ErraiBus.get().subscribe("cdi.event:org.uberfire.ext.plugin.event.NewPluginRegistered", CDI.ROUTING_CALLBACK);
    CDI.subscribe("org.uberfire.ext.plugin.event.PluginUnregistered", new AbstractCDIEventCallback<PluginUnregistered>() {
      public void fireEvent(final PluginUnregistered event) {
        final ScreenLayoutDragComponent instance = Factory.maybeUnwrapProxy((ScreenLayoutDragComponent) context.getInstance("Type_factory__o_u_e_p_c_p_e_l_e_ScreenLayoutDragComponent__quals__j_e_i_Any_j_e_i_Default"));
        instance.onPluginUnregistered(event);
      }
      public String toString() {
        return "Observer: org.uberfire.ext.plugin.event.PluginUnregistered []";
      }
    });
    ErraiBus.get().subscribe("cdi.event:org.uberfire.ext.plugin.event.PluginUnregistered", CDI.ROUTING_CALLBACK);
  }

  public ScreenLayoutDragComponent createInstance(final ContextManager contextManager) {
    final PlaceManager _placeManager_0 = (PlaceManagerImpl) contextManager.getInstance("Type_factory__o_u_c_m_PlaceManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    final ScreenLayoutDragComponent instance = new ScreenLayoutDragComponent(_placeManager_0);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final ScreenLayoutDragComponent instance) {
    instance.setup();
  }

  private Proxy createProxyWithErrorMessage() {
    try {
      return new Type_factory__o_u_e_p_c_p_e_l_e_ScreenLayoutDragComponent__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    } catch (Throwable t) {
      throw new RuntimeException("While creating a proxy for org.uberfire.ext.plugin.client.perspective.editor.layout.editor.ScreenLayoutDragComponent an exception was thrown from this constructor: @javax.inject.Inject()  public org.uberfire.ext.plugin.client.perspective.editor.layout.editor.ScreenLayoutDragComponent ([org.uberfire.client.mvp.PlaceManager])\nTo fix this problem, add a no-argument public or protected constructor for use in proxying.", t);
    }
  }

  public Proxy createProxy(final Context context) {
    final Proxy<ScreenLayoutDragComponent> proxyImpl = createProxyWithErrorMessage();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  public native static void ScreenLayoutDragComponent_updateScreensList(ScreenLayoutDragComponent instance) /*-{
    instance.@org.uberfire.ext.plugin.client.perspective.editor.layout.editor.ScreenLayoutDragComponent::updateScreensList()();
  }-*/;
}