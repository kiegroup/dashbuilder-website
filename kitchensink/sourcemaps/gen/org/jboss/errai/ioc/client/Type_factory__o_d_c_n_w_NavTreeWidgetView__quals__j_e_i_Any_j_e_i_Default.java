package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.logical.shared.HasAttachHandlers;
import com.google.gwt.event.shared.HasHandlers;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ClientBundle.Source;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.CssResource.NotStrict;
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
import org.dashbuilder.client.navigation.widget.NavTreeWidgetView;
import org.dashbuilder.client.navigation.widget.NavWidgetView;
import org.dashbuilder.client.navigation.widget.TargetDivNavWidget.View;
import org.dashbuilder.client.navigation.widget.TargetDivNavWidgetView;
import org.dashbuilder.common.client.widgets.AlertBox;
import org.dashbuilder.navigation.layout.LayoutRecursionIssueI18n;
import org.jboss.errai.common.client.dom.Div;
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
import org.uberfire.client.mvp.UberView;

public class Type_factory__o_d_c_n_w_NavTreeWidgetView__quals__j_e_i_Any_j_e_i_Default extends Factory<NavTreeWidgetView> { public interface o_d_c_n_w_NavTreeWidgetViewTemplateResource extends Template, TemplateStyleSheet, ClientBundle { @Source("org/dashbuilder/client/navigation/widget/NavTreeWidgetView.html") public TextResource getContents();
  @Source("org/dashbuilder/client/navigation/widget/NavTreeWidgetView.css") @NotStrict public CssResource getStyle(); }
  public Type_factory__o_d_c_n_w_NavTreeWidgetView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(NavTreeWidgetView.class, "Type_factory__o_d_c_n_w_NavTreeWidgetView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { NavTreeWidgetView.class, TargetDivNavWidgetView.class, BaseNavWidgetView.class, Composite.class, Widget.class, UIObject.class, Object.class, HasVisibility.class, EventListener.class, HasAttachHandlers.class, HasHandlers.class, IsWidget.class, IsRenderable.class, NavWidgetView.class, UberView.class, HasPresenter.class, View.class, LayoutRecursionIssueI18n.class, org.dashbuilder.client.navigation.widget.NavTreeWidget.View.class });
  }

  public void init(final Context context) {
    ((o_d_c_n_w_NavTreeWidgetViewTemplateResource) GWT.create(o_d_c_n_w_NavTreeWidgetViewTemplateResource.class)).getStyle().ensureInjected();
  }

  public NavTreeWidgetView createInstance(final ContextManager contextManager) {
    final AlertBox _alertBox_0 = (AlertBox) contextManager.getInstance("Type_factory__o_d_c_c_w_AlertBox__quals__j_e_i_Any_j_e_i_Default");
    final NavTreeWidgetView instance = new NavTreeWidgetView(_alertBox_0);
    registerDependentScopedReference(instance, _alertBox_0);
    setIncompleteInstance(instance);
    final Div NavTreeWidgetView_mainDiv = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavTreeWidgetView_mainDiv);
    NavTreeWidgetView_Div_mainDiv(instance, NavTreeWidgetView_mainDiv);
    o_d_c_n_w_NavTreeWidgetViewTemplateResource templateForNavTreeWidgetView = GWT.create(o_d_c_n_w_NavTreeWidgetViewTemplateResource.class);
    Element parentElementForTemplateOfNavTreeWidgetView = TemplateUtil.getRootTemplateParentElement(templateForNavTreeWidgetView.getContents().getText(), "org/dashbuilder/client/navigation/widget/NavTreeWidgetView.html", "");
    TemplateUtil.translateTemplate("org/dashbuilder/client/navigation/widget/NavTreeWidgetView.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfNavTreeWidgetView));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfNavTreeWidgetView));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(1);
    dataFieldMetas.put("mainDiv", new DataFieldMeta());
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.NavTreeWidgetView", "org/dashbuilder/client/navigation/widget/NavTreeWidgetView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavTreeWidgetView_Div_mainDiv(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "mainDiv");
    templateFieldsMap.put("mainDiv", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavTreeWidgetView_Div_mainDiv(instance))));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfNavTreeWidgetView), templateFieldsMap.values());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((NavTreeWidgetView) instance, contextManager);
  }

  public void destroyInstanceHelper(final NavTreeWidgetView instance, final ContextManager contextManager) {
    TemplateUtil.cleanupWidget(instance);
  }

  native static Div NavTreeWidgetView_Div_mainDiv(NavTreeWidgetView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.NavTreeWidgetView::mainDiv;
  }-*/;

  native static void NavTreeWidgetView_Div_mainDiv(NavTreeWidgetView instance, Div value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.NavTreeWidgetView::mainDiv = value;
  }-*/;
}