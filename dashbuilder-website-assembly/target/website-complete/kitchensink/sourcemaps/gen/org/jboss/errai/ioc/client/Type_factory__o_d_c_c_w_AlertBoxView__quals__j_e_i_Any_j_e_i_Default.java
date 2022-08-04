package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ClientBundle.Source;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.ui.Widget;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.enterprise.context.Dependent;
import org.dashbuilder.common.client.widgets.AlertBox.View;
import org.dashbuilder.common.client.widgets.AlertBoxView;
import org.jboss.errai.common.client.api.IsElement;
import org.jboss.errai.common.client.dom.Button;
import org.jboss.errai.common.client.dom.Div;
import org.jboss.errai.common.client.dom.Span;
import org.jboss.errai.common.client.ui.ElementWrapperWidget;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ui.shared.DataFieldMeta;
import org.jboss.errai.ui.shared.Template;
import org.jboss.errai.ui.shared.TemplateUtil;
import org.jboss.errai.ui.shared.api.style.StyleBindingsRegistry;
import org.uberfire.client.mvp.HasPresenter;
import org.uberfire.client.mvp.UberElement;

public class Type_factory__o_d_c_c_w_AlertBoxView__quals__j_e_i_Any_j_e_i_Default extends Factory<AlertBoxView> { public interface o_d_c_c_w_AlertBoxViewTemplateResource extends Template, ClientBundle { @Source("org/dashbuilder/common/client/widgets/AlertBoxView.html") public TextResource getContents(); }
  public Type_factory__o_d_c_c_w_AlertBoxView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(AlertBoxView.class, "Type_factory__o_d_c_c_w_AlertBoxView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { AlertBoxView.class, Object.class, View.class, UberElement.class, IsElement.class, HasPresenter.class, org.jboss.errai.ui.client.local.api.IsElement.class });
  }

  public AlertBoxView createInstance(final ContextManager contextManager) {
    final AlertBoxView instance = new AlertBoxView();
    setIncompleteInstance(instance);
    final Span AlertBoxView_alertIcon = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AlertBoxView_alertIcon);
    AlertBoxView_Span_alertIcon(instance, AlertBoxView_alertIcon);
    final Div AlertBoxView_alertDiv = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AlertBoxView_alertDiv);
    AlertBoxView_Div_alertDiv(instance, AlertBoxView_alertDiv);
    final Button AlertBoxView_closeButton = (Button) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Button__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AlertBoxView_closeButton);
    AlertBoxView_Button_closeButton(instance, AlertBoxView_closeButton);
    final Span AlertBoxView_alertMessage = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AlertBoxView_alertMessage);
    AlertBoxView_Span_alertMessage(instance, AlertBoxView_alertMessage);
    o_d_c_c_w_AlertBoxViewTemplateResource templateForAlertBoxView = GWT.create(o_d_c_c_w_AlertBoxViewTemplateResource.class);
    Element parentElementForTemplateOfAlertBoxView = TemplateUtil.getRootTemplateParentElement(templateForAlertBoxView.getContents().getText(), "org/dashbuilder/common/client/widgets/AlertBoxView.html", "");
    TemplateUtil.translateTemplate("org/dashbuilder/common/client/widgets/AlertBoxView.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfAlertBoxView));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfAlertBoxView));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(4);
    dataFieldMetas.put("alertDiv", new DataFieldMeta());
    dataFieldMetas.put("closeButton", new DataFieldMeta());
    dataFieldMetas.put("alertIcon", new DataFieldMeta());
    dataFieldMetas.put("alertMessage", new DataFieldMeta());
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("org.dashbuilder.common.client.widgets.AlertBoxView", "org/dashbuilder/common/client/widgets/AlertBoxView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AlertBoxView_Div_alertDiv(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "alertDiv");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.common.client.widgets.AlertBoxView", "org/dashbuilder/common/client/widgets/AlertBoxView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AlertBoxView_Button_closeButton(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "closeButton");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.common.client.widgets.AlertBoxView", "org/dashbuilder/common/client/widgets/AlertBoxView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AlertBoxView_Span_alertIcon(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "alertIcon");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.common.client.widgets.AlertBoxView", "org/dashbuilder/common/client/widgets/AlertBoxView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AlertBoxView_Span_alertMessage(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "alertMessage");
    templateFieldsMap.put("alertDiv", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AlertBoxView_Div_alertDiv(instance))));
    templateFieldsMap.put("closeButton", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AlertBoxView_Button_closeButton(instance))));
    templateFieldsMap.put("alertIcon", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AlertBoxView_Span_alertIcon(instance))));
    templateFieldsMap.put("alertMessage", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AlertBoxView_Span_alertMessage(instance))));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfAlertBoxView), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("closeButton"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        AlertBoxView_onClose_ClickEvent(instance, event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((AlertBoxView) instance, contextManager);
  }

  public void destroyInstanceHelper(final AlertBoxView instance, final ContextManager contextManager) {
    TemplateUtil.cleanupTemplated(instance);
  }

  native static Div AlertBoxView_Div_alertDiv(AlertBoxView instance) /*-{
    return instance.@org.dashbuilder.common.client.widgets.AlertBoxView::alertDiv;
  }-*/;

  native static void AlertBoxView_Div_alertDiv(AlertBoxView instance, Div value) /*-{
    instance.@org.dashbuilder.common.client.widgets.AlertBoxView::alertDiv = value;
  }-*/;

  native static Button AlertBoxView_Button_closeButton(AlertBoxView instance) /*-{
    return instance.@org.dashbuilder.common.client.widgets.AlertBoxView::closeButton;
  }-*/;

  native static void AlertBoxView_Button_closeButton(AlertBoxView instance, Button value) /*-{
    instance.@org.dashbuilder.common.client.widgets.AlertBoxView::closeButton = value;
  }-*/;

  native static Span AlertBoxView_Span_alertIcon(AlertBoxView instance) /*-{
    return instance.@org.dashbuilder.common.client.widgets.AlertBoxView::alertIcon;
  }-*/;

  native static void AlertBoxView_Span_alertIcon(AlertBoxView instance, Span value) /*-{
    instance.@org.dashbuilder.common.client.widgets.AlertBoxView::alertIcon = value;
  }-*/;

  native static Span AlertBoxView_Span_alertMessage(AlertBoxView instance) /*-{
    return instance.@org.dashbuilder.common.client.widgets.AlertBoxView::alertMessage;
  }-*/;

  native static void AlertBoxView_Span_alertMessage(AlertBoxView instance, Span value) /*-{
    instance.@org.dashbuilder.common.client.widgets.AlertBoxView::alertMessage = value;
  }-*/;

  public native static void AlertBoxView_onClose_ClickEvent(AlertBoxView instance, ClickEvent a0) /*-{
    instance.@org.dashbuilder.common.client.widgets.AlertBoxView::onClose(Lcom/google/gwt/event/dom/client/ClickEvent;)(a0);
  }-*/;
}