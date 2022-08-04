package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import javax.enterprise.context.ApplicationScoped;
import org.jboss.errai.common.client.api.Caller;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;
import org.uberfire.ext.editor.commons.client.validation.DefaultFileNameValidator;
import org.uberfire.ext.editor.commons.client.validation.Validator;
import org.uberfire.ext.editor.commons.client.validation.ValidatorCallback;
import org.uberfire.ext.editor.commons.client.validation.ValidatorWithReasonCallback;
import org.uberfire.ext.plugin.client.validation.PluginNameValidator;
import org.uberfire.ext.plugin.service.PluginServices;

public class Type_factory__o_u_e_p_c_v_PluginNameValidator__quals__j_e_i_Any_j_e_i_Default extends Factory<PluginNameValidator> { private class Type_factory__o_u_e_p_c_v_PluginNameValidator__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends PluginNameValidator implements Proxy<PluginNameValidator> {
    private final ProxyHelper<PluginNameValidator> proxyHelper = new ProxyHelperImpl<PluginNameValidator>("Type_factory__o_u_e_p_c_v_PluginNameValidator__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final PluginNameValidator instance) {

    }

    public PluginNameValidator asBeanType() {
      return this;
    }

    public void setInstance(final PluginNameValidator instance) {
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

    @Override public void validate(String name, ValidatorCallback callback) {
      if (proxyHelper != null) {
        final PluginNameValidator proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.validate(name, callback);
      } else {
        super.validate(name, callback);
      }
    }

    @Override protected void validateName(String name, ValidatorWithReasonCallback callback) {
      if (proxyHelper != null) {
        final PluginNameValidator proxiedInstance = proxyHelper.getInstance(this);
        PluginNameValidator_validateName_String_ValidatorWithReasonCallback(proxiedInstance, name, callback);
      } else {
        super.validateName(name, callback);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final PluginNameValidator proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_u_e_p_c_v_PluginNameValidator__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(PluginNameValidator.class, "Type_factory__o_u_e_p_c_v_PluginNameValidator__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { PluginNameValidator.class, Object.class, Validator.class });
  }

  public PluginNameValidator createInstance(final ContextManager contextManager) {
    final PluginNameValidator instance = new PluginNameValidator();
    setIncompleteInstance(instance);
    final DefaultFileNameValidator PluginNameValidator_defaultFileNameValidator = (DefaultFileNameValidator) contextManager.getInstance("Type_factory__o_u_e_e_c_c_v_DefaultFileNameValidator__quals__j_e_i_Any_j_e_i_Default");
    PluginNameValidator_DefaultFileNameValidator_defaultFileNameValidator(instance, PluginNameValidator_defaultFileNameValidator);
    final Caller PluginNameValidator_pluginServices = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { PluginServices.class }, new Annotation[] { });
    registerDependentScopedReference(instance, PluginNameValidator_pluginServices);
    PluginNameValidator_Caller_pluginServices(instance, PluginNameValidator_pluginServices);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<PluginNameValidator> proxyImpl = new Type_factory__o_u_e_p_c_v_PluginNameValidator__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  native static Caller PluginNameValidator_Caller_pluginServices(PluginNameValidator instance) /*-{
    return instance.@org.uberfire.ext.plugin.client.validation.PluginNameValidator::pluginServices;
  }-*/;

  native static void PluginNameValidator_Caller_pluginServices(PluginNameValidator instance, Caller<PluginServices> value) /*-{
    instance.@org.uberfire.ext.plugin.client.validation.PluginNameValidator::pluginServices = value;
  }-*/;

  native static DefaultFileNameValidator PluginNameValidator_DefaultFileNameValidator_defaultFileNameValidator(PluginNameValidator instance) /*-{
    return instance.@org.uberfire.ext.plugin.client.validation.PluginNameValidator::defaultFileNameValidator;
  }-*/;

  native static void PluginNameValidator_DefaultFileNameValidator_defaultFileNameValidator(PluginNameValidator instance, DefaultFileNameValidator value) /*-{
    instance.@org.uberfire.ext.plugin.client.validation.PluginNameValidator::defaultFileNameValidator = value;
  }-*/;

  public native static void PluginNameValidator_validateName_String_ValidatorWithReasonCallback(PluginNameValidator instance, String a0, ValidatorWithReasonCallback a1) /*-{
    instance.@org.uberfire.ext.plugin.client.validation.PluginNameValidator::validateName(Ljava/lang/String;Lorg/uberfire/ext/editor/commons/client/validation/ValidatorWithReasonCallback;)(a0, a1);
  }-*/;
}