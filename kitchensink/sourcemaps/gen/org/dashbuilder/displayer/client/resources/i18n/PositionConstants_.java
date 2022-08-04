package org.dashbuilder.displayer.client.resources.i18n;

public class PositionConstants_ implements org.dashbuilder.displayer.client.resources.i18n.PositionConstants {
  
  public java.lang.String POSITION_BOTTOM() {
    return "Bottom";
  }
  
  public java.lang.String POSITION_TOP() {
    return "Top";
  }
  
  public java.lang.String POSITION_LEFT() {
    return "Left";
  }
  
  public java.lang.String POSITION_RIGHT() {
    return "Right";
  }
  
  public java.lang.String POSITION_IN() {
    return "In";
  }
  
  public boolean getBoolean(java.lang.String arg0) {
    Boolean target = (Boolean) cache.get(arg0);
    if (target != null) {
      return target.booleanValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.displayer.client.resources.i18n.PositionConstants", arg0);
  }
  
  public double getDouble(java.lang.String arg0) {
    Double target = (Double) cache.get(arg0);
    if (target != null) {
      return target.doubleValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.displayer.client.resources.i18n.PositionConstants", arg0);
  }
  
  public float getFloat(java.lang.String arg0) {
    Float target = (Float) cache.get(arg0);
    if (target != null) {
      return target.floatValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.displayer.client.resources.i18n.PositionConstants", arg0);
  }
  
  public int getInt(java.lang.String arg0) {
    Integer target = (Integer) cache.get(arg0);
    if (target != null) {
      return target.intValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.displayer.client.resources.i18n.PositionConstants", arg0);
  }
  
  public java.util.Map<java.lang.String, java.lang.String> getMap(java.lang.String arg0) {
    java.util.Map<java.lang.String, java.lang.String> target = (java.util.Map<java.lang.String, java.lang.String>) cache.get(arg0);
    if (target != null) {
      return target;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.displayer.client.resources.i18n.PositionConstants", arg0);
  }
  
  public java.lang.String getString(java.lang.String arg0) {
    java.lang.String target = (java.lang.String) cache.get(arg0);
    if (target != null) {
      return target;
    }
    if (arg0.equals("POSITION_BOTTOM")) {
      String answer = POSITION_BOTTOM();
      cache.put("POSITION_BOTTOM",answer);
      return answer;
    }
    if (arg0.equals("POSITION_TOP")) {
      String answer = POSITION_TOP();
      cache.put("POSITION_TOP",answer);
      return answer;
    }
    if (arg0.equals("POSITION_LEFT")) {
      String answer = POSITION_LEFT();
      cache.put("POSITION_LEFT",answer);
      return answer;
    }
    if (arg0.equals("POSITION_RIGHT")) {
      String answer = POSITION_RIGHT();
      cache.put("POSITION_RIGHT",answer);
      return answer;
    }
    if (arg0.equals("POSITION_IN")) {
      String answer = POSITION_IN();
      cache.put("POSITION_IN",answer);
      return answer;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.displayer.client.resources.i18n.PositionConstants", arg0);
  }
  
  public java.lang.String[] getStringArray(java.lang.String arg0) {
    java.lang.String[] target = (java.lang.String[]) cache.get(arg0);
    if (target != null) {
      return target;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.displayer.client.resources.i18n.PositionConstants", arg0);
  }
  java.util.Map cache = new java.util.HashMap();
}
