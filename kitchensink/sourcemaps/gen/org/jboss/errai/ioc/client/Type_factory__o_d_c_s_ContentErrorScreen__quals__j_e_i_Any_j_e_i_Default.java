package org.jboss.errai.ioc.client;

import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.client.screens.ContentErrorScreen;
import org.dashbuilder.client.screens.ContentErrorScreen.View;
import org.dashbuilder.client.screens.view.ContentErrorScreenView;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;

public class Type_factory__o_d_c_s_ContentErrorScreen__quals__j_e_i_Any_j_e_i_Default extends Factory<ContentErrorScreen> { private class Type_factory__o_d_c_s_ContentErrorScreen__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends ContentErrorScreen implements Proxy<ContentErrorScreen> {
    private final ProxyHelper<ContentErrorScreen> proxyHelper = new ProxyHelperImpl<ContentErrorScreen>("Type_factory__o_d_c_s_ContentErrorScreen__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final ContentErrorScreen instance) {

    }

    public ContentErrorScreen asBeanType() {
      return this;
    }

    public void setInstance(final ContentErrorScreen instance) {
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

    @Override public void init() {
      if (proxyHelper != null) {
        final ContentErrorScreen proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.init();
      } else {
        super.init();
      }
    }

    @Override public String title() {
      if (proxyHelper != null) {
        final ContentErrorScreen proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.title();
        return retVal;
      } else {
        return super.title();
      }
    }

    @Override protected View getPart() {
      if (proxyHelper != null) {
        final ContentErrorScreen proxiedInstance = proxyHelper.getInstance(this);
        final View retVal = ContentErrorScreen_getPart(proxiedInstance);
        return retVal;
      } else {
        return super.getPart();
      }
    }

    @Override public void showContentError(String contentError) {
      if (proxyHelper != null) {
        final ContentErrorScreen proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.showContentError(contentError);
      } else {
        super.showContentError(contentError);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final ContentErrorScreen proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_s_ContentErrorScreen__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(ContentErrorScreen.class, "Type_factory__o_d_c_s_ContentErrorScreen__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { ContentErrorScreen.class, Object.class });
  }

  public ContentErrorScreen createInstance(final ContextManager contextManager) {
    final ContentErrorScreen instance = new ContentErrorScreen();
    setIncompleteInstance(instance);
    final ContentErrorScreenView ContentErrorScreen_view = (ContentErrorScreenView) contextManager.getInstance("Type_factory__o_d_c_s_v_ContentErrorScreenView__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ContentErrorScreen_view);
    ContentErrorScreen_View_view(instance, ContentErrorScreen_view);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final ContentErrorScreen instance) {
    instance.init();
  }

  public Proxy createProxy(final Context context) {
    final Proxy<ContentErrorScreen> proxyImpl = new Type_factory__o_d_c_s_ContentErrorScreen__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  native static View ContentErrorScreen_View_view(ContentErrorScreen instance) /*-{
    return instance.@org.dashbuilder.client.screens.ContentErrorScreen::view;
  }-*/;

  native static void ContentErrorScreen_View_view(ContentErrorScreen instance, View value) /*-{
    instance.@org.dashbuilder.client.screens.ContentErrorScreen::view = value;
  }-*/;

  public native static View ContentErrorScreen_getPart(ContentErrorScreen instance) /*-{
    return instance.@org.dashbuilder.client.screens.ContentErrorScreen::getPart()();
  }-*/;
}