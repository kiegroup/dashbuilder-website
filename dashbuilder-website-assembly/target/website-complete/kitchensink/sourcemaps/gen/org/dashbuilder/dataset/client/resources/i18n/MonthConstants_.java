package org.dashbuilder.dataset.client.resources.i18n;

public class MonthConstants_ implements org.dashbuilder.dataset.client.resources.i18n.MonthConstants {
  
  public java.lang.String JANUARY() {
    return "January";
  }
  
  public java.lang.String FEBRUARY() {
    return "February";
  }
  
  public java.lang.String MARCH() {
    return "March";
  }
  
  public java.lang.String APRIL() {
    return "April";
  }
  
  public java.lang.String MAY() {
    return "May";
  }
  
  public java.lang.String JUNE() {
    return "June";
  }
  
  public java.lang.String JULY() {
    return "July";
  }
  
  public java.lang.String AUGUST() {
    return "August";
  }
  
  public java.lang.String SEPTEMBER() {
    return "September";
  }
  
  public java.lang.String OCTOBER() {
    return "October";
  }
  
  public java.lang.String NOVEMBER() {
    return "November";
  }
  
  public java.lang.String DECEMBER() {
    return "December";
  }
  
  public boolean getBoolean(java.lang.String arg0) {
    Boolean target = (Boolean) cache.get(arg0);
    if (target != null) {
      return target.booleanValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.dataset.client.resources.i18n.MonthConstants", arg0);
  }
  
  public double getDouble(java.lang.String arg0) {
    Double target = (Double) cache.get(arg0);
    if (target != null) {
      return target.doubleValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.dataset.client.resources.i18n.MonthConstants", arg0);
  }
  
  public float getFloat(java.lang.String arg0) {
    Float target = (Float) cache.get(arg0);
    if (target != null) {
      return target.floatValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.dataset.client.resources.i18n.MonthConstants", arg0);
  }
  
  public int getInt(java.lang.String arg0) {
    Integer target = (Integer) cache.get(arg0);
    if (target != null) {
      return target.intValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.dataset.client.resources.i18n.MonthConstants", arg0);
  }
  
  public java.util.Map<java.lang.String, java.lang.String> getMap(java.lang.String arg0) {
    java.util.Map<java.lang.String, java.lang.String> target = (java.util.Map<java.lang.String, java.lang.String>) cache.get(arg0);
    if (target != null) {
      return target;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.dataset.client.resources.i18n.MonthConstants", arg0);
  }
  
  public java.lang.String getString(java.lang.String arg0) {
    java.lang.String target = (java.lang.String) cache.get(arg0);
    if (target != null) {
      return target;
    }
    if (arg0.equals("JANUARY")) {
      String answer = JANUARY();
      cache.put("JANUARY",answer);
      return answer;
    }
    if (arg0.equals("FEBRUARY")) {
      String answer = FEBRUARY();
      cache.put("FEBRUARY",answer);
      return answer;
    }
    if (arg0.equals("MARCH")) {
      String answer = MARCH();
      cache.put("MARCH",answer);
      return answer;
    }
    if (arg0.equals("APRIL")) {
      String answer = APRIL();
      cache.put("APRIL",answer);
      return answer;
    }
    if (arg0.equals("MAY")) {
      String answer = MAY();
      cache.put("MAY",answer);
      return answer;
    }
    if (arg0.equals("JUNE")) {
      String answer = JUNE();
      cache.put("JUNE",answer);
      return answer;
    }
    if (arg0.equals("JULY")) {
      String answer = JULY();
      cache.put("JULY",answer);
      return answer;
    }
    if (arg0.equals("AUGUST")) {
      String answer = AUGUST();
      cache.put("AUGUST",answer);
      return answer;
    }
    if (arg0.equals("SEPTEMBER")) {
      String answer = SEPTEMBER();
      cache.put("SEPTEMBER",answer);
      return answer;
    }
    if (arg0.equals("OCTOBER")) {
      String answer = OCTOBER();
      cache.put("OCTOBER",answer);
      return answer;
    }
    if (arg0.equals("NOVEMBER")) {
      String answer = NOVEMBER();
      cache.put("NOVEMBER",answer);
      return answer;
    }
    if (arg0.equals("DECEMBER")) {
      String answer = DECEMBER();
      cache.put("DECEMBER",answer);
      return answer;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.dataset.client.resources.i18n.MonthConstants", arg0);
  }
  
  public java.lang.String[] getStringArray(java.lang.String arg0) {
    java.lang.String[] target = (java.lang.String[]) cache.get(arg0);
    if (target != null) {
      return target;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.dataset.client.resources.i18n.MonthConstants", arg0);
  }
  java.util.Map cache = new java.util.HashMap();
}
