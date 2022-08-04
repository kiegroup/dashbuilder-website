package org.jboss.errai.marshalling.client.api;

import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.uberfire.ext.layout.editor.api.editor.LayoutColumn;
import org.uberfire.ext.layout.editor.api.editor.LayoutRow;

public class Marshaller_o_u_e_l_e_a_e_LayoutRow_Impl implements GeneratedMarshaller<LayoutRow> {
  private LayoutRow[] EMPTY_ARRAY = new LayoutRow[0];
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller<Map> java_util_Map = Marshalling.getMarshaller(Map.class);
  private Marshaller<List> java_util_List = Marshalling.getMarshaller(List.class);
  public LayoutRow[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static List LayoutRow_List_layoutColumns(LayoutRow instance) /*-{
    return instance.@org.uberfire.ext.layout.editor.api.editor.LayoutRow::layoutColumns;
  }-*/;

  native static void LayoutRow_List_layoutColumns(LayoutRow instance, List<LayoutColumn> value) /*-{
    instance.@org.uberfire.ext.layout.editor.api.editor.LayoutRow::layoutColumns = value;
  }-*/;

  public LayoutRow demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(LayoutRow.class, objId);
    }
    final String c0 = java_lang_String.demarshall(obj.get("height"), a1);
    a1.setAssumedMapKeyType("java.lang.String");
    a1.setAssumedMapValueType("java.lang.String");
    final Map c1 = java_util_Map.demarshall(obj.get("properties"), a1);
    a1.resetAssumedTypes();
    LayoutRow entity = new LayoutRow(c0, c1);
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
        case "layoutColumns": a1.setAssumedElementType("org.uberfire.ext.layout.editor.api.editor.LayoutColumn");
        LayoutRow_List_layoutColumns(entity, java_util_List.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(LayoutRow a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.uberfire.ext.layout.editor.api.editor.LayoutRow") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((("" + ",\"") + "height") + "\":") + java_lang_String.marshall(a0.getHeight(), a1)) + ",\"") + "properties") + "\":") + java_util_Map.marshall(a0.getProperties(), a1)) + ",\"") + "layoutColumns") + "\":") + java_util_List.marshall(a0.getLayoutColumns(), a1)) + "}");
  }

  private void lazyInit() {

  }
}