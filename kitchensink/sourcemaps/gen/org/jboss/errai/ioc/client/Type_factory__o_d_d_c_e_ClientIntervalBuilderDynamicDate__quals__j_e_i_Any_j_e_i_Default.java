package org.jboss.errai.ioc.client;

import java.util.Date;
import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.dataset.DataColumn;
import org.dashbuilder.dataset.client.engine.ClientDateFormatter;
import org.dashbuilder.dataset.client.engine.ClientDateFormatterImpl;
import org.dashbuilder.dataset.client.engine.ClientIntervalBuilderDynamicDate;
import org.dashbuilder.dataset.engine.DataSetHandler;
import org.dashbuilder.dataset.engine.group.IntervalBuilder;
import org.dashbuilder.dataset.engine.group.IntervalList;
import org.dashbuilder.dataset.group.ColumnGroup;
import org.dashbuilder.dataset.group.DateIntervalType;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;

public class Type_factory__o_d_d_c_e_ClientIntervalBuilderDynamicDate__quals__j_e_i_Any_j_e_i_Default extends Factory<ClientIntervalBuilderDynamicDate> { private class Type_factory__o_d_d_c_e_ClientIntervalBuilderDynamicDate__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends ClientIntervalBuilderDynamicDate implements Proxy<ClientIntervalBuilderDynamicDate> {
    private final ProxyHelper<ClientIntervalBuilderDynamicDate> proxyHelper = new ProxyHelperImpl<ClientIntervalBuilderDynamicDate>("Type_factory__o_d_d_c_e_ClientIntervalBuilderDynamicDate__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final ClientIntervalBuilderDynamicDate instance) {

    }

    public ClientIntervalBuilderDynamicDate asBeanType() {
      return this;
    }

    public void setInstance(final ClientIntervalBuilderDynamicDate instance) {
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

    @Override public IntervalList build(DataSetHandler handler, ColumnGroup columnGroup) {
      if (proxyHelper != null) {
        final ClientIntervalBuilderDynamicDate proxiedInstance = proxyHelper.getInstance(this);
        final IntervalList retVal = proxiedInstance.build(handler, columnGroup);
        return retVal;
      } else {
        return super.build(handler, columnGroup);
      }
    }

    @Override public IntervalList build(DataColumn dataColumn) {
      if (proxyHelper != null) {
        final ClientIntervalBuilderDynamicDate proxiedInstance = proxyHelper.getInstance(this);
        final IntervalList retVal = proxiedInstance.build(dataColumn);
        return retVal;
      } else {
        return super.build(dataColumn);
      }
    }

    @Override public DateIntervalType calculateIntervalSize(Date minDate, Date maxDate, ColumnGroup columnGroup) {
      if (proxyHelper != null) {
        final ClientIntervalBuilderDynamicDate proxiedInstance = proxyHelper.getInstance(this);
        final DateIntervalType retVal = proxiedInstance.calculateIntervalSize(minDate, maxDate, columnGroup);
        return retVal;
      } else {
        return super.calculateIntervalSize(minDate, maxDate, columnGroup);
      }
    }

    @Override protected Date firstIntervalDate(DateIntervalType intervalType, Date minDate, ColumnGroup columnGroup) {
      if (proxyHelper != null) {
        final ClientIntervalBuilderDynamicDate proxiedInstance = proxyHelper.getInstance(this);
        final Date retVal = ClientIntervalBuilderDynamicDate_firstIntervalDate_DateIntervalType_Date_ColumnGroup(proxiedInstance, intervalType, minDate, columnGroup);
        return retVal;
      } else {
        return super.firstIntervalDate(intervalType, minDate, columnGroup);
      }
    }

    @Override protected Date nextIntervalDate(Date intervalMinDate, DateIntervalType intervalType, int intervals) {
      if (proxyHelper != null) {
        final ClientIntervalBuilderDynamicDate proxiedInstance = proxyHelper.getInstance(this);
        final Date retVal = ClientIntervalBuilderDynamicDate_nextIntervalDate_Date_DateIntervalType_int(proxiedInstance, intervalMinDate, intervalType, intervals);
        return retVal;
      } else {
        return super.nextIntervalDate(intervalMinDate, intervalType, intervals);
      }
    }

    @Override public String calculateName(DateIntervalType intervalType, Date d) {
      if (proxyHelper != null) {
        final ClientIntervalBuilderDynamicDate proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.calculateName(intervalType, d);
        return retVal;
      } else {
        return super.calculateName(intervalType, d);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final ClientIntervalBuilderDynamicDate proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_d_c_e_ClientIntervalBuilderDynamicDate__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(ClientIntervalBuilderDynamicDate.class, "Type_factory__o_d_d_c_e_ClientIntervalBuilderDynamicDate__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { ClientIntervalBuilderDynamicDate.class, Object.class, IntervalBuilder.class });
  }

  public ClientIntervalBuilderDynamicDate createInstance(final ContextManager contextManager) {
    final ClientDateFormatter _dateFormatter_0 = (ClientDateFormatterImpl) contextManager.getInstance("Type_factory__o_d_d_c_e_ClientDateFormatterImpl__quals__j_e_i_Any_j_e_i_Default");
    final ClientIntervalBuilderDynamicDate instance = new ClientIntervalBuilderDynamicDate(_dateFormatter_0);
    registerDependentScopedReference(instance, _dateFormatter_0);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<ClientIntervalBuilderDynamicDate> proxyImpl = new Type_factory__o_d_d_c_e_ClientIntervalBuilderDynamicDate__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  public native static Date ClientIntervalBuilderDynamicDate_firstIntervalDate_DateIntervalType_Date_ColumnGroup(ClientIntervalBuilderDynamicDate instance, DateIntervalType a0, Date a1, ColumnGroup a2) /*-{
    return instance.@org.dashbuilder.dataset.client.engine.ClientIntervalBuilderDynamicDate::firstIntervalDate(Lorg/dashbuilder/dataset/group/DateIntervalType;Ljava/util/Date;Lorg/dashbuilder/dataset/group/ColumnGroup;)(a0, a1, a2);
  }-*/;

  public native static Date ClientIntervalBuilderDynamicDate_nextIntervalDate_Date_DateIntervalType_int(ClientIntervalBuilderDynamicDate instance, Date a0, DateIntervalType a1, int a2) /*-{
    return instance.@org.dashbuilder.dataset.client.engine.ClientIntervalBuilderDynamicDate::nextIntervalDate(Ljava/util/Date;Lorg/dashbuilder/dataset/group/DateIntervalType;I)(a0, a1, a2);
  }-*/;
}