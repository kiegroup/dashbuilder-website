package org.jboss.errai.databinding.client;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.jboss.errai.ui.shared.api.Locale;

public class BindableProxyLoaderImpl implements BindableProxyLoader { public void loadBindableProxies() {
    class org_jboss_errai_ui_shared_api_LocaleProxy extends Locale implements BindableProxy {
      private BindableProxyAgent<Locale> agent;
      private Locale target;
      public org_jboss_errai_ui_shared_api_LocaleProxy() {
        this(new Locale());
      }

      public org_jboss_errai_ui_shared_api_LocaleProxy(Locale targetVal) {
        agent = new BindableProxyAgent<Locale>(this, targetVal);
        target = targetVal;
        final Map<String, PropertyType> p = agent.propertyTypes;
        p.put("label", new PropertyType(String.class, false, false));
        p.put("locale", new PropertyType(String.class, false, false));
        p.put("this", new PropertyType(Locale.class, true, false));
        agent.copyValues();
      }

      public BindableProxyAgent getBindableProxyAgent() {
        return agent;
      }

      public void updateWidgets() {
        agent.updateWidgetsAndFireEvents();
      }

      public Locale unwrap() {
        return target;
      }

      public Locale deepUnwrap() {
        final Locale clone = new Locale();
        final Locale t = unwrap();
        clone.setLabel(t.getLabel());
        clone.setLocale(t.getLocale());
        return clone;
      }

      public boolean equals(Object obj) {
        if (obj instanceof org_jboss_errai_ui_shared_api_LocaleProxy) {
          obj = ((org_jboss_errai_ui_shared_api_LocaleProxy) obj).unwrap();
        }
        return target.equals(obj);
      }

      public int hashCode() {
        return target.hashCode();
      }

      public String toString() {
        return target.toString();
      }

      private void changeAndFire(String property, Object value) {
        final Object oldValue = get(property);
        set(property, value);
        agent.updateWidgetsAndFireEvent(false, property, oldValue, value);
      }

      public String getLabel() {
        return target.getLabel();
      }

      public void setLabel(String label) {
        changeAndFire("label", label);
      }

      public String getLocale() {
        return target.getLocale();
      }

      public void setLocale(String locale) {
        changeAndFire("locale", locale);
      }

      public Object get(String property) {
        switch (property) {
          case "label": return getLabel();
          case "locale": return getLocale();
          case "this": return target;
          default: throw new NonExistingPropertyException("Locale", property);
        }
      }

      public void set(String property, Object value) {
        switch (property) {
          case "label": target.setLabel((String) value);
          break;
          case "locale": target.setLocale((String) value);
          break;
          case "this": target = (Locale) value;
          agent.target = target;
          break;
          default: throw new NonExistingPropertyException("Locale", property);
        }
      }

      public Map getBeanProperties() {
        final Map props = new HashMap(agent.propertyTypes);
        props.remove("this");
        return Collections.unmodifiableMap(props);
      }
    }
    BindableProxyFactory.addBindableProxy(Locale.class, new BindableProxyProvider() {
      public BindableProxy getBindableProxy(Object model) {
        return new org_jboss_errai_ui_shared_api_LocaleProxy((Locale) model);
      }
      public BindableProxy getBindableProxy() {
        return new org_jboss_errai_ui_shared_api_LocaleProxy();
      }
    });
  }
}