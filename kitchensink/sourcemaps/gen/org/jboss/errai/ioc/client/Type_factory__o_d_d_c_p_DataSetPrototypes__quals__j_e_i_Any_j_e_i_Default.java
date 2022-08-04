package org.jboss.errai.ioc.client;

import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.dataset.DataSet;
import org.dashbuilder.dataset.client.ClientDataSetManager;
import org.dashbuilder.displayer.client.prototypes.DataSetPrototypes;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;

public class Type_factory__o_d_d_c_p_DataSetPrototypes__quals__j_e_i_Any_j_e_i_Default extends Factory<DataSetPrototypes> { private class Type_factory__o_d_d_c_p_DataSetPrototypes__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends DataSetPrototypes implements Proxy<DataSetPrototypes> {
    private final ProxyHelper<DataSetPrototypes> proxyHelper = new ProxyHelperImpl<DataSetPrototypes>("Type_factory__o_d_d_c_p_DataSetPrototypes__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final DataSetPrototypes instance) {

    }

    public DataSetPrototypes asBeanType() {
      return this;
    }

    public void setInstance(final DataSetPrototypes instance) {
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

    @Override public DataSet getWorldPopulation() {
      if (proxyHelper != null) {
        final DataSetPrototypes proxiedInstance = proxyHelper.getInstance(this);
        final DataSet retVal = proxiedInstance.getWorldPopulation();
        return retVal;
      } else {
        return super.getWorldPopulation();
      }
    }

    @Override public DataSet getTotalPopulation() {
      if (proxyHelper != null) {
        final DataSetPrototypes proxiedInstance = proxyHelper.getInstance(this);
        final DataSet retVal = proxiedInstance.getTotalPopulation();
        return retVal;
      } else {
        return super.getTotalPopulation();
      }
    }

    @Override public DataSet getCountryPopulation() {
      if (proxyHelper != null) {
        final DataSetPrototypes proxiedInstance = proxyHelper.getInstance(this);
        final DataSet retVal = proxiedInstance.getCountryPopulation();
        return retVal;
      } else {
        return super.getCountryPopulation();
      }
    }

    @Override public DataSet getTopRichCountries() {
      if (proxyHelper != null) {
        final DataSetPrototypes proxiedInstance = proxyHelper.getInstance(this);
        final DataSet retVal = proxiedInstance.getTopRichCountries();
        return retVal;
      } else {
        return super.getTopRichCountries();
      }
    }

    @Override public DataSet getContinentPopulation() {
      if (proxyHelper != null) {
        final DataSetPrototypes proxiedInstance = proxyHelper.getInstance(this);
        final DataSet retVal = proxiedInstance.getContinentPopulation();
        return retVal;
      } else {
        return super.getContinentPopulation();
      }
    }

    @Override public DataSet getPopulationLimits() {
      if (proxyHelper != null) {
        final DataSetPrototypes proxiedInstance = proxyHelper.getInstance(this);
        final DataSet retVal = proxiedInstance.getPopulationLimits();
        return retVal;
      } else {
        return super.getPopulationLimits();
      }
    }

    @Override public DataSet getContinentPopulationExt() {
      if (proxyHelper != null) {
        final DataSetPrototypes proxiedInstance = proxyHelper.getInstance(this);
        final DataSet retVal = proxiedInstance.getContinentPopulationExt();
        return retVal;
      } else {
        return super.getContinentPopulationExt();
      }
    }

    @Override public void init() {
      if (proxyHelper != null) {
        final DataSetPrototypes proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.init();
      } else {
        super.init();
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final DataSetPrototypes proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_d_c_p_DataSetPrototypes__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(DataSetPrototypes.class, "Type_factory__o_d_d_c_p_DataSetPrototypes__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { DataSetPrototypes.class, Object.class });
  }

  public DataSetPrototypes createInstance(final ContextManager contextManager) {
    final ClientDataSetManager _dataSetManager_0 = (ClientDataSetManager) contextManager.getInstance("Type_factory__o_d_d_c_ClientDataSetManager__quals__j_e_i_Any_j_e_i_Default");
    final DataSetPrototypes instance = new DataSetPrototypes(_dataSetManager_0);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<DataSetPrototypes> proxyImpl = new Type_factory__o_d_d_c_p_DataSetPrototypes__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }
}