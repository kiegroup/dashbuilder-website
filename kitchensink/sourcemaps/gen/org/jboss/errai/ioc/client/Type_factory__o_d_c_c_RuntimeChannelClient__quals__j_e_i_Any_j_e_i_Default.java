package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Event;
import org.dashbuilder.client.RuntimeClientLoader;
import org.dashbuilder.client.channel.RuntimeChannelClient;
import org.dashbuilder.shared.event.RemovedRuntimeModelEvent;
import org.dashbuilder.shared.event.UpdatedRuntimeModelEvent;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;

public class Type_factory__o_d_c_c_RuntimeChannelClient__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimeChannelClient> { private class Type_factory__o_d_c_c_RuntimeChannelClient__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends RuntimeChannelClient implements Proxy<RuntimeChannelClient> {
    private final ProxyHelper<RuntimeChannelClient> proxyHelper = new ProxyHelperImpl<RuntimeChannelClient>("Type_factory__o_d_c_c_RuntimeChannelClient__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final RuntimeChannelClient instance) {

    }

    public RuntimeChannelClient asBeanType() {
      return this;
    }

    public void setInstance(final RuntimeChannelClient instance) {
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

    @Override public void subscribe() {
      if (proxyHelper != null) {
        final RuntimeChannelClient proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.subscribe();
      } else {
        super.subscribe();
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final RuntimeChannelClient proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_c_RuntimeChannelClient__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(RuntimeChannelClient.class, "Type_factory__o_d_c_c_RuntimeChannelClient__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { RuntimeChannelClient.class, Object.class });
  }

  public RuntimeChannelClient createInstance(final ContextManager contextManager) {
    final RuntimeChannelClient instance = new RuntimeChannelClient();
    setIncompleteInstance(instance);
    final Event RuntimeChannelClient_updatedModelEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { UpdatedRuntimeModelEvent.class }, new Annotation[] { });
    registerDependentScopedReference(instance, RuntimeChannelClient_updatedModelEvent);
    RuntimeChannelClient_Event_updatedModelEvent(instance, RuntimeChannelClient_updatedModelEvent);
    final Event RuntimeChannelClient_removedModelEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { RemovedRuntimeModelEvent.class }, new Annotation[] { });
    registerDependentScopedReference(instance, RuntimeChannelClient_removedModelEvent);
    RuntimeChannelClient_Event_removedModelEvent(instance, RuntimeChannelClient_removedModelEvent);
    final RuntimeClientLoader RuntimeChannelClient_loader = (RuntimeClientLoader) contextManager.getInstance("Type_factory__o_d_c_RuntimeClientLoader__quals__j_e_i_Any_j_e_i_Default");
    RuntimeChannelClient_RuntimeClientLoader_loader(instance, RuntimeChannelClient_loader);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<RuntimeChannelClient> proxyImpl = new Type_factory__o_d_c_c_RuntimeChannelClient__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  native static Event RuntimeChannelClient_Event_removedModelEvent(RuntimeChannelClient instance) /*-{
    return instance.@org.dashbuilder.client.channel.RuntimeChannelClient::removedModelEvent;
  }-*/;

  native static void RuntimeChannelClient_Event_removedModelEvent(RuntimeChannelClient instance, Event<RemovedRuntimeModelEvent> value) /*-{
    instance.@org.dashbuilder.client.channel.RuntimeChannelClient::removedModelEvent = value;
  }-*/;

  native static Event RuntimeChannelClient_Event_updatedModelEvent(RuntimeChannelClient instance) /*-{
    return instance.@org.dashbuilder.client.channel.RuntimeChannelClient::updatedModelEvent;
  }-*/;

  native static void RuntimeChannelClient_Event_updatedModelEvent(RuntimeChannelClient instance, Event<UpdatedRuntimeModelEvent> value) /*-{
    instance.@org.dashbuilder.client.channel.RuntimeChannelClient::updatedModelEvent = value;
  }-*/;

  native static RuntimeClientLoader RuntimeChannelClient_RuntimeClientLoader_loader(RuntimeChannelClient instance) /*-{
    return instance.@org.dashbuilder.client.channel.RuntimeChannelClient::loader;
  }-*/;

  native static void RuntimeChannelClient_RuntimeClientLoader_loader(RuntimeChannelClient instance, RuntimeClientLoader value) /*-{
    instance.@org.dashbuilder.client.channel.RuntimeChannelClient::loader = value;
  }-*/;
}