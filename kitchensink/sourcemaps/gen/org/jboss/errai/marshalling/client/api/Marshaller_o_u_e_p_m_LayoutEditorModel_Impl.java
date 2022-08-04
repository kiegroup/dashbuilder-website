package org.jboss.errai.marshalling.client.api;

import java.util.Set;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.jboss.errai.marshalling.client.marshallers.ObjectMarshaller;
import org.uberfire.backend.vfs.Path;
import org.uberfire.ext.plugin.model.Activity;
import org.uberfire.ext.plugin.model.LayoutEditorModel;
import org.uberfire.ext.plugin.model.Plugin;
import org.uberfire.ext.plugin.model.PluginType;

public class Marshaller_o_u_e_p_m_LayoutEditorModel_Impl implements GeneratedMarshaller<LayoutEditorModel> {
  private LayoutEditorModel[] EMPTY_ARRAY = new LayoutEditorModel[0];
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller<Boolean> java_lang_Boolean = Marshalling.getMarshaller(Boolean.class);
  private Marshaller java_lang_Object = Marshalling.getMarshaller(Object.class);
  private Marshaller<PluginType> org_uberfire_ext_plugin_model_PluginType = null;
  public LayoutEditorModel[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static String LayoutEditorModel_String_layoutEditorModel(LayoutEditorModel instance) /*-{
    return instance.@org.uberfire.ext.plugin.model.LayoutEditorModel::layoutEditorModel;
  }-*/;

  native static void LayoutEditorModel_String_layoutEditorModel(LayoutEditorModel instance, String value) /*-{
    instance.@org.uberfire.ext.plugin.model.LayoutEditorModel::layoutEditorModel = value;
  }-*/;

  native static boolean LayoutEditorModel_boolean_emptyLayout(LayoutEditorModel instance) /*-{
    return instance.@org.uberfire.ext.plugin.model.LayoutEditorModel::emptyLayout;
  }-*/;

  native static void LayoutEditorModel_boolean_emptyLayout(LayoutEditorModel instance, boolean value) /*-{
    instance.@org.uberfire.ext.plugin.model.LayoutEditorModel::emptyLayout = value;
  }-*/;

  native static Path Plugin_Path_path(Plugin instance) /*-{
    return instance.@org.uberfire.ext.plugin.model.Plugin::path;
  }-*/;

  native static void Plugin_Path_path(Plugin instance, Path value) /*-{
    instance.@org.uberfire.ext.plugin.model.Plugin::path = value;
  }-*/;

  native static String Activity_String_name(Activity instance) /*-{
    return instance.@org.uberfire.ext.plugin.model.Activity::name;
  }-*/;

  native static void Activity_String_name(Activity instance, String value) /*-{
    instance.@org.uberfire.ext.plugin.model.Activity::name = value;
  }-*/;

  native static PluginType Activity_PluginType_type(Activity instance) /*-{
    return instance.@org.uberfire.ext.plugin.model.Activity::type;
  }-*/;

  native static void Activity_PluginType_type(Activity instance, PluginType value) /*-{
    instance.@org.uberfire.ext.plugin.model.Activity::type = value;
  }-*/;

  public LayoutEditorModel demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(LayoutEditorModel.class, objId);
    }
    LayoutEditorModel entity = new LayoutEditorModel();
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
        case "layoutEditorModel": LayoutEditorModel_String_layoutEditorModel(entity, java_lang_String.demarshall(objVal, a1));
        break;
        case "emptyLayout": LayoutEditorModel_boolean_emptyLayout(entity, java_lang_Boolean.demarshall(objVal, a1));
        break;
        case "path": Plugin_Path_path(entity, (Path) ((ObjectMarshaller) java_lang_Object).demarshall(Path.class, objVal, a1));
        break;
        case "name": Activity_String_name(entity, java_lang_String.demarshall(objVal, a1));
        break;
        case "type": Activity_PluginType_type(entity, objVal.isObject() != null ? Enum.valueOf(PluginType.class, objVal.isObject().get("^EnumStringValue").isString().stringValue()) : objVal.isString() != null ? Enum.valueOf(PluginType.class, objVal.isString().stringValue()) : null);
        break;
      }
    }
    return entity;
  }

  public String marshall(LayoutEditorModel a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.uberfire.ext.plugin.model.LayoutEditorModel") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((((((((((("" + ",\"") + "layoutEditorModel") + "\":") + java_lang_String.marshall(a0.getLayoutEditorModel(), a1)) + ",\"") + "emptyLayout") + "\":") + java_lang_Boolean.marshall(LayoutEditorModel_boolean_emptyLayout(a0), a1)) + ",\"") + "path") + "\":") + java_lang_Object.marshall(a0.getPath(), a1)) + ",\"") + "name") + "\":") + java_lang_String.marshall(a0.getName(), a1)) + ",\"") + "type") + "\":") + (a0.getType() != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.uberfire.ext.plugin.model.PluginType") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.getType().name()) + "\"}" : "null")) + "}");
  }

  private void lazyInit() {
    if (org_uberfire_ext_plugin_model_PluginType == null) {
      org_uberfire_ext_plugin_model_PluginType = Marshalling.getMarshaller(PluginType.class);
    }
  }
}