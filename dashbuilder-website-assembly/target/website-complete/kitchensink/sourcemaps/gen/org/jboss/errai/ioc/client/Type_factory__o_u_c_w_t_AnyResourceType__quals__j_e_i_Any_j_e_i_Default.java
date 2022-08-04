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
import org.uberfire.backend.vfs.Path;
import org.uberfire.client.workbench.type.AnyResourceType;
import org.uberfire.client.workbench.type.ClientResourceType;
import org.uberfire.workbench.category.Category;
import org.uberfire.workbench.category.Others;
import org.uberfire.workbench.type.AnyResourceTypeDefinition;
import org.uberfire.workbench.type.ResourceTypeDefinition;

public class Type_factory__o_u_c_w_t_AnyResourceType__quals__j_e_i_Any_j_e_i_Default extends Factory<AnyResourceType> { private class Type_factory__o_u_c_w_t_AnyResourceType__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends AnyResourceType implements Proxy<AnyResourceType> {
    private final ProxyHelper<AnyResourceType> proxyHelper = new ProxyHelperImpl<AnyResourceType>("Type_factory__o_u_c_w_t_AnyResourceType__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final AnyResourceType instance) {

    }

    public AnyResourceType asBeanType() {
      return this;
    }

    public void setInstance(final AnyResourceType instance) {
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

    @Override public IsWidget getIcon() {
      if (proxyHelper != null) {
        final AnyResourceType proxiedInstance = proxyHelper.getInstance(this);
        final IsWidget retVal = proxiedInstance.getIcon();
        return retVal;
      } else {
        return super.getIcon();
      }
    }

    @Override public String getDescription() {
      if (proxyHelper != null) {
        final AnyResourceType proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.getDescription();
        return retVal;
      } else {
        return super.getDescription();
      }
    }

    @Override public String getShortName() {
      if (proxyHelper != null) {
        final AnyResourceType proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.getShortName();
        return retVal;
      } else {
        throw new RuntimeException("Cannot invoke public method on proxied interface before constructor completes.");
      }
    }

    @Override public String getPrefix() {
      if (proxyHelper != null) {
        final AnyResourceType proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.getPrefix();
        return retVal;
      } else {
        throw new RuntimeException("Cannot invoke public method on proxied interface before constructor completes.");
      }
    }

    @Override public String getSuffix() {
      if (proxyHelper != null) {
        final AnyResourceType proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.getSuffix();
        return retVal;
      } else {
        throw new RuntimeException("Cannot invoke public method on proxied interface before constructor completes.");
      }
    }

    @Override public int getPriority() {
      if (proxyHelper != null) {
        final AnyResourceType proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.getPriority();
        return retVal;
      } else {
        throw new RuntimeException("Cannot invoke public method on proxied interface before constructor completes.");
      }
    }

    @Override public String getSimpleWildcardPattern() {
      if (proxyHelper != null) {
        final AnyResourceType proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.getSimpleWildcardPattern();
        return retVal;
      } else {
        throw new RuntimeException("Cannot invoke public method on proxied interface before constructor completes.");
      }
    }

    @Override public boolean accept(Path path) {
      if (proxyHelper != null) {
        final AnyResourceType proxiedInstance = proxyHelper.getInstance(this);
        final boolean retVal = proxiedInstance.accept(path);
        return retVal;
      } else {
        throw new RuntimeException("Cannot invoke public method on proxied interface before constructor completes.");
      }
    }

    @Override public Category getCategory() {
      if (proxyHelper != null) {
        final AnyResourceType proxiedInstance = proxyHelper.getInstance(this);
        final Category retVal = proxiedInstance.getCategory();
        return retVal;
      } else {
        throw new RuntimeException("Cannot invoke public method on proxied interface before constructor completes.");
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final AnyResourceType proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_u_c_w_t_AnyResourceType__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(AnyResourceType.class, "Type_factory__o_u_c_w_t_AnyResourceType__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { AnyResourceType.class, AnyResourceTypeDefinition.class, Object.class, ResourceTypeDefinition.class, ClientResourceType.class });
  }

  public AnyResourceType createInstance(final ContextManager contextManager) {
    final Others _others_0 = (Others) contextManager.getInstance("Type_factory__o_u_w_c_Others__quals__j_e_i_Any_j_e_i_Default");
    final AnyResourceType instance = new AnyResourceType(_others_0);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<AnyResourceType> proxyImpl = new Type_factory__o_u_c_w_t_AnyResourceType__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }
}