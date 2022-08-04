package org.dashbuilder.common.client.resources.i18n;

public class DashbuilderCommonConstants_ implements org.dashbuilder.common.client.resources.i18n.DashbuilderCommonConstants {
  
  public java.lang.String add() {
    return "Add";
  }
  
  public java.lang.String remove() {
    return "Remove";
  }
  
  public java.lang.String noData() {
    return "No data";
  }
  
  public java.lang.String key() {
    return "Key";
  }
  
  public java.lang.String value() {
    return "Value";
  }
  
  public java.lang.String actions() {
    return "Actions";
  }
  
  public java.lang.String newValue() {
    return "--New Value--";
  }
  
  public java.lang.String currentFilePath() {
    return "Current file path";
  }
  
  public java.lang.String uploadSuccessful() {
    return "File uploaded successfully";
  }
  
  public java.lang.String uploadFailed() {
    return "File upload failed";
  }
  
  public java.lang.String uploadFailedAlreadyExists() {
    return "File upload failed. File already exists";
  }
  
  public java.lang.String clearAll() {
    return "Clear All";
  }
  
  public java.lang.String loading() {
    return "Loading";
  }
  
  public boolean getBoolean(java.lang.String arg0) {
    Boolean target = (Boolean) cache.get(arg0);
    if (target != null) {
      return target.booleanValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.common.client.resources.i18n.DashbuilderCommonConstants", arg0);
  }
  
  public double getDouble(java.lang.String arg0) {
    Double target = (Double) cache.get(arg0);
    if (target != null) {
      return target.doubleValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.common.client.resources.i18n.DashbuilderCommonConstants", arg0);
  }
  
  public float getFloat(java.lang.String arg0) {
    Float target = (Float) cache.get(arg0);
    if (target != null) {
      return target.floatValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.common.client.resources.i18n.DashbuilderCommonConstants", arg0);
  }
  
  public int getInt(java.lang.String arg0) {
    Integer target = (Integer) cache.get(arg0);
    if (target != null) {
      return target.intValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.common.client.resources.i18n.DashbuilderCommonConstants", arg0);
  }
  
  public java.util.Map<java.lang.String, java.lang.String> getMap(java.lang.String arg0) {
    java.util.Map<java.lang.String, java.lang.String> target = (java.util.Map<java.lang.String, java.lang.String>) cache.get(arg0);
    if (target != null) {
      return target;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.common.client.resources.i18n.DashbuilderCommonConstants", arg0);
  }
  
  public java.lang.String getString(java.lang.String arg0) {
    java.lang.String target = (java.lang.String) cache.get(arg0);
    if (target != null) {
      return target;
    }
    if (arg0.equals("add")) {
      String answer = add();
      cache.put("add",answer);
      return answer;
    }
    if (arg0.equals("remove")) {
      String answer = remove();
      cache.put("remove",answer);
      return answer;
    }
    if (arg0.equals("noData")) {
      String answer = noData();
      cache.put("noData",answer);
      return answer;
    }
    if (arg0.equals("key")) {
      String answer = key();
      cache.put("key",answer);
      return answer;
    }
    if (arg0.equals("value")) {
      String answer = value();
      cache.put("value",answer);
      return answer;
    }
    if (arg0.equals("actions")) {
      String answer = actions();
      cache.put("actions",answer);
      return answer;
    }
    if (arg0.equals("newValue")) {
      String answer = newValue();
      cache.put("newValue",answer);
      return answer;
    }
    if (arg0.equals("currentFilePath")) {
      String answer = currentFilePath();
      cache.put("currentFilePath",answer);
      return answer;
    }
    if (arg0.equals("uploadSuccessful")) {
      String answer = uploadSuccessful();
      cache.put("uploadSuccessful",answer);
      return answer;
    }
    if (arg0.equals("uploadFailed")) {
      String answer = uploadFailed();
      cache.put("uploadFailed",answer);
      return answer;
    }
    if (arg0.equals("uploadFailedAlreadyExists")) {
      String answer = uploadFailedAlreadyExists();
      cache.put("uploadFailedAlreadyExists",answer);
      return answer;
    }
    if (arg0.equals("clearAll")) {
      String answer = clearAll();
      cache.put("clearAll",answer);
      return answer;
    }
    if (arg0.equals("loading")) {
      String answer = loading();
      cache.put("loading",answer);
      return answer;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.common.client.resources.i18n.DashbuilderCommonConstants", arg0);
  }
  
  public java.lang.String[] getStringArray(java.lang.String arg0) {
    java.lang.String[] target = (java.lang.String[]) cache.get(arg0);
    if (target != null) {
      return target;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.common.client.resources.i18n.DashbuilderCommonConstants", arg0);
  }
  java.util.Map cache = new java.util.HashMap();
}
