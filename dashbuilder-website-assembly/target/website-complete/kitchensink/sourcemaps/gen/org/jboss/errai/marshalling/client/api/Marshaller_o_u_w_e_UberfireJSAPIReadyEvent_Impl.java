package org.jboss.errai.marshalling.client.api;

import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.uberfire.workbench.events.UberfireJSAPIReadyEvent;

public class Marshaller_o_u_w_e_UberfireJSAPIReadyEvent_Impl implements GeneratedMarshaller<UberfireJSAPIReadyEvent> {
  private UberfireJSAPIReadyEvent[] EMPTY_ARRAY = new UberfireJSAPIReadyEvent[0];
  public UberfireJSAPIReadyEvent[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public UberfireJSAPIReadyEvent demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(UberfireJSAPIReadyEvent.class, objId);
    }
    UberfireJSAPIReadyEvent entity = new UberfireJSAPIReadyEvent();
    a1.recordObject(objId, entity);
    return entity;
  }

  public String marshall(UberfireJSAPIReadyEvent a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.uberfire.workbench.events.UberfireJSAPIReadyEvent") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + (((("" + ",\"") + "^InstantiateOnly") + "\":true") + "}");
  }

  private void lazyInit() {

  }
}