package org.jboss.errai.marshalling.client.api;

import java.util.Set;
import org.dashbuilder.dataset.DataSetMetadata;
import org.dashbuilder.dataset.events.DataSetPushOkEvent;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.jboss.errai.marshalling.client.marshallers.ObjectMarshaller;

public class Marshaller_o_d_d_e_DataSetPushOkEvent_Impl implements GeneratedMarshaller<DataSetPushOkEvent> {
  private DataSetPushOkEvent[] EMPTY_ARRAY = new DataSetPushOkEvent[0];
  private Marshaller java_lang_Object = Marshalling.getMarshaller(Object.class);
  public DataSetPushOkEvent[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public DataSetPushOkEvent demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(DataSetPushOkEvent.class, objId);
    }
    DataSetPushOkEvent entity = new DataSetPushOkEvent();
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
        case "dataSetMetadata": entity.setDataSetMetadata((DataSetMetadata) ((ObjectMarshaller) java_lang_Object).demarshall(DataSetMetadata.class, objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(DataSetPushOkEvent a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.dataset.events.DataSetPushOkEvent") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((("" + ",\"") + "dataSetMetadata") + "\":") + java_lang_Object.marshall(a0.getDataSetMetadata(), a1)) + "}");
  }

  private void lazyInit() {

  }
}