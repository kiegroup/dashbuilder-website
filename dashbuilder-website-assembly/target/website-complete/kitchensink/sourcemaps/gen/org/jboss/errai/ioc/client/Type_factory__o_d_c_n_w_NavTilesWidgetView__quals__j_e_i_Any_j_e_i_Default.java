package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.logical.shared.HasAttachHandlers;
import com.google.gwt.event.shared.HasHandlers;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ClientBundle.Source;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.EventListener;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasVisibility;
import com.google.gwt.user.client.ui.IsRenderable;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.UIObject;
import com.google.gwt.user.client.ui.Widget;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.enterprise.context.Dependent;
import org.dashbuilder.client.navigation.widget.BaseNavWidgetView;
import org.dashbuilder.client.navigation.widget.NavTilesWidget.View;
import org.dashbuilder.client.navigation.widget.NavTilesWidgetView;
import org.dashbuilder.client.navigation.widget.NavWidgetView;
import org.dashbuilder.common.client.widgets.AlertBox;
import org.dashbuilder.navigation.layout.LayoutRecursionIssueI18n;
import org.jboss.errai.common.client.dom.Div;
import org.jboss.errai.common.client.dom.OrderedList;
import org.jboss.errai.common.client.ui.ElementWrapperWidget;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ui.shared.DataFieldMeta;
import org.jboss.errai.ui.shared.Template;
import org.jboss.errai.ui.shared.TemplateUtil;
import org.jboss.errai.ui.shared.api.style.StyleBindingsRegistry;
import org.uberfire.client.mvp.HasPresenter;
import org.uberfire.client.mvp.UberView;

public class Type_factory__o_d_c_n_w_NavTilesWidgetView__quals__j_e_i_Any_j_e_i_Default extends Factory<NavTilesWidgetView> { public interface o_d_c_n_w_NavTilesWidgetViewTemplateResource extends Template, ClientBundle { @Source("org/dashbuilder/client/navigation/widget/NavTilesWidgetView.html") public TextResource getContents(); }
  public Type_factory__o_d_c_n_w_NavTilesWidgetView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(NavTilesWidgetView.class, "Type_factory__o_d_c_n_w_NavTilesWidgetView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { NavTilesWidgetView.class, BaseNavWidgetView.class, Composite.class, Widget.class, UIObject.class, Object.class, HasVisibility.class, EventListener.class, HasAttachHandlers.class, HasHandlers.class, IsWidget.class, IsRenderable.class, NavWidgetView.class, UberView.class, HasPresenter.class, View.class, LayoutRecursionIssueI18n.class });
  }

  public NavTilesWidgetView createInstance(final ContextManager contextManager) {
    final AlertBox _alertBox_0 = (AlertBox) contextManager.getInstance("Type_factory__o_d_c_c_w_AlertBox__quals__j_e_i_Any_j_e_i_Default");
    final NavTilesWidgetView instance = new NavTilesWidgetView(_alertBox_0);
    registerDependentScopedReference(instance, _alertBox_0);
    setIncompleteInstance(instance);
    final Div NavTilesWidgetView_tilesDiv = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavTilesWidgetView_tilesDiv);
    NavTilesWidgetView_Div_tilesDiv(instance, NavTilesWidgetView_tilesDiv);
    final OrderedList NavTilesWidgetView_breadcrumb = (OrderedList) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_OrderedList__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavTilesWidgetView_breadcrumb);
    NavTilesWidgetView_OrderedList_breadcrumb(instance, NavTilesWidgetView_breadcrumb);
    final Div NavTilesWidgetView_mainDiv = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavTilesWidgetView_mainDiv);
    NavTilesWidgetView_Div_mainDiv(instance, NavTilesWidgetView_mainDiv);
    final Div NavTilesWidgetView_contentDiv = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavTilesWidgetView_contentDiv);
    NavTilesWidgetView_Div_contentDiv(instance, NavTilesWidgetView_contentDiv);
    o_d_c_n_w_NavTilesWidgetViewTemplateResource templateForNavTilesWidgetView = GWT.create(o_d_c_n_w_NavTilesWidgetViewTemplateResource.class);
    Element parentElementForTemplateOfNavTilesWidgetView = TemplateUtil.getRootTemplateParentElement(templateForNavTilesWidgetView.getContents().getText(), "org/dashbuilder/client/navigation/widget/NavTilesWidgetView.html", "");
    TemplateUtil.translateTemplate("org/dashbuilder/client/navigation/widget/NavTilesWidgetView.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfNavTilesWidgetView));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfNavTilesWidgetView));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(4);
    dataFieldMetas.put("mainDiv", new DataFieldMeta());
    dataFieldMetas.put("contentDiv", new DataFieldMeta());
    dataFieldMetas.put("tilesDiv", new DataFieldMeta());
    dataFieldMetas.put("breadcrumb", new DataFieldMeta());
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.NavTilesWidgetView", "org/dashbuilder/client/navigation/widget/NavTilesWidgetView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavTilesWidgetView_Div_mainDiv(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "mainDiv");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.NavTilesWidgetView", "org/dashbuilder/client/navigation/widget/NavTilesWidgetView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavTilesWidgetView_Div_contentDiv(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "contentDiv");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.NavTilesWidgetView", "org/dashbuilder/client/navigation/widget/NavTilesWidgetView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavTilesWidgetView_Div_tilesDiv(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "tilesDiv");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.NavTilesWidgetView", "org/dashbuilder/client/navigation/widget/NavTilesWidgetView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavTilesWidgetView_OrderedList_breadcrumb(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "breadcrumb");
    templateFieldsMap.put("mainDiv", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavTilesWidgetView_Div_mainDiv(instance))));
    templateFieldsMap.put("contentDiv", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavTilesWidgetView_Div_contentDiv(instance))));
    templateFieldsMap.put("tilesDiv", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavTilesWidgetView_Div_tilesDiv(instance))));
    templateFieldsMap.put("breadcrumb", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavTilesWidgetView_OrderedList_breadcrumb(instance))));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfNavTilesWidgetView), templateFieldsMap.values());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((NavTilesWidgetView) instance, contextManager);
  }

  public void destroyInstanceHelper(final NavTilesWidgetView instance, final ContextManager contextManager) {
    TemplateUtil.cleanupWidget(instance);
  }

  native static Div NavTilesWidgetView_Div_mainDiv(NavTilesWidgetView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.NavTilesWidgetView::mainDiv;
  }-*/;

  native static void NavTilesWidgetView_Div_mainDiv(NavTilesWidgetView instance, Div value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.NavTilesWidgetView::mainDiv = value;
  }-*/;

  native static Div NavTilesWidgetView_Div_contentDiv(NavTilesWidgetView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.NavTilesWidgetView::contentDiv;
  }-*/;

  native static void NavTilesWidgetView_Div_contentDiv(NavTilesWidgetView instance, Div value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.NavTilesWidgetView::contentDiv = value;
  }-*/;

  native static Div NavTilesWidgetView_Div_tilesDiv(NavTilesWidgetView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.NavTilesWidgetView::tilesDiv;
  }-*/;

  native static void NavTilesWidgetView_Div_tilesDiv(NavTilesWidgetView instance, Div value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.NavTilesWidgetView::tilesDiv = value;
  }-*/;

  native static OrderedList NavTilesWidgetView_OrderedList_breadcrumb(NavTilesWidgetView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.NavTilesWidgetView::breadcrumb;
  }-*/;

  native static void NavTilesWidgetView_OrderedList_breadcrumb(NavTilesWidgetView instance, OrderedList value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.NavTilesWidgetView::breadcrumb = value;
  }-*/;
}