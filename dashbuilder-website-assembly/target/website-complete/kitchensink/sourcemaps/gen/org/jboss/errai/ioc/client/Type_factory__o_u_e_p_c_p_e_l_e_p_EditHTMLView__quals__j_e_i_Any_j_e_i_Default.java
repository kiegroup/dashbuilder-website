package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ClientBundle.Source;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.EventListener;
import com.google.gwt.user.client.ui.Widget;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.enterprise.context.Dependent;
import org.jboss.errai.common.client.api.IsElement;
import org.jboss.errai.common.client.dom.Div;
import org.jboss.errai.common.client.ui.ElementWrapperWidget;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ui.client.local.spi.TranslationService;
import org.jboss.errai.ui.shared.DataFieldMeta;
import org.jboss.errai.ui.shared.Template;
import org.jboss.errai.ui.shared.TemplateUtil;
import org.jboss.errai.ui.shared.api.style.StyleBindingsRegistry;
import org.uberfire.client.mvp.HasPresenter;
import org.uberfire.client.mvp.UberElement;
import org.uberfire.ext.plugin.client.perspective.editor.layout.editor.popups.EditHTMLPresenter.View;
import org.uberfire.ext.plugin.client.perspective.editor.layout.editor.popups.EditHTMLView;

public class Type_factory__o_u_e_p_c_p_e_l_e_p_EditHTMLView__quals__j_e_i_Any_j_e_i_Default extends Factory<EditHTMLView> { public interface o_u_e_p_c_p_e_l_e_p_EditHTMLViewTemplateResource extends Template, ClientBundle { @Source("org/uberfire/ext/plugin/client/perspective/editor/layout/editor/popups/EditHTMLView.html") public TextResource getContents(); }
  public Type_factory__o_u_e_p_c_p_e_l_e_p_EditHTMLView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(EditHTMLView.class, "Type_factory__o_u_e_p_c_p_e_l_e_p_EditHTMLView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { EditHTMLView.class, Object.class, View.class, UberElement.class, IsElement.class, HasPresenter.class });
  }

  public EditHTMLView createInstance(final ContextManager contextManager) {
    final TranslationService _translationService_0 = (TranslationService) contextManager.getInstance("Provider_factory__o_j_e_u_c_l_s_TranslationService__quals__j_e_i_Any_j_e_i_Default");
    final EditHTMLView instance = new EditHTMLView(_translationService_0);
    registerDependentScopedReference(instance, _translationService_0);
    setIncompleteInstance(instance);
    final Div EditHTMLView_body = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, EditHTMLView_body);
    EditHTMLView_Div_body(instance, EditHTMLView_body);
    final Div EditHTMLView_footer = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, EditHTMLView_footer);
    EditHTMLView_Div_footer(instance, EditHTMLView_footer);
    o_u_e_p_c_p_e_l_e_p_EditHTMLViewTemplateResource templateForEditHTMLView = GWT.create(o_u_e_p_c_p_e_l_e_p_EditHTMLViewTemplateResource.class);
    Element parentElementForTemplateOfEditHTMLView = TemplateUtil.getRootTemplateParentElement(templateForEditHTMLView.getContents().getText(), "org/uberfire/ext/plugin/client/perspective/editor/layout/editor/popups/EditHTMLView.html", "");
    TemplateUtil.translateTemplate("org/uberfire/ext/plugin/client/perspective/editor/layout/editor/popups/EditHTMLView.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfEditHTMLView));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfEditHTMLView));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(2);
    dataFieldMetas.put("body", new DataFieldMeta());
    dataFieldMetas.put("footer", new DataFieldMeta());
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("org.uberfire.ext.plugin.client.perspective.editor.layout.editor.popups.EditHTMLView", "org/uberfire/ext/plugin/client/perspective/editor/layout/editor/popups/EditHTMLView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(EditHTMLView_Div_body(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "body");
    TemplateUtil.compositeComponentReplace("org.uberfire.ext.plugin.client.perspective.editor.layout.editor.popups.EditHTMLView", "org/uberfire/ext/plugin/client/perspective/editor/layout/editor/popups/EditHTMLView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(EditHTMLView_Div_footer(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "footer");
    templateFieldsMap.put("body", ElementWrapperWidget.getWidget(TemplateUtil.asElement(EditHTMLView_Div_body(instance))));
    templateFieldsMap.put("footer", ElementWrapperWidget.getWidget(TemplateUtil.asElement(EditHTMLView_Div_footer(instance))));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfEditHTMLView), templateFieldsMap.values());
    TemplateUtil.setupNativeEventListener(instance, dataFieldElements.get("okButton"), new EventListener() {
      public void onBrowserEvent(Event event) {
        instance.okClick(event);
      }
    }, 1);
    TemplateUtil.setupNativeEventListener(instance, dataFieldElements.get("cancelButton"), new EventListener() {
      public void onBrowserEvent(Event event) {
        instance.cancelClick(event);
      }
    }, 1);
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((EditHTMLView) instance, contextManager);
  }

  public void destroyInstanceHelper(final EditHTMLView instance, final ContextManager contextManager) {
    TemplateUtil.cleanupTemplated(instance);
  }

  native static Div EditHTMLView_Div_body(EditHTMLView instance) /*-{
    return instance.@org.uberfire.ext.plugin.client.perspective.editor.layout.editor.popups.EditHTMLView::body;
  }-*/;

  native static void EditHTMLView_Div_body(EditHTMLView instance, Div value) /*-{
    instance.@org.uberfire.ext.plugin.client.perspective.editor.layout.editor.popups.EditHTMLView::body = value;
  }-*/;

  native static Div EditHTMLView_Div_footer(EditHTMLView instance) /*-{
    return instance.@org.uberfire.ext.plugin.client.perspective.editor.layout.editor.popups.EditHTMLView::footer;
  }-*/;

  native static void EditHTMLView_Div_footer(EditHTMLView instance, Div value) /*-{
    instance.@org.uberfire.ext.plugin.client.perspective.editor.layout.editor.popups.EditHTMLView::footer = value;
  }-*/;
}