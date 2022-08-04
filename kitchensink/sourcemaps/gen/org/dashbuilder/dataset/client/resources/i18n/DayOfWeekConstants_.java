package org.dashbuilder.dataset.client.resources.i18n;

public class DayOfWeekConstants_ implements org.dashbuilder.dataset.client.resources.i18n.DayOfWeekConstants {
  
  public java.lang.String SUNDAY() {
    return "Sunday";
  }
  
  public java.lang.String MONDAY() {
    return "Monday";
  }
  
  public java.lang.String TUESDAY() {
    return "Tuesday";
  }
  
  public java.lang.String WEDNESDAY() {
    return "Wednesday";
  }
  
  public java.lang.String THURSDAY() {
    return "Thursday";
  }
  
  public java.lang.String FRIDAY() {
    return "Friday";
  }
  
  public java.lang.String SATURDAY() {
    return "Saturday";
  }
  
  public boolean getBoolean(java.lang.String arg0) {
    Boolean target = (Boolean) cache.get(arg0);
    if (target != null) {
      return target.booleanValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.dataset.client.resources.i18n.DayOfWeekConstants", arg0);
  }
  
  public double getDouble(java.lang.String arg0) {
    Double target = (Double) cache.get(arg0);
    if (target != null) {
      return target.doubleValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.dataset.client.resources.i18n.DayOfWeekConstants", arg0);
  }
  
  public float getFloat(java.lang.String arg0) {
    Float target = (Float) cache.get(arg0);
    if (target != null) {
      return target.floatValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.dataset.client.resources.i18n.DayOfWeekConstants", arg0);
  }
  
  public int getInt(java.lang.String arg0) {
    Integer target = (Integer) cache.get(arg0);
    if (target != null) {
      return target.intValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.dataset.client.resources.i18n.DayOfWeekConstants", arg0);
  }
  
  public java.util.Map<java.lang.String, java.lang.String> getMap(java.lang.String arg0) {
    java.util.Map<java.lang.String, java.lang.String> target = (java.util.Map<java.lang.String, java.lang.String>) cache.get(arg0);
    if (target != null) {
      return target;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.dataset.client.resources.i18n.DayOfWeekConstants", arg0);
  }
  
  public java.lang.String getString(java.lang.String arg0) {
    java.lang.String target = (java.lang.String) cache.get(arg0);
    if (target != null) {
      return target;
    }
    if (arg0.equals("SUNDAY")) {
      String answer = SUNDAY();
      cache.put("SUNDAY",answer);
      return answer;
    }
    if (arg0.equals("MONDAY")) {
      String answer = MONDAY();
      cache.put("MONDAY",answer);
      return answer;
    }
    if (arg0.equals("TUESDAY")) {
      String answer = TUESDAY();
      cache.put("TUESDAY",answer);
      return answer;
    }
    if (arg0.equals("WEDNESDAY")) {
      String answer = WEDNESDAY();
      cache.put("WEDNESDAY",answer);
      return answer;
    }
    if (arg0.equals("THURSDAY")) {
      String answer = THURSDAY();
      cache.put("THURSDAY",answer);
      return answer;
    }
    if (arg0.equals("FRIDAY")) {
      String answer = FRIDAY();
      cache.put("FRIDAY",answer);
      return answer;
    }
    if (arg0.equals("SATURDAY")) {
      String answer = SATURDAY();
      cache.put("SATURDAY",answer);
      return answer;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.dataset.client.resources.i18n.DayOfWeekConstants", arg0);
  }
  
  public java.lang.String[] getStringArray(java.lang.String arg0) {
    java.lang.String[] target = (java.lang.String[]) cache.get(arg0);
    if (target != null) {
      return target;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.dataset.client.resources.i18n.DayOfWeekConstants", arg0);
  }
  java.util.Map cache = new java.util.HashMap();
}
