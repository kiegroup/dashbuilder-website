package org.jboss.errai.marshalling.client.api;

import org.dashbuilder.dataset.date.DayOfWeek;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_d_d_DayOfWeek_Impl implements GeneratedMarshaller<DayOfWeek> {
  private DayOfWeek[] EMPTY_ARRAY = new DayOfWeek[0];
  public DayOfWeek[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public DayOfWeek demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    DayOfWeek entity = obj != null ? Enum.valueOf(DayOfWeek.class, obj.get("^EnumStringValue").isString().stringValue()) : a0.isString() != null ? Enum.valueOf(DayOfWeek.class, a0.isString().stringValue()) : null;
    return entity;
  }

  public String marshall(DayOfWeek a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    return a0 != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.dashbuilder.dataset.date.DayOfWeek") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.name()) + "\"}" : "null";
  }

  private void lazyInit() {

  }
}