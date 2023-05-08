package org.jboss.errai.marshalling.client.api;

import org.dashbuilder.dataprovider.ExternalProviderType;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_d_ExternalProviderType_Impl implements GeneratedMarshaller<ExternalProviderType> {
  private ExternalProviderType[] EMPTY_ARRAY = new ExternalProviderType[0];
  public ExternalProviderType[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public ExternalProviderType demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(ExternalProviderType.class, objId);
    }
    ExternalProviderType entity = new ExternalProviderType();
    a1.recordObject(objId, entity);
    return entity;
  }

  public String marshall(ExternalProviderType a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.dataprovider.ExternalProviderType") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + (((("" + ",\"") + "^InstantiateOnly") + "\":true") + "}");
  }

  private void lazyInit() {

  }
}