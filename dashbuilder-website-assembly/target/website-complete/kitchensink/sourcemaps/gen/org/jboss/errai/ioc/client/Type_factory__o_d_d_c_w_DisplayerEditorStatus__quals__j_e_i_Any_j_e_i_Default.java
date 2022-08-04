package org.jboss.errai.ioc.client;

import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.displayer.client.widgets.DisplayerEditorStatus;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;

public class Type_factory__o_d_d_c_w_DisplayerEditorStatus__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerEditorStatus> { private class Type_factory__o_d_d_c_w_DisplayerEditorStatus__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends DisplayerEditorStatus implements Proxy<DisplayerEditorStatus> {
    private final ProxyHelper<DisplayerEditorStatus> proxyHelper = new ProxyHelperImpl<DisplayerEditorStatus>("Type_factory__o_d_d_c_w_DisplayerEditorStatus__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final DisplayerEditorStatus instance) {

    }

    public DisplayerEditorStatus asBeanType() {
      return this;
    }

    public void setInstance(final DisplayerEditorStatus instance) {
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

    @Override public int getSelectedOption(String displayerUuid) {
      if (proxyHelper != null) {
        final DisplayerEditorStatus proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.getSelectedOption(displayerUuid);
        return retVal;
      } else {
        return super.getSelectedOption(displayerUuid);
      }
    }

    @Override public void saveSelectedOption(String displayerUuid, int option) {
      if (proxyHelper != null) {
        final DisplayerEditorStatus proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.saveSelectedOption(displayerUuid, option);
      } else {
        super.saveSelectedOption(displayerUuid, option);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final DisplayerEditorStatus proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_d_c_w_DisplayerEditorStatus__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(DisplayerEditorStatus.class, "Type_factory__o_d_d_c_w_DisplayerEditorStatus__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { DisplayerEditorStatus.class, Object.class });
  }

  public DisplayerEditorStatus createInstance(final ContextManager contextManager) {
    final DisplayerEditorStatus instance = new DisplayerEditorStatus();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<DisplayerEditorStatus> proxyImpl = new Type_factory__o_d_d_c_w_DisplayerEditorStatus__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }
}