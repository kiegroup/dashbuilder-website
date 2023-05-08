package org.jboss.errai.ioc.client;

import com.google.gwt.user.client.ui.IsWidget;
import javax.enterprise.context.ApplicationScoped;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;
import org.uberfire.ext.layout.editor.client.api.LayoutDragComponent;
import org.uberfire.ext.layout.editor.client.api.RenderingContext;
import org.uberfire.ext.plugin.client.perspective.editor.layout.editor.TargetDivDragComponent;

public class Type_factory__o_u_e_p_c_p_e_l_e_TargetDivDragComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<TargetDivDragComponent> { private class Type_factory__o_u_e_p_c_p_e_l_e_TargetDivDragComponent__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends TargetDivDragComponent implements Proxy<TargetDivDragComponent> {
    private final ProxyHelper<TargetDivDragComponent> proxyHelper = new ProxyHelperImpl<TargetDivDragComponent>("Type_factory__o_u_e_p_c_p_e_l_e_TargetDivDragComponent__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final TargetDivDragComponent instance) {

    }

    public TargetDivDragComponent asBeanType() {
      return this;
    }

    public void setInstance(final TargetDivDragComponent instance) {
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
        final TargetDivDragComponent proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.setup();
      } else {
        super.setup();
      }
    }

    @Override public IsWidget getShowWidget(RenderingContext ctx) {
      if (proxyHelper != null) {
        final TargetDivDragComponent proxiedInstance = proxyHelper.getInstance(this);
        final IsWidget retVal = proxiedInstance.getShowWidget(ctx);
        return retVal;
      } else {
        return super.getShowWidget(ctx);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final TargetDivDragComponent proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_u_e_p_c_p_e_l_e_TargetDivDragComponent__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(TargetDivDragComponent.class, "Type_factory__o_u_e_p_c_p_e_l_e_TargetDivDragComponent__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { TargetDivDragComponent.class, Object.class, LayoutDragComponent.class });
  }

  public TargetDivDragComponent createInstance(final ContextManager contextManager) {
    final TargetDivDragComponent instance = new TargetDivDragComponent();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final TargetDivDragComponent instance) {
    instance.setup();
  }

  public Proxy createProxy(final Context context) {
    final Proxy<TargetDivDragComponent> proxyImpl = new Type_factory__o_u_e_p_c_p_e_l_e_TargetDivDragComponent__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }
}