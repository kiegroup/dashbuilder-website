package org.jboss.errai.ioc.client;

import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.dataset.ColumnType;
import org.dashbuilder.dataset.client.engine.ClientIntervalBuilderDynamicDate;
import org.dashbuilder.dataset.client.engine.ClientIntervalBuilderLocator;
import org.dashbuilder.dataset.engine.group.IntervalBuilder;
import org.dashbuilder.dataset.engine.group.IntervalBuilderDynamicLabel;
import org.dashbuilder.dataset.engine.group.IntervalBuilderFixedDate;
import org.dashbuilder.dataset.engine.group.IntervalBuilderLocator;
import org.dashbuilder.dataset.group.GroupStrategy;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;

public class Type_factory__o_d_d_c_e_ClientIntervalBuilderLocator__quals__j_e_i_Any_j_e_i_Default extends Factory<ClientIntervalBuilderLocator> { private class Type_factory__o_d_d_c_e_ClientIntervalBuilderLocator__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends ClientIntervalBuilderLocator implements Proxy<ClientIntervalBuilderLocator> {
    private final ProxyHelper<ClientIntervalBuilderLocator> proxyHelper = new ProxyHelperImpl<ClientIntervalBuilderLocator>("Type_factory__o_d_d_c_e_ClientIntervalBuilderLocator__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final ClientIntervalBuilderLocator instance) {

    }

    public ClientIntervalBuilderLocator asBeanType() {
      return this;
    }

    public void setInstance(final ClientIntervalBuilderLocator instance) {
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

    @Override public IntervalBuilder lookup(ColumnType columnType, GroupStrategy strategy) {
      if (proxyHelper != null) {
        final ClientIntervalBuilderLocator proxiedInstance = proxyHelper.getInstance(this);
        final IntervalBuilder retVal = proxiedInstance.lookup(columnType, strategy);
        return retVal;
      } else {
        return super.lookup(columnType, strategy);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final ClientIntervalBuilderLocator proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_d_c_e_ClientIntervalBuilderLocator__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(ClientIntervalBuilderLocator.class, "Type_factory__o_d_d_c_e_ClientIntervalBuilderLocator__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { ClientIntervalBuilderLocator.class, Object.class, IntervalBuilderLocator.class });
  }

  public ClientIntervalBuilderLocator createInstance(final ContextManager contextManager) {
    final ClientIntervalBuilderDynamicDate _intervalBuilderDynamicDate_1 = (ClientIntervalBuilderDynamicDate) contextManager.getInstance("Type_factory__o_d_d_c_e_ClientIntervalBuilderDynamicDate__quals__j_e_i_Any_j_e_i_Default");
    final IntervalBuilderFixedDate _intervalBuilderFixedDate_2 = (IntervalBuilderFixedDate) contextManager.getInstance("Type_factory__o_d_d_e_g_IntervalBuilderFixedDate__quals__j_e_i_Any_j_e_i_Default");
    final IntervalBuilderDynamicLabel _intervalBuilderDynamicLabel_0 = (IntervalBuilderDynamicLabel) contextManager.getInstance("Type_factory__o_d_d_e_g_IntervalBuilderDynamicLabel__quals__j_e_i_Any_j_e_i_Default");
    final ClientIntervalBuilderLocator instance = new ClientIntervalBuilderLocator(_intervalBuilderDynamicLabel_0, _intervalBuilderDynamicDate_1, _intervalBuilderFixedDate_2);
    registerDependentScopedReference(instance, _intervalBuilderFixedDate_2);
    registerDependentScopedReference(instance, _intervalBuilderDynamicLabel_0);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<ClientIntervalBuilderLocator> proxyImpl = new Type_factory__o_d_d_c_e_ClientIntervalBuilderLocator__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }
}