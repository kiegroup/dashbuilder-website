package org.jboss.errai.marshalling.client.api;

import org.dashbuilder.displayer.Mode;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_d_Mode_Impl implements GeneratedMarshaller<Mode> {
  private Mode[] EMPTY_ARRAY = new Mode[0];
  public Mode[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public Mode demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    Mode entity = obj != null ? Enum.valueOf(Mode.class, obj.get("^EnumStringValue").isString().stringValue()) : a0.isString() != null ? Enum.valueOf(Mode.class, a0.isString().stringValue()) : null;
    return entity;
  }

  public String marshall(Mode a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    return a0 != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.dashbuilder.displayer.Mode") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.name()) + "\"}" : "null";
  }

  private void lazyInit() {

  }
}