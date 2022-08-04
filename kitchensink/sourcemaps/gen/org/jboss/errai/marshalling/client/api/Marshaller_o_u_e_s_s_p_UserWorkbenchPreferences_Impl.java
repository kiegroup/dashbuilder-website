package org.jboss.errai.marshalling.client.api;

import java.util.Set;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.uberfire.ext.services.shared.preferences.UserPreferencesType;
import org.uberfire.ext.services.shared.preferences.UserWorkbenchPreferences;

public class Marshaller_o_u_e_s_s_p_UserWorkbenchPreferences_Impl implements GeneratedMarshaller<UserWorkbenchPreferences> {
  private UserWorkbenchPreferences[] EMPTY_ARRAY = new UserWorkbenchPreferences[0];
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller<Boolean> java_lang_Boolean = Marshalling.getMarshaller(Boolean.class);
  private Marshaller<UserPreferencesType> org_uberfire_ext_services_shared_preferences_UserPreferencesType = null;
  public UserWorkbenchPreferences[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public UserWorkbenchPreferences demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(UserWorkbenchPreferences.class, objId);
    }
    UserWorkbenchPreferences entity = new UserWorkbenchPreferences();
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
        case "language": entity.setLanguage(java_lang_String.demarshall(objVal, a1));
        break;
        case "useWorkbenchInCompactMode": entity.setUseWorkbenchInCompactMode(java_lang_Boolean.demarshall(objVal, a1));
        break;
        case "type": entity.setType(objVal.isObject() != null ? Enum.valueOf(UserPreferencesType.class, objVal.isObject().get("^EnumStringValue").isString().stringValue()) : objVal.isString() != null ? Enum.valueOf(UserPreferencesType.class, objVal.isString().stringValue()) : null);
        break;
        case "preferenceKey": entity.setPreferenceKey(java_lang_String.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  native static boolean UserWorkbenchPreferences_boolean_useWorkbenchInCompactMode(UserWorkbenchPreferences instance) /*-{
    return instance.@org.uberfire.ext.services.shared.preferences.UserWorkbenchPreferences::useWorkbenchInCompactMode;
  }-*/;

  native static void UserWorkbenchPreferences_boolean_useWorkbenchInCompactMode(UserWorkbenchPreferences instance, boolean value) /*-{
    instance.@org.uberfire.ext.services.shared.preferences.UserWorkbenchPreferences::useWorkbenchInCompactMode = value;
  }-*/;

  public String marshall(UserWorkbenchPreferences a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.uberfire.ext.services.shared.preferences.UserWorkbenchPreferences") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((((((("" + ",\"") + "language") + "\":") + java_lang_String.marshall(a0.getLanguage(), a1)) + ",\"") + "useWorkbenchInCompactMode") + "\":") + java_lang_Boolean.marshall(UserWorkbenchPreferences_boolean_useWorkbenchInCompactMode(a0), a1)) + ",\"") + "type") + "\":") + (a0.getType() != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.uberfire.ext.services.shared.preferences.UserPreferencesType") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.getType().name()) + "\"}" : "null")) + ",\"") + "preferenceKey") + "\":") + java_lang_String.marshall(a0.getPreferenceKey(), a1)) + "}");
  }

  private void lazyInit() {
    if (org_uberfire_ext_services_shared_preferences_UserPreferencesType == null) {
      org_uberfire_ext_services_shared_preferences_UserPreferencesType = Marshalling.getMarshaller(UserPreferencesType.class);
    }
  }
}