package org.jboss.errai.marshalling.client.api;

import java.util.List;
import java.util.Set;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.uberfire.ext.services.shared.preferences.GridGlobalPreferences;

public class Marshaller_o_u_e_s_s_p_GridGlobalPreferences_Impl implements GeneratedMarshaller<GridGlobalPreferences> {
  private GridGlobalPreferences[] EMPTY_ARRAY = new GridGlobalPreferences[0];
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller<List> java_util_List = Marshalling.getMarshaller(List.class);
  private Marshaller<Integer> java_lang_Integer = Marshalling.getMarshaller(Integer.class);
  public GridGlobalPreferences[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static String GridGlobalPreferences_String_key(GridGlobalPreferences instance) /*-{
    return instance.@org.uberfire.ext.services.shared.preferences.GridGlobalPreferences::key;
  }-*/;

  native static void GridGlobalPreferences_String_key(GridGlobalPreferences instance, String value) /*-{
    instance.@org.uberfire.ext.services.shared.preferences.GridGlobalPreferences::key = value;
  }-*/;

  native static List GridGlobalPreferences_List_initialColumns(GridGlobalPreferences instance) /*-{
    return instance.@org.uberfire.ext.services.shared.preferences.GridGlobalPreferences::initialColumns;
  }-*/;

  native static void GridGlobalPreferences_List_initialColumns(GridGlobalPreferences instance, List<String> value) /*-{
    instance.@org.uberfire.ext.services.shared.preferences.GridGlobalPreferences::initialColumns = value;
  }-*/;

  native static List GridGlobalPreferences_List_bannedColumns(GridGlobalPreferences instance) /*-{
    return instance.@org.uberfire.ext.services.shared.preferences.GridGlobalPreferences::bannedColumns;
  }-*/;

  native static void GridGlobalPreferences_List_bannedColumns(GridGlobalPreferences instance, List<String> value) /*-{
    instance.@org.uberfire.ext.services.shared.preferences.GridGlobalPreferences::bannedColumns = value;
  }-*/;

  public GridGlobalPreferences demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(GridGlobalPreferences.class, objId);
    }
    GridGlobalPreferences entity = new GridGlobalPreferences();
    a1.recordObject(objId, entity);
    final Set<String> keys = obj.keySet();
    for (String key : keys) {
      if (key.equals("^EncodedType") || key.equals("^ObjectID")) {
        continue;
      }
      EJValue objVal = obj.getIfNotNull(key);
      if (objVal == null) {
        continue;
      }
      switch (key) {
        case "key": GridGlobalPreferences_String_key(entity, java_lang_String.demarshall(objVal, a1));
        break;
        case "initialColumns": a1.setAssumedElementType("java.lang.String");
        GridGlobalPreferences_List_initialColumns(entity, java_util_List.demarshall(objVal, a1));
        break;
        case "bannedColumns": a1.setAssumedElementType("java.lang.String");
        GridGlobalPreferences_List_bannedColumns(entity, java_util_List.demarshall(objVal, a1));
        break;
        case "pageSize": entity.setPageSize(java_lang_Integer.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(GridGlobalPreferences a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.uberfire.ext.services.shared.preferences.GridGlobalPreferences") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((((((("" + ",\"") + "key") + "\":") + java_lang_String.marshall(a0.getKey(), a1)) + ",\"") + "initialColumns") + "\":") + java_util_List.marshall(a0.getInitialColumns(), a1)) + ",\"") + "bannedColumns") + "\":") + java_util_List.marshall(a0.getBannedColumns(), a1)) + ",\"") + "pageSize") + "\":") + java_lang_Integer.marshall(a0.getPageSize(), a1)) + "}");
  }

  private void lazyInit() {

  }
}