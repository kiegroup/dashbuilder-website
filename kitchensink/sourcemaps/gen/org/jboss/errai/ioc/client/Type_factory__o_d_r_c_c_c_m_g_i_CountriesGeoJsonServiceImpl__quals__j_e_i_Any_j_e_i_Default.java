package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.dashbuilder.renderer.c3.client.charts.map.geojson.CountriesGeoJsonService;
import org.dashbuilder.renderer.c3.client.charts.map.geojson.GeoJsonLoader;
import org.dashbuilder.renderer.c3.client.charts.map.geojson.impl.CountriesGeoJsonServiceImpl;
import org.dashbuilder.renderer.c3.client.charts.map.geojson.impl.GWTGeoJsonLoader;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_r_c_c_c_m_g_i_CountriesGeoJsonServiceImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<CountriesGeoJsonServiceImpl> { public Type_factory__o_d_r_c_c_c_m_g_i_CountriesGeoJsonServiceImpl__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(CountriesGeoJsonServiceImpl.class, "Type_factory__o_d_r_c_c_c_m_g_i_CountriesGeoJsonServiceImpl__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { CountriesGeoJsonServiceImpl.class, Object.class, CountriesGeoJsonService.class });
  }

  public CountriesGeoJsonServiceImpl createInstance(final ContextManager contextManager) {
    final CountriesGeoJsonServiceImpl instance = new CountriesGeoJsonServiceImpl();
    setIncompleteInstance(instance);
    final GWTGeoJsonLoader CountriesGeoJsonServiceImpl_geoJsonLoader = (GWTGeoJsonLoader) contextManager.getInstance("Type_factory__o_d_r_c_c_c_m_g_i_GWTGeoJsonLoader__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, CountriesGeoJsonServiceImpl_geoJsonLoader);
    CountriesGeoJsonServiceImpl_GeoJsonLoader_geoJsonLoader(instance, CountriesGeoJsonServiceImpl_geoJsonLoader);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final CountriesGeoJsonServiceImpl instance) {
    instance.setup();
  }

  native static GeoJsonLoader CountriesGeoJsonServiceImpl_GeoJsonLoader_geoJsonLoader(CountriesGeoJsonServiceImpl instance) /*-{
    return instance.@org.dashbuilder.renderer.c3.client.charts.map.geojson.impl.CountriesGeoJsonServiceImpl::geoJsonLoader;
  }-*/;

  native static void CountriesGeoJsonServiceImpl_GeoJsonLoader_geoJsonLoader(CountriesGeoJsonServiceImpl instance, GeoJsonLoader value) /*-{
    instance.@org.dashbuilder.renderer.c3.client.charts.map.geojson.impl.CountriesGeoJsonServiceImpl::geoJsonLoader = value;
  }-*/;
}