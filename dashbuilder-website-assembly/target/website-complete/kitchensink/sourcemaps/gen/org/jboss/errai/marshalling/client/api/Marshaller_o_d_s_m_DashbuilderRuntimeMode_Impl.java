package org.jboss.errai.marshalling.client.api;

import org.dashbuilder.shared.model.DashbuilderRuntimeMode;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_s_m_DashbuilderRuntimeMode_Impl implements GeneratedMarshaller<DashbuilderRuntimeMode> {
  private DashbuilderRuntimeMode[] EMPTY_ARRAY = new DashbuilderRuntimeMode[0];
  public DashbuilderRuntimeMode[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public DashbuilderRuntimeMode demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    DashbuilderRuntimeMode entity = obj != null ? Enum.valueOf(DashbuilderRuntimeMode.class, obj.get("^EnumStringValue").isString().stringValue()) : a0.isString() != null ? Enum.valueOf(DashbuilderRuntimeMode.class, a0.isString().stringValue()) : null;
    return entity;
  }

  public String marshall(DashbuilderRuntimeMode a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    return a0 != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.dashbuilder.shared.model.DashbuilderRuntimeMode") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.name()) + "\"}" : "null";
  }

  private void lazyInit() {

  }
}