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
import java.util.function.Supplier;
import javax.enterprise.context.Dependent;
import org.dashbuilder.client.screens.DashboardsListScreen.View;
import org.dashbuilder.client.screens.view.DashboardsListScreenView;
import org.dashbuilder.client.widgets.UploadWidget;
import org.jboss.errai.common.client.api.elemental2.IsElement;
import org.jboss.errai.common.client.ui.ElementWrapperWidget;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ui.shared.DataFieldMeta;
import org.jboss.errai.ui.shared.Template;
import org.jboss.errai.ui.shared.TemplateStyleSheet;
import org.jboss.errai.ui.shared.TemplateUtil;
import org.jboss.errai.ui.shared.api.style.StyleBindingsRegistry;
import org.uberfire.client.mvp.HasPresenter;
import org.uberfire.client.mvp.UberElemental;

public class Type_factory__o_d_c_s_v_DashboardsListScreenView__quals__j_e_i_Any_j_e_i_Default extends Factory<DashboardsListScreenView> { public interface o_d_c_s_v_DashboardsListScreenViewTemplateResource extends Template, TemplateStyleSheet, ClientBundle { @Source("org/dashbuilder/client/screens/view/DashboardsListScreenView.html") public TextResource getContents();
  @Source("org/dashbuilder/client/screens/view/DashboardsListScreenView.css") @NotStrict public CssResource getStyle(); }
  public Type_factory__o_d_c_s_v_DashboardsListScreenView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(DashboardsListScreenView.class, "Type_factory__o_d_c_s_v_DashboardsListScreenView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { DashboardsListScreenView.class, Object.class, View.class, UberElemental.class, IsElement.class, HasPresenter.class });
  }

  public void init(final Context context) {
    ((o_d_c_s_v_DashboardsListScreenViewTemplateResource) GWT.create(o_d_c_s_v_DashboardsListScreenViewTemplateResource.class)).getStyle().ensureInjected();
  }

  public DashboardsListScreenView createInstance(final ContextManager contextManager) {
    final DashboardsListScreenView instance = new DashboardsListScreenView();
    setIncompleteInstance(instance);
    final HTMLDivElement DashboardsListScreenView_dashboardsListRoot = (HTMLDivElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLDivElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, DashboardsListScreenView_dashboardsListRoot);
    DashboardsListScreenView_HTMLDivElement_dashboardsListRoot(instance, DashboardsListScreenView_dashboardsListRoot);
    final HTMLDivElement DashboardsListScreenView_uploadWidgetContainer = (HTMLDivElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLDivElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, DashboardsListScreenView_uploadWidgetContainer);
    DashboardsListScreenView_HTMLDivElement_uploadWidgetContainer(instance, DashboardsListScreenView_uploadWidgetContainer);
    final UploadWidget DashboardsListScreenView_uploadWidget = (UploadWidget) contextManager.getInstance("Type_factory__o_d_c_w_UploadWidget__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, DashboardsListScreenView_uploadWidget);
    DashboardsListScreenView_UploadWidget_uploadWidget(instance, DashboardsListScreenView_uploadWidget);
    final HTMLDivElement DashboardsListScreenView_dashboardsList = (HTMLDivElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLDivElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, DashboardsListScreenView_dashboardsList);
    DashboardsListScreenView_HTMLDivElement_dashboardsList(instance, DashboardsListScreenView_dashboardsList);
    o_d_c_s_v_DashboardsListScreenViewTemplateResource templateForDashboardsListScreenView = GWT.create(o_d_c_s_v_DashboardsListScreenViewTemplateResource.class);
    Element parentElementForTemplateOfDashboardsListScreenView = TemplateUtil.getRootTemplateParentElement(templateForDashboardsListScreenView.getContents().getText(), "org/dashbuilder/client/screens/view/DashboardsListScreenView.html", "");
    TemplateUtil.translateTemplate("org/dashbuilder/client/screens/view/DashboardsListScreenView.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfDashboardsListScreenView));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfDashboardsListScreenView));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(3);
    dataFieldMetas.put("dashboardsListRoot", new DataFieldMeta());
    dataFieldMetas.put("uploadWidgetContainer", new DataFieldMeta());
    dataFieldMetas.put("dashboardsList", new DataFieldMeta());
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.screens.view.DashboardsListScreenView", "org/dashbuilder/client/screens/view/DashboardsListScreenView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(DashboardsListScreenView_HTMLDivElement_dashboardsListRoot(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "dashboardsListRoot");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.screens.view.DashboardsListScreenView", "org/dashbuilder/client/screens/view/DashboardsListScreenView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(DashboardsListScreenView_HTMLDivElement_uploadWidgetContainer(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "uploadWidgetContainer");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.screens.view.DashboardsListScreenView", "org/dashbuilder/client/screens/view/DashboardsListScreenView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(DashboardsListScreenView_HTMLDivElement_dashboardsList(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "dashboardsList");
    templateFieldsMap.put("dashboardsListRoot", ElementWrapperWidget.getWidget(TemplateUtil.asElement(DashboardsListScreenView_HTMLDivElement_dashboardsListRoot(instance))));
    templateFieldsMap.put("uploadWidgetContainer", ElementWrapperWidget.getWidget(TemplateUtil.asElement(DashboardsListScreenView_HTMLDivElement_uploadWidgetContainer(instance))));
    templateFieldsMap.put("dashboardsList", ElementWrapperWidget.getWidget(TemplateUtil.asElement(DashboardsListScreenView_HTMLDivElement_dashboardsList(instance))));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfDashboardsListScreenView), templateFieldsMap.values());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((DashboardsListScreenView) instance, contextManager);
  }

  public void destroyInstanceHelper(final DashboardsListScreenView instance, final ContextManager contextManager) {
    TemplateUtil.cleanupTemplated(instance);
  }

  native static HTMLDivElement DashboardsListScreenView_HTMLDivElement_uploadWidgetContainer(DashboardsListScreenView instance) /*-{
    return instance.@org.dashbuilder.client.screens.view.DashboardsListScreenView::uploadWidgetContainer;
  }-*/;

  native static void DashboardsListScreenView_HTMLDivElement_uploadWidgetContainer(DashboardsListScreenView instance, HTMLDivElement value) /*-{
    instance.@org.dashbuilder.client.screens.view.DashboardsListScreenView::uploadWidgetContainer = value;
  }-*/;

  native static UploadWidget DashboardsListScreenView_UploadWidget_uploadWidget(DashboardsListScreenView instance) /*-{
    return instance.@org.dashbuilder.client.screens.view.DashboardsListScreenView::uploadWidget;
  }-*/;

  native static void DashboardsListScreenView_UploadWidget_uploadWidget(DashboardsListScreenView instance, UploadWidget value) /*-{
    instance.@org.dashbuilder.client.screens.view.DashboardsListScreenView::uploadWidget = value;
  }-*/;

  native static HTMLDivElement DashboardsListScreenView_HTMLDivElement_dashboardsList(DashboardsListScreenView instance) /*-{
    return instance.@org.dashbuilder.client.screens.view.DashboardsListScreenView::dashboardsList;
  }-*/;

  native static void DashboardsListScreenView_HTMLDivElement_dashboardsList(DashboardsListScreenView instance, HTMLDivElement value) /*-{
    instance.@org.dashbuilder.client.screens.view.DashboardsListScreenView::dashboardsList = value;
  }-*/;

  native static HTMLDivElement DashboardsListScreenView_HTMLDivElement_dashboardsListRoot(DashboardsListScreenView instance) /*-{
    return instance.@org.dashbuilder.client.screens.view.DashboardsListScreenView::dashboardsListRoot;
  }-*/;

  native static void DashboardsListScreenView_HTMLDivElement_dashboardsListRoot(DashboardsListScreenView instance, HTMLDivElement value) /*-{
    instance.@org.dashbuilder.client.screens.view.DashboardsListScreenView::dashboardsListRoot = value;
  }-*/;
}