package org.jboss.errai.marshalling.client.api;

import java.util.Set;
import org.dashbuilder.navigation.layout.LayoutNavigationRef;
import org.dashbuilder.navigation.layout.LayoutNavigationRefType;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_n_l_LayoutNavigationRef_Impl implements GeneratedMarshaller<LayoutNavigationRef> {
  private LayoutNavigationRef[] EMPTY_ARRAY = new LayoutNavigationRef[0];
  private Marshaller<LayoutNavigationRefType> org_dashbuilder_navigation_layout_LayoutNavigationRefType = null;
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  public LayoutNavigationRef[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static LayoutNavigationRefType LayoutNavigationRef_LayoutNavigationRefType_type(LayoutNavigationRef instance) /*-{
    return instance.@org.dashbuilder.navigation.layout.LayoutNavigationRef::type;
  }-*/;

  native static void LayoutNavigationRef_LayoutNavigationRefType_type(LayoutNavigationRef instance, LayoutNavigationRefType value) /*-{
    instance.@org.dashbuilder.navigation.layout.LayoutNavigationRef::type = value;
  }-*/;

  native static String LayoutNavigationRef_String_name(LayoutNavigationRef instance) /*-{
    return instance.@org.dashbuilder.navigation.layout.LayoutNavigationRef::name;
  }-*/;

  native static void LayoutNavigationRef_String_name(LayoutNavigationRef instance, String value) /*-{
    instance.@org.dashbuilder.navigation.layout.LayoutNavigationRef::name = value;
  }-*/;

  public LayoutNavigationRef demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(LayoutNavigationRef.class, objId);
    }
    LayoutNavigationRef entity = new LayoutNavigationRef();
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
        case "type": LayoutNavigationRef_LayoutNavigationRefType_type(entity, objVal.isObject() != null ? Enum.valueOf(LayoutNavigationRefType.class, objVal.isObject().get("^EnumStringValue").isString().stringValue()) : objVal.isString() != null ? Enum.valueOf(LayoutNavigationRefType.class, objVal.isString().stringValue()) : null);
        break;
        case "name": LayoutNavigationRef_String_name(entity, java_lang_String.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(LayoutNavigationRef a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.navigation.layout.LayoutNavigationRef") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((("" + ",\"") + "type") + "\":") + (a0.getType() != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.dashbuilder.navigation.layout.LayoutNavigationRefType") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.getType().name()) + "\"}" : "null")) + ",\"") + "name") + "\":") + java_lang_String.marshall(a0.getName(), a1)) + "}");
  }

  private void lazyInit() {
    if (org_dashbuilder_navigation_layout_LayoutNavigationRefType == null) {
      org_dashbuilder_navigation_layout_LayoutNavigationRefType = Marshalling.getMarshaller(LayoutNavigationRefType.class);
    }
  }
}