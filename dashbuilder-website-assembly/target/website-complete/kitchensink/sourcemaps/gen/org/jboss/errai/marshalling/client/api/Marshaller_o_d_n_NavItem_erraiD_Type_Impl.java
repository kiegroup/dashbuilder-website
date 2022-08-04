package org.jboss.errai.marshalling.client.api;

import org.dashbuilder.navigation.NavItem.Type;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_n_NavItem_erraiD_Type_Impl implements GeneratedMarshaller<Type> {
  private Type[] EMPTY_ARRAY = new Type[0];
  public Type[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public Type demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    Type entity = obj != null ? Enum.valueOf(Type.class, obj.get("^EnumStringValue").isString().stringValue()) : a0.isString() != null ? Enum.valueOf(Type.class, a0.isString().stringValue()) : null;
    return entity;
  }

  public String marshall(Type a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    return a0 != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.dashbuilder.navigation.NavItem$Type") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.name()) + "\"}" : "null";
  }

  private void lazyInit() {

  }
}