package org.dashbuilder.dataset.client.resources.i18n;

public class CoreFunctionTypeConstants_ implements org.dashbuilder.dataset.client.resources.i18n.CoreFunctionTypeConstants {
  
  public java.lang.String IS_NULL() {
    return "is null";
  }
  
  public java.lang.String NOT_NULL() {
    return "not null";
  }
  
  public java.lang.String EQUALS_TO() {
    return "equals to";
  }
  
  public java.lang.String NOT_EQUALS_TO() {
    return "different to";
  }
  
  public java.lang.String LIKE_TO() {
    return "like";
  }
  
  public java.lang.String GREATER_THAN() {
    return "greater than";
  }
  
  public java.lang.String GREATER_OR_EQUALS_TO() {
    return "greater or equals";
  }
  
  public java.lang.String LOWER_THAN() {
    return "lower than";
  }
  
  public java.lang.String LOWER_OR_EQUALS_TO() {
    return "lower or equals";
  }
  
  public java.lang.String BETWEEN() {
    return "between";
  }
  
  public java.lang.String TIME_FRAME() {
    return "time frame";
  }
  
  public java.lang.String IN() {
    return "in";
  }
  
  public java.lang.String NOT_IN() {
    return "not in";
  }
  
  public boolean getBoolean(java.lang.String arg0) {
    Boolean target = (Boolean) cache.get(arg0);
    if (target != null) {
      return target.booleanValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.dataset.client.resources.i18n.CoreFunctionTypeConstants", arg0);
  }
  
  public double getDouble(java.lang.String arg0) {
    Double target = (Double) cache.get(arg0);
    if (target != null) {
      return target.doubleValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.dataset.client.resources.i18n.CoreFunctionTypeConstants", arg0);
  }
  
  public float getFloat(java.lang.String arg0) {
    Float target = (Float) cache.get(arg0);
    if (target != null) {
      return target.floatValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.dataset.client.resources.i18n.CoreFunctionTypeConstants", arg0);
  }
  
  public int getInt(java.lang.String arg0) {
    Integer target = (Integer) cache.get(arg0);
    if (target != null) {
      return target.intValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.dataset.client.resources.i18n.CoreFunctionTypeConstants", arg0);
  }
  
  public java.util.Map<java.lang.String, java.lang.String> getMap(java.lang.String arg0) {
    java.util.Map<java.lang.String, java.lang.String> target = (java.util.Map<java.lang.String, java.lang.String>) cache.get(arg0);
    if (target != null) {
      return target;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.dataset.client.resources.i18n.CoreFunctionTypeConstants", arg0);
  }
  
  public java.lang.String getString(java.lang.String arg0) {
    java.lang.String target = (java.lang.String) cache.get(arg0);
    if (target != null) {
      return target;
    }
    if (arg0.equals("IS_NULL")) {
      String answer = IS_NULL();
      cache.put("IS_NULL",answer);
      return answer;
    }
    if (arg0.equals("NOT_NULL")) {
      String answer = NOT_NULL();
      cache.put("NOT_NULL",answer);
      return answer;
    }
    if (arg0.equals("EQUALS_TO")) {
      String answer = EQUALS_TO();
      cache.put("EQUALS_TO",answer);
      return answer;
    }
    if (arg0.equals("NOT_EQUALS_TO")) {
      String answer = NOT_EQUALS_TO();
      cache.put("NOT_EQUALS_TO",answer);
      return answer;
    }
    if (arg0.equals("LIKE_TO")) {
      String answer = LIKE_TO();
      cache.put("LIKE_TO",answer);
      return answer;
    }
    if (arg0.equals("GREATER_THAN")) {
      String answer = GREATER_THAN();
      cache.put("GREATER_THAN",answer);
      return answer;
    }
    if (arg0.equals("GREATER_OR_EQUALS_TO")) {
      String answer = GREATER_OR_EQUALS_TO();
      cache.put("GREATER_OR_EQUALS_TO",answer);
      return answer;
    }
    if (arg0.equals("LOWER_THAN")) {
      String answer = LOWER_THAN();
      cache.put("LOWER_THAN",answer);
      return answer;
    }
    if (arg0.equals("LOWER_OR_EQUALS_TO")) {
      String answer = LOWER_OR_EQUALS_TO();
      cache.put("LOWER_OR_EQUALS_TO",answer);
      return answer;
    }
    if (arg0.equals("BETWEEN")) {
      String answer = BETWEEN();
      cache.put("BETWEEN",answer);
      return answer;
    }
    if (arg0.equals("TIME_FRAME")) {
      String answer = TIME_FRAME();
      cache.put("TIME_FRAME",answer);
      return answer;
    }
    if (arg0.equals("IN")) {
      String answer = IN();
      cache.put("IN",answer);
      return answer;
    }
    if (arg0.equals("NOT_IN")) {
      String answer = NOT_IN();
      cache.put("NOT_IN",answer);
      return answer;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.dataset.client.resources.i18n.CoreFunctionTypeConstants", arg0);
  }
  
  public java.lang.String[] getStringArray(java.lang.String arg0) {
    java.lang.String[] target = (java.lang.String[]) cache.get(arg0);
    if (target != null) {
      return target;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.dataset.client.resources.i18n.CoreFunctionTypeConstants", arg0);
  }
  java.util.Map cache = new java.util.HashMap();
}
