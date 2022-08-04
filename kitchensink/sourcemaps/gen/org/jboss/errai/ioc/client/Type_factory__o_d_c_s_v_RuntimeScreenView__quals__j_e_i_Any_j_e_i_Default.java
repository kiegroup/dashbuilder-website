package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.StyleInjector;
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
import org.dashbuilder.client.RuntimeCommunication;
import org.dashbuilder.client.navbar.AppNavBar;
import org.dashbuilder.client.screens.RuntimeScreen.View;
import org.dashbuilder.client.screens.view.RuntimeScreenView;
import org.jboss.errai.common.client.api.elemental2.IsElement;
import org.jboss.errai.common.client.ui.ElementWrapperWidget;
import org.jboss.errai.ioc.client.container.Context;
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

public class Type_factory__o_d_c_s_v_RuntimeScreenView__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimeScreenView> { public interface o_d_c_s_v_RuntimeScreenViewTemplateResource extends Template, ClientBundle { @Source("org/dashbuilder/client/screens/view/RuntimeScreenView.html") public TextResource getContents(); }
  public Type_factory__o_d_c_s_v_RuntimeScreenView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(RuntimeScreenView.class, "Type_factory__o_d_c_s_v_RuntimeScreenView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { RuntimeScreenView.class, Object.class, View.class, UberElemental.class, IsElement.class, HasPresenter.class });
  }

  public void init(final Context context) {
    StyleInjector.inject("/*\n * Copyright 2020 Red Hat, Inc. and/or its affiliates.\n *\n * Licensed under the Apache License, Version 2.0 (the \"License\");\n * you may not use this file except in compliance with the License.\n * You may obtain a copy of the License at\n *\n *       http://www.apache.org/licenses/LICENSE-2.0\n *\n * Unless required by applicable law or agreed to in writing, software\n * distributed under the License is distributed on an \"AS IS\" BASIS,\n * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\n * See the License for the specific language governing permissions and\n * limitations under the License.\n */\n#runtimePage {\n  height: 100%;\n}\n#runtimePage .runtimePageBody {\n  background-image: url(\"images/runtime_home_bg.jpg\");\n  align-items: stretch;\n  display: flex;\n  justify-content: space-between;\n  flex-flow: column nowrap;\n  height: 100%;\n  max-height: 100vh;\n}\n#runtimePage .runtimePage__content {\n  flex: 1 1 auto;\n}\n#runtimePage .runtimeContent--bg-image {\n  background-color: #4d5258;\n  background-position: top center;\n  background-size: cover;\n}\n#runtimePage .runtimeContent--bg-image .blank-slate-pf {\n  background-color: transparent;\n  color: #d1d1d1;\n  border: 0;\n}\n@media (min-width: 992px) {\n  #runtimePage .runtime-container-fluid--blank-slate {\n    width: 100%;\n    background-color: rgba(0, 0, 0, 0.2);\n  }\n}\n#runtimePage .runtime-blank-slate {\n  display: flex;\n  background-color: transparent;\n}\n@media (min-width: 992px) {\n  #runtimePage .runtime-blank-slate {\n    align-items: center;\n  }\n}\n\n");
  }

  public RuntimeScreenView createInstance(final ContextManager contextManager) {
    final RuntimeScreenView instance = new RuntimeScreenView();
    setIncompleteInstance(instance);
    final RuntimeCommunication RuntimeScreenView_runtimeCommunication = (RuntimeCommunication) contextManager.getInstance("Type_factory__o_d_c_RuntimeCommunication__quals__j_e_i_Any_j_e_i_Default");
    RuntimeScreenView_RuntimeCommunication_runtimeCommunication(instance, RuntimeScreenView_runtimeCommunication);
    final BusyIndicatorView RuntimeScreenView_loading = (BusyIndicatorView) contextManager.getInstance("Type_factory__o_u_e_w_c_c_c_BusyIndicatorView__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, RuntimeScreenView_loading);
    RuntimeScreenView_BusyIndicatorView_loading(instance, RuntimeScreenView_loading);
    final HTMLDivElement RuntimeScreenView_runtimePage = (HTMLDivElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLDivElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, RuntimeScreenView_runtimePage);
    RuntimeScreenView_HTMLDivElement_runtimePage(instance, RuntimeScreenView_runtimePage);
    final AppNavBar RuntimeScreenView_appNavBar = (AppNavBar) contextManager.getInstance("Type_factory__o_d_c_n_AppNavBar__quals__j_e_i_Any_j_e_i_Default");
    RuntimeScreenView_AppNavBar_appNavBar(instance, RuntimeScreenView_appNavBar);
    o_d_c_s_v_RuntimeScreenViewTemplateResource templateForRuntimeScreenView = GWT.create(o_d_c_s_v_RuntimeScreenViewTemplateResource.class);
    Element parentElementForTemplateOfRuntimeScreenView = TemplateUtil.getRootTemplateParentElement(templateForRuntimeScreenView.getContents().getText(), "org/dashbuilder/client/screens/view/RuntimeScreenView.html", "");
    TemplateUtil.translateTemplate("org/dashbuilder/client/screens/view/RuntimeScreenView.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfRuntimeScreenView));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfRuntimeScreenView));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(1);
    dataFieldMetas.put("runtimePage", new DataFieldMeta());
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.screens.view.RuntimeScreenView", "org/dashbuilder/client/screens/view/RuntimeScreenView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(RuntimeScreenView_HTMLDivElement_runtimePage(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "runtimePage");
    templateFieldsMap.put("runtimePage", ElementWrapperWidget.getWidget(TemplateUtil.asElement(RuntimeScreenView_HTMLDivElement_runtimePage(instance))));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfRuntimeScreenView), templateFieldsMap.values());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((RuntimeScreenView) instance, contextManager);
  }

  public void destroyInstanceHelper(final RuntimeScreenView instance, final ContextManager contextManager) {
    TemplateUtil.cleanupTemplated(instance);
  }

  native static RuntimeCommunication RuntimeScreenView_RuntimeCommunication_runtimeCommunication(RuntimeScreenView instance) /*-{
    return instance.@org.dashbuilder.client.screens.view.RuntimeScreenView::runtimeCommunication;
  }-*/;

  native static void RuntimeScreenView_RuntimeCommunication_runtimeCommunication(RuntimeScreenView instance, RuntimeCommunication value) /*-{
    instance.@org.dashbuilder.client.screens.view.RuntimeScreenView::runtimeCommunication = value;
  }-*/;

  native static HTMLDivElement RuntimeScreenView_HTMLDivElement_runtimePage(RuntimeScreenView instance) /*-{
    return instance.@org.dashbuilder.client.screens.view.RuntimeScreenView::runtimePage;
  }-*/;

  native static void RuntimeScreenView_HTMLDivElement_runtimePage(RuntimeScreenView instance, HTMLDivElement value) /*-{
    instance.@org.dashbuilder.client.screens.view.RuntimeScreenView::runtimePage = value;
  }-*/;

  native static BusyIndicatorView RuntimeScreenView_BusyIndicatorView_loading(RuntimeScreenView instance) /*-{
    return instance.@org.dashbuilder.client.screens.view.RuntimeScreenView::loading;
  }-*/;

  native static void RuntimeScreenView_BusyIndicatorView_loading(RuntimeScreenView instance, BusyIndicatorView value) /*-{
    instance.@org.dashbuilder.client.screens.view.RuntimeScreenView::loading = value;
  }-*/;

  native static AppNavBar RuntimeScreenView_AppNavBar_appNavBar(RuntimeScreenView instance) /*-{
    return instance.@org.dashbuilder.client.screens.view.RuntimeScreenView::appNavBar;
  }-*/;

  native static void RuntimeScreenView_AppNavBar_appNavBar(RuntimeScreenView instance, AppNavBar value) /*-{
    instance.@org.dashbuilder.client.screens.view.RuntimeScreenView::appNavBar = value;
  }-*/;
}