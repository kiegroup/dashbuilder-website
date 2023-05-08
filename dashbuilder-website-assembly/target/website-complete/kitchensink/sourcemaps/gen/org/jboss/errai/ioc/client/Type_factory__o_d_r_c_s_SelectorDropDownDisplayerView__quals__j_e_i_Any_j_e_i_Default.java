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
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.enterprise.context.Dependent;
import org.dashbuilder.displayer.client.AbstractErraiDisplayer.View;
import org.dashbuilder.displayer.client.AbstractErraiDisplayerView;
import org.dashbuilder.renderer.client.selector.SelectorDropDownDisplayerView;
import org.jboss.errai.common.client.api.IsElement;
import org.jboss.errai.common.client.dom.Anchor;
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
import org.uberfire.client.mvp.UberElement;

public class Type_factory__o_d_r_c_s_SelectorDropDownDisplayerView__quals__j_e_i_Any_j_e_i_Default extends Factory<SelectorDropDownDisplayerView> { public interface o_d_r_c_s_SelectorDropDownDisplayerViewTemplateResource extends Template, TemplateStyleSheet, ClientBundle { @Source("org/dashbuilder/renderer/client/selector/SelectorDropDownDisplayerView.html") public TextResource getContents();
  @Source("org/dashbuilder/renderer/client/selector/SelectorDropDownDisplayerView.css") @NotStrict public CssResource getStyle(); }
  public Type_factory__o_d_r_c_s_SelectorDropDownDisplayerView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(SelectorDropDownDisplayerView.class, "Type_factory__o_d_r_c_s_SelectorDropDownDisplayerView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { SelectorDropDownDisplayerView.class, AbstractErraiDisplayerView.class, Object.class, View.class, org.dashbuilder.displayer.client.AbstractDisplayer.View.class, IsWidget.class, UberElement.class, IsElement.class, HasPresenter.class, org.jboss.errai.ui.client.local.api.IsElement.class, org.dashbuilder.renderer.client.selector.SelectorDropDownDisplayer.View.class });
  }

  public void init(final Context context) {
    ((o_d_r_c_s_SelectorDropDownDisplayerViewTemplateResource) GWT.create(o_d_r_c_s_SelectorDropDownDisplayerViewTemplateResource.class)).getStyle().ensureInjected();
  }

  public SelectorDropDownDisplayerView createInstance(final ContextManager contextManager) {
    final SelectorDropDownDisplayerView instance = new SelectorDropDownDisplayerView();
    setIncompleteInstance(instance);
    final Button SelectorDropDownDisplayerView_dropDownButton = (Button) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Button__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SelectorDropDownDisplayerView_dropDownButton);
    SelectorDropDownDisplayerView_Button_dropDownButton(instance, SelectorDropDownDisplayerView_dropDownButton);
    final Div SelectorDropDownDisplayerView_containerDiv = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SelectorDropDownDisplayerView_containerDiv);
    SelectorDropDownDisplayerView_Div_containerDiv(instance, SelectorDropDownDisplayerView_containerDiv);
    final UnorderedList SelectorDropDownDisplayerView_resetMenu = (UnorderedList) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_UnorderedList__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SelectorDropDownDisplayerView_resetMenu);
    SelectorDropDownDisplayerView_UnorderedList_resetMenu(instance, SelectorDropDownDisplayerView_resetMenu);
    final UnorderedList SelectorDropDownDisplayerView_dropDownMenu = (UnorderedList) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_UnorderedList__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SelectorDropDownDisplayerView_dropDownMenu);
    SelectorDropDownDisplayerView_UnorderedList_dropDownMenu(instance, SelectorDropDownDisplayerView_dropDownMenu);
    final Anchor SelectorDropDownDisplayerView_resetAnchor = (Anchor) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Anchor__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SelectorDropDownDisplayerView_resetAnchor);
    SelectorDropDownDisplayerView_Anchor_resetAnchor(instance, SelectorDropDownDisplayerView_resetAnchor);
    final Div SelectorDropDownDisplayerView_dropDownDiv = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SelectorDropDownDisplayerView_dropDownDiv);
    SelectorDropDownDisplayerView_Div_dropDownDiv(instance, SelectorDropDownDisplayerView_dropDownDiv);
    final Span SelectorDropDownDisplayerView_titleSpan = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SelectorDropDownDisplayerView_titleSpan);
    SelectorDropDownDisplayerView_Span_titleSpan(instance, SelectorDropDownDisplayerView_titleSpan);
    final Div SelectorDropDownDisplayerView_dropDownText = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SelectorDropDownDisplayerView_dropDownText);
    SelectorDropDownDisplayerView_Div_dropDownText(instance, SelectorDropDownDisplayerView_dropDownText);
    o_d_r_c_s_SelectorDropDownDisplayerViewTemplateResource templateForSelectorDropDownDisplayerView = GWT.create(o_d_r_c_s_SelectorDropDownDisplayerViewTemplateResource.class);
    Element parentElementForTemplateOfSelectorDropDownDisplayerView = TemplateUtil.getRootTemplateParentElement(templateForSelectorDropDownDisplayerView.getContents().getText(), "org/dashbuilder/renderer/client/selector/SelectorDropDownDisplayerView.html", "");
    TemplateUtil.translateTemplate("org/dashbuilder/renderer/client/selector/SelectorDropDownDisplayerView.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSelectorDropDownDisplayerView));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSelectorDropDownDisplayerView));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(8);
    dataFieldMetas.put("containerDiv", new DataFieldMeta());
    dataFieldMetas.put("titleSpan", new DataFieldMeta());
    dataFieldMetas.put("dropDownDiv", new DataFieldMeta());
    dataFieldMetas.put("dropDownButton", new DataFieldMeta());
    dataFieldMetas.put("dropDownText", new DataFieldMeta());
    dataFieldMetas.put("resetMenu", new DataFieldMeta());
    dataFieldMetas.put("dropDownMenu", new DataFieldMeta());
    dataFieldMetas.put("resetAnchor", new DataFieldMeta());
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("org.dashbuilder.renderer.client.selector.SelectorDropDownDisplayerView", "org/dashbuilder/renderer/client/selector/SelectorDropDownDisplayerView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SelectorDropDownDisplayerView_Div_containerDiv(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "containerDiv");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.renderer.client.selector.SelectorDropDownDisplayerView", "org/dashbuilder/renderer/client/selector/SelectorDropDownDisplayerView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SelectorDropDownDisplayerView_Span_titleSpan(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "titleSpan");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.renderer.client.selector.SelectorDropDownDisplayerView", "org/dashbuilder/renderer/client/selector/SelectorDropDownDisplayerView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SelectorDropDownDisplayerView_Div_dropDownDiv(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "dropDownDiv");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.renderer.client.selector.SelectorDropDownDisplayerView", "org/dashbuilder/renderer/client/selector/SelectorDropDownDisplayerView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SelectorDropDownDisplayerView_Button_dropDownButton(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "dropDownButton");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.renderer.client.selector.SelectorDropDownDisplayerView", "org/dashbuilder/renderer/client/selector/SelectorDropDownDisplayerView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SelectorDropDownDisplayerView_Div_dropDownText(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "dropDownText");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.renderer.client.selector.SelectorDropDownDisplayerView", "org/dashbuilder/renderer/client/selector/SelectorDropDownDisplayerView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SelectorDropDownDisplayerView_UnorderedList_resetMenu(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "resetMenu");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.renderer.client.selector.SelectorDropDownDisplayerView", "org/dashbuilder/renderer/client/selector/SelectorDropDownDisplayerView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SelectorDropDownDisplayerView_UnorderedList_dropDownMenu(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "dropDownMenu");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.renderer.client.selector.SelectorDropDownDisplayerView", "org/dashbuilder/renderer/client/selector/SelectorDropDownDisplayerView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SelectorDropDownDisplayerView_Anchor_resetAnchor(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "resetAnchor");
    templateFieldsMap.put("containerDiv", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SelectorDropDownDisplayerView_Div_containerDiv(instance))));
    templateFieldsMap.put("titleSpan", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SelectorDropDownDisplayerView_Span_titleSpan(instance))));
    templateFieldsMap.put("dropDownDiv", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SelectorDropDownDisplayerView_Div_dropDownDiv(instance))));
    templateFieldsMap.put("dropDownButton", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SelectorDropDownDisplayerView_Button_dropDownButton(instance))));
    templateFieldsMap.put("dropDownText", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SelectorDropDownDisplayerView_Div_dropDownText(instance))));
    templateFieldsMap.put("resetMenu", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SelectorDropDownDisplayerView_UnorderedList_resetMenu(instance))));
    templateFieldsMap.put("dropDownMenu", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SelectorDropDownDisplayerView_UnorderedList_dropDownMenu(instance))));
    templateFieldsMap.put("resetAnchor", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SelectorDropDownDisplayerView_Anchor_resetAnchor(instance))));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSelectorDropDownDisplayerView), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("resetAnchor"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        SelectorDropDownDisplayerView_onResetClicked_ClickEvent(instance, event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((SelectorDropDownDisplayerView) instance, contextManager);
  }

  public void destroyInstanceHelper(final SelectorDropDownDisplayerView instance, final ContextManager contextManager) {
    TemplateUtil.cleanupTemplated(instance);
  }

  native static Span SelectorDropDownDisplayerView_Span_titleSpan(SelectorDropDownDisplayerView instance) /*-{
    return instance.@org.dashbuilder.renderer.client.selector.SelectorDropDownDisplayerView::titleSpan;
  }-*/;

  native static void SelectorDropDownDisplayerView_Span_titleSpan(SelectorDropDownDisplayerView instance, Span value) /*-{
    instance.@org.dashbuilder.renderer.client.selector.SelectorDropDownDisplayerView::titleSpan = value;
  }-*/;

  native static Button SelectorDropDownDisplayerView_Button_dropDownButton(SelectorDropDownDisplayerView instance) /*-{
    return instance.@org.dashbuilder.renderer.client.selector.SelectorDropDownDisplayerView::dropDownButton;
  }-*/;

  native static void SelectorDropDownDisplayerView_Button_dropDownButton(SelectorDropDownDisplayerView instance, Button value) /*-{
    instance.@org.dashbuilder.renderer.client.selector.SelectorDropDownDisplayerView::dropDownButton = value;
  }-*/;

  native static UnorderedList SelectorDropDownDisplayerView_UnorderedList_resetMenu(SelectorDropDownDisplayerView instance) /*-{
    return instance.@org.dashbuilder.renderer.client.selector.SelectorDropDownDisplayerView::resetMenu;
  }-*/;

  native static void SelectorDropDownDisplayerView_UnorderedList_resetMenu(SelectorDropDownDisplayerView instance, UnorderedList value) /*-{
    instance.@org.dashbuilder.renderer.client.selector.SelectorDropDownDisplayerView::resetMenu = value;
  }-*/;

  native static Anchor SelectorDropDownDisplayerView_Anchor_resetAnchor(SelectorDropDownDisplayerView instance) /*-{
    return instance.@org.dashbuilder.renderer.client.selector.SelectorDropDownDisplayerView::resetAnchor;
  }-*/;

  native static void SelectorDropDownDisplayerView_Anchor_resetAnchor(SelectorDropDownDisplayerView instance, Anchor value) /*-{
    instance.@org.dashbuilder.renderer.client.selector.SelectorDropDownDisplayerView::resetAnchor = value;
  }-*/;

  native static Div SelectorDropDownDisplayerView_Div_dropDownDiv(SelectorDropDownDisplayerView instance) /*-{
    return instance.@org.dashbuilder.renderer.client.selector.SelectorDropDownDisplayerView::dropDownDiv;
  }-*/;

  native static void SelectorDropDownDisplayerView_Div_dropDownDiv(SelectorDropDownDisplayerView instance, Div value) /*-{
    instance.@org.dashbuilder.renderer.client.selector.SelectorDropDownDisplayerView::dropDownDiv = value;
  }-*/;

  native static UnorderedList SelectorDropDownDisplayerView_UnorderedList_dropDownMenu(SelectorDropDownDisplayerView instance) /*-{
    return instance.@org.dashbuilder.renderer.client.selector.SelectorDropDownDisplayerView::dropDownMenu;
  }-*/;

  native static void SelectorDropDownDisplayerView_UnorderedList_dropDownMenu(SelectorDropDownDisplayerView instance, UnorderedList value) /*-{
    instance.@org.dashbuilder.renderer.client.selector.SelectorDropDownDisplayerView::dropDownMenu = value;
  }-*/;

  native static Div SelectorDropDownDisplayerView_Div_dropDownText(SelectorDropDownDisplayerView instance) /*-{
    return instance.@org.dashbuilder.renderer.client.selector.SelectorDropDownDisplayerView::dropDownText;
  }-*/;

  native static void SelectorDropDownDisplayerView_Div_dropDownText(SelectorDropDownDisplayerView instance, Div value) /*-{
    instance.@org.dashbuilder.renderer.client.selector.SelectorDropDownDisplayerView::dropDownText = value;
  }-*/;

  native static Div SelectorDropDownDisplayerView_Div_containerDiv(SelectorDropDownDisplayerView instance) /*-{
    return instance.@org.dashbuilder.renderer.client.selector.SelectorDropDownDisplayerView::containerDiv;
  }-*/;

  native static void SelectorDropDownDisplayerView_Div_containerDiv(SelectorDropDownDisplayerView instance, Div value) /*-{
    instance.@org.dashbuilder.renderer.client.selector.SelectorDropDownDisplayerView::containerDiv = value;
  }-*/;

  public native static void SelectorDropDownDisplayerView_onResetClicked_ClickEvent(SelectorDropDownDisplayerView instance, ClickEvent a0) /*-{
    instance.@org.dashbuilder.renderer.client.selector.SelectorDropDownDisplayerView::onResetClicked(Lcom/google/gwt/event/dom/client/ClickEvent;)(a0);
  }-*/;
}