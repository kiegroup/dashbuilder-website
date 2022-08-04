package org.jboss.errai.marshalling.client.api;

import java.util.Set;
import org.dashbuilder.navigation.layout.LayoutRecursionIssue;
import org.dashbuilder.navigation.layout.LayoutTemplateInfo;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.uberfire.ext.layout.editor.api.editor.LayoutTemplate;

public class Marshaller_o_d_n_l_LayoutTemplateInfo_Impl implements GeneratedMarshaller<LayoutTemplateInfo> {
  private LayoutTemplateInfo[] EMPTY_ARRAY = new LayoutTemplateInfo[0];
  private Marshaller<LayoutTemplate> org_uberfire_ext_layout_editor_api_editor_LayoutTemplate = null;
  private Marshaller<Boolean> java_lang_Boolean = Marshalling.getMarshaller(Boolean.class);
  private Marshaller<LayoutRecursionIssue> org_dashbuilder_navigation_layout_LayoutRecursionIssue = null;
  public LayoutTemplateInfo[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static LayoutTemplate LayoutTemplateInfo_LayoutTemplate_layoutTemplate(LayoutTemplateInfo instance) /*-{
    return instance.@org.dashbuilder.navigation.layout.LayoutTemplateInfo::layoutTemplate;
  }-*/;

  native static void LayoutTemplateInfo_LayoutTemplate_layoutTemplate(LayoutTemplateInfo instance, LayoutTemplate value) /*-{
    instance.@org.dashbuilder.navigation.layout.LayoutTemplateInfo::layoutTemplate = value;
  }-*/;

  native static boolean LayoutTemplateInfo_boolean_hasNavigationComponents(LayoutTemplateInfo instance) /*-{
    return instance.@org.dashbuilder.navigation.layout.LayoutTemplateInfo::hasNavigationComponents;
  }-*/;

  native static void LayoutTemplateInfo_boolean_hasNavigationComponents(LayoutTemplateInfo instance, boolean value) /*-{
    instance.@org.dashbuilder.navigation.layout.LayoutTemplateInfo::hasNavigationComponents = value;
  }-*/;

  native static LayoutRecursionIssue LayoutTemplateInfo_LayoutRecursionIssue_recursionIssue(LayoutTemplateInfo instance) /*-{
    return instance.@org.dashbuilder.navigation.layout.LayoutTemplateInfo::recursionIssue;
  }-*/;

  native static void LayoutTemplateInfo_LayoutRecursionIssue_recursionIssue(LayoutTemplateInfo instance, LayoutRecursionIssue value) /*-{
    instance.@org.dashbuilder.navigation.layout.LayoutTemplateInfo::recursionIssue = value;
  }-*/;

  public LayoutTemplateInfo demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(LayoutTemplateInfo.class, objId);
    }
    LayoutTemplateInfo entity = new LayoutTemplateInfo();
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
        case "layoutTemplate": LayoutTemplateInfo_LayoutTemplate_layoutTemplate(entity, org_uberfire_ext_layout_editor_api_editor_LayoutTemplate.demarshall(objVal, a1));
        break;
        case "hasNavigationComponents": LayoutTemplateInfo_boolean_hasNavigationComponents(entity, java_lang_Boolean.demarshall(objVal, a1));
        break;
        case "recursionIssue": LayoutTemplateInfo_LayoutRecursionIssue_recursionIssue(entity, org_dashbuilder_navigation_layout_LayoutRecursionIssue.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(LayoutTemplateInfo a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.navigation.layout.LayoutTemplateInfo") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((("" + ",\"") + "layoutTemplate") + "\":") + org_uberfire_ext_layout_editor_api_editor_LayoutTemplate.marshall(a0.getLayoutTemplate(), a1)) + ",\"") + "hasNavigationComponents") + "\":") + java_lang_Boolean.marshall(LayoutTemplateInfo_boolean_hasNavigationComponents(a0), a1)) + ",\"") + "recursionIssue") + "\":") + org_dashbuilder_navigation_layout_LayoutRecursionIssue.marshall(a0.getRecursionIssue(), a1)) + "}");
  }

  private void lazyInit() {
    if (org_uberfire_ext_layout_editor_api_editor_LayoutTemplate == null) {
      org_uberfire_ext_layout_editor_api_editor_LayoutTemplate = Marshalling.getMarshaller(LayoutTemplate.class);
    }
    if (org_dashbuilder_navigation_layout_LayoutRecursionIssue == null) {
      org_dashbuilder_navigation_layout_LayoutRecursionIssue = Marshalling.getMarshaller(LayoutRecursionIssue.class);
    }
  }
}