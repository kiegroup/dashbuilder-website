package org.jboss.errai.marshalling.client.api;

import org.dashbuilder.shared.model.DataSetContentType;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_s_m_DataSetContentType_Impl implements GeneratedMarshaller<DataSetContentType> {
  private DataSetContentType[] EMPTY_ARRAY = new DataSetContentType[0];
  public DataSetContentType[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public DataSetContentType demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    DataSetContentType entity = obj != null ? Enum.valueOf(DataSetContentType.class, obj.get("^EnumStringValue").isString().stringValue()) : a0.isString() != null ? Enum.valueOf(DataSetContentType.class, a0.isString().stringValue()) : null;
    return entity;
  }

  public String marshall(DataSetContentType a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    return a0 != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.dashbuilder.shared.model.DataSetContentType") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.name()) + "\"}" : "null";
  }

  private void lazyInit() {

  }
}