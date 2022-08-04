package org.jboss.errai.marshalling.client.api;

import java.util.Optional;
import org.dashbuilder.kieserver.KieServerConnectionInfo;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_k_KieServerConnectionInfo_Impl implements GeneratedMarshaller<KieServerConnectionInfo> {
  private KieServerConnectionInfo[] EMPTY_ARRAY = new KieServerConnectionInfo[0];
  private Marshaller<Optional> java_util_Optional = Marshalling.getMarshaller(Optional.class);
  private Marshaller<Boolean> java_lang_Boolean = Marshalling.getMarshaller(Boolean.class);
  public KieServerConnectionInfo[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public KieServerConnectionInfo demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(KieServerConnectionInfo.class, objId);
    }
    final Optional c0 = java_util_Optional.demarshall(obj.get("location"), a1);
    final Optional c1 = java_util_Optional.demarshall(obj.get("user"), a1);
    final Optional c2 = java_util_Optional.demarshall(obj.get("password"), a1);
    final Optional c3 = java_util_Optional.demarshall(obj.get("token"), a1);
    final Boolean c4 = java_lang_Boolean.demarshall(obj.get("replaceQuery"), a1);
    KieServerConnectionInfo entity = new KieServerConnectionInfo(c0, c1, c2, c3, c4);
    a1.recordObject(objId, entity);
    return entity;
  }

  public String marshall(KieServerConnectionInfo a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.kieserver.KieServerConnectionInfo") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((((((((((("" + ",\"") + "location") + "\":") + java_util_Optional.marshall(a0.getLocation(), a1)) + ",\"") + "user") + "\":") + java_util_Optional.marshall(a0.getUser(), a1)) + ",\"") + "password") + "\":") + java_util_Optional.marshall(a0.getPassword(), a1)) + ",\"") + "token") + "\":") + java_util_Optional.marshall(a0.getToken(), a1)) + ",\"") + "replaceQuery") + "\":") + java_lang_Boolean.marshall(a0.isReplaceQuery(), a1)) + "}");
  }

  private void lazyInit() {

  }
}