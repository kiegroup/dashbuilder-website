package org.dashbuilder.dataset.client.resources.i18n;

public class TimeModeConstants_ implements org.dashbuilder.dataset.client.resources.i18n.TimeModeConstants {
  
  public java.lang.String NOW() {
    return "Now";
  }
  
  public java.lang.String BEGIN() {
    return "Begin of";
  }
  
  public java.lang.String END() {
    return "End of";
  }
  
  public boolean getBoolean(java.lang.String arg0) {
    Boolean target = (Boolean) cache.get(arg0);
    if (target != null) {
      return target.booleanValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.dataset.client.resources.i18n.TimeModeConstants", arg0);
  }
  
  public double getDouble(java.lang.String arg0) {
    Double target = (Double) cache.get(arg0);
    if (target != null) {
      return target.doubleValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.dataset.client.resources.i18n.TimeModeConstants", arg0);
  }
  
  public float getFloat(java.lang.String arg0) {
    Float target = (Float) cache.get(arg0);
    if (target != null) {
      return target.floatValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.dataset.client.resources.i18n.TimeModeConstants", arg0);
  }
  
  public int getInt(java.lang.String arg0) {
    Integer target = (Integer) cache.get(arg0);
    if (target != null) {
      return target.intValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.dataset.client.resources.i18n.TimeModeConstants", arg0);
  }
  
  public java.util.Map<java.lang.String, java.lang.String> getMap(java.lang.String arg0) {
    java.util.Map<java.lang.String, java.lang.String> target = (java.util.Map<java.lang.String, java.lang.String>) cache.get(arg0);
    if (target != null) {
      return target;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.dataset.client.resources.i18n.TimeModeConstants", arg0);
  }
  
  public java.lang.String getString(java.lang.String arg0) {
    java.lang.String target = (java.lang.String) cache.get(arg0);
    if (target != null) {
      return target;
    }
    if (arg0.equals("NOW")) {
      String answer = NOW();
      cache.put("NOW",answer);
      return answer;
    }
    if (arg0.equals("BEGIN")) {
      String answer = BEGIN();
      cache.put("BEGIN",answer);
      return answer;
    }
    if (arg0.equals("END")) {
      String answer = END();
      cache.put("END",answer);
      return answer;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.dataset.client.resources.i18n.TimeModeConstants", arg0);
  }
  
  public java.lang.String[] getStringArray(java.lang.String arg0) {
    java.lang.String[] target = (java.lang.String[]) cache.get(arg0);
    if (target != null) {
      return target;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.dataset.client.resources.i18n.TimeModeConstants", arg0);
  }
  java.util.Map cache = new java.util.HashMap();
}
