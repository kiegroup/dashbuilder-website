package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ClientBundle.Source;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.CssResource.NotStrict;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.ui.Widget;
import elemental2.dom.HTMLDivElement;
import elemental2.dom.HTMLElement;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import org.dashbuilder.renderer.c3.client.charts.map.widgets.MapTooltip;
import org.jboss.errai.common.client.api.elemental2.IsElement;
import org.jboss.errai.common.client.ui.ElementWrapperWidget;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;
import org.jboss.errai.ui.shared.DataFieldMeta;
import org.jboss.errai.ui.shared.Template;
import org.jboss.errai.ui.shared.TemplateStyleSheet;
import org.jboss.errai.ui.shared.TemplateUtil;
import org.jboss.errai.ui.shared.api.style.StyleBindingsRegistry;

public class Type_factory__o_d_r_c_c_c_m_w_MapTooltip__quals__j_e_i_Any_j_e_i_Default extends Factory<MapTooltip> { public interface o_d_r_c_c_c_m_w_MapTooltipTemplateResource extends Template, TemplateStyleSheet, ClientBundle { @Source("org/dashbuilder/renderer/c3/client/charts/map/widgets/MapTooltip.html") public TextResource getContents();
  @Source("org/dashbuilder/renderer/c3/client/charts/map/widgets/MapTooltip.css") @NotStrict public CssResource getStyle(); }
  private class Type_factory__o_d_r_c_c_c_m_w_MapTooltip__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends MapTooltip implements Proxy<MapTooltip> {
    private final ProxyHelper<MapTooltip> proxyHelper = new ProxyHelperImpl<MapTooltip>("Type_factory__o_d_r_c_c_c_m_w_MapTooltip__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final MapTooltip instance) {

    }

    public MapTooltip asBeanType() {
      return this;
    }

    public void setInstance(final MapTooltip instance) {
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
        final MapTooltip proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.init();
      } else {
        super.init();
      }
    }

    @Override public HTMLElement getElement() {
      if (proxyHelper != null) {
        final MapTooltip proxiedInstance = proxyHelper.getInstance(this);
        final HTMLElement retVal = proxiedInstance.getElement();
        return retVal;
      } else {
        return super.getElement();
      }
    }

    @Override public void show(String title, String category, Optional data, Function formatter) {
      if (proxyHelper != null) {
        final MapTooltip proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.show(title, category, data, formatter);
      } else {
        super.show(title, category, data, formatter);
      }
    }

    @Override public void hide() {
      if (proxyHelper != null) {
        final MapTooltip proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.hide();
      } else {
        super.hide();
      }
    }

    @Override public void move() {
      if (proxyHelper != null) {
        final MapTooltip proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.move();
      } else {
        super.move();
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final MapTooltip proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_r_c_c_c_m_w_MapTooltip__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(MapTooltip.class, "Type_factory__o_d_r_c_c_c_m_w_MapTooltip__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { MapTooltip.class, Object.class, IsElement.class });
  }

  public void init(final Context context) {
    ((o_d_r_c_c_c_m_w_MapTooltipTemplateResource) GWT.create(o_d_r_c_c_c_m_w_MapTooltipTemplateResource.class)).getStyle().ensureInjected();
  }

  public MapTooltip createInstance(final ContextManager contextManager) {
    final MapTooltip instance = new MapTooltip();
    setIncompleteInstance(instance);
    final HTMLElement MapTooltip_lblTooltipValue = (HTMLElement) contextManager.getContextualInstance("ContextualProvider_factory__e_d_HTMLElement__quals__Universal", new Class[] { }, new Annotation[] { new Named() {
        public Class annotationType() {
          return Named.class;
        }
        public String toString() {
          return "@javax.inject.Named(value=strong)";
        }
        public String value() {
          return "strong";
        }
    } });
    registerDependentScopedReference(instance, MapTooltip_lblTooltipValue);
    MapTooltip_HTMLElement_lblTooltipValue(instance, MapTooltip_lblTooltipValue);
    final HTMLDivElement MapTooltip_mapTooltipContainer = (HTMLDivElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLDivElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, MapTooltip_mapTooltipContainer);
    MapTooltip_HTMLDivElement_mapTooltipContainer(instance, MapTooltip_mapTooltipContainer);
    final HTMLElement MapTooltip_lblTooltipCategory = (HTMLElement) contextManager.getContextualInstance("ContextualProvider_factory__e_d_HTMLElement__quals__Universal", new Class[] { }, new Annotation[] { new Named() {
        public Class annotationType() {
          return Named.class;
        }
        public String toString() {
          return "@javax.inject.Named(value=span)";
        }
        public String value() {
          return "span";
        }
    } });
    registerDependentScopedReference(instance, MapTooltip_lblTooltipCategory);
    MapTooltip_HTMLElement_lblTooltipCategory(instance, MapTooltip_lblTooltipCategory);
    final HTMLElement MapTooltip_lblTooltipTitle = (HTMLElement) contextManager.getContextualInstance("ContextualProvider_factory__e_d_HTMLElement__quals__Universal", new Class[] { }, new Annotation[] { new Named() {
        public Class annotationType() {
          return Named.class;
        }
        public String toString() {
          return "@javax.inject.Named(value=strong)";
        }
        public String value() {
          return "strong";
        }
    } });
    registerDependentScopedReference(instance, MapTooltip_lblTooltipTitle);
    MapTooltip_HTMLElement_lblTooltipTitle(instance, MapTooltip_lblTooltipTitle);
    o_d_r_c_c_c_m_w_MapTooltipTemplateResource templateForMapTooltip = GWT.create(o_d_r_c_c_c_m_w_MapTooltipTemplateResource.class);
    Element parentElementForTemplateOfMapTooltip = TemplateUtil.getRootTemplateParentElement(templateForMapTooltip.getContents().getText(), "org/dashbuilder/renderer/c3/client/charts/map/widgets/MapTooltip.html", "");
    TemplateUtil.translateTemplate("org/dashbuilder/renderer/c3/client/charts/map/widgets/MapTooltip.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfMapTooltip));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfMapTooltip));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(4);
    dataFieldMetas.put("mapTooltipContainer", new DataFieldMeta());
    dataFieldMetas.put("lblTooltipTitle", new DataFieldMeta());
    dataFieldMetas.put("lblTooltipCategory", new DataFieldMeta());
    dataFieldMetas.put("lblTooltipValue", new DataFieldMeta());
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("org.dashbuilder.renderer.c3.client.charts.map.widgets.MapTooltip", "org/dashbuilder/renderer/c3/client/charts/map/widgets/MapTooltip.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(MapTooltip_HTMLDivElement_mapTooltipContainer(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "mapTooltipContainer");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.renderer.c3.client.charts.map.widgets.MapTooltip", "org/dashbuilder/renderer/c3/client/charts/map/widgets/MapTooltip.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(MapTooltip_HTMLElement_lblTooltipTitle(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "lblTooltipTitle");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.renderer.c3.client.charts.map.widgets.MapTooltip", "org/dashbuilder/renderer/c3/client/charts/map/widgets/MapTooltip.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(MapTooltip_HTMLElement_lblTooltipCategory(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "lblTooltipCategory");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.renderer.c3.client.charts.map.widgets.MapTooltip", "org/dashbuilder/renderer/c3/client/charts/map/widgets/MapTooltip.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(MapTooltip_HTMLElement_lblTooltipValue(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "lblTooltipValue");
    templateFieldsMap.put("mapTooltipContainer", ElementWrapperWidget.getWidget(TemplateUtil.asElement(MapTooltip_HTMLDivElement_mapTooltipContainer(instance))));
    templateFieldsMap.put("lblTooltipTitle", ElementWrapperWidget.getWidget(TemplateUtil.asElement(MapTooltip_HTMLElement_lblTooltipTitle(instance))));
    templateFieldsMap.put("lblTooltipCategory", ElementWrapperWidget.getWidget(TemplateUtil.asElement(MapTooltip_HTMLElement_lblTooltipCategory(instance))));
    templateFieldsMap.put("lblTooltipValue", ElementWrapperWidget.getWidget(TemplateUtil.asElement(MapTooltip_HTMLElement_lblTooltipValue(instance))));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfMapTooltip), templateFieldsMap.values());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((MapTooltip) instance, contextManager);
  }

  public void destroyInstanceHelper(final MapTooltip instance, final ContextManager contextManager) {
    TemplateUtil.cleanupTemplated(instance);
  }

  public void invokePostConstructs(final MapTooltip instance) {
    instance.init();
  }

  public Proxy createProxy(final Context context) {
    final Proxy<MapTooltip> proxyImpl = new Type_factory__o_d_r_c_c_c_m_w_MapTooltip__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  native static HTMLElement MapTooltip_HTMLElement_lblTooltipTitle(MapTooltip instance) /*-{
    return instance.@org.dashbuilder.renderer.c3.client.charts.map.widgets.MapTooltip::lblTooltipTitle;
  }-*/;

  native static void MapTooltip_HTMLElement_lblTooltipTitle(MapTooltip instance, HTMLElement value) /*-{
    instance.@org.dashbuilder.renderer.c3.client.charts.map.widgets.MapTooltip::lblTooltipTitle = value;
  }-*/;

  native static HTMLElement MapTooltip_HTMLElement_lblTooltipCategory(MapTooltip instance) /*-{
    return instance.@org.dashbuilder.renderer.c3.client.charts.map.widgets.MapTooltip::lblTooltipCategory;
  }-*/;

  native static void MapTooltip_HTMLElement_lblTooltipCategory(MapTooltip instance, HTMLElement value) /*-{
    instance.@org.dashbuilder.renderer.c3.client.charts.map.widgets.MapTooltip::lblTooltipCategory = value;
  }-*/;

  native static HTMLDivElement MapTooltip_HTMLDivElement_mapTooltipContainer(MapTooltip instance) /*-{
    return instance.@org.dashbuilder.renderer.c3.client.charts.map.widgets.MapTooltip::mapTooltipContainer;
  }-*/;

  native static void MapTooltip_HTMLDivElement_mapTooltipContainer(MapTooltip instance, HTMLDivElement value) /*-{
    instance.@org.dashbuilder.renderer.c3.client.charts.map.widgets.MapTooltip::mapTooltipContainer = value;
  }-*/;

  native static HTMLElement MapTooltip_HTMLElement_lblTooltipValue(MapTooltip instance) /*-{
    return instance.@org.dashbuilder.renderer.c3.client.charts.map.widgets.MapTooltip::lblTooltipValue;
  }-*/;

  native static void MapTooltip_HTMLElement_lblTooltipValue(MapTooltip instance, HTMLElement value) /*-{
    instance.@org.dashbuilder.renderer.c3.client.charts.map.widgets.MapTooltip::lblTooltipValue = value;
  }-*/;
}