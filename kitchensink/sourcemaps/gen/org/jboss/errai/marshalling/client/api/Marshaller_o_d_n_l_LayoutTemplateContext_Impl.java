package org.jboss.errai.marshalling.client.api;

import java.util.Set;
import org.dashbuilder.navigation.layout.LayoutTemplateContext;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_n_l_LayoutTemplateContext_Impl implements GeneratedMarshaller<LayoutTemplateContext> {
  private LayoutTemplateContext[] EMPTY_ARRAY = new LayoutTemplateContext[0];
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  public LayoutTemplateContext[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static String LayoutTemplateContext_String_navGroupId(LayoutTemplateContext instance) /*-{
    return instance.@org.dashbuilder.navigation.layout.LayoutTemplateContext::navGroupId;
  }-*/;

  native static void LayoutTemplateContext_String_navGroupId(LayoutTemplateContext instance, String value) /*-{
    instance.@org.dashbuilder.navigation.layout.LayoutTemplateContext::navGroupId = value;
  }-*/;

  public LayoutTemplateContext demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(LayoutTemplateContext.class, objId);
    }
    LayoutTemplateContext entity = new LayoutTemplateContext();
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
        case "navGroupId": LayoutTemplateContext_String_navGroupId(entity, java_lang_String.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(LayoutTemplateContext a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.navigation.layout.LayoutTemplateContext") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((("" + ",\"") + "navGroupId") + "\":") + java_lang_String.marshall(a0.getNavGroupId(), a1)) + "}");
  }

  private void lazyInit() {

  }
}