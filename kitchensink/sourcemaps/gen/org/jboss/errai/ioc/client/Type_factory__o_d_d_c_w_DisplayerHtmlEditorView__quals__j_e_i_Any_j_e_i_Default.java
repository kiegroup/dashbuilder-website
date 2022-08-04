package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.HasAttachHandlers;
import com.google.gwt.event.shared.HasHandlers;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ClientBundle.Source;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.EventListener;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
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
import org.dashbuilder.displayer.client.widgets.DisplayerHtmlEditor.View;
import org.dashbuilder.displayer.client.widgets.DisplayerHtmlEditorView;
import org.jboss.errai.common.client.dom.Anchor;
import org.jboss.errai.common.client.dom.ListItem;
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

public class Type_factory__o_d_d_c_w_DisplayerHtmlEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerHtmlEditorView> { public interface o_d_d_c_w_DisplayerHtmlEditorViewTemplateResource extends Template, ClientBundle { @Source("org/dashbuilder/displayer/client/widgets/DisplayerHtmlEditorView.html") public TextResource getContents(); }
  public Type_factory__o_d_d_c_w_DisplayerHtmlEditorView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(DisplayerHtmlEditorView.class, "Type_factory__o_d_d_c_w_DisplayerHtmlEditorView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { DisplayerHtmlEditorView.class, Composite.class, Widget.class, UIObject.class, Object.class, HasVisibility.class, EventListener.class, HasAttachHandlers.class, HasHandlers.class, IsWidget.class, IsRenderable.class, View.class, UberView.class, HasPresenter.class });
  }

  public DisplayerHtmlEditorView createInstance(final ContextManager contextManager) {
    final DisplayerHtmlEditorView instance = new DisplayerHtmlEditorView();
    setIncompleteInstance(instance);
    final ListItem DisplayerHtmlEditorView_previewItem = (ListItem) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_ListItem__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, DisplayerHtmlEditorView_previewItem);
    DisplayerHtmlEditorView_ListItem_previewItem(instance, DisplayerHtmlEditorView_previewItem);
    final FlowPanel DisplayerHtmlEditorView_contentPanel = (FlowPanel) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_FlowPanel__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, DisplayerHtmlEditorView_contentPanel);
    DisplayerHtmlEditorView_FlowPanel_contentPanel(instance, DisplayerHtmlEditorView_contentPanel);
    final UnorderedList DisplayerHtmlEditorView_tabList = (UnorderedList) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_UnorderedList__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, DisplayerHtmlEditorView_tabList);
    DisplayerHtmlEditorView_UnorderedList_tabList(instance, DisplayerHtmlEditorView_tabList);
    final Anchor DisplayerHtmlEditorView_previewAnchor = (Anchor) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Anchor__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, DisplayerHtmlEditorView_previewAnchor);
    DisplayerHtmlEditorView_Anchor_previewAnchor(instance, DisplayerHtmlEditorView_previewAnchor);
    o_d_d_c_w_DisplayerHtmlEditorViewTemplateResource templateForDisplayerHtmlEditorView = GWT.create(o_d_d_c_w_DisplayerHtmlEditorViewTemplateResource.class);
    Element parentElementForTemplateOfDisplayerHtmlEditorView = TemplateUtil.getRootTemplateParentElement(templateForDisplayerHtmlEditorView.getContents().getText(), "org/dashbuilder/displayer/client/widgets/DisplayerHtmlEditorView.html", "");
    TemplateUtil.translateTemplate("org/dashbuilder/displayer/client/widgets/DisplayerHtmlEditorView.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfDisplayerHtmlEditorView));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfDisplayerHtmlEditorView));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(4);
    dataFieldMetas.put("contentPanel", new DataFieldMeta());
    dataFieldMetas.put("tabList", new DataFieldMeta());
    dataFieldMetas.put("previewItem", new DataFieldMeta());
    dataFieldMetas.put("previewAnchor", new DataFieldMeta());
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("org.dashbuilder.displayer.client.widgets.DisplayerHtmlEditorView", "org/dashbuilder/displayer/client/widgets/DisplayerHtmlEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return DisplayerHtmlEditorView_FlowPanel_contentPanel(instance).asWidget();
      }
    }, dataFieldElements, dataFieldMetas, "contentPanel");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.displayer.client.widgets.DisplayerHtmlEditorView", "org/dashbuilder/displayer/client/widgets/DisplayerHtmlEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(DisplayerHtmlEditorView_UnorderedList_tabList(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "tabList");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.displayer.client.widgets.DisplayerHtmlEditorView", "org/dashbuilder/displayer/client/widgets/DisplayerHtmlEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(DisplayerHtmlEditorView_ListItem_previewItem(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "previewItem");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.displayer.client.widgets.DisplayerHtmlEditorView", "org/dashbuilder/displayer/client/widgets/DisplayerHtmlEditorView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(DisplayerHtmlEditorView_Anchor_previewAnchor(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "previewAnchor");
    templateFieldsMap.put("contentPanel", DisplayerHtmlEditorView_FlowPanel_contentPanel(instance).asWidget());
    templateFieldsMap.put("tabList", ElementWrapperWidget.getWidget(TemplateUtil.asElement(DisplayerHtmlEditorView_UnorderedList_tabList(instance))));
    templateFieldsMap.put("previewItem", ElementWrapperWidget.getWidget(TemplateUtil.asElement(DisplayerHtmlEditorView_ListItem_previewItem(instance))));
    templateFieldsMap.put("previewAnchor", ElementWrapperWidget.getWidget(TemplateUtil.asElement(DisplayerHtmlEditorView_Anchor_previewAnchor(instance))));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfDisplayerHtmlEditorView), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("previewAnchor"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        DisplayerHtmlEditorView_onPreviewClicked_ClickEvent(instance, event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((DisplayerHtmlEditorView) instance, contextManager);
  }

  public void destroyInstanceHelper(final DisplayerHtmlEditorView instance, final ContextManager contextManager) {
    TemplateUtil.cleanupWidget(instance);
  }

  native static UnorderedList DisplayerHtmlEditorView_UnorderedList_tabList(DisplayerHtmlEditorView instance) /*-{
    return instance.@org.dashbuilder.displayer.client.widgets.DisplayerHtmlEditorView::tabList;
  }-*/;

  native static void DisplayerHtmlEditorView_UnorderedList_tabList(DisplayerHtmlEditorView instance, UnorderedList value) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.DisplayerHtmlEditorView::tabList = value;
  }-*/;

  native static ListItem DisplayerHtmlEditorView_ListItem_previewItem(DisplayerHtmlEditorView instance) /*-{
    return instance.@org.dashbuilder.displayer.client.widgets.DisplayerHtmlEditorView::previewItem;
  }-*/;

  native static void DisplayerHtmlEditorView_ListItem_previewItem(DisplayerHtmlEditorView instance, ListItem value) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.DisplayerHtmlEditorView::previewItem = value;
  }-*/;

  native static Anchor DisplayerHtmlEditorView_Anchor_previewAnchor(DisplayerHtmlEditorView instance) /*-{
    return instance.@org.dashbuilder.displayer.client.widgets.DisplayerHtmlEditorView::previewAnchor;
  }-*/;

  native static void DisplayerHtmlEditorView_Anchor_previewAnchor(DisplayerHtmlEditorView instance, Anchor value) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.DisplayerHtmlEditorView::previewAnchor = value;
  }-*/;

  native static FlowPanel DisplayerHtmlEditorView_FlowPanel_contentPanel(DisplayerHtmlEditorView instance) /*-{
    return instance.@org.dashbuilder.displayer.client.widgets.DisplayerHtmlEditorView::contentPanel;
  }-*/;

  native static void DisplayerHtmlEditorView_FlowPanel_contentPanel(DisplayerHtmlEditorView instance, FlowPanel value) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.DisplayerHtmlEditorView::contentPanel = value;
  }-*/;

  public native static void DisplayerHtmlEditorView_onPreviewClicked_ClickEvent(DisplayerHtmlEditorView instance, ClickEvent a0) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.DisplayerHtmlEditorView::onPreviewClicked(Lcom/google/gwt/event/dom/client/ClickEvent;)(a0);
  }-*/;
}