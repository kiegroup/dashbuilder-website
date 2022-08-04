package org.jboss.errai.marshalling.client.api;

import java.util.Date;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.uberfire.workbench.events.NotificationEvent.NotificationType;
import org.uberfire.workbench.model.Notification;
import org.uberfire.workbench.model.Notification.State;

public class Marshaller_o_u_w_m_Notification_Impl implements GeneratedMarshaller<Notification> {
  private Notification[] EMPTY_ARRAY = new Notification[0];
  private Marshaller<NotificationType> org_uberfire_workbench_events_NotificationEvent_erraiD_NotificationType = null;
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller<Date> java_util_Date = Marshalling.getMarshaller(Date.class);
  private Marshaller<State> org_uberfire_workbench_model_Notification_erraiD_State = null;
  public Notification[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public Notification demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(Notification.class, objId);
    }
    final NotificationType c0 = obj.get("type").isObject() != null ? Enum.valueOf(NotificationType.class, obj.get("type").isObject().get("^EnumStringValue").isString().stringValue()) : obj.get("type").isString() != null ? Enum.valueOf(NotificationType.class, obj.get("type").isString().stringValue()) : null;
    final String c1 = java_lang_String.demarshall(obj.get("message"), a1);
    final Date c2 = java_util_Date.demarshall(obj.get("timestamp"), a1);
    final State c3 = obj.get("state").isObject() != null ? Enum.valueOf(State.class, obj.get("state").isObject().get("^EnumStringValue").isString().stringValue()) : obj.get("state").isString() != null ? Enum.valueOf(State.class, obj.get("state").isString().stringValue()) : null;
    Notification entity = new Notification(c0, c1, c2, c3);
    a1.recordObject(objId, entity);
    return entity;
  }

  public String marshall(Notification a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.uberfire.workbench.model.Notification") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((((((("" + ",\"") + "type") + "\":") + (a0.getType() != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.uberfire.workbench.events.NotificationEvent$NotificationType") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.getType().name()) + "\"}" : "null")) + ",\"") + "message") + "\":") + java_lang_String.marshall(a0.getMessage(), a1)) + ",\"") + "timestamp") + "\":") + java_util_Date.marshall(a0.getTimestamp(), a1)) + ",\"") + "state") + "\":") + (a0.getState() != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.uberfire.workbench.model.Notification$State") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.getState().name()) + "\"}" : "null")) + "}");
  }

  private void lazyInit() {
    if (org_uberfire_workbench_events_NotificationEvent_erraiD_NotificationType == null) {
      org_uberfire_workbench_events_NotificationEvent_erraiD_NotificationType = Marshalling.getMarshaller(NotificationType.class);
    }
    if (org_uberfire_workbench_model_Notification_erraiD_State == null) {
      org_uberfire_workbench_model_Notification_erraiD_State = Marshalling.getMarshaller(State.class);
    }
  }
}