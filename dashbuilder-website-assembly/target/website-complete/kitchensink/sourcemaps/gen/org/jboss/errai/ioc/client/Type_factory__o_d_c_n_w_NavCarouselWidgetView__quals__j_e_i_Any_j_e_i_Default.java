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
import org.dashbuilder.client.navigation.widget.NavCarouselWidget.View;
import org.dashbuilder.client.navigation.widget.NavCarouselWidgetView;
import org.dashbuilder.client.navigation.widget.NavWidgetView;
import org.dashbuilder.common.client.widgets.AlertBox;
import org.dashbuilder.navigation.layout.LayoutRecursionIssueI18n;
import org.jboss.errai.common.client.dom.Div;
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

public class Type_factory__o_d_c_n_w_NavCarouselWidgetView__quals__j_e_i_Any_j_e_i_Default extends Factory<NavCarouselWidgetView> { public interface o_d_c_n_w_NavCarouselWidgetViewTemplateResource extends Template, ClientBundle { @Source("org/dashbuilder/client/navigation/widget/NavCarouselWidgetView.html") public TextResource getContents(); }
  public Type_factory__o_d_c_n_w_NavCarouselWidgetView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(NavCarouselWidgetView.class, "Type_factory__o_d_c_n_w_NavCarouselWidgetView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { NavCarouselWidgetView.class, BaseNavWidgetView.class, Composite.class, Widget.class, UIObject.class, Object.class, HasVisibility.class, EventListener.class, HasAttachHandlers.class, HasHandlers.class, IsWidget.class, IsRenderable.class, NavWidgetView.class, UberView.class, HasPresenter.class, View.class, LayoutRecursionIssueI18n.class });
  }

  public NavCarouselWidgetView createInstance(final ContextManager contextManager) {
    final AlertBox _alertBox_0 = (AlertBox) contextManager.getInstance("Type_factory__o_d_c_c_w_AlertBox__quals__j_e_i_Any_j_e_i_Default");
    final NavCarouselWidgetView instance = new NavCarouselWidgetView(_alertBox_0);
    registerDependentScopedReference(instance, _alertBox_0);
    setIncompleteInstance(instance);
    final Div NavCarouselWidgetView_mainDiv = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavCarouselWidgetView_mainDiv);
    NavCarouselWidgetView_Div_mainDiv(instance, NavCarouselWidgetView_mainDiv);
    final Div NavCarouselWidgetView_slidesDiv = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavCarouselWidgetView_slidesDiv);
    NavCarouselWidgetView_Div_slidesDiv(instance, NavCarouselWidgetView_slidesDiv);
    final Div NavCarouselWidgetView_carouselDiv = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavCarouselWidgetView_carouselDiv);
    NavCarouselWidgetView_Div_carouselDiv(instance, NavCarouselWidgetView_carouselDiv);
    o_d_c_n_w_NavCarouselWidgetViewTemplateResource templateForNavCarouselWidgetView = GWT.create(o_d_c_n_w_NavCarouselWidgetViewTemplateResource.class);
    Element parentElementForTemplateOfNavCarouselWidgetView = TemplateUtil.getRootTemplateParentElement(templateForNavCarouselWidgetView.getContents().getText(), "org/dashbuilder/client/navigation/widget/NavCarouselWidgetView.html", "");
    TemplateUtil.translateTemplate("org/dashbuilder/client/navigation/widget/NavCarouselWidgetView.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfNavCarouselWidgetView));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfNavCarouselWidgetView));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(3);
    dataFieldMetas.put("mainDiv", new DataFieldMeta());
    dataFieldMetas.put("carouselDiv", new DataFieldMeta());
    dataFieldMetas.put("slidesDiv", new DataFieldMeta());
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.NavCarouselWidgetView", "org/dashbuilder/client/navigation/widget/NavCarouselWidgetView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavCarouselWidgetView_Div_mainDiv(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "mainDiv");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.NavCarouselWidgetView", "org/dashbuilder/client/navigation/widget/NavCarouselWidgetView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavCarouselWidgetView_Div_carouselDiv(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "carouselDiv");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.NavCarouselWidgetView", "org/dashbuilder/client/navigation/widget/NavCarouselWidgetView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavCarouselWidgetView_Div_slidesDiv(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "slidesDiv");
    templateFieldsMap.put("mainDiv", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavCarouselWidgetView_Div_mainDiv(instance))));
    templateFieldsMap.put("carouselDiv", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavCarouselWidgetView_Div_carouselDiv(instance))));
    templateFieldsMap.put("slidesDiv", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavCarouselWidgetView_Div_slidesDiv(instance))));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfNavCarouselWidgetView), templateFieldsMap.values());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((NavCarouselWidgetView) instance, contextManager);
  }

  public void destroyInstanceHelper(final NavCarouselWidgetView instance, final ContextManager contextManager) {
    TemplateUtil.cleanupWidget(instance);
  }

  native static Div NavCarouselWidgetView_Div_carouselDiv(NavCarouselWidgetView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.NavCarouselWidgetView::carouselDiv;
  }-*/;

  native static void NavCarouselWidgetView_Div_carouselDiv(NavCarouselWidgetView instance, Div value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.NavCarouselWidgetView::carouselDiv = value;
  }-*/;

  native static Div NavCarouselWidgetView_Div_mainDiv(NavCarouselWidgetView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.NavCarouselWidgetView::mainDiv;
  }-*/;

  native static void NavCarouselWidgetView_Div_mainDiv(NavCarouselWidgetView instance, Div value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.NavCarouselWidgetView::mainDiv = value;
  }-*/;

  native static Div NavCarouselWidgetView_Div_slidesDiv(NavCarouselWidgetView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.NavCarouselWidgetView::slidesDiv;
  }-*/;

  native static void NavCarouselWidgetView_Div_slidesDiv(NavCarouselWidgetView instance, Div value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.NavCarouselWidgetView::slidesDiv = value;
  }-*/;
}