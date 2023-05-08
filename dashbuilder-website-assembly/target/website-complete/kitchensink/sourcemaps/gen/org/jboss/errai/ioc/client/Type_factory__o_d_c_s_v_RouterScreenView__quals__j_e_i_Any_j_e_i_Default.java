package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ClientBundle.Source;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.ui.Widget;
import elemental2.dom.HTMLDivElement;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.enterprise.context.Dependent;
import org.dashbuilder.client.screens.RouterScreen.View;
import org.dashbuilder.client.screens.view.RouterScreenView;
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

public class Type_factory__o_d_c_s_v_RouterScreenView__quals__j_e_i_Any_j_e_i_Default extends Factory<RouterScreenView> { public interface o_d_c_s_v_RouterScreenViewTemplateResource extends Template, ClientBundle { @Source("org/dashbuilder/client/screens/view/RouterScreenView.html") public TextResource getContents(); }
  public Type_factory__o_d_c_s_v_RouterScreenView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(RouterScreenView.class, "Type_factory__o_d_c_s_v_RouterScreenView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { RouterScreenView.class, Object.class, View.class, UberElemental.class, IsElement.class, HasPresenter.class });
  }

  public RouterScreenView createInstance(final ContextManager contextManager) {
    final RouterScreenView instance = new RouterScreenView();
    setIncompleteInstance(instance);
    final HTMLDivElement RouterScreenView_routerRoot = (HTMLDivElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLDivElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, RouterScreenView_routerRoot);
    RouterScreenView_HTMLDivElement_routerRoot(instance, RouterScreenView_routerRoot);
    o_d_c_s_v_RouterScreenViewTemplateResource templateForRouterScreenView = GWT.create(o_d_c_s_v_RouterScreenViewTemplateResource.class);
    Element parentElementForTemplateOfRouterScreenView = TemplateUtil.getRootTemplateParentElement(templateForRouterScreenView.getContents().getText(), "org/dashbuilder/client/screens/view/RouterScreenView.html", "");
    TemplateUtil.translateTemplate("org/dashbuilder/client/screens/view/RouterScreenView.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfRouterScreenView));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfRouterScreenView));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(1);
    dataFieldMetas.put("routerRoot", new DataFieldMeta());
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.screens.view.RouterScreenView", "org/dashbuilder/client/screens/view/RouterScreenView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(RouterScreenView_HTMLDivElement_routerRoot(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "routerRoot");
    templateFieldsMap.put("routerRoot", ElementWrapperWidget.getWidget(TemplateUtil.asElement(RouterScreenView_HTMLDivElement_routerRoot(instance))));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfRouterScreenView), templateFieldsMap.values());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((RouterScreenView) instance, contextManager);
  }

  public void destroyInstanceHelper(final RouterScreenView instance, final ContextManager contextManager) {
    TemplateUtil.cleanupTemplated(instance);
  }

  native static HTMLDivElement RouterScreenView_HTMLDivElement_routerRoot(RouterScreenView instance) /*-{
    return instance.@org.dashbuilder.client.screens.view.RouterScreenView::routerRoot;
  }-*/;

  native static void RouterScreenView_HTMLDivElement_routerRoot(RouterScreenView instance, HTMLDivElement value) /*-{
    instance.@org.dashbuilder.client.screens.view.RouterScreenView::routerRoot = value;
  }-*/;
}