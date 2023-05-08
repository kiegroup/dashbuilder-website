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
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import org.dashbuilder.client.navigation.widget.BaseNavWidgetView;
import org.dashbuilder.client.navigation.widget.NavMenuBarWidgetView;
import org.dashbuilder.client.navigation.widget.NavWidgetView;
import org.dashbuilder.client.navigation.widget.TargetDivNavWidget.View;
import org.dashbuilder.client.navigation.widget.TargetDivNavWidgetView;
import org.dashbuilder.common.client.widgets.AlertBox;
import org.dashbuilder.navigation.layout.LayoutRecursionIssueI18n;
import org.jboss.errai.common.client.dom.Div;
import org.jboss.errai.common.client.dom.HTMLElement;
import org.jboss.errai.common.client.dom.UnorderedList;
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

public class Type_factory__o_d_c_n_w_NavMenuBarWidgetView__quals__j_e_i_Any_j_e_i_Default extends Factory<NavMenuBarWidgetView> { public interface o_d_c_n_w_NavMenuBarWidgetViewTemplateResource extends Template, ClientBundle { @Source("org/dashbuilder/client/navigation/widget/NavMenuBarWidgetView.html") public TextResource getContents(); }
  public Type_factory__o_d_c_n_w_NavMenuBarWidgetView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(NavMenuBarWidgetView.class, "Type_factory__o_d_c_n_w_NavMenuBarWidgetView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { NavMenuBarWidgetView.class, TargetDivNavWidgetView.class, BaseNavWidgetView.class, Composite.class, Widget.class, UIObject.class, Object.class, HasVisibility.class, EventListener.class, HasAttachHandlers.class, HasHandlers.class, IsWidget.class, IsRenderable.class, NavWidgetView.class, UberView.class, HasPresenter.class, View.class, LayoutRecursionIssueI18n.class, org.dashbuilder.client.navigation.widget.NavMenuBarWidget.View.class });
  }

  public NavMenuBarWidgetView createInstance(final ContextManager contextManager) {
    final AlertBox _alertBox_0 = (AlertBox) contextManager.getInstance("Type_factory__o_d_c_c_w_AlertBox__quals__j_e_i_Any_j_e_i_Default");
    final NavMenuBarWidgetView instance = new NavMenuBarWidgetView(_alertBox_0);
    registerDependentScopedReference(instance, _alertBox_0);
    setIncompleteInstance(instance);
    final UnorderedList NavMenuBarWidgetView_navBar = (UnorderedList) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_UnorderedList__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavMenuBarWidgetView_navBar);
    NavMenuBarWidgetView_UnorderedList_navBar(instance, NavMenuBarWidgetView_navBar);
    final HTMLElement NavMenuBarWidgetView_nav = (HTMLElement) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_d_HTMLElement__quals__Universal", new Class[] { }, new Annotation[] { new Named() {
        public Class annotationType() {
          return Named.class;
        }
        public String toString() {
          return "@javax.inject.Named(value=nav)";
        }
        public String value() {
          return "nav";
        }
    } });
    registerDependentScopedReference(instance, NavMenuBarWidgetView_nav);
    NavMenuBarWidgetView_HTMLElement_nav(instance, NavMenuBarWidgetView_nav);
    final Div NavMenuBarWidgetView_mainDiv = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavMenuBarWidgetView_mainDiv);
    NavMenuBarWidgetView_Div_mainDiv(instance, NavMenuBarWidgetView_mainDiv);
    o_d_c_n_w_NavMenuBarWidgetViewTemplateResource templateForNavMenuBarWidgetView = GWT.create(o_d_c_n_w_NavMenuBarWidgetViewTemplateResource.class);
    Element parentElementForTemplateOfNavMenuBarWidgetView = TemplateUtil.getRootTemplateParentElement(templateForNavMenuBarWidgetView.getContents().getText(), "org/dashbuilder/client/navigation/widget/NavMenuBarWidgetView.html", "");
    TemplateUtil.translateTemplate("org/dashbuilder/client/navigation/widget/NavMenuBarWidgetView.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfNavMenuBarWidgetView));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfNavMenuBarWidgetView));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(3);
    dataFieldMetas.put("mainDiv", new DataFieldMeta());
    dataFieldMetas.put("navBar", new DataFieldMeta());
    dataFieldMetas.put("nav", new DataFieldMeta());
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.NavMenuBarWidgetView", "org/dashbuilder/client/navigation/widget/NavMenuBarWidgetView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavMenuBarWidgetView_Div_mainDiv(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "mainDiv");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.NavMenuBarWidgetView", "org/dashbuilder/client/navigation/widget/NavMenuBarWidgetView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavMenuBarWidgetView_UnorderedList_navBar(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "navBar");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.NavMenuBarWidgetView", "org/dashbuilder/client/navigation/widget/NavMenuBarWidgetView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavMenuBarWidgetView_HTMLElement_nav(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "nav");
    templateFieldsMap.put("mainDiv", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavMenuBarWidgetView_Div_mainDiv(instance))));
    templateFieldsMap.put("navBar", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavMenuBarWidgetView_UnorderedList_navBar(instance))));
    templateFieldsMap.put("nav", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavMenuBarWidgetView_HTMLElement_nav(instance))));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfNavMenuBarWidgetView), templateFieldsMap.values());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((NavMenuBarWidgetView) instance, contextManager);
  }

  public void destroyInstanceHelper(final NavMenuBarWidgetView instance, final ContextManager contextManager) {
    TemplateUtil.cleanupWidget(instance);
  }

  native static UnorderedList NavMenuBarWidgetView_UnorderedList_navBar(NavMenuBarWidgetView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.NavMenuBarWidgetView::navBar;
  }-*/;

  native static void NavMenuBarWidgetView_UnorderedList_navBar(NavMenuBarWidgetView instance, UnorderedList value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.NavMenuBarWidgetView::navBar = value;
  }-*/;

  native static Div NavMenuBarWidgetView_Div_mainDiv(NavMenuBarWidgetView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.NavMenuBarWidgetView::mainDiv;
  }-*/;

  native static void NavMenuBarWidgetView_Div_mainDiv(NavMenuBarWidgetView instance, Div value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.NavMenuBarWidgetView::mainDiv = value;
  }-*/;

  native static HTMLElement NavMenuBarWidgetView_HTMLElement_nav(NavMenuBarWidgetView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.NavMenuBarWidgetView::nav;
  }-*/;

  native static void NavMenuBarWidgetView_HTMLElement_nav(NavMenuBarWidgetView instance, HTMLElement value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.NavMenuBarWidgetView::nav = value;
  }-*/;
}