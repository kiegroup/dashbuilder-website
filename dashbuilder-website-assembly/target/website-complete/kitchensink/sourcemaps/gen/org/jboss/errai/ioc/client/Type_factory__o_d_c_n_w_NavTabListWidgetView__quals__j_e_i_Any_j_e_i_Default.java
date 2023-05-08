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
import org.dashbuilder.client.navigation.widget.NavTabListWidgetView;
import org.dashbuilder.client.navigation.widget.NavWidgetView;
import org.dashbuilder.client.navigation.widget.TargetDivNavWidget.View;
import org.dashbuilder.client.navigation.widget.TargetDivNavWidgetView;
import org.dashbuilder.common.client.widgets.AlertBox;
import org.dashbuilder.navigation.layout.LayoutRecursionIssueI18n;
import org.jboss.errai.common.client.dom.Div;
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

public class Type_factory__o_d_c_n_w_NavTabListWidgetView__quals__j_e_i_Any_j_e_i_Default extends Factory<NavTabListWidgetView> { public interface o_d_c_n_w_NavTabListWidgetViewTemplateResource extends Template, ClientBundle { @Source("org/dashbuilder/client/navigation/widget/NavTabListWidgetView.html") public TextResource getContents(); }
  public Type_factory__o_d_c_n_w_NavTabListWidgetView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(NavTabListWidgetView.class, "Type_factory__o_d_c_n_w_NavTabListWidgetView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { NavTabListWidgetView.class, TargetDivNavWidgetView.class, BaseNavWidgetView.class, Composite.class, Widget.class, UIObject.class, Object.class, HasVisibility.class, EventListener.class, HasAttachHandlers.class, HasHandlers.class, IsWidget.class, IsRenderable.class, NavWidgetView.class, UberView.class, HasPresenter.class, View.class, LayoutRecursionIssueI18n.class, org.dashbuilder.client.navigation.widget.NavTabListWidget.View.class });
  }

  public NavTabListWidgetView createInstance(final ContextManager contextManager) {
    final AlertBox _alertBox_0 = (AlertBox) contextManager.getInstance("Type_factory__o_d_c_c_w_AlertBox__quals__j_e_i_Any_j_e_i_Default");
    final NavTabListWidgetView instance = new NavTabListWidgetView(_alertBox_0);
    registerDependentScopedReference(instance, _alertBox_0);
    setIncompleteInstance(instance);
    final Div NavTabListWidgetView_tabsDiv = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavTabListWidgetView_tabsDiv);
    NavTabListWidgetView_Div_tabsDiv(instance, NavTabListWidgetView_tabsDiv);
    final Div NavTabListWidgetView_mainDiv = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavTabListWidgetView_mainDiv);
    NavTabListWidgetView_Div_mainDiv(instance, NavTabListWidgetView_mainDiv);
    final Div NavTabListWidgetView_childrenDiv = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavTabListWidgetView_childrenDiv);
    NavTabListWidgetView_Div_childrenDiv(instance, NavTabListWidgetView_childrenDiv);
    final UnorderedList NavTabListWidgetView_tabList = (UnorderedList) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_UnorderedList__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavTabListWidgetView_tabList);
    NavTabListWidgetView_UnorderedList_tabList(instance, NavTabListWidgetView_tabList);
    o_d_c_n_w_NavTabListWidgetViewTemplateResource templateForNavTabListWidgetView = GWT.create(o_d_c_n_w_NavTabListWidgetViewTemplateResource.class);
    Element parentElementForTemplateOfNavTabListWidgetView = TemplateUtil.getRootTemplateParentElement(templateForNavTabListWidgetView.getContents().getText(), "org/dashbuilder/client/navigation/widget/NavTabListWidgetView.html", "");
    TemplateUtil.translateTemplate("org/dashbuilder/client/navigation/widget/NavTabListWidgetView.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfNavTabListWidgetView));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfNavTabListWidgetView));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(4);
    dataFieldMetas.put("mainDiv", new DataFieldMeta());
    dataFieldMetas.put("tabsDiv", new DataFieldMeta());
    dataFieldMetas.put("tabList", new DataFieldMeta());
    dataFieldMetas.put("childrenDiv", new DataFieldMeta());
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.NavTabListWidgetView", "org/dashbuilder/client/navigation/widget/NavTabListWidgetView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavTabListWidgetView_Div_mainDiv(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "mainDiv");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.NavTabListWidgetView", "org/dashbuilder/client/navigation/widget/NavTabListWidgetView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavTabListWidgetView_Div_tabsDiv(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "tabsDiv");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.NavTabListWidgetView", "org/dashbuilder/client/navigation/widget/NavTabListWidgetView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavTabListWidgetView_UnorderedList_tabList(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "tabList");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.NavTabListWidgetView", "org/dashbuilder/client/navigation/widget/NavTabListWidgetView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavTabListWidgetView_Div_childrenDiv(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "childrenDiv");
    templateFieldsMap.put("mainDiv", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavTabListWidgetView_Div_mainDiv(instance))));
    templateFieldsMap.put("tabsDiv", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavTabListWidgetView_Div_tabsDiv(instance))));
    templateFieldsMap.put("tabList", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavTabListWidgetView_UnorderedList_tabList(instance))));
    templateFieldsMap.put("childrenDiv", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavTabListWidgetView_Div_childrenDiv(instance))));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfNavTabListWidgetView), templateFieldsMap.values());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((NavTabListWidgetView) instance, contextManager);
  }

  public void destroyInstanceHelper(final NavTabListWidgetView instance, final ContextManager contextManager) {
    TemplateUtil.cleanupWidget(instance);
  }

  native static UnorderedList NavTabListWidgetView_UnorderedList_tabList(NavTabListWidgetView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.NavTabListWidgetView::tabList;
  }-*/;

  native static void NavTabListWidgetView_UnorderedList_tabList(NavTabListWidgetView instance, UnorderedList value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.NavTabListWidgetView::tabList = value;
  }-*/;

  native static Div NavTabListWidgetView_Div_childrenDiv(NavTabListWidgetView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.NavTabListWidgetView::childrenDiv;
  }-*/;

  native static void NavTabListWidgetView_Div_childrenDiv(NavTabListWidgetView instance, Div value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.NavTabListWidgetView::childrenDiv = value;
  }-*/;

  native static Div NavTabListWidgetView_Div_mainDiv(NavTabListWidgetView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.NavTabListWidgetView::mainDiv;
  }-*/;

  native static void NavTabListWidgetView_Div_mainDiv(NavTabListWidgetView instance, Div value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.NavTabListWidgetView::mainDiv = value;
  }-*/;

  native static Div NavTabListWidgetView_Div_tabsDiv(NavTabListWidgetView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.NavTabListWidgetView::tabsDiv;
  }-*/;

  native static void NavTabListWidgetView_Div_tabsDiv(NavTabListWidgetView instance, Div value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.NavTabListWidgetView::tabsDiv = value;
  }-*/;
}