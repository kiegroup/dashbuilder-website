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
import elemental2.dom.HTMLAnchorElement;
import elemental2.dom.HTMLDivElement;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.enterprise.context.Dependent;
import org.dashbuilder.client.widgets.SampleCard.View;
import org.dashbuilder.client.widgets.view.SampleCardView;
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

public class Type_factory__o_d_c_w_v_SampleCardView__quals__j_e_i_Any_j_e_i_Default extends Factory<SampleCardView> { public interface o_d_c_w_v_SampleCardViewTemplateResource extends Template, TemplateStyleSheet, ClientBundle { @Source("org/dashbuilder/client/widgets/view/SampleCardView.html") public TextResource getContents();
  @Source("org/dashbuilder/client/widgets/view/SampleCardView.css") @NotStrict public CssResource getStyle(); }
  public Type_factory__o_d_c_w_v_SampleCardView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(SampleCardView.class, "Type_factory__o_d_c_w_v_SampleCardView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { SampleCardView.class, Object.class, View.class, UberElemental.class, IsElement.class, HasPresenter.class });
  }

  public void init(final Context context) {
    ((o_d_c_w_v_SampleCardViewTemplateResource) GWT.create(o_d_c_w_v_SampleCardViewTemplateResource.class)).getStyle().ensureInjected();
  }

  public SampleCardView createInstance(final ContextManager contextManager) {
    final SampleCardView instance = new SampleCardView();
    setIncompleteInstance(instance);
    final HTMLDivElement SampleCardView_sampleCardContainer = (HTMLDivElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLDivElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SampleCardView_sampleCardContainer);
    SampleCardView_HTMLDivElement_sampleCardContainer(instance, SampleCardView_sampleCardContainer);
    final HTMLAnchorElement SampleCardView_sampleImportLink = (HTMLAnchorElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLAnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SampleCardView_sampleImportLink);
    SampleCardView_HTMLAnchorElement_sampleImportLink(instance, SampleCardView_sampleImportLink);
    final HTMLAnchorElement SampleCardView_sampleEditLink = (HTMLAnchorElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLAnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SampleCardView_sampleEditLink);
    SampleCardView_HTMLAnchorElement_sampleEditLink(instance, SampleCardView_sampleEditLink);
    final HTMLDivElement SampleCardView_sampleNameDiv = (HTMLDivElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLDivElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SampleCardView_sampleNameDiv);
    SampleCardView_HTMLDivElement_sampleNameDiv(instance, SampleCardView_sampleNameDiv);
    final HTMLAnchorElement SampleCardView_sampleUrlLink = (HTMLAnchorElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLAnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SampleCardView_sampleUrlLink);
    SampleCardView_HTMLAnchorElement_sampleUrlLink(instance, SampleCardView_sampleUrlLink);
    o_d_c_w_v_SampleCardViewTemplateResource templateForSampleCardView = GWT.create(o_d_c_w_v_SampleCardViewTemplateResource.class);
    Element parentElementForTemplateOfSampleCardView = TemplateUtil.getRootTemplateParentElement(templateForSampleCardView.getContents().getText(), "org/dashbuilder/client/widgets/view/SampleCardView.html", "");
    TemplateUtil.translateTemplate("org/dashbuilder/client/widgets/view/SampleCardView.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSampleCardView));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSampleCardView));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(5);
    dataFieldMetas.put("sampleCardContainer", new DataFieldMeta());
    dataFieldMetas.put("sampleNameDiv", new DataFieldMeta());
    dataFieldMetas.put("sampleImportLink", new DataFieldMeta());
    dataFieldMetas.put("sampleUrlLink", new DataFieldMeta());
    dataFieldMetas.put("sampleEditLink", new DataFieldMeta());
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.widgets.view.SampleCardView", "org/dashbuilder/client/widgets/view/SampleCardView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SampleCardView_HTMLDivElement_sampleCardContainer(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "sampleCardContainer");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.widgets.view.SampleCardView", "org/dashbuilder/client/widgets/view/SampleCardView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SampleCardView_HTMLDivElement_sampleNameDiv(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "sampleNameDiv");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.widgets.view.SampleCardView", "org/dashbuilder/client/widgets/view/SampleCardView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SampleCardView_HTMLAnchorElement_sampleImportLink(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "sampleImportLink");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.widgets.view.SampleCardView", "org/dashbuilder/client/widgets/view/SampleCardView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SampleCardView_HTMLAnchorElement_sampleUrlLink(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "sampleUrlLink");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.widgets.view.SampleCardView", "org/dashbuilder/client/widgets/view/SampleCardView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SampleCardView_HTMLAnchorElement_sampleEditLink(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "sampleEditLink");
    templateFieldsMap.put("sampleCardContainer", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SampleCardView_HTMLDivElement_sampleCardContainer(instance))));
    templateFieldsMap.put("sampleNameDiv", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SampleCardView_HTMLDivElement_sampleNameDiv(instance))));
    templateFieldsMap.put("sampleImportLink", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SampleCardView_HTMLAnchorElement_sampleImportLink(instance))));
    templateFieldsMap.put("sampleUrlLink", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SampleCardView_HTMLAnchorElement_sampleUrlLink(instance))));
    templateFieldsMap.put("sampleEditLink", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SampleCardView_HTMLAnchorElement_sampleEditLink(instance))));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSampleCardView), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("sampleImportLink"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        SampleCardView_onSampleImportLinkClicked_ClickEvent(instance, event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((SampleCardView) instance, contextManager);
  }

  public void destroyInstanceHelper(final SampleCardView instance, final ContextManager contextManager) {
    TemplateUtil.cleanupTemplated(instance);
  }

  native static HTMLAnchorElement SampleCardView_HTMLAnchorElement_sampleImportLink(SampleCardView instance) /*-{
    return instance.@org.dashbuilder.client.widgets.view.SampleCardView::sampleImportLink;
  }-*/;

  native static void SampleCardView_HTMLAnchorElement_sampleImportLink(SampleCardView instance, HTMLAnchorElement value) /*-{
    instance.@org.dashbuilder.client.widgets.view.SampleCardView::sampleImportLink = value;
  }-*/;

  native static HTMLDivElement SampleCardView_HTMLDivElement_sampleNameDiv(SampleCardView instance) /*-{
    return instance.@org.dashbuilder.client.widgets.view.SampleCardView::sampleNameDiv;
  }-*/;

  native static void SampleCardView_HTMLDivElement_sampleNameDiv(SampleCardView instance, HTMLDivElement value) /*-{
    instance.@org.dashbuilder.client.widgets.view.SampleCardView::sampleNameDiv = value;
  }-*/;

  native static HTMLAnchorElement SampleCardView_HTMLAnchorElement_sampleUrlLink(SampleCardView instance) /*-{
    return instance.@org.dashbuilder.client.widgets.view.SampleCardView::sampleUrlLink;
  }-*/;

  native static void SampleCardView_HTMLAnchorElement_sampleUrlLink(SampleCardView instance, HTMLAnchorElement value) /*-{
    instance.@org.dashbuilder.client.widgets.view.SampleCardView::sampleUrlLink = value;
  }-*/;

  native static HTMLAnchorElement SampleCardView_HTMLAnchorElement_sampleEditLink(SampleCardView instance) /*-{
    return instance.@org.dashbuilder.client.widgets.view.SampleCardView::sampleEditLink;
  }-*/;

  native static void SampleCardView_HTMLAnchorElement_sampleEditLink(SampleCardView instance, HTMLAnchorElement value) /*-{
    instance.@org.dashbuilder.client.widgets.view.SampleCardView::sampleEditLink = value;
  }-*/;

  native static HTMLDivElement SampleCardView_HTMLDivElement_sampleCardContainer(SampleCardView instance) /*-{
    return instance.@org.dashbuilder.client.widgets.view.SampleCardView::sampleCardContainer;
  }-*/;

  native static void SampleCardView_HTMLDivElement_sampleCardContainer(SampleCardView instance, HTMLDivElement value) /*-{
    instance.@org.dashbuilder.client.widgets.view.SampleCardView::sampleCardContainer = value;
  }-*/;

  public native static void SampleCardView_onSampleImportLinkClicked_ClickEvent(SampleCardView instance, ClickEvent a0) /*-{
    instance.@org.dashbuilder.client.widgets.view.SampleCardView::onSampleImportLinkClicked(Lcom/google/gwt/event/dom/client/ClickEvent;)(a0);
  }-*/;
}