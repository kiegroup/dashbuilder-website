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
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.enterprise.context.Dependent;
import org.dashbuilder.renderer.c3.client.charts.map.widgets.D3Map;
import org.dashbuilder.renderer.c3.client.charts.map.widgets.MapTooltip;
import org.jboss.errai.common.client.api.elemental2.IsElement;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ui.shared.DataFieldMeta;
import org.jboss.errai.ui.shared.Template;
import org.jboss.errai.ui.shared.TemplateStyleSheet;
import org.jboss.errai.ui.shared.TemplateUtil;
import org.jboss.errai.ui.shared.api.style.StyleBindingsRegistry;

public class Type_factory__o_d_r_c_c_c_m_w_D3Map__quals__j_e_i_Any_j_e_i_Default extends Factory<D3Map> { public interface o_d_r_c_c_c_m_w_D3MapTemplateResource extends Template, TemplateStyleSheet, ClientBundle { @Source("org/dashbuilder/renderer/c3/client/charts/map/widgets/D3Map.html") public TextResource getContents();
  @Source("org/dashbuilder/renderer/c3/client/charts/map/widgets/D3Map.css") @NotStrict public CssResource getStyle(); }
  public Type_factory__o_d_r_c_c_c_m_w_D3Map__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(D3Map.class, "Type_factory__o_d_r_c_c_c_m_w_D3Map__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { D3Map.class, Object.class, IsElement.class });
  }

  public void init(final Context context) {
    ((o_d_r_c_c_c_m_w_D3MapTemplateResource) GWT.create(o_d_r_c_c_c_m_w_D3MapTemplateResource.class)).getStyle().ensureInjected();
  }

  public D3Map createInstance(final ContextManager contextManager) {
    final D3Map instance = new D3Map();
    setIncompleteInstance(instance);
    final MapTooltip D3Map_mapTooltip = (MapTooltip) contextManager.getInstance("Type_factory__o_d_r_c_c_c_m_w_MapTooltip__quals__j_e_i_Any_j_e_i_Default");
    D3Map_MapTooltip_mapTooltip(instance, D3Map_mapTooltip);
    final HTMLDivElement D3Map_mapContainer = (HTMLDivElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLDivElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, D3Map_mapContainer);
    D3Map_HTMLDivElement_mapContainer(instance, D3Map_mapContainer);
    o_d_r_c_c_c_m_w_D3MapTemplateResource templateForD3Map = GWT.create(o_d_r_c_c_c_m_w_D3MapTemplateResource.class);
    Element parentElementForTemplateOfD3Map = TemplateUtil.getRootTemplateParentElement(templateForD3Map.getContents().getText(), "org/dashbuilder/renderer/c3/client/charts/map/widgets/D3Map.html", "");
    TemplateUtil.translateTemplate("org/dashbuilder/renderer/c3/client/charts/map/widgets/D3Map.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfD3Map));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfD3Map));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(0);
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfD3Map), templateFieldsMap.values());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((D3Map) instance, contextManager);
  }

  public void destroyInstanceHelper(final D3Map instance, final ContextManager contextManager) {
    TemplateUtil.cleanupTemplated(instance);
  }

  public void invokePostConstructs(final D3Map instance) {
    instance.init();
  }

  native static HTMLDivElement D3Map_HTMLDivElement_mapContainer(D3Map instance) /*-{
    return instance.@org.dashbuilder.renderer.c3.client.charts.map.widgets.D3Map::mapContainer;
  }-*/;

  native static void D3Map_HTMLDivElement_mapContainer(D3Map instance, HTMLDivElement value) /*-{
    instance.@org.dashbuilder.renderer.c3.client.charts.map.widgets.D3Map::mapContainer = value;
  }-*/;

  native static MapTooltip D3Map_MapTooltip_mapTooltip(D3Map instance) /*-{
    return instance.@org.dashbuilder.renderer.c3.client.charts.map.widgets.D3Map::mapTooltip;
  }-*/;

  native static void D3Map_MapTooltip_mapTooltip(D3Map instance, MapTooltip value) /*-{
    instance.@org.dashbuilder.renderer.c3.client.charts.map.widgets.D3Map::mapTooltip = value;
  }-*/;
}