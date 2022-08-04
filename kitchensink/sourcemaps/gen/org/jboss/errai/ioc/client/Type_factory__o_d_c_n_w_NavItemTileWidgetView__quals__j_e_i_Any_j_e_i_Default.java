package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ClientBundle.Source;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.CssResource.NotStrict;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.ui.Widget;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.enterprise.context.Dependent;
import org.dashbuilder.client.navigation.widget.NavItemTileWidget.View;
import org.dashbuilder.client.navigation.widget.NavItemTileWidgetView;
import org.jboss.errai.common.client.api.IsElement;
import org.jboss.errai.common.client.dom.Div;
import org.jboss.errai.common.client.dom.Span;
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
import org.uberfire.client.mvp.UberElement;

public class Type_factory__o_d_c_n_w_NavItemTileWidgetView__quals__j_e_i_Any_j_e_i_Default extends Factory<NavItemTileWidgetView> { public interface o_d_c_n_w_NavItemTileWidgetViewTemplateResource extends Template, TemplateStyleSheet, ClientBundle { @Source("org/dashbuilder/client/navigation/widget/NavItemTileWidgetView.html") public TextResource getContents();
  @Source("org/dashbuilder/client/navigation/widget/NavItemTileWidgetView.css") @NotStrict public CssResource getStyle(); }
  public Type_factory__o_d_c_n_w_NavItemTileWidgetView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(NavItemTileWidgetView.class, "Type_factory__o_d_c_n_w_NavItemTileWidgetView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { NavItemTileWidgetView.class, Object.class, View.class, UberElement.class, IsElement.class, HasPresenter.class, org.jboss.errai.ui.client.local.api.IsElement.class });
  }

  public void init(final Context context) {
    ((o_d_c_n_w_NavItemTileWidgetViewTemplateResource) GWT.create(o_d_c_n_w_NavItemTileWidgetViewTemplateResource.class)).getStyle().ensureInjected();
  }

  public NavItemTileWidgetView createInstance(final ContextManager contextManager) {
    final NavItemTileWidgetView instance = new NavItemTileWidgetView();
    setIncompleteInstance(instance);
    final Span NavItemTileWidgetView_iconSpan = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavItemTileWidgetView_iconSpan);
    NavItemTileWidgetView_Span_iconSpan(instance, NavItemTileWidgetView_iconSpan);
    final Span NavItemTileWidgetView_textSpan = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavItemTileWidgetView_textSpan);
    NavItemTileWidgetView_Span_textSpan(instance, NavItemTileWidgetView_textSpan);
    final Div NavItemTileWidgetView_mainDiv = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavItemTileWidgetView_mainDiv);
    NavItemTileWidgetView_Div_mainDiv(instance, NavItemTileWidgetView_mainDiv);
    final Div NavItemTileWidgetView_iconDiv = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavItemTileWidgetView_iconDiv);
    NavItemTileWidgetView_Div_iconDiv(instance, NavItemTileWidgetView_iconDiv);
    o_d_c_n_w_NavItemTileWidgetViewTemplateResource templateForNavItemTileWidgetView = GWT.create(o_d_c_n_w_NavItemTileWidgetViewTemplateResource.class);
    Element parentElementForTemplateOfNavItemTileWidgetView = TemplateUtil.getRootTemplateParentElement(templateForNavItemTileWidgetView.getContents().getText(), "org/dashbuilder/client/navigation/widget/NavItemTileWidgetView.html", "");
    TemplateUtil.translateTemplate("org/dashbuilder/client/navigation/widget/NavItemTileWidgetView.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfNavItemTileWidgetView));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfNavItemTileWidgetView));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(4);
    dataFieldMetas.put("mainDiv", new DataFieldMeta());
    dataFieldMetas.put("iconDiv", new DataFieldMeta());
    dataFieldMetas.put("iconSpan", new DataFieldMeta());
    dataFieldMetas.put("textSpan", new DataFieldMeta());
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.NavItemTileWidgetView", "org/dashbuilder/client/navigation/widget/NavItemTileWidgetView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavItemTileWidgetView_Div_mainDiv(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "mainDiv");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.NavItemTileWidgetView", "org/dashbuilder/client/navigation/widget/NavItemTileWidgetView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavItemTileWidgetView_Div_iconDiv(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "iconDiv");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.NavItemTileWidgetView", "org/dashbuilder/client/navigation/widget/NavItemTileWidgetView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavItemTileWidgetView_Span_iconSpan(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "iconSpan");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.NavItemTileWidgetView", "org/dashbuilder/client/navigation/widget/NavItemTileWidgetView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavItemTileWidgetView_Span_textSpan(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "textSpan");
    templateFieldsMap.put("mainDiv", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavItemTileWidgetView_Div_mainDiv(instance))));
    templateFieldsMap.put("iconDiv", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavItemTileWidgetView_Div_iconDiv(instance))));
    templateFieldsMap.put("iconSpan", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavItemTileWidgetView_Span_iconSpan(instance))));
    templateFieldsMap.put("textSpan", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavItemTileWidgetView_Span_textSpan(instance))));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfNavItemTileWidgetView), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("mainDiv"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onMainDivClick(event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((NavItemTileWidgetView) instance, contextManager);
  }

  public void destroyInstanceHelper(final NavItemTileWidgetView instance, final ContextManager contextManager) {
    TemplateUtil.cleanupTemplated(instance);
  }

  native static Span NavItemTileWidgetView_Span_textSpan(NavItemTileWidgetView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.NavItemTileWidgetView::textSpan;
  }-*/;

  native static void NavItemTileWidgetView_Span_textSpan(NavItemTileWidgetView instance, Span value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.NavItemTileWidgetView::textSpan = value;
  }-*/;

  native static Div NavItemTileWidgetView_Div_iconDiv(NavItemTileWidgetView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.NavItemTileWidgetView::iconDiv;
  }-*/;

  native static void NavItemTileWidgetView_Div_iconDiv(NavItemTileWidgetView instance, Div value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.NavItemTileWidgetView::iconDiv = value;
  }-*/;

  native static Span NavItemTileWidgetView_Span_iconSpan(NavItemTileWidgetView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.NavItemTileWidgetView::iconSpan;
  }-*/;

  native static void NavItemTileWidgetView_Span_iconSpan(NavItemTileWidgetView instance, Span value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.NavItemTileWidgetView::iconSpan = value;
  }-*/;

  native static Div NavItemTileWidgetView_Div_mainDiv(NavItemTileWidgetView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.NavItemTileWidgetView::mainDiv;
  }-*/;

  native static void NavItemTileWidgetView_Div_mainDiv(NavItemTileWidgetView instance, Div value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.NavItemTileWidgetView::mainDiv = value;
  }-*/;
}