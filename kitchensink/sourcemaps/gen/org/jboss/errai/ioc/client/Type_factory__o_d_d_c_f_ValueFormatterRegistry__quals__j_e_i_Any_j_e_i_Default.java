package org.jboss.errai.ioc.client;

import java.util.Map;
import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.displayer.client.formatter.ValueFormatter;
import org.dashbuilder.displayer.client.formatter.ValueFormatterRegistry;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;

public class Type_factory__o_d_d_c_f_ValueFormatterRegistry__quals__j_e_i_Any_j_e_i_Default extends Factory<ValueFormatterRegistry> { private class Type_factory__o_d_d_c_f_ValueFormatterRegistry__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends ValueFormatterRegistry implements Proxy<ValueFormatterRegistry> {
    private final ProxyHelper<ValueFormatterRegistry> proxyHelper = new ProxyHelperImpl<ValueFormatterRegistry>("Type_factory__o_d_d_c_f_ValueFormatterRegistry__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final ValueFormatterRegistry instance) {

    }

    public ValueFormatterRegistry asBeanType() {
      return this;
    }

    public void setInstance(final ValueFormatterRegistry instance) {
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

    @Override public void register(String columnId, ValueFormatter formatter) {
      if (proxyHelper != null) {
        final ValueFormatterRegistry proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.register(columnId, formatter);
      } else {
        super.register(columnId, formatter);
      }
    }

    @Override public void register(String displayerUuid, String columnId, ValueFormatter formatter) {
      if (proxyHelper != null) {
        final ValueFormatterRegistry proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.register(displayerUuid, columnId, formatter);
      } else {
        super.register(displayerUuid, columnId, formatter);
      }
    }

    @Override public Map get(String displayerUuid) {
      if (proxyHelper != null) {
        final ValueFormatterRegistry proxiedInstance = proxyHelper.getInstance(this);
        final Map retVal = proxiedInstance.get(displayerUuid);
        return retVal;
      } else {
        return super.get(displayerUuid);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final ValueFormatterRegistry proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_d_c_f_ValueFormatterRegistry__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(ValueFormatterRegistry.class, "Type_factory__o_d_d_c_f_ValueFormatterRegistry__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { ValueFormatterRegistry.class, Object.class });
  }

  public ValueFormatterRegistry createInstance(final ContextManager contextManager) {
    final ValueFormatterRegistry instance = new ValueFormatterRegistry();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<ValueFormatterRegistry> proxyImpl = new Type_factory__o_d_d_c_f_ValueFormatterRegistry__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }
}