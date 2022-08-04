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
import org.dashbuilder.displayer.client.AbstractGwtDisplayer.View;
import org.dashbuilder.displayer.client.AbstractGwtDisplayerView;
import org.dashbuilder.renderer.c3.client.C3AbstractDisplayerView;
import org.dashbuilder.renderer.c3.client.charts.map.D3MapDisplayerView;
import org.dashbuilder.renderer.c3.client.charts.map.widgets.D3Map;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.uberfire.client.mvp.HasPresenter;
import org.uberfire.client.mvp.UberView;

public class Type_factory__o_d_r_c_c_c_m_D3MapDisplayerView__quals__j_e_i_Any_j_e_i_Default extends Factory<D3MapDisplayerView> { public Type_factory__o_d_r_c_c_c_m_D3MapDisplayerView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(D3MapDisplayerView.class, "Type_factory__o_d_r_c_c_c_m_D3MapDisplayerView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { D3MapDisplayerView.class, C3AbstractDisplayerView.class, AbstractGwtDisplayerView.class, Composite.class, Widget.class, UIObject.class, Object.class, HasVisibility.class, EventListener.class, HasAttachHandlers.class, HasHandlers.class, IsWidget.class, IsRenderable.class, View.class, org.dashbuilder.displayer.client.AbstractDisplayer.View.class, UberView.class, HasPresenter.class, org.dashbuilder.renderer.c3.client.C3AbstractDisplayer.View.class, org.dashbuilder.renderer.c3.client.charts.map.D3MapDisplayer.View.class });
  }

  public D3MapDisplayerView createInstance(final ContextManager contextManager) {
    final D3Map _map_0 = (D3Map) contextManager.getInstance("Type_factory__o_d_r_c_c_c_m_w_D3Map__quals__j_e_i_Any_j_e_i_Default");
    final D3MapDisplayerView instance = new D3MapDisplayerView(_map_0);
    registerDependentScopedReference(instance, _map_0);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}