package org.jboss.errai.ioc.client;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.dataset.DataSet;
import org.dashbuilder.dataset.DataSetLookup;
import org.dashbuilder.dataset.DataSetManager;
import org.dashbuilder.dataset.DataSetMetadata;
import org.dashbuilder.dataset.client.ClientDataSetManager;
import org.dashbuilder.dataset.def.DataSetPreprocessor;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;

public class Type_factory__o_d_d_c_ClientDataSetManager__quals__j_e_i_Any_j_e_i_Default extends Factory<ClientDataSetManager> { private class Type_factory__o_d_d_c_ClientDataSetManager__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends ClientDataSetManager implements Proxy<ClientDataSetManager> {
    private final ProxyHelper<ClientDataSetManager> proxyHelper = new ProxyHelperImpl<ClientDataSetManager>("Type_factory__o_d_d_c_ClientDataSetManager__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final ClientDataSetManager instance) {

    }

    public ClientDataSetManager asBeanType() {
      return this;
    }

    public void setInstance(final ClientDataSetManager instance) {
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

    @Override public DataSet createDataSet(String uuid) {
      if (proxyHelper != null) {
        final ClientDataSetManager proxiedInstance = proxyHelper.getInstance(this);
        final DataSet retVal = proxiedInstance.createDataSet(uuid);
        return retVal;
      } else {
        return super.createDataSet(uuid);
      }
    }

    @Override public DataSet getDataSet(String uuid) {
      if (proxyHelper != null) {
        final ClientDataSetManager proxiedInstance = proxyHelper.getInstance(this);
        final DataSet retVal = proxiedInstance.getDataSet(uuid);
        return retVal;
      } else {
        return super.getDataSet(uuid);
      }
    }

    @Override public void registerDataSet(DataSet dataSet) {
      if (proxyHelper != null) {
        final ClientDataSetManager proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.registerDataSet(dataSet);
      } else {
        super.registerDataSet(dataSet);
      }
    }

    @Override public void registerDataSet(DataSet dataSet, List preprocessors) {
      if (proxyHelper != null) {
        final ClientDataSetManager proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.registerDataSet(dataSet, preprocessors);
      } else {
        super.registerDataSet(dataSet, preprocessors);
      }
    }

    @Override public DataSet removeDataSet(String uuid) {
      if (proxyHelper != null) {
        final ClientDataSetManager proxiedInstance = proxyHelper.getInstance(this);
        final DataSet retVal = proxiedInstance.removeDataSet(uuid);
        return retVal;
      } else {
        return super.removeDataSet(uuid);
      }
    }

    @Override public DataSet lookupDataSet(DataSetLookup lookup) {
      if (proxyHelper != null) {
        final ClientDataSetManager proxiedInstance = proxyHelper.getInstance(this);
        final DataSet retVal = proxiedInstance.lookupDataSet(lookup);
        return retVal;
      } else {
        return super.lookupDataSet(lookup);
      }
    }

    @Override public DataSet[] lookupDataSets(DataSetLookup[] lookup) {
      if (proxyHelper != null) {
        final ClientDataSetManager proxiedInstance = proxyHelper.getInstance(this);
        final DataSet[] retVal = proxiedInstance.lookupDataSets(lookup);
        return retVal;
      } else {
        return super.lookupDataSets(lookup);
      }
    }

    @Override public DataSetMetadata getDataSetMetadata(String uuid) {
      if (proxyHelper != null) {
        final ClientDataSetManager proxiedInstance = proxyHelper.getInstance(this);
        final DataSetMetadata retVal = proxiedInstance.getDataSetMetadata(uuid);
        return retVal;
      } else {
        return super.getDataSetMetadata(uuid);
      }
    }

    @Override public void registerDataSetPreprocessor(String uuid, DataSetPreprocessor preprocessor) {
      if (proxyHelper != null) {
        final ClientDataSetManager proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.registerDataSetPreprocessor(uuid, preprocessor);
      } else {
        super.registerDataSetPreprocessor(uuid, preprocessor);
      }
    }

    @Override public List getDataSetPreprocessors(String uuid) {
      if (proxyHelper != null) {
        final ClientDataSetManager proxiedInstance = proxyHelper.getInstance(this);
        final List retVal = proxiedInstance.getDataSetPreprocessors(uuid);
        return retVal;
      } else {
        return super.getDataSetPreprocessors(uuid);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final ClientDataSetManager proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_d_c_ClientDataSetManager__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(ClientDataSetManager.class, "Type_factory__o_d_d_c_ClientDataSetManager__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { ClientDataSetManager.class, Object.class, DataSetManager.class });
  }

  public ClientDataSetManager createInstance(final ContextManager contextManager) {
    final ClientDataSetManager instance = new ClientDataSetManager();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<ClientDataSetManager> proxyImpl = new Type_factory__o_d_d_c_ClientDataSetManager__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }
}