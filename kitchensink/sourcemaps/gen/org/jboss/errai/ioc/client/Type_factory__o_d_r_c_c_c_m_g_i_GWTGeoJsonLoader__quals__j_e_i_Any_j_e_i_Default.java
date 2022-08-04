package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.dashbuilder.renderer.c3.client.charts.map.geojson.GeoJsonLoader;
import org.dashbuilder.renderer.c3.client.charts.map.geojson.impl.GWTGeoJsonLoader;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_r_c_c_c_m_g_i_GWTGeoJsonLoader__quals__j_e_i_Any_j_e_i_Default extends Factory<GWTGeoJsonLoader> { public Type_factory__o_d_r_c_c_c_m_g_i_GWTGeoJsonLoader__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(GWTGeoJsonLoader.class, "Type_factory__o_d_r_c_c_c_m_g_i_GWTGeoJsonLoader__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { GWTGeoJsonLoader.class, Object.class, GeoJsonLoader.class });
  }

  public GWTGeoJsonLoader createInstance(final ContextManager contextManager) {
    final GWTGeoJsonLoader instance = new GWTGeoJsonLoader();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}