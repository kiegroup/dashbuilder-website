package org.jboss.errai.ioc.client;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.displayer.client.Displayer;
import org.dashbuilder.displayer.client.DisplayerCoordinator;
import org.dashbuilder.displayer.client.PerspectiveCoordinator;
import org.jboss.errai.enterprise.client.cdi.AbstractCDIEventCallback;
import org.jboss.errai.enterprise.client.cdi.api.CDI;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;
import org.uberfire.client.workbench.events.PerspectiveChange;

public class Type_factory__o_d_d_c_PerspectiveCoordinator__quals__j_e_i_Any_j_e_i_Default extends Factory<PerspectiveCoordinator> { private class Type_factory__o_d_d_c_PerspectiveCoordinator__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends PerspectiveCoordinator implements Proxy<PerspectiveCoordinator> {
    private final ProxyHelper<PerspectiveCoordinator> proxyHelper = new ProxyHelperImpl<PerspectiveCoordinator>("Type_factory__o_d_d_c_PerspectiveCoordinator__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final PerspectiveCoordinator instance) {

    }

    public PerspectiveCoordinator asBeanType() {
      return this;
    }

    public void setInstance(final PerspectiveCoordinator instance) {
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

    @Override public void addDisplayer(Displayer displayer) {
      if (proxyHelper != null) {
        final PerspectiveCoordinator proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.addDisplayer(displayer);
      } else {
        super.addDisplayer(displayer);
      }
    }

    @Override public boolean removeDisplayer(Displayer displayer) {
      if (proxyHelper != null) {
        final PerspectiveCoordinator proxiedInstance = proxyHelper.getInstance(this);
        final boolean retVal = proxiedInstance.removeDisplayer(displayer);
        return retVal;
      } else {
        return super.removeDisplayer(displayer);
      }
    }

    @Override public List getDisplayerList() {
      if (proxyHelper != null) {
        final PerspectiveCoordinator proxiedInstance = proxyHelper.getInstance(this);
        final List retVal = proxiedInstance.getDisplayerList();
        return retVal;
      } else {
        return super.getDisplayerList();
      }
    }

    @Override public void closeDisplayer(String uuid) {
      if (proxyHelper != null) {
        final PerspectiveCoordinator proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.closeDisplayer(uuid);
      } else {
        super.closeDisplayer(uuid);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final PerspectiveCoordinator proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_d_c_PerspectiveCoordinator__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(PerspectiveCoordinator.class, "Type_factory__o_d_d_c_PerspectiveCoordinator__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { PerspectiveCoordinator.class, Object.class });
  }

  public void init(final Context context) {
    CDI.subscribeLocal("org.uberfire.client.workbench.events.PerspectiveChange", new AbstractCDIEventCallback<PerspectiveChange>() {
      public void fireEvent(final PerspectiveChange event) {
        final PerspectiveCoordinator instance = Factory.maybeUnwrapProxy((PerspectiveCoordinator) context.getInstance("Type_factory__o_d_d_c_PerspectiveCoordinator__quals__j_e_i_Any_j_e_i_Default"));
        PerspectiveCoordinator_onPerspectiveChanged_PerspectiveChange(instance, event);
      }
      public String toString() {
        return "Observer: org.uberfire.client.workbench.events.PerspectiveChange []";
      }
    });
  }

  public PerspectiveCoordinator createInstance(final ContextManager contextManager) {
    final DisplayerCoordinator _coordinator_0 = (DisplayerCoordinator) contextManager.getInstance("Type_factory__o_d_d_c_DisplayerCoordinator__quals__j_e_i_Any_j_e_i_Default");
    final PerspectiveCoordinator instance = new PerspectiveCoordinator(_coordinator_0);
    registerDependentScopedReference(instance, _coordinator_0);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<PerspectiveCoordinator> proxyImpl = new Type_factory__o_d_d_c_PerspectiveCoordinator__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  public native static void PerspectiveCoordinator_onPerspectiveChanged_PerspectiveChange(PerspectiveCoordinator instance, PerspectiveChange a0) /*-{
    instance.@org.dashbuilder.displayer.client.PerspectiveCoordinator::onPerspectiveChanged(Lorg/uberfire/client/workbench/events/PerspectiveChange;)(a0);
  }-*/;
}