package org.jboss.errai.ioc.client;

import com.google.gwt.event.logical.shared.HasAttachHandlers;
import com.google.gwt.event.shared.HasHandlers;
import com.google.gwt.user.client.EventListener;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasVisibility;
import com.google.gwt.user.client.ui.IsRenderable;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.UIObject;
import com.google.gwt.user.client.ui.Widget;
import javax.enterprise.context.Dependent;
import org.dashbuilder.displayer.client.widgets.DisplayerSettingsEditor.View;
import org.dashbuilder.displayer.client.widgets.DisplayerSettingsEditorView;
import org.jboss.errai.bus.client.api.Subscription;
import org.jboss.errai.enterprise.client.cdi.AbstractCDIEventCallback;
import org.jboss.errai.enterprise.client.cdi.api.CDI;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.uberfire.client.mvp.HasPresenter;
import org.uberfire.client.mvp.UberView;
import org.uberfire.ext.properties.editor.model.PropertyEditorChangeEvent;

public class Type_factory__o_d_d_c_w_DisplayerSettingsEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerSettingsEditorView> { public Type_factory__o_d_d_c_w_DisplayerSettingsEditorView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(DisplayerSettingsEditorView.class, "Type_factory__o_d_d_c_w_DisplayerSettingsEditorView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { DisplayerSettingsEditorView.class, Composite.class, Widget.class, UIObject.class, Object.class, HasVisibility.class, EventListener.class, HasAttachHandlers.class, HasHandlers.class, IsWidget.class, IsRenderable.class, View.class, UberView.class, HasPresenter.class });
  }

  public DisplayerSettingsEditorView createInstance(final ContextManager contextManager) {
    final DisplayerSettingsEditorView instance = new DisplayerSettingsEditorView();
    setIncompleteInstance(instance);
    thisInstance.setReference(instance, "onPropertyEditorChangeSubscription", CDI.subscribeLocal("org.uberfire.ext.properties.editor.model.PropertyEditorChangeEvent", new AbstractCDIEventCallback<PropertyEditorChangeEvent>() {
      public void fireEvent(final PropertyEditorChangeEvent event) {
        DisplayerSettingsEditorView_onPropertyEditorChange_PropertyEditorChangeEvent(instance, event);
      }
      public String toString() {
        return "Observer: org.uberfire.ext.properties.editor.model.PropertyEditorChangeEvent []";
      }
    }));
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((DisplayerSettingsEditorView) instance, contextManager);
  }

  public void destroyInstanceHelper(final DisplayerSettingsEditorView instance, final ContextManager contextManager) {
    ((Subscription) thisInstance.getReferenceAs(instance, "onPropertyEditorChangeSubscription", Subscription.class)).remove();
  }

  public native static void DisplayerSettingsEditorView_onPropertyEditorChange_PropertyEditorChangeEvent(DisplayerSettingsEditorView instance, PropertyEditorChangeEvent a0) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.DisplayerSettingsEditorView::onPropertyEditorChange(Lorg/uberfire/ext/properties/editor/model/PropertyEditorChangeEvent;)(a0);
  }-*/;
}