package org.jboss.errai.marshalling.client.api;

import org.dashbuilder.dataprovider.StaticProviderType;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_d_StaticProviderType_Impl implements GeneratedMarshaller<StaticProviderType> {
  private StaticProviderType[] EMPTY_ARRAY = new StaticProviderType[0];
  public StaticProviderType[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public StaticProviderType demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(StaticProviderType.class, objId);
    }
    StaticProviderType entity = new StaticProviderType();
    a1.recordObject(objId, entity);
    return entity;
  }

  public String marshall(StaticProviderType a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.dataprovider.StaticProviderType") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + (((("" + ",\"") + "^InstantiateOnly") + "\":true") + "}");
  }

  private void lazyInit() {

  }
}