package org.jboss.errai.ioc.client;

import java.util.List;
import java.util.Map;
import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.client.RuntimeClientLoader;
import org.dashbuilder.client.error.ErrorResponseVerifier;
import org.dashbuilder.client.services.RuntimeBackendComponentFunctionService;
import org.dashbuilder.external.service.BackendComponentFunctionService;
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

public class Type_factory__o_d_c_s_RuntimeBackendComponentFunctionService__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimeBackendComponentFunctionService> { private class Type_factory__o_d_c_s_RuntimeBackendComponentFunctionService__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends RuntimeBackendComponentFunctionService implements Proxy<RuntimeBackendComponentFunctionService> {
    private final ProxyHelper<RuntimeBackendComponentFunctionService> proxyHelper = new ProxyHelperImpl<RuntimeBackendComponentFunctionService>("Type_factory__o_d_c_s_RuntimeBackendComponentFunctionService__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final RuntimeBackendComponentFunctionService instance) {

    }

    public RuntimeBackendComponentFunctionService asBeanType() {
      return this;
    }

    public void setInstance(final RuntimeBackendComponentFunctionService instance) {
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

    @Override public List listFunctions() {
      if (proxyHelper != null) {
        final RuntimeBackendComponentFunctionService proxiedInstance = proxyHelper.getInstance(this);
        final List retVal = proxiedInstance.listFunctions();
        return retVal;
      } else {
        return super.listFunctions();
      }
    }

    @Override public Object callFunction(String name, Map params) {
      if (proxyHelper != null) {
        final RuntimeBackendComponentFunctionService proxiedInstance = proxyHelper.getInstance(this);
        final Object retVal = proxiedInstance.callFunction(name, params);
        return retVal;
      } else {
        return super.callFunction(name, params);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final RuntimeBackendComponentFunctionService proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_s_RuntimeBackendComponentFunctionService__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(RuntimeBackendComponentFunctionService.class, "Type_factory__o_d_c_s_RuntimeBackendComponentFunctionService__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { RuntimeBackendComponentFunctionService.class, Object.class, BackendComponentFunctionService.class });
  }

  public void init(final Context context) {
    ((ClientMessageBus) ErraiBus.get()).subscribeShadow("org.dashbuilder.external.service.BackendComponentFunctionService:RPC", new MessageCallback() {
      public void callback(Message message) {
        String commandType = message.getCommandType();
        List methodParms = message.get(List.class, "MethodParms");
        if ("listFunctions:".equals(commandType)) {
          final BackendComponentFunctionService instance = (RuntimeBackendComponentFunctionService) context.getInstance("Type_factory__o_d_c_s_RuntimeBackendComponentFunctionService__quals__j_e_i_Any_j_e_i_Default");
          final Runnable invocation = new Runnable() {
            public void run() {
              try {
                final List<String> ret = instance.listFunctions();
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
        if ("callFunction:java.lang.String:java.util.Map:".equals(commandType)) {
          final BackendComponentFunctionService instance = (RuntimeBackendComponentFunctionService) context.getInstance("Type_factory__o_d_c_s_RuntimeBackendComponentFunctionService__quals__j_e_i_Any_j_e_i_Default");
          final Runnable invocation = new Runnable() {
            public void run() {
              try {
                final Object ret = instance.callFunction((String) methodParms.get(0), (Map) methodParms.get(1));
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

  public RuntimeBackendComponentFunctionService createInstance(final ContextManager contextManager) {
    final RuntimeBackendComponentFunctionService instance = new RuntimeBackendComponentFunctionService();
    setIncompleteInstance(instance);
    final RuntimeClientLoader RuntimeBackendComponentFunctionService_loader = (RuntimeClientLoader) contextManager.getInstance("Type_factory__o_d_c_RuntimeClientLoader__quals__j_e_i_Any_j_e_i_Default");
    RuntimeBackendComponentFunctionService_RuntimeClientLoader_loader(instance, RuntimeBackendComponentFunctionService_loader);
    final ErrorResponseVerifier RuntimeBackendComponentFunctionService_verifier = (ErrorResponseVerifier) contextManager.getInstance("Type_factory__o_d_c_e_ErrorResponseVerifier__quals__j_e_i_Any_j_e_i_Default");
    RuntimeBackendComponentFunctionService_ErrorResponseVerifier_verifier(instance, RuntimeBackendComponentFunctionService_verifier);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<RuntimeBackendComponentFunctionService> proxyImpl = new Type_factory__o_d_c_s_RuntimeBackendComponentFunctionService__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  native static RuntimeClientLoader RuntimeBackendComponentFunctionService_RuntimeClientLoader_loader(RuntimeBackendComponentFunctionService instance) /*-{
    return instance.@org.dashbuilder.client.services.RuntimeBackendComponentFunctionService::loader;
  }-*/;

  native static void RuntimeBackendComponentFunctionService_RuntimeClientLoader_loader(RuntimeBackendComponentFunctionService instance, RuntimeClientLoader value) /*-{
    instance.@org.dashbuilder.client.services.RuntimeBackendComponentFunctionService::loader = value;
  }-*/;

  native static ErrorResponseVerifier RuntimeBackendComponentFunctionService_ErrorResponseVerifier_verifier(RuntimeBackendComponentFunctionService instance) /*-{
    return instance.@org.dashbuilder.client.services.RuntimeBackendComponentFunctionService::verifier;
  }-*/;

  native static void RuntimeBackendComponentFunctionService_ErrorResponseVerifier_verifier(RuntimeBackendComponentFunctionService instance, ErrorResponseVerifier value) /*-{
    instance.@org.dashbuilder.client.services.RuntimeBackendComponentFunctionService::verifier = value;
  }-*/;
}