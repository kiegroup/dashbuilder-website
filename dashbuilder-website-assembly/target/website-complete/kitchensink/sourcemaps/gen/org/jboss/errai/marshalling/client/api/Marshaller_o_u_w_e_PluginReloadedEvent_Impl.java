package org.jboss.errai.marshalling.client.api;

import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.uberfire.workbench.events.PluginReloadedEvent;

public class Marshaller_o_u_w_e_PluginReloadedEvent_Impl implements GeneratedMarshaller<PluginReloadedEvent> {
  private PluginReloadedEvent[] EMPTY_ARRAY = new PluginReloadedEvent[0];
  public PluginReloadedEvent[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public PluginReloadedEvent demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(PluginReloadedEvent.class, objId);
    }
    PluginReloadedEvent entity = new PluginReloadedEvent();
    a1.recordObject(objId, entity);
    return entity;
  }

  public String marshall(PluginReloadedEvent a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.uberfire.workbench.events.PluginReloadedEvent") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + (((("" + ",\"") + "^InstantiateOnly") + "\":true") + "}");
  }

  private void lazyInit() {

  }
}