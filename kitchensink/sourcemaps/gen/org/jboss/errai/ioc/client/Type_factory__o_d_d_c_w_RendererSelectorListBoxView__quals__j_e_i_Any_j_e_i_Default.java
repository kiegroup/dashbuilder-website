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
import org.dashbuilder.displayer.client.widgets.RendererSelector.ListBoxView;
import org.dashbuilder.displayer.client.widgets.RendererSelector.View;
import org.dashbuilder.displayer.client.widgets.RendererSelectorListBoxView;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.uberfire.client.mvp.HasPresenter;
import org.uberfire.client.mvp.UberView;

public class Type_factory__o_d_d_c_w_RendererSelectorListBoxView__quals__j_e_i_Any_j_e_i_Default extends Factory<RendererSelectorListBoxView> { public Type_factory__o_d_d_c_w_RendererSelectorListBoxView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(RendererSelectorListBoxView.class, "Type_factory__o_d_d_c_w_RendererSelectorListBoxView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { RendererSelectorListBoxView.class, Composite.class, Widget.class, UIObject.class, Object.class, HasVisibility.class, EventListener.class, HasAttachHandlers.class, HasHandlers.class, IsWidget.class, IsRenderable.class, ListBoxView.class, View.class, UberView.class, HasPresenter.class });
  }

  public RendererSelectorListBoxView createInstance(final ContextManager contextManager) {
    final RendererSelectorListBoxView instance = new RendererSelectorListBoxView();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}