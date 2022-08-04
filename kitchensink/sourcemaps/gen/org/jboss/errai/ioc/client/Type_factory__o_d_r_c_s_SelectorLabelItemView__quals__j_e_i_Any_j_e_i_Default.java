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
import org.dashbuilder.renderer.client.selector.SelectorItemView;
import org.dashbuilder.renderer.client.selector.SelectorLabelItem.View;
import org.dashbuilder.renderer.client.selector.SelectorLabelItemView;
import org.jboss.errai.common.client.api.IsElement;
import org.jboss.errai.common.client.dom.Button;
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

public class Type_factory__o_d_r_c_s_SelectorLabelItemView__quals__j_e_i_Any_j_e_i_Default extends Factory<SelectorLabelItemView> { public interface o_d_r_c_s_SelectorLabelItemViewTemplateResource extends Template, ClientBundle { @Source("org/dashbuilder/renderer/client/selector/SelectorLabelItemView.html") public TextResource getContents(); }
  public Type_factory__o_d_r_c_s_SelectorLabelItemView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(SelectorLabelItemView.class, "Type_factory__o_d_r_c_s_SelectorLabelItemView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { SelectorLabelItemView.class, Object.class, View.class, SelectorItemView.class, UberElement.class, IsElement.class, HasPresenter.class, org.jboss.errai.ui.client.local.api.IsElement.class });
  }

  public SelectorLabelItemView createInstance(final ContextManager contextManager) {
    final SelectorLabelItemView instance = new SelectorLabelItemView();
    setIncompleteInstance(instance);
    final Button SelectorLabelItemView_item = (Button) contextManager.getInstance("ExtensionProvided_factory__o_j_e_c_c_d_Button__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, SelectorLabelItemView_item);
    SelectorLabelItemView_Button_item(instance, SelectorLabelItemView_item);
    o_d_r_c_s_SelectorLabelItemViewTemplateResource templateForSelectorLabelItemView = GWT.create(o_d_r_c_s_SelectorLabelItemViewTemplateResource.class);
    Element parentElementForTemplateOfSelectorLabelItemView = TemplateUtil.getRootTemplateParentElement(templateForSelectorLabelItemView.getContents().getText(), "org/dashbuilder/renderer/client/selector/SelectorLabelItemView.html", "");
    TemplateUtil.translateTemplate("org/dashbuilder/renderer/client/selector/SelectorLabelItemView.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSelectorLabelItemView));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSelectorLabelItemView));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(1);
    dataFieldMetas.put("item", new DataFieldMeta());
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("org.dashbuilder.renderer.client.selector.SelectorLabelItemView", "org/dashbuilder/renderer/client/selector/SelectorLabelItemView.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(SelectorLabelItemView_Button_item(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "item");
    templateFieldsMap.put("item", ElementWrapperWidget.getWidget(TemplateUtil.asElement(SelectorLabelItemView_Button_item(instance))));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfSelectorLabelItemView), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("item"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onItemClick(event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((SelectorLabelItemView) instance, contextManager);
  }

  public void destroyInstanceHelper(final SelectorLabelItemView instance, final ContextManager contextManager) {
    TemplateUtil.cleanupTemplated(instance);
  }

  native static Button SelectorLabelItemView_Button_item(SelectorLabelItemView instance) /*-{
    return instance.@org.dashbuilder.renderer.client.selector.SelectorLabelItemView::item;
  }-*/;

  native static void SelectorLabelItemView_Button_item(SelectorLabelItemView instance, Button value) /*-{
    instance.@org.dashbuilder.renderer.client.selector.SelectorLabelItemView::item = value;
  }-*/;
}