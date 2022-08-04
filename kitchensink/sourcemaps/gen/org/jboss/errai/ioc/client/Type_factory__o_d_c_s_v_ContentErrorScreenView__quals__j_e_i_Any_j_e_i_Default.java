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
import elemental2.dom.HTMLPreElement;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.enterprise.context.Dependent;
import org.dashbuilder.client.screens.ContentErrorScreen.View;
import org.dashbuilder.client.screens.view.ContentErrorScreenView;
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

public class Type_factory__o_d_c_s_v_ContentErrorScreenView__quals__j_e_i_Any_j_e_i_Default extends Factory<ContentErrorScreenView> { public interface o_d_c_s_v_ContentErrorScreenViewTemplateResource extends Template, TemplateStyleSheet, ClientBundle { @Source("org/dashbuilder/client/screens/view/ContentErrorScreenView.html") public TextResource getContents();
  @Source("org/dashbuilder/client/screens/view/ContentErrorScreenView.css") @NotStrict public CssResource getStyle(); }
  public Type_factory__o_d_c_s_v_ContentErrorScreenView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(ContentErrorScreenView.class, "Type_factory__o_d_c_s_v_ContentErrorScreenView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { ContentErrorScreenView.class, Object.class, View.class, UberElemental.class, IsElement.class, HasPresenter.class });
  }

  public void init(final Context context) {
    ((o_d_c_s_v_ContentErrorScreenViewTemplateResource) GWT.create(o_d_c_s_v_ContentErrorScreenViewTemplateResource.class)).getStyle().ensureInjected();
  }

  public ContentErrorScreenView createInstance(final ContextManager contextManager) {
    final ContentErrorScreenView instance = new ContentErrorScreenView();
    setIncompleteInstance(instance);
    final HTMLDivElement ContentErrorScreenView_errorContentRoot = (HTMLDivElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLDivElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ContentErrorScreenView_errorContentRoot);
    ContentErrorScreenView_HTMLDivElement_errorContentRoot(instance, ContentErrorScreenView_errorContentRoot);
    final HTMLDivElement ContentErrorScreenView_errorContentScreenTitle = (HTMLDivElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLDivElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ContentErrorScreenView_errorContentScreenTitle);
    ContentErrorScreenView_HTMLDivElement_errorContentScreenTitle(instance, ContentErrorScreenView_errorContentScreenTitle);
    final HTMLPreElement ContentErrorScreenView_errorContentText = (HTMLPreElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLPreElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, ContentErrorScreenView_errorContentText);
    ContentErrorScreenView_HTMLPreElement_errorContentText(instance, ContentErrorScreenView_errorContentText);
    o_d_c_s_v_ContentErrorScreenViewTemplateResource templateForContentErrorScreenView = GWT.create(o_d_c_s_v_ContentErrorScreenViewTemplateResource.class);
    Element parentElementForTemplateOfContentErrorScreenView = TemplateUtil.getRootTemplateParentElement(templateForContentErrorScreenView.getContents().getText(), "org/dashbuilder/client/screens/view/ContentErrorScreenView.html", "");
    TemplateUtil.translateTemplate("org/dashbuilder/client/screens/view/ContentErrorScreenView.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfContentErrorScreenView));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfContentErrorScreenView));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(3);
    dataFieldMetas.put("errorContentRoot", new DataFieldMeta());
    dataFieldMetas.put("errorContentScreenTitle", new DataFieldMeta());
    dataFieldMetas.put("errorContentText", new DataFieldMeta());
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.screens.view.ContentErrorScreenView", "org/dashbuilder/client/screens/view/ContentErrorScreenView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ContentErrorScreenView_HTMLDivElement_errorContentRoot(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "errorContentRoot");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.screens.view.ContentErrorScreenView", "org/dashbuilder/client/screens/view/ContentErrorScreenView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ContentErrorScreenView_HTMLDivElement_errorContentScreenTitle(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "errorContentScreenTitle");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.screens.view.ContentErrorScreenView", "org/dashbuilder/client/screens/view/ContentErrorScreenView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(ContentErrorScreenView_HTMLPreElement_errorContentText(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "errorContentText");
    templateFieldsMap.put("errorContentRoot", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ContentErrorScreenView_HTMLDivElement_errorContentRoot(instance))));
    templateFieldsMap.put("errorContentScreenTitle", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ContentErrorScreenView_HTMLDivElement_errorContentScreenTitle(instance))));
    templateFieldsMap.put("errorContentText", ElementWrapperWidget.getWidget(TemplateUtil.asElement(ContentErrorScreenView_HTMLPreElement_errorContentText(instance))));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfContentErrorScreenView), templateFieldsMap.values());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ContentErrorScreenView) instance, contextManager);
  }

  public void destroyInstanceHelper(final ContentErrorScreenView instance, final ContextManager contextManager) {
    TemplateUtil.cleanupTemplated(instance);
  }

  native static HTMLDivElement ContentErrorScreenView_HTMLDivElement_errorContentScreenTitle(ContentErrorScreenView instance) /*-{
    return instance.@org.dashbuilder.client.screens.view.ContentErrorScreenView::errorContentScreenTitle;
  }-*/;

  native static void ContentErrorScreenView_HTMLDivElement_errorContentScreenTitle(ContentErrorScreenView instance, HTMLDivElement value) /*-{
    instance.@org.dashbuilder.client.screens.view.ContentErrorScreenView::errorContentScreenTitle = value;
  }-*/;

  native static HTMLPreElement ContentErrorScreenView_HTMLPreElement_errorContentText(ContentErrorScreenView instance) /*-{
    return instance.@org.dashbuilder.client.screens.view.ContentErrorScreenView::errorContentText;
  }-*/;

  native static void ContentErrorScreenView_HTMLPreElement_errorContentText(ContentErrorScreenView instance, HTMLPreElement value) /*-{
    instance.@org.dashbuilder.client.screens.view.ContentErrorScreenView::errorContentText = value;
  }-*/;

  native static HTMLDivElement ContentErrorScreenView_HTMLDivElement_errorContentRoot(ContentErrorScreenView instance) /*-{
    return instance.@org.dashbuilder.client.screens.view.ContentErrorScreenView::errorContentRoot;
  }-*/;

  native static void ContentErrorScreenView_HTMLDivElement_errorContentRoot(ContentErrorScreenView instance, HTMLDivElement value) /*-{
    instance.@org.dashbuilder.client.screens.view.ContentErrorScreenView::errorContentRoot = value;
  }-*/;
}