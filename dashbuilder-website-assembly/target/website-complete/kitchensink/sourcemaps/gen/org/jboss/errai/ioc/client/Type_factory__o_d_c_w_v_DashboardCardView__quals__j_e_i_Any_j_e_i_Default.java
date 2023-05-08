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
import elemental2.dom.HTMLDivElement;
import elemental2.dom.HTMLHeadingElement;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.enterprise.context.Dependent;
import org.dashbuilder.client.widgets.DashboardCard.View;
import org.dashbuilder.client.widgets.view.DashboardCardView;
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

public class Type_factory__o_d_c_w_v_DashboardCardView__quals__j_e_i_Any_j_e_i_Default extends Factory<DashboardCardView> { public interface o_d_c_w_v_DashboardCardViewTemplateResource extends Template, TemplateStyleSheet, ClientBundle { @Source("org/dashbuilder/client/widgets/view/DashboardCardView.html") public TextResource getContents();
  @Source("org/dashbuilder/client/widgets/view/DashboardCardView.css") @NotStrict public CssResource getStyle(); }
  public Type_factory__o_d_c_w_v_DashboardCardView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(DashboardCardView.class, "Type_factory__o_d_c_w_v_DashboardCardView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { DashboardCardView.class, Object.class, View.class, UberElemental.class, IsElement.class, HasPresenter.class });
  }

  public void init(final Context context) {
    ((o_d_c_w_v_DashboardCardViewTemplateResource) GWT.create(o_d_c_w_v_DashboardCardViewTemplateResource.class)).getStyle().ensureInjected();
  }

  public DashboardCardView createInstance(final ContextManager contextManager) {
    final DashboardCardView instance = new DashboardCardView();
    setIncompleteInstance(instance);
    final HTMLDivElement DashboardCardView_dashboardCardRoot = (HTMLDivElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLDivElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, DashboardCardView_dashboardCardRoot);
    DashboardCardView_HTMLDivElement_dashboardCardRoot(instance, DashboardCardView_dashboardCardRoot);
    final HTMLHeadingElement DashboardCardView_cardTitle = (HTMLHeadingElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLHeadingElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named_1");
    registerDependentScopedReference(instance, DashboardCardView_cardTitle);
    DashboardCardView_HTMLHeadingElement_cardTitle(instance, DashboardCardView_cardTitle);
    o_d_c_w_v_DashboardCardViewTemplateResource templateForDashboardCardView = GWT.create(o_d_c_w_v_DashboardCardViewTemplateResource.class);
    Element parentElementForTemplateOfDashboardCardView = TemplateUtil.getRootTemplateParentElement(templateForDashboardCardView.getContents().getText(), "org/dashbuilder/client/widgets/view/DashboardCardView.html", "");
    TemplateUtil.translateTemplate("org/dashbuilder/client/widgets/view/DashboardCardView.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfDashboardCardView));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfDashboardCardView));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(2);
    dataFieldMetas.put("dashboardCardRoot", new DataFieldMeta());
    dataFieldMetas.put("cardTitle", new DataFieldMeta());
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.widgets.view.DashboardCardView", "org/dashbuilder/client/widgets/view/DashboardCardView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(DashboardCardView_HTMLDivElement_dashboardCardRoot(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "dashboardCardRoot");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.widgets.view.DashboardCardView", "org/dashbuilder/client/widgets/view/DashboardCardView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(DashboardCardView_HTMLHeadingElement_cardTitle(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "cardTitle");
    templateFieldsMap.put("dashboardCardRoot", ElementWrapperWidget.getWidget(TemplateUtil.asElement(DashboardCardView_HTMLDivElement_dashboardCardRoot(instance))));
    templateFieldsMap.put("cardTitle", ElementWrapperWidget.getWidget(TemplateUtil.asElement(DashboardCardView_HTMLHeadingElement_cardTitle(instance))));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfDashboardCardView), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("dashboardCardRoot"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onCardSelected(event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((DashboardCardView) instance, contextManager);
  }

  public void destroyInstanceHelper(final DashboardCardView instance, final ContextManager contextManager) {
    TemplateUtil.cleanupTemplated(instance);
  }

  native static HTMLHeadingElement DashboardCardView_HTMLHeadingElement_cardTitle(DashboardCardView instance) /*-{
    return instance.@org.dashbuilder.client.widgets.view.DashboardCardView::cardTitle;
  }-*/;

  native static void DashboardCardView_HTMLHeadingElement_cardTitle(DashboardCardView instance, HTMLHeadingElement value) /*-{
    instance.@org.dashbuilder.client.widgets.view.DashboardCardView::cardTitle = value;
  }-*/;

  native static HTMLDivElement DashboardCardView_HTMLDivElement_dashboardCardRoot(DashboardCardView instance) /*-{
    return instance.@org.dashbuilder.client.widgets.view.DashboardCardView::dashboardCardRoot;
  }-*/;

  native static void DashboardCardView_HTMLDivElement_dashboardCardRoot(DashboardCardView instance, HTMLDivElement value) /*-{
    instance.@org.dashbuilder.client.widgets.view.DashboardCardView::dashboardCardRoot = value;
  }-*/;
}