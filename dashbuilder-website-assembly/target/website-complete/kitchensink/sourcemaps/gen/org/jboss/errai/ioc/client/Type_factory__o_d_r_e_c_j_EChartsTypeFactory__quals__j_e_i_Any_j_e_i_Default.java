package org.jboss.errai.ioc.client;

import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.displayer.DisplayerType;
import org.dashbuilder.renderer.echarts.client.js.ECharts.AreaStyle;
import org.dashbuilder.renderer.echarts.client.js.ECharts.AxisLabel;
import org.dashbuilder.renderer.echarts.client.js.ECharts.AxisLine;
import org.dashbuilder.renderer.echarts.client.js.ECharts.AxisTick;
import org.dashbuilder.renderer.echarts.client.js.ECharts.ChartInitParams;
import org.dashbuilder.renderer.echarts.client.js.ECharts.Data;
import org.dashbuilder.renderer.echarts.client.js.ECharts.DataView;
import org.dashbuilder.renderer.echarts.client.js.ECharts.DataZoom;
import org.dashbuilder.renderer.echarts.client.js.ECharts.Dataset;
import org.dashbuilder.renderer.echarts.client.js.ECharts.Encode;
import org.dashbuilder.renderer.echarts.client.js.ECharts.Grid;
import org.dashbuilder.renderer.echarts.client.js.ECharts.InRange;
import org.dashbuilder.renderer.echarts.client.js.ECharts.ItemStyle;
import org.dashbuilder.renderer.echarts.client.js.ECharts.Label;
import org.dashbuilder.renderer.echarts.client.js.ECharts.Legend;
import org.dashbuilder.renderer.echarts.client.js.ECharts.LineStyle;
import org.dashbuilder.renderer.echarts.client.js.ECharts.Option;
import org.dashbuilder.renderer.echarts.client.js.ECharts.Piece;
import org.dashbuilder.renderer.echarts.client.js.ECharts.Pointer;
import org.dashbuilder.renderer.echarts.client.js.ECharts.Progress;
import org.dashbuilder.renderer.echarts.client.js.ECharts.SaveAsImage;
import org.dashbuilder.renderer.echarts.client.js.ECharts.Series;
import org.dashbuilder.renderer.echarts.client.js.ECharts.SeriesType;
import org.dashbuilder.renderer.echarts.client.js.ECharts.SplitLine;
import org.dashbuilder.renderer.echarts.client.js.ECharts.Title;
import org.dashbuilder.renderer.echarts.client.js.ECharts.ToolBoxFeature;
import org.dashbuilder.renderer.echarts.client.js.ECharts.Toolbox;
import org.dashbuilder.renderer.echarts.client.js.ECharts.Tooltip;
import org.dashbuilder.renderer.echarts.client.js.ECharts.VisualMap;
import org.dashbuilder.renderer.echarts.client.js.ECharts.XAxis;
import org.dashbuilder.renderer.echarts.client.js.ECharts.YAxis;
import org.dashbuilder.renderer.echarts.client.js.EChartsTypeFactory;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;

public class Type_factory__o_d_r_e_c_j_EChartsTypeFactory__quals__j_e_i_Any_j_e_i_Default extends Factory<EChartsTypeFactory> { private class Type_factory__o_d_r_e_c_j_EChartsTypeFactory__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends EChartsTypeFactory implements Proxy<EChartsTypeFactory> {
    private final ProxyHelper<EChartsTypeFactory> proxyHelper = new ProxyHelperImpl<EChartsTypeFactory>("Type_factory__o_d_r_e_c_j_EChartsTypeFactory__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final EChartsTypeFactory instance) {

    }

    public EChartsTypeFactory asBeanType() {
      return this;
    }

    public void setInstance(final EChartsTypeFactory instance) {
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

    @Override public Option newOption() {
      if (proxyHelper != null) {
        final EChartsTypeFactory proxiedInstance = proxyHelper.getInstance(this);
        final Option retVal = proxiedInstance.newOption();
        return retVal;
      } else {
        return super.newOption();
      }
    }

    @Override public Title newTitle() {
      if (proxyHelper != null) {
        final EChartsTypeFactory proxiedInstance = proxyHelper.getInstance(this);
        final Title retVal = proxiedInstance.newTitle();
        return retVal;
      } else {
        return super.newTitle();
      }
    }

    @Override public ChartInitParams newChartInitParams() {
      if (proxyHelper != null) {
        final EChartsTypeFactory proxiedInstance = proxyHelper.getInstance(this);
        final ChartInitParams retVal = proxiedInstance.newChartInitParams();
        return retVal;
      } else {
        return super.newChartInitParams();
      }
    }

    @Override public YAxis newYAxis() {
      if (proxyHelper != null) {
        final EChartsTypeFactory proxiedInstance = proxyHelper.getInstance(this);
        final YAxis retVal = proxiedInstance.newYAxis();
        return retVal;
      } else {
        return super.newYAxis();
      }
    }

    @Override public XAxis newXAxis() {
      if (proxyHelper != null) {
        final EChartsTypeFactory proxiedInstance = proxyHelper.getInstance(this);
        final XAxis retVal = proxiedInstance.newXAxis();
        return retVal;
      } else {
        return super.newXAxis();
      }
    }

    @Override public AxisLabel newAxisLabel() {
      if (proxyHelper != null) {
        final EChartsTypeFactory proxiedInstance = proxyHelper.getInstance(this);
        final AxisLabel retVal = proxiedInstance.newAxisLabel();
        return retVal;
      } else {
        return super.newAxisLabel();
      }
    }

    @Override public Series newSeries() {
      if (proxyHelper != null) {
        final EChartsTypeFactory proxiedInstance = proxyHelper.getInstance(this);
        final Series retVal = proxiedInstance.newSeries();
        return retVal;
      } else {
        return super.newSeries();
      }
    }

    @Override public AreaStyle newAreaStyle() {
      if (proxyHelper != null) {
        final EChartsTypeFactory proxiedInstance = proxyHelper.getInstance(this);
        final AreaStyle retVal = proxiedInstance.newAreaStyle();
        return retVal;
      } else {
        return super.newAreaStyle();
      }
    }

    @Override public Grid newGrid() {
      if (proxyHelper != null) {
        final EChartsTypeFactory proxiedInstance = proxyHelper.getInstance(this);
        final Grid retVal = proxiedInstance.newGrid();
        return retVal;
      } else {
        return super.newGrid();
      }
    }

    @Override public SplitLine newSplitLine() {
      if (proxyHelper != null) {
        final EChartsTypeFactory proxiedInstance = proxyHelper.getInstance(this);
        final SplitLine retVal = proxiedInstance.newSplitLine();
        return retVal;
      } else {
        return super.newSplitLine();
      }
    }

    @Override public DataZoom newDataZoom() {
      if (proxyHelper != null) {
        final EChartsTypeFactory proxiedInstance = proxyHelper.getInstance(this);
        final DataZoom retVal = proxiedInstance.newDataZoom();
        return retVal;
      } else {
        return super.newDataZoom();
      }
    }

    @Override public Legend newLegend() {
      if (proxyHelper != null) {
        final EChartsTypeFactory proxiedInstance = proxyHelper.getInstance(this);
        final Legend retVal = proxiedInstance.newLegend();
        return retVal;
      } else {
        return super.newLegend();
      }
    }

    @Override public Tooltip newTooltip() {
      if (proxyHelper != null) {
        final EChartsTypeFactory proxiedInstance = proxyHelper.getInstance(this);
        final Tooltip retVal = proxiedInstance.newTooltip();
        return retVal;
      } else {
        return super.newTooltip();
      }
    }

    @Override public Label newLabel() {
      if (proxyHelper != null) {
        final EChartsTypeFactory proxiedInstance = proxyHelper.getInstance(this);
        final Label retVal = proxiedInstance.newLabel();
        return retVal;
      } else {
        return super.newLabel();
      }
    }

    @Override public Toolbox newToolbox() {
      if (proxyHelper != null) {
        final EChartsTypeFactory proxiedInstance = proxyHelper.getInstance(this);
        final Toolbox retVal = proxiedInstance.newToolbox();
        return retVal;
      } else {
        return super.newToolbox();
      }
    }

    @Override public DataView newDataView() {
      if (proxyHelper != null) {
        final EChartsTypeFactory proxiedInstance = proxyHelper.getInstance(this);
        final DataView retVal = proxiedInstance.newDataView();
        return retVal;
      } else {
        return super.newDataView();
      }
    }

    @Override public SaveAsImage newSaveAsImage() {
      if (proxyHelper != null) {
        final EChartsTypeFactory proxiedInstance = proxyHelper.getInstance(this);
        final SaveAsImage retVal = proxiedInstance.newSaveAsImage();
        return retVal;
      } else {
        return super.newSaveAsImage();
      }
    }

    @Override public ToolBoxFeature newToolBoxFeature() {
      if (proxyHelper != null) {
        final EChartsTypeFactory proxiedInstance = proxyHelper.getInstance(this);
        final ToolBoxFeature retVal = proxiedInstance.newToolBoxFeature();
        return retVal;
      } else {
        return super.newToolBoxFeature();
      }
    }

    @Override public Encode newEncode() {
      if (proxyHelper != null) {
        final EChartsTypeFactory proxiedInstance = proxyHelper.getInstance(this);
        final Encode retVal = proxiedInstance.newEncode();
        return retVal;
      } else {
        return super.newEncode();
      }
    }

    @Override public Dataset newDataset() {
      if (proxyHelper != null) {
        final EChartsTypeFactory proxiedInstance = proxyHelper.getInstance(this);
        final Dataset retVal = proxiedInstance.newDataset();
        return retVal;
      } else {
        return super.newDataset();
      }
    }

    @Override public ItemStyle newItemStyle() {
      if (proxyHelper != null) {
        final EChartsTypeFactory proxiedInstance = proxyHelper.getInstance(this);
        final ItemStyle retVal = proxiedInstance.newItemStyle();
        return retVal;
      } else {
        return super.newItemStyle();
      }
    }

    @Override public Data newData() {
      if (proxyHelper != null) {
        final EChartsTypeFactory proxiedInstance = proxyHelper.getInstance(this);
        final Data retVal = proxiedInstance.newData();
        return retVal;
      } else {
        return super.newData();
      }
    }

    @Override public VisualMap newVisualMap() {
      if (proxyHelper != null) {
        final EChartsTypeFactory proxiedInstance = proxyHelper.getInstance(this);
        final VisualMap retVal = proxiedInstance.newVisualMap();
        return retVal;
      } else {
        return super.newVisualMap();
      }
    }

    @Override public Piece newPiece(long min, long max, String color) {
      if (proxyHelper != null) {
        final EChartsTypeFactory proxiedInstance = proxyHelper.getInstance(this);
        final Piece retVal = proxiedInstance.newPiece(min, max, color);
        return retVal;
      } else {
        return super.newPiece(min, max, color);
      }
    }

    @Override public Piece newPiece() {
      if (proxyHelper != null) {
        final EChartsTypeFactory proxiedInstance = proxyHelper.getInstance(this);
        final Piece retVal = proxiedInstance.newPiece();
        return retVal;
      } else {
        return super.newPiece();
      }
    }

    @Override public Pointer newPointer() {
      if (proxyHelper != null) {
        final EChartsTypeFactory proxiedInstance = proxyHelper.getInstance(this);
        final Pointer retVal = proxiedInstance.newPointer();
        return retVal;
      } else {
        return super.newPointer();
      }
    }

    @Override public Progress newProgress() {
      if (proxyHelper != null) {
        final EChartsTypeFactory proxiedInstance = proxyHelper.getInstance(this);
        final Progress retVal = proxiedInstance.newProgress();
        return retVal;
      } else {
        return super.newProgress();
      }
    }

    @Override public AxisLine newAxisLine() {
      if (proxyHelper != null) {
        final EChartsTypeFactory proxiedInstance = proxyHelper.getInstance(this);
        final AxisLine retVal = proxiedInstance.newAxisLine();
        return retVal;
      } else {
        return super.newAxisLine();
      }
    }

    @Override public AxisTick newAxisTick() {
      if (proxyHelper != null) {
        final EChartsTypeFactory proxiedInstance = proxyHelper.getInstance(this);
        final AxisTick retVal = proxiedInstance.newAxisTick();
        return retVal;
      } else {
        return super.newAxisTick();
      }
    }

    @Override public LineStyle newLineStyle() {
      if (proxyHelper != null) {
        final EChartsTypeFactory proxiedInstance = proxyHelper.getInstance(this);
        final LineStyle retVal = proxiedInstance.newLineStyle();
        return retVal;
      } else {
        return super.newLineStyle();
      }
    }

    @Override public InRange newInRange() {
      if (proxyHelper != null) {
        final EChartsTypeFactory proxiedInstance = proxyHelper.getInstance(this);
        final InRange retVal = proxiedInstance.newInRange();
        return retVal;
      } else {
        return super.newInRange();
      }
    }

    @Override public SeriesType convertDisplayerType(DisplayerType displayerType) {
      if (proxyHelper != null) {
        final EChartsTypeFactory proxiedInstance = proxyHelper.getInstance(this);
        final SeriesType retVal = proxiedInstance.convertDisplayerType(displayerType);
        return retVal;
      } else {
        return super.convertDisplayerType(displayerType);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final EChartsTypeFactory proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_r_e_c_j_EChartsTypeFactory__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(EChartsTypeFactory.class, "Type_factory__o_d_r_e_c_j_EChartsTypeFactory__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { EChartsTypeFactory.class, Object.class });
  }

  public EChartsTypeFactory createInstance(final ContextManager contextManager) {
    final EChartsTypeFactory instance = new EChartsTypeFactory();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<EChartsTypeFactory> proxyImpl = new Type_factory__o_d_r_e_c_j_EChartsTypeFactory__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }
}