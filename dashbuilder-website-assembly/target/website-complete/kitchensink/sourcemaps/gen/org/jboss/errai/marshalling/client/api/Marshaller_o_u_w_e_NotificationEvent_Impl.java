package org.jboss.errai.marshalling.client.api;

import java.util.Set;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.jboss.errai.marshalling.client.marshallers.ObjectMarshaller;
import org.uberfire.mvp.PlaceRequest;
import org.uberfire.workbench.events.NotificationEvent;
import org.uberfire.workbench.events.NotificationEvent.NotificationType;

public class Marshaller_o_u_w_e_NotificationEvent_Impl implements GeneratedMarshaller<NotificationEvent> {
  private NotificationEvent[] EMPTY_ARRAY = new NotificationEvent[0];
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller<NotificationType> org_uberfire_workbench_events_NotificationEvent_erraiD_NotificationType = null;
  private Marshaller<Boolean> java_lang_Boolean = Marshalling.getMarshaller(Boolean.class);
  private Marshaller java_lang_Object = Marshalling.getMarshaller(Object.class);
  private Marshaller<Integer> java_lang_Integer = Marshalling.getMarshaller(Integer.class);
  public NotificationEvent[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static String NotificationEvent_String_notification(NotificationEvent instance) /*-{
    return instance.@org.uberfire.workbench.events.NotificationEvent::notification;
  }-*/;

  native static void NotificationEvent_String_notification(NotificationEvent instance, String value) /*-{
    instance.@org.uberfire.workbench.events.NotificationEvent::notification = value;
  }-*/;

  native static NotificationType NotificationEvent_NotificationType_type(NotificationEvent instance) /*-{
    return instance.@org.uberfire.workbench.events.NotificationEvent::type;
  }-*/;

  native static void NotificationEvent_NotificationType_type(NotificationEvent instance, NotificationType value) /*-{
    instance.@org.uberfire.workbench.events.NotificationEvent::type = value;
  }-*/;

  native static boolean NotificationEvent_boolean_isSingleton(NotificationEvent instance) /*-{
    return instance.@org.uberfire.workbench.events.NotificationEvent::isSingleton;
  }-*/;

  native static void NotificationEvent_boolean_isSingleton(NotificationEvent instance, boolean value) /*-{
    instance.@org.uberfire.workbench.events.NotificationEvent::isSingleton = value;
  }-*/;

  native static PlaceRequest NotificationEvent_PlaceRequest_placeRequest(NotificationEvent instance) /*-{
    return instance.@org.uberfire.workbench.events.NotificationEvent::placeRequest;
  }-*/;

  native static void NotificationEvent_PlaceRequest_placeRequest(NotificationEvent instance, PlaceRequest value) /*-{
    instance.@org.uberfire.workbench.events.NotificationEvent::placeRequest = value;
  }-*/;

  native static Integer NotificationEvent_Integer_initialTopOffset(NotificationEvent instance) /*-{
    return instance.@org.uberfire.workbench.events.NotificationEvent::initialTopOffset;
  }-*/;

  native static void NotificationEvent_Integer_initialTopOffset(NotificationEvent instance, Integer value) /*-{
    instance.@org.uberfire.workbench.events.NotificationEvent::initialTopOffset = value;
  }-*/;

  native static String NotificationEvent_String_navigationText(NotificationEvent instance) /*-{
    return instance.@org.uberfire.workbench.events.NotificationEvent::navigationText;
  }-*/;

  native static void NotificationEvent_String_navigationText(NotificationEvent instance, String value) /*-{
    instance.@org.uberfire.workbench.events.NotificationEvent::navigationText = value;
  }-*/;

  native static PlaceRequest NotificationEvent_PlaceRequest_navigationPlace(NotificationEvent instance) /*-{
    return instance.@org.uberfire.workbench.events.NotificationEvent::navigationPlace;
  }-*/;

  native static void NotificationEvent_PlaceRequest_navigationPlace(NotificationEvent instance, PlaceRequest value) /*-{
    instance.@org.uberfire.workbench.events.NotificationEvent::navigationPlace = value;
  }-*/;

  public NotificationEvent demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(NotificationEvent.class, objId);
    }
    NotificationEvent entity = new NotificationEvent();
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
        case "notification": NotificationEvent_String_notification(entity, java_lang_String.demarshall(objVal, a1));
        break;
        case "type": NotificationEvent_NotificationType_type(entity, objVal.isObject() != null ? Enum.valueOf(NotificationType.class, objVal.isObject().get("^EnumStringValue").isString().stringValue()) : objVal.isString() != null ? Enum.valueOf(NotificationType.class, objVal.isString().stringValue()) : null);
        break;
        case "isSingleton": NotificationEvent_boolean_isSingleton(entity, java_lang_Boolean.demarshall(objVal, a1));
        break;
        case "placeRequest": NotificationEvent_PlaceRequest_placeRequest(entity, (PlaceRequest) ((ObjectMarshaller) java_lang_Object).demarshall(PlaceRequest.class, objVal, a1));
        break;
        case "initialTopOffset": NotificationEvent_Integer_initialTopOffset(entity, java_lang_Integer.demarshall(objVal, a1));
        break;
        case "autoHide": entity.setAutoHide(java_lang_Boolean.demarshall(objVal, a1));
        break;
        case "navigationText": NotificationEvent_String_navigationText(entity, java_lang_String.demarshall(objVal, a1));
        break;
        case "navigationPlace": NotificationEvent_PlaceRequest_navigationPlace(entity, (PlaceRequest) ((ObjectMarshaller) java_lang_Object).demarshall(PlaceRequest.class, objVal, a1));
        break;
      }
    }
    return entity;
  }

  native static boolean NotificationEvent_boolean_autoHide(NotificationEvent instance) /*-{
    return instance.@org.uberfire.workbench.events.NotificationEvent::autoHide;
  }-*/;

  native static void NotificationEvent_boolean_autoHide(NotificationEvent instance, boolean value) /*-{
    instance.@org.uberfire.workbench.events.NotificationEvent::autoHide = value;
  }-*/;

  public String marshall(NotificationEvent a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.uberfire.workbench.events.NotificationEvent") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((((((((((((((((((((((("" + ",\"") + "notification") + "\":") + java_lang_String.marshall(a0.getNotification(), a1)) + ",\"") + "type") + "\":") + (a0.getType() != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.uberfire.workbench.events.NotificationEvent$NotificationType") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.getType().name()) + "\"}" : "null")) + ",\"") + "isSingleton") + "\":") + java_lang_Boolean.marshall(NotificationEvent_boolean_isSingleton(a0), a1)) + ",\"") + "placeRequest") + "\":") + java_lang_Object.marshall(a0.getPlaceRequest(), a1)) + ",\"") + "initialTopOffset") + "\":") + java_lang_Integer.marshall(a0.getInitialTopOffset(), a1)) + ",\"") + "autoHide") + "\":") + java_lang_Boolean.marshall(NotificationEvent_boolean_autoHide(a0), a1)) + ",\"") + "navigationText") + "\":") + java_lang_String.marshall(a0.getNavigationText(), a1)) + ",\"") + "navigationPlace") + "\":") + java_lang_Object.marshall(a0.getNavigationPlace(), a1)) + "}");
  }

  private void lazyInit() {
    if (org_uberfire_workbench_events_NotificationEvent_erraiD_NotificationType == null) {
      org_uberfire_workbench_events_NotificationEvent_erraiD_NotificationType = Marshalling.getMarshaller(NotificationType.class);
    }
  }
}