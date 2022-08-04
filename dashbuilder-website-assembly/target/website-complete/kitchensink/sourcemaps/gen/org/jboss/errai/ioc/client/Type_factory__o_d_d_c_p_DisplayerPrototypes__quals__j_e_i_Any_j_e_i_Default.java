package org.jboss.errai.ioc.client;

import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.dataset.client.uuid.ClientUUIDGenerator;
import org.dashbuilder.dataset.uuid.UUIDGenerator;
import org.dashbuilder.displayer.DisplayerSettings;
import org.dashbuilder.displayer.DisplayerSubType;
import org.dashbuilder.displayer.DisplayerType;
import org.dashbuilder.displayer.client.prototypes.DataSetPrototypes;
import org.dashbuilder.displayer.client.prototypes.DisplayerPrototypes;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;

public class Type_factory__o_d_d_c_p_DisplayerPrototypes__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerPrototypes> { private class Type_factory__o_d_d_c_p_DisplayerPrototypes__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends DisplayerPrototypes implements Proxy<DisplayerPrototypes> {
    private final ProxyHelper<DisplayerPrototypes> proxyHelper = new ProxyHelperImpl<DisplayerPrototypes>("Type_factory__o_d_d_c_p_DisplayerPrototypes__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final DisplayerPrototypes instance) {

    }

    public DisplayerPrototypes asBeanType() {
      return this;
    }

    public void setInstance(final DisplayerPrototypes instance) {
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

    @Override public void init() {
      if (proxyHelper != null) {
        final DisplayerPrototypes proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.init();
      } else {
        super.init();
      }
    }

    @Override public DisplayerSettings getProto(DisplayerType type) {
      if (proxyHelper != null) {
        final DisplayerPrototypes proxiedInstance = proxyHelper.getInstance(this);
        final DisplayerSettings retVal = proxiedInstance.getProto(type);
        return retVal;
      } else {
        return super.getProto(type);
      }
    }

    @Override public DisplayerSettings getProto(DisplayerType type, DisplayerSubType subType) {
      if (proxyHelper != null) {
        final DisplayerPrototypes proxiedInstance = proxyHelper.getInstance(this);
        final DisplayerSettings retVal = proxiedInstance.getProto(type, subType);
        return retVal;
      } else {
        return super.getProto(type, subType);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final DisplayerPrototypes proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_d_c_p_DisplayerPrototypes__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(DisplayerPrototypes.class, "Type_factory__o_d_d_c_p_DisplayerPrototypes__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { DisplayerPrototypes.class, Object.class });
  }

  public DisplayerPrototypes createInstance(final ContextManager contextManager) {
    final DataSetPrototypes _dataSetPrototypes_0 = (DataSetPrototypes) contextManager.getInstance("Type_factory__o_d_d_c_p_DataSetPrototypes__quals__j_e_i_Any_j_e_i_Default");
    final UUIDGenerator _uuidGenerator_1 = (ClientUUIDGenerator) contextManager.getInstance("Type_factory__o_d_d_c_u_ClientUUIDGenerator__quals__j_e_i_Any_j_e_i_Default");
    final DisplayerPrototypes instance = new DisplayerPrototypes(_dataSetPrototypes_0, _uuidGenerator_1);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<DisplayerPrototypes> proxyImpl = new Type_factory__o_d_d_c_p_DisplayerPrototypes__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }
}