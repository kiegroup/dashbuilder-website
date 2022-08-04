package org.jboss.errai.marshalling.client.api;

import java.util.Set;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.uberfire.workbench.model.NamedPosition;

public class Marshaller_o_u_w_m_NamedPosition_Impl implements GeneratedMarshaller<NamedPosition> {
  private NamedPosition[] EMPTY_ARRAY = new NamedPosition[0];
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  public NamedPosition[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static String NamedPosition_String_fieldName(NamedPosition instance) /*-{
    return instance.@org.uberfire.workbench.model.NamedPosition::fieldName;
  }-*/;

  native static void NamedPosition_String_fieldName(NamedPosition instance, String value) /*-{
    instance.@org.uberfire.workbench.model.NamedPosition::fieldName = value;
  }-*/;

  public NamedPosition demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(NamedPosition.class, objId);
    }
    final String c0 = java_lang_String.demarshall(obj.get("fieldName"), a1);
    NamedPosition entity = new NamedPosition(c0);
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
        case "fieldName": NamedPosition_String_fieldName(entity, java_lang_String.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(NamedPosition a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.uberfire.workbench.model.NamedPosition") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((("" + ",\"") + "fieldName") + "\":") + java_lang_String.marshall(NamedPosition_String_fieldName(a0), a1)) + "}");
  }

  private void lazyInit() {

  }
}