package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import javax.enterprise.event.Event;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.uberfire.client.docks.view.DocksBars;
import org.uberfire.client.docks.view.menu.MenuBuilder;
import org.uberfire.client.mvp.PlaceManager;
import org.uberfire.client.mvp.PlaceManagerImpl;
import org.uberfire.client.workbench.docks.UberfireDocksContainer;
import org.uberfire.client.workbench.docks.UberfireDocksInteractionEvent;

public class Type_factory__o_u_c_d_v_DocksBars__quals__j_e_i_Any_j_e_i_Default extends Factory<DocksBars> { public Type_factory__o_u_c_d_v_DocksBars__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(DocksBars.class, "Type_factory__o_u_c_d_v_DocksBars__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { DocksBars.class, Object.class });
  }

  public DocksBars createInstance(final ContextManager contextManager) {
    final Event<UberfireDocksInteractionEvent> _dockInteractionEvent_2 = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { UberfireDocksInteractionEvent.class }, new Annotation[] { });
    final PlaceManager _placeManager_0 = (PlaceManagerImpl) contextManager.getInstance("Type_factory__o_u_c_m_PlaceManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    final UberfireDocksContainer _uberfireDocksContainer_3 = (UberfireDocksContainer) contextManager.getInstance("Type_factory__o_u_c_w_d_UberfireDocksContainer__quals__j_e_i_Any_j_e_i_Default");
    final MenuBuilder _menuBuilder_1 = (MenuBuilder) contextManager.getInstance("Type_factory__o_u_c_d_v_m_MenuBuilder__quals__j_e_i_Any_j_e_i_Default");
    final DocksBars instance = new DocksBars(_placeManager_0, _menuBuilder_1, _dockInteractionEvent_2, _uberfireDocksContainer_3);
    registerDependentScopedReference(instance, _dockInteractionEvent_2);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}