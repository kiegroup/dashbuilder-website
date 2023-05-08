package org.jboss.errai.marshalling.client.api;

import java.util.Set;
import org.dashbuilder.dataprovider.DefaultProviderType;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_d_DefaultProviderType_Impl implements GeneratedMarshaller<DefaultProviderType> {
  private DefaultProviderType[] EMPTY_ARRAY = new DefaultProviderType[0];
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  public DefaultProviderType[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static String DefaultProviderType_String_name(DefaultProviderType instance) /*-{
    return instance.@org.dashbuilder.dataprovider.DefaultProviderType::name;
  }-*/;

  native static void DefaultProviderType_String_name(DefaultProviderType instance, String value) /*-{
    instance.@org.dashbuilder.dataprovider.DefaultProviderType::name = value;
  }-*/;

  public DefaultProviderType demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(DefaultProviderType.class, objId);
    }
    DefaultProviderType entity = new DefaultProviderType();
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
        case "name": DefaultProviderType_String_name(entity, java_lang_String.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(DefaultProviderType a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.dataprovider.DefaultProviderType") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((("" + ",\"") + "name") + "\":") + java_lang_String.marshall(a0.getName(), a1)) + "}");
  }

  private void lazyInit() {

  }
}