package org.jboss.errai.marshalling.client.api;

import org.dashbuilder.dataset.group.DateIntervalType;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_d_g_DateIntervalType_Impl implements GeneratedMarshaller<DateIntervalType> {
  private DateIntervalType[] EMPTY_ARRAY = new DateIntervalType[0];
  public DateIntervalType[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public DateIntervalType demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    DateIntervalType entity = obj != null ? Enum.valueOf(DateIntervalType.class, obj.get("^EnumStringValue").isString().stringValue()) : a0.isString() != null ? Enum.valueOf(DateIntervalType.class, a0.isString().stringValue()) : null;
    return entity;
  }

  public String marshall(DateIntervalType a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    return a0 != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.dashbuilder.dataset.group.DateIntervalType") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.name()) + "\"}" : "null";
  }

  private void lazyInit() {

  }
}