package org.jboss.errai.ioc.client;

import java.util.function.Function;
import java.util.function.UnaryOperator;
import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.client.external.csv.CSVParser;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;

public class Type_factory__o_d_c_e_c_CSVParser__quals__j_e_i_Any_j_e_i_Default extends Factory<CSVParser> { private class Type_factory__o_d_c_e_c_CSVParser__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends CSVParser implements Proxy<CSVParser> {
    private final ProxyHelper<CSVParser> proxyHelper = new ProxyHelperImpl<CSVParser>("Type_factory__o_d_c_e_c_CSVParser__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final CSVParser instance) {

    }

    public CSVParser asBeanType() {
      return this;
    }

    public void setInstance(final CSVParser instance) {
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

    @Override public String toJsonArray(String csvContent) {
      if (proxyHelper != null) {
        final CSVParser proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.toJsonArray(csvContent);
        return retVal;
      } else {
        return super.toJsonArray(csvContent);
      }
    }

    @Override public String apply(String input) {
      if (proxyHelper != null) {
        final CSVParser proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.apply(input);
        return retVal;
      } else {
        return super.apply(input);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final CSVParser proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_e_c_CSVParser__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(CSVParser.class, "Type_factory__o_d_c_e_c_CSVParser__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { CSVParser.class, Object.class, UnaryOperator.class, Function.class });
  }

  public CSVParser createInstance(final ContextManager contextManager) {
    final CSVParser instance = new CSVParser();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<CSVParser> proxyImpl = new Type_factory__o_d_c_e_c_CSVParser__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }
}