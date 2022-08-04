package org.jboss.errai.ioc.client;

import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.client.screens.NotFoundScreen;
import org.dashbuilder.client.screens.NotFoundScreen.View;
import org.dashbuilder.client.screens.view.NotFoundScreenView;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;

public class Type_factory__o_d_c_s_NotFoundScreen__quals__j_e_i_Any_j_e_i_Default extends Factory<NotFoundScreen> { private class Type_factory__o_d_c_s_NotFoundScreen__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends NotFoundScreen implements Proxy<NotFoundScreen> {
    private final ProxyHelper<NotFoundScreen> proxyHelper = new ProxyHelperImpl<NotFoundScreen>("Type_factory__o_d_c_s_NotFoundScreen__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final NotFoundScreen instance) {

    }

    public NotFoundScreen asBeanType() {
      return this;
    }

    public void setInstance(final NotFoundScreen instance) {
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

    @Override public void onOpen() {
      if (proxyHelper != null) {
        final NotFoundScreen proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.onOpen();
      } else {
        super.onOpen();
      }
    }

    @Override public String getScreenTitle() {
      if (proxyHelper != null) {
        final NotFoundScreen proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.getScreenTitle();
        return retVal;
      } else {
        return super.getScreenTitle();
      }
    }

    @Override public View workbenchPart() {
      if (proxyHelper != null) {
        final NotFoundScreen proxiedInstance = proxyHelper.getInstance(this);
        final View retVal = proxiedInstance.workbenchPart();
        return retVal;
      } else {
        return super.workbenchPart();
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final NotFoundScreen proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_s_NotFoundScreen__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(NotFoundScreen.class, "Type_factory__o_d_c_s_NotFoundScreen__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { NotFoundScreen.class, Object.class });
  }

  public NotFoundScreen createInstance(final ContextManager contextManager) {
    final NotFoundScreen instance = new NotFoundScreen();
    setIncompleteInstance(instance);
    final NotFoundScreenView NotFoundScreen_view = (NotFoundScreenView) contextManager.getInstance("Type_factory__o_d_c_s_v_NotFoundScreenView__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, NotFoundScreen_view);
    NotFoundScreen_View_view(instance, NotFoundScreen_view);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<NotFoundScreen> proxyImpl = new Type_factory__o_d_c_s_NotFoundScreen__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  native static View NotFoundScreen_View_view(NotFoundScreen instance) /*-{
    return instance.@org.dashbuilder.client.screens.NotFoundScreen::view;
  }-*/;

  native static void NotFoundScreen_View_view(NotFoundScreen instance, View value) /*-{
    instance.@org.dashbuilder.client.screens.NotFoundScreen::view = value;
  }-*/;
}