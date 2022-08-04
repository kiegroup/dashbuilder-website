package org.dashbuilder.dataset.client.resources.i18n;

public class AggregateFunctionTypeConstants_ implements org.dashbuilder.dataset.client.resources.i18n.AggregateFunctionTypeConstants {
  
  public java.lang.String COUNT() {
    return "Count";
  }
  
  public java.lang.String DISTINCT() {
    return "Distinct";
  }
  
  public java.lang.String AVERAGE() {
    return "Average";
  }
  
  public java.lang.String SUM() {
    return "Sum";
  }
  
  public java.lang.String MIN() {
    return "Min";
  }
  
  public java.lang.String MAX() {
    return "Max";
  }
  
  public boolean getBoolean(java.lang.String arg0) {
    Boolean target = (Boolean) cache.get(arg0);
    if (target != null) {
      return target.booleanValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.dataset.client.resources.i18n.AggregateFunctionTypeConstants", arg0);
  }
  
  public double getDouble(java.lang.String arg0) {
    Double target = (Double) cache.get(arg0);
    if (target != null) {
      return target.doubleValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.dataset.client.resources.i18n.AggregateFunctionTypeConstants", arg0);
  }
  
  public float getFloat(java.lang.String arg0) {
    Float target = (Float) cache.get(arg0);
    if (target != null) {
      return target.floatValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.dataset.client.resources.i18n.AggregateFunctionTypeConstants", arg0);
  }
  
  public int getInt(java.lang.String arg0) {
    Integer target = (Integer) cache.get(arg0);
    if (target != null) {
      return target.intValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.dataset.client.resources.i18n.AggregateFunctionTypeConstants", arg0);
  }
  
  public java.util.Map<java.lang.String, java.lang.String> getMap(java.lang.String arg0) {
    java.util.Map<java.lang.String, java.lang.String> target = (java.util.Map<java.lang.String, java.lang.String>) cache.get(arg0);
    if (target != null) {
      return target;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.dataset.client.resources.i18n.AggregateFunctionTypeConstants", arg0);
  }
  
  public java.lang.String getString(java.lang.String arg0) {
    java.lang.String target = (java.lang.String) cache.get(arg0);
    if (target != null) {
      return target;
    }
    if (arg0.equals("COUNT")) {
      String answer = COUNT();
      cache.put("COUNT",answer);
      return answer;
    }
    if (arg0.equals("DISTINCT")) {
      String answer = DISTINCT();
      cache.put("DISTINCT",answer);
      return answer;
    }
    if (arg0.equals("AVERAGE")) {
      String answer = AVERAGE();
      cache.put("AVERAGE",answer);
      return answer;
    }
    if (arg0.equals("SUM")) {
      String answer = SUM();
      cache.put("SUM",answer);
      return answer;
    }
    if (arg0.equals("MIN")) {
      String answer = MIN();
      cache.put("MIN",answer);
      return answer;
    }
    if (arg0.equals("MAX")) {
      String answer = MAX();
      cache.put("MAX",answer);
      return answer;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.dataset.client.resources.i18n.AggregateFunctionTypeConstants", arg0);
  }
  
  public java.lang.String[] getStringArray(java.lang.String arg0) {
    java.lang.String[] target = (java.lang.String[]) cache.get(arg0);
    if (target != null) {
      return target;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.dataset.client.resources.i18n.AggregateFunctionTypeConstants", arg0);
  }
  java.util.Map cache = new java.util.HashMap();
}
