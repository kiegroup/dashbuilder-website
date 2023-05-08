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
import elemental2.dom.HTMLDivElement;
import elemental2.dom.HTMLIFrameElement;
import elemental2.dom.HTMLParagraphElement;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.enterprise.context.Dependent;
import org.dashbuilder.displayer.client.widgets.ExternalComponentPresenter.View;
import org.dashbuilder.displayer.client.widgets.ExternalComponentView;
import org.dashbuilder.displayer.external.ExternalComponentMessageHelper;
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

public class Type_factory__o_d_d_c_w_ExternalComponentView__quals__j_e_i_Any_j_e_i_Default extends Factory<ExternalComponentView> { public interface o_d_d_c_w_ExternalComponentViewTemplateResource extends Template, TemplateStyleSheet, ClientBundle { @Source("org/dashbuilder/displayer/client/widgets/ExternalComponentView.html") public TextResource getContents();
  @Source("org/dashbuilder/displayer/client/widgets/ExternalComponentView.css") @NotStrict public CssResource getStyle(); }
  public Type_factory__o_d_d_c_w_ExternalComponentView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(ExternalComponentView.class, "Type_factory__o_d_d_c_w_ExternalComponentView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { ExternalComponentView.class, Composite.class, Widget.class, UIObject.class, Object.class, HasVisibility.class, EventListener.class, HasAttachHandlers.class, HasHandlers.class, IsWidget.class, IsRenderable.class, View.class, UberView.class, HasPresenter.class });
  }

  public void init(final Context context) {
    ((o_d_d_c_w_ExternalComponentViewTemplateResource) GWT.create(o_d_d_c_w_ExternalComponentViewTemplateResource.class)).getStyle().ensureInjected();
  }

  public ExternalComponentView createInstance(final ContextManager contextManager) {
    final ExternalComponentView instance = new ExternalComponentView();
    setIncompleteInstance(instance);
    final ExternalComponentMessageHelper ExternalComponentView_messageHelper = (ExternalComponentMessageHelper) contextManager.getInstance("Producer_factory__o_d_d_e_ExternalComponentMessageHelper__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ExternalComponentView_messageHelper);
    ExternalComponentView_ExternalComponentMessageHelper_messageHelper(instance, ExternalComponentView_messageHelper);
    final HTMLDivElement ExternalComponentView_componentRoot = (HTMLDivElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLDivElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ExternalComponentView_componentRoot);
    ExternalComponentView_HTMLDivElement_componentRoot(instance, ExternalComponentView_componentRoot);
    final HTMLIFrameElement ExternalComponentView_externalComponentIFrame = (HTMLIFrameElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLIFrameElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ExternalComponentView_externalComponentIFrame);
    ExternalComponentView_HTMLIFrameElement_externalComponentIFrame(instance, ExternalComponentView_externalComponentIFrame);
    final HTMLDivElement ExternalComponentView_configurationIssueRoot = (HTMLDivElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLDivElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ExternalComponentView_configurationIssueRoot);
    ExternalComponentView_HTMLDivElement_configurationIssueRoot(instance, ExternalComponentView_configurationIssueRoot);
    final HTMLParagraphElement ExternalComponentView_configurationDetails = (HTMLParagraphElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLParagraphElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ExternalComponentView_configurationDetails);
    ExternalComponentView_HTMLParagraphElement_configurationDetails(instance, ExternalComponentView_configurationDetails);
    o_d_d_c_w_ExternalComponentViewTemplateResource templateForExternalComponentView = GWT.create(o_d_d_c_w_ExternalComponentViewTemplateResource.class);
    Element parentElementForTemplateOfExternalComponentView = TemplateUtil.getRootTemplateParentElement(templateForExternalComponentView.getContents().getText(), "org/dashbuilder/displayer/client/widgets/ExternalComponentView.html", "");
    TemplateUtil.translateTemplate("org/dashbuilder/displayer/client/widgets/ExternalComponentView.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfExternalComponentView));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfExternalComponentView));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(4);
    dataFieldMetas.put("componentRoot", new DataFieldMeta());
    dataFieldMetas.put("externalComponentIFrame", new DataFieldMeta());
    dataFieldMetas.put("configurationIssueRoot", new DataFieldMeta());
    dataFieldMetas.put("configurationDetails", new DataFieldMeta());
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("org.dashbuilder.displayer.client.widgets.ExternalComponentView", "org/dashbuilder/displayer/client/widgets/ExternalComponentView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ExternalComponentView_HTMLDivElement_componentRoot(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "componentRoot");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.displayer.client.widgets.ExternalComponentView", "org/dashbuilder/displayer/client/widgets/ExternalComponentView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ExternalComponentView_HTMLIFrameElement_externalComponentIFrame(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "externalComponentIFrame");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.displayer.client.widgets.ExternalComponentView", "org/dashbuilder/displayer/client/widgets/ExternalComponentView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ExternalComponentView_HTMLDivElement_configurationIssueRoot(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "configurationIssueRoot");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.displayer.client.widgets.ExternalComponentView", "org/dashbuilder/displayer/client/widgets/ExternalComponentView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ExternalComponentView_HTMLParagraphElement_configurationDetails(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "configurationDetails");
    templateFieldsMap.put("componentRoot", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ExternalComponentView_HTMLDivElement_componentRoot(instance))));
    templateFieldsMap.put("externalComponentIFrame", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ExternalComponentView_HTMLIFrameElement_externalComponentIFrame(instance))));
    templateFieldsMap.put("configurationIssueRoot", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ExternalComponentView_HTMLDivElement_configurationIssueRoot(instance))));
    templateFieldsMap.put("configurationDetails", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ExternalComponentView_HTMLParagraphElement_configurationDetails(instance))));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfExternalComponentView), templateFieldsMap.values());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ExternalComponentView) instance, contextManager);
  }

  public void destroyInstanceHelper(final ExternalComponentView instance, final ContextManager contextManager) {
    TemplateUtil.cleanupWidget(instance);
  }

  native static HTMLParagraphElement ExternalComponentView_HTMLParagraphElement_configurationDetails(ExternalComponentView instance) /*-{
    return instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentView::configurationDetails;
  }-*/;

  native static void ExternalComponentView_HTMLParagraphElement_configurationDetails(ExternalComponentView instance, HTMLParagraphElement value) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentView::configurationDetails = value;
  }-*/;

  native static HTMLIFrameElement ExternalComponentView_HTMLIFrameElement_externalComponentIFrame(ExternalComponentView instance) /*-{
    return instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentView::externalComponentIFrame;
  }-*/;

  native static void ExternalComponentView_HTMLIFrameElement_externalComponentIFrame(ExternalComponentView instance, HTMLIFrameElement value) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentView::externalComponentIFrame = value;
  }-*/;

  native static HTMLDivElement ExternalComponentView_HTMLDivElement_configurationIssueRoot(ExternalComponentView instance) /*-{
    return instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentView::configurationIssueRoot;
  }-*/;

  native static void ExternalComponentView_HTMLDivElement_configurationIssueRoot(ExternalComponentView instance, HTMLDivElement value) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentView::configurationIssueRoot = value;
  }-*/;

  native static ExternalComponentMessageHelper ExternalComponentView_ExternalComponentMessageHelper_messageHelper(ExternalComponentView instance) /*-{
    return instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentView::messageHelper;
  }-*/;

  native static void ExternalComponentView_ExternalComponentMessageHelper_messageHelper(ExternalComponentView instance, ExternalComponentMessageHelper value) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentView::messageHelper = value;
  }-*/;

  native static HTMLDivElement ExternalComponentView_HTMLDivElement_componentRoot(ExternalComponentView instance) /*-{
    return instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentView::componentRoot;
  }-*/;

  native static void ExternalComponentView_HTMLDivElement_componentRoot(ExternalComponentView instance, HTMLDivElement value) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentView::componentRoot = value;
  }-*/;
}