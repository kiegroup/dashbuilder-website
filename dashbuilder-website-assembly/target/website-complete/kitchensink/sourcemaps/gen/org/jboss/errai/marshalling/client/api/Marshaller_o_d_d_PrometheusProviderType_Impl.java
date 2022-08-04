package org.jboss.errai.marshalling.client.api;

import org.dashbuilder.dataprovider.PrometheusProviderType;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_d_PrometheusProviderType_Impl implements GeneratedMarshaller<PrometheusProviderType> {
  private PrometheusProviderType[] EMPTY_ARRAY = new PrometheusProviderType[0];
  public PrometheusProviderType[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public PrometheusProviderType demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(PrometheusProviderType.class, objId);
    }
    PrometheusProviderType entity = new PrometheusProviderType();
    a1.recordObject(objId, entity);
    return entity;
  }

  public String marshall(PrometheusProviderType a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.dataprovider.PrometheusProviderType") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + (((("" + ",\"") + "^InstantiateOnly") + "\":true") + "}");
  }

  private void lazyInit() {

  }
}