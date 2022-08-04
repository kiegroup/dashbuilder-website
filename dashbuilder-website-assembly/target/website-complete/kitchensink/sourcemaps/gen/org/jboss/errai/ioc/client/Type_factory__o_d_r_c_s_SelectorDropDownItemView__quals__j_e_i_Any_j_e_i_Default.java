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
import org.dashbuilder.renderer.client.selector.SelectorDropDownItem.View;
import org.dashbuilder.renderer.client.selector.SelectorDropDownItemView;
import org.dashbuilder.renderer.client.selector.SelectorItemView;
import org.jboss.errai.common.client.api.IsElement;
import org.jboss.errai.common.client.dom.Anchor;
import org.jboss.errai.common.client.dom.ListItem;
import org.jboss.errai.common.client.dom.Span;
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

public class Type_factory__o_d_r_c_s_SelectorDropDownItemView__quals__j_e_i_Any_j_e_i_Default extends Factory<SelectorDropDownItemView> { public interface o_d_r_c_s_SelectorDropDownItemViewTemplateResource extends Template, TemplateStyleSheet, ClientBundle { @Source("org/dashbuilder/renderer/client/selector/SelectorDropDownItemView.html") public TextResource getContents();
  @Source("org/dashbuilder/renderer/client/selector/SelectorDropDownItemView.css") @NotStrict public CssResource getStyle(); }
  public Type_factory__o_d_r_c_s_SelectorDropDownItemView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(SelectorDropDownItemView.class, "Type_factory__o_d_r_c_s_SelectorDropDownItemView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { SelectorDropDownItemView.class, Object.class, View.class, SelectorItemView.class, UberElement.class, IsElement.class, HasPresenter.class, org.jboss.errai.ui.client.local.api.IsElement.class });
  }

  public void init(final Context context) {
    ((o_d_r_c_s_SelectorDropDownItemViewTemplateResource) GWT.create(o_d_r_c_s_SelectorDropDownItemViewTemplateResource.class)).getStyle().ensureInjected();
  }

  public SelectorDropDownItemView createInstance(final ContextManager contextManager) {
    final SelectorDropDownItemView instance = new SelectorDropDownItemView();
    setIncompleteInstance(instance);
    final Anchor SelectorDropDownItemView_itemAnchor = (Anchor) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Anchor__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SelectorDropDownItemView_itemAnchor);
    SelectorDropDownItemView_Anchor_itemAnchor(instance, SelectorDropDownItemView_itemAnchor);
    final Span SelectorDropDownItemView_itemText = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SelectorDropDownItemView_itemText);
    SelectorDropDownItemView_Span_itemText(instance, SelectorDropDownItemView_itemText);
    final Span SelectorDropDownItemView_itemIcon = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SelectorDropDownItemView_itemIcon);
    SelectorDropDownItemView_Span_itemIcon(instance, SelectorDropDownItemView_itemIcon);
    final ListItem SelectorDropDownItemView_item = (ListItem) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_ListItem__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SelectorDropDownItemView_item);
    SelectorDropDownItemView_ListItem_item(instance, SelectorDropDownItemView_item);
    o_d_r_c_s_SelectorDropDownItemViewTemplateResource templateForSelectorDropDownItemView = GWT.create(o_d_r_c_s_SelectorDropDownItemViewTemplateResource.class);
    Element parentElementForTemplateOfSelectorDropDownItemView = TemplateUtil.getRootTemplateParentElement(templateForSelectorDropDownItemView.getContents().getText(), "org/dashbuilder/renderer/client/selector/SelectorDropDownItemView.html", "");
    TemplateUtil.translateTemplate("org/dashbuilder/renderer/client/selector/SelectorDropDownItemView.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSelectorDropDownItemView));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSelectorDropDownItemView));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(4);
    dataFieldMetas.put("item", new DataFieldMeta());
    dataFieldMetas.put("itemAnchor", new DataFieldMeta());
    dataFieldMetas.put("itemText", new DataFieldMeta());
    dataFieldMetas.put("itemIcon", new DataFieldMeta());
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("org.dashbuilder.renderer.client.selector.SelectorDropDownItemView", "org/dashbuilder/renderer/client/selector/SelectorDropDownItemView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SelectorDropDownItemView_ListItem_item(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "item");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.renderer.client.selector.SelectorDropDownItemView", "org/dashbuilder/renderer/client/selector/SelectorDropDownItemView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SelectorDropDownItemView_Anchor_itemAnchor(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "itemAnchor");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.renderer.client.selector.SelectorDropDownItemView", "org/dashbuilder/renderer/client/selector/SelectorDropDownItemView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SelectorDropDownItemView_Span_itemText(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "itemText");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.renderer.client.selector.SelectorDropDownItemView", "org/dashbuilder/renderer/client/selector/SelectorDropDownItemView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SelectorDropDownItemView_Span_itemIcon(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "itemIcon");
    templateFieldsMap.put("item", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SelectorDropDownItemView_ListItem_item(instance))));
    templateFieldsMap.put("itemAnchor", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SelectorDropDownItemView_Anchor_itemAnchor(instance))));
    templateFieldsMap.put("itemText", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SelectorDropDownItemView_Span_itemText(instance))));
    templateFieldsMap.put("itemIcon", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SelectorDropDownItemView_Span_itemIcon(instance))));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSelectorDropDownItemView), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("itemAnchor"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onItemClick(event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((SelectorDropDownItemView) instance, contextManager);
  }

  public void destroyInstanceHelper(final SelectorDropDownItemView instance, final ContextManager contextManager) {
    TemplateUtil.cleanupTemplated(instance);
  }

  native static Anchor SelectorDropDownItemView_Anchor_itemAnchor(SelectorDropDownItemView instance) /*-{
    return instance.@org.dashbuilder.renderer.client.selector.SelectorDropDownItemView::itemAnchor;
  }-*/;

  native static void SelectorDropDownItemView_Anchor_itemAnchor(SelectorDropDownItemView instance, Anchor value) /*-{
    instance.@org.dashbuilder.renderer.client.selector.SelectorDropDownItemView::itemAnchor = value;
  }-*/;

  native static ListItem SelectorDropDownItemView_ListItem_item(SelectorDropDownItemView instance) /*-{
    return instance.@org.dashbuilder.renderer.client.selector.SelectorDropDownItemView::item;
  }-*/;

  native static void SelectorDropDownItemView_ListItem_item(SelectorDropDownItemView instance, ListItem value) /*-{
    instance.@org.dashbuilder.renderer.client.selector.SelectorDropDownItemView::item = value;
  }-*/;

  native static Span SelectorDropDownItemView_Span_itemIcon(SelectorDropDownItemView instance) /*-{
    return instance.@org.dashbuilder.renderer.client.selector.SelectorDropDownItemView::itemIcon;
  }-*/;

  native static void SelectorDropDownItemView_Span_itemIcon(SelectorDropDownItemView instance, Span value) /*-{
    instance.@org.dashbuilder.renderer.client.selector.SelectorDropDownItemView::itemIcon = value;
  }-*/;

  native static Span SelectorDropDownItemView_Span_itemText(SelectorDropDownItemView instance) /*-{
    return instance.@org.dashbuilder.renderer.client.selector.SelectorDropDownItemView::itemText;
  }-*/;

  native static void SelectorDropDownItemView_Span_itemText(SelectorDropDownItemView instance, Span value) /*-{
    instance.@org.dashbuilder.renderer.client.selector.SelectorDropDownItemView::itemText = value;
  }-*/;
}