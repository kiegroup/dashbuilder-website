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
import org.dashbuilder.common.client.widgets.FilterLabel.View;
import org.dashbuilder.common.client.widgets.FilterLabelView;
import org.jboss.errai.common.client.api.IsElement;
import org.jboss.errai.common.client.dom.Anchor;
import org.jboss.errai.common.client.dom.Span;
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

public class Type_factory__o_d_c_c_w_FilterLabelView__quals__j_e_i_Any_j_e_i_Default extends Factory<FilterLabelView> { public interface o_d_c_c_w_FilterLabelViewTemplateResource extends Template, ClientBundle { @Source("org/dashbuilder/common/client/widgets/FilterLabelView.html") public TextResource getContents(); }
  public Type_factory__o_d_c_c_w_FilterLabelView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(FilterLabelView.class, "Type_factory__o_d_c_c_w_FilterLabelView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { FilterLabelView.class, Object.class, View.class, UberElement.class, IsElement.class, HasPresenter.class, org.jboss.errai.ui.client.local.api.IsElement.class });
  }

  public FilterLabelView createInstance(final ContextManager contextManager) {
    final FilterLabelView instance = new FilterLabelView();
    setIncompleteInstance(instance);
    final Span FilterLabelView_labelText = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, FilterLabelView_labelText);
    FilterLabelView_Span_labelText(instance, FilterLabelView_labelText);
    final Anchor FilterLabelView_labelRemove = (Anchor) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Anchor__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, FilterLabelView_labelRemove);
    FilterLabelView_Anchor_labelRemove(instance, FilterLabelView_labelRemove);
    o_d_c_c_w_FilterLabelViewTemplateResource templateForFilterLabelView = GWT.create(o_d_c_c_w_FilterLabelViewTemplateResource.class);
    Element parentElementForTemplateOfFilterLabelView = TemplateUtil.getRootTemplateParentElement(templateForFilterLabelView.getContents().getText(), "org/dashbuilder/common/client/widgets/FilterLabelView.html", "");
    TemplateUtil.translateTemplate("org/dashbuilder/common/client/widgets/FilterLabelView.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfFilterLabelView));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfFilterLabelView));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(2);
    dataFieldMetas.put("labelText", new DataFieldMeta());
    dataFieldMetas.put("labelRemove", new DataFieldMeta());
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("org.dashbuilder.common.client.widgets.FilterLabelView", "org/dashbuilder/common/client/widgets/FilterLabelView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(FilterLabelView_Span_labelText(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "labelText");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.common.client.widgets.FilterLabelView", "org/dashbuilder/common/client/widgets/FilterLabelView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(FilterLabelView_Anchor_labelRemove(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "labelRemove");
    templateFieldsMap.put("labelText", ElementWrapperWidget.getWidget(TemplateUtil.asElement(FilterLabelView_Span_labelText(instance))));
    templateFieldsMap.put("labelRemove", ElementWrapperWidget.getWidget(TemplateUtil.asElement(FilterLabelView_Anchor_labelRemove(instance))));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfFilterLabelView), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("labelRemove"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        FilterLabelView_onRemove_ClickEvent(instance, event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((FilterLabelView) instance, contextManager);
  }

  public void destroyInstanceHelper(final FilterLabelView instance, final ContextManager contextManager) {
    TemplateUtil.cleanupTemplated(instance);
  }

  native static Span FilterLabelView_Span_labelText(FilterLabelView instance) /*-{
    return instance.@org.dashbuilder.common.client.widgets.FilterLabelView::labelText;
  }-*/;

  native static void FilterLabelView_Span_labelText(FilterLabelView instance, Span value) /*-{
    instance.@org.dashbuilder.common.client.widgets.FilterLabelView::labelText = value;
  }-*/;

  native static Anchor FilterLabelView_Anchor_labelRemove(FilterLabelView instance) /*-{
    return instance.@org.dashbuilder.common.client.widgets.FilterLabelView::labelRemove;
  }-*/;

  native static void FilterLabelView_Anchor_labelRemove(FilterLabelView instance, Anchor value) /*-{
    instance.@org.dashbuilder.common.client.widgets.FilterLabelView::labelRemove = value;
  }-*/;

  public native static void FilterLabelView_onRemove_ClickEvent(FilterLabelView instance, ClickEvent a0) /*-{
    instance.@org.dashbuilder.common.client.widgets.FilterLabelView::onRemove(Lcom/google/gwt/event/dom/client/ClickEvent;)(a0);
  }-*/;
}