package org.jboss.errai.marshalling.client.api;

import java.util.List;
import java.util.Map;
import java.util.Set;
import org.dashbuilder.dataset.DataSet;
import org.dashbuilder.dataset.DataSetLookup;
import org.dashbuilder.displayer.DisplayerSettings;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.jboss.errai.marshalling.client.marshallers.ObjectMarshaller;

public class Marshaller_o_d_d_DisplayerSettings_Impl implements GeneratedMarshaller<DisplayerSettings> {
  private DisplayerSettings[] EMPTY_ARRAY = new DisplayerSettings[0];
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller java_lang_Object = Marshalling.getMarshaller(Object.class);
  private Marshaller<DataSetLookup> org_dashbuilder_dataset_DataSetLookup = null;
  private Marshaller<List> java_util_List = Marshalling.getMarshaller(List.class);
  private Marshaller<Map> java_util_Map = Marshalling.getMarshaller(Map.class);
  public DisplayerSettings[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static Map DisplayerSettings_Map_settings(DisplayerSettings instance) /*-{
    return instance.@org.dashbuilder.displayer.DisplayerSettings::settings;
  }-*/;

  native static void DisplayerSettings_Map_settings(DisplayerSettings instance, Map<String, String> value) /*-{
    instance.@org.dashbuilder.displayer.DisplayerSettings::settings = value;
  }-*/;

  public DisplayerSettings demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(DisplayerSettings.class, objId);
    }
    DisplayerSettings entity = new DisplayerSettings();
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
        case "UUID": entity.setUUID(java_lang_String.demarshall(objVal, a1));
        break;
        case "dataSet": entity.setDataSet((DataSet) ((ObjectMarshaller) java_lang_Object).demarshall(DataSet.class, objVal, a1));
        break;
        case "dataSetLookup": entity.setDataSetLookup(org_dashbuilder_dataset_DataSetLookup.demarshall(objVal, a1));
        break;
        case "columnSettingsList": a1.setAssumedElementType("org.dashbuilder.displayer.ColumnSettings");
        entity.setColumnSettingsList(java_util_List.demarshall(objVal, a1));
        break;
        case "settings": a1.setAssumedMapKeyType("java.lang.String");
        a1.setAssumedMapValueType("java.lang.String");
        DisplayerSettings_Map_settings(entity, java_util_Map.demarshall(objVal, a1));
        a1.resetAssumedTypes();
        break;
      }
    }
    return entity;
  }

  public String marshall(DisplayerSettings a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.displayer.DisplayerSettings") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((((((((((("" + ",\"") + "UUID") + "\":") + java_lang_String.marshall(a0.getUUID(), a1)) + ",\"") + "dataSet") + "\":") + java_lang_Object.marshall(a0.getDataSet(), a1)) + ",\"") + "dataSetLookup") + "\":") + org_dashbuilder_dataset_DataSetLookup.marshall(a0.getDataSetLookup(), a1)) + ",\"") + "columnSettingsList") + "\":") + java_util_List.marshall(a0.getColumnSettingsList(), a1)) + ",\"") + "settings") + "\":") + java_util_Map.marshall(DisplayerSettings_Map_settings(a0), a1)) + "}");
  }

  private void lazyInit() {
    if (org_dashbuilder_dataset_DataSetLookup == null) {
      org_dashbuilder_dataset_DataSetLookup = Marshalling.getMarshaller(DataSetLookup.class);
    }
  }
}