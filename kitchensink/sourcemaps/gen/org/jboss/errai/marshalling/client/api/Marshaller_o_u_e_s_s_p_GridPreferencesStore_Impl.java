package org.jboss.errai.marshalling.client.api;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.uberfire.ext.services.shared.preferences.GridColumnPreference;
import org.uberfire.ext.services.shared.preferences.GridGlobalPreferences;
import org.uberfire.ext.services.shared.preferences.GridPreferencesStore;
import org.uberfire.ext.services.shared.preferences.GridSortedColumnPreference;
import org.uberfire.ext.services.shared.preferences.UserPreferencesType;

public class Marshaller_o_u_e_s_s_p_GridPreferencesStore_Impl implements GeneratedMarshaller<GridPreferencesStore> {
  private GridPreferencesStore[] EMPTY_ARRAY = new GridPreferencesStore[0];
  private Marshaller<GridGlobalPreferences> org_uberfire_ext_services_shared_preferences_GridGlobalPreferences = null;
  private Marshaller<List> java_util_List = Marshalling.getMarshaller(List.class);
  private Marshaller<Integer> java_lang_Integer = Marshalling.getMarshaller(Integer.class);
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller<HashMap> java_util_HashMap = null;
  private Marshaller<GridSortedColumnPreference> org_uberfire_ext_services_shared_preferences_GridSortedColumnPreference = null;
  private Marshaller<UserPreferencesType> org_uberfire_ext_services_shared_preferences_UserPreferencesType = null;
  public GridPreferencesStore[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static GridGlobalPreferences GridPreferencesStore_GridGlobalPreferences_globalPreferences(GridPreferencesStore instance) /*-{
    return instance.@org.uberfire.ext.services.shared.preferences.GridPreferencesStore::globalPreferences;
  }-*/;

  native static void GridPreferencesStore_GridGlobalPreferences_globalPreferences(GridPreferencesStore instance, GridGlobalPreferences value) /*-{
    instance.@org.uberfire.ext.services.shared.preferences.GridPreferencesStore::globalPreferences = value;
  }-*/;

  native static List GridPreferencesStore_List_columnPreferences(GridPreferencesStore instance) /*-{
    return instance.@org.uberfire.ext.services.shared.preferences.GridPreferencesStore::columnPreferences;
  }-*/;

  native static void GridPreferencesStore_List_columnPreferences(GridPreferencesStore instance, List<GridColumnPreference> value) /*-{
    instance.@org.uberfire.ext.services.shared.preferences.GridPreferencesStore::columnPreferences = value;
  }-*/;

  native static HashMap GridPreferencesStore_HashMap_customFilters(GridPreferencesStore instance) /*-{
    return instance.@org.uberfire.ext.services.shared.preferences.GridPreferencesStore::customFilters;
  }-*/;

  native static void GridPreferencesStore_HashMap_customFilters(GridPreferencesStore instance, HashMap<String, HashMap> value) /*-{
    instance.@org.uberfire.ext.services.shared.preferences.GridPreferencesStore::customFilters = value;
  }-*/;

  public GridPreferencesStore demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(GridPreferencesStore.class, objId);
    }
    GridPreferencesStore entity = new GridPreferencesStore();
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
        case "globalPreferences": GridPreferencesStore_GridGlobalPreferences_globalPreferences(entity, org_uberfire_ext_services_shared_preferences_GridGlobalPreferences.demarshall(objVal, a1));
        break;
        case "columnPreferences": a1.setAssumedElementType("org.uberfire.ext.services.shared.preferences.GridColumnPreference");
        GridPreferencesStore_List_columnPreferences(entity, java_util_List.demarshall(objVal, a1));
        break;
        case "pageSizePreferences": entity.setPageSizePreferences(java_lang_Integer.demarshall(objVal, a1));
        break;
        case "selectedFilterKey": entity.setSelectedFilterKey(java_lang_String.demarshall(objVal, a1));
        break;
        case "customFilters": a1.setAssumedMapKeyType("java.lang.String");
        a1.setAssumedMapValueType("java.util.HashMap");
        GridPreferencesStore_HashMap_customFilters(entity, java_util_HashMap.demarshall(objVal, a1));
        a1.resetAssumedTypes();
        break;
        case "gridSortedColumnPreference": entity.setGridSortedColumnPreference(org_uberfire_ext_services_shared_preferences_GridSortedColumnPreference.demarshall(objVal, a1));
        break;
        case "type": entity.setType(objVal.isObject() != null ? Enum.valueOf(UserPreferencesType.class, objVal.isObject().get("^EnumStringValue").isString().stringValue()) : objVal.isString() != null ? Enum.valueOf(UserPreferencesType.class, objVal.isString().stringValue()) : null);
        break;
        case "preferenceKey": entity.setPreferenceKey(java_lang_String.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(GridPreferencesStore a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.uberfire.ext.services.shared.preferences.GridPreferencesStore") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((((((((((((((((((((((("" + ",\"") + "globalPreferences") + "\":") + org_uberfire_ext_services_shared_preferences_GridGlobalPreferences.marshall(a0.getGlobalPreferences(), a1)) + ",\"") + "columnPreferences") + "\":") + java_util_List.marshall(a0.getColumnPreferences(), a1)) + ",\"") + "pageSizePreferences") + "\":") + java_lang_Integer.marshall(a0.getPageSizePreferences(), a1)) + ",\"") + "selectedFilterKey") + "\":") + java_lang_String.marshall(a0.getSelectedFilterKey(), a1)) + ",\"") + "customFilters") + "\":") + java_util_HashMap.marshall(a0.getCustomFilters(), a1)) + ",\"") + "gridSortedColumnPreference") + "\":") + org_uberfire_ext_services_shared_preferences_GridSortedColumnPreference.marshall(a0.getGridSortedColumnPreference(), a1)) + ",\"") + "type") + "\":") + (a0.getType() != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.uberfire.ext.services.shared.preferences.UserPreferencesType") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.getType().name()) + "\"}" : "null")) + ",\"") + "preferenceKey") + "\":") + java_lang_String.marshall(a0.getPreferenceKey(), a1)) + "}");
  }

  private void lazyInit() {
    if (org_uberfire_ext_services_shared_preferences_GridGlobalPreferences == null) {
      org_uberfire_ext_services_shared_preferences_GridGlobalPreferences = Marshalling.getMarshaller(GridGlobalPreferences.class);
    }
    if (java_util_HashMap == null) {
      java_util_HashMap = Marshalling.getMarshaller(HashMap.class);
    }
    if (org_uberfire_ext_services_shared_preferences_GridSortedColumnPreference == null) {
      org_uberfire_ext_services_shared_preferences_GridSortedColumnPreference = Marshalling.getMarshaller(GridSortedColumnPreference.class);
    }
    if (org_uberfire_ext_services_shared_preferences_UserPreferencesType == null) {
      org_uberfire_ext_services_shared_preferences_UserPreferencesType = Marshalling.getMarshaller(UserPreferencesType.class);
    }
  }
}