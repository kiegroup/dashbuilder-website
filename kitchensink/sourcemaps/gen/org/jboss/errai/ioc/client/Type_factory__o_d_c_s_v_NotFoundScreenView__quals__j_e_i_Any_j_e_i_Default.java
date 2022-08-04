package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ClientBundle.Source;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.ui.Widget;
import elemental2.dom.HTMLDivElement;
import elemental2.dom.HTMLParagraphElement;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.enterprise.context.Dependent;
import org.dashbuilder.client.screens.NotFoundScreen.View;
import org.dashbuilder.client.screens.view.NotFoundScreenView;
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

public class Type_factory__o_d_c_s_v_NotFoundScreenView__quals__j_e_i_Any_j_e_i_Default extends Factory<NotFoundScreenView> { public interface o_d_c_s_v_NotFoundScreenViewTemplateResource extends Template, ClientBundle { @Source("org/dashbuilder/client/screens/view/NotFoundScreenView.html") public TextResource getContents(); }
  public Type_factory__o_d_c_s_v_NotFoundScreenView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(NotFoundScreenView.class, "Type_factory__o_d_c_s_v_NotFoundScreenView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { NotFoundScreenView.class, Object.class, View.class, UberElemental.class, IsElement.class, HasPresenter.class });
  }

  public NotFoundScreenView createInstance(final ContextManager contextManager) {
    final NotFoundScreenView instance = new NotFoundScreenView();
    setIncompleteInstance(instance);
    final HTMLDivElement NotFoundScreenView_root = (HTMLDivElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLDivElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NotFoundScreenView_root);
    NotFoundScreenView_HTMLDivElement_root(instance, NotFoundScreenView_root);
    final HTMLParagraphElement NotFoundScreenView_subTitle = (HTMLParagraphElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLParagraphElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NotFoundScreenView_subTitle);
    NotFoundScreenView_HTMLParagraphElement_subTitle(instance, NotFoundScreenView_subTitle);
    o_d_c_s_v_NotFoundScreenViewTemplateResource templateForNotFoundScreenView = GWT.create(o_d_c_s_v_NotFoundScreenViewTemplateResource.class);
    Element parentElementForTemplateOfNotFoundScreenView = TemplateUtil.getRootTemplateParentElement(templateForNotFoundScreenView.getContents().getText(), "org/dashbuilder/client/screens/view/NotFoundScreenView.html", "");
    TemplateUtil.translateTemplate("org/dashbuilder/client/screens/view/NotFoundScreenView.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfNotFoundScreenView));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfNotFoundScreenView));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(2);
    dataFieldMetas.put("root", new DataFieldMeta());
    dataFieldMetas.put("subTitle", new DataFieldMeta());
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.screens.view.NotFoundScreenView", "org/dashbuilder/client/screens/view/NotFoundScreenView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NotFoundScreenView_HTMLDivElement_root(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "root");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.screens.view.NotFoundScreenView", "org/dashbuilder/client/screens/view/NotFoundScreenView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NotFoundScreenView_HTMLParagraphElement_subTitle(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "subTitle");
    templateFieldsMap.put("root", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NotFoundScreenView_HTMLDivElement_root(instance))));
    templateFieldsMap.put("subTitle", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NotFoundScreenView_HTMLParagraphElement_subTitle(instance))));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfNotFoundScreenView), templateFieldsMap.values());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((NotFoundScreenView) instance, contextManager);
  }

  public void destroyInstanceHelper(final NotFoundScreenView instance, final ContextManager contextManager) {
    TemplateUtil.cleanupTemplated(instance);
  }

  native static HTMLDivElement NotFoundScreenView_HTMLDivElement_root(NotFoundScreenView instance) /*-{
    return instance.@org.dashbuilder.client.screens.view.NotFoundScreenView::root;
  }-*/;

  native static void NotFoundScreenView_HTMLDivElement_root(NotFoundScreenView instance, HTMLDivElement value) /*-{
    instance.@org.dashbuilder.client.screens.view.NotFoundScreenView::root = value;
  }-*/;

  native static HTMLParagraphElement NotFoundScreenView_HTMLParagraphElement_subTitle(NotFoundScreenView instance) /*-{
    return instance.@org.dashbuilder.client.screens.view.NotFoundScreenView::subTitle;
  }-*/;

  native static void NotFoundScreenView_HTMLParagraphElement_subTitle(NotFoundScreenView instance, HTMLParagraphElement value) /*-{
    instance.@org.dashbuilder.client.screens.view.NotFoundScreenView::subTitle = value;
  }-*/;
}