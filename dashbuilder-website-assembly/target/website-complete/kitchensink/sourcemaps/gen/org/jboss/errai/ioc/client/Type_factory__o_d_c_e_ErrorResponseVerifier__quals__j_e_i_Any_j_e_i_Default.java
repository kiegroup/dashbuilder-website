package org.jboss.errai.ioc.client;

import elemental2.dom.Response;
import elemental2.dom.XMLHttpRequest;
import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.client.error.DefaultRuntimeErrorCallback;
import org.dashbuilder.client.error.ErrorResponseVerifier;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;

public class Type_factory__o_d_c_e_ErrorResponseVerifier__quals__j_e_i_Any_j_e_i_Default extends Factory<ErrorResponseVerifier> { private class Type_factory__o_d_c_e_ErrorResponseVerifier__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends ErrorResponseVerifier implements Proxy<ErrorResponseVerifier> {
    private final ProxyHelper<ErrorResponseVerifier> proxyHelper = new ProxyHelperImpl<ErrorResponseVerifier>("Type_factory__o_d_c_e_ErrorResponseVerifier__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final ErrorResponseVerifier instance) {

    }

    public ErrorResponseVerifier asBeanType() {
      return this;
    }

    public void setInstance(final ErrorResponseVerifier instance) {
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

    @Override public void verify(XMLHttpRequest xhr) {
      if (proxyHelper != null) {
        final ErrorResponseVerifier proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.verify(xhr);
      } else {
        super.verify(xhr);
      }
    }

    @Override public void verify(Response response) {
      if (proxyHelper != null) {
        final ErrorResponseVerifier proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.verify(response);
      } else {
        super.verify(response);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final ErrorResponseVerifier proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_e_ErrorResponseVerifier__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(ErrorResponseVerifier.class, "Type_factory__o_d_c_e_ErrorResponseVerifier__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { ErrorResponseVerifier.class, Object.class });
  }

  public ErrorResponseVerifier createInstance(final ContextManager contextManager) {
    final ErrorResponseVerifier instance = new ErrorResponseVerifier();
    setIncompleteInstance(instance);
    final DefaultRuntimeErrorCallback ErrorResponseVerifier_errorCallback = (DefaultRuntimeErrorCallback) contextManager.getInstance("Type_factory__o_d_c_e_DefaultRuntimeErrorCallback__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ErrorResponseVerifier_errorCallback);
    ErrorResponseVerifier_DefaultRuntimeErrorCallback_errorCallback(instance, ErrorResponseVerifier_errorCallback);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<ErrorResponseVerifier> proxyImpl = new Type_factory__o_d_c_e_ErrorResponseVerifier__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  native static DefaultRuntimeErrorCallback ErrorResponseVerifier_DefaultRuntimeErrorCallback_errorCallback(ErrorResponseVerifier instance) /*-{
    return instance.@org.dashbuilder.client.error.ErrorResponseVerifier::errorCallback;
  }-*/;

  native static void ErrorResponseVerifier_DefaultRuntimeErrorCallback_errorCallback(ErrorResponseVerifier instance, DefaultRuntimeErrorCallback value) /*-{
    instance.@org.dashbuilder.client.error.ErrorResponseVerifier::errorCallback = value;
  }-*/;
}