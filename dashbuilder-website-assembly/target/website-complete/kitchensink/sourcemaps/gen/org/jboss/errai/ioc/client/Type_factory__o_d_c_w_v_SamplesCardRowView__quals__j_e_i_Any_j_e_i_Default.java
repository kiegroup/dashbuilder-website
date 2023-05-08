package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ClientBundle.Source;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.CssResource.NotStrict;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.ui.Widget;
import elemental2.dom.HTMLDivElement;
import elemental2.dom.HTMLHeadingElement;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.enterprise.context.Dependent;
import org.dashbuilder.client.widgets.SamplesCardRow.View;
import org.dashbuilder.client.widgets.view.SamplesCardRowView;
import org.jboss.errai.common.client.api.elemental2.IsElement;
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
import org.uberfire.client.mvp.UberElemental;

public class Type_factory__o_d_c_w_v_SamplesCardRowView__quals__j_e_i_Any_j_e_i_Default extends Factory<SamplesCardRowView> { public interface o_d_c_w_v_SamplesCardRowViewTemplateResource extends Template, TemplateStyleSheet, ClientBundle { @Source("org/dashbuilder/client/widgets/view/SamplesCardRowView.html") public TextResource getContents();
  @Source("org/dashbuilder/client/widgets/view/SamplesCardRowView.css") @NotStrict public CssResource getStyle(); }
  public Type_factory__o_d_c_w_v_SamplesCardRowView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(SamplesCardRowView.class, "Type_factory__o_d_c_w_v_SamplesCardRowView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { SamplesCardRowView.class, Object.class, View.class, UberElemental.class, IsElement.class, HasPresenter.class });
  }

  public void init(final Context context) {
    ((o_d_c_w_v_SamplesCardRowViewTemplateResource) GWT.create(o_d_c_w_v_SamplesCardRowViewTemplateResource.class)).getStyle().ensureInjected();
  }

  public SamplesCardRowView createInstance(final ContextManager contextManager) {
    final SamplesCardRowView instance = new SamplesCardRowView();
    setIncompleteInstance(instance);
    final HTMLHeadingElement SamplesCardRowView_rowTitle = (HTMLHeadingElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLHeadingElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SamplesCardRowView_rowTitle);
    SamplesCardRowView_HTMLHeadingElement_rowTitle(instance, SamplesCardRowView_rowTitle);
    final HTMLDivElement SamplesCardRowView_samplesCardRowContainer = (HTMLDivElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLDivElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SamplesCardRowView_samplesCardRowContainer);
    SamplesCardRowView_HTMLDivElement_samplesCardRowContainer(instance, SamplesCardRowView_samplesCardRowContainer);
    final HTMLDivElement SamplesCardRowView_samplesRowLine = (HTMLDivElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLDivElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SamplesCardRowView_samplesRowLine);
    SamplesCardRowView_HTMLDivElement_samplesRowLine(instance, SamplesCardRowView_samplesRowLine);
    o_d_c_w_v_SamplesCardRowViewTemplateResource templateForSamplesCardRowView = GWT.create(o_d_c_w_v_SamplesCardRowViewTemplateResource.class);
    Element parentElementForTemplateOfSamplesCardRowView = TemplateUtil.getRootTemplateParentElement(templateForSamplesCardRowView.getContents().getText(), "org/dashbuilder/client/widgets/view/SamplesCardRowView.html", "");
    TemplateUtil.translateTemplate("org/dashbuilder/client/widgets/view/SamplesCardRowView.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSamplesCardRowView));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSamplesCardRowView));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(3);
    dataFieldMetas.put("samplesCardRowContainer", new DataFieldMeta());
    dataFieldMetas.put("rowTitle", new DataFieldMeta());
    dataFieldMetas.put("samplesRowLine", new DataFieldMeta());
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.widgets.view.SamplesCardRowView", "org/dashbuilder/client/widgets/view/SamplesCardRowView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SamplesCardRowView_HTMLDivElement_samplesCardRowContainer(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "samplesCardRowContainer");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.widgets.view.SamplesCardRowView", "org/dashbuilder/client/widgets/view/SamplesCardRowView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SamplesCardRowView_HTMLHeadingElement_rowTitle(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "rowTitle");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.widgets.view.SamplesCardRowView", "org/dashbuilder/client/widgets/view/SamplesCardRowView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SamplesCardRowView_HTMLDivElement_samplesRowLine(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "samplesRowLine");
    templateFieldsMap.put("samplesCardRowContainer", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SamplesCardRowView_HTMLDivElement_samplesCardRowContainer(instance))));
    templateFieldsMap.put("rowTitle", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SamplesCardRowView_HTMLHeadingElement_rowTitle(instance))));
    templateFieldsMap.put("samplesRowLine", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SamplesCardRowView_HTMLDivElement_samplesRowLine(instance))));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSamplesCardRowView), templateFieldsMap.values());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((SamplesCardRowView) instance, contextManager);
  }

  public void destroyInstanceHelper(final SamplesCardRowView instance, final ContextManager contextManager) {
    TemplateUtil.cleanupTemplated(instance);
  }

  native static HTMLDivElement SamplesCardRowView_HTMLDivElement_samplesRowLine(SamplesCardRowView instance) /*-{
    return instance.@org.dashbuilder.client.widgets.view.SamplesCardRowView::samplesRowLine;
  }-*/;

  native static void SamplesCardRowView_HTMLDivElement_samplesRowLine(SamplesCardRowView instance, HTMLDivElement value) /*-{
    instance.@org.dashbuilder.client.widgets.view.SamplesCardRowView::samplesRowLine = value;
  }-*/;

  native static HTMLHeadingElement SamplesCardRowView_HTMLHeadingElement_rowTitle(SamplesCardRowView instance) /*-{
    return instance.@org.dashbuilder.client.widgets.view.SamplesCardRowView::rowTitle;
  }-*/;

  native static void SamplesCardRowView_HTMLHeadingElement_rowTitle(SamplesCardRowView instance, HTMLHeadingElement value) /*-{
    instance.@org.dashbuilder.client.widgets.view.SamplesCardRowView::rowTitle = value;
  }-*/;

  native static HTMLDivElement SamplesCardRowView_HTMLDivElement_samplesCardRowContainer(SamplesCardRowView instance) /*-{
    return instance.@org.dashbuilder.client.widgets.view.SamplesCardRowView::samplesCardRowContainer;
  }-*/;

  native static void SamplesCardRowView_HTMLDivElement_samplesCardRowContainer(SamplesCardRowView instance, HTMLDivElement value) /*-{
    instance.@org.dashbuilder.client.widgets.view.SamplesCardRowView::samplesCardRowContainer = value;
  }-*/;
}