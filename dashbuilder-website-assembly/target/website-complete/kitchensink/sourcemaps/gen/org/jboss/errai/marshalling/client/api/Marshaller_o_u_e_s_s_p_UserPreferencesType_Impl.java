package org.jboss.errai.marshalling.client.api;

import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.uberfire.ext.services.shared.preferences.UserPreferencesType;

public class Marshaller_o_u_e_s_s_p_UserPreferencesType_Impl implements GeneratedMarshaller<UserPreferencesType> {
  private UserPreferencesType[] EMPTY_ARRAY = new UserPreferencesType[0];
  public UserPreferencesType[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public UserPreferencesType demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    UserPreferencesType entity = obj != null ? Enum.valueOf(UserPreferencesType.class, obj.get("^EnumStringValue").isString().stringValue()) : a0.isString() != null ? Enum.valueOf(UserPreferencesType.class, a0.isString().stringValue()) : null;
    return entity;
  }

  public String marshall(UserPreferencesType a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    return a0 != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.uberfire.ext.services.shared.preferences.UserPreferencesType") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.name()) + "\"}" : "null";
  }

  private void lazyInit() {

  }
}