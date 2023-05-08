package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.HasAttachHandlers;
import com.google.gwt.event.shared.HasHandlers;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ClientBundle.Source;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.CssResource.NotStrict;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.EventListener;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasVisibility;
import com.google.gwt.user.client.ui.IsRenderable;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.UIObject;
import com.google.gwt.user.client.ui.Widget;
import elemental2.dom.HTMLAnchorElement;
import elemental2.dom.HTMLDivElement;
import elemental2.dom.HTMLParagraphElement;
import elemental2.dom.HTMLTextAreaElement;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.enterprise.context.Dependent;
import org.dashbuilder.displayer.client.widgets.DisplayerErrorWidget;
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

public class Type_factory__o_d_d_c_w_DisplayerErrorWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerErrorWidget> { public interface o_d_d_c_w_DisplayerErrorWidgetTemplateResource extends Template, TemplateStyleSheet, ClientBundle { @Source("org/dashbuilder/displayer/client/widgets/DisplayerErrorWidget.html") public TextResource getContents();
  @Source("org/dashbuilder/displayer/client/widgets/DisplayerErrorWidget.css") @NotStrict public CssResource getStyle(); }
  public Type_factory__o_d_d_c_w_DisplayerErrorWidget__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(DisplayerErrorWidget.class, "Type_factory__o_d_d_c_w_DisplayerErrorWidget__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { DisplayerErrorWidget.class, Composite.class, Widget.class, UIObject.class, Object.class, HasVisibility.class, EventListener.class, HasAttachHandlers.class, HasHandlers.class, IsWidget.class, IsRenderable.class });
  }

  public void init(final Context context) {
    ((o_d_d_c_w_DisplayerErrorWidgetTemplateResource) GWT.create(o_d_d_c_w_DisplayerErrorWidgetTemplateResource.class)).getStyle().ensureInjected();
  }

  public DisplayerErrorWidget createInstance(final ContextManager contextManager) {
    final DisplayerErrorWidget instance = new DisplayerErrorWidget();
    setIncompleteInstance(instance);
    final HTMLAnchorElement DisplayerErrorWidget_chevronRight = (HTMLAnchorElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLAnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, DisplayerErrorWidget_chevronRight);
    DisplayerErrorWidget_HTMLAnchorElement_chevronRight(instance, DisplayerErrorWidget_chevronRight);
    final HTMLAnchorElement DisplayerErrorWidget_chevronDown = (HTMLAnchorElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLAnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, DisplayerErrorWidget_chevronDown);
    DisplayerErrorWidget_HTMLAnchorElement_chevronDown(instance, DisplayerErrorWidget_chevronDown);
    final HTMLDivElement DisplayerErrorWidget_errorDetailsSection = (HTMLDivElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLDivElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, DisplayerErrorWidget_errorDetailsSection);
    DisplayerErrorWidget_HTMLDivElement_errorDetailsSection(instance, DisplayerErrorWidget_errorDetailsSection);
    final HTMLParagraphElement DisplayerErrorWidget_errorBody = (HTMLParagraphElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLParagraphElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, DisplayerErrorWidget_errorBody);
    DisplayerErrorWidget_HTMLParagraphElement_errorBody(instance, DisplayerErrorWidget_errorBody);
    final HTMLDivElement DisplayerErrorWidget_errorDetailsContainer = (HTMLDivElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLDivElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, DisplayerErrorWidget_errorDetailsContainer);
    DisplayerErrorWidget_HTMLDivElement_errorDetailsContainer(instance, DisplayerErrorWidget_errorDetailsContainer);
    final HTMLTextAreaElement DisplayerErrorWidget_errorDetails = (HTMLTextAreaElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLTextAreaElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, DisplayerErrorWidget_errorDetails);
    DisplayerErrorWidget_HTMLTextAreaElement_errorDetails(instance, DisplayerErrorWidget_errorDetails);
    final HTMLDivElement DisplayerErrorWidget_displayerErrorRoot = (HTMLDivElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLDivElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, DisplayerErrorWidget_displayerErrorRoot);
    DisplayerErrorWidget_HTMLDivElement_displayerErrorRoot(instance, DisplayerErrorWidget_displayerErrorRoot);
    final HTMLAnchorElement DisplayerErrorWidget_refreshLink = (HTMLAnchorElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLAnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, DisplayerErrorWidget_refreshLink);
    DisplayerErrorWidget_HTMLAnchorElement_refreshLink(instance, DisplayerErrorWidget_refreshLink);
    o_d_d_c_w_DisplayerErrorWidgetTemplateResource templateForDisplayerErrorWidget = GWT.create(o_d_d_c_w_DisplayerErrorWidgetTemplateResource.class);
    Element parentElementForTemplateOfDisplayerErrorWidget = TemplateUtil.getRootTemplateParentElement(templateForDisplayerErrorWidget.getContents().getText(), "org/dashbuilder/displayer/client/widgets/DisplayerErrorWidget.html", "");
    TemplateUtil.translateTemplate("org/dashbuilder/displayer/client/widgets/DisplayerErrorWidget.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfDisplayerErrorWidget));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfDisplayerErrorWidget));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(8);
    dataFieldMetas.put("displayerErrorRoot", new DataFieldMeta());
    dataFieldMetas.put("errorBody", new DataFieldMeta());
    dataFieldMetas.put("errorDetailsSection", new DataFieldMeta());
    dataFieldMetas.put("errorDetails", new DataFieldMeta());
    dataFieldMetas.put("chevronRight", new DataFieldMeta());
    dataFieldMetas.put("chevronDown", new DataFieldMeta());
    dataFieldMetas.put("refreshLink", new DataFieldMeta());
    dataFieldMetas.put("errorDetailsContainer", new DataFieldMeta());
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("org.dashbuilder.displayer.client.widgets.DisplayerErrorWidget", "org/dashbuilder/displayer/client/widgets/DisplayerErrorWidget.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(DisplayerErrorWidget_HTMLDivElement_displayerErrorRoot(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "displayerErrorRoot");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.displayer.client.widgets.DisplayerErrorWidget", "org/dashbuilder/displayer/client/widgets/DisplayerErrorWidget.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(DisplayerErrorWidget_HTMLParagraphElement_errorBody(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "errorBody");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.displayer.client.widgets.DisplayerErrorWidget", "org/dashbuilder/displayer/client/widgets/DisplayerErrorWidget.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(DisplayerErrorWidget_HTMLDivElement_errorDetailsSection(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "errorDetailsSection");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.displayer.client.widgets.DisplayerErrorWidget", "org/dashbuilder/displayer/client/widgets/DisplayerErrorWidget.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(DisplayerErrorWidget_HTMLTextAreaElement_errorDetails(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "errorDetails");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.displayer.client.widgets.DisplayerErrorWidget", "org/dashbuilder/displayer/client/widgets/DisplayerErrorWidget.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(DisplayerErrorWidget_HTMLAnchorElement_chevronRight(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "chevronRight");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.displayer.client.widgets.DisplayerErrorWidget", "org/dashbuilder/displayer/client/widgets/DisplayerErrorWidget.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(DisplayerErrorWidget_HTMLAnchorElement_chevronDown(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "chevronDown");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.displayer.client.widgets.DisplayerErrorWidget", "org/dashbuilder/displayer/client/widgets/DisplayerErrorWidget.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(DisplayerErrorWidget_HTMLAnchorElement_refreshLink(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "refreshLink");
    TemplateUtil.compositeComponentReplace("org.dashbuilder.displayer.client.widgets.DisplayerErrorWidget", "org/dashbuilder/displayer/client/widgets/DisplayerErrorWidget.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(DisplayerErrorWidget_HTMLDivElement_errorDetailsContainer(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "errorDetailsContainer");
    templateFieldsMap.put("displayerErrorRoot", ElementWrapperWidget.getWidget(TemplateUtil.asElement(DisplayerErrorWidget_HTMLDivElement_displayerErrorRoot(instance))));
    templateFieldsMap.put("errorBody", ElementWrapperWidget.getWidget(TemplateUtil.asElement(DisplayerErrorWidget_HTMLParagraphElement_errorBody(instance))));
    templateFieldsMap.put("errorDetailsSection", ElementWrapperWidget.getWidget(TemplateUtil.asElement(DisplayerErrorWidget_HTMLDivElement_errorDetailsSection(instance))));
    templateFieldsMap.put("errorDetails", ElementWrapperWidget.getWidget(TemplateUtil.asElement(DisplayerErrorWidget_HTMLTextAreaElement_errorDetails(instance))));
    templateFieldsMap.put("chevronRight", ElementWrapperWidget.getWidget(TemplateUtil.asElement(DisplayerErrorWidget_HTMLAnchorElement_chevronRight(instance))));
    templateFieldsMap.put("chevronDown", ElementWrapperWidget.getWidget(TemplateUtil.asElement(DisplayerErrorWidget_HTMLAnchorElement_chevronDown(instance))));
    templateFieldsMap.put("refreshLink", ElementWrapperWidget.getWidget(TemplateUtil.asElement(DisplayerErrorWidget_HTMLAnchorElement_refreshLink(instance))));
    templateFieldsMap.put("errorDetailsContainer", ElementWrapperWidget.getWidget(TemplateUtil.asElement(DisplayerErrorWidget_HTMLDivElement_errorDetailsContainer(instance))));
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfDisplayerErrorWidget), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("chevronRight"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onChevronRightClicked(event);
      }
    }, ClickEvent.getType());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("chevronDown"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onChevronDownClicked(event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((DisplayerErrorWidget) instance, contextManager);
  }

  public void destroyInstanceHelper(final DisplayerErrorWidget instance, final ContextManager contextManager) {
    TemplateUtil.cleanupWidget(instance);
  }

  native static HTMLDivElement DisplayerErrorWidget_HTMLDivElement_displayerErrorRoot(DisplayerErrorWidget instance) /*-{
    return instance.@org.dashbuilder.displayer.client.widgets.DisplayerErrorWidget::displayerErrorRoot;
  }-*/;

  native static void DisplayerErrorWidget_HTMLDivElement_displayerErrorRoot(DisplayerErrorWidget instance, HTMLDivElement value) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.DisplayerErrorWidget::displayerErrorRoot = value;
  }-*/;

  native static HTMLTextAreaElement DisplayerErrorWidget_HTMLTextAreaElement_errorDetails(DisplayerErrorWidget instance) /*-{
    return instance.@org.dashbuilder.displayer.client.widgets.DisplayerErrorWidget::errorDetails;
  }-*/;

  native static void DisplayerErrorWidget_HTMLTextAreaElement_errorDetails(DisplayerErrorWidget instance, HTMLTextAreaElement value) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.DisplayerErrorWidget::errorDetails = value;
  }-*/;

  native static HTMLAnchorElement DisplayerErrorWidget_HTMLAnchorElement_refreshLink(DisplayerErrorWidget instance) /*-{
    return instance.@org.dashbuilder.displayer.client.widgets.DisplayerErrorWidget::refreshLink;
  }-*/;

  native static void DisplayerErrorWidget_HTMLAnchorElement_refreshLink(DisplayerErrorWidget instance, HTMLAnchorElement value) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.DisplayerErrorWidget::refreshLink = value;
  }-*/;

  native static HTMLDivElement DisplayerErrorWidget_HTMLDivElement_errorDetailsSection(DisplayerErrorWidget instance) /*-{
    return instance.@org.dashbuilder.displayer.client.widgets.DisplayerErrorWidget::errorDetailsSection;
  }-*/;

  native static void DisplayerErrorWidget_HTMLDivElement_errorDetailsSection(DisplayerErrorWidget instance, HTMLDivElement value) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.DisplayerErrorWidget::errorDetailsSection = value;
  }-*/;

  native static HTMLParagraphElement DisplayerErrorWidget_HTMLParagraphElement_errorBody(DisplayerErrorWidget instance) /*-{
    return instance.@org.dashbuilder.displayer.client.widgets.DisplayerErrorWidget::errorBody;
  }-*/;

  native static void DisplayerErrorWidget_HTMLParagraphElement_errorBody(DisplayerErrorWidget instance, HTMLParagraphElement value) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.DisplayerErrorWidget::errorBody = value;
  }-*/;

  native static HTMLAnchorElement DisplayerErrorWidget_HTMLAnchorElement_chevronRight(DisplayerErrorWidget instance) /*-{
    return instance.@org.dashbuilder.displayer.client.widgets.DisplayerErrorWidget::chevronRight;
  }-*/;

  native static void DisplayerErrorWidget_HTMLAnchorElement_chevronRight(DisplayerErrorWidget instance, HTMLAnchorElement value) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.DisplayerErrorWidget::chevronRight = value;
  }-*/;

  native static HTMLDivElement DisplayerErrorWidget_HTMLDivElement_errorDetailsContainer(DisplayerErrorWidget instance) /*-{
    return instance.@org.dashbuilder.displayer.client.widgets.DisplayerErrorWidget::errorDetailsContainer;
  }-*/;

  native static void DisplayerErrorWidget_HTMLDivElement_errorDetailsContainer(DisplayerErrorWidget instance, HTMLDivElement value) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.DisplayerErrorWidget::errorDetailsContainer = value;
  }-*/;

  native static HTMLAnchorElement DisplayerErrorWidget_HTMLAnchorElement_chevronDown(DisplayerErrorWidget instance) /*-{
    return instance.@org.dashbuilder.displayer.client.widgets.DisplayerErrorWidget::chevronDown;
  }-*/;

  native static void DisplayerErrorWidget_HTMLAnchorElement_chevronDown(DisplayerErrorWidget instance, HTMLAnchorElement value) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.DisplayerErrorWidget::chevronDown = value;
  }-*/;
}