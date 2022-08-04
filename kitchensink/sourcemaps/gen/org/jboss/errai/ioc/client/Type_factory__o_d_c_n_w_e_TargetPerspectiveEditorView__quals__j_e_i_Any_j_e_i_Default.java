package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
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
import org.dashbuilder.client.navigation.widget.editor.TargetPerspectiveEditor.View;
import org.dashbuilder.client.navigation.widget.editor.TargetPerspectiveEditorView;
import org.jboss.errai.common.client.api.IsElement;
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
import org.uberfire.client.mvp.UberElement;

public class Type_factory__o_d_c_n_w_e_TargetPerspectiveEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<TargetPerspectiveEditorView> { public interface o_d_c_n_w_e_TargetPerspectiveEditorViewTemplateResource extends Template, TemplateStyleSheet, ClientBundle { @Source("org/dashbuilder/client/navigation/widget/editor/TargetPerspectiveEditorView.html") public TextResource getContents();
  @Source("org/dashbuilder/client/navigation/widget/editor/TargetPerspectiveEditorView.css") @NotStrict public CssResource getStyle(); }
  public Type_factory__o_d_c_n_w_e_TargetPerspectiveEditorView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(TargetPerspectiveEditorView.class, "Type_factory__o_d_c_n_w_e_TargetPerspectiveEditorView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { TargetPerspectiveEditorView.class, Object.class, View.class, UberElement.class, IsElement.class, HasPresenter.class, org.jboss.errai.ui.client.local.api.IsElement.class });
  }

  public void init(final Context context) {
    ((o_d_c_n_w_e_TargetPerspectiveEditorViewTemplateResource) GWT.create(o_d_c_n_w_e_TargetPerspectiveEditorViewTemplateResource.class)).getStyle().ensureInjected();
  }

  public TargetPerspectiveEditorView createInstance(final ContextManager contextManager) {
    final TargetPerspectiveEditorView instance = new TargetPerspectiveEditorView();
    setIncompleteInstance(instance);
    final Span TargetPerspectiveEditorView_navGroupSelectorHelp = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, TargetPerspectiveEditorView_navGroupSelectorHelp);
    TargetPerspectiveEditorView_Span_navGroupSelectorHelp(instance, TargetPerspectiveEditorView_navGroupSelectorHelp);
    final Span TargetPerspectiveEditorView_perspectiveSelectorHelp = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, TargetPerspectiveEditorView_perspectiveSelectorHelp);
    TargetPerspectiveEditorView_Span_perspectiveSelectorHelp(instance, TargetPerspectiveEditorView_perspectiveSelectorHelp);
    final Span TargetPerspectiveEditorView_navGroupSelection = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, TargetPerspectiveEditorView_navGroupSelection);
    TargetPerspectiveEditorView_Span_navGroupSelection(instance, TargetPerspectiveEditorView_navGroupSelection);
    final Div TargetPerspectiveEditorView_perspectiveSelectorDiv = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, TargetPerspectiveEditorView_perspectiveSelectorDiv);
    TargetPerspectiveEditorView_Div_perspectiveSelectorDiv(instance, TargetPerspectiveEditorView_perspectiveSelectorDiv);
    final UnorderedList TargetPerspectiveEditorView_navGroupItems = (UnorderedList) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_UnorderedList__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, TargetPerspectiveEditorView_navGroupItems);
    TargetPerspectiveEditorView_UnorderedList_navGroupItems(instance, TargetPerspectiveEditorView_navGroupItems);
    final Div TargetPerspectiveEditorView_groupSelectorDiv = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, TargetPerspectiveEditorView_groupSelectorDiv);
    TargetPerspectiveEditorView_Div_groupSelectorDiv(instance, TargetPerspectiveEditorView_groupSelectorDiv);
    o_d_c_n_w_e_TargetPerspectiveEditorViewTemplateResource templateForTargetPerspectiveEditorView = GWT.create(o_d_c_n_w_e_TargetPerspectiveEditorViewTemplateResource.class);
    Element parentElementForTemplateOfTargetPerspectiveEditorView = TemplateUtil.getRootTemplateParentElement(templateForTargetPerspectiveEditorView.getContents().getText(), "org/dashbuilder/client/navigation/widget/editor/TargetPerspectiveEditorView.html", "");
    TemplateUtil.translateTemplate("org/dashbuilder/client/navigation/widget/editor/TargetPerspectiveEditorView.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfTargetPerspectiveEditorView));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfTargetPerspectiveEditorView));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(6);
    dataFieldMetas.put("perspectiveSelectorDiv", new DataFieldMeta());
    dataFieldMetas.put("groupSelectorDiv", new DataFieldMeta());
    dataFieldMetas.put("navGroupSelection", new DataFieldMeta());
    dataFieldMetas.put("navGroupItems", new DataFieldMeta());
    dataFieldMetas.put("perspectiveSelectorHelp", new DataFieldMeta());
    dataFieldMetas.put("navGroupSelectorHelp", new DataFieldMeta());
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.editor.TargetPerspectiveEditorView", "org/dashbuilder/client/navigation/widget/editor/TargetPerspectiveEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(TargetPerspectiveEditorView_Div_perspectiveSelectorDiv(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "perspectiveSelectorDiv");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.editor.TargetPerspectiveEditorView", "org/dashbuilder/client/navigation/widget/editor/TargetPerspectiveEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(TargetPerspectiveEditorView_Div_groupSelectorDiv(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "groupSelectorDiv");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.editor.TargetPerspectiveEditorView", "org/dashbuilder/client/navigation/widget/editor/TargetPerspectiveEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(TargetPerspectiveEditorView_Span_navGroupSelection(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "navGroupSelection");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.editor.TargetPerspectiveEditorView", "org/dashbuilder/client/navigation/widget/editor/TargetPerspectiveEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(TargetPerspectiveEditorView_UnorderedList_navGroupItems(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "navGroupItems");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.editor.TargetPerspectiveEditorView", "org/dashbuilder/client/navigation/widget/editor/TargetPerspectiveEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(TargetPerspectiveEditorView_Span_perspectiveSelectorHelp(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "perspectiveSelectorHelp");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.editor.TargetPerspectiveEditorView", "org/dashbuilder/client/navigation/widget/editor/TargetPerspectiveEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(TargetPerspectiveEditorView_Span_navGroupSelectorHelp(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "navGroupSelectorHelp");
    templateFieldsMap.put("perspectiveSelectorDiv", ElementWrapperWidget.getWidget(TemplateUtil.asElement(TargetPerspectiveEditorView_Div_perspectiveSelectorDiv(instance))));
    templateFieldsMap.put("groupSelectorDiv", ElementWrapperWidget.getWidget(TemplateUtil.asElement(TargetPerspectiveEditorView_Div_groupSelectorDiv(instance))));
    templateFieldsMap.put("navGroupSelection", ElementWrapperWidget.getWidget(TemplateUtil.asElement(TargetPerspectiveEditorView_Span_navGroupSelection(instance))));
    templateFieldsMap.put("navGroupItems", ElementWrapperWidget.getWidget(TemplateUtil.asElement(TargetPerspectiveEditorView_UnorderedList_navGroupItems(instance))));
    templateFieldsMap.put("perspectiveSelectorHelp", ElementWrapperWidget.getWidget(TemplateUtil.asElement(TargetPerspectiveEditorView_Span_perspectiveSelectorHelp(instance))));
    templateFieldsMap.put("navGroupSelectorHelp", ElementWrapperWidget.getWidget(TemplateUtil.asElement(TargetPerspectiveEditorView_Span_navGroupSelectorHelp(instance))));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfTargetPerspectiveEditorView), templateFieldsMap.values());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((TargetPerspectiveEditorView) instance, contextManager);
  }

  public void destroyInstanceHelper(final TargetPerspectiveEditorView instance, final ContextManager contextManager) {
    TemplateUtil.cleanupTemplated(instance);
  }

  native static Div TargetPerspectiveEditorView_Div_groupSelectorDiv(TargetPerspectiveEditorView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.editor.TargetPerspectiveEditorView::groupSelectorDiv;
  }-*/;

  native static void TargetPerspectiveEditorView_Div_groupSelectorDiv(TargetPerspectiveEditorView instance, Div value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.editor.TargetPerspectiveEditorView::groupSelectorDiv = value;
  }-*/;

  native static Span TargetPerspectiveEditorView_Span_navGroupSelection(TargetPerspectiveEditorView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.editor.TargetPerspectiveEditorView::navGroupSelection;
  }-*/;

  native static void TargetPerspectiveEditorView_Span_navGroupSelection(TargetPerspectiveEditorView instance, Span value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.editor.TargetPerspectiveEditorView::navGroupSelection = value;
  }-*/;

  native static Span TargetPerspectiveEditorView_Span_perspectiveSelectorHelp(TargetPerspectiveEditorView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.editor.TargetPerspectiveEditorView::perspectiveSelectorHelp;
  }-*/;

  native static void TargetPerspectiveEditorView_Span_perspectiveSelectorHelp(TargetPerspectiveEditorView instance, Span value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.editor.TargetPerspectiveEditorView::perspectiveSelectorHelp = value;
  }-*/;

  native static UnorderedList TargetPerspectiveEditorView_UnorderedList_navGroupItems(TargetPerspectiveEditorView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.editor.TargetPerspectiveEditorView::navGroupItems;
  }-*/;

  native static void TargetPerspectiveEditorView_UnorderedList_navGroupItems(TargetPerspectiveEditorView instance, UnorderedList value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.editor.TargetPerspectiveEditorView::navGroupItems = value;
  }-*/;

  native static Span TargetPerspectiveEditorView_Span_navGroupSelectorHelp(TargetPerspectiveEditorView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.editor.TargetPerspectiveEditorView::navGroupSelectorHelp;
  }-*/;

  native static void TargetPerspectiveEditorView_Span_navGroupSelectorHelp(TargetPerspectiveEditorView instance, Span value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.editor.TargetPerspectiveEditorView::navGroupSelectorHelp = value;
  }-*/;

  native static Div TargetPerspectiveEditorView_Div_perspectiveSelectorDiv(TargetPerspectiveEditorView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.editor.TargetPerspectiveEditorView::perspectiveSelectorDiv;
  }-*/;

  native static void TargetPerspectiveEditorView_Div_perspectiveSelectorDiv(TargetPerspectiveEditorView instance, Div value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.editor.TargetPerspectiveEditorView::perspectiveSelectorDiv = value;
  }-*/;
}