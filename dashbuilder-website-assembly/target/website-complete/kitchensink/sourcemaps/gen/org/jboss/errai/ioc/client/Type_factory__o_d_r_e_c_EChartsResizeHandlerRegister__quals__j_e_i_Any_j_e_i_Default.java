package org.jboss.errai.ioc.client;

import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.renderer.echarts.client.EChartsResizeHandlerRegister;
import org.dashbuilder.renderer.echarts.client.js.ECharts.Chart;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;

public class Type_factory__o_d_r_e_c_EChartsResizeHandlerRegister__quals__j_e_i_Any_j_e_i_Default extends Factory<EChartsResizeHandlerRegister> { private class Type_factory__o_d_r_e_c_EChartsResizeHandlerRegister__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends EChartsResizeHandlerRegister implements Proxy<EChartsResizeHandlerRegister> {
    private final ProxyHelper<EChartsResizeHandlerRegister> proxyHelper = new ProxyHelperImpl<EChartsResizeHandlerRegister>("Type_factory__o_d_r_e_c_EChartsResizeHandlerRegister__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final EChartsResizeHandlerRegister instance) {

    }

    public EChartsResizeHandlerRegister asBeanType() {
      return this;
    }

    public void setInstance(final EChartsResizeHandlerRegister instance) {
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

    @Override public void setup() {
      if (proxyHelper != null) {
        final EChartsResizeHandlerRegister proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.setup();
      } else {
        super.setup();
      }
    }

    @Override public void add(Chart chart) {
      if (proxyHelper != null) {
        final EChartsResizeHandlerRegister proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.add(chart);
      } else {
        super.add(chart);
      }
    }

    @Override public void clear() {
      if (proxyHelper != null) {
        final EChartsResizeHandlerRegister proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.clear();
      } else {
        super.clear();
      }
    }

    @Override public void remove(Chart chart) {
      if (proxyHelper != null) {
        final EChartsResizeHandlerRegister proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.remove(chart);
      } else {
        super.remove(chart);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final EChartsResizeHandlerRegister proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_r_e_c_EChartsResizeHandlerRegister__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(EChartsResizeHandlerRegister.class, "Type_factory__o_d_r_e_c_EChartsResizeHandlerRegister__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { EChartsResizeHandlerRegister.class, Object.class });
  }

  public EChartsResizeHandlerRegister createInstance(final ContextManager contextManager) {
    final EChartsResizeHandlerRegister instance = new EChartsResizeHandlerRegister();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final EChartsResizeHandlerRegister instance) {
    instance.setup();
  }

  public Proxy createProxy(final Context context) {
    final Proxy<EChartsResizeHandlerRegister> proxyImpl = new Type_factory__o_d_r_e_c_EChartsResizeHandlerRegister__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }
}