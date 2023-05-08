package org.jboss.errai.ioc.client;

import com.google.gwt.user.client.ui.IsWidget;
import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.client.navigation.plugin.PerspectivePluginManager;
import org.dashbuilder.client.navigation.widget.ScreenLayoutDragComponent;
import org.dashbuilder.client.plugins.RuntimePerspectivePluginManager;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;
import org.uberfire.ext.layout.editor.client.api.LayoutDragComponent;
import org.uberfire.ext.layout.editor.client.api.RenderingContext;

public class Type_factory__o_d_c_n_w_ScreenLayoutDragComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<ScreenLayoutDragComponent> { private class Type_factory__o_d_c_n_w_ScreenLayoutDragComponent__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends ScreenLayoutDragComponent implements Proxy<ScreenLayoutDragComponent> {
    private final ProxyHelper<ScreenLayoutDragComponent> proxyHelper = new ProxyHelperImpl<ScreenLayoutDragComponent>("Type_factory__o_d_c_n_w_ScreenLayoutDragComponent__quals__j_e_i_Any_j_e_i_Default");
    public Type_factory__o_d_c_n_w_ScreenLayoutDragComponent__quals__j_e_i_Any_j_e_i_DefaultProxyImpl() {
      super(null);
    }

    public void initProxyProperties(final ScreenLayoutDragComponent instance) {

    }

    public ScreenLayoutDragComponent asBeanType() {
      return this;
    }

    public void setInstance(final ScreenLayoutDragComponent instance) {
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

    @Override public IsWidget getShowWidget(RenderingContext ctx) {
      if (proxyHelper != null) {
        final ScreenLayoutDragComponent proxiedInstance = proxyHelper.getInstance(this);
        final IsWidget retVal = proxiedInstance.getShowWidget(ctx);
        return retVal;
      } else {
        return super.getShowWidget(ctx);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final ScreenLayoutDragComponent proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_n_w_ScreenLayoutDragComponent__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(ScreenLayoutDragComponent.class, "Type_factory__o_d_c_n_w_ScreenLayoutDragComponent__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { ScreenLayoutDragComponent.class, Object.class, LayoutDragComponent.class });
  }

  public ScreenLayoutDragComponent createInstance(final ContextManager contextManager) {
    final PerspectivePluginManager _perspectivePluginManager_0 = (RuntimePerspectivePluginManager) contextManager.getInstance("Type_factory__o_d_c_p_RuntimePerspectivePluginManager__quals__j_e_i_Any_j_e_i_Default");
    final ScreenLayoutDragComponent instance = new ScreenLayoutDragComponent(_perspectivePluginManager_0);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  private Proxy createProxyWithErrorMessage() {
    try {
      return new Type_factory__o_d_c_n_w_ScreenLayoutDragComponent__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    } catch (Throwable t) {
      throw new RuntimeException("While creating a proxy for org.dashbuilder.client.navigation.widget.ScreenLayoutDragComponent an exception was thrown from this constructor: @javax.inject.Inject()  public org.dashbuilder.client.navigation.widget.ScreenLayoutDragComponent ([org.dashbuilder.client.navigation.plugin.PerspectivePluginManager])\nTo fix this problem, add a no-argument public or protected constructor for use in proxying.", t);
    }
  }

  public Proxy createProxy(final Context context) {
    final Proxy<ScreenLayoutDragComponent> proxyImpl = createProxyWithErrorMessage();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }
}