package org.jboss.errai.marshalling.client.api;

import java.util.Set;
import org.dashbuilder.renderer.RendererSettings;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_r_RendererSettings_Impl implements GeneratedMarshaller<RendererSettings> {
  private RendererSettings[] EMPTY_ARRAY = new RendererSettings[0];
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller<Boolean> java_lang_Boolean = Marshalling.getMarshaller(Boolean.class);
  public RendererSettings[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static String RendererSettings_String_defaultRenderer(RendererSettings instance) /*-{
    return instance.@org.dashbuilder.renderer.RendererSettings::defaultRenderer;
  }-*/;

  native static void RendererSettings_String_defaultRenderer(RendererSettings instance, String value) /*-{
    instance.@org.dashbuilder.renderer.RendererSettings::defaultRenderer = value;
  }-*/;

  native static boolean RendererSettings_boolean_offline(RendererSettings instance) /*-{
    return instance.@org.dashbuilder.renderer.RendererSettings::offline;
  }-*/;

  native static void RendererSettings_boolean_offline(RendererSettings instance, boolean value) /*-{
    instance.@org.dashbuilder.renderer.RendererSettings::offline = value;
  }-*/;

  public RendererSettings demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(RendererSettings.class, objId);
    }
    RendererSettings entity = new RendererSettings();
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
        case "defaultRenderer": RendererSettings_String_defaultRenderer(entity, java_lang_String.demarshall(objVal, a1));
        break;
        case "offline": RendererSettings_boolean_offline(entity, java_lang_Boolean.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(RendererSettings a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.renderer.RendererSettings") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((("" + ",\"") + "defaultRenderer") + "\":") + java_lang_String.marshall(a0.getDefaultRenderer(), a1)) + ",\"") + "offline") + "\":") + java_lang_Boolean.marshall(RendererSettings_boolean_offline(a0), a1)) + "}");
  }

  private void lazyInit() {

  }
}