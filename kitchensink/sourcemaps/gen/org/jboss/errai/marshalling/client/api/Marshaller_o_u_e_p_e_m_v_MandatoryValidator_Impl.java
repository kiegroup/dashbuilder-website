package org.jboss.errai.marshalling.client.api;

import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.uberfire.ext.properties.editor.model.validators.MandatoryValidator;

public class Marshaller_o_u_e_p_e_m_v_MandatoryValidator_Impl implements GeneratedMarshaller<MandatoryValidator> {
  private MandatoryValidator[] EMPTY_ARRAY = new MandatoryValidator[0];
  public MandatoryValidator[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public MandatoryValidator demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(MandatoryValidator.class, objId);
    }
    MandatoryValidator entity = new MandatoryValidator();
    a1.recordObject(objId, entity);
    return entity;
  }

  public String marshall(MandatoryValidator a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.uberfire.ext.properties.editor.model.validators.MandatoryValidator") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + (((("" + ",\"") + "^InstantiateOnly") + "\":true") + "}");
  }

  private void lazyInit() {

  }
}