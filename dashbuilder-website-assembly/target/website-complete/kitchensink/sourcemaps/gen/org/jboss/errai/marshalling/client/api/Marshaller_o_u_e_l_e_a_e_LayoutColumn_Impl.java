package org.jboss.errai.marshalling.client.api;

import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.uberfire.ext.layout.editor.api.editor.LayoutColumn;
import org.uberfire.ext.layout.editor.api.editor.LayoutComponent;
import org.uberfire.ext.layout.editor.api.editor.LayoutRow;

public class Marshaller_o_u_e_l_e_a_e_LayoutColumn_Impl implements GeneratedMarshaller<LayoutColumn> {
  private LayoutColumn[] EMPTY_ARRAY = new LayoutColumn[0];
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller<Map> java_util_Map = Marshalling.getMarshaller(Map.class);
  private Marshaller<List> java_util_List = Marshalling.getMarshaller(List.class);
  public LayoutColumn[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static List LayoutColumn_List_rows(LayoutColumn instance) /*-{
    return instance.@org.uberfire.ext.layout.editor.api.editor.LayoutColumn::rows;
  }-*/;

  native static void LayoutColumn_List_rows(LayoutColumn instance, List<LayoutRow> value) /*-{
    instance.@org.uberfire.ext.layout.editor.api.editor.LayoutColumn::rows = value;
  }-*/;

  native static List LayoutColumn_List_layoutComponents(LayoutColumn instance) /*-{
    return instance.@org.uberfire.ext.layout.editor.api.editor.LayoutColumn::layoutComponents;
  }-*/;

  native static void LayoutColumn_List_layoutComponents(LayoutColumn instance, List<LayoutComponent> value) /*-{
    instance.@org.uberfire.ext.layout.editor.api.editor.LayoutColumn::layoutComponents = value;
  }-*/;

  public LayoutColumn demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(LayoutColumn.class, objId);
    }
    final String c0 = java_lang_String.demarshall(obj.get("span"), a1);
    final String c1 = java_lang_String.demarshall(obj.get("height"), a1);
    a1.setAssumedMapKeyType("java.lang.String");
    a1.setAssumedMapValueType("java.lang.String");
    final Map c2 = java_util_Map.demarshall(obj.get("properties"), a1);
    a1.resetAssumedTypes();
    LayoutColumn entity = new LayoutColumn(c0, c1, c2);
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
        case "rows": a1.setAssumedElementType("org.uberfire.ext.layout.editor.api.editor.LayoutRow");
        LayoutColumn_List_rows(entity, java_util_List.demarshall(objVal, a1));
        break;
        case "layoutComponents": a1.setAssumedElementType("org.uberfire.ext.layout.editor.api.editor.LayoutComponent");
        LayoutColumn_List_layoutComponents(entity, java_util_List.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(LayoutColumn a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.uberfire.ext.layout.editor.api.editor.LayoutColumn") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((((((((((("" + ",\"") + "span") + "\":") + java_lang_String.marshall(a0.getSpan(), a1)) + ",\"") + "height") + "\":") + java_lang_String.marshall(a0.getHeight(), a1)) + ",\"") + "properties") + "\":") + java_util_Map.marshall(a0.getProperties(), a1)) + ",\"") + "rows") + "\":") + java_util_List.marshall(a0.getRows(), a1)) + ",\"") + "layoutComponents") + "\":") + java_util_List.marshall(a0.getLayoutComponents(), a1)) + "}");
  }

  private void lazyInit() {

  }
}