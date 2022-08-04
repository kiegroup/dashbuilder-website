package org.jboss.errai.marshalling.client.api;

import java.util.Set;
import org.dashbuilder.dataset.def.DataSetDef;
import org.dashbuilder.dataset.events.DataSetStaleEvent;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.jboss.errai.marshalling.client.marshallers.ObjectMarshaller;

public class Marshaller_o_d_d_e_DataSetStaleEvent_Impl implements GeneratedMarshaller<DataSetStaleEvent> {
  private DataSetStaleEvent[] EMPTY_ARRAY = new DataSetStaleEvent[0];
  private Marshaller java_lang_Object = Marshalling.getMarshaller(Object.class);
  public DataSetStaleEvent[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public DataSetStaleEvent demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(DataSetStaleEvent.class, objId);
    }
    DataSetStaleEvent entity = new DataSetStaleEvent();
    a1.recordObject(objId, entity);
    final Set<String> keys = obj.keySet();
    for (String key : keys) {
      if (key.equals("^EncodedType") || key.equals("^ObjectID")) {
        continue;
      }
      EJValue objVal = obj.getIfNotNull(key);
      if (objVal == null) {
        continue;
      }
      switch (key) {
        case "dataSetDef": entity.setDataSetDef((DataSetDef) ((ObjectMarshaller) java_lang_Object).demarshall(DataSetDef.class, objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(DataSetStaleEvent a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.dataset.events.DataSetStaleEvent") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((("" + ",\"") + "dataSetDef") + "\":") + java_lang_Object.marshall(a0.getDataSetDef(), a1)) + "}");
  }

  private void lazyInit() {

  }
}