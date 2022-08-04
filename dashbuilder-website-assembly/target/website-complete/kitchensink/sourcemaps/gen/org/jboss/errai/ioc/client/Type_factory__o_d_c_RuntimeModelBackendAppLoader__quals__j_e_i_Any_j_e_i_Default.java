package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.client.RuntimeModelBackendAppLoader;
import org.dashbuilder.client.error.ErrorResponseVerifier;
import org.dashbuilder.shared.service.RuntimeModelService;
import org.jboss.errai.common.client.api.Caller;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;

public class Type_factory__o_d_c_RuntimeModelBackendAppLoader__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimeModelBackendAppLoader> { private class Type_factory__o_d_c_RuntimeModelBackendAppLoader__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends RuntimeModelBackendAppLoader implements Proxy<RuntimeModelBackendAppLoader> {
    private final ProxyHelper<RuntimeModelBackendAppLoader> proxyHelper = new ProxyHelperImpl<RuntimeModelBackendAppLoader>("Type_factory__o_d_c_RuntimeModelBackendAppLoader__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final RuntimeModelBackendAppLoader instance) {

    }

    public RuntimeModelBackendAppLoader asBeanType() {
      return this;
    }

    public void setInstance(final RuntimeModelBackendAppLoader instance) {
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

    @Override public void getRuntimeModel(String runtimeModelId, Consumer runtimeModelConsumer, Consumer onError) {
      if (proxyHelper != null) {
        final RuntimeModelBackendAppLoader proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.getRuntimeModel(runtimeModelId, runtimeModelConsumer, onError);
      } else {
        super.getRuntimeModel(runtimeModelId, runtimeModelConsumer, onError);
      }
    }

    @Override public void getRuntimeModelInfo(String runtimeModelId, Consumer runtimeModelInfoConsumer, BiConsumer onError) {
      if (proxyHelper != null) {
        final RuntimeModelBackendAppLoader proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.getRuntimeModelInfo(runtimeModelId, runtimeModelInfoConsumer, onError);
      } else {
        super.getRuntimeModelInfo(runtimeModelId, runtimeModelInfoConsumer, onError);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final RuntimeModelBackendAppLoader proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_RuntimeModelBackendAppLoader__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(RuntimeModelBackendAppLoader.class, "Type_factory__o_d_c_RuntimeModelBackendAppLoader__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { RuntimeModelBackendAppLoader.class, Object.class });
  }

  public RuntimeModelBackendAppLoader createInstance(final ContextManager contextManager) {
    final RuntimeModelBackendAppLoader instance = new RuntimeModelBackendAppLoader();
    setIncompleteInstance(instance);
    final Caller RuntimeModelBackendAppLoader_runtimeModelServiceCaller = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { RuntimeModelService.class }, new Annotation[] { });
    registerDependentScopedReference(instance, RuntimeModelBackendAppLoader_runtimeModelServiceCaller);
    RuntimeModelBackendAppLoader_Caller_runtimeModelServiceCaller(instance, RuntimeModelBackendAppLoader_runtimeModelServiceCaller);
    final ErrorResponseVerifier RuntimeModelBackendAppLoader_verifier = (ErrorResponseVerifier) contextManager.getInstance("Type_factory__o_d_c_e_ErrorResponseVerifier__quals__j_e_i_Any_j_e_i_Default");
    RuntimeModelBackendAppLoader_ErrorResponseVerifier_verifier(instance, RuntimeModelBackendAppLoader_verifier);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<RuntimeModelBackendAppLoader> proxyImpl = new Type_factory__o_d_c_RuntimeModelBackendAppLoader__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  native static Caller RuntimeModelBackendAppLoader_Caller_runtimeModelServiceCaller(RuntimeModelBackendAppLoader instance) /*-{
    return instance.@org.dashbuilder.client.RuntimeModelBackendAppLoader::runtimeModelServiceCaller;
  }-*/;

  native static void RuntimeModelBackendAppLoader_Caller_runtimeModelServiceCaller(RuntimeModelBackendAppLoader instance, Caller<RuntimeModelService> value) /*-{
    instance.@org.dashbuilder.client.RuntimeModelBackendAppLoader::runtimeModelServiceCaller = value;
  }-*/;

  native static ErrorResponseVerifier RuntimeModelBackendAppLoader_ErrorResponseVerifier_verifier(RuntimeModelBackendAppLoader instance) /*-{
    return instance.@org.dashbuilder.client.RuntimeModelBackendAppLoader::verifier;
  }-*/;

  native static void RuntimeModelBackendAppLoader_ErrorResponseVerifier_verifier(RuntimeModelBackendAppLoader instance, ErrorResponseVerifier value) /*-{
    instance.@org.dashbuilder.client.RuntimeModelBackendAppLoader::verifier = value;
  }-*/;
}