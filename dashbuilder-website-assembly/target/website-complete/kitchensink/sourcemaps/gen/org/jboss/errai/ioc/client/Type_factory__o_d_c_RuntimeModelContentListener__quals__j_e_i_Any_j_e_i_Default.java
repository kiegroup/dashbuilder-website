package org.jboss.errai.ioc.client;

import java.util.function.Consumer;
import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.client.RuntimeCommunication;
import org.dashbuilder.client.RuntimeModelContentListener;
import org.dashbuilder.client.screens.RouterScreen;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;

public class Type_factory__o_d_c_RuntimeModelContentListener__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimeModelContentListener> { private class Type_factory__o_d_c_RuntimeModelContentListener__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends RuntimeModelContentListener implements Proxy<RuntimeModelContentListener> {
    private final ProxyHelper<RuntimeModelContentListener> proxyHelper = new ProxyHelperImpl<RuntimeModelContentListener>("Type_factory__o_d_c_RuntimeModelContentListener__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final RuntimeModelContentListener instance) {

    }

    public RuntimeModelContentListener asBeanType() {
      return this;
    }

    public void setInstance(final RuntimeModelContentListener instance) {
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

    @Override public void start(Consumer contentConsumer) {
      if (proxyHelper != null) {
        final RuntimeModelContentListener proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.start(contentConsumer);
      } else {
        super.start(contentConsumer);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final RuntimeModelContentListener proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_RuntimeModelContentListener__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(RuntimeModelContentListener.class, "Type_factory__o_d_c_RuntimeModelContentListener__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { RuntimeModelContentListener.class, Object.class });
  }

  public RuntimeModelContentListener createInstance(final ContextManager contextManager) {
    final RuntimeModelContentListener instance = new RuntimeModelContentListener();
    setIncompleteInstance(instance);
    final RuntimeCommunication RuntimeModelContentListener_runtimeCommunication = (RuntimeCommunication) contextManager.getInstance("Type_factory__o_d_c_RuntimeCommunication__quals__j_e_i_Any_j_e_i_Default");
    RuntimeModelContentListener_RuntimeCommunication_runtimeCommunication(instance, RuntimeModelContentListener_runtimeCommunication);
    final RouterScreen RuntimeModelContentListener_routerScreen = (RouterScreen) contextManager.getInstance("Type_factory__o_d_c_s_RouterScreen__quals__j_e_i_Any_j_e_i_Default");
    RuntimeModelContentListener_RouterScreen_routerScreen(instance, RuntimeModelContentListener_routerScreen);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<RuntimeModelContentListener> proxyImpl = new Type_factory__o_d_c_RuntimeModelContentListener__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  native static RuntimeCommunication RuntimeModelContentListener_RuntimeCommunication_runtimeCommunication(RuntimeModelContentListener instance) /*-{
    return instance.@org.dashbuilder.client.RuntimeModelContentListener::runtimeCommunication;
  }-*/;

  native static void RuntimeModelContentListener_RuntimeCommunication_runtimeCommunication(RuntimeModelContentListener instance, RuntimeCommunication value) /*-{
    instance.@org.dashbuilder.client.RuntimeModelContentListener::runtimeCommunication = value;
  }-*/;

  native static RouterScreen RuntimeModelContentListener_RouterScreen_routerScreen(RuntimeModelContentListener instance) /*-{
    return instance.@org.dashbuilder.client.RuntimeModelContentListener::routerScreen;
  }-*/;

  native static void RuntimeModelContentListener_RouterScreen_routerScreen(RuntimeModelContentListener instance, RouterScreen value) /*-{
    instance.@org.dashbuilder.client.RuntimeModelContentListener::routerScreen = value;
  }-*/;
}