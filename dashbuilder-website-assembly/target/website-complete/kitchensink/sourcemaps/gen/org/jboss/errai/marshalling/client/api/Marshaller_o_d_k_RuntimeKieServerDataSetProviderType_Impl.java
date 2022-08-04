package org.jboss.errai.marshalling.client.api;

import org.dashbuilder.kieserver.RuntimeKieServerDataSetProviderType;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_k_RuntimeKieServerDataSetProviderType_Impl implements GeneratedMarshaller<RuntimeKieServerDataSetProviderType> {
  private RuntimeKieServerDataSetProviderType[] EMPTY_ARRAY = new RuntimeKieServerDataSetProviderType[0];
  public RuntimeKieServerDataSetProviderType[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public RuntimeKieServerDataSetProviderType demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(RuntimeKieServerDataSetProviderType.class, objId);
    }
    RuntimeKieServerDataSetProviderType entity = new RuntimeKieServerDataSetProviderType();
    a1.recordObject(objId, entity);
    return entity;
  }

  public String marshall(RuntimeKieServerDataSetProviderType a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.kieserver.RuntimeKieServerDataSetProviderType") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + (((("" + ",\"") + "^InstantiateOnly") + "\":true") + "}");
  }

  private void lazyInit() {

  }
}