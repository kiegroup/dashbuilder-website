package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ClientBundle.Source;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.CssResource.NotStrict;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.EventListener;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.enterprise.context.Dependent;
import org.dashbuilder.client.navigation.widget.NavComponentConfigModal.View;
import org.dashbuilder.client.navigation.widget.NavComponentConfigModalView;
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

public class Type_factory__o_d_c_n_w_NavComponentConfigModalView__quals__j_e_i_Any_j_e_i_Default extends Factory<NavComponentConfigModalView> { public interface o_d_c_n_w_NavComponentConfigModalViewTemplateResource extends Template, TemplateStyleSheet, ClientBundle { @Source("org/dashbuilder/client/navigation/widget/NavComponentConfigModalView.html") public TextResource getContents();
  @Source("org/dashbuilder/client/navigation/widget/NavComponentConfigModalView.css") @NotStrict public CssResource getStyle(); }
  public Type_factory__o_d_c_n_w_NavComponentConfigModalView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(NavComponentConfigModalView.class, "Type_factory__o_d_c_n_w_NavComponentConfigModalView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { NavComponentConfigModalView.class, Object.class, View.class, UberView.class, IsWidget.class, HasPresenter.class });
  }

  public void init(final Context context) {
    ((o_d_c_n_w_NavComponentConfigModalViewTemplateResource) GWT.create(o_d_c_n_w_NavComponentConfigModalViewTemplateResource.class)).getStyle().ensureInjected();
  }

  public NavComponentConfigModalView createInstance(final ContextManager contextManager) {
    final NavComponentConfigModalView instance = new NavComponentConfigModalView();
    setIncompleteInstance(instance);
    final UnorderedList NavComponentConfigModalView_targetDivItems = (UnorderedList) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_UnorderedList__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavComponentConfigModalView_targetDivItems);
    NavComponentConfigModalView_UnorderedList_targetDivItems(instance, NavComponentConfigModalView_targetDivItems);
    final Div NavComponentConfigModalView_body = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavComponentConfigModalView_body);
    NavComponentConfigModalView_Div_body(instance, NavComponentConfigModalView_body);
    final Span NavComponentConfigModalView_defaultItemHelp = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavComponentConfigModalView_defaultItemHelp);
    NavComponentConfigModalView_Span_defaultItemHelp(instance, NavComponentConfigModalView_defaultItemHelp);
    final Div NavComponentConfigModalView_targetDivDiv = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavComponentConfigModalView_targetDivDiv);
    NavComponentConfigModalView_Div_targetDivDiv(instance, NavComponentConfigModalView_targetDivDiv);
    final Span NavComponentConfigModalView_navGroupLabel = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavComponentConfigModalView_navGroupLabel);
    NavComponentConfigModalView_Span_navGroupLabel(instance, NavComponentConfigModalView_navGroupLabel);
    final Span NavComponentConfigModalView_defaultItemSelection = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavComponentConfigModalView_defaultItemSelection);
    NavComponentConfigModalView_Span_defaultItemSelection(instance, NavComponentConfigModalView_defaultItemSelection);
    final Div NavComponentConfigModalView_navGroupDiv = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavComponentConfigModalView_navGroupDiv);
    NavComponentConfigModalView_Div_navGroupDiv(instance, NavComponentConfigModalView_navGroupDiv);
    final Span NavComponentConfigModalView_targetDivSelection = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavComponentConfigModalView_targetDivSelection);
    NavComponentConfigModalView_Span_targetDivSelection(instance, NavComponentConfigModalView_targetDivSelection);
    final Div NavComponentConfigModalView_defaultItemDiv = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavComponentConfigModalView_defaultItemDiv);
    NavComponentConfigModalView_Div_defaultItemDiv(instance, NavComponentConfigModalView_defaultItemDiv);
    final Span NavComponentConfigModalView_navGroupHelp = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavComponentConfigModalView_navGroupHelp);
    NavComponentConfigModalView_Span_navGroupHelp(instance, NavComponentConfigModalView_navGroupHelp);
    final UnorderedList NavComponentConfigModalView_navGroupItems = (UnorderedList) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_UnorderedList__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavComponentConfigModalView_navGroupItems);
    NavComponentConfigModalView_UnorderedList_navGroupItems(instance, NavComponentConfigModalView_navGroupItems);
    final Span NavComponentConfigModalView_targetDivHelp = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavComponentConfigModalView_targetDivHelp);
    NavComponentConfigModalView_Span_targetDivHelp(instance, NavComponentConfigModalView_targetDivHelp);
    final Div NavComponentConfigModalView_footer = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavComponentConfigModalView_footer);
    NavComponentConfigModalView_Div_footer(instance, NavComponentConfigModalView_footer);
    final Span NavComponentConfigModalView_navGroupSelection = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavComponentConfigModalView_navGroupSelection);
    NavComponentConfigModalView_Span_navGroupSelection(instance, NavComponentConfigModalView_navGroupSelection);
    final Span NavComponentConfigModalView_targetDivLabel = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavComponentConfigModalView_targetDivLabel);
    NavComponentConfigModalView_Span_targetDivLabel(instance, NavComponentConfigModalView_targetDivLabel);
    final UnorderedList NavComponentConfigModalView_defaultItems = (UnorderedList) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_UnorderedList__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavComponentConfigModalView_defaultItems);
    NavComponentConfigModalView_UnorderedList_defaultItems(instance, NavComponentConfigModalView_defaultItems);
    final Span NavComponentConfigModalView_defaultItemLabel = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavComponentConfigModalView_defaultItemLabel);
    NavComponentConfigModalView_Span_defaultItemLabel(instance, NavComponentConfigModalView_defaultItemLabel);
    o_d_c_n_w_NavComponentConfigModalViewTemplateResource templateForNavComponentConfigModalView = GWT.create(o_d_c_n_w_NavComponentConfigModalViewTemplateResource.class);
    Element parentElementForTemplateOfNavComponentConfigModalView = TemplateUtil.getRootTemplateParentElement(templateForNavComponentConfigModalView.getContents().getText(), "org/dashbuilder/client/navigation/widget/NavComponentConfigModalView.html", "");
    TemplateUtil.translateTemplate("org/dashbuilder/client/navigation/widget/NavComponentConfigModalView.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfNavComponentConfigModalView));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfNavComponentConfigModalView));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(17);
    dataFieldMetas.put("body", new DataFieldMeta());
    dataFieldMetas.put("footer", new DataFieldMeta());
    dataFieldMetas.put("navGroupDiv", new DataFieldMeta());
    dataFieldMetas.put("navGroupLabel", new DataFieldMeta());
    dataFieldMetas.put("navGroupHelp", new DataFieldMeta());
    dataFieldMetas.put("navGroupSelection", new DataFieldMeta());
    dataFieldMetas.put("navGroupItems", new DataFieldMeta());
    dataFieldMetas.put("defaultItemDiv", new DataFieldMeta());
    dataFieldMetas.put("defaultItemLabel", new DataFieldMeta());
    dataFieldMetas.put("defaultItemHelp", new DataFieldMeta());
    dataFieldMetas.put("defaultItemSelection", new DataFieldMeta());
    dataFieldMetas.put("defaultItems", new DataFieldMeta());
    dataFieldMetas.put("targetDivDiv", new DataFieldMeta());
    dataFieldMetas.put("targetDivLabel", new DataFieldMeta());
    dataFieldMetas.put("targetDivHelp", new DataFieldMeta());
    dataFieldMetas.put("targetDivSelection", new DataFieldMeta());
    dataFieldMetas.put("targetDivItems", new DataFieldMeta());
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.NavComponentConfigModalView", "org/dashbuilder/client/navigation/widget/NavComponentConfigModalView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavComponentConfigModalView_Div_body(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "body");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.NavComponentConfigModalView", "org/dashbuilder/client/navigation/widget/NavComponentConfigModalView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavComponentConfigModalView_Div_footer(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "footer");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.NavComponentConfigModalView", "org/dashbuilder/client/navigation/widget/NavComponentConfigModalView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavComponentConfigModalView_Div_navGroupDiv(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "navGroupDiv");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.NavComponentConfigModalView", "org/dashbuilder/client/navigation/widget/NavComponentConfigModalView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavComponentConfigModalView_Span_navGroupLabel(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "navGroupLabel");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.NavComponentConfigModalView", "org/dashbuilder/client/navigation/widget/NavComponentConfigModalView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavComponentConfigModalView_Span_navGroupHelp(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "navGroupHelp");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.NavComponentConfigModalView", "org/dashbuilder/client/navigation/widget/NavComponentConfigModalView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavComponentConfigModalView_Span_navGroupSelection(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "navGroupSelection");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.NavComponentConfigModalView", "org/dashbuilder/client/navigation/widget/NavComponentConfigModalView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavComponentConfigModalView_UnorderedList_navGroupItems(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "navGroupItems");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.NavComponentConfigModalView", "org/dashbuilder/client/navigation/widget/NavComponentConfigModalView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavComponentConfigModalView_Div_defaultItemDiv(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "defaultItemDiv");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.NavComponentConfigModalView", "org/dashbuilder/client/navigation/widget/NavComponentConfigModalView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavComponentConfigModalView_Span_defaultItemLabel(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "defaultItemLabel");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.NavComponentConfigModalView", "org/dashbuilder/client/navigation/widget/NavComponentConfigModalView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavComponentConfigModalView_Span_defaultItemHelp(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "defaultItemHelp");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.NavComponentConfigModalView", "org/dashbuilder/client/navigation/widget/NavComponentConfigModalView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavComponentConfigModalView_Span_defaultItemSelection(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "defaultItemSelection");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.NavComponentConfigModalView", "org/dashbuilder/client/navigation/widget/NavComponentConfigModalView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavComponentConfigModalView_UnorderedList_defaultItems(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "defaultItems");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.NavComponentConfigModalView", "org/dashbuilder/client/navigation/widget/NavComponentConfigModalView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavComponentConfigModalView_Div_targetDivDiv(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "targetDivDiv");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.NavComponentConfigModalView", "org/dashbuilder/client/navigation/widget/NavComponentConfigModalView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavComponentConfigModalView_Span_targetDivLabel(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "targetDivLabel");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.NavComponentConfigModalView", "org/dashbuilder/client/navigation/widget/NavComponentConfigModalView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavComponentConfigModalView_Span_targetDivHelp(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "targetDivHelp");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.NavComponentConfigModalView", "org/dashbuilder/client/navigation/widget/NavComponentConfigModalView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavComponentConfigModalView_Span_targetDivSelection(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "targetDivSelection");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.NavComponentConfigModalView", "org/dashbuilder/client/navigation/widget/NavComponentConfigModalView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavComponentConfigModalView_UnorderedList_targetDivItems(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "targetDivItems");
    templateFieldsMap.put("body", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavComponentConfigModalView_Div_body(instance))));
    templateFieldsMap.put("footer", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavComponentConfigModalView_Div_footer(instance))));
    templateFieldsMap.put("navGroupDiv", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavComponentConfigModalView_Div_navGroupDiv(instance))));
    templateFieldsMap.put("navGroupLabel", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavComponentConfigModalView_Span_navGroupLabel(instance))));
    templateFieldsMap.put("navGroupHelp", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavComponentConfigModalView_Span_navGroupHelp(instance))));
    templateFieldsMap.put("navGroupSelection", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavComponentConfigModalView_Span_navGroupSelection(instance))));
    templateFieldsMap.put("navGroupItems", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavComponentConfigModalView_UnorderedList_navGroupItems(instance))));
    templateFieldsMap.put("defaultItemDiv", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavComponentConfigModalView_Div_defaultItemDiv(instance))));
    templateFieldsMap.put("defaultItemLabel", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavComponentConfigModalView_Span_defaultItemLabel(instance))));
    templateFieldsMap.put("defaultItemHelp", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavComponentConfigModalView_Span_defaultItemHelp(instance))));
    templateFieldsMap.put("defaultItemSelection", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavComponentConfigModalView_Span_defaultItemSelection(instance))));
    templateFieldsMap.put("defaultItems", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavComponentConfigModalView_UnorderedList_defaultItems(instance))));
    templateFieldsMap.put("targetDivDiv", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavComponentConfigModalView_Div_targetDivDiv(instance))));
    templateFieldsMap.put("targetDivLabel", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavComponentConfigModalView_Span_targetDivLabel(instance))));
    templateFieldsMap.put("targetDivHelp", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavComponentConfigModalView_Span_targetDivHelp(instance))));
    templateFieldsMap.put("targetDivSelection", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavComponentConfigModalView_Span_targetDivSelection(instance))));
    templateFieldsMap.put("targetDivItems", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavComponentConfigModalView_UnorderedList_targetDivItems(instance))));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfNavComponentConfigModalView), templateFieldsMap.values());
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
    destroyInstanceHelper((NavComponentConfigModalView) instance, contextManager);
  }

  public void destroyInstanceHelper(final NavComponentConfigModalView instance, final ContextManager contextManager) {
    TemplateUtil.cleanupTemplated(instance);
  }

  native static UnorderedList NavComponentConfigModalView_UnorderedList_navGroupItems(NavComponentConfigModalView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.NavComponentConfigModalView::navGroupItems;
  }-*/;

  native static void NavComponentConfigModalView_UnorderedList_navGroupItems(NavComponentConfigModalView instance, UnorderedList value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.NavComponentConfigModalView::navGroupItems = value;
  }-*/;

  native static Span NavComponentConfigModalView_Span_targetDivSelection(NavComponentConfigModalView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.NavComponentConfigModalView::targetDivSelection;
  }-*/;

  native static void NavComponentConfigModalView_Span_targetDivSelection(NavComponentConfigModalView instance, Span value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.NavComponentConfigModalView::targetDivSelection = value;
  }-*/;

  native static Span NavComponentConfigModalView_Span_navGroupSelection(NavComponentConfigModalView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.NavComponentConfigModalView::navGroupSelection;
  }-*/;

  native static void NavComponentConfigModalView_Span_navGroupSelection(NavComponentConfigModalView instance, Span value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.NavComponentConfigModalView::navGroupSelection = value;
  }-*/;

  native static Span NavComponentConfigModalView_Span_navGroupLabel(NavComponentConfigModalView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.NavComponentConfigModalView::navGroupLabel;
  }-*/;

  native static void NavComponentConfigModalView_Span_navGroupLabel(NavComponentConfigModalView instance, Span value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.NavComponentConfigModalView::navGroupLabel = value;
  }-*/;

  native static Span NavComponentConfigModalView_Span_defaultItemLabel(NavComponentConfigModalView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.NavComponentConfigModalView::defaultItemLabel;
  }-*/;

  native static void NavComponentConfigModalView_Span_defaultItemLabel(NavComponentConfigModalView instance, Span value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.NavComponentConfigModalView::defaultItemLabel = value;
  }-*/;

  native static Div NavComponentConfigModalView_Div_body(NavComponentConfigModalView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.NavComponentConfigModalView::body;
  }-*/;

  native static void NavComponentConfigModalView_Div_body(NavComponentConfigModalView instance, Div value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.NavComponentConfigModalView::body = value;
  }-*/;

  native static Span NavComponentConfigModalView_Span_defaultItemHelp(NavComponentConfigModalView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.NavComponentConfigModalView::defaultItemHelp;
  }-*/;

  native static void NavComponentConfigModalView_Span_defaultItemHelp(NavComponentConfigModalView instance, Span value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.NavComponentConfigModalView::defaultItemHelp = value;
  }-*/;

  native static Span NavComponentConfigModalView_Span_targetDivLabel(NavComponentConfigModalView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.NavComponentConfigModalView::targetDivLabel;
  }-*/;

  native static void NavComponentConfigModalView_Span_targetDivLabel(NavComponentConfigModalView instance, Span value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.NavComponentConfigModalView::targetDivLabel = value;
  }-*/;

  native static Span NavComponentConfigModalView_Span_navGroupHelp(NavComponentConfigModalView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.NavComponentConfigModalView::navGroupHelp;
  }-*/;

  native static void NavComponentConfigModalView_Span_navGroupHelp(NavComponentConfigModalView instance, Span value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.NavComponentConfigModalView::navGroupHelp = value;
  }-*/;

  native static UnorderedList NavComponentConfigModalView_UnorderedList_defaultItems(NavComponentConfigModalView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.NavComponentConfigModalView::defaultItems;
  }-*/;

  native static void NavComponentConfigModalView_UnorderedList_defaultItems(NavComponentConfigModalView instance, UnorderedList value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.NavComponentConfigModalView::defaultItems = value;
  }-*/;

  native static Span NavComponentConfigModalView_Span_targetDivHelp(NavComponentConfigModalView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.NavComponentConfigModalView::targetDivHelp;
  }-*/;

  native static void NavComponentConfigModalView_Span_targetDivHelp(NavComponentConfigModalView instance, Span value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.NavComponentConfigModalView::targetDivHelp = value;
  }-*/;

  native static Div NavComponentConfigModalView_Div_footer(NavComponentConfigModalView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.NavComponentConfigModalView::footer;
  }-*/;

  native static void NavComponentConfigModalView_Div_footer(NavComponentConfigModalView instance, Div value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.NavComponentConfigModalView::footer = value;
  }-*/;

  native static Div NavComponentConfigModalView_Div_defaultItemDiv(NavComponentConfigModalView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.NavComponentConfigModalView::defaultItemDiv;
  }-*/;

  native static void NavComponentConfigModalView_Div_defaultItemDiv(NavComponentConfigModalView instance, Div value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.NavComponentConfigModalView::defaultItemDiv = value;
  }-*/;

  native static UnorderedList NavComponentConfigModalView_UnorderedList_targetDivItems(NavComponentConfigModalView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.NavComponentConfigModalView::targetDivItems;
  }-*/;

  native static void NavComponentConfigModalView_UnorderedList_targetDivItems(NavComponentConfigModalView instance, UnorderedList value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.NavComponentConfigModalView::targetDivItems = value;
  }-*/;

  native static Div NavComponentConfigModalView_Div_navGroupDiv(NavComponentConfigModalView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.NavComponentConfigModalView::navGroupDiv;
  }-*/;

  native static void NavComponentConfigModalView_Div_navGroupDiv(NavComponentConfigModalView instance, Div value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.NavComponentConfigModalView::navGroupDiv = value;
  }-*/;

  native static Span NavComponentConfigModalView_Span_defaultItemSelection(NavComponentConfigModalView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.NavComponentConfigModalView::defaultItemSelection;
  }-*/;

  native static void NavComponentConfigModalView_Span_defaultItemSelection(NavComponentConfigModalView instance, Span value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.NavComponentConfigModalView::defaultItemSelection = value;
  }-*/;

  native static Div NavComponentConfigModalView_Div_targetDivDiv(NavComponentConfigModalView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.NavComponentConfigModalView::targetDivDiv;
  }-*/;

  native static void NavComponentConfigModalView_Div_targetDivDiv(NavComponentConfigModalView instance, Div value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.NavComponentConfigModalView::targetDivDiv = value;
  }-*/;
}