package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.logical.shared.HasAttachHandlers;
import com.google.gwt.event.shared.HasHandlers;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ClientBundle.Source;
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
import org.dashbuilder.client.navigation.widget.BaseNavWidgetView;
import org.dashbuilder.client.navigation.widget.NavDropDownWidget.View;
import org.dashbuilder.client.navigation.widget.NavDropDownWidgetView;
import org.dashbuilder.client.navigation.widget.NavWidgetView;
import org.jboss.errai.common.client.dom.Anchor;
import org.jboss.errai.common.client.dom.ListItem;
import org.jboss.errai.common.client.dom.Span;
import org.jboss.errai.common.client.dom.UnorderedList;
import org.jboss.errai.common.client.ui.ElementWrapperWidget;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ui.shared.DataFieldMeta;
import org.jboss.errai.ui.shared.Template;
import org.jboss.errai.ui.shared.TemplateUtil;
import org.jboss.errai.ui.shared.api.style.StyleBindingsRegistry;
import org.uberfire.client.mvp.HasPresenter;
import org.uberfire.client.mvp.UberView;

public class Type_factory__o_d_c_n_w_NavDropDownWidgetView__quals__j_e_i_Any_j_e_i_Default extends Factory<NavDropDownWidgetView> { public interface o_d_c_n_w_NavDropDownWidgetViewTemplateResource extends Template, ClientBundle { @Source("org/dashbuilder/client/navigation/widget/NavDropDownWidgetView.html") public TextResource getContents(); }
  public Type_factory__o_d_c_n_w_NavDropDownWidgetView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(NavDropDownWidgetView.class, "Type_factory__o_d_c_n_w_NavDropDownWidgetView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { NavDropDownWidgetView.class, BaseNavWidgetView.class, Composite.class, Widget.class, UIObject.class, Object.class, HasVisibility.class, EventListener.class, HasAttachHandlers.class, HasHandlers.class, IsWidget.class, IsRenderable.class, NavWidgetView.class, UberView.class, HasPresenter.class, View.class });
  }

  public NavDropDownWidgetView createInstance(final ContextManager contextManager) {
    final NavDropDownWidgetView instance = new NavDropDownWidgetView();
    setIncompleteInstance(instance);
    final ListItem NavDropDownWidgetView_dropDownItem = (ListItem) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_ListItem__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavDropDownWidgetView_dropDownItem);
    NavDropDownWidgetView_ListItem_dropDownItem(instance, NavDropDownWidgetView_dropDownItem);
    final Anchor NavDropDownWidgetView_dropDownAnchor = (Anchor) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Anchor__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavDropDownWidgetView_dropDownAnchor);
    NavDropDownWidgetView_Anchor_dropDownAnchor(instance, NavDropDownWidgetView_dropDownAnchor);
    final Span NavDropDownWidgetView_dropDownName = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavDropDownWidgetView_dropDownName);
    NavDropDownWidgetView_Span_dropDownName(instance, NavDropDownWidgetView_dropDownName);
    final UnorderedList NavDropDownWidgetView_dropDownMenu = (UnorderedList) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_UnorderedList__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, NavDropDownWidgetView_dropDownMenu);
    NavDropDownWidgetView_UnorderedList_dropDownMenu(instance, NavDropDownWidgetView_dropDownMenu);
    o_d_c_n_w_NavDropDownWidgetViewTemplateResource templateForNavDropDownWidgetView = GWT.create(o_d_c_n_w_NavDropDownWidgetViewTemplateResource.class);
    Element parentElementForTemplateOfNavDropDownWidgetView = TemplateUtil.getRootTemplateParentElement(templateForNavDropDownWidgetView.getContents().getText(), "org/dashbuilder/client/navigation/widget/NavDropDownWidgetView.html", "");
    TemplateUtil.translateTemplate("org/dashbuilder/client/navigation/widget/NavDropDownWidgetView.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfNavDropDownWidgetView));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfNavDropDownWidgetView));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(4);
    dataFieldMetas.put("dropDownItem", new DataFieldMeta());
    dataFieldMetas.put("dropDownAnchor", new DataFieldMeta());
    dataFieldMetas.put("dropDownName", new DataFieldMeta());
    dataFieldMetas.put("dropDownMenu", new DataFieldMeta());
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.NavDropDownWidgetView", "org/dashbuilder/client/navigation/widget/NavDropDownWidgetView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavDropDownWidgetView_ListItem_dropDownItem(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "dropDownItem");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.NavDropDownWidgetView", "org/dashbuilder/client/navigation/widget/NavDropDownWidgetView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavDropDownWidgetView_Anchor_dropDownAnchor(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "dropDownAnchor");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.NavDropDownWidgetView", "org/dashbuilder/client/navigation/widget/NavDropDownWidgetView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavDropDownWidgetView_Span_dropDownName(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "dropDownName");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navigation.widget.NavDropDownWidgetView", "org/dashbuilder/client/navigation/widget/NavDropDownWidgetView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavDropDownWidgetView_UnorderedList_dropDownMenu(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "dropDownMenu");
    templateFieldsMap.put("dropDownItem", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavDropDownWidgetView_ListItem_dropDownItem(instance))));
    templateFieldsMap.put("dropDownAnchor", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavDropDownWidgetView_Anchor_dropDownAnchor(instance))));
    templateFieldsMap.put("dropDownName", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavDropDownWidgetView_Span_dropDownName(instance))));
    templateFieldsMap.put("dropDownMenu", ElementWrapperWidget.getWidget(TemplateUtil.asElement(NavDropDownWidgetView_UnorderedList_dropDownMenu(instance))));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfNavDropDownWidgetView), templateFieldsMap.values());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((NavDropDownWidgetView) instance, contextManager);
  }

  public void destroyInstanceHelper(final NavDropDownWidgetView instance, final ContextManager contextManager) {
    TemplateUtil.cleanupWidget(instance);
  }

  native static ListItem NavDropDownWidgetView_ListItem_dropDownItem(NavDropDownWidgetView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.NavDropDownWidgetView::dropDownItem;
  }-*/;

  native static void NavDropDownWidgetView_ListItem_dropDownItem(NavDropDownWidgetView instance, ListItem value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.NavDropDownWidgetView::dropDownItem = value;
  }-*/;

  native static Anchor NavDropDownWidgetView_Anchor_dropDownAnchor(NavDropDownWidgetView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.NavDropDownWidgetView::dropDownAnchor;
  }-*/;

  native static void NavDropDownWidgetView_Anchor_dropDownAnchor(NavDropDownWidgetView instance, Anchor value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.NavDropDownWidgetView::dropDownAnchor = value;
  }-*/;

  native static UnorderedList NavDropDownWidgetView_UnorderedList_dropDownMenu(NavDropDownWidgetView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.NavDropDownWidgetView::dropDownMenu;
  }-*/;

  native static void NavDropDownWidgetView_UnorderedList_dropDownMenu(NavDropDownWidgetView instance, UnorderedList value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.NavDropDownWidgetView::dropDownMenu = value;
  }-*/;

  native static Span NavDropDownWidgetView_Span_dropDownName(NavDropDownWidgetView instance) /*-{
    return instance.@org.dashbuilder.client.navigation.widget.NavDropDownWidgetView::dropDownName;
  }-*/;

  native static void NavDropDownWidgetView_Span_dropDownName(NavDropDownWidgetView instance, Span value) /*-{
    instance.@org.dashbuilder.client.navigation.widget.NavDropDownWidgetView::dropDownName = value;
  }-*/;
}