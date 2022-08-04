package org.jboss.errai.ioc.client;

import elemental2.core.JsObject;
import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.renderer.c3.client.jsbinding.C3AxisInfo;
import org.dashbuilder.renderer.c3.client.jsbinding.C3AxisLabel;
import org.dashbuilder.renderer.c3.client.jsbinding.C3AxisX;
import org.dashbuilder.renderer.c3.client.jsbinding.C3AxisY;
import org.dashbuilder.renderer.c3.client.jsbinding.C3ChartConf;
import org.dashbuilder.renderer.c3.client.jsbinding.C3ChartData;
import org.dashbuilder.renderer.c3.client.jsbinding.C3ChartSize;
import org.dashbuilder.renderer.c3.client.jsbinding.C3Color;
import org.dashbuilder.renderer.c3.client.jsbinding.C3Donut;
import org.dashbuilder.renderer.c3.client.jsbinding.C3Format.FormatCallback;
import org.dashbuilder.renderer.c3.client.jsbinding.C3Gauge;
import org.dashbuilder.renderer.c3.client.jsbinding.C3Grid;
import org.dashbuilder.renderer.c3.client.jsbinding.C3JsTypesFactory;
import org.dashbuilder.renderer.c3.client.jsbinding.C3Legend;
import org.dashbuilder.renderer.c3.client.jsbinding.C3Padding;
import org.dashbuilder.renderer.c3.client.jsbinding.C3Point;
import org.dashbuilder.renderer.c3.client.jsbinding.C3Point.RadiusCallback;
import org.dashbuilder.renderer.c3.client.jsbinding.C3Selection;
import org.dashbuilder.renderer.c3.client.jsbinding.C3Threshold;
import org.dashbuilder.renderer.c3.client.jsbinding.C3Tick;
import org.dashbuilder.renderer.c3.client.jsbinding.C3Tick.FormatterCallback;
import org.dashbuilder.renderer.c3.client.jsbinding.C3Tooltip;
import org.dashbuilder.renderer.c3.client.jsbinding.C3Transition;
import org.dashbuilder.renderer.c3.client.jsbinding.C3Zoom;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;

public class Type_factory__o_d_r_c_c_j_C3JsTypesFactory__quals__j_e_i_Any_j_e_i_Default extends Factory<C3JsTypesFactory> { private class Type_factory__o_d_r_c_c_j_C3JsTypesFactory__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends C3JsTypesFactory implements Proxy<C3JsTypesFactory> {
    private final ProxyHelper<C3JsTypesFactory> proxyHelper = new ProxyHelperImpl<C3JsTypesFactory>("Type_factory__o_d_r_c_c_j_C3JsTypesFactory__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final C3JsTypesFactory instance) {

    }

    public C3JsTypesFactory asBeanType() {
      return this;
    }

    public void setInstance(final C3JsTypesFactory instance) {
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

    @Override public C3Tick createC3Tick(FormatterCallback callback) {
      if (proxyHelper != null) {
        final C3JsTypesFactory proxiedInstance = proxyHelper.getInstance(this);
        final C3Tick retVal = proxiedInstance.createC3Tick(callback);
        return retVal;
      } else {
        return super.createC3Tick(callback);
      }
    }

    @Override public C3Grid c3Grid(boolean showX, boolean showY) {
      if (proxyHelper != null) {
        final C3JsTypesFactory proxiedInstance = proxyHelper.getInstance(this);
        final C3Grid retVal = proxiedInstance.c3Grid(showX, showY);
        return retVal;
      } else {
        return super.c3Grid(showX, showY);
      }
    }

    @Override public C3Zoom c3Zoom(boolean enabled) {
      if (proxyHelper != null) {
        final C3JsTypesFactory proxiedInstance = proxyHelper.getInstance(this);
        final C3Zoom retVal = proxiedInstance.c3Zoom(enabled);
        return retVal;
      } else {
        return super.c3Zoom(enabled);
      }
    }

    @Override public C3Padding c3Padding(int top, int right, int bottom, int left) {
      if (proxyHelper != null) {
        final C3JsTypesFactory proxiedInstance = proxyHelper.getInstance(this);
        final C3Padding retVal = proxiedInstance.c3Padding(top, right, bottom, left);
        return retVal;
      } else {
        return super.c3Padding(top, right, bottom, left);
      }
    }

    @Override public C3ChartSize c3ChartSize(double width, double height) {
      if (proxyHelper != null) {
        final C3JsTypesFactory proxiedInstance = proxyHelper.getInstance(this);
        final C3ChartSize retVal = proxiedInstance.c3ChartSize(width, height);
        return retVal;
      } else {
        return super.c3ChartSize(width, height);
      }
    }

    @Override public C3Selection c3Selection(boolean enabled, boolean multiple, boolean grouped) {
      if (proxyHelper != null) {
        final C3JsTypesFactory proxiedInstance = proxyHelper.getInstance(this);
        final C3Selection retVal = proxiedInstance.c3Selection(enabled, multiple, grouped);
        return retVal;
      } else {
        return super.c3Selection(enabled, multiple, grouped);
      }
    }

    @Override public C3AxisY c3AxisY(boolean show, C3Tick tickY) {
      if (proxyHelper != null) {
        final C3JsTypesFactory proxiedInstance = proxyHelper.getInstance(this);
        final C3AxisY retVal = proxiedInstance.c3AxisY(show, tickY);
        return retVal;
      } else {
        return super.c3AxisY(show, tickY);
      }
    }

    @Override public C3AxisX c3AxisX(String type, String[] categories, C3Tick tick, boolean show) {
      if (proxyHelper != null) {
        final C3JsTypesFactory proxiedInstance = proxyHelper.getInstance(this);
        final C3AxisX retVal = proxiedInstance.c3AxisX(type, categories, tick, show);
        return retVal;
      } else {
        return super.c3AxisX(type, categories, tick, show);
      }
    }

    @Override public C3Legend c3Legend(boolean show, String position) {
      if (proxyHelper != null) {
        final C3JsTypesFactory proxiedInstance = proxyHelper.getInstance(this);
        final C3Legend retVal = proxiedInstance.c3Legend(show, position);
        return retVal;
      } else {
        return super.c3Legend(show, position);
      }
    }

    @Override public C3Point c3Point(RadiusCallback r) {
      if (proxyHelper != null) {
        final C3JsTypesFactory proxiedInstance = proxyHelper.getInstance(this);
        final C3Point retVal = proxiedInstance.c3Point(r);
        return retVal;
      } else {
        return super.c3Point(r);
      }
    }

    @Override public C3ChartData c3ChartData(java.lang.String[][] columns, String type, java.lang.String[][] groups, JsObject xs, C3Selection selection) {
      if (proxyHelper != null) {
        final C3JsTypesFactory proxiedInstance = proxyHelper.getInstance(this);
        final C3ChartData retVal = proxiedInstance.c3ChartData(columns, type, groups, xs, selection);
        return retVal;
      } else {
        return super.c3ChartData(columns, type, groups, xs, selection);
      }
    }

    @Override public C3AxisInfo c3AxisInfo(boolean rotated, C3AxisX axisX, C3AxisY axisY) {
      if (proxyHelper != null) {
        final C3JsTypesFactory proxiedInstance = proxyHelper.getInstance(this);
        final C3AxisInfo retVal = proxiedInstance.c3AxisInfo(rotated, axisX, axisY);
        return retVal;
      } else {
        return super.c3AxisInfo(rotated, axisX, axisY);
      }
    }

    @Override public C3ChartConf c3ChartConf(C3ChartSize size, C3ChartData data, C3AxisInfo axis, C3Grid grid, C3Transition transition, C3Point point, C3Padding padding, C3Legend legend, C3Color color, C3Zoom zoom) {
      if (proxyHelper != null) {
        final C3JsTypesFactory proxiedInstance = proxyHelper.getInstance(this);
        final C3ChartConf retVal = proxiedInstance.c3ChartConf(size, data, axis, grid, transition, point, padding, legend, color, zoom);
        return retVal;
      } else {
        return super.c3ChartConf(size, data, axis, grid, transition, point, padding, legend, color, zoom);
      }
    }

    @Override public C3Transition c3Transition(int duration) {
      if (proxyHelper != null) {
        final C3JsTypesFactory proxiedInstance = proxyHelper.getInstance(this);
        final C3Transition retVal = proxiedInstance.c3Transition(duration);
        return retVal;
      } else {
        return super.c3Transition(duration);
      }
    }

    @Override public C3AxisLabel createC3Label(String text, String position) {
      if (proxyHelper != null) {
        final C3JsTypesFactory proxiedInstance = proxyHelper.getInstance(this);
        final C3AxisLabel retVal = proxiedInstance.createC3Label(text, position);
        return retVal;
      } else {
        return super.createC3Label(text, position);
      }
    }

    @Override public C3Color c3Color(String[] pattern) {
      if (proxyHelper != null) {
        final C3JsTypesFactory proxiedInstance = proxyHelper.getInstance(this);
        final C3Color retVal = proxiedInstance.c3Color(pattern);
        return retVal;
      } else {
        return super.c3Color(pattern);
      }
    }

    @Override public C3Color c3Color(String[] pattern, C3Threshold threshold) {
      if (proxyHelper != null) {
        final C3JsTypesFactory proxiedInstance = proxyHelper.getInstance(this);
        final C3Color retVal = proxiedInstance.c3Color(pattern, threshold);
        return retVal;
      } else {
        return super.c3Color(pattern, threshold);
      }
    }

    @Override public C3Threshold c3Threshold(int[] values) {
      if (proxyHelper != null) {
        final C3JsTypesFactory proxiedInstance = proxyHelper.getInstance(this);
        final C3Threshold retVal = proxiedInstance.c3Threshold(values);
        return retVal;
      } else {
        return super.c3Threshold(values);
      }
    }

    @Override public C3Gauge c3Gauge(int min, int max) {
      if (proxyHelper != null) {
        final C3JsTypesFactory proxiedInstance = proxyHelper.getInstance(this);
        final C3Gauge retVal = proxiedInstance.c3Gauge(min, max);
        return retVal;
      } else {
        return super.c3Gauge(min, max);
      }
    }

    @Override public C3Donut c3Donut(String holeTitle) {
      if (proxyHelper != null) {
        final C3JsTypesFactory proxiedInstance = proxyHelper.getInstance(this);
        final C3Donut retVal = proxiedInstance.c3Donut(holeTitle);
        return retVal;
      } else {
        return super.c3Donut(holeTitle);
      }
    }

    @Override public C3Tooltip c3Tooltip(FormatCallback callback) {
      if (proxyHelper != null) {
        final C3JsTypesFactory proxiedInstance = proxyHelper.getInstance(this);
        final C3Tooltip retVal = proxiedInstance.c3Tooltip(callback);
        return retVal;
      } else {
        return super.c3Tooltip(callback);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final C3JsTypesFactory proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_r_c_c_j_C3JsTypesFactory__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(C3JsTypesFactory.class, "Type_factory__o_d_r_c_c_j_C3JsTypesFactory__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { C3JsTypesFactory.class, Object.class });
  }

  public C3JsTypesFactory createInstance(final ContextManager contextManager) {
    final C3JsTypesFactory instance = new C3JsTypesFactory();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<C3JsTypesFactory> proxyImpl = new Type_factory__o_d_r_c_c_j_C3JsTypesFactory__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }
}