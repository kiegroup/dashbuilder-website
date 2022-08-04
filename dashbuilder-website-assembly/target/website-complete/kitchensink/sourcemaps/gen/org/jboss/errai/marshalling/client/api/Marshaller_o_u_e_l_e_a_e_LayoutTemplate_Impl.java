package org.jboss.errai.marshalling.client.api;

import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.uberfire.ext.layout.editor.api.editor.LayoutRow;
import org.uberfire.ext.layout.editor.api.editor.LayoutTemplate;
import org.uberfire.ext.layout.editor.api.editor.LayoutTemplate.Style;

public class Marshaller_o_u_e_l_e_a_e_LayoutTemplate_Impl implements GeneratedMarshaller<LayoutTemplate> {
  private LayoutTemplate[] EMPTY_ARRAY = new LayoutTemplate[0];
  private Marshaller<Integer> java_lang_Integer = Marshalling.getMarshaller(Integer.class);
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller<Style> org_uberfire_ext_layout_editor_api_editor_LayoutTemplate_erraiD_Style = null;
  private Marshaller<Map> java_util_Map = Marshalling.getMarshaller(Map.class);
  private Marshaller<List> java_util_List = Marshalling.getMarshaller(List.class);
  public LayoutTemplate[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static int LayoutTemplate_int_version(LayoutTemplate instance) /*-{
    return instance.@org.uberfire.ext.layout.editor.api.editor.LayoutTemplate::version;
  }-*/;

  native static void LayoutTemplate_int_version(LayoutTemplate instance, int value) /*-{
    instance.@org.uberfire.ext.layout.editor.api.editor.LayoutTemplate::version = value;
  }-*/;

  native static Map LayoutTemplate_Map_layoutProperties(LayoutTemplate instance) /*-{
    return instance.@org.uberfire.ext.layout.editor.api.editor.LayoutTemplate::layoutProperties;
  }-*/;

  native static void LayoutTemplate_Map_layoutProperties(LayoutTemplate instance, Map<String, String> value) /*-{
    instance.@org.uberfire.ext.layout.editor.api.editor.LayoutTemplate::layoutProperties = value;
  }-*/;

  native static List LayoutTemplate_List_rows(LayoutTemplate instance) /*-{
    return instance.@org.uberfire.ext.layout.editor.api.editor.LayoutTemplate::rows;
  }-*/;

  native static void LayoutTemplate_List_rows(LayoutTemplate instance, List<LayoutRow> value) /*-{
    instance.@org.uberfire.ext.layout.editor.api.editor.LayoutTemplate::rows = value;
  }-*/;

  public LayoutTemplate demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(LayoutTemplate.class, objId);
    }
    LayoutTemplate entity = new LayoutTemplate();
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
        case "version": LayoutTemplate_int_version(entity, java_lang_Integer.demarshall(objVal, a1));
        break;
        case "name": entity.setName(java_lang_String.demarshall(objVal, a1));
        break;
        case "style": entity.setStyle(objVal.isObject() != null ? Enum.valueOf(Style.class, objVal.isObject().get("^EnumStringValue").isString().stringValue()) : objVal.isString() != null ? Enum.valueOf(Style.class, objVal.isString().stringValue()) : null);
        break;
        case "layoutProperties": a1.setAssumedMapKeyType("java.lang.String");
        a1.setAssumedMapValueType("java.lang.String");
        LayoutTemplate_Map_layoutProperties(entity, java_util_Map.demarshall(objVal, a1));
        a1.resetAssumedTypes();
        break;
        case "rows": a1.setAssumedElementType("org.uberfire.ext.layout.editor.api.editor.LayoutRow");
        LayoutTemplate_List_rows(entity, java_util_List.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(LayoutTemplate a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.uberfire.ext.layout.editor.api.editor.LayoutTemplate") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((((((((((("" + ",\"") + "version") + "\":") + java_lang_Integer.marshall(a0.getVersion(), a1)) + ",\"") + "name") + "\":") + java_lang_String.marshall(a0.getName(), a1)) + ",\"") + "style") + "\":") + (a0.getStyle() != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.uberfire.ext.layout.editor.api.editor.LayoutTemplate$Style") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.getStyle().name()) + "\"}" : "null")) + ",\"") + "layoutProperties") + "\":") + java_util_Map.marshall(a0.getLayoutProperties(), a1)) + ",\"") + "rows") + "\":") + java_util_List.marshall(a0.getRows(), a1)) + "}");
  }

  private void lazyInit() {
    if (org_uberfire_ext_layout_editor_api_editor_LayoutTemplate_erraiD_Style == null) {
      org_uberfire_ext_layout_editor_api_editor_LayoutTemplate_erraiD_Style = Marshalling.getMarshaller(Style.class);
    }
  }
}