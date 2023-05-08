package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ClientBundle.Source;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.ui.Widget;
import elemental2.dom.HTMLDivElement;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.enterprise.context.Dependent;
import org.dashbuilder.client.RuntimeCommunication;
import org.dashbuilder.client.navigation.widget.NavTilesWidget;
import org.dashbuilder.client.screens.RuntimeScreen.View;
import org.dashbuilder.client.screens.view.RuntimeScreenView;
import org.jboss.errai.common.client.api.elemental2.IsElement;
import org.jboss.errai.common.client.dom.elemental2.Elemental2DomUtil;
import org.jboss.errai.common.client.ui.ElementWrapperWidget;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ui.shared.DataFieldMeta;
import org.jboss.errai.ui.shared.Template;
import org.jboss.errai.ui.shared.TemplateUtil;
import org.jboss.errai.ui.shared.api.style.StyleBindingsRegistry;
import org.uberfire.client.mvp.HasPresenter;
import org.uberfire.client.mvp.UberElemental;
import org.uberfire.ext.widgets.common.client.common.BusyIndicatorView;

public class Type_factory__o_d_c_s_v_RuntimeScreenView__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimeScreenView> { public interface o_d_c_s_v_RuntimeScreenViewTemplateResource extends Template, ClientBundle { @Source("org/dashbuilder/client/screens/view/RuntimeScreenView.html") public TextResource getContents(); }
  public Type_factory__o_d_c_s_v_RuntimeScreenView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(RuntimeScreenView.class, "Type_factory__o_d_c_s_v_RuntimeScreenView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { RuntimeScreenView.class, Object.class, View.class, UberElemental.class, IsElement.class, HasPresenter.class });
  }

  public RuntimeScreenView createInstance(final ContextManager contextManager) {
    final RuntimeScreenView instance = new RuntimeScreenView();
    setIncompleteInstance(instance);
    final RuntimeCommunication RuntimeScreenView_runtimeCommunication = (RuntimeCommunication) contextManager.getInstance("Type_factory__o_d_c_RuntimeCommunication__quals__j_e_i_Any_j_e_i_Default");
    RuntimeScreenView_RuntimeCommunication_runtimeCommunication(instance, RuntimeScreenView_runtimeCommunication);
    final HTMLDivElement RuntimeScreenView_runtimePage = (HTMLDivElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLDivElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, RuntimeScreenView_runtimePage);
    RuntimeScreenView_HTMLDivElement_runtimePage(instance, RuntimeScreenView_runtimePage);
    final BusyIndicatorView RuntimeScreenView_loading = (BusyIndicatorView) contextManager.getInstance("Type_factory__o_u_e_w_c_c_c_BusyIndicatorView__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, RuntimeScreenView_loading);
    RuntimeScreenView_BusyIndicatorView_loading(instance, RuntimeScreenView_loading);
    final NavTilesWidget RuntimeScreenView_tilesWidget = (NavTilesWidget) contextManager.getInstance("Type_factory__o_d_c_n_w_NavTilesWidget__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, RuntimeScreenView_tilesWidget);
    RuntimeScreenView_NavTilesWidget_tilesWidget(instance, RuntimeScreenView_tilesWidget);
    final Elemental2DomUtil RuntimeScreenView_elementalUtil = (Elemental2DomUtil) contextManager.getInstance("Type_factory__o_j_e_c_c_d_e_Elemental2DomUtil__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, RuntimeScreenView_elementalUtil);
    RuntimeScreenView_Elemental2DomUtil_elementalUtil(instance, RuntimeScreenView_elementalUtil);
    o_d_c_s_v_RuntimeScreenViewTemplateResource templateForRuntimeScreenView = GWT.create(o_d_c_s_v_RuntimeScreenViewTemplateResource.class);
    Element parentElementForTemplateOfRuntimeScreenView = TemplateUtil.getRootTemplateParentElement(templateForRuntimeScreenView.getContents().getText(), "org/dashbuilder/client/screens/view/RuntimeScreenView.html", "");
    TemplateUtil.translateTemplate("org/dashbuilder/client/screens/view/RuntimeScreenView.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfRuntimeScreenView));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfRuntimeScreenView));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(1);
    dataFieldMetas.put("runtimePage", new DataFieldMeta());
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.screens.view.RuntimeScreenView", "org/dashbuilder/client/screens/view/RuntimeScreenView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(RuntimeScreenView_HTMLDivElement_runtimePage(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "runtimePage");
    templateFieldsMap.put("runtimePage", ElementWrapperWidget.getWidget(TemplateUtil.asElement(RuntimeScreenView_HTMLDivElement_runtimePage(instance))));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfRuntimeScreenView), templateFieldsMap.values());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((RuntimeScreenView) instance, contextManager);
  }

  public void destroyInstanceHelper(final RuntimeScreenView instance, final ContextManager contextManager) {
    TemplateUtil.cleanupTemplated(instance);
  }

  native static RuntimeCommunication RuntimeScreenView_RuntimeCommunication_runtimeCommunication(RuntimeScreenView instance) /*-{
    return instance.@org.dashbuilder.client.screens.view.RuntimeScreenView::runtimeCommunication;
  }-*/;

  native static void RuntimeScreenView_RuntimeCommunication_runtimeCommunication(RuntimeScreenView instance, RuntimeCommunication value) /*-{
    instance.@org.dashbuilder.client.screens.view.RuntimeScreenView::runtimeCommunication = value;
  }-*/;

  native static HTMLDivElement RuntimeScreenView_HTMLDivElement_runtimePage(RuntimeScreenView instance) /*-{
    return instance.@org.dashbuilder.client.screens.view.RuntimeScreenView::runtimePage;
  }-*/;

  native static void RuntimeScreenView_HTMLDivElement_runtimePage(RuntimeScreenView instance, HTMLDivElement value) /*-{
    instance.@org.dashbuilder.client.screens.view.RuntimeScreenView::runtimePage = value;
  }-*/;

  native static NavTilesWidget RuntimeScreenView_NavTilesWidget_tilesWidget(RuntimeScreenView instance) /*-{
    return instance.@org.dashbuilder.client.screens.view.RuntimeScreenView::tilesWidget;
  }-*/;

  native static void RuntimeScreenView_NavTilesWidget_tilesWidget(RuntimeScreenView instance, NavTilesWidget value) /*-{
    instance.@org.dashbuilder.client.screens.view.RuntimeScreenView::tilesWidget = value;
  }-*/;

  native static BusyIndicatorView RuntimeScreenView_BusyIndicatorView_loading(RuntimeScreenView instance) /*-{
    return instance.@org.dashbuilder.client.screens.view.RuntimeScreenView::loading;
  }-*/;

  native static void RuntimeScreenView_BusyIndicatorView_loading(RuntimeScreenView instance, BusyIndicatorView value) /*-{
    instance.@org.dashbuilder.client.screens.view.RuntimeScreenView::loading = value;
  }-*/;

  native static Elemental2DomUtil RuntimeScreenView_Elemental2DomUtil_elementalUtil(RuntimeScreenView instance) /*-{
    return instance.@org.dashbuilder.client.screens.view.RuntimeScreenView::elementalUtil;
  }-*/;

  native static void RuntimeScreenView_Elemental2DomUtil_elementalUtil(RuntimeScreenView instance, Elemental2DomUtil value) /*-{
    instance.@org.dashbuilder.client.screens.view.RuntimeScreenView::elementalUtil = value;
  }-*/;
}