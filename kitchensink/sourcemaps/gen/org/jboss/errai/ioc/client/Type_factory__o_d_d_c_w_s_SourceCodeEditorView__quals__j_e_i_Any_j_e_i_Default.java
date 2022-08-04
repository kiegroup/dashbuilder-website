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
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.enterprise.context.Dependent;
import org.dashbuilder.displayer.client.widgets.sourcecode.SourceCodeEditor.View;
import org.dashbuilder.displayer.client.widgets.sourcecode.SourceCodeEditorView;
import org.jboss.errai.common.client.dom.Button;
import org.jboss.errai.common.client.dom.Div;
import org.jboss.errai.common.client.dom.Span;
import org.jboss.errai.common.client.dom.UnorderedList;
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
import org.uberfire.ext.widgets.common.client.ace.AceEditor;

public class Type_factory__o_d_d_c_w_s_SourceCodeEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<SourceCodeEditorView> { public interface o_d_d_c_w_s_SourceCodeEditorViewTemplateResource extends Template, TemplateStyleSheet, ClientBundle { @Source("org/dashbuilder/displayer/client/widgets/sourcecode/SourceCodeEditorView.html") public TextResource getContents();
  @Source("org/dashbuilder/displayer/client/widgets/sourcecode/SourceCodeEditorView.css") @NotStrict public CssResource getStyle(); }
  public Type_factory__o_d_d_c_w_s_SourceCodeEditorView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(SourceCodeEditorView.class, "Type_factory__o_d_d_c_w_s_SourceCodeEditorView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { SourceCodeEditorView.class, Composite.class, Widget.class, UIObject.class, Object.class, HasVisibility.class, EventListener.class, HasAttachHandlers.class, HasHandlers.class, IsWidget.class, IsRenderable.class, View.class, UberView.class, HasPresenter.class });
  }

  public void init(final Context context) {
    ((o_d_d_c_w_s_SourceCodeEditorViewTemplateResource) GWT.create(o_d_d_c_w_s_SourceCodeEditorViewTemplateResource.class)).getStyle().ensureInjected();
  }

  public SourceCodeEditorView createInstance(final ContextManager contextManager) {
    final SourceCodeEditorView instance = new SourceCodeEditorView();
    setIncompleteInstance(instance);
    final UnorderedList SourceCodeEditorView_variablesMenu = (UnorderedList) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_UnorderedList__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SourceCodeEditorView_variablesMenu);
    SourceCodeEditorView_UnorderedList_variablesMenu(instance, SourceCodeEditorView_variablesMenu);
    final AceEditor SourceCodeEditorView_aceEditor = (AceEditor) contextManager.getInstance("ExtensionProvided_factory__o_u_e_w_c_c_a_AceEditor__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, SourceCodeEditorView_aceEditor);
    SourceCodeEditorView_AceEditor_aceEditor(instance, SourceCodeEditorView_aceEditor);
    final Span SourceCodeEditorView_errorLabel = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SourceCodeEditorView_errorLabel);
    SourceCodeEditorView_Span_errorLabel(instance, SourceCodeEditorView_errorLabel);
    final Div SourceCodeEditorView_mainDiv = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SourceCodeEditorView_mainDiv);
    SourceCodeEditorView_Div_mainDiv(instance, SourceCodeEditorView_mainDiv);
    final Button SourceCodeEditorView_addVariableButton = (Button) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Button__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SourceCodeEditorView_addVariableButton);
    SourceCodeEditorView_Button_addVariableButton(instance, SourceCodeEditorView_addVariableButton);
    o_d_d_c_w_s_SourceCodeEditorViewTemplateResource templateForSourceCodeEditorView = GWT.create(o_d_d_c_w_s_SourceCodeEditorViewTemplateResource.class);
    Element parentElementForTemplateOfSourceCodeEditorView = TemplateUtil.getRootTemplateParentElement(templateForSourceCodeEditorView.getContents().getText(), "org/dashbuilder/displayer/client/widgets/sourcecode/SourceCodeEditorView.html", "");
    TemplateUtil.translateTemplate("org/dashbuilder/displayer/client/widgets/sourcecode/SourceCodeEditorView.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSourceCodeEditorView));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSourceCodeEditorView));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(5);
    dataFieldMetas.put("mainDiv", new DataFieldMeta());
    dataFieldMetas.put("aceEditor", new DataFieldMeta());
    dataFieldMetas.put("errorLabel", new DataFieldMeta());
    dataFieldMetas.put("addVariableButton", new DataFieldMeta());
    dataFieldMetas.put("variablesMenu", new DataFieldMeta());
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("org.dashbuilder.displayer.client.widgets.sourcecode.SourceCodeEditorView", "org/dashbuilder/displayer/client/widgets/sourcecode/SourceCodeEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SourceCodeEditorView_Div_mainDiv(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "mainDiv");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.displayer.client.widgets.sourcecode.SourceCodeEditorView", "org/dashbuilder/displayer/client/widgets/sourcecode/SourceCodeEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return SourceCodeEditorView_AceEditor_aceEditor(instance).asWidget();
      }
    }, dataFieldElements, dataFieldMetas, "aceEditor");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.displayer.client.widgets.sourcecode.SourceCodeEditorView", "org/dashbuilder/displayer/client/widgets/sourcecode/SourceCodeEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SourceCodeEditorView_Span_errorLabel(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "errorLabel");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.displayer.client.widgets.sourcecode.SourceCodeEditorView", "org/dashbuilder/displayer/client/widgets/sourcecode/SourceCodeEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SourceCodeEditorView_Button_addVariableButton(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "addVariableButton");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.displayer.client.widgets.sourcecode.SourceCodeEditorView", "org/dashbuilder/displayer/client/widgets/sourcecode/SourceCodeEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SourceCodeEditorView_UnorderedList_variablesMenu(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "variablesMenu");
    templateFieldsMap.put("mainDiv", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SourceCodeEditorView_Div_mainDiv(instance))));
    templateFieldsMap.put("aceEditor", SourceCodeEditorView_AceEditor_aceEditor(instance).asWidget());
    templateFieldsMap.put("errorLabel", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SourceCodeEditorView_Span_errorLabel(instance))));
    templateFieldsMap.put("addVariableButton", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SourceCodeEditorView_Button_addVariableButton(instance))));
    templateFieldsMap.put("variablesMenu", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SourceCodeEditorView_UnorderedList_variablesMenu(instance))));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSourceCodeEditorView), templateFieldsMap.values());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((SourceCodeEditorView) instance, contextManager);
  }

  public void destroyInstanceHelper(final SourceCodeEditorView instance, final ContextManager contextManager) {
    TemplateUtil.cleanupWidget(instance);
  }

  native static Button SourceCodeEditorView_Button_addVariableButton(SourceCodeEditorView instance) /*-{
    return instance.@org.dashbuilder.displayer.client.widgets.sourcecode.SourceCodeEditorView::addVariableButton;
  }-*/;

  native static void SourceCodeEditorView_Button_addVariableButton(SourceCodeEditorView instance, Button value) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.sourcecode.SourceCodeEditorView::addVariableButton = value;
  }-*/;

  native static UnorderedList SourceCodeEditorView_UnorderedList_variablesMenu(SourceCodeEditorView instance) /*-{
    return instance.@org.dashbuilder.displayer.client.widgets.sourcecode.SourceCodeEditorView::variablesMenu;
  }-*/;

  native static void SourceCodeEditorView_UnorderedList_variablesMenu(SourceCodeEditorView instance, UnorderedList value) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.sourcecode.SourceCodeEditorView::variablesMenu = value;
  }-*/;

  native static AceEditor SourceCodeEditorView_AceEditor_aceEditor(SourceCodeEditorView instance) /*-{
    return instance.@org.dashbuilder.displayer.client.widgets.sourcecode.SourceCodeEditorView::aceEditor;
  }-*/;

  native static void SourceCodeEditorView_AceEditor_aceEditor(SourceCodeEditorView instance, AceEditor value) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.sourcecode.SourceCodeEditorView::aceEditor = value;
  }-*/;

  native static Div SourceCodeEditorView_Div_mainDiv(SourceCodeEditorView instance) /*-{
    return instance.@org.dashbuilder.displayer.client.widgets.sourcecode.SourceCodeEditorView::mainDiv;
  }-*/;

  native static void SourceCodeEditorView_Div_mainDiv(SourceCodeEditorView instance, Div value) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.sourcecode.SourceCodeEditorView::mainDiv = value;
  }-*/;

  native static Span SourceCodeEditorView_Span_errorLabel(SourceCodeEditorView instance) /*-{
    return instance.@org.dashbuilder.displayer.client.widgets.sourcecode.SourceCodeEditorView::errorLabel;
  }-*/;

  native static void SourceCodeEditorView_Span_errorLabel(SourceCodeEditorView instance, Span value) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.sourcecode.SourceCodeEditorView::errorLabel = value;
  }-*/;
}