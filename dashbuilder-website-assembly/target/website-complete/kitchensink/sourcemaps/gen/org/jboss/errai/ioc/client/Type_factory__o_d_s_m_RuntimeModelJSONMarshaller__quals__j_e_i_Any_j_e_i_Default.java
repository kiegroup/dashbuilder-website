package org.jboss.errai.ioc.client;

import java.util.Map;
import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.json.JsonObject;
import org.dashbuilder.shared.marshalling.RuntimeModelJSONMarshaller;
import org.dashbuilder.shared.model.GlobalSettings;
import org.dashbuilder.shared.model.RuntimeModel;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;

public class Type_factory__o_d_s_m_RuntimeModelJSONMarshaller__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimeModelJSONMarshaller> { private class Type_factory__o_d_s_m_RuntimeModelJSONMarshaller__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends RuntimeModelJSONMarshaller implements Proxy<RuntimeModelJSONMarshaller> {
    private final ProxyHelper<RuntimeModelJSONMarshaller> proxyHelper = new ProxyHelperImpl<RuntimeModelJSONMarshaller>("Type_factory__o_d_s_m_RuntimeModelJSONMarshaller__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final RuntimeModelJSONMarshaller instance) {

    }

    public RuntimeModelJSONMarshaller asBeanType() {
      return this;
    }

    public void setInstance(final RuntimeModelJSONMarshaller instance) {
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

    @Override public JsonObject toJson(RuntimeModel model) {
      if (proxyHelper != null) {
        final RuntimeModelJSONMarshaller proxiedInstance = proxyHelper.getInstance(this);
        final JsonObject retVal = proxiedInstance.toJson(model);
        return retVal;
      } else {
        return super.toJson(model);
      }
    }

    @Override public RuntimeModel fromJson(String json) {
      if (proxyHelper != null) {
        final RuntimeModelJSONMarshaller proxiedInstance = proxyHelper.getInstance(this);
        final RuntimeModel retVal = proxiedInstance.fromJson(json);
        return retVal;
      } else {
        return super.fromJson(json);
      }
    }

    @Override public RuntimeModel fromJson(JsonObject jsonObject) {
      if (proxyHelper != null) {
        final RuntimeModelJSONMarshaller proxiedInstance = proxyHelper.getInstance(this);
        final RuntimeModel retVal = proxiedInstance.fromJson(jsonObject);
        return retVal;
      } else {
        return super.fromJson(jsonObject);
      }
    }

    @Override public Map retrieveProperties(String json) {
      if (proxyHelper != null) {
        final RuntimeModelJSONMarshaller proxiedInstance = proxyHelper.getInstance(this);
        final Map retVal = proxiedInstance.retrieveProperties(json);
        return retVal;
      } else {
        return super.retrieveProperties(json);
      }
    }

    @Override public GlobalSettings retrieveGlobalSettings(String json) {
      if (proxyHelper != null) {
        final RuntimeModelJSONMarshaller proxiedInstance = proxyHelper.getInstance(this);
        final GlobalSettings retVal = proxiedInstance.retrieveGlobalSettings(json);
        return retVal;
      } else {
        return super.retrieveGlobalSettings(json);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final RuntimeModelJSONMarshaller proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_s_m_RuntimeModelJSONMarshaller__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(RuntimeModelJSONMarshaller.class, "Type_factory__o_d_s_m_RuntimeModelJSONMarshaller__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { RuntimeModelJSONMarshaller.class, Object.class });
  }

  public RuntimeModelJSONMarshaller createInstance(final ContextManager contextManager) {
    final RuntimeModelJSONMarshaller instance = new RuntimeModelJSONMarshaller();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<RuntimeModelJSONMarshaller> proxyImpl = new Type_factory__o_d_s_m_RuntimeModelJSONMarshaller__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }
}