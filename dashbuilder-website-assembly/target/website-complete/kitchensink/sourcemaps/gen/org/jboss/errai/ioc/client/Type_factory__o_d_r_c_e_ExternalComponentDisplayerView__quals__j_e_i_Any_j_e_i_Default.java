package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ClientBundle.Source;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import elemental2.dom.HTMLDivElement;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.enterprise.context.Dependent;
import org.dashbuilder.displayer.client.AbstractErraiDisplayer.View;
import org.dashbuilder.displayer.client.AbstractErraiDisplayerView;
import org.dashbuilder.renderer.client.external.ExternalComponentDisplayerView;
import org.jboss.errai.common.client.api.IsElement;
import org.jboss.errai.common.client.dom.elemental2.Elemental2DomUtil;
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

public class Type_factory__o_d_r_c_e_ExternalComponentDisplayerView__quals__j_e_i_Any_j_e_i_Default extends Factory<ExternalComponentDisplayerView> { public interface o_d_r_c_e_ExternalComponentDisplayerViewTemplateResource extends Template, ClientBundle { @Source("org/dashbuilder/renderer/client/external/ExternalComponentDisplayerView.html") public TextResource getContents(); }
  public Type_factory__o_d_r_c_e_ExternalComponentDisplayerView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(ExternalComponentDisplayerView.class, "Type_factory__o_d_r_c_e_ExternalComponentDisplayerView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { ExternalComponentDisplayerView.class, AbstractErraiDisplayerView.class, Object.class, View.class, org.dashbuilder.displayer.client.AbstractDisplayer.View.class, IsWidget.class, UberElement.class, IsElement.class, HasPresenter.class, org.jboss.errai.ui.client.local.api.IsElement.class, org.dashbuilder.renderer.client.external.ExternalComponentDisplayer.View.class });
  }

  public ExternalComponentDisplayerView createInstance(final ContextManager contextManager) {
    final ExternalComponentDisplayerView instance = new ExternalComponentDisplayerView();
    setIncompleteInstance(instance);
    final HTMLDivElement ExternalComponentDisplayerView_externalComponentDisplayerRoot = (HTMLDivElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLDivElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ExternalComponentDisplayerView_externalComponentDisplayerRoot);
    ExternalComponentDisplayerView_HTMLDivElement_externalComponentDisplayerRoot(instance, ExternalComponentDisplayerView_externalComponentDisplayerRoot);
    final Elemental2DomUtil ExternalComponentDisplayerView_domUtil = (Elemental2DomUtil) contextManager.getInstance("Type_factory__o_j_e_c_c_d_e_Elemental2DomUtil__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ExternalComponentDisplayerView_domUtil);
    ExternalComponentDisplayerView_Elemental2DomUtil_domUtil(instance, ExternalComponentDisplayerView_domUtil);
    o_d_r_c_e_ExternalComponentDisplayerViewTemplateResource templateForExternalComponentDisplayerView = GWT.create(o_d_r_c_e_ExternalComponentDisplayerViewTemplateResource.class);
    Element parentElementForTemplateOfExternalComponentDisplayerView = TemplateUtil.getRootTemplateParentElement(templateForExternalComponentDisplayerView.getContents().getText(), "org/dashbuilder/renderer/client/external/ExternalComponentDisplayerView.html", "");
    TemplateUtil.translateTemplate("org/dashbuilder/renderer/client/external/ExternalComponentDisplayerView.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfExternalComponentDisplayerView));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfExternalComponentDisplayerView));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(1);
    dataFieldMetas.put("externalComponentDisplayerRoot", new DataFieldMeta());
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("org.dashbuilder.renderer.client.external.ExternalComponentDisplayerView", "org/dashbuilder/renderer/client/external/ExternalComponentDisplayerView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ExternalComponentDisplayerView_HTMLDivElement_externalComponentDisplayerRoot(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "externalComponentDisplayerRoot");
    templateFieldsMap.put("externalComponentDisplayerRoot", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ExternalComponentDisplayerView_HTMLDivElement_externalComponentDisplayerRoot(instance))));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfExternalComponentDisplayerView), templateFieldsMap.values());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ExternalComponentDisplayerView) instance, contextManager);
  }

  public void destroyInstanceHelper(final ExternalComponentDisplayerView instance, final ContextManager contextManager) {
    TemplateUtil.cleanupTemplated(instance);
  }

  native static HTMLDivElement ExternalComponentDisplayerView_HTMLDivElement_externalComponentDisplayerRoot(ExternalComponentDisplayerView instance) /*-{
    return instance.@org.dashbuilder.renderer.client.external.ExternalComponentDisplayerView::externalComponentDisplayerRoot;
  }-*/;

  native static void ExternalComponentDisplayerView_HTMLDivElement_externalComponentDisplayerRoot(ExternalComponentDisplayerView instance, HTMLDivElement value) /*-{
    instance.@org.dashbuilder.renderer.client.external.ExternalComponentDisplayerView::externalComponentDisplayerRoot = value;
  }-*/;

  native static Elemental2DomUtil ExternalComponentDisplayerView_Elemental2DomUtil_domUtil(ExternalComponentDisplayerView instance) /*-{
    return instance.@org.dashbuilder.renderer.client.external.ExternalComponentDisplayerView::domUtil;
  }-*/;

  native static void ExternalComponentDisplayerView_Elemental2DomUtil_domUtil(ExternalComponentDisplayerView instance, Elemental2DomUtil value) /*-{
    instance.@org.dashbuilder.renderer.client.external.ExternalComponentDisplayerView::domUtil = value;
  }-*/;
}