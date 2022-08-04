package org.jboss.errai.marshalling.client.api;

import java.util.List;
import java.util.Set;
import org.dashbuilder.dataset.backend.EditDataSetDef;
import org.dashbuilder.dataset.def.DataColumnDef;
import org.dashbuilder.dataset.def.DataSetDef;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.jboss.errai.marshalling.client.marshallers.ObjectMarshaller;

public class Marshaller_o_d_d_b_EditDataSetDef_Impl implements GeneratedMarshaller<EditDataSetDef> {
  private EditDataSetDef[] EMPTY_ARRAY = new EditDataSetDef[0];
  private Marshaller java_lang_Object = Marshalling.getMarshaller(Object.class);
  private Marshaller<List> java_util_List = Marshalling.getMarshaller(List.class);
  public EditDataSetDef[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static DataSetDef EditDataSetDef_DataSetDef_definition(EditDataSetDef instance) /*-{
    return instance.@org.dashbuilder.dataset.backend.EditDataSetDef::definition;
  }-*/;

  native static void EditDataSetDef_DataSetDef_definition(EditDataSetDef instance, DataSetDef value) /*-{
    instance.@org.dashbuilder.dataset.backend.EditDataSetDef::definition = value;
  }-*/;

  native static List EditDataSetDef_List_columns(EditDataSetDef instance) /*-{
    return instance.@org.dashbuilder.dataset.backend.EditDataSetDef::columns;
  }-*/;

  native static void EditDataSetDef_List_columns(EditDataSetDef instance, List<DataColumnDef> value) /*-{
    instance.@org.dashbuilder.dataset.backend.EditDataSetDef::columns = value;
  }-*/;

  public EditDataSetDef demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(EditDataSetDef.class, objId);
    }
    EditDataSetDef entity = new EditDataSetDef();
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
        case "definition": EditDataSetDef_DataSetDef_definition(entity, (DataSetDef) ((ObjectMarshaller) java_lang_Object).demarshall(DataSetDef.class, objVal, a1));
        break;
        case "columns": a1.setAssumedElementType("org.dashbuilder.dataset.def.DataColumnDef");
        EditDataSetDef_List_columns(entity, java_util_List.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(EditDataSetDef a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.dataset.backend.EditDataSetDef") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((("" + ",\"") + "definition") + "\":") + java_lang_Object.marshall(a0.getDefinition(), a1)) + ",\"") + "columns") + "\":") + java_util_List.marshall(a0.getColumns(), a1)) + "}");
  }

  private void lazyInit() {

  }
}