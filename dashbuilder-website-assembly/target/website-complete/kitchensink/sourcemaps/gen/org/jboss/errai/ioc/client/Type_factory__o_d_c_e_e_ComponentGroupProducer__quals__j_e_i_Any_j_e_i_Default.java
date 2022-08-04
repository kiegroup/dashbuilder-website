package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.client.editor.external.ComponentGroupProducer;
import org.dashbuilder.external.service.ComponentService;
import org.jboss.errai.common.client.api.Caller;
import org.jboss.errai.enterprise.client.cdi.AbstractCDIEventCallback;
import org.jboss.errai.enterprise.client.cdi.api.CDI;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;
import org.jboss.errai.ioc.client.container.SyncBeanManager;
import org.uberfire.ext.layout.editor.client.api.LayoutDragComponentPalette;
import org.uberfire.ext.layout.editor.client.widgets.LayoutComponentPalettePresenter;
import org.uberfire.ext.plugin.client.perspective.editor.events.PerspectiveEditorFocusEvent;

public class Type_factory__o_d_c_e_e_ComponentGroupProducer__quals__j_e_i_Any_j_e_i_Default extends Factory<ComponentGroupProducer> { private class Type_factory__o_d_c_e_e_ComponentGroupProducer__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends ComponentGroupProducer implements Proxy<ComponentGroupProducer> {
    private final ProxyHelper<ComponentGroupProducer> proxyHelper = new ProxyHelperImpl<ComponentGroupProducer>("Type_factory__o_d_c_e_e_ComponentGroupProducer__quals__j_e_i_Any_j_e_i_Default");
    public Type_factory__o_d_c_e_e_ComponentGroupProducer__quals__j_e_i_Any_j_e_i_DefaultProxyImpl() {
      super(null, null, null);
    }

    public void initProxyProperties(final ComponentGroupProducer instance) {

    }

    public ComponentGroupProducer asBeanType() {
      return this;
    }

    public void setInstance(final ComponentGroupProducer instance) {
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

    @Override public void onEditorFocus(PerspectiveEditorFocusEvent event) {
      if (proxyHelper != null) {
        final ComponentGroupProducer proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.onEditorFocus(event);
      } else {
        super.onEditorFocus(event);
      }
    }

    @Override public void loadComponents() {
      if (proxyHelper != null) {
        final ComponentGroupProducer proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.loadComponents();
      } else {
        super.loadComponents();
      }
    }

    @Override public void addExternalComponents(List components) {
      if (proxyHelper != null) {
        final ComponentGroupProducer proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.addExternalComponents(components);
      } else {
        super.addExternalComponents(components);
      }
    }

    @Override public void addProvidedComponents(List components) {
      if (proxyHelper != null) {
        final ComponentGroupProducer proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.addProvidedComponents(components);
      } else {
        super.addProvidedComponents(components);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final ComponentGroupProducer proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_e_e_ComponentGroupProducer__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(ComponentGroupProducer.class, "Type_factory__o_d_c_e_e_ComponentGroupProducer__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { ComponentGroupProducer.class, Object.class });
  }

  public void init(final Context context) {
    CDI.subscribeLocal("org.uberfire.ext.plugin.client.perspective.editor.events.PerspectiveEditorFocusEvent", new AbstractCDIEventCallback<PerspectiveEditorFocusEvent>() {
      public void fireEvent(final PerspectiveEditorFocusEvent event) {
        final ComponentGroupProducer instance = Factory.maybeUnwrapProxy((ComponentGroupProducer) context.getInstance("Type_factory__o_d_c_e_e_ComponentGroupProducer__quals__j_e_i_Any_j_e_i_Default"));
        instance.onEditorFocus(event);
      }
      public String toString() {
        return "Observer: org.uberfire.ext.plugin.client.perspective.editor.events.PerspectiveEditorFocusEvent []";
      }
    });
  }

  public ComponentGroupProducer createInstance(final ContextManager contextManager) {
    final Caller<ComponentService> _externalComponentService_0 = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { ComponentService.class }, new Annotation[] { });
    final LayoutDragComponentPalette _layoutDragComponentPalette_2 = (LayoutComponentPalettePresenter) contextManager.getInstance("Type_factory__o_u_e_l_e_c_w_LayoutComponentPalettePresenter__quals__j_e_i_Any_j_e_i_Default");
    final SyncBeanManager _beanManager_1 = (SyncBeanManager) contextManager.getInstance("Producer_factory__o_j_e_i_c_c_SyncBeanManager__quals__j_e_i_Any_j_e_i_Default");
    final ComponentGroupProducer instance = new ComponentGroupProducer(_externalComponentService_0, _beanManager_1, _layoutDragComponentPalette_2);
    registerDependentScopedReference(instance, _externalComponentService_0);
    registerDependentScopedReference(instance, _beanManager_1);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  private Proxy createProxyWithErrorMessage() {
    try {
      return new Type_factory__o_d_c_e_e_ComponentGroupProducer__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    } catch (Throwable t) {
      throw new RuntimeException("While creating a proxy for org.dashbuilder.client.editor.external.ComponentGroupProducer an exception was thrown from this constructor: @javax.inject.Inject()  public org.dashbuilder.client.editor.external.ComponentGroupProducer ([org.jboss.errai.common.client.api.Caller, org.jboss.errai.ioc.client.container.SyncBeanManager, org.uberfire.ext.layout.editor.client.api.LayoutDragComponentPalette])\nTo fix this problem, add a no-argument public or protected constructor for use in proxying.", t);
    }
  }

  public Proxy createProxy(final Context context) {
    final Proxy<ComponentGroupProducer> proxyImpl = createProxyWithErrorMessage();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }
}