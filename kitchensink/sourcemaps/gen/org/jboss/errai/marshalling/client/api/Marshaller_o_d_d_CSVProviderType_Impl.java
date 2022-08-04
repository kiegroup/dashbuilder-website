package org.jboss.errai.marshalling.client.api;

import org.dashbuilder.dataprovider.CSVProviderType;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_d_CSVProviderType_Impl implements GeneratedMarshaller<CSVProviderType> {
  private CSVProviderType[] EMPTY_ARRAY = new CSVProviderType[0];
  public CSVProviderType[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public CSVProviderType demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(CSVProviderType.class, objId);
    }
    CSVProviderType entity = new CSVProviderType();
    a1.recordObject(objId, entity);
    return entity;
  }

  public String marshall(CSVProviderType a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.dataprovider.CSVProviderType") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + (((("" + ",\"") + "^InstantiateOnly") + "\":true") + "}");
  }

  private void lazyInit() {

  }
}