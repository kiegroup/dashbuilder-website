package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ClientBundle.Source;
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
import org.dashbuilder.renderer.client.selector.SelectorLabelSetDisplayerView;
import org.jboss.errai.common.client.api.IsElement;
import org.jboss.errai.common.client.dom.Div;
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

public class Type_factory__o_d_r_c_s_SelectorLabelSetDisplayerView__quals__j_e_i_Any_j_e_i_Default extends Factory<SelectorLabelSetDisplayerView> { public interface o_d_r_c_s_SelectorLabelSetDisplayerViewTemplateResource extends Template, ClientBundle { @Source("org/dashbuilder/renderer/client/selector/SelectorLabelSetDisplayerView.html") public TextResource getContents(); }
  public Type_factory__o_d_r_c_s_SelectorLabelSetDisplayerView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(SelectorLabelSetDisplayerView.class, "Type_factory__o_d_r_c_s_SelectorLabelSetDisplayerView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { SelectorLabelSetDisplayerView.class, AbstractErraiDisplayerView.class, Object.class, View.class, org.dashbuilder.displayer.client.AbstractDisplayer.View.class, IsWidget.class, UberElement.class, IsElement.class, HasPresenter.class, org.jboss.errai.ui.client.local.api.IsElement.class, org.dashbuilder.renderer.client.selector.SelectorLabelSetDisplayer.View.class });
  }

  public SelectorLabelSetDisplayerView createInstance(final ContextManager contextManager) {
    final SelectorLabelSetDisplayerView instance = new SelectorLabelSetDisplayerView();
    setIncompleteInstance(instance);
    final Span SelectorLabelSetDisplayerView_titleSpan = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SelectorLabelSetDisplayerView_titleSpan);
    SelectorLabelSetDisplayerView_Span_titleSpan(instance, SelectorLabelSetDisplayerView_titleSpan);
    final Span SelectorLabelSetDisplayerView_noDataSpan = (Span) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SelectorLabelSetDisplayerView_noDataSpan);
    SelectorLabelSetDisplayerView_Span_noDataSpan(instance, SelectorLabelSetDisplayerView_noDataSpan);
    final Div SelectorLabelSetDisplayerView_labelSetDiv = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SelectorLabelSetDisplayerView_labelSetDiv);
    SelectorLabelSetDisplayerView_Div_labelSetDiv(instance, SelectorLabelSetDisplayerView_labelSetDiv);
    final Div SelectorLabelSetDisplayerView_containerDiv = (Div) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SelectorLabelSetDisplayerView_containerDiv);
    SelectorLabelSetDisplayerView_Div_containerDiv(instance, SelectorLabelSetDisplayerView_containerDiv);
    o_d_r_c_s_SelectorLabelSetDisplayerViewTemplateResource templateForSelectorLabelSetDisplayerView = GWT.create(o_d_r_c_s_SelectorLabelSetDisplayerViewTemplateResource.class);
    Element parentElementForTemplateOfSelectorLabelSetDisplayerView = TemplateUtil.getRootTemplateParentElement(templateForSelectorLabelSetDisplayerView.getContents().getText(), "org/dashbuilder/renderer/client/selector/SelectorLabelSetDisplayerView.html", "");
    TemplateUtil.translateTemplate("org/dashbuilder/renderer/client/selector/SelectorLabelSetDisplayerView.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSelectorLabelSetDisplayerView));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSelectorLabelSetDisplayerView));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(4);
    dataFieldMetas.put("containerDiv", new DataFieldMeta());
    dataFieldMetas.put("titleSpan", new DataFieldMeta());
    dataFieldMetas.put("noDataSpan", new DataFieldMeta());
    dataFieldMetas.put("labelSetDiv", new DataFieldMeta());
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("org.dashbuilder.renderer.client.selector.SelectorLabelSetDisplayerView", "org/dashbuilder/renderer/client/selector/SelectorLabelSetDisplayerView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SelectorLabelSetDisplayerView_Div_containerDiv(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "containerDiv");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.renderer.client.selector.SelectorLabelSetDisplayerView", "org/dashbuilder/renderer/client/selector/SelectorLabelSetDisplayerView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SelectorLabelSetDisplayerView_Span_titleSpan(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "titleSpan");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.renderer.client.selector.SelectorLabelSetDisplayerView", "org/dashbuilder/renderer/client/selector/SelectorLabelSetDisplayerView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SelectorLabelSetDisplayerView_Span_noDataSpan(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "noDataSpan");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.renderer.client.selector.SelectorLabelSetDisplayerView", "org/dashbuilder/renderer/client/selector/SelectorLabelSetDisplayerView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SelectorLabelSetDisplayerView_Div_labelSetDiv(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "labelSetDiv");
    templateFieldsMap.put("containerDiv", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SelectorLabelSetDisplayerView_Div_containerDiv(instance))));
    templateFieldsMap.put("titleSpan", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SelectorLabelSetDisplayerView_Span_titleSpan(instance))));
    templateFieldsMap.put("noDataSpan", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SelectorLabelSetDisplayerView_Span_noDataSpan(instance))));
    templateFieldsMap.put("labelSetDiv", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SelectorLabelSetDisplayerView_Div_labelSetDiv(instance))));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSelectorLabelSetDisplayerView), templateFieldsMap.values());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((SelectorLabelSetDisplayerView) instance, contextManager);
  }

  public void destroyInstanceHelper(final SelectorLabelSetDisplayerView instance, final ContextManager contextManager) {
    TemplateUtil.cleanupTemplated(instance);
  }

  native static Span SelectorLabelSetDisplayerView_Span_noDataSpan(SelectorLabelSetDisplayerView instance) /*-{
    return instance.@org.dashbuilder.renderer.client.selector.SelectorLabelSetDisplayerView::noDataSpan;
  }-*/;

  native static void SelectorLabelSetDisplayerView_Span_noDataSpan(SelectorLabelSetDisplayerView instance, Span value) /*-{
    instance.@org.dashbuilder.renderer.client.selector.SelectorLabelSetDisplayerView::noDataSpan = value;
  }-*/;

  native static Span SelectorLabelSetDisplayerView_Span_titleSpan(SelectorLabelSetDisplayerView instance) /*-{
    return instance.@org.dashbuilder.renderer.client.selector.SelectorLabelSetDisplayerView::titleSpan;
  }-*/;

  native static void SelectorLabelSetDisplayerView_Span_titleSpan(SelectorLabelSetDisplayerView instance, Span value) /*-{
    instance.@org.dashbuilder.renderer.client.selector.SelectorLabelSetDisplayerView::titleSpan = value;
  }-*/;

  native static Div SelectorLabelSetDisplayerView_Div_containerDiv(SelectorLabelSetDisplayerView instance) /*-{
    return instance.@org.dashbuilder.renderer.client.selector.SelectorLabelSetDisplayerView::containerDiv;
  }-*/;

  native static void SelectorLabelSetDisplayerView_Div_containerDiv(SelectorLabelSetDisplayerView instance, Div value) /*-{
    instance.@org.dashbuilder.renderer.client.selector.SelectorLabelSetDisplayerView::containerDiv = value;
  }-*/;

  native static Div SelectorLabelSetDisplayerView_Div_labelSetDiv(SelectorLabelSetDisplayerView instance) /*-{
    return instance.@org.dashbuilder.renderer.client.selector.SelectorLabelSetDisplayerView::labelSetDiv;
  }-*/;

  native static void SelectorLabelSetDisplayerView_Div_labelSetDiv(SelectorLabelSetDisplayerView instance, Div value) /*-{
    instance.@org.dashbuilder.renderer.client.selector.SelectorLabelSetDisplayerView::labelSetDiv = value;
  }-*/;
}