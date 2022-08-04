package org.jboss.errai.marshalling.client.api;

import org.dashbuilder.navigation.layout.LayoutNavigationRefType;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_n_l_LayoutNavigationRefType_Impl implements GeneratedMarshaller<LayoutNavigationRefType> {
  private LayoutNavigationRefType[] EMPTY_ARRAY = new LayoutNavigationRefType[0];
  public LayoutNavigationRefType[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public LayoutNavigationRefType demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    LayoutNavigationRefType entity = obj != null ? Enum.valueOf(LayoutNavigationRefType.class, obj.get("^EnumStringValue").isString().stringValue()) : a0.isString() != null ? Enum.valueOf(LayoutNavigationRefType.class, a0.isString().stringValue()) : null;
    return entity;
  }

  public String marshall(LayoutNavigationRefType a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    return a0 != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.dashbuilder.navigation.layout.LayoutNavigationRefType") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.name()) + "\"}" : "null";
  }

  private void lazyInit() {

  }
}