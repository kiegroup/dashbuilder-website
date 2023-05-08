package org.jboss.errai.marshalling.client.api;

import org.dashbuilder.shared.event.UpdatedGlobalSettingsEvent;
import org.dashbuilder.shared.model.GlobalSettings;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_s_e_UpdatedGlobalSettingsEvent_Impl implements GeneratedMarshaller<UpdatedGlobalSettingsEvent> {
  private UpdatedGlobalSettingsEvent[] EMPTY_ARRAY = new UpdatedGlobalSettingsEvent[0];
  private Marshaller<GlobalSettings> org_dashbuilder_shared_model_GlobalSettings = null;
  public UpdatedGlobalSettingsEvent[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public UpdatedGlobalSettingsEvent demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(UpdatedGlobalSettingsEvent.class, objId);
    }
    final GlobalSettings c0 = org_dashbuilder_shared_model_GlobalSettings.demarshall(obj.get("globalSettings"), a1);
    UpdatedGlobalSettingsEvent entity = new UpdatedGlobalSettingsEvent(c0);
    a1.recordObject(objId, entity);
    return entity;
  }

  public String marshall(UpdatedGlobalSettingsEvent a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.shared.event.UpdatedGlobalSettingsEvent") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((("" + ",\"") + "globalSettings") + "\":") + org_dashbuilder_shared_model_GlobalSettings.marshall(a0.getGlobalSettings(), a1)) + "}");
  }

  private void lazyInit() {
    if (org_dashbuilder_shared_model_GlobalSettings == null) {
      org_dashbuilder_shared_model_GlobalSettings = Marshalling.getMarshaller(GlobalSettings.class);
    }
  }
}