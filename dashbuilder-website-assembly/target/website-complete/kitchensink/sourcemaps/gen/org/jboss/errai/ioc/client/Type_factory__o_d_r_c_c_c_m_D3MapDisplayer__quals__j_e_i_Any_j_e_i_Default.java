package org.jboss.errai.ioc.client;

import com.google.gwt.user.client.ui.IsWidget;
import javax.enterprise.context.Dependent;
import org.dashbuilder.common.client.widgets.FilterLabelSet;
import org.dashbuilder.displayer.client.AbstractDisplayer;
import org.dashbuilder.displayer.client.AbstractGwtDisplayer;
import org.dashbuilder.displayer.client.Displayer;
import org.dashbuilder.displayer.client.DisplayerListener;
import org.dashbuilder.renderer.c3.client.C3AbstractDisplayer;
import org.dashbuilder.renderer.c3.client.charts.map.D3MapDisplayer;
import org.dashbuilder.renderer.c3.client.charts.map.D3MapDisplayer.View;
import org.dashbuilder.renderer.c3.client.charts.map.D3MapDisplayerView;
import org.dashbuilder.renderer.c3.client.charts.map.geojson.CountriesGeoJsonService;
import org.dashbuilder.renderer.c3.client.charts.map.geojson.impl.CountriesGeoJsonServiceImpl;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_r_c_c_c_m_D3MapDisplayer__quals__j_e_i_Any_j_e_i_Default extends Factory<D3MapDisplayer> { public Type_factory__o_d_r_c_c_c_m_D3MapDisplayer__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(D3MapDisplayer.class, "Type_factory__o_d_r_c_c_c_m_D3MapDisplayer__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { D3MapDisplayer.class, C3AbstractDisplayer.class, AbstractGwtDisplayer.class, AbstractDisplayer.class, Object.class, Displayer.class, DisplayerListener.class, IsWidget.class });
  }

  public D3MapDisplayer createInstance(final ContextManager contextManager) {
    final View _view_1 = (D3MapDisplayerView) contextManager.getInstance("Type_factory__o_d_r_c_c_c_m_D3MapDisplayerView__quals__j_e_i_Any_j_e_i_Default");
    final FilterLabelSet _filterLabelSet_0 = (FilterLabelSet) contextManager.getInstance("Type_factory__o_d_c_c_w_FilterLabelSet__quals__j_e_i_Any_j_e_i_Default");
    final CountriesGeoJsonService _countriesGeoJsonService_2 = (CountriesGeoJsonServiceImpl) contextManager.getInstance("Type_factory__o_d_r_c_c_c_m_g_i_CountriesGeoJsonServiceImpl__quals__j_e_i_Any_j_e_i_Default");
    final D3MapDisplayer instance = new D3MapDisplayer(_filterLabelSet_0, _view_1, _countriesGeoJsonService_2);
    registerDependentScopedReference(instance, _view_1);
    registerDependentScopedReference(instance, _filterLabelSet_0);
    registerDependentScopedReference(instance, _countriesGeoJsonService_2);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}