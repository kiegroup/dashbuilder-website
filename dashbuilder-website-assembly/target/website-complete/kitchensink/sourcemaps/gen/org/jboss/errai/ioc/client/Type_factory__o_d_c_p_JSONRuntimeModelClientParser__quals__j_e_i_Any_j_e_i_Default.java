package org.jboss.errai.ioc.client;

import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.client.parser.JSONRuntimeModelClientParser;
import org.dashbuilder.client.parser.PropertyReplacementService;
import org.dashbuilder.client.parser.RuntimeModelClientParser;
import org.dashbuilder.displayer.GlobalDisplayerSettings;
import org.dashbuilder.displayer.client.GlobalDisplayerSettingsImpl;
import org.dashbuilder.shared.model.RuntimeModel;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;

public class Type_factory__o_d_c_p_JSONRuntimeModelClientParser__quals__j_e_i_Any_j_e_i_Default extends Factory<JSONRuntimeModelClientParser> { private class Type_factory__o_d_c_p_JSONRuntimeModelClientParser__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends JSONRuntimeModelClientParser implements Proxy<JSONRuntimeModelClientParser> {
    private final ProxyHelper<JSONRuntimeModelClientParser> proxyHelper = new ProxyHelperImpl<JSONRuntimeModelClientParser>("Type_factory__o_d_c_p_JSONRuntimeModelClientParser__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final JSONRuntimeModelClientParser instance) {

    }

    public JSONRuntimeModelClientParser asBeanType() {
      return this;
    }

    public void setInstance(final JSONRuntimeModelClientParser instance) {
      proxyHelper.setInstance(instance);
    }

    public void clearInstance() {
      proxyHelper.clearInstance();
    }

    public void setProxyContext(final Context context) {
      proxyHelper.setProxyContext(context);
    }

    public Context getProxyContext() {
      return proxyHelper.getProxyContext();
    }

    public Object unwrap() {
      return proxyHelper.getInstance(this);
    }

    public boolean equals(Object obj) {
      obj = Factory.maybeUnwrapProxy(obj);
      return proxyHelper.getInstance(this).equals(obj);
    }

    @Override public RuntimeModel parse(String jsonContent) {
      if (proxyHelper != null) {
        final JSONRuntimeModelClientParser proxiedInstance = proxyHelper.getInstance(this);
        final RuntimeModel retVal = proxiedInstance.parse(jsonContent);
        return retVal;
      } else {
        return super.parse(jsonContent);
      }
    }

    @Override public boolean test(String content) {
      if (proxyHelper != null) {
        final JSONRuntimeModelClientParser proxiedInstance = proxyHelper.getInstance(this);
        final boolean retVal = proxiedInstance.test(content);
        return retVal;
      } else {
        return super.test(content);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final JSONRuntimeModelClientParser proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_p_JSONRuntimeModelClientParser__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(JSONRuntimeModelClientParser.class, "Type_factory__o_d_c_p_JSONRuntimeModelClientParser__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { JSONRuntimeModelClientParser.class, Object.class, RuntimeModelClientParser.class });
  }

  public JSONRuntimeModelClientParser createInstance(final ContextManager contextManager) {
    final JSONRuntimeModelClientParser instance = new JSONRuntimeModelClientParser();
    setIncompleteInstance(instance);
    final GlobalDisplayerSettingsImpl JSONRuntimeModelClientParser_globalDisplayerSettings = (GlobalDisplayerSettingsImpl) contextManager.getInstance("Type_factory__o_d_d_c_GlobalDisplayerSettingsImpl__quals__j_e_i_Any_j_e_i_Default");
    JSONRuntimeModelClientParser_GlobalDisplayerSettings_globalDisplayerSettings(instance, JSONRuntimeModelClientParser_globalDisplayerSettings);
    final PropertyReplacementService JSONRuntimeModelClientParser_replaceService = (PropertyReplacementService) contextManager.getInstance("Type_factory__o_d_c_p_PropertyReplacementService__quals__j_e_i_Any_j_e_i_Default");
    JSONRuntimeModelClientParser_PropertyReplacementService_replaceService(instance, JSONRuntimeModelClientParser_replaceService);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<JSONRuntimeModelClientParser> proxyImpl = new Type_factory__o_d_c_p_JSONRuntimeModelClientParser__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  native static PropertyReplacementService JSONRuntimeModelClientParser_PropertyReplacementService_replaceService(JSONRuntimeModelClientParser instance) /*-{
    return instance.@org.dashbuilder.client.parser.JSONRuntimeModelClientParser::replaceService;
  }-*/;

  native static void JSONRuntimeModelClientParser_PropertyReplacementService_replaceService(JSONRuntimeModelClientParser instance, PropertyReplacementService value) /*-{
    instance.@org.dashbuilder.client.parser.JSONRuntimeModelClientParser::replaceService = value;
  }-*/;

  native static GlobalDisplayerSettings JSONRuntimeModelClientParser_GlobalDisplayerSettings_globalDisplayerSettings(JSONRuntimeModelClientParser instance) /*-{
    return instance.@org.dashbuilder.client.parser.JSONRuntimeModelClientParser::globalDisplayerSettings;
  }-*/;

  native static void JSONRuntimeModelClientParser_GlobalDisplayerSettings_globalDisplayerSettings(JSONRuntimeModelClientParser instance, GlobalDisplayerSettings value) /*-{
    instance.@org.dashbuilder.client.parser.JSONRuntimeModelClientParser::globalDisplayerSettings = value;
  }-*/;
}