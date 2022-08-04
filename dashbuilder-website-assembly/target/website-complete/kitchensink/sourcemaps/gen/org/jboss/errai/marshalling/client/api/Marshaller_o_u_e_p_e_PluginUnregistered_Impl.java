package org.jboss.errai.marshalling.client.api;

import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.uberfire.ext.plugin.event.PluginUnregistered;
import org.uberfire.ext.plugin.model.PluginType;

public class Marshaller_o_u_e_p_e_PluginUnregistered_Impl implements GeneratedMarshaller<PluginUnregistered> {
  private PluginUnregistered[] EMPTY_ARRAY = new PluginUnregistered[0];
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller<PluginType> org_uberfire_ext_plugin_model_PluginType = null;
  public PluginUnregistered[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public PluginUnregistered demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(PluginUnregistered.class, objId);
    }
    final String c0 = java_lang_String.demarshall(obj.get("name"), a1);
    final PluginType c1 = obj.get("type").isObject() != null ? Enum.valueOf(PluginType.class, obj.get("type").isObject().get("^EnumStringValue").isString().stringValue()) : obj.get("type").isString() != null ? Enum.valueOf(PluginType.class, obj.get("type").isString().stringValue()) : null;
    PluginUnregistered entity = new PluginUnregistered(c0, c1);
    a1.recordObject(objId, entity);
    return entity;
  }

  public String marshall(PluginUnregistered a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.uberfire.ext.plugin.event.PluginUnregistered") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((("" + ",\"") + "name") + "\":") + java_lang_String.marshall(a0.getName(), a1)) + ",\"") + "type") + "\":") + (a0.getType() != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.uberfire.ext.plugin.model.PluginType") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.getType().name()) + "\"}" : "null")) + "}");
  }

  private void lazyInit() {
    if (org_uberfire_ext_plugin_model_PluginType == null) {
      org_uberfire_ext_plugin_model_PluginType = Marshalling.getMarshaller(PluginType.class);
    }
  }
}