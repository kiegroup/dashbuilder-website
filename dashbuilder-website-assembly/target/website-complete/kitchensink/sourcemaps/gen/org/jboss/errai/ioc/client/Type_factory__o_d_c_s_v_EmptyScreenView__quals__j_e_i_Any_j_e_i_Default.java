package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ClientBundle.Source;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.CssResource.NotStrict;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.ui.Widget;
import elemental2.dom.HTMLDivElement;
import elemental2.dom.HTMLParagraphElement;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.enterprise.context.Dependent;
import org.dashbuilder.client.screens.EmptyScreen.View;
import org.dashbuilder.client.screens.view.EmptyScreenView;
import org.dashbuilder.client.widgets.UploadWidget;
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

public class Type_factory__o_d_c_s_v_EmptyScreenView__quals__j_e_i_Any_j_e_i_Default extends Factory<EmptyScreenView> { public interface o_d_c_s_v_EmptyScreenViewTemplateResource extends Template, TemplateStyleSheet, ClientBundle { @Source("org/dashbuilder/client/screens/view/EmptyScreenView.html") public TextResource getContents();
  @Source("org/dashbuilder/client/screens/view/EmptyScreenView.css") @NotStrict public CssResource getStyle(); }
  public Type_factory__o_d_c_s_v_EmptyScreenView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(EmptyScreenView.class, "Type_factory__o_d_c_s_v_EmptyScreenView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { EmptyScreenView.class, Object.class, View.class, UberElemental.class, IsElement.class, HasPresenter.class });
  }

  public void init(final Context context) {
    ((o_d_c_s_v_EmptyScreenViewTemplateResource) GWT.create(o_d_c_s_v_EmptyScreenViewTemplateResource.class)).getStyle().ensureInjected();
  }

  public EmptyScreenView createInstance(final ContextManager contextManager) {
    final EmptyScreenView instance = new EmptyScreenView();
    setIncompleteInstance(instance);
    final HTMLDivElement EmptyScreenView_emptyImport = (HTMLDivElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLDivElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, EmptyScreenView_emptyImport);
    EmptyScreenView_HTMLDivElement_emptyImport(instance, EmptyScreenView_emptyImport);
    final HTMLParagraphElement EmptyScreenView_subTitleParagraph = (HTMLParagraphElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLParagraphElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, EmptyScreenView_subTitleParagraph);
    EmptyScreenView_HTMLParagraphElement_subTitleParagraph(instance, EmptyScreenView_subTitleParagraph);
    final UploadWidget EmptyScreenView_uploadWidget = (UploadWidget) contextManager.getInstance("Type_factory__o_d_c_w_UploadWidget__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, EmptyScreenView_uploadWidget);
    EmptyScreenView_UploadWidget_uploadWidget(instance, EmptyScreenView_uploadWidget);
    final HTMLDivElement EmptyScreenView_uploadContainer = (HTMLDivElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLDivElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, EmptyScreenView_uploadContainer);
    EmptyScreenView_HTMLDivElement_uploadContainer(instance, EmptyScreenView_uploadContainer);
    o_d_c_s_v_EmptyScreenViewTemplateResource templateForEmptyScreenView = GWT.create(o_d_c_s_v_EmptyScreenViewTemplateResource.class);
    Element parentElementForTemplateOfEmptyScreenView = TemplateUtil.getRootTemplateParentElement(templateForEmptyScreenView.getContents().getText(), "org/dashbuilder/client/screens/view/EmptyScreenView.html", "");
    TemplateUtil.translateTemplate("org/dashbuilder/client/screens/view/EmptyScreenView.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfEmptyScreenView));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfEmptyScreenView));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(3);
    dataFieldMetas.put("emptyImport", new DataFieldMeta());
    dataFieldMetas.put("uploadContainer", new DataFieldMeta());
    dataFieldMetas.put("subTitleParagraph", new DataFieldMeta());
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.screens.view.EmptyScreenView", "org/dashbuilder/client/screens/view/EmptyScreenView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(EmptyScreenView_HTMLDivElement_emptyImport(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "emptyImport");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.screens.view.EmptyScreenView", "org/dashbuilder/client/screens/view/EmptyScreenView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(EmptyScreenView_HTMLDivElement_uploadContainer(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "uploadContainer");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.screens.view.EmptyScreenView", "org/dashbuilder/client/screens/view/EmptyScreenView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(EmptyScreenView_HTMLParagraphElement_subTitleParagraph(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "subTitleParagraph");
    templateFieldsMap.put("emptyImport", ElementWrapperWidget.getWidget(TemplateUtil.asElement(EmptyScreenView_HTMLDivElement_emptyImport(instance))));
    templateFieldsMap.put("uploadContainer", ElementWrapperWidget.getWidget(TemplateUtil.asElement(EmptyScreenView_HTMLDivElement_uploadContainer(instance))));
    templateFieldsMap.put("subTitleParagraph", ElementWrapperWidget.getWidget(TemplateUtil.asElement(EmptyScreenView_HTMLParagraphElement_subTitleParagraph(instance))));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfEmptyScreenView), templateFieldsMap.values());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((EmptyScreenView) instance, contextManager);
  }

  public void destroyInstanceHelper(final EmptyScreenView instance, final ContextManager contextManager) {
    TemplateUtil.cleanupTemplated(instance);
  }

  native static HTMLDivElement EmptyScreenView_HTMLDivElement_uploadContainer(EmptyScreenView instance) /*-{
    return instance.@org.dashbuilder.client.screens.view.EmptyScreenView::uploadContainer;
  }-*/;

  native static void EmptyScreenView_HTMLDivElement_uploadContainer(EmptyScreenView instance, HTMLDivElement value) /*-{
    instance.@org.dashbuilder.client.screens.view.EmptyScreenView::uploadContainer = value;
  }-*/;

  native static HTMLDivElement EmptyScreenView_HTMLDivElement_emptyImport(EmptyScreenView instance) /*-{
    return instance.@org.dashbuilder.client.screens.view.EmptyScreenView::emptyImport;
  }-*/;

  native static void EmptyScreenView_HTMLDivElement_emptyImport(EmptyScreenView instance, HTMLDivElement value) /*-{
    instance.@org.dashbuilder.client.screens.view.EmptyScreenView::emptyImport = value;
  }-*/;

  native static HTMLParagraphElement EmptyScreenView_HTMLParagraphElement_subTitleParagraph(EmptyScreenView instance) /*-{
    return instance.@org.dashbuilder.client.screens.view.EmptyScreenView::subTitleParagraph;
  }-*/;

  native static void EmptyScreenView_HTMLParagraphElement_subTitleParagraph(EmptyScreenView instance, HTMLParagraphElement value) /*-{
    instance.@org.dashbuilder.client.screens.view.EmptyScreenView::subTitleParagraph = value;
  }-*/;

  native static UploadWidget EmptyScreenView_UploadWidget_uploadWidget(EmptyScreenView instance) /*-{
    return instance.@org.dashbuilder.client.screens.view.EmptyScreenView::uploadWidget;
  }-*/;

  native static void EmptyScreenView_UploadWidget_uploadWidget(EmptyScreenView instance, UploadWidget value) /*-{
    instance.@org.dashbuilder.client.screens.view.EmptyScreenView::uploadWidget = value;
  }-*/;
}