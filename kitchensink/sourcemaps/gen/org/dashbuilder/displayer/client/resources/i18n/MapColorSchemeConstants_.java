package org.dashbuilder.displayer.client.resources.i18n;

public class MapColorSchemeConstants_ implements org.dashbuilder.displayer.client.resources.i18n.MapColorSchemeConstants {
  
  public java.lang.String COLOR_SCHEME_RED() {
    return "Red";
  }
  
  public java.lang.String COLOR_SCHEME_BLUE() {
    return "Blue";
  }
  
  public java.lang.String COLOR_SCHEME_GREEN() {
    return "Green";
  }
  
  public boolean getBoolean(java.lang.String arg0) {
    Boolean target = (Boolean) cache.get(arg0);
    if (target != null) {
      return target.booleanValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.displayer.client.resources.i18n.MapColorSchemeConstants", arg0);
  }
  
  public double getDouble(java.lang.String arg0) {
    Double target = (Double) cache.get(arg0);
    if (target != null) {
      return target.doubleValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.displayer.client.resources.i18n.MapColorSchemeConstants", arg0);
  }
  
  public float getFloat(java.lang.String arg0) {
    Float target = (Float) cache.get(arg0);
    if (target != null) {
      return target.floatValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.displayer.client.resources.i18n.MapColorSchemeConstants", arg0);
  }
  
  public int getInt(java.lang.String arg0) {
    Integer target = (Integer) cache.get(arg0);
    if (target != null) {
      return target.intValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.displayer.client.resources.i18n.MapColorSchemeConstants", arg0);
  }
  
  public java.util.Map<java.lang.String, java.lang.String> getMap(java.lang.String arg0) {
    java.util.Map<java.lang.String, java.lang.String> target = (java.util.Map<java.lang.String, java.lang.String>) cache.get(arg0);
    if (target != null) {
      return target;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.displayer.client.resources.i18n.MapColorSchemeConstants", arg0);
  }
  
  public java.lang.String getString(java.lang.String arg0) {
    java.lang.String target = (java.lang.String) cache.get(arg0);
    if (target != null) {
      return target;
    }
    if (arg0.equals("COLOR_SCHEME_RED")) {
      String answer = COLOR_SCHEME_RED();
      cache.put("COLOR_SCHEME_RED",answer);
      return answer;
    }
    if (arg0.equals("COLOR_SCHEME_BLUE")) {
      String answer = COLOR_SCHEME_BLUE();
      cache.put("COLOR_SCHEME_BLUE",answer);
      return answer;
    }
    if (arg0.equals("COLOR_SCHEME_GREEN")) {
      String answer = COLOR_SCHEME_GREEN();
      cache.put("COLOR_SCHEME_GREEN",answer);
      return answer;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.displayer.client.resources.i18n.MapColorSchemeConstants", arg0);
  }
  
  public java.lang.String[] getStringArray(java.lang.String arg0) {
    java.lang.String[] target = (java.lang.String[]) cache.get(arg0);
    if (target != null) {
      return target;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.displayer.client.resources.i18n.MapColorSchemeConstants", arg0);
  }
  java.util.Map cache = new java.util.HashMap();
}
