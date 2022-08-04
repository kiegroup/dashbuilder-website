package org.jboss.errai.marshalling.client.api;

import java.util.List;
import java.util.Set;
import org.dashbuilder.dataset.def.DataSetDef;
import org.dashbuilder.transfer.ExportInfo;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_t_ExportInfo_Impl implements GeneratedMarshaller<ExportInfo> {
  private ExportInfo[] EMPTY_ARRAY = new ExportInfo[0];
  private Marshaller<Boolean> java_lang_Boolean = Marshalling.getMarshaller(Boolean.class);
  private Marshaller<List> java_util_List = Marshalling.getMarshaller(List.class);
  public ExportInfo[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static boolean ExportInfo_boolean_externalServerAvailable(ExportInfo instance) /*-{
    return instance.@org.dashbuilder.transfer.ExportInfo::externalServerAvailable;
  }-*/;

  native static void ExportInfo_boolean_externalServerAvailable(ExportInfo instance, boolean value) /*-{
    instance.@org.dashbuilder.transfer.ExportInfo::externalServerAvailable = value;
  }-*/;

  native static List ExportInfo_List_datasetsDefinitions(ExportInfo instance) /*-{
    return instance.@org.dashbuilder.transfer.ExportInfo::datasetsDefinitions;
  }-*/;

  native static void ExportInfo_List_datasetsDefinitions(ExportInfo instance, List<DataSetDef> value) /*-{
    instance.@org.dashbuilder.transfer.ExportInfo::datasetsDefinitions = value;
  }-*/;

  native static List ExportInfo_List_pages(ExportInfo instance) /*-{
    return instance.@org.dashbuilder.transfer.ExportInfo::pages;
  }-*/;

  native static void ExportInfo_List_pages(ExportInfo instance, List<String> value) /*-{
    instance.@org.dashbuilder.transfer.ExportInfo::pages = value;
  }-*/;

  public ExportInfo demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(ExportInfo.class, objId);
    }
    ExportInfo entity = new ExportInfo();
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
        case "externalServerAvailable": ExportInfo_boolean_externalServerAvailable(entity, java_lang_Boolean.demarshall(objVal, a1));
        break;
        case "datasetsDefinitions": a1.setAssumedElementType("org.dashbuilder.dataset.def.DataSetDef");
        ExportInfo_List_datasetsDefinitions(entity, java_util_List.demarshall(objVal, a1));
        break;
        case "pages": a1.setAssumedElementType("java.lang.String");
        ExportInfo_List_pages(entity, java_util_List.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(ExportInfo a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.transfer.ExportInfo") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((("" + ",\"") + "externalServerAvailable") + "\":") + java_lang_Boolean.marshall(ExportInfo_boolean_externalServerAvailable(a0), a1)) + ",\"") + "datasetsDefinitions") + "\":") + java_util_List.marshall(a0.getDatasetsDefinitions(), a1)) + ",\"") + "pages") + "\":") + java_util_List.marshall(a0.getPages(), a1)) + "}");
  }

  private void lazyInit() {

  }
}