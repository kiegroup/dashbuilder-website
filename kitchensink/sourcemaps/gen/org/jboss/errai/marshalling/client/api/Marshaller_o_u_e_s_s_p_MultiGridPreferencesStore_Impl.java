package org.jboss.errai.marshalling.client.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.uberfire.ext.services.shared.preferences.MultiGridPreferencesStore;
import org.uberfire.ext.services.shared.preferences.UserPreferencesType;

public class Marshaller_o_u_e_s_s_p_MultiGridPreferencesStore_Impl implements GeneratedMarshaller<MultiGridPreferencesStore> {
  private MultiGridPreferencesStore[] EMPTY_ARRAY = new MultiGridPreferencesStore[0];
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller<HashMap> java_util_HashMap = null;
  private Marshaller<ArrayList> java_util_ArrayList = null;
  private Marshaller<Integer> java_lang_Integer = Marshalling.getMarshaller(Integer.class);
  private Marshaller<UserPreferencesType> org_uberfire_ext_services_shared_preferences_UserPreferencesType = null;
  public MultiGridPreferencesStore[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static HashMap MultiGridPreferencesStore_HashMap_gridsSettings(MultiGridPreferencesStore instance) /*-{
    return instance.@org.uberfire.ext.services.shared.preferences.MultiGridPreferencesStore::gridsSettings;
  }-*/;

  native static void MultiGridPreferencesStore_HashMap_gridsSettings(MultiGridPreferencesStore instance, HashMap<String, HashMap> value) /*-{
    instance.@org.uberfire.ext.services.shared.preferences.MultiGridPreferencesStore::gridsSettings = value;
  }-*/;

  native static ArrayList MultiGridPreferencesStore_ArrayList_gridsIds(MultiGridPreferencesStore instance) /*-{
    return instance.@org.uberfire.ext.services.shared.preferences.MultiGridPreferencesStore::gridsIds;
  }-*/;

  native static void MultiGridPreferencesStore_ArrayList_gridsIds(MultiGridPreferencesStore instance, ArrayList<String> value) /*-{
    instance.@org.uberfire.ext.services.shared.preferences.MultiGridPreferencesStore::gridsIds = value;
  }-*/;

  public MultiGridPreferencesStore demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(MultiGridPreferencesStore.class, objId);
    }
    MultiGridPreferencesStore entity = new MultiGridPreferencesStore();
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
        case "multiGridId": entity.setMultiGridId(java_lang_String.demarshall(objVal, a1));
        break;
        case "gridsSettings": a1.setAssumedMapKeyType("java.lang.String");
        a1.setAssumedMapValueType("java.util.HashMap");
        MultiGridPreferencesStore_HashMap_gridsSettings(entity, java_util_HashMap.demarshall(objVal, a1));
        a1.resetAssumedTypes();
        break;
        case "gridsIds": a1.setAssumedElementType("java.lang.String");
        MultiGridPreferencesStore_ArrayList_gridsIds(entity, java_util_ArrayList.demarshall(objVal, a1));
        break;
        case "selectedGrid": entity.setSelectedGrid(java_lang_String.demarshall(objVal, a1));
        break;
        case "refreshInterval": entity.setRefreshInterval(java_lang_Integer.demarshall(objVal, a1));
        break;
        case "defaultGridId": entity.setDefaultGridId(java_lang_String.demarshall(objVal, a1));
        break;
        case "type": entity.setType(objVal.isObject() != null ? Enum.valueOf(UserPreferencesType.class, objVal.isObject().get("^EnumStringValue").isString().stringValue()) : objVal.isString() != null ? Enum.valueOf(UserPreferencesType.class, objVal.isString().stringValue()) : null);
        break;
        case "preferenceKey": entity.setPreferenceKey(java_lang_String.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(MultiGridPreferencesStore a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.uberfire.ext.services.shared.preferences.MultiGridPreferencesStore") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((((((((((((((((((((((("" + ",\"") + "multiGridId") + "\":") + java_lang_String.marshall(a0.getMultiGridId(), a1)) + ",\"") + "gridsSettings") + "\":") + java_util_HashMap.marshall(MultiGridPreferencesStore_HashMap_gridsSettings(a0), a1)) + ",\"") + "gridsIds") + "\":") + java_util_ArrayList.marshall(MultiGridPreferencesStore_ArrayList_gridsIds(a0), a1)) + ",\"") + "selectedGrid") + "\":") + java_lang_String.marshall(a0.getSelectedGrid(), a1)) + ",\"") + "refreshInterval") + "\":") + java_lang_Integer.marshall(a0.getRefreshInterval(), a1)) + ",\"") + "defaultGridId") + "\":") + java_lang_String.marshall(a0.getDefaultGridId(), a1)) + ",\"") + "type") + "\":") + (a0.getType() != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.uberfire.ext.services.shared.preferences.UserPreferencesType") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.getType().name()) + "\"}" : "null")) + ",\"") + "preferenceKey") + "\":") + java_lang_String.marshall(a0.getPreferenceKey(), a1)) + "}");
  }

  private void lazyInit() {
    if (java_util_HashMap == null) {
      java_util_HashMap = Marshalling.getMarshaller(HashMap.class);
    }
    if (java_util_ArrayList == null) {
      java_util_ArrayList = Marshalling.getMarshaller(ArrayList.class);
    }
    if (org_uberfire_ext_services_shared_preferences_UserPreferencesType == null) {
      org_uberfire_ext_services_shared_preferences_UserPreferencesType = Marshalling.getMarshaller(UserPreferencesType.class);
    }
  }
}