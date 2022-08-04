package org.dashbuilder.dataset.client.resources.i18n;

public class DateIntervalTypeConstants_ implements org.dashbuilder.dataset.client.resources.i18n.DateIntervalTypeConstants {
  
  public java.lang.String MILLISECOND() {
    return "Millisecond";
  }
  
  public java.lang.String HUNDRETH() {
    return "Hundreth";
  }
  
  public java.lang.String TENTH() {
    return "Tenth";
  }
  
  public java.lang.String SECOND() {
    return "Second";
  }
  
  public java.lang.String MINUTE() {
    return "Minute";
  }
  
  public java.lang.String HOUR() {
    return "Hour";
  }
  
  public java.lang.String DAY() {
    return "Day";
  }
  
  public java.lang.String DAY_OF_WEEK() {
    return "Day of week";
  }
  
  public java.lang.String WEEK() {
    return "Week";
  }
  
  public java.lang.String MONTH() {
    return "Month";
  }
  
  public java.lang.String QUARTER() {
    return "Quarter";
  }
  
  public java.lang.String YEAR() {
    return "Year";
  }
  
  public java.lang.String DECADE() {
    return "Decade";
  }
  
  public java.lang.String CENTURY() {
    return "Century";
  }
  
  public java.lang.String MILLENIUM() {
    return "Millenium";
  }
  
  public boolean getBoolean(java.lang.String arg0) {
    Boolean target = (Boolean) cache.get(arg0);
    if (target != null) {
      return target.booleanValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.dataset.client.resources.i18n.DateIntervalTypeConstants", arg0);
  }
  
  public double getDouble(java.lang.String arg0) {
    Double target = (Double) cache.get(arg0);
    if (target != null) {
      return target.doubleValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.dataset.client.resources.i18n.DateIntervalTypeConstants", arg0);
  }
  
  public float getFloat(java.lang.String arg0) {
    Float target = (Float) cache.get(arg0);
    if (target != null) {
      return target.floatValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.dataset.client.resources.i18n.DateIntervalTypeConstants", arg0);
  }
  
  public int getInt(java.lang.String arg0) {
    Integer target = (Integer) cache.get(arg0);
    if (target != null) {
      return target.intValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.dataset.client.resources.i18n.DateIntervalTypeConstants", arg0);
  }
  
  public java.util.Map<java.lang.String, java.lang.String> getMap(java.lang.String arg0) {
    java.util.Map<java.lang.String, java.lang.String> target = (java.util.Map<java.lang.String, java.lang.String>) cache.get(arg0);
    if (target != null) {
      return target;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.dataset.client.resources.i18n.DateIntervalTypeConstants", arg0);
  }
  
  public java.lang.String getString(java.lang.String arg0) {
    java.lang.String target = (java.lang.String) cache.get(arg0);
    if (target != null) {
      return target;
    }
    if (arg0.equals("MILLISECOND")) {
      String answer = MILLISECOND();
      cache.put("MILLISECOND",answer);
      return answer;
    }
    if (arg0.equals("HUNDRETH")) {
      String answer = HUNDRETH();
      cache.put("HUNDRETH",answer);
      return answer;
    }
    if (arg0.equals("TENTH")) {
      String answer = TENTH();
      cache.put("TENTH",answer);
      return answer;
    }
    if (arg0.equals("SECOND")) {
      String answer = SECOND();
      cache.put("SECOND",answer);
      return answer;
    }
    if (arg0.equals("MINUTE")) {
      String answer = MINUTE();
      cache.put("MINUTE",answer);
      return answer;
    }
    if (arg0.equals("HOUR")) {
      String answer = HOUR();
      cache.put("HOUR",answer);
      return answer;
    }
    if (arg0.equals("DAY")) {
      String answer = DAY();
      cache.put("DAY",answer);
      return answer;
    }
    if (arg0.equals("DAY_OF_WEEK")) {
      String answer = DAY_OF_WEEK();
      cache.put("DAY_OF_WEEK",answer);
      return answer;
    }
    if (arg0.equals("WEEK")) {
      String answer = WEEK();
      cache.put("WEEK",answer);
      return answer;
    }
    if (arg0.equals("MONTH")) {
      String answer = MONTH();
      cache.put("MONTH",answer);
      return answer;
    }
    if (arg0.equals("QUARTER")) {
      String answer = QUARTER();
      cache.put("QUARTER",answer);
      return answer;
    }
    if (arg0.equals("YEAR")) {
      String answer = YEAR();
      cache.put("YEAR",answer);
      return answer;
    }
    if (arg0.equals("DECADE")) {
      String answer = DECADE();
      cache.put("DECADE",answer);
      return answer;
    }
    if (arg0.equals("CENTURY")) {
      String answer = CENTURY();
      cache.put("CENTURY",answer);
      return answer;
    }
    if (arg0.equals("MILLENIUM")) {
      String answer = MILLENIUM();
      cache.put("MILLENIUM",answer);
      return answer;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.dataset.client.resources.i18n.DateIntervalTypeConstants", arg0);
  }
  
  public java.lang.String[] getStringArray(java.lang.String arg0) {
    java.lang.String[] target = (java.lang.String[]) cache.get(arg0);
    if (target != null) {
      return target;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.dataset.client.resources.i18n.DateIntervalTypeConstants", arg0);
  }
  java.util.Map cache = new java.util.HashMap();
}
