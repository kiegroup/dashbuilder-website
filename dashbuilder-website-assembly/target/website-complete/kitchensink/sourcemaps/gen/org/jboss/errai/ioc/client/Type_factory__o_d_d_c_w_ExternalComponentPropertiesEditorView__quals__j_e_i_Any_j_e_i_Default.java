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
import elemental2.dom.HTMLElement;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import org.dashbuilder.displayer.client.widgets.ExternalComponentPropertiesEditor.View;
import org.dashbuilder.displayer.client.widgets.ExternalComponentPropertiesEditorView;
import org.jboss.errai.bus.client.api.Subscription;
import org.jboss.errai.common.client.dom.elemental2.Elemental2DomUtil;
import org.jboss.errai.common.client.ui.ElementWrapperWidget;
import org.jboss.errai.enterprise.client.cdi.AbstractCDIEventCallback;
import org.jboss.errai.enterprise.client.cdi.api.CDI;
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
import org.uberfire.ext.properties.editor.model.PropertyEditorChangeEvent;

public class Type_factory__o_d_d_c_w_ExternalComponentPropertiesEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<ExternalComponentPropertiesEditorView> { public interface o_d_d_c_w_ExternalComponentPropertiesEditorViewTemplateResource extends Template, TemplateStyleSheet, ClientBundle { @Source("org/dashbuilder/displayer/client/widgets/ExternalComponentPropertiesEditorView.html") public TextResource getContents();
  @Source("org/dashbuilder/displayer/client/widgets/ExternalComponentPropertiesEditorView.css") @NotStrict public CssResource getStyle(); }
  public Type_factory__o_d_d_c_w_ExternalComponentPropertiesEditorView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(ExternalComponentPropertiesEditorView.class, "Type_factory__o_d_d_c_w_ExternalComponentPropertiesEditorView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { ExternalComponentPropertiesEditorView.class, Composite.class, Widget.class, UIObject.class, Object.class, HasVisibility.class, EventListener.class, HasAttachHandlers.class, HasHandlers.class, IsWidget.class, IsRenderable.class, View.class, UberView.class, HasPresenter.class });
  }

  public void init(final Context context) {
    ((o_d_d_c_w_ExternalComponentPropertiesEditorViewTemplateResource) GWT.create(o_d_d_c_w_ExternalComponentPropertiesEditorViewTemplateResource.class)).getStyle().ensureInjected();
  }

  public ExternalComponentPropertiesEditorView createInstance(final ContextManager contextManager) {
    final ExternalComponentPropertiesEditorView instance = new ExternalComponentPropertiesEditorView();
    setIncompleteInstance(instance);
    final HTMLDivElement ExternalComponentPropertiesEditorView_messageContainer = (HTMLDivElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLDivElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ExternalComponentPropertiesEditorView_messageContainer);
    ExternalComponentPropertiesEditorView_HTMLDivElement_messageContainer(instance, ExternalComponentPropertiesEditorView_messageContainer);
    final HTMLElement ExternalComponentPropertiesEditorView_messageTextContainer = (HTMLElement) contextManager.getContextualInstance("ContextualProvider_factory__e_d_HTMLElement__quals__Universal", new Class[] { }, new Annotation[] { new Named() {
        public Class annotationType() {
          return Named.class;
        }
        public String toString() {
          return "@javax.inject.Named(value=strong)";
        }
        public String value() {
          return "strong";
        }
    } });
    registerDependentScopedReference(instance, ExternalComponentPropertiesEditorView_messageTextContainer);
    ExternalComponentPropertiesEditorView_HTMLElement_messageTextContainer(instance, ExternalComponentPropertiesEditorView_messageTextContainer);
    final HTMLDivElement ExternalComponentPropertiesEditorView_externalComponentPropertiesRoot = (HTMLDivElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLDivElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ExternalComponentPropertiesEditorView_externalComponentPropertiesRoot);
    ExternalComponentPropertiesEditorView_HTMLDivElement_externalComponentPropertiesRoot(instance, ExternalComponentPropertiesEditorView_externalComponentPropertiesRoot);
    final Elemental2DomUtil ExternalComponentPropertiesEditorView_elementalUtil = (Elemental2DomUtil) contextManager.getInstance("Type_factory__o_j_e_c_c_d_e_Elemental2DomUtil__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ExternalComponentPropertiesEditorView_elementalUtil);
    ExternalComponentPropertiesEditorView_Elemental2DomUtil_elementalUtil(instance, ExternalComponentPropertiesEditorView_elementalUtil);
    thisInstance.setReference(instance, "onPropertyEditorChangeSubscription", CDI.subscribeLocal("org.uberfire.ext.properties.editor.model.PropertyEditorChangeEvent", new AbstractCDIEventCallback<PropertyEditorChangeEvent>() {
      public void fireEvent(final PropertyEditorChangeEvent event) {
        ExternalComponentPropertiesEditorView_onPropertyEditorChange_PropertyEditorChangeEvent(instance, event);
      }
      public String toString() {
        return "Observer: org.uberfire.ext.properties.editor.model.PropertyEditorChangeEvent []";
      }
    }));
    o_d_d_c_w_ExternalComponentPropertiesEditorViewTemplateResource templateForExternalComponentPropertiesEditorView = GWT.create(o_d_d_c_w_ExternalComponentPropertiesEditorViewTemplateResource.class);
    Element parentElementForTemplateOfExternalComponentPropertiesEditorView = TemplateUtil.getRootTemplateParentElement(templateForExternalComponentPropertiesEditorView.getContents().getText(), "org/dashbuilder/displayer/client/widgets/ExternalComponentPropertiesEditorView.html", "");
    TemplateUtil.translateTemplate("org/dashbuilder/displayer/client/widgets/ExternalComponentPropertiesEditorView.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfExternalComponentPropertiesEditorView));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfExternalComponentPropertiesEditorView));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(3);
    dataFieldMetas.put("externalComponentPropertiesRoot", new DataFieldMeta());
    dataFieldMetas.put("messageContainer", new DataFieldMeta());
    dataFieldMetas.put("messageTextContainer", new DataFieldMeta());
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("org.dashbuilder.displayer.client.widgets.ExternalComponentPropertiesEditorView", "org/dashbuilder/displayer/client/widgets/ExternalComponentPropertiesEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ExternalComponentPropertiesEditorView_HTMLDivElement_externalComponentPropertiesRoot(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "externalComponentPropertiesRoot");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.displayer.client.widgets.ExternalComponentPropertiesEditorView", "org/dashbuilder/displayer/client/widgets/ExternalComponentPropertiesEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ExternalComponentPropertiesEditorView_HTMLDivElement_messageContainer(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "messageContainer");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.displayer.client.widgets.ExternalComponentPropertiesEditorView", "org/dashbuilder/displayer/client/widgets/ExternalComponentPropertiesEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ExternalComponentPropertiesEditorView_HTMLElement_messageTextContainer(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "messageTextContainer");
    templateFieldsMap.put("externalComponentPropertiesRoot", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ExternalComponentPropertiesEditorView_HTMLDivElement_externalComponentPropertiesRoot(instance))));
    templateFieldsMap.put("messageContainer", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ExternalComponentPropertiesEditorView_HTMLDivElement_messageContainer(instance))));
    templateFieldsMap.put("messageTextContainer", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ExternalComponentPropertiesEditorView_HTMLElement_messageTextContainer(instance))));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfExternalComponentPropertiesEditorView), templateFieldsMap.values());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ExternalComponentPropertiesEditorView) instance, contextManager);
  }

  public void destroyInstanceHelper(final ExternalComponentPropertiesEditorView instance, final ContextManager contextManager) {
    ((Subscription) thisInstance.getReferenceAs(instance, "onPropertyEditorChangeSubscription", Subscription.class)).remove();
    TemplateUtil.cleanupWidget(instance);
  }

  native static Elemental2DomUtil ExternalComponentPropertiesEditorView_Elemental2DomUtil_elementalUtil(ExternalComponentPropertiesEditorView instance) /*-{
    return instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentPropertiesEditorView::elementalUtil;
  }-*/;

  native static void ExternalComponentPropertiesEditorView_Elemental2DomUtil_elementalUtil(ExternalComponentPropertiesEditorView instance, Elemental2DomUtil value) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentPropertiesEditorView::elementalUtil = value;
  }-*/;

  native static HTMLElement ExternalComponentPropertiesEditorView_HTMLElement_messageTextContainer(ExternalComponentPropertiesEditorView instance) /*-{
    return instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentPropertiesEditorView::messageTextContainer;
  }-*/;

  native static void ExternalComponentPropertiesEditorView_HTMLElement_messageTextContainer(ExternalComponentPropertiesEditorView instance, HTMLElement value) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentPropertiesEditorView::messageTextContainer = value;
  }-*/;

  native static HTMLDivElement ExternalComponentPropertiesEditorView_HTMLDivElement_messageContainer(ExternalComponentPropertiesEditorView instance) /*-{
    return instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentPropertiesEditorView::messageContainer;
  }-*/;

  native static void ExternalComponentPropertiesEditorView_HTMLDivElement_messageContainer(ExternalComponentPropertiesEditorView instance, HTMLDivElement value) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentPropertiesEditorView::messageContainer = value;
  }-*/;

  native static HTMLDivElement ExternalComponentPropertiesEditorView_HTMLDivElement_externalComponentPropertiesRoot(ExternalComponentPropertiesEditorView instance) /*-{
    return instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentPropertiesEditorView::externalComponentPropertiesRoot;
  }-*/;

  native static void ExternalComponentPropertiesEditorView_HTMLDivElement_externalComponentPropertiesRoot(ExternalComponentPropertiesEditorView instance, HTMLDivElement value) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentPropertiesEditorView::externalComponentPropertiesRoot = value;
  }-*/;

  public native static void ExternalComponentPropertiesEditorView_onPropertyEditorChange_PropertyEditorChangeEvent(ExternalComponentPropertiesEditorView instance, PropertyEditorChangeEvent a0) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentPropertiesEditorView::onPropertyEditorChange(Lorg/uberfire/ext/properties/editor/model/PropertyEditorChangeEvent;)(a0);
  }-*/;
}