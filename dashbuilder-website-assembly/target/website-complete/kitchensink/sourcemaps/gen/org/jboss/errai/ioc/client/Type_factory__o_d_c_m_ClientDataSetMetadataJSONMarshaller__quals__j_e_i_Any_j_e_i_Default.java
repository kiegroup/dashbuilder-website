package org.jboss.errai.ioc.client;

import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.client.marshalling.ClientDataSetMetadataJSONMarshaller;
import org.dashbuilder.dataset.DataSetMetadata;
import org.dashbuilder.dataset.json.DataSetMetadataJSONMarshaller;
import org.dashbuilder.json.JsonObject;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;

public class Type_factory__o_d_c_m_ClientDataSetMetadataJSONMarshaller__quals__j_e_i_Any_j_e_i_Default extends Factory<ClientDataSetMetadataJSONMarshaller> { private class Type_factory__o_d_c_m_ClientDataSetMetadataJSONMarshaller__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends ClientDataSetMetadataJSONMarshaller implements Proxy<ClientDataSetMetadataJSONMarshaller> {
    private final ProxyHelper<ClientDataSetMetadataJSONMarshaller> proxyHelper = new ProxyHelperImpl<ClientDataSetMetadataJSONMarshaller>("Type_factory__o_d_c_m_ClientDataSetMetadataJSONMarshaller__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final ClientDataSetMetadataJSONMarshaller instance) {

    }

    public ClientDataSetMetadataJSONMarshaller asBeanType() {
      return this;
    }

    public void setInstance(final ClientDataSetMetadataJSONMarshaller instance) {
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

    @Override public DataSetMetadata fromJSON(String json) {
      if (proxyHelper != null) {
        final ClientDataSetMetadataJSONMarshaller proxiedInstance = proxyHelper.getInstance(this);
        final DataSetMetadata retVal = proxiedInstance.fromJSON(json);
        return retVal;
      } else {
        return super.fromJSON(json);
      }
    }

    @Override public DataSetMetadata fromJsonObj(JsonObject json) {
      if (proxyHelper != null) {
        final ClientDataSetMetadataJSONMarshaller proxiedInstance = proxyHelper.getInstance(this);
        final DataSetMetadata retVal = proxiedInstance.fromJsonObj(json);
        return retVal;
      } else {
        return super.fromJsonObj(json);
      }
    }

    @Override public String toJson(DataSetMetadata dataSetMetadata) {
      if (proxyHelper != null) {
        final ClientDataSetMetadataJSONMarshaller proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.toJson(dataSetMetadata);
        return retVal;
      } else {
        return super.toJson(dataSetMetadata);
      }
    }

    @Override public JsonObject toJSONObj(DataSetMetadata dataSetMetadata) {
      if (proxyHelper != null) {
        final ClientDataSetMetadataJSONMarshaller proxiedInstance = proxyHelper.getInstance(this);
        final JsonObject retVal = proxiedInstance.toJSONObj(dataSetMetadata);
        return retVal;
      } else {
        return super.toJSONObj(dataSetMetadata);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final ClientDataSetMetadataJSONMarshaller proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_m_ClientDataSetMetadataJSONMarshaller__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(ClientDataSetMetadataJSONMarshaller.class, "Type_factory__o_d_c_m_ClientDataSetMetadataJSONMarshaller__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { ClientDataSetMetadataJSONMarshaller.class, DataSetMetadataJSONMarshaller.class, Object.class });
  }

  public ClientDataSetMetadataJSONMarshaller createInstance(final ContextManager contextManager) {
    final ClientDataSetMetadataJSONMarshaller instance = new ClientDataSetMetadataJSONMarshaller();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<ClientDataSetMetadataJSONMarshaller> proxyImpl = new Type_factory__o_d_c_m_ClientDataSetMetadataJSONMarshaller__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }
}