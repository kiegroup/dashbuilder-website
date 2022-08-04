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
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.enterprise.context.Dependent;
import org.dashbuilder.displayer.client.widgets.ExternalComponentEditor.View;
import org.dashbuilder.displayer.client.widgets.ExternalComponentEditorView;
import org.jboss.errai.common.client.dom.elemental2.Elemental2DomUtil;
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

public class Type_factory__o_d_d_c_w_ExternalComponentEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<ExternalComponentEditorView> { public interface o_d_d_c_w_ExternalComponentEditorViewTemplateResource extends Template, TemplateStyleSheet, ClientBundle { @Source("org/dashbuilder/displayer/client/widgets/ExternalComponentEditorView.html") public TextResource getContents();
  @Source("org/dashbuilder/displayer/client/widgets/ExternalComponentEditorView.css") @NotStrict public CssResource getStyle(); }
  public Type_factory__o_d_d_c_w_ExternalComponentEditorView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(ExternalComponentEditorView.class, "Type_factory__o_d_d_c_w_ExternalComponentEditorView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { ExternalComponentEditorView.class, Composite.class, Widget.class, UIObject.class, Object.class, HasVisibility.class, EventListener.class, HasAttachHandlers.class, HasHandlers.class, IsWidget.class, IsRenderable.class, View.class, UberView.class, HasPresenter.class });
  }

  public void init(final Context context) {
    ((o_d_d_c_w_ExternalComponentEditorViewTemplateResource) GWT.create(o_d_d_c_w_ExternalComponentEditorViewTemplateResource.class)).getStyle().ensureInjected();
  }

  public ExternalComponentEditorView createInstance(final ContextManager contextManager) {
    final ExternalComponentEditorView instance = new ExternalComponentEditorView();
    setIncompleteInstance(instance);
    final Elemental2DomUtil ExternalComponentEditorView_domUtil = (Elemental2DomUtil) contextManager.getInstance("Type_factory__o_j_e_c_c_d_e_Elemental2DomUtil__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ExternalComponentEditorView_domUtil);
    ExternalComponentEditorView_Elemental2DomUtil_domUtil(instance, ExternalComponentEditorView_domUtil);
    final HTMLDivElement ExternalComponentEditorView_componentEditorRootContainer = (HTMLDivElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLDivElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ExternalComponentEditorView_componentEditorRootContainer);
    ExternalComponentEditorView_HTMLDivElement_componentEditorRootContainer(instance, ExternalComponentEditorView_componentEditorRootContainer);
    final HTMLDivElement ExternalComponentEditorView_componentEditorPreviewColumn = (HTMLDivElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLDivElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ExternalComponentEditorView_componentEditorPreviewColumn);
    ExternalComponentEditorView_HTMLDivElement_componentEditorPreviewColumn(instance, ExternalComponentEditorView_componentEditorPreviewColumn);
    final HTMLDivElement ExternalComponentEditorView_componentEditorPropertiesColumn = (HTMLDivElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLDivElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ExternalComponentEditorView_componentEditorPropertiesColumn);
    ExternalComponentEditorView_HTMLDivElement_componentEditorPropertiesColumn(instance, ExternalComponentEditorView_componentEditorPropertiesColumn);
    o_d_d_c_w_ExternalComponentEditorViewTemplateResource templateForExternalComponentEditorView = GWT.create(o_d_d_c_w_ExternalComponentEditorViewTemplateResource.class);
    Element parentElementForTemplateOfExternalComponentEditorView = TemplateUtil.getRootTemplateParentElement(templateForExternalComponentEditorView.getContents().getText(), "org/dashbuilder/displayer/client/widgets/ExternalComponentEditorView.html", "");
    TemplateUtil.translateTemplate("org/dashbuilder/displayer/client/widgets/ExternalComponentEditorView.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfExternalComponentEditorView));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfExternalComponentEditorView));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(3);
    dataFieldMetas.put("componentEditorRootContainer", new DataFieldMeta());
    dataFieldMetas.put("componentEditorPropertiesColumn", new DataFieldMeta());
    dataFieldMetas.put("componentEditorPreviewColumn", new DataFieldMeta());
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("org.dashbuilder.displayer.client.widgets.ExternalComponentEditorView", "org/dashbuilder/displayer/client/widgets/ExternalComponentEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ExternalComponentEditorView_HTMLDivElement_componentEditorRootContainer(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "componentEditorRootContainer");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.displayer.client.widgets.ExternalComponentEditorView", "org/dashbuilder/displayer/client/widgets/ExternalComponentEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ExternalComponentEditorView_HTMLDivElement_componentEditorPropertiesColumn(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "componentEditorPropertiesColumn");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.displayer.client.widgets.ExternalComponentEditorView", "org/dashbuilder/displayer/client/widgets/ExternalComponentEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ExternalComponentEditorView_HTMLDivElement_componentEditorPreviewColumn(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "componentEditorPreviewColumn");
    templateFieldsMap.put("componentEditorRootContainer", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ExternalComponentEditorView_HTMLDivElement_componentEditorRootContainer(instance))));
    templateFieldsMap.put("componentEditorPropertiesColumn", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ExternalComponentEditorView_HTMLDivElement_componentEditorPropertiesColumn(instance))));
    templateFieldsMap.put("componentEditorPreviewColumn", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ExternalComponentEditorView_HTMLDivElement_componentEditorPreviewColumn(instance))));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfExternalComponentEditorView), templateFieldsMap.values());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ExternalComponentEditorView) instance, contextManager);
  }

  public void destroyInstanceHelper(final ExternalComponentEditorView instance, final ContextManager contextManager) {
    TemplateUtil.cleanupWidget(instance);
  }

  native static HTMLDivElement ExternalComponentEditorView_HTMLDivElement_componentEditorRootContainer(ExternalComponentEditorView instance) /*-{
    return instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentEditorView::componentEditorRootContainer;
  }-*/;

  native static void ExternalComponentEditorView_HTMLDivElement_componentEditorRootContainer(ExternalComponentEditorView instance, HTMLDivElement value) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentEditorView::componentEditorRootContainer = value;
  }-*/;

  native static HTMLDivElement ExternalComponentEditorView_HTMLDivElement_componentEditorPropertiesColumn(ExternalComponentEditorView instance) /*-{
    return instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentEditorView::componentEditorPropertiesColumn;
  }-*/;

  native static void ExternalComponentEditorView_HTMLDivElement_componentEditorPropertiesColumn(ExternalComponentEditorView instance, HTMLDivElement value) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentEditorView::componentEditorPropertiesColumn = value;
  }-*/;

  native static HTMLDivElement ExternalComponentEditorView_HTMLDivElement_componentEditorPreviewColumn(ExternalComponentEditorView instance) /*-{
    return instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentEditorView::componentEditorPreviewColumn;
  }-*/;

  native static void ExternalComponentEditorView_HTMLDivElement_componentEditorPreviewColumn(ExternalComponentEditorView instance, HTMLDivElement value) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentEditorView::componentEditorPreviewColumn = value;
  }-*/;

  native static Elemental2DomUtil ExternalComponentEditorView_Elemental2DomUtil_domUtil(ExternalComponentEditorView instance) /*-{
    return instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentEditorView::domUtil;
  }-*/;

  native static void ExternalComponentEditorView_Elemental2DomUtil_domUtil(ExternalComponentEditorView instance, Elemental2DomUtil value) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentEditorView::domUtil = value;
  }-*/;
}