package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ClientBundle.Source;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.CssResource.NotStrict;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.ui.Widget;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.enterprise.context.Dependent;
import org.dashbuilder.client.navigation.widget.editor.NavItemEditor.View;
import org.dashbuilder.client.navigation.widget.editor.NavItemEditorView;
import org.dashbuilder.client.navigation.widget.editor.NavTreeEditorView;
import org.jboss.errai.common.client.dom.Button;
import org.jboss.errai.common.client.dom.Div;
import org.jboss.errai.common.client.dom.Span;
import org.jboss.errai.common.client.ui.ElementWrapperWidget;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ui.client.local.api.IsElement;
import org.jboss.errai.ui.shared.DataFieldMeta;
import org.jboss.errai.ui.shared.Template;
import org.jboss.errai.ui.shared.TemplateStyleSheet;
import org.jboss.errai.ui.shared.TemplateUtil;
import org.jboss.errai.ui.shared.api.style.StyleBindingsRegistry;
import org.uberfire.client.mvp.HasPresenter;
import org.uberfire.client.mvp.UberElement;

public class Type_factory__o_d_c_n_w_e_NavTreeEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<NavTreeEditorView> { public interface o_d_c_n_w_e_NavTreeEditorViewTemplateResource extends Template, TemplateStyleSheet, ClientBundle { @Source("org/dashbuilder/client/navigation/widget/editor/NavTreeEditorView.html") public TextResource getContents();
  @Source("org/dashbuilder/client/navigation/widget/editor/NavTreeEditorView.css") @NotStrict public CssResource getStyle(); }
  public Type_factory__o_d_c_n_w_e_NavTreeEditorView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(NavTreeEditorView.class, "Type_factory__o_d_c_n_w_e_NavTreeEditorView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { NavTreeEditorView.class, NavItemEditorView.class, Object.class, IsElement.class, org.jboss.errai.common.client.api.IsElement.class, View.class, UberElement.class, HasPresenter.class, org.dashbuilder.client.navigation.widget.editor.NavTreeEditor.View.class });
  }

  public void init(final Context context) {
    ((o_d_c_n_w_e_NavTreeEditorViewTemplateResource) GWT.create(o_d_c_n_w_e_NavTreeEditorViewTemplateResource.class)).getStyle().ensureInjected();
  }

  public NavTreeEditorView createInstance(final ContextManager contextManager) {
    final NavTreeEditorView instance = new NavTreeEditorView();
    setIncompleteInstance(instance);
    final Button NavTreeEditorView_cancelButton = (Button) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Button__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavTreeEditorView_cancelButton);
    NavTreeEditorView_Button_cancelButton(instance, NavTreeEditorView_cancelButton);
    final Div NavTreeEditorView_alertDiv = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavTreeEditorView_alertDiv);
    NavTreeEditorView_Div_alertDiv(instance, NavTreeEditorView_alertDiv);
    final Button NavTreeEditorView_saveButton = (Button) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Button__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavTreeEditorView_saveButton);
    NavTreeEditorView_Button_saveButton(instance, NavTreeEditorView_saveButton);
    final Div NavTreeEditorView_mainDiv = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavTreeEditorView_mainDiv);
    NavTreeEditorView_Div_mainDiv(instance, NavTreeEditorView_mainDiv);
    final Div NavTreeEditorView_childrenDiv = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavTreeEditorView_childrenDiv);
    NavTreeEditorView_Div_childrenDiv(instance, NavTreeEditorView_childrenDiv);
    final Span NavTreeEditorView_alertMessage = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavTreeEditorView_alertMessage);
    NavTreeEditorView_Span_alertMessage(instance, NavTreeEditorView_alertMessage);
    o_d_c_n_w_e_NavTreeEditorViewTemplateResource templateForNavTreeEditorView = GWT.create(o_d_c_n_w_e_NavTreeEditorViewTemplateResource.class);
    Element parentElementForTemplateOfNavTreeEditorView = TemplateUtil.getRootTemplateParentElement(templateForNavTreeEditorView.getContents().getText(), "org/dashbuilder/client/navigation/widget/editor/NavTreeEditorView.html", "");
    TemplateUtil.translateTemplate("org/dashbuilder/client/navigation/widget/editor/NavTreeEditorView.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfNavTreeEditorView));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfNavTreeEditorView));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(6);
    dataFieldMetas.put("mainDiv", new DataFieldMeta());
    dataFieldMetas.put("childrenDiv", new DataFieldMeta());
    dataFieldMetas.put("alertDiv", new DataFieldMeta());
    dataFieldMetas.put("alertMessage", new DataFieldMeta());
    dataFieldMetas.put("saveButton", new DataFieldMeta());
    dataFieldMetas.put("cancelButton", new DataFieldMeta());
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.editor.NavTreeEditorView", "org/dashbuilder/client/navigation/widget/editor/NavTreeEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavTreeEditorView_Div_mainDiv(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "mainDiv");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.editor.NavTreeEditorView", "org/dashbuilder/client/navigation/widget/editor/NavTreeEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavTreeEditorView_Div_childrenDiv(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "childrenDiv");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.editor.NavTreeEditorView", "org/dashbuilder/client/navigation/widget/editor/NavTreeEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavTreeEditorView_Div_alertDiv(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "alertDiv");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.editor.NavTreeEditorView", "org/dashbuilder/client/navigation/widget/editor/NavTreeEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavTreeEditorView_Span_alertMessage(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "alertMessage");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.editor.NavTreeEditorView", "org/dashbuilder/client/navigation/widget/editor/NavTreeEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavTreeEditorView_Button_saveButton(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "saveButton");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.editor.NavTreeEditorView", "org/dashbuilder/client/navigation/widget/editor/NavTreeEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavTreeEditorView_Button_cancelButton(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "cancelButton");
    templateFieldsMap.put("mainDiv", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavTreeEditorView_Div_mainDiv(instance))));
    templateFieldsMap.put("childrenDiv", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavTreeEditorView_Div_childrenDiv(instance))));
    templateFieldsMap.put("alertDiv", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavTreeEditorView_Div_alertDiv(instance))));
    templateFieldsMap.put("alertMessage", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavTreeEditorView_Span_alertMessage(instance))));
    templateFieldsMap.put("saveButton", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavTreeEditorView_Button_saveButton(instance))));
    templateFieldsMap.put("cancelButton", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavTreeEditorView_Button_cancelButton(instance))));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfNavTreeEditorView), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("saveButton"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onSaveClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("cancelButton"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onCancelClicked(event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((NavTreeEditorView) instance, contextManager);
  }

  public void destroyInstanceHelper(final NavTreeEditorView instance, final ContextManager contextManager) {
    TemplateUtil.cleanupTemplated(instance);
  }

  native static Button NavTreeEditorView_Button_cancelButton(NavTreeEditorView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.editor.NavTreeEditorView::cancelButton;
  }-*/;

  native static void NavTreeEditorView_Button_cancelButton(NavTreeEditorView instance, Button value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.editor.NavTreeEditorView::cancelButton = value;
  }-*/;

  native static Button NavTreeEditorView_Button_saveButton(NavTreeEditorView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.editor.NavTreeEditorView::saveButton;
  }-*/;

  native static void NavTreeEditorView_Button_saveButton(NavTreeEditorView instance, Button value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.editor.NavTreeEditorView::saveButton = value;
  }-*/;

  native static Div NavTreeEditorView_Div_mainDiv(NavTreeEditorView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.editor.NavTreeEditorView::mainDiv;
  }-*/;

  native static void NavTreeEditorView_Div_mainDiv(NavTreeEditorView instance, Div value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.editor.NavTreeEditorView::mainDiv = value;
  }-*/;

  native static Div NavTreeEditorView_Div_alertDiv(NavTreeEditorView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.editor.NavTreeEditorView::alertDiv;
  }-*/;

  native static void NavTreeEditorView_Div_alertDiv(NavTreeEditorView instance, Div value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.editor.NavTreeEditorView::alertDiv = value;
  }-*/;

  native static Span NavTreeEditorView_Span_alertMessage(NavTreeEditorView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.editor.NavTreeEditorView::alertMessage;
  }-*/;

  native static void NavTreeEditorView_Span_alertMessage(NavTreeEditorView instance, Span value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.editor.NavTreeEditorView::alertMessage = value;
  }-*/;

  native static Div NavTreeEditorView_Div_childrenDiv(NavTreeEditorView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.editor.NavTreeEditorView::childrenDiv;
  }-*/;

  native static void NavTreeEditorView_Div_childrenDiv(NavTreeEditorView instance, Div value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.editor.NavTreeEditorView::childrenDiv = value;
  }-*/;
}