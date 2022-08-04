package org.jboss.errai.marshalling.client.api;

import java.util.List;
import java.util.Set;
import org.dashbuilder.dataset.group.Interval;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.jboss.errai.marshalling.client.marshallers.ObjectMarshaller;

public class Marshaller_o_d_d_g_Interval_Impl implements GeneratedMarshaller<Interval> {
  private Interval[] EMPTY_ARRAY = new Interval[0];
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller<Integer> java_lang_Integer = Marshalling.getMarshaller(Integer.class);
  private Marshaller<List> java_util_List = Marshalling.getMarshaller(List.class);
  private Marshaller java_lang_Object = Marshalling.getMarshaller(Object.class);
  public Interval[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public Interval demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(Interval.class, objId);
    }
    Interval entity = new Interval();
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
        case "name": entity.setName(java_lang_String.demarshall(objVal, a1));
        break;
        case "index": entity.setIndex(java_lang_Integer.demarshall(objVal, a1));
        break;
        case "rows": a1.setAssumedElementType("java.lang.Integer");
        entity.setRows(java_util_List.demarshall(objVal, a1));
        break;
        case "type": entity.setType(java_lang_String.demarshall(objVal, a1));
        break;
        case "minValue": entity.setMinValue(((ObjectMarshaller) java_lang_Object).demarshall(Object.class, objVal, a1));
        break;
        case "maxValue": entity.setMaxValue(((ObjectMarshaller) java_lang_Object).demarshall(Object.class, objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(Interval a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.dataset.group.Interval") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((((((((((((((("" + ",\"") + "name") + "\":") + java_lang_String.marshall(a0.getName(), a1)) + ",\"") + "index") + "\":") + java_lang_Integer.marshall(a0.getIndex(), a1)) + ",\"") + "rows") + "\":") + java_util_List.marshall(a0.getRows(), a1)) + ",\"") + "type") + "\":") + java_lang_String.marshall(a0.getType(), a1)) + ",\"") + "minValue") + "\":") + java_lang_Object.marshall(a0.getMinValue(), a1)) + ",\"") + "maxValue") + "\":") + java_lang_Object.marshall(a0.getMaxValue(), a1)) + "}");
  }

  private void lazyInit() {

  }
}