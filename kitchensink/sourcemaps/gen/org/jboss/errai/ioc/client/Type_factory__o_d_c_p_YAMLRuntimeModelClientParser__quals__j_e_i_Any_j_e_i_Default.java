package org.jboss.errai.ioc.client;

import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.client.parser.JSONRuntimeModelClientParser;
import org.dashbuilder.client.parser.PropertyReplacementService;
import org.dashbuilder.client.parser.RuntimeModelClientParser;
import org.dashbuilder.client.parser.YAMLRuntimeModelClientParser;
import org.dashbuilder.shared.model.RuntimeModel;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;

public class Type_factory__o_d_c_p_YAMLRuntimeModelClientParser__quals__j_e_i_Any_j_e_i_Default extends Factory<YAMLRuntimeModelClientParser> { private class Type_factory__o_d_c_p_YAMLRuntimeModelClientParser__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends YAMLRuntimeModelClientParser implements Proxy<YAMLRuntimeModelClientParser> {
    private final ProxyHelper<YAMLRuntimeModelClientParser> proxyHelper = new ProxyHelperImpl<YAMLRuntimeModelClientParser>("Type_factory__o_d_c_p_YAMLRuntimeModelClientParser__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final YAMLRuntimeModelClientParser instance) {

    }

    public YAMLRuntimeModelClientParser asBeanType() {
      return this;
    }

    public void setInstance(final YAMLRuntimeModelClientParser instance) {
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

    @Override public void setup() {
      if (proxyHelper != null) {
        final YAMLRuntimeModelClientParser proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.setup();
      } else {
        super.setup();
      }
    }

    @Override public RuntimeModel parse(String content) {
      if (proxyHelper != null) {
        final YAMLRuntimeModelClientParser proxiedInstance = proxyHelper.getInstance(this);
        final RuntimeModel retVal = proxiedInstance.parse(content);
        return retVal;
      } else {
        return super.parse(content);
      }
    }

    @Override public boolean test(String content) {
      if (proxyHelper != null) {
        final YAMLRuntimeModelClientParser proxiedInstance = proxyHelper.getInstance(this);
        final boolean retVal = proxiedInstance.test(content);
        return retVal;
      } else {
        return super.test(content);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final YAMLRuntimeModelClientParser proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_p_YAMLRuntimeModelClientParser__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(YAMLRuntimeModelClientParser.class, "Type_factory__o_d_c_p_YAMLRuntimeModelClientParser__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { YAMLRuntimeModelClientParser.class, Object.class, RuntimeModelClientParser.class });
  }

  public YAMLRuntimeModelClientParser createInstance(final ContextManager contextManager) {
    final YAMLRuntimeModelClientParser instance = new YAMLRuntimeModelClientParser();
    setIncompleteInstance(instance);
    final JSONRuntimeModelClientParser YAMLRuntimeModelClientParser_jsonParser = (JSONRuntimeModelClientParser) contextManager.getInstance("Type_factory__o_d_c_p_JSONRuntimeModelClientParser__quals__j_e_i_Any_j_e_i_Default");
    YAMLRuntimeModelClientParser_JSONRuntimeModelClientParser_jsonParser(instance, YAMLRuntimeModelClientParser_jsonParser);
    final PropertyReplacementService YAMLRuntimeModelClientParser_replacementService = (PropertyReplacementService) contextManager.getInstance("Type_factory__o_d_c_p_PropertyReplacementService__quals__j_e_i_Any_j_e_i_Default");
    YAMLRuntimeModelClientParser_PropertyReplacementService_replacementService(instance, YAMLRuntimeModelClientParser_replacementService);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final YAMLRuntimeModelClientParser instance) {
    instance.setup();
  }

  public Proxy createProxy(final Context context) {
    final Proxy<YAMLRuntimeModelClientParser> proxyImpl = new Type_factory__o_d_c_p_YAMLRuntimeModelClientParser__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  native static PropertyReplacementService YAMLRuntimeModelClientParser_PropertyReplacementService_replacementService(YAMLRuntimeModelClientParser instance) /*-{
    return instance.@org.dashbuilder.client.parser.YAMLRuntimeModelClientParser::replacementService;
  }-*/;

  native static void YAMLRuntimeModelClientParser_PropertyReplacementService_replacementService(YAMLRuntimeModelClientParser instance, PropertyReplacementService value) /*-{
    instance.@org.dashbuilder.client.parser.YAMLRuntimeModelClientParser::replacementService = value;
  }-*/;

  native static JSONRuntimeModelClientParser YAMLRuntimeModelClientParser_JSONRuntimeModelClientParser_jsonParser(YAMLRuntimeModelClientParser instance) /*-{
    return instance.@org.dashbuilder.client.parser.YAMLRuntimeModelClientParser::jsonParser;
  }-*/;

  native static void YAMLRuntimeModelClientParser_JSONRuntimeModelClientParser_jsonParser(YAMLRuntimeModelClientParser instance, JSONRuntimeModelClientParser value) /*-{
    instance.@org.dashbuilder.client.parser.YAMLRuntimeModelClientParser::jsonParser = value;
  }-*/;
}