package org.jboss.errai.ioc.client;

import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.dataset.client.uuid.ClientUUIDGenerator;
import org.dashbuilder.dataset.uuid.UUIDGenerator;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;

public class Type_factory__o_d_d_c_u_ClientUUIDGenerator__quals__j_e_i_Any_j_e_i_Default extends Factory<ClientUUIDGenerator> { private class Type_factory__o_d_d_c_u_ClientUUIDGenerator__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends ClientUUIDGenerator implements Proxy<ClientUUIDGenerator> {
    private final ProxyHelper<ClientUUIDGenerator> proxyHelper = new ProxyHelperImpl<ClientUUIDGenerator>("Type_factory__o_d_d_c_u_ClientUUIDGenerator__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final ClientUUIDGenerator instance) {

    }

    public ClientUUIDGenerator asBeanType() {
      return this;
    }

    public void setInstance(final ClientUUIDGenerator instance) {
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

    @Override public String newUuid() {
      if (proxyHelper != null) {
        final ClientUUIDGenerator proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.newUuid();
        return retVal;
      } else {
        return super.newUuid();
      }
    }

    @Override public String newUuidBase64() {
      if (proxyHelper != null) {
        final ClientUUIDGenerator proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.newUuidBase64();
        return retVal;
      } else {
        return super.newUuidBase64();
      }
    }

    @Override public String uuidToBase64(String str) {
      if (proxyHelper != null) {
        final ClientUUIDGenerator proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.uuidToBase64(str);
        return retVal;
      } else {
        return super.uuidToBase64(str);
      }
    }

    @Override public String uuidFromBase64(String str) {
      if (proxyHelper != null) {
        final ClientUUIDGenerator proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.uuidFromBase64(str);
        return retVal;
      } else {
        return super.uuidFromBase64(str);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final ClientUUIDGenerator proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_d_c_u_ClientUUIDGenerator__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(ClientUUIDGenerator.class, "Type_factory__o_d_d_c_u_ClientUUIDGenerator__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { ClientUUIDGenerator.class, Object.class, UUIDGenerator.class });
  }

  public ClientUUIDGenerator createInstance(final ContextManager contextManager) {
    final ClientUUIDGenerator instance = new ClientUUIDGenerator();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<ClientUUIDGenerator> proxyImpl = new Type_factory__o_d_d_c_u_ClientUUIDGenerator__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }
}