package org.jboss.errai.marshalling.client.api;

import java.util.Set;
import org.dashbuilder.displayer.ColumnSettings;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_d_ColumnSettings_Impl implements GeneratedMarshaller<ColumnSettings> {
  private ColumnSettings[] EMPTY_ARRAY = new ColumnSettings[0];
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  public ColumnSettings[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public ColumnSettings demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(ColumnSettings.class, objId);
    }
    ColumnSettings entity = new ColumnSettings();
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
        case "columnId": entity.setColumnId(java_lang_String.demarshall(objVal, a1));
        break;
        case "columnName": entity.setColumnName(java_lang_String.demarshall(objVal, a1));
        break;
        case "valueExpression": entity.setValueExpression(java_lang_String.demarshall(objVal, a1));
        break;
        case "emptyTemplate": entity.setEmptyTemplate(java_lang_String.demarshall(objVal, a1));
        break;
        case "valuePattern": entity.setValuePattern(java_lang_String.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(ColumnSettings a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.displayer.ColumnSettings") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((((((((((("" + ",\"") + "columnId") + "\":") + java_lang_String.marshall(a0.getColumnId(), a1)) + ",\"") + "columnName") + "\":") + java_lang_String.marshall(a0.getColumnName(), a1)) + ",\"") + "valueExpression") + "\":") + java_lang_String.marshall(a0.getValueExpression(), a1)) + ",\"") + "emptyTemplate") + "\":") + java_lang_String.marshall(a0.getEmptyTemplate(), a1)) + ",\"") + "valuePattern") + "\":") + java_lang_String.marshall(a0.getValuePattern(), a1)) + "}");
  }

  private void lazyInit() {

  }
}