package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Instance;
import org.dashbuilder.client.parser.JSONRuntimeModelClientParser;
import org.dashbuilder.client.parser.RuntimeModelClientParser;
import org.dashbuilder.client.parser.RuntimeModelClientParserFactory;
import org.dashbuilder.client.parser.YAMLRuntimeModelClientParser;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;

public class Type_factory__o_d_c_p_RuntimeModelClientParserFactory__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimeModelClientParserFactory> { private class Type_factory__o_d_c_p_RuntimeModelClientParserFactory__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends RuntimeModelClientParserFactory implements Proxy<RuntimeModelClientParserFactory> {
    private final ProxyHelper<RuntimeModelClientParserFactory> proxyHelper = new ProxyHelperImpl<RuntimeModelClientParserFactory>("Type_factory__o_d_c_p_RuntimeModelClientParserFactory__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final RuntimeModelClientParserFactory instance) {

    }

    public RuntimeModelClientParserFactory asBeanType() {
      return this;
    }

    public void setInstance(final RuntimeModelClientParserFactory instance) {
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

    @Override public Optional get(String content) {
      if (proxyHelper != null) {
        final RuntimeModelClientParserFactory proxiedInstance = proxyHelper.getInstance(this);
        final Optional retVal = proxiedInstance.get(content);
        return retVal;
      } else {
        return super.get(content);
      }
    }

    @Override public RuntimeModelClientParser getEditorParser(String content) {
      if (proxyHelper != null) {
        final RuntimeModelClientParserFactory proxiedInstance = proxyHelper.getInstance(this);
        final RuntimeModelClientParser retVal = proxiedInstance.getEditorParser(content);
        return retVal;
      } else {
        return super.getEditorParser(content);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final RuntimeModelClientParserFactory proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_p_RuntimeModelClientParserFactory__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(RuntimeModelClientParserFactory.class, "Type_factory__o_d_c_p_RuntimeModelClientParserFactory__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { RuntimeModelClientParserFactory.class, Object.class });
  }

  public RuntimeModelClientParserFactory createInstance(final ContextManager contextManager) {
    final RuntimeModelClientParserFactory instance = new RuntimeModelClientParserFactory();
    setIncompleteInstance(instance);
    final YAMLRuntimeModelClientParser RuntimeModelClientParserFactory_yamlParser = (YAMLRuntimeModelClientParser) contextManager.getInstance("Type_factory__o_d_c_p_YAMLRuntimeModelClientParser__quals__j_e_i_Any_j_e_i_Default");
    RuntimeModelClientParserFactory_YAMLRuntimeModelClientParser_yamlParser(instance, RuntimeModelClientParserFactory_yamlParser);
    final Instance RuntimeModelClientParserFactory_parsers = (Instance) contextManager.getContextualInstance("ContextualProvider_factory__j_e_i_Instance__quals__Universal", new Class[] { RuntimeModelClientParser.class }, new Annotation[] { });
    registerDependentScopedReference(instance, RuntimeModelClientParserFactory_parsers);
    RuntimeModelClientParserFactory_Instance_parsers(instance, RuntimeModelClientParserFactory_parsers);
    final JSONRuntimeModelClientParser RuntimeModelClientParserFactory_jsonParser = (JSONRuntimeModelClientParser) contextManager.getInstance("Type_factory__o_d_c_p_JSONRuntimeModelClientParser__quals__j_e_i_Any_j_e_i_Default");
    RuntimeModelClientParserFactory_JSONRuntimeModelClientParser_jsonParser(instance, RuntimeModelClientParserFactory_jsonParser);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<RuntimeModelClientParserFactory> proxyImpl = new Type_factory__o_d_c_p_RuntimeModelClientParserFactory__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  native static Instance RuntimeModelClientParserFactory_Instance_parsers(RuntimeModelClientParserFactory instance) /*-{
    return instance.@org.dashbuilder.client.parser.RuntimeModelClientParserFactory::parsers;
  }-*/;

  native static void RuntimeModelClientParserFactory_Instance_parsers(RuntimeModelClientParserFactory instance, Instance<RuntimeModelClientParser> value) /*-{
    instance.@org.dashbuilder.client.parser.RuntimeModelClientParserFactory::parsers = value;
  }-*/;

  native static YAMLRuntimeModelClientParser RuntimeModelClientParserFactory_YAMLRuntimeModelClientParser_yamlParser(RuntimeModelClientParserFactory instance) /*-{
    return instance.@org.dashbuilder.client.parser.RuntimeModelClientParserFactory::yamlParser;
  }-*/;

  native static void RuntimeModelClientParserFactory_YAMLRuntimeModelClientParser_yamlParser(RuntimeModelClientParserFactory instance, YAMLRuntimeModelClientParser value) /*-{
    instance.@org.dashbuilder.client.parser.RuntimeModelClientParserFactory::yamlParser = value;
  }-*/;

  native static JSONRuntimeModelClientParser RuntimeModelClientParserFactory_JSONRuntimeModelClientParser_jsonParser(RuntimeModelClientParserFactory instance) /*-{
    return instance.@org.dashbuilder.client.parser.RuntimeModelClientParserFactory::jsonParser;
  }-*/;

  native static void RuntimeModelClientParserFactory_JSONRuntimeModelClientParser_jsonParser(RuntimeModelClientParserFactory instance, JSONRuntimeModelClientParser value) /*-{
    instance.@org.dashbuilder.client.parser.RuntimeModelClientParserFactory::jsonParser = value;
  }-*/;
}