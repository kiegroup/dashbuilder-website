package org.jboss.errai.marshalling.client.api;

import java.util.Set;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.jboss.errai.marshalling.client.marshallers.ObjectMarshaller;
import org.uberfire.backend.vfs.Path;
import org.uberfire.ext.plugin.model.Activity;
import org.uberfire.ext.plugin.model.Plugin;
import org.uberfire.ext.plugin.model.PluginType;

public class Marshaller_o_u_e_p_m_Plugin_Impl implements GeneratedMarshaller<Plugin> {
  private Plugin[] EMPTY_ARRAY = new Plugin[0];
  private Marshaller java_lang_Object = Marshalling.getMarshaller(Object.class);
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller<PluginType> org_uberfire_ext_plugin_model_PluginType = null;
  public Plugin[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

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

  public Plugin demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(Plugin.class, objId);
    }
    Plugin entity = new Plugin();
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

  public String marshall(Plugin a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.uberfire.ext.plugin.model.Plugin") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((("" + ",\"") + "path") + "\":") + java_lang_Object.marshall(a0.getPath(), a1)) + ",\"") + "name") + "\":") + java_lang_String.marshall(a0.getName(), a1)) + ",\"") + "type") + "\":") + (a0.getType() != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.uberfire.ext.plugin.model.PluginType") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.getType().name()) + "\"}" : "null")) + "}");
  }

  private void lazyInit() {
    if (org_uberfire_ext_plugin_model_PluginType == null) {
      org_uberfire_ext_plugin_model_PluginType = Marshalling.getMarshaller(PluginType.class);
    }
  }
}