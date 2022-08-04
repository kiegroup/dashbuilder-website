package org.jboss.errai.marshalling.client.api;

import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.uberfire.ext.services.shared.preferences.GridSortedColumnPreference;

public class Marshaller_o_u_e_s_s_p_GridSortedColumnPreference_Impl implements GeneratedMarshaller<GridSortedColumnPreference> {
  private GridSortedColumnPreference[] EMPTY_ARRAY = new GridSortedColumnPreference[0];
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller<Boolean> java_lang_Boolean = Marshalling.getMarshaller(Boolean.class);
  public GridSortedColumnPreference[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public GridSortedColumnPreference demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(GridSortedColumnPreference.class, objId);
    }
    final String c0 = java_lang_String.demarshall(obj.get("dataStoreName"), a1);
    final Boolean c1 = java_lang_Boolean.demarshall(obj.get("ascending"), a1);
    GridSortedColumnPreference entity = new GridSortedColumnPreference(c0, c1);
    a1.recordObject(objId, entity);
    return entity;
  }

  public String marshall(GridSortedColumnPreference a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.uberfire.ext.services.shared.preferences.GridSortedColumnPreference") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((("" + ",\"") + "dataStoreName") + "\":") + java_lang_String.marshall(a0.getDataStoreName(), a1)) + ",\"") + "ascending") + "\":") + java_lang_Boolean.marshall(a0.isAscending(), a1)) + "}");
  }

  private void lazyInit() {

  }
}