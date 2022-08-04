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
import org.dashbuilder.client.navigation.widget.editor.NavItemEditor.View;
import org.dashbuilder.client.navigation.widget.editor.NavItemEditorView;
import org.dashbuilder.client.navigation.widget.editor.NavRootNodeEditorView;
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

public class Type_factory__o_d_c_n_w_e_NavRootNodeEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<NavRootNodeEditorView> { public interface o_d_c_n_w_e_NavRootNodeEditorViewTemplateResource extends Template, TemplateStyleSheet, ClientBundle { @Source("org/dashbuilder/client/navigation/widget/editor/NavRootNodeEditorView.html") public TextResource getContents();
  @Source("org/dashbuilder/client/navigation/widget/editor/NavRootNodeEditorView.css") @NotStrict public CssResource getStyle(); }
  public Type_factory__o_d_c_n_w_e_NavRootNodeEditorView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(NavRootNodeEditorView.class, "Type_factory__o_d_c_n_w_e_NavRootNodeEditorView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { NavRootNodeEditorView.class, NavItemEditorView.class, Object.class, IsElement.class, org.jboss.errai.common.client.api.IsElement.class, View.class, UberElement.class, HasPresenter.class, org.dashbuilder.client.navigation.widget.editor.NavRootNodeEditor.View.class });
  }

  public void init(final Context context) {
    ((o_d_c_n_w_e_NavRootNodeEditorViewTemplateResource) GWT.create(o_d_c_n_w_e_NavRootNodeEditorViewTemplateResource.class)).getStyle().ensureInjected();
  }

  public NavRootNodeEditorView createInstance(final ContextManager contextManager) {
    final NavRootNodeEditorView instance = new NavRootNodeEditorView();
    setIncompleteInstance(instance);
    final Span NavRootNodeEditorView_itemDeleteIcon = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavRootNodeEditorView_itemDeleteIcon);
    NavRootNodeEditorView_Span_itemDeleteIcon(instance, NavRootNodeEditorView_itemDeleteIcon);
    final Span NavRootNodeEditorView_itemName = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavRootNodeEditorView_itemName);
    NavRootNodeEditorView_Span_itemName(instance, NavRootNodeEditorView_itemName);
    final Span NavRootNodeEditorView_itemCancelIcon = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavRootNodeEditorView_itemCancelIcon);
    NavRootNodeEditorView_Span_itemCancelIcon(instance, NavRootNodeEditorView_itemCancelIcon);
    final Input NavRootNodeEditorView_itemNameInput = (Input) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Input__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavRootNodeEditorView_itemNameInput);
    NavRootNodeEditorView_Input_itemNameInput(instance, NavRootNodeEditorView_itemNameInput);
    final Span NavRootNodeEditorView_itemMenuIcon = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavRootNodeEditorView_itemMenuIcon);
    NavRootNodeEditorView_Span_itemMenuIcon(instance, NavRootNodeEditorView_itemMenuIcon);
    final Span NavRootNodeEditorView_itemConfirmIcon = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavRootNodeEditorView_itemConfirmIcon);
    NavRootNodeEditorView_Span_itemConfirmIcon(instance, NavRootNodeEditorView_itemConfirmIcon);
    final Div NavRootNodeEditorView_childrenDiv = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavRootNodeEditorView_childrenDiv);
    NavRootNodeEditorView_Div_childrenDiv(instance, NavRootNodeEditorView_childrenDiv);
    final Div NavRootNodeEditorView_itemEditDiv = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavRootNodeEditorView_itemEditDiv);
    NavRootNodeEditorView_Div_itemEditDiv(instance, NavRootNodeEditorView_itemEditDiv);
    final Span NavRootNodeEditorView_itemIcon = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavRootNodeEditorView_itemIcon);
    NavRootNodeEditorView_Span_itemIcon(instance, NavRootNodeEditorView_itemIcon);
    final Div NavRootNodeEditorView_itemViewDiv = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavRootNodeEditorView_itemViewDiv);
    NavRootNodeEditorView_Div_itemViewDiv(instance, NavRootNodeEditorView_itemViewDiv);
    final Span NavRootNodeEditorView_itemEditIcon = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavRootNodeEditorView_itemEditIcon);
    NavRootNodeEditorView_Span_itemEditIcon(instance, NavRootNodeEditorView_itemEditIcon);
    final Div NavRootNodeEditorView_extraDiv = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavRootNodeEditorView_extraDiv);
    NavRootNodeEditorView_Div_extraDiv(instance, NavRootNodeEditorView_extraDiv);
    final UnorderedList NavRootNodeEditorView_commandMenu = (UnorderedList) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_UnorderedList__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavRootNodeEditorView_commandMenu);
    NavRootNodeEditorView_UnorderedList_commandMenu(instance, NavRootNodeEditorView_commandMenu);
    o_d_c_n_w_e_NavRootNodeEditorViewTemplateResource templateForNavRootNodeEditorView = GWT.create(o_d_c_n_w_e_NavRootNodeEditorViewTemplateResource.class);
    Element parentElementForTemplateOfNavRootNodeEditorView = TemplateUtil.getRootTemplateParentElement(templateForNavRootNodeEditorView.getContents().getText(), "org/dashbuilder/client/navigation/widget/editor/NavRootNodeEditorView.html", "");
    TemplateUtil.translateTemplate("org/dashbuilder/client/navigation/widget/editor/NavRootNodeEditorView.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfNavRootNodeEditorView));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfNavRootNodeEditorView));
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
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.editor.NavRootNodeEditorView", "org/dashbuilder/client/navigation/widget/editor/NavRootNodeEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavRootNodeEditorView_Span_itemIcon(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "itemIcon");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.editor.NavRootNodeEditorView", "org/dashbuilder/client/navigation/widget/editor/NavRootNodeEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavRootNodeEditorView_Span_itemMenuIcon(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "itemMenuIcon");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.editor.NavRootNodeEditorView", "org/dashbuilder/client/navigation/widget/editor/NavRootNodeEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavRootNodeEditorView_Span_itemEditIcon(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "itemEditIcon");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.editor.NavRootNodeEditorView", "org/dashbuilder/client/navigation/widget/editor/NavRootNodeEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavRootNodeEditorView_Span_itemDeleteIcon(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "itemDeleteIcon");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.editor.NavRootNodeEditorView", "org/dashbuilder/client/navigation/widget/editor/NavRootNodeEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavRootNodeEditorView_Span_itemConfirmIcon(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "itemConfirmIcon");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.editor.NavRootNodeEditorView", "org/dashbuilder/client/navigation/widget/editor/NavRootNodeEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavRootNodeEditorView_Span_itemCancelIcon(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "itemCancelIcon");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.editor.NavRootNodeEditorView", "org/dashbuilder/client/navigation/widget/editor/NavRootNodeEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavRootNodeEditorView_Span_itemName(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "itemName");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.editor.NavRootNodeEditorView", "org/dashbuilder/client/navigation/widget/editor/NavRootNodeEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavRootNodeEditorView_Input_itemNameInput(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "itemNameInput");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.editor.NavRootNodeEditorView", "org/dashbuilder/client/navigation/widget/editor/NavRootNodeEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavRootNodeEditorView_Div_extraDiv(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "extraDiv");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.editor.NavRootNodeEditorView", "org/dashbuilder/client/navigation/widget/editor/NavRootNodeEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavRootNodeEditorView_Div_itemViewDiv(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "itemViewDiv");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.editor.NavRootNodeEditorView", "org/dashbuilder/client/navigation/widget/editor/NavRootNodeEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavRootNodeEditorView_Div_itemEditDiv(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "itemEditDiv");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.editor.NavRootNodeEditorView", "org/dashbuilder/client/navigation/widget/editor/NavRootNodeEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavRootNodeEditorView_UnorderedList_commandMenu(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "commandMenu");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.editor.NavRootNodeEditorView", "org/dashbuilder/client/navigation/widget/editor/NavRootNodeEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavRootNodeEditorView_Div_childrenDiv(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "childrenDiv");
    templateFieldsMap.put("itemIcon", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavRootNodeEditorView_Span_itemIcon(instance))));
    templateFieldsMap.put("itemMenuIcon", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavRootNodeEditorView_Span_itemMenuIcon(instance))));
    templateFieldsMap.put("itemEditIcon", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavRootNodeEditorView_Span_itemEditIcon(instance))));
    templateFieldsMap.put("itemDeleteIcon", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavRootNodeEditorView_Span_itemDeleteIcon(instance))));
    templateFieldsMap.put("itemConfirmIcon", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavRootNodeEditorView_Span_itemConfirmIcon(instance))));
    templateFieldsMap.put("itemCancelIcon", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavRootNodeEditorView_Span_itemCancelIcon(instance))));
    templateFieldsMap.put("itemName", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavRootNodeEditorView_Span_itemName(instance))));
    templateFieldsMap.put("itemNameInput", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavRootNodeEditorView_Input_itemNameInput(instance))));
    templateFieldsMap.put("extraDiv", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavRootNodeEditorView_Div_extraDiv(instance))));
    templateFieldsMap.put("itemViewDiv", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavRootNodeEditorView_Div_itemViewDiv(instance))));
    templateFieldsMap.put("itemEditDiv", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavRootNodeEditorView_Div_itemEditDiv(instance))));
    templateFieldsMap.put("commandMenu", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavRootNodeEditorView_UnorderedList_commandMenu(instance))));
    templateFieldsMap.put("childrenDiv", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavRootNodeEditorView_Div_childrenDiv(instance))));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfNavRootNodeEditorView), templateFieldsMap.values());
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
    destroyInstanceHelper((NavRootNodeEditorView) instance, contextManager);
  }

  public void destroyInstanceHelper(final NavRootNodeEditorView instance, final ContextManager contextManager) {
    TemplateUtil.cleanupTemplated(instance);
  }

  native static Span NavRootNodeEditorView_Span_itemIcon(NavRootNodeEditorView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.editor.NavRootNodeEditorView::itemIcon;
  }-*/;

  native static void NavRootNodeEditorView_Span_itemIcon(NavRootNodeEditorView instance, Span value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.editor.NavRootNodeEditorView::itemIcon = value;
  }-*/;

  native static Span NavRootNodeEditorView_Span_itemMenuIcon(NavRootNodeEditorView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.editor.NavRootNodeEditorView::itemMenuIcon;
  }-*/;

  native static void NavRootNodeEditorView_Span_itemMenuIcon(NavRootNodeEditorView instance, Span value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.editor.NavRootNodeEditorView::itemMenuIcon = value;
  }-*/;

  native static Span NavRootNodeEditorView_Span_itemName(NavRootNodeEditorView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.editor.NavRootNodeEditorView::itemName;
  }-*/;

  native static void NavRootNodeEditorView_Span_itemName(NavRootNodeEditorView instance, Span value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.editor.NavRootNodeEditorView::itemName = value;
  }-*/;

  native static Div NavRootNodeEditorView_Div_itemEditDiv(NavRootNodeEditorView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.editor.NavRootNodeEditorView::itemEditDiv;
  }-*/;

  native static void NavRootNodeEditorView_Div_itemEditDiv(NavRootNodeEditorView instance, Div value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.editor.NavRootNodeEditorView::itemEditDiv = value;
  }-*/;

  native static Div NavRootNodeEditorView_Div_itemViewDiv(NavRootNodeEditorView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.editor.NavRootNodeEditorView::itemViewDiv;
  }-*/;

  native static void NavRootNodeEditorView_Div_itemViewDiv(NavRootNodeEditorView instance, Div value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.editor.NavRootNodeEditorView::itemViewDiv = value;
  }-*/;

  native static Div NavRootNodeEditorView_Div_extraDiv(NavRootNodeEditorView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.editor.NavRootNodeEditorView::extraDiv;
  }-*/;

  native static void NavRootNodeEditorView_Div_extraDiv(NavRootNodeEditorView instance, Div value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.editor.NavRootNodeEditorView::extraDiv = value;
  }-*/;

  native static Span NavRootNodeEditorView_Span_itemDeleteIcon(NavRootNodeEditorView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.editor.NavRootNodeEditorView::itemDeleteIcon;
  }-*/;

  native static void NavRootNodeEditorView_Span_itemDeleteIcon(NavRootNodeEditorView instance, Span value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.editor.NavRootNodeEditorView::itemDeleteIcon = value;
  }-*/;

  native static Div NavRootNodeEditorView_Div_childrenDiv(NavRootNodeEditorView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.editor.NavRootNodeEditorView::childrenDiv;
  }-*/;

  native static void NavRootNodeEditorView_Div_childrenDiv(NavRootNodeEditorView instance, Div value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.editor.NavRootNodeEditorView::childrenDiv = value;
  }-*/;

  native static Span NavRootNodeEditorView_Span_itemCancelIcon(NavRootNodeEditorView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.editor.NavRootNodeEditorView::itemCancelIcon;
  }-*/;

  native static void NavRootNodeEditorView_Span_itemCancelIcon(NavRootNodeEditorView instance, Span value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.editor.NavRootNodeEditorView::itemCancelIcon = value;
  }-*/;

  native static Span NavRootNodeEditorView_Span_itemConfirmIcon(NavRootNodeEditorView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.editor.NavRootNodeEditorView::itemConfirmIcon;
  }-*/;

  native static void NavRootNodeEditorView_Span_itemConfirmIcon(NavRootNodeEditorView instance, Span value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.editor.NavRootNodeEditorView::itemConfirmIcon = value;
  }-*/;

  native static Input NavRootNodeEditorView_Input_itemNameInput(NavRootNodeEditorView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.editor.NavRootNodeEditorView::itemNameInput;
  }-*/;

  native static void NavRootNodeEditorView_Input_itemNameInput(NavRootNodeEditorView instance, Input value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.editor.NavRootNodeEditorView::itemNameInput = value;
  }-*/;

  native static Span NavRootNodeEditorView_Span_itemEditIcon(NavRootNodeEditorView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.editor.NavRootNodeEditorView::itemEditIcon;
  }-*/;

  native static void NavRootNodeEditorView_Span_itemEditIcon(NavRootNodeEditorView instance, Span value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.editor.NavRootNodeEditorView::itemEditIcon = value;
  }-*/;

  native static UnorderedList NavRootNodeEditorView_UnorderedList_commandMenu(NavRootNodeEditorView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.editor.NavRootNodeEditorView::commandMenu;
  }-*/;

  native static void NavRootNodeEditorView_UnorderedList_commandMenu(NavRootNodeEditorView instance, UnorderedList value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.editor.NavRootNodeEditorView::commandMenu = value;
  }-*/;
}