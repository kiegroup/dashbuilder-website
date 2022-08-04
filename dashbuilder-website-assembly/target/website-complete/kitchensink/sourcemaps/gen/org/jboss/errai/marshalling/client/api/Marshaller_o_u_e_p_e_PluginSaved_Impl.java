package org.jboss.errai.marshalling.client.api;

import java.util.Set;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.jboss.errai.marshalling.client.marshallers.ObjectMarshaller;
import org.uberfire.ext.plugin.event.BasePluginEvent;
import org.uberfire.ext.plugin.event.PluginSaved;
import org.uberfire.ext.plugin.model.Plugin;
import org.uberfire.rpc.SessionInfo;

public class Marshaller_o_u_e_p_e_PluginSaved_Impl implements GeneratedMarshaller<PluginSaved> {
  private PluginSaved[] EMPTY_ARRAY = new PluginSaved[0];
  private Marshaller java_lang_Object = Marshalling.getMarshaller(Object.class);
  private Marshaller<SessionInfo> org_uberfire_rpc_SessionInfo = Marshalling.getMarshaller(SessionInfo.class);
  public PluginSaved[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static Plugin BasePluginEvent_Plugin_plugin(BasePluginEvent instance) /*-{
    return instance.@org.uberfire.ext.plugin.event.BasePluginEvent::plugin;
  }-*/;

  native static void BasePluginEvent_Plugin_plugin(BasePluginEvent instance, Plugin value) /*-{
    instance.@org.uberfire.ext.plugin.event.BasePluginEvent::plugin = value;
  }-*/;

  native static SessionInfo BasePluginEvent_SessionInfo_sessionInfo(BasePluginEvent instance) /*-{
    return instance.@org.uberfire.ext.plugin.event.BasePluginEvent::sessionInfo;
  }-*/;

  native static void BasePluginEvent_SessionInfo_sessionInfo(BasePluginEvent instance, SessionInfo value) /*-{
    instance.@org.uberfire.ext.plugin.event.BasePluginEvent::sessionInfo = value;
  }-*/;

  public PluginSaved demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(PluginSaved.class, objId);
    }
    final Plugin c0 = (Plugin) ((ObjectMarshaller) java_lang_Object).demarshall(Plugin.class, obj.get("plugin"), a1);
    final SessionInfo c1 = org_uberfire_rpc_SessionInfo.demarshall(obj.get("sessionInfo"), a1);
    PluginSaved entity = new PluginSaved(c0, c1);
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
        case "plugin": BasePluginEvent_Plugin_plugin(entity, (Plugin) ((ObjectMarshaller) java_lang_Object).demarshall(Plugin.class, objVal, a1));
        break;
        case "sessionInfo": BasePluginEvent_SessionInfo_sessionInfo(entity, org_uberfire_rpc_SessionInfo.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(PluginSaved a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.uberfire.ext.plugin.event.PluginSaved") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((("" + ",\"") + "plugin") + "\":") + java_lang_Object.marshall(a0.getPlugin(), a1)) + ",\"") + "sessionInfo") + "\":") + org_uberfire_rpc_SessionInfo.marshall(a0.getSessionInfo(), a1)) + "}");
  }

  private void lazyInit() {

  }
}