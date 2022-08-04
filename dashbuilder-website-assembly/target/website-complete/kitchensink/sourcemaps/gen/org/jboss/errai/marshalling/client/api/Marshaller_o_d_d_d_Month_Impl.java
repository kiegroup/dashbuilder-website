package org.jboss.errai.marshalling.client.api;

import org.dashbuilder.dataset.date.Month;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_d_d_Month_Impl implements GeneratedMarshaller<Month> {
  private Month[] EMPTY_ARRAY = new Month[0];
  public Month[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public Month demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    Month entity = obj != null ? Enum.valueOf(Month.class, obj.get("^EnumStringValue").isString().stringValue()) : a0.isString() != null ? Enum.valueOf(Month.class, a0.isString().stringValue()) : null;
    return entity;
  }

  public String marshall(Month a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    return a0 != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.dashbuilder.dataset.date.Month") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.name()) + "\"}" : "null";
  }

  private void lazyInit() {

  }
}