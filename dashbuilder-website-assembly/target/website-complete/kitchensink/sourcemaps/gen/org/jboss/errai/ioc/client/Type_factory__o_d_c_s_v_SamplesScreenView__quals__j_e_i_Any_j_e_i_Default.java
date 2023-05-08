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
import elemental2.dom.HTMLButtonElement;
import elemental2.dom.HTMLDivElement;
import elemental2.dom.HTMLElement;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import org.dashbuilder.client.screens.SamplesScreen.View;
import org.dashbuilder.client.screens.view.SamplesScreenView;
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

public class Type_factory__o_d_c_s_v_SamplesScreenView__quals__j_e_i_Any_j_e_i_Default extends Factory<SamplesScreenView> { public interface o_d_c_s_v_SamplesScreenViewTemplateResource extends Template, TemplateStyleSheet, ClientBundle { @Source("org/dashbuilder/client/screens/view/SamplesScreenView.html") public TextResource getContents();
  @Source("org/dashbuilder/client/screens/view/SamplesScreenView.css") @NotStrict public CssResource getStyle(); }
  public Type_factory__o_d_c_s_v_SamplesScreenView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(SamplesScreenView.class, "Type_factory__o_d_c_s_v_SamplesScreenView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { SamplesScreenView.class, Object.class, View.class, UberElemental.class, IsElement.class, HasPresenter.class });
  }

  public void init(final Context context) {
    ((o_d_c_s_v_SamplesScreenViewTemplateResource) GWT.create(o_d_c_s_v_SamplesScreenViewTemplateResource.class)).getStyle().ensureInjected();
  }

  public SamplesScreenView createInstance(final ContextManager contextManager) {
    final SamplesScreenView instance = new SamplesScreenView();
    setIncompleteInstance(instance);
    final HTMLDivElement SamplesScreenView_samplesScreenRoot = (HTMLDivElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLDivElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SamplesScreenView_samplesScreenRoot);
    SamplesScreenView_HTMLDivElement_samplesScreenRoot(instance, SamplesScreenView_samplesScreenRoot);
    final HTMLElement SamplesScreenView_samplesCategoriesGroup = (HTMLElement) contextManager.getContextualInstance("ContextualProvider_factory__e_d_HTMLElement__quals__Universal", new Class[] { }, new Annotation[] { new Named() {
        public Class annotationType() {
          return Named.class;
        }
        public String toString() {
          return "@javax.inject.Named(value=ul)";
        }
        public String value() {
          return "ul";
        }
    } });
    registerDependentScopedReference(instance, SamplesScreenView_samplesCategoriesGroup);
    SamplesScreenView_HTMLElement_samplesCategoriesGroup(instance, SamplesScreenView_samplesCategoriesGroup);
    final HTMLDivElement SamplesScreenView_samplesCategoriesNav = (HTMLDivElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLDivElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SamplesScreenView_samplesCategoriesNav);
    SamplesScreenView_HTMLDivElement_samplesCategoriesNav(instance, SamplesScreenView_samplesCategoriesNav);
    final HTMLButtonElement SamplesScreenView_toggleCategoriesNavigation = (HTMLButtonElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLButtonElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SamplesScreenView_toggleCategoriesNavigation);
    SamplesScreenView_HTMLButtonElement_toggleCategoriesNavigation(instance, SamplesScreenView_toggleCategoriesNavigation);
    final HTMLDivElement SamplesScreenView_rowsContainer = (HTMLDivElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLDivElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SamplesScreenView_rowsContainer);
    SamplesScreenView_HTMLDivElement_rowsContainer(instance, SamplesScreenView_rowsContainer);
    o_d_c_s_v_SamplesScreenViewTemplateResource templateForSamplesScreenView = GWT.create(o_d_c_s_v_SamplesScreenViewTemplateResource.class);
    Element parentElementForTemplateOfSamplesScreenView = TemplateUtil.getRootTemplateParentElement(templateForSamplesScreenView.getContents().getText(), "org/dashbuilder/client/screens/view/SamplesScreenView.html", "");
    TemplateUtil.translateTemplate("org/dashbuilder/client/screens/view/SamplesScreenView.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSamplesScreenView));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSamplesScreenView));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(5);
    dataFieldMetas.put("samplesScreenRoot", new DataFieldMeta());
    dataFieldMetas.put("rowsContainer", new DataFieldMeta());
    dataFieldMetas.put("samplesCategoriesNav", new DataFieldMeta());
    dataFieldMetas.put("samplesCategoriesGroup", new DataFieldMeta());
    dataFieldMetas.put("toggleCategoriesNavigation", new DataFieldMeta());
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.screens.view.SamplesScreenView", "org/dashbuilder/client/screens/view/SamplesScreenView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SamplesScreenView_HTMLDivElement_samplesScreenRoot(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "samplesScreenRoot");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.screens.view.SamplesScreenView", "org/dashbuilder/client/screens/view/SamplesScreenView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SamplesScreenView_HTMLDivElement_rowsContainer(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "rowsContainer");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.screens.view.SamplesScreenView", "org/dashbuilder/client/screens/view/SamplesScreenView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SamplesScreenView_HTMLDivElement_samplesCategoriesNav(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "samplesCategoriesNav");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.screens.view.SamplesScreenView", "org/dashbuilder/client/screens/view/SamplesScreenView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SamplesScreenView_HTMLElement_samplesCategoriesGroup(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "samplesCategoriesGroup");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.screens.view.SamplesScreenView", "org/dashbuilder/client/screens/view/SamplesScreenView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SamplesScreenView_HTMLButtonElement_toggleCategoriesNavigation(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "toggleCategoriesNavigation");
    templateFieldsMap.put("samplesScreenRoot", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SamplesScreenView_HTMLDivElement_samplesScreenRoot(instance))));
    templateFieldsMap.put("rowsContainer", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SamplesScreenView_HTMLDivElement_rowsContainer(instance))));
    templateFieldsMap.put("samplesCategoriesNav", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SamplesScreenView_HTMLDivElement_samplesCategoriesNav(instance))));
    templateFieldsMap.put("samplesCategoriesGroup", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SamplesScreenView_HTMLElement_samplesCategoriesGroup(instance))));
    templateFieldsMap.put("toggleCategoriesNavigation", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SamplesScreenView_HTMLButtonElement_toggleCategoriesNavigation(instance))));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSamplesScreenView), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("toggleCategoriesNavigation"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        SamplesScreenView_toggleCategoriesNavigation_ClickEvent(instance, event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((SamplesScreenView) instance, contextManager);
  }

  public void destroyInstanceHelper(final SamplesScreenView instance, final ContextManager contextManager) {
    TemplateUtil.cleanupTemplated(instance);
  }

  native static HTMLDivElement SamplesScreenView_HTMLDivElement_samplesScreenRoot(SamplesScreenView instance) /*-{
    return instance.@org.dashbuilder.client.screens.view.SamplesScreenView::samplesScreenRoot;
  }-*/;

  native static void SamplesScreenView_HTMLDivElement_samplesScreenRoot(SamplesScreenView instance, HTMLDivElement value) /*-{
    instance.@org.dashbuilder.client.screens.view.SamplesScreenView::samplesScreenRoot = value;
  }-*/;

  native static HTMLDivElement SamplesScreenView_HTMLDivElement_samplesCategoriesNav(SamplesScreenView instance) /*-{
    return instance.@org.dashbuilder.client.screens.view.SamplesScreenView::samplesCategoriesNav;
  }-*/;

  native static void SamplesScreenView_HTMLDivElement_samplesCategoriesNav(SamplesScreenView instance, HTMLDivElement value) /*-{
    instance.@org.dashbuilder.client.screens.view.SamplesScreenView::samplesCategoriesNav = value;
  }-*/;

  native static HTMLDivElement SamplesScreenView_HTMLDivElement_rowsContainer(SamplesScreenView instance) /*-{
    return instance.@org.dashbuilder.client.screens.view.SamplesScreenView::rowsContainer;
  }-*/;

  native static void SamplesScreenView_HTMLDivElement_rowsContainer(SamplesScreenView instance, HTMLDivElement value) /*-{
    instance.@org.dashbuilder.client.screens.view.SamplesScreenView::rowsContainer = value;
  }-*/;

  native static HTMLButtonElement SamplesScreenView_HTMLButtonElement_toggleCategoriesNavigation(SamplesScreenView instance) /*-{
    return instance.@org.dashbuilder.client.screens.view.SamplesScreenView::toggleCategoriesNavigation;
  }-*/;

  native static void SamplesScreenView_HTMLButtonElement_toggleCategoriesNavigation(SamplesScreenView instance, HTMLButtonElement value) /*-{
    instance.@org.dashbuilder.client.screens.view.SamplesScreenView::toggleCategoriesNavigation = value;
  }-*/;

  native static HTMLElement SamplesScreenView_HTMLElement_samplesCategoriesGroup(SamplesScreenView instance) /*-{
    return instance.@org.dashbuilder.client.screens.view.SamplesScreenView::samplesCategoriesGroup;
  }-*/;

  native static void SamplesScreenView_HTMLElement_samplesCategoriesGroup(SamplesScreenView instance, HTMLElement value) /*-{
    instance.@org.dashbuilder.client.screens.view.SamplesScreenView::samplesCategoriesGroup = value;
  }-*/;

  public native static void SamplesScreenView_toggleCategoriesNavigation_ClickEvent(SamplesScreenView instance, ClickEvent a0) /*-{
    instance.@org.dashbuilder.client.screens.view.SamplesScreenView::toggleCategoriesNavigation(Lcom/google/gwt/event/dom/client/ClickEvent;)(a0);
  }-*/;
}