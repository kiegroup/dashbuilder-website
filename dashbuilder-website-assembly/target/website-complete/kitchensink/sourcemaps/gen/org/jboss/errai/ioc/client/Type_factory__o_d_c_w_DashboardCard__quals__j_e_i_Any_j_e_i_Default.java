package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.dashbuilder.client.screens.RouterScreen;
import org.dashbuilder.client.widgets.DashboardCard;
import org.dashbuilder.client.widgets.DashboardCard.View;
import org.dashbuilder.client.widgets.view.DashboardCardView;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ui.client.local.api.elemental2.IsElement;
import org.uberfire.client.mvp.PlaceManager;
import org.uberfire.client.mvp.PlaceManagerImpl;

public class Type_factory__o_d_c_w_DashboardCard__quals__j_e_i_Any_j_e_i_Default extends Factory<DashboardCard> { public Type_factory__o_d_c_w_DashboardCard__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(DashboardCard.class, "Type_factory__o_d_c_w_DashboardCard__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { DashboardCard.class, Object.class, IsElement.class, org.jboss.errai.common.client.api.elemental2.IsElement.class });
  }

  public DashboardCard createInstance(final ContextManager contextManager) {
    final DashboardCard instance = new DashboardCard();
    setIncompleteInstance(instance);
    final DashboardCardView DashboardCard_view = (DashboardCardView) contextManager.getInstance("Type_factory__o_d_c_w_v_DashboardCardView__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, DashboardCard_view);
    DashboardCard_View_view(instance, DashboardCard_view);
    final RouterScreen DashboardCard_routerScreen = (RouterScreen) contextManager.getInstance("Type_factory__o_d_c_s_RouterScreen__quals__j_e_i_Any_j_e_i_Default");
    DashboardCard_RouterScreen_routerScreen(instance, DashboardCard_routerScreen);
    final PlaceManagerImpl DashboardCard_placeManager = (PlaceManagerImpl) contextManager.getInstance("Type_factory__o_u_c_m_PlaceManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    DashboardCard_PlaceManager_placeManager(instance, DashboardCard_placeManager);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final DashboardCard instance) {
    instance.init();
  }

  native static RouterScreen DashboardCard_RouterScreen_routerScreen(DashboardCard instance) /*-{
    return instance.@org.dashbuilder.client.widgets.DashboardCard::routerScreen;
  }-*/;

  native static void DashboardCard_RouterScreen_routerScreen(DashboardCard instance, RouterScreen value) /*-{
    instance.@org.dashbuilder.client.widgets.DashboardCard::routerScreen = value;
  }-*/;

  native static PlaceManager DashboardCard_PlaceManager_placeManager(DashboardCard instance) /*-{
    return instance.@org.dashbuilder.client.widgets.DashboardCard::placeManager;
  }-*/;

  native static void DashboardCard_PlaceManager_placeManager(DashboardCard instance, PlaceManager value) /*-{
    instance.@org.dashbuilder.client.widgets.DashboardCard::placeManager = value;
  }-*/;

  native static View DashboardCard_View_view(DashboardCard instance) /*-{
    return instance.@org.dashbuilder.client.widgets.DashboardCard::view;
  }-*/;

  native static void DashboardCard_View_view(DashboardCard instance, View value) /*-{
    instance.@org.dashbuilder.client.widgets.DashboardCard::view = value;
  }-*/;
}