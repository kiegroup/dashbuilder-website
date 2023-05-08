package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.dashbuilder.client.screens.RouterScreen;
import org.dashbuilder.client.widgets.SampleCard;
import org.dashbuilder.client.widgets.SampleCard.View;
import org.dashbuilder.client.widgets.view.SampleCardView;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ui.client.local.api.elemental2.IsElement;
import org.uberfire.client.mvp.PlaceManager;
import org.uberfire.client.mvp.PlaceManagerImpl;

public class Type_factory__o_d_c_w_SampleCard__quals__j_e_i_Any_j_e_i_Default extends Factory<SampleCard> { public Type_factory__o_d_c_w_SampleCard__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(SampleCard.class, "Type_factory__o_d_c_w_SampleCard__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { SampleCard.class, Object.class, IsElement.class, org.jboss.errai.common.client.api.elemental2.IsElement.class });
  }

  public SampleCard createInstance(final ContextManager contextManager) {
    final SampleCard instance = new SampleCard();
    setIncompleteInstance(instance);
    final RouterScreen SampleCard_routerScreen = (RouterScreen) contextManager.getInstance("Type_factory__o_d_c_s_RouterScreen__quals__j_e_i_Any_j_e_i_Default");
    SampleCard_RouterScreen_routerScreen(instance, SampleCard_routerScreen);
    final SampleCardView SampleCard_view = (SampleCardView) contextManager.getInstance("Type_factory__o_d_c_w_v_SampleCardView__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, SampleCard_view);
    SampleCard_View_view(instance, SampleCard_view);
    final PlaceManagerImpl SampleCard_placeManager = (PlaceManagerImpl) contextManager.getInstance("Type_factory__o_u_c_m_PlaceManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    SampleCard_PlaceManager_placeManager(instance, SampleCard_placeManager);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final SampleCard instance) {
    instance.init();
  }

  native static View SampleCard_View_view(SampleCard instance) /*-{
    return instance.@org.dashbuilder.client.widgets.SampleCard::view;
  }-*/;

  native static void SampleCard_View_view(SampleCard instance, View value) /*-{
    instance.@org.dashbuilder.client.widgets.SampleCard::view = value;
  }-*/;

  native static RouterScreen SampleCard_RouterScreen_routerScreen(SampleCard instance) /*-{
    return instance.@org.dashbuilder.client.widgets.SampleCard::routerScreen;
  }-*/;

  native static void SampleCard_RouterScreen_routerScreen(SampleCard instance, RouterScreen value) /*-{
    instance.@org.dashbuilder.client.widgets.SampleCard::routerScreen = value;
  }-*/;

  native static PlaceManager SampleCard_PlaceManager_placeManager(SampleCard instance) /*-{
    return instance.@org.dashbuilder.client.widgets.SampleCard::placeManager;
  }-*/;

  native static void SampleCard_PlaceManager_placeManager(SampleCard instance, PlaceManager value) /*-{
    instance.@org.dashbuilder.client.widgets.SampleCard::placeManager = value;
  }-*/;
}