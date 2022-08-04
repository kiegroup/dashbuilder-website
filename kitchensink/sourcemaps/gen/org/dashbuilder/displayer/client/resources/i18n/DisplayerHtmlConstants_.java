package org.dashbuilder.displayer.client.resources.i18n;

public class DisplayerHtmlConstants_ implements org.dashbuilder.displayer.client.resources.i18n.DisplayerHtmlConstants {
  
  public java.lang.String displayer_html_preview_link() {
    return "Preview";
  }
  
  public java.lang.String displayer_source_code_html() {
    return "HTML";
  }
  
  public java.lang.String displayer_source_code_javascript() {
    return "Javascript";
  }
  
  public boolean getBoolean(java.lang.String arg0) {
    Boolean target = (Boolean) cache.get(arg0);
    if (target != null) {
      return target.booleanValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.displayer.client.resources.i18n.DisplayerHtmlConstants", arg0);
  }
  
  public double getDouble(java.lang.String arg0) {
    Double target = (Double) cache.get(arg0);
    if (target != null) {
      return target.doubleValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.displayer.client.resources.i18n.DisplayerHtmlConstants", arg0);
  }
  
  public float getFloat(java.lang.String arg0) {
    Float target = (Float) cache.get(arg0);
    if (target != null) {
      return target.floatValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.displayer.client.resources.i18n.DisplayerHtmlConstants", arg0);
  }
  
  public int getInt(java.lang.String arg0) {
    Integer target = (Integer) cache.get(arg0);
    if (target != null) {
      return target.intValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.displayer.client.resources.i18n.DisplayerHtmlConstants", arg0);
  }
  
  public java.util.Map<java.lang.String, java.lang.String> getMap(java.lang.String arg0) {
    java.util.Map<java.lang.String, java.lang.String> target = (java.util.Map<java.lang.String, java.lang.String>) cache.get(arg0);
    if (target != null) {
      return target;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.displayer.client.resources.i18n.DisplayerHtmlConstants", arg0);
  }
  
  public java.lang.String getString(java.lang.String arg0) {
    java.lang.String target = (java.lang.String) cache.get(arg0);
    if (target != null) {
      return target;
    }
    if (arg0.equals("displayer_html_preview_link")) {
      String answer = displayer_html_preview_link();
      cache.put("displayer_html_preview_link",answer);
      return answer;
    }
    if (arg0.equals("displayer_source_code_html")) {
      String answer = displayer_source_code_html();
      cache.put("displayer_source_code_html",answer);
      return answer;
    }
    if (arg0.equals("displayer_source_code_javascript")) {
      String answer = displayer_source_code_javascript();
      cache.put("displayer_source_code_javascript",answer);
      return answer;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.displayer.client.resources.i18n.DisplayerHtmlConstants", arg0);
  }
  
  public java.lang.String[] getStringArray(java.lang.String arg0) {
    java.lang.String[] target = (java.lang.String[]) cache.get(arg0);
    if (target != null) {
      return target;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.displayer.client.resources.i18n.DisplayerHtmlConstants", arg0);
  }
  java.util.Map cache = new java.util.HashMap();
}
