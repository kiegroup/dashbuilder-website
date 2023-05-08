package org.jboss.errai.ioc.client;

import java.util.Map;
import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.client.parser.PropertyReplacementService;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;

public class Type_factory__o_d_c_p_PropertyReplacementService__quals__j_e_i_Any_j_e_i_Default extends Factory<PropertyReplacementService> { private class Type_factory__o_d_c_p_PropertyReplacementService__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends PropertyReplacementService implements Proxy<PropertyReplacementService> {
    private final ProxyHelper<PropertyReplacementService> proxyHelper = new ProxyHelperImpl<PropertyReplacementService>("Type_factory__o_d_c_p_PropertyReplacementService__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final PropertyReplacementService instance) {

    }

    public PropertyReplacementService asBeanType() {
      return this;
    }

    public void setInstance(final PropertyReplacementService instance) {
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

    @Override public String replace(String content, Map properties) {
      if (proxyHelper != null) {
        final PropertyReplacementService proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.replace(content, properties);
        return retVal;
      } else {
        return super.replace(content, properties);
      }
    }

    @Override public String replace(String content, Map properties, boolean allowUrlProperties) {
      if (proxyHelper != null) {
        final PropertyReplacementService proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.replace(content, properties, allowUrlProperties);
        return retVal;
      } else {
        return super.replace(content, properties, allowUrlProperties);
      }
    }

    @Override public String getExternalPropertyValue(boolean allowUrlProperties, String key, String v) {
      if (proxyHelper != null) {
        final PropertyReplacementService proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.getExternalPropertyValue(allowUrlProperties, key, v);
        return retVal;
      } else {
        return super.getExternalPropertyValue(allowUrlProperties, key, v);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final PropertyReplacementService proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_p_PropertyReplacementService__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(PropertyReplacementService.class, "Type_factory__o_d_c_p_PropertyReplacementService__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { PropertyReplacementService.class, Object.class });
  }

  public PropertyReplacementService createInstance(final ContextManager contextManager) {
    final PropertyReplacementService instance = new PropertyReplacementService();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<PropertyReplacementService> proxyImpl = new Type_factory__o_d_c_p_PropertyReplacementService__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }
}