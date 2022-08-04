package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ClientBundle.Source;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.ui.Widget;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.enterprise.context.Dependent;
import org.dashbuilder.common.client.widgets.FilterLabelSet.View;
import org.dashbuilder.common.client.widgets.FilterLabelSetView;
import org.jboss.errai.common.client.api.IsElement;
import org.jboss.errai.common.client.dom.Anchor;
import org.jboss.errai.common.client.dom.Div;
import org.jboss.errai.common.client.ui.ElementWrapperWidget;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ui.shared.DataFieldMeta;
import org.jboss.errai.ui.shared.Template;
import org.jboss.errai.ui.shared.TemplateUtil;
import org.jboss.errai.ui.shared.api.style.StyleBindingsRegistry;
import org.uberfire.client.mvp.HasPresenter;
import org.uberfire.client.mvp.UberElement;

public class Type_factory__o_d_c_c_w_FilterLabelSetView__quals__j_e_i_Any_j_e_i_Default extends Factory<FilterLabelSetView> { public interface o_d_c_c_w_FilterLabelSetViewTemplateResource extends Template, ClientBundle { @Source("org/dashbuilder/common/client/widgets/FilterLabelSetView.html") public TextResource getContents(); }
  public Type_factory__o_d_c_c_w_FilterLabelSetView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(FilterLabelSetView.class, "Type_factory__o_d_c_c_w_FilterLabelSetView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { FilterLabelSetView.class, Object.class, View.class, UberElement.class, IsElement.class, HasPresenter.class, org.jboss.errai.ui.client.local.api.IsElement.class });
  }

  public FilterLabelSetView createInstance(final ContextManager contextManager) {
    final FilterLabelSetView instance = new FilterLabelSetView();
    setIncompleteInstance(instance);
    final Div FilterLabelSetView_mainDiv = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, FilterLabelSetView_mainDiv);
    FilterLabelSetView_Div_mainDiv(instance, FilterLabelSetView_mainDiv);
    final Anchor FilterLabelSetView_clearAll = (Anchor) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Anchor__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, FilterLabelSetView_clearAll);
    FilterLabelSetView_Anchor_clearAll(instance, FilterLabelSetView_clearAll);
    o_d_c_c_w_FilterLabelSetViewTemplateResource templateForFilterLabelSetView = GWT.create(o_d_c_c_w_FilterLabelSetViewTemplateResource.class);
    Element parentElementForTemplateOfFilterLabelSetView = TemplateUtil.getRootTemplateParentElement(templateForFilterLabelSetView.getContents().getText(), "org/dashbuilder/common/client/widgets/FilterLabelSetView.html", "");
    TemplateUtil.translateTemplate("org/dashbuilder/common/client/widgets/FilterLabelSetView.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfFilterLabelSetView));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfFilterLabelSetView));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(2);
    dataFieldMetas.put("mainDiv", new DataFieldMeta());
    dataFieldMetas.put("clearAll", new DataFieldMeta());
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("org.dashbuilder.common.client.widgets.FilterLabelSetView", "org/dashbuilder/common/client/widgets/FilterLabelSetView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(FilterLabelSetView_Div_mainDiv(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "mainDiv");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.common.client.widgets.FilterLabelSetView", "org/dashbuilder/common/client/widgets/FilterLabelSetView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(FilterLabelSetView_Anchor_clearAll(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "clearAll");
    templateFieldsMap.put("mainDiv", ElementWrapperWidget.getWidget(TemplateUtil.asElement(FilterLabelSetView_Div_mainDiv(instance))));
    templateFieldsMap.put("clearAll", ElementWrapperWidget.getWidget(TemplateUtil.asElement(FilterLabelSetView_Anchor_clearAll(instance))));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfFilterLabelSetView), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("clearAll"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        FilterLabelSetView_onClearAll_ClickEvent(instance, event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((FilterLabelSetView) instance, contextManager);
  }

  public void destroyInstanceHelper(final FilterLabelSetView instance, final ContextManager contextManager) {
    TemplateUtil.cleanupTemplated(instance);
  }

  native static Div FilterLabelSetView_Div_mainDiv(FilterLabelSetView instance) /*-{
    return instance.@org.dashbuilder.common.client.widgets.FilterLabelSetView::mainDiv;
  }-*/;

  native static void FilterLabelSetView_Div_mainDiv(FilterLabelSetView instance, Div value) /*-{
    instance.@org.dashbuilder.common.client.widgets.FilterLabelSetView::mainDiv = value;
  }-*/;

  native static Anchor FilterLabelSetView_Anchor_clearAll(FilterLabelSetView instance) /*-{
    return instance.@org.dashbuilder.common.client.widgets.FilterLabelSetView::clearAll;
  }-*/;

  native static void FilterLabelSetView_Anchor_clearAll(FilterLabelSetView instance, Anchor value) /*-{
    instance.@org.dashbuilder.common.client.widgets.FilterLabelSetView::clearAll = value;
  }-*/;

  public native static void FilterLabelSetView_onClearAll_ClickEvent(FilterLabelSetView instance, ClickEvent a0) /*-{
    instance.@org.dashbuilder.common.client.widgets.FilterLabelSetView::onClearAll(Lcom/google/gwt/event/dom/client/ClickEvent;)(a0);
  }-*/;
}