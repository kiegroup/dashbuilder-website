package org.jboss.errai.marshalling.client.api;

import java.util.Set;
import org.dashbuilder.displayer.DisplayerSettings;
import org.dashbuilder.displayer.Mode;
import org.dashbuilder.shared.model.GlobalSettings;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_s_m_GlobalSettings_Impl implements GeneratedMarshaller<GlobalSettings> {
  private GlobalSettings[] EMPTY_ARRAY = new GlobalSettings[0];
  private Marshaller<Mode> org_dashbuilder_displayer_Mode = null;
  private Marshaller<DisplayerSettings> org_dashbuilder_displayer_DisplayerSettings = null;
  private Marshaller<Boolean> java_lang_Boolean = Marshalling.getMarshaller(Boolean.class);
  public GlobalSettings[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public GlobalSettings demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(GlobalSettings.class, objId);
    }
    GlobalSettings entity = new GlobalSettings();
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
        case "mode": entity.setMode(objVal.isObject() != null ? Enum.valueOf(Mode.class, objVal.isObject().get("^EnumStringValue").isString().stringValue()) : objVal.isString() != null ? Enum.valueOf(Mode.class, objVal.isString().stringValue()) : null);
        break;
        case "settings": entity.setSettings(org_dashbuilder_displayer_DisplayerSettings.demarshall(objVal, a1));
        break;
        case "allowUrlProperties": entity.setAllowUrlProperties(java_lang_Boolean.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  native static boolean GlobalSettings_boolean_allowUrlProperties(GlobalSettings instance) /*-{
    return instance.@org.dashbuilder.shared.model.GlobalSettings::allowUrlProperties;
  }-*/;

  native static void GlobalSettings_boolean_allowUrlProperties(GlobalSettings instance, boolean value) /*-{
    instance.@org.dashbuilder.shared.model.GlobalSettings::allowUrlProperties = value;
  }-*/;

  public String marshall(GlobalSettings a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.shared.model.GlobalSettings") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((("" + ",\"") + "mode") + "\":") + (a0.getMode() != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.dashbuilder.displayer.Mode") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.getMode().name()) + "\"}" : "null")) + ",\"") + "settings") + "\":") + org_dashbuilder_displayer_DisplayerSettings.marshall(a0.getSettings(), a1)) + ",\"") + "allowUrlProperties") + "\":") + java_lang_Boolean.marshall(GlobalSettings_boolean_allowUrlProperties(a0), a1)) + "}");
  }

  private void lazyInit() {
    if (org_dashbuilder_displayer_Mode == null) {
      org_dashbuilder_displayer_Mode = Marshalling.getMarshaller(Mode.class);
    }
    if (org_dashbuilder_displayer_DisplayerSettings == null) {
      org_dashbuilder_displayer_DisplayerSettings = Marshalling.getMarshaller(DisplayerSettings.class);
    }
  }
}