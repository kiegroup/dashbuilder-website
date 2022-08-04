package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
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
import org.dashbuilder.client.navigation.widget.editor.NavItemDefaultEditorView;
import org.dashbuilder.client.navigation.widget.editor.NavItemEditor.View;
import org.dashbuilder.client.navigation.widget.editor.NavItemEditorView;
import org.jboss.errai.common.client.dom.Div;
import org.jboss.errai.common.client.dom.Input;
import org.jboss.errai.common.client.dom.Span;
import org.jboss.errai.common.client.dom.UnorderedList;
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

public class Type_factory__o_d_c_n_w_e_NavItemDefaultEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<NavItemDefaultEditorView> { public interface o_d_c_n_w_e_NavItemDefaultEditorViewTemplateResource extends Template, TemplateStyleSheet, ClientBundle { @Source("org/dashbuilder/client/navigation/widget/editor/NavItemDefaultEditorView.html") public TextResource getContents();
  @Source("org/dashbuilder/client/navigation/widget/editor/NavItemDefaultEditorView.css") @NotStrict public CssResource getStyle(); }
  public Type_factory__o_d_c_n_w_e_NavItemDefaultEditorView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(NavItemDefaultEditorView.class, "Type_factory__o_d_c_n_w_e_NavItemDefaultEditorView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { NavItemDefaultEditorView.class, NavItemEditorView.class, Object.class, IsElement.class, org.jboss.errai.common.client.api.IsElement.class, View.class, UberElement.class, HasPresenter.class });
  }

  public void init(final Context context) {
    ((o_d_c_n_w_e_NavItemDefaultEditorViewTemplateResource) GWT.create(o_d_c_n_w_e_NavItemDefaultEditorViewTemplateResource.class)).getStyle().ensureInjected();
  }

  public NavItemDefaultEditorView createInstance(final ContextManager contextManager) {
    final NavItemDefaultEditorView instance = new NavItemDefaultEditorView();
    setIncompleteInstance(instance);
    final Div NavItemDefaultEditorView_itemViewDiv = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavItemDefaultEditorView_itemViewDiv);
    NavItemDefaultEditorView_Div_itemViewDiv(instance, NavItemDefaultEditorView_itemViewDiv);
    final Span NavItemDefaultEditorView_itemMenuIcon = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavItemDefaultEditorView_itemMenuIcon);
    NavItemDefaultEditorView_Span_itemMenuIcon(instance, NavItemDefaultEditorView_itemMenuIcon);
    final Span NavItemDefaultEditorView_itemName = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavItemDefaultEditorView_itemName);
    NavItemDefaultEditorView_Span_itemName(instance, NavItemDefaultEditorView_itemName);
    final Span NavItemDefaultEditorView_itemConfirmIcon = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavItemDefaultEditorView_itemConfirmIcon);
    NavItemDefaultEditorView_Span_itemConfirmIcon(instance, NavItemDefaultEditorView_itemConfirmIcon);
    final Span NavItemDefaultEditorView_itemEditIcon = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavItemDefaultEditorView_itemEditIcon);
    NavItemDefaultEditorView_Span_itemEditIcon(instance, NavItemDefaultEditorView_itemEditIcon);
    final Input NavItemDefaultEditorView_itemNameInput = (Input) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Input__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavItemDefaultEditorView_itemNameInput);
    NavItemDefaultEditorView_Input_itemNameInput(instance, NavItemDefaultEditorView_itemNameInput);
    final Div NavItemDefaultEditorView_extraDiv = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavItemDefaultEditorView_extraDiv);
    NavItemDefaultEditorView_Div_extraDiv(instance, NavItemDefaultEditorView_extraDiv);
    final Div NavItemDefaultEditorView_itemEditDiv = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavItemDefaultEditorView_itemEditDiv);
    NavItemDefaultEditorView_Div_itemEditDiv(instance, NavItemDefaultEditorView_itemEditDiv);
    final Span NavItemDefaultEditorView_itemDeleteIcon = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavItemDefaultEditorView_itemDeleteIcon);
    NavItemDefaultEditorView_Span_itemDeleteIcon(instance, NavItemDefaultEditorView_itemDeleteIcon);
    final Span NavItemDefaultEditorView_itemIcon = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavItemDefaultEditorView_itemIcon);
    NavItemDefaultEditorView_Span_itemIcon(instance, NavItemDefaultEditorView_itemIcon);
    final Span NavItemDefaultEditorView_itemCancelIcon = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavItemDefaultEditorView_itemCancelIcon);
    NavItemDefaultEditorView_Span_itemCancelIcon(instance, NavItemDefaultEditorView_itemCancelIcon);
    final Div NavItemDefaultEditorView_childrenDiv = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavItemDefaultEditorView_childrenDiv);
    NavItemDefaultEditorView_Div_childrenDiv(instance, NavItemDefaultEditorView_childrenDiv);
    final UnorderedList NavItemDefaultEditorView_commandMenu = (UnorderedList) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_UnorderedList__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavItemDefaultEditorView_commandMenu);
    NavItemDefaultEditorView_UnorderedList_commandMenu(instance, NavItemDefaultEditorView_commandMenu);
    o_d_c_n_w_e_NavItemDefaultEditorViewTemplateResource templateForNavItemDefaultEditorView = GWT.create(o_d_c_n_w_e_NavItemDefaultEditorViewTemplateResource.class);
    Element parentElementForTemplateOfNavItemDefaultEditorView = TemplateUtil.getRootTemplateParentElement(templateForNavItemDefaultEditorView.getContents().getText(), "org/dashbuilder/client/navigation/widget/editor/NavItemDefaultEditorView.html", "");
    TemplateUtil.translateTemplate("org/dashbuilder/client/navigation/widget/editor/NavItemDefaultEditorView.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfNavItemDefaultEditorView));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfNavItemDefaultEditorView));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(13);
    dataFieldMetas.put("itemIcon", new DataFieldMeta());
    dataFieldMetas.put("itemMenuIcon", new DataFieldMeta());
    dataFieldMetas.put("itemEditIcon", new DataFieldMeta());
    dataFieldMetas.put("itemDeleteIcon", new DataFieldMeta());
    dataFieldMetas.put("itemConfirmIcon", new DataFieldMeta());
    dataFieldMetas.put("itemCancelIcon", new DataFieldMeta());
    dataFieldMetas.put("itemName", new DataFieldMeta());
    dataFieldMetas.put("itemNameInput", new DataFieldMeta());
    dataFieldMetas.put("extraDiv", new DataFieldMeta());
    dataFieldMetas.put("itemViewDiv", new DataFieldMeta());
    dataFieldMetas.put("itemEditDiv", new DataFieldMeta());
    dataFieldMetas.put("commandMenu", new DataFieldMeta());
    dataFieldMetas.put("childrenDiv", new DataFieldMeta());
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.editor.NavItemDefaultEditorView", "org/dashbuilder/client/navigation/widget/editor/NavItemDefaultEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavItemDefaultEditorView_Span_itemIcon(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "itemIcon");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.editor.NavItemDefaultEditorView", "org/dashbuilder/client/navigation/widget/editor/NavItemDefaultEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavItemDefaultEditorView_Span_itemMenuIcon(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "itemMenuIcon");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.editor.NavItemDefaultEditorView", "org/dashbuilder/client/navigation/widget/editor/NavItemDefaultEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavItemDefaultEditorView_Span_itemEditIcon(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "itemEditIcon");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.editor.NavItemDefaultEditorView", "org/dashbuilder/client/navigation/widget/editor/NavItemDefaultEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavItemDefaultEditorView_Span_itemDeleteIcon(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "itemDeleteIcon");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.editor.NavItemDefaultEditorView", "org/dashbuilder/client/navigation/widget/editor/NavItemDefaultEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavItemDefaultEditorView_Span_itemConfirmIcon(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "itemConfirmIcon");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.editor.NavItemDefaultEditorView", "org/dashbuilder/client/navigation/widget/editor/NavItemDefaultEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavItemDefaultEditorView_Span_itemCancelIcon(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "itemCancelIcon");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.editor.NavItemDefaultEditorView", "org/dashbuilder/client/navigation/widget/editor/NavItemDefaultEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavItemDefaultEditorView_Span_itemName(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "itemName");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.editor.NavItemDefaultEditorView", "org/dashbuilder/client/navigation/widget/editor/NavItemDefaultEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavItemDefaultEditorView_Input_itemNameInput(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "itemNameInput");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.editor.NavItemDefaultEditorView", "org/dashbuilder/client/navigation/widget/editor/NavItemDefaultEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavItemDefaultEditorView_Div_extraDiv(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "extraDiv");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.editor.NavItemDefaultEditorView", "org/dashbuilder/client/navigation/widget/editor/NavItemDefaultEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavItemDefaultEditorView_Div_itemViewDiv(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "itemViewDiv");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.editor.NavItemDefaultEditorView", "org/dashbuilder/client/navigation/widget/editor/NavItemDefaultEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavItemDefaultEditorView_Div_itemEditDiv(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "itemEditDiv");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.editor.NavItemDefaultEditorView", "org/dashbuilder/client/navigation/widget/editor/NavItemDefaultEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavItemDefaultEditorView_UnorderedList_commandMenu(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "commandMenu");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.editor.NavItemDefaultEditorView", "org/dashbuilder/client/navigation/widget/editor/NavItemDefaultEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavItemDefaultEditorView_Div_childrenDiv(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "childrenDiv");
    templateFieldsMap.put("itemIcon", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavItemDefaultEditorView_Span_itemIcon(instance))));
    templateFieldsMap.put("itemMenuIcon", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavItemDefaultEditorView_Span_itemMenuIcon(instance))));
    templateFieldsMap.put("itemEditIcon", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavItemDefaultEditorView_Span_itemEditIcon(instance))));
    templateFieldsMap.put("itemDeleteIcon", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavItemDefaultEditorView_Span_itemDeleteIcon(instance))));
    templateFieldsMap.put("itemConfirmIcon", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavItemDefaultEditorView_Span_itemConfirmIcon(instance))));
    templateFieldsMap.put("itemCancelIcon", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavItemDefaultEditorView_Span_itemCancelIcon(instance))));
    templateFieldsMap.put("itemName", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavItemDefaultEditorView_Span_itemName(instance))));
    templateFieldsMap.put("itemNameInput", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavItemDefaultEditorView_Input_itemNameInput(instance))));
    templateFieldsMap.put("extraDiv", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavItemDefaultEditorView_Div_extraDiv(instance))));
    templateFieldsMap.put("itemViewDiv", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavItemDefaultEditorView_Div_itemViewDiv(instance))));
    templateFieldsMap.put("itemEditDiv", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavItemDefaultEditorView_Div_itemEditDiv(instance))));
    templateFieldsMap.put("commandMenu", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavItemDefaultEditorView_UnorderedList_commandMenu(instance))));
    templateFieldsMap.put("childrenDiv", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavItemDefaultEditorView_Div_childrenDiv(instance))));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfNavItemDefaultEditorView), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("itemName"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onItemNameClick(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("itemDeleteIcon"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onItemDeleteClick(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("itemIcon"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onItemIconClick(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("itemEditIcon"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onItemEditClick(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("itemNameInput"), new MouseOverHandler() {
      public void onMouseOver(MouseOverEvent event) {
        instance.onItemNameInputOver(event);
      }
    }, MouseOverEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("itemCancelIcon"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onItemEditCancelClick(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("itemNameInput"), new KeyPressHandler() {
      public void onKeyPress(KeyPressEvent event) {
        instance.onItemNameChanged(event);
      }
    }, KeyPressEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("itemConfirmIcon"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onItemEditOkClick(event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((NavItemDefaultEditorView) instance, contextManager);
  }

  public void destroyInstanceHelper(final NavItemDefaultEditorView instance, final ContextManager contextManager) {
    TemplateUtil.cleanupTemplated(instance);
  }

  native static Span NavItemDefaultEditorView_Span_itemEditIcon(NavItemDefaultEditorView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.editor.NavItemDefaultEditorView::itemEditIcon;
  }-*/;

  native static void NavItemDefaultEditorView_Span_itemEditIcon(NavItemDefaultEditorView instance, Span value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.editor.NavItemDefaultEditorView::itemEditIcon = value;
  }-*/;

  native static Div NavItemDefaultEditorView_Div_itemViewDiv(NavItemDefaultEditorView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.editor.NavItemDefaultEditorView::itemViewDiv;
  }-*/;

  native static void NavItemDefaultEditorView_Div_itemViewDiv(NavItemDefaultEditorView instance, Div value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.editor.NavItemDefaultEditorView::itemViewDiv = value;
  }-*/;

  native static Span NavItemDefaultEditorView_Span_itemDeleteIcon(NavItemDefaultEditorView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.editor.NavItemDefaultEditorView::itemDeleteIcon;
  }-*/;

  native static void NavItemDefaultEditorView_Span_itemDeleteIcon(NavItemDefaultEditorView instance, Span value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.editor.NavItemDefaultEditorView::itemDeleteIcon = value;
  }-*/;

  native static UnorderedList NavItemDefaultEditorView_UnorderedList_commandMenu(NavItemDefaultEditorView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.editor.NavItemDefaultEditorView::commandMenu;
  }-*/;

  native static void NavItemDefaultEditorView_UnorderedList_commandMenu(NavItemDefaultEditorView instance, UnorderedList value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.editor.NavItemDefaultEditorView::commandMenu = value;
  }-*/;

  native static Span NavItemDefaultEditorView_Span_itemCancelIcon(NavItemDefaultEditorView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.editor.NavItemDefaultEditorView::itemCancelIcon;
  }-*/;

  native static void NavItemDefaultEditorView_Span_itemCancelIcon(NavItemDefaultEditorView instance, Span value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.editor.NavItemDefaultEditorView::itemCancelIcon = value;
  }-*/;

  native static Span NavItemDefaultEditorView_Span_itemName(NavItemDefaultEditorView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.editor.NavItemDefaultEditorView::itemName;
  }-*/;

  native static void NavItemDefaultEditorView_Span_itemName(NavItemDefaultEditorView instance, Span value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.editor.NavItemDefaultEditorView::itemName = value;
  }-*/;

  native static Input NavItemDefaultEditorView_Input_itemNameInput(NavItemDefaultEditorView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.editor.NavItemDefaultEditorView::itemNameInput;
  }-*/;

  native static void NavItemDefaultEditorView_Input_itemNameInput(NavItemDefaultEditorView instance, Input value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.editor.NavItemDefaultEditorView::itemNameInput = value;
  }-*/;

  native static Div NavItemDefaultEditorView_Div_itemEditDiv(NavItemDefaultEditorView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.editor.NavItemDefaultEditorView::itemEditDiv;
  }-*/;

  native static void NavItemDefaultEditorView_Div_itemEditDiv(NavItemDefaultEditorView instance, Div value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.editor.NavItemDefaultEditorView::itemEditDiv = value;
  }-*/;

  native static Div NavItemDefaultEditorView_Div_extraDiv(NavItemDefaultEditorView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.editor.NavItemDefaultEditorView::extraDiv;
  }-*/;

  native static void NavItemDefaultEditorView_Div_extraDiv(NavItemDefaultEditorView instance, Div value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.editor.NavItemDefaultEditorView::extraDiv = value;
  }-*/;

  native static Span NavItemDefaultEditorView_Span_itemConfirmIcon(NavItemDefaultEditorView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.editor.NavItemDefaultEditorView::itemConfirmIcon;
  }-*/;

  native static void NavItemDefaultEditorView_Span_itemConfirmIcon(NavItemDefaultEditorView instance, Span value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.editor.NavItemDefaultEditorView::itemConfirmIcon = value;
  }-*/;

  native static Div NavItemDefaultEditorView_Div_childrenDiv(NavItemDefaultEditorView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.editor.NavItemDefaultEditorView::childrenDiv;
  }-*/;

  native static void NavItemDefaultEditorView_Div_childrenDiv(NavItemDefaultEditorView instance, Div value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.editor.NavItemDefaultEditorView::childrenDiv = value;
  }-*/;

  native static Span NavItemDefaultEditorView_Span_itemIcon(NavItemDefaultEditorView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.editor.NavItemDefaultEditorView::itemIcon;
  }-*/;

  native static void NavItemDefaultEditorView_Span_itemIcon(NavItemDefaultEditorView instance, Span value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.editor.NavItemDefaultEditorView::itemIcon = value;
  }-*/;

  native static Span NavItemDefaultEditorView_Span_itemMenuIcon(NavItemDefaultEditorView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.editor.NavItemDefaultEditorView::itemMenuIcon;
  }-*/;

  native static void NavItemDefaultEditorView_Span_itemMenuIcon(NavItemDefaultEditorView instance, Span value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.editor.NavItemDefaultEditorView::itemMenuIcon = value;
  }-*/;
}