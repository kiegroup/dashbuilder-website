package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.dashbuilder.client.editor.DisplayerDragComponent;
import org.dashbuilder.client.editor.MetricDragComponent;
import org.dashbuilder.displayer.client.PerspectiveCoordinator;
import org.dashbuilder.displayer.client.widgets.DisplayerViewer;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.SyncBeanManager;
import org.uberfire.client.mvp.PlaceManager;
import org.uberfire.client.mvp.PlaceManagerImpl;
import org.uberfire.ext.layout.editor.client.api.HasConfiguration;
import org.uberfire.ext.layout.editor.client.api.HasModalConfiguration;
import org.uberfire.ext.layout.editor.client.api.LayoutDragComponent;

public class Type_factory__o_d_c_e_MetricDragComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<MetricDragComponent> { public Type_factory__o_d_c_e_MetricDragComponent__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(MetricDragComponent.class, "Type_factory__o_d_c_e_MetricDragComponent__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { MetricDragComponent.class, DisplayerDragComponent.class, Object.class, LayoutDragComponent.class, HasModalConfiguration.class, HasConfiguration.class });
  }

  public MetricDragComponent createInstance(final ContextManager contextManager) {
    final PlaceManager _placeManager_2 = (PlaceManagerImpl) contextManager.getInstance("Type_factory__o_u_c_m_PlaceManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    final SyncBeanManager _beanManager_0 = (SyncBeanManager) contextManager.getInstance("Producer_factory__o_j_e_i_c_c_SyncBeanManager__quals__j_e_i_Any_j_e_i_Default");
    final DisplayerViewer _viewer_1 = (DisplayerViewer) contextManager.getInstance("Type_factory__o_d_d_c_w_DisplayerViewer__quals__j_e_i_Any_j_e_i_Default");
    final PerspectiveCoordinator _perspectiveCoordinator_3 = (PerspectiveCoordinator) contextManager.getInstance("Type_factory__o_d_d_c_PerspectiveCoordinator__quals__j_e_i_Any_j_e_i_Default");
    final MetricDragComponent instance = new MetricDragComponent(_beanManager_0, _viewer_1, _placeManager_2, _perspectiveCoordinator_3);
    registerDependentScopedReference(instance, _beanManager_0);
    registerDependentScopedReference(instance, _viewer_1);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}