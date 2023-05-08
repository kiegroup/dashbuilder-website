package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ClientBundle.Source;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.ui.Widget;
import elemental2.dom.HTMLButtonElement;
import elemental2.dom.HTMLDivElement;
import elemental2.dom.HTMLFormElement;
import elemental2.dom.HTMLInputElement;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.enterprise.context.Dependent;
import org.dashbuilder.client.RuntimeCommunication;
import org.dashbuilder.client.widgets.UploadWidget.View;
import org.dashbuilder.client.widgets.view.UploadWidgetView;
import org.jboss.errai.common.client.api.elemental2.IsElement;
import org.jboss.errai.common.client.ui.ElementWrapperWidget;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ui.shared.DataFieldMeta;
import org.jboss.errai.ui.shared.Template;
import org.jboss.errai.ui.shared.TemplateUtil;
import org.jboss.errai.ui.shared.api.style.StyleBindingsRegistry;
import org.uberfire.client.mvp.HasPresenter;
import org.uberfire.client.mvp.UberElemental;
import org.uberfire.ext.widgets.common.client.common.BusyIndicatorView;

public class Type_factory__o_d_c_w_v_UploadWidgetView__quals__j_e_i_Any_j_e_i_Default extends Factory<UploadWidgetView> { public interface o_d_c_w_v_UploadWidgetViewTemplateResource extends Template, ClientBundle { @Source("org/dashbuilder/client/widgets/view/UploadWidgetView.html") public TextResource getContents(); }
  public Type_factory__o_d_c_w_v_UploadWidgetView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(UploadWidgetView.class, "Type_factory__o_d_c_w_v_UploadWidgetView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { UploadWidgetView.class, Object.class, View.class, UberElemental.class, IsElement.class, HasPresenter.class });
  }

  public UploadWidgetView createInstance(final ContextManager contextManager) {
    final UploadWidgetView instance = new UploadWidgetView();
    setIncompleteInstance(instance);
    final HTMLInputElement UploadWidgetView_inputFile = (HTMLInputElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLInputElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, UploadWidgetView_inputFile);
    UploadWidgetView_HTMLInputElement_inputFile(instance, UploadWidgetView_inputFile);
    final HTMLInputElement UploadWidgetView_inputFileName = (HTMLInputElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLInputElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, UploadWidgetView_inputFileName);
    UploadWidgetView_HTMLInputElement_inputFileName(instance, UploadWidgetView_inputFileName);
    final BusyIndicatorView UploadWidgetView_loading = (BusyIndicatorView) contextManager.getInstance("Type_factory__o_u_e_w_c_c_c_BusyIndicatorView__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, UploadWidgetView_loading);
    UploadWidgetView_BusyIndicatorView_loading(instance, UploadWidgetView_loading);
    final RuntimeCommunication UploadWidgetView_runtimeCommunication = (RuntimeCommunication) contextManager.getInstance("Type_factory__o_d_c_RuntimeCommunication__quals__j_e_i_Any_j_e_i_Default");
    UploadWidgetView_RuntimeCommunication_runtimeCommunication(instance, UploadWidgetView_runtimeCommunication);
    final HTMLButtonElement UploadWidgetView_btnImport = (HTMLButtonElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLButtonElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, UploadWidgetView_btnImport);
    UploadWidgetView_HTMLButtonElement_btnImport(instance, UploadWidgetView_btnImport);
    final HTMLDivElement UploadWidgetView_uploadButtonContainer = (HTMLDivElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLDivElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, UploadWidgetView_uploadButtonContainer);
    UploadWidgetView_HTMLDivElement_uploadButtonContainer(instance, UploadWidgetView_uploadButtonContainer);
    final HTMLFormElement UploadWidgetView_uploadForm = (HTMLFormElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLFormElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, UploadWidgetView_uploadForm);
    UploadWidgetView_HTMLFormElement_uploadForm(instance, UploadWidgetView_uploadForm);
    o_d_c_w_v_UploadWidgetViewTemplateResource templateForUploadWidgetView = GWT.create(o_d_c_w_v_UploadWidgetViewTemplateResource.class);
    Element parentElementForTemplateOfUploadWidgetView = TemplateUtil.getRootTemplateParentElement(templateForUploadWidgetView.getContents().getText(), "org/dashbuilder/client/widgets/view/UploadWidgetView.html", "");
    TemplateUtil.translateTemplate("org/dashbuilder/client/widgets/view/UploadWidgetView.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfUploadWidgetView));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfUploadWidgetView));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(5);
    dataFieldMetas.put("uploadButtonContainer", new DataFieldMeta());
    dataFieldMetas.put("btnImport", new DataFieldMeta());
    dataFieldMetas.put("uploadForm", new DataFieldMeta());
    dataFieldMetas.put("inputFile", new DataFieldMeta());
    dataFieldMetas.put("inputFileName", new DataFieldMeta());
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.widgets.view.UploadWidgetView", "org/dashbuilder/client/widgets/view/UploadWidgetView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(UploadWidgetView_HTMLDivElement_uploadButtonContainer(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "uploadButtonContainer");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.widgets.view.UploadWidgetView", "org/dashbuilder/client/widgets/view/UploadWidgetView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(UploadWidgetView_HTMLButtonElement_btnImport(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "btnImport");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.widgets.view.UploadWidgetView", "org/dashbuilder/client/widgets/view/UploadWidgetView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(UploadWidgetView_HTMLFormElement_uploadForm(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "uploadForm");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.widgets.view.UploadWidgetView", "org/dashbuilder/client/widgets/view/UploadWidgetView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(UploadWidgetView_HTMLInputElement_inputFile(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "inputFile");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.widgets.view.UploadWidgetView", "org/dashbuilder/client/widgets/view/UploadWidgetView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(UploadWidgetView_HTMLInputElement_inputFileName(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "inputFileName");
    templateFieldsMap.put("uploadButtonContainer", ElementWrapperWidget.getWidget(TemplateUtil.asElement(UploadWidgetView_HTMLDivElement_uploadButtonContainer(instance))));
    templateFieldsMap.put("btnImport", ElementWrapperWidget.getWidget(TemplateUtil.asElement(UploadWidgetView_HTMLButtonElement_btnImport(instance))));
    templateFieldsMap.put("uploadForm", ElementWrapperWidget.getWidget(TemplateUtil.asElement(UploadWidgetView_HTMLFormElement_uploadForm(instance))));
    templateFieldsMap.put("inputFile", ElementWrapperWidget.getWidget(TemplateUtil.asElement(UploadWidgetView_HTMLInputElement_inputFile(instance))));
    templateFieldsMap.put("inputFileName", ElementWrapperWidget.getWidget(TemplateUtil.asElement(UploadWidgetView_HTMLInputElement_inputFileName(instance))));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfUploadWidgetView), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("inputFile"), new ChangeHandler() {
      public void onChange(ChangeEvent event) {
        instance.handleInputFileChange(event);
      }
    }, ChangeEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("btnImport"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.handleImport(event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((UploadWidgetView) instance, contextManager);
  }

  public void destroyInstanceHelper(final UploadWidgetView instance, final ContextManager contextManager) {
    TemplateUtil.cleanupTemplated(instance);
  }

  native static BusyIndicatorView UploadWidgetView_BusyIndicatorView_loading(UploadWidgetView instance) /*-{
    return instance.@org.dashbuilder.client.widgets.view.UploadWidgetView::loading;
  }-*/;

  native static void UploadWidgetView_BusyIndicatorView_loading(UploadWidgetView instance, BusyIndicatorView value) /*-{
    instance.@org.dashbuilder.client.widgets.view.UploadWidgetView::loading = value;
  }-*/;

  native static HTMLDivElement UploadWidgetView_HTMLDivElement_uploadButtonContainer(UploadWidgetView instance) /*-{
    return instance.@org.dashbuilder.client.widgets.view.UploadWidgetView::uploadButtonContainer;
  }-*/;

  native static void UploadWidgetView_HTMLDivElement_uploadButtonContainer(UploadWidgetView instance, HTMLDivElement value) /*-{
    instance.@org.dashbuilder.client.widgets.view.UploadWidgetView::uploadButtonContainer = value;
  }-*/;

  native static HTMLFormElement UploadWidgetView_HTMLFormElement_uploadForm(UploadWidgetView instance) /*-{
    return instance.@org.dashbuilder.client.widgets.view.UploadWidgetView::uploadForm;
  }-*/;

  native static void UploadWidgetView_HTMLFormElement_uploadForm(UploadWidgetView instance, HTMLFormElement value) /*-{
    instance.@org.dashbuilder.client.widgets.view.UploadWidgetView::uploadForm = value;
  }-*/;

  native static HTMLInputElement UploadWidgetView_HTMLInputElement_inputFile(UploadWidgetView instance) /*-{
    return instance.@org.dashbuilder.client.widgets.view.UploadWidgetView::inputFile;
  }-*/;

  native static void UploadWidgetView_HTMLInputElement_inputFile(UploadWidgetView instance, HTMLInputElement value) /*-{
    instance.@org.dashbuilder.client.widgets.view.UploadWidgetView::inputFile = value;
  }-*/;

  native static RuntimeCommunication UploadWidgetView_RuntimeCommunication_runtimeCommunication(UploadWidgetView instance) /*-{
    return instance.@org.dashbuilder.client.widgets.view.UploadWidgetView::runtimeCommunication;
  }-*/;

  native static void UploadWidgetView_RuntimeCommunication_runtimeCommunication(UploadWidgetView instance, RuntimeCommunication value) /*-{
    instance.@org.dashbuilder.client.widgets.view.UploadWidgetView::runtimeCommunication = value;
  }-*/;

  native static HTMLInputElement UploadWidgetView_HTMLInputElement_inputFileName(UploadWidgetView instance) /*-{
    return instance.@org.dashbuilder.client.widgets.view.UploadWidgetView::inputFileName;
  }-*/;

  native static void UploadWidgetView_HTMLInputElement_inputFileName(UploadWidgetView instance, HTMLInputElement value) /*-{
    instance.@org.dashbuilder.client.widgets.view.UploadWidgetView::inputFileName = value;
  }-*/;

  native static HTMLButtonElement UploadWidgetView_HTMLButtonElement_btnImport(UploadWidgetView instance) /*-{
    return instance.@org.dashbuilder.client.widgets.view.UploadWidgetView::btnImport;
  }-*/;

  native static void UploadWidgetView_HTMLButtonElement_btnImport(UploadWidgetView instance, HTMLButtonElement value) /*-{
    instance.@org.dashbuilder.client.widgets.view.UploadWidgetView::btnImport = value;
  }-*/;
}