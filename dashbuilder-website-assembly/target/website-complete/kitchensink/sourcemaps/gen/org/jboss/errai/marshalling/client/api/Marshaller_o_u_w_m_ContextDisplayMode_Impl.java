package org.jboss.errai.marshalling.client.api;

import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.uberfire.workbench.model.ContextDisplayMode;

public class Marshaller_o_u_w_m_ContextDisplayMode_Impl implements GeneratedMarshaller<ContextDisplayMode> {
  private ContextDisplayMode[] EMPTY_ARRAY = new ContextDisplayMode[0];
  public ContextDisplayMode[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public ContextDisplayMode demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    ContextDisplayMode entity = obj != null ? Enum.valueOf(ContextDisplayMode.class, obj.get("^EnumStringValue").isString().stringValue()) : a0.isString() != null ? Enum.valueOf(ContextDisplayMode.class, a0.isString().stringValue()) : null;
    return entity;
  }

  public String marshall(ContextDisplayMode a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    return a0 != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.uberfire.workbench.model.ContextDisplayMode") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.name()) + "\"}" : "null";
  }

  private void lazyInit() {

  }
}