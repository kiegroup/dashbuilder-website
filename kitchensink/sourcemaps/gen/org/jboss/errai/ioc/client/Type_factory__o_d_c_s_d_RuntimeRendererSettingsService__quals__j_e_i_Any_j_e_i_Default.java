package org.jboss.errai.ioc.client;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.client.services.dummy.RuntimeRendererSettingsService;
import org.dashbuilder.renderer.RendererSettings;
import org.dashbuilder.renderer.service.RendererSettingsService;
import org.jboss.errai.bus.client.ErraiBus;
import org.jboss.errai.bus.client.api.ClientMessageBus;
import org.jboss.errai.bus.client.api.base.MessageBuilder;
import org.jboss.errai.bus.client.api.messaging.Message;
import org.jboss.errai.bus.client.api.messaging.MessageCallback;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;
import org.jboss.errai.ioc.support.bus.client.ServiceNotReady;
import org.jboss.errai.ioc.support.bus.client.ShadowServiceHelper;

public class Type_factory__o_d_c_s_d_RuntimeRendererSettingsService__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimeRendererSettingsService> { private class Type_factory__o_d_c_s_d_RuntimeRendererSettingsService__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends RuntimeRendererSettingsService implements Proxy<RuntimeRendererSettingsService> {
    private final ProxyHelper<RuntimeRendererSettingsService> proxyHelper = new ProxyHelperImpl<RuntimeRendererSettingsService>("Type_factory__o_d_c_s_d_RuntimeRendererSettingsService__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final RuntimeRendererSettingsService instance) {

    }

    public RuntimeRendererSettingsService asBeanType() {
      return this;
    }

    public void setInstance(final RuntimeRendererSettingsService instance) {
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

    @Override public RendererSettings getSettings() {
      if (proxyHelper != null) {
        final RuntimeRendererSettingsService proxiedInstance = proxyHelper.getInstance(this);
        final RendererSettings retVal = proxiedInstance.getSettings();
        return retVal;
      } else {
        return super.getSettings();
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final RuntimeRendererSettingsService proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_s_d_RuntimeRendererSettingsService__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(RuntimeRendererSettingsService.class, "Type_factory__o_d_c_s_d_RuntimeRendererSettingsService__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { RuntimeRendererSettingsService.class, Object.class, RendererSettingsService.class });
  }

  public void init(final Context context) {
    ((ClientMessageBus) ErraiBus.get()).subscribeShadow("org.dashbuilder.renderer.service.RendererSettingsService:RPC", new MessageCallback() {
      public void callback(Message message) {
        String commandType = message.getCommandType();
        List methodParms = message.get(List.class, "MethodParms");
        if ("getSettings:".equals(commandType)) {
          final RendererSettingsService instance = (RuntimeRendererSettingsService) context.getInstance("Type_factory__o_d_c_s_d_RuntimeRendererSettingsService__quals__j_e_i_Any_j_e_i_Default");
          final Runnable invocation = new Runnable() {
            public void run() {
              try {
                final RendererSettings ret = instance.getSettings();
                MessageBuilder.createConversation(message).subjectProvided().with("MethodReply", ret).noErrorHandling().sendNowWith(ErraiBus.get());
              } catch (RuntimeException ex) {
                throw ex;
              } catch (Throwable t) {
                throw new RuntimeException(t);
              }
            }
          };
          try {
            invocation.run();
          } catch (ServiceNotReady ex) {
            ShadowServiceHelper.deferred(invocation);
          }
        }
      }
    });
  }

  public RuntimeRendererSettingsService createInstance(final ContextManager contextManager) {
    final RuntimeRendererSettingsService instance = new RuntimeRendererSettingsService();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<RuntimeRendererSettingsService> proxyImpl = new Type_factory__o_d_c_s_d_RuntimeRendererSettingsService__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }
}