package org.jboss.errai.ioc.client;

import org.jboss.errai.bus.client.api.ClientMessageBus;
import org.jboss.errai.ioc.client.api.EntryPoint;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.slf4j.Logger;
import org.uberfire.client.WorkbenchBackendEntryPoint;
import org.uberfire.client.workbench.WorkbenchServicesProxy;
import org.uberfire.client.workbench.WorkbenchServicesProxyClientImpl;
import org.uberfire.client.workbench.widgets.common.ErrorPopupPresenter;

public class Type_factory__o_u_c_WorkbenchBackendEntryPoint__quals__j_e_i_Any_j_e_i_Default extends Factory<WorkbenchBackendEntryPoint> { public Type_factory__o_u_c_WorkbenchBackendEntryPoint__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(WorkbenchBackendEntryPoint.class, "Type_factory__o_u_c_WorkbenchBackendEntryPoint__quals__j_e_i_Any_j_e_i_Default", EntryPoint.class, true, null, true));
    handle.setAssignableTypes(new Class[] { WorkbenchBackendEntryPoint.class, Object.class });
  }

  public WorkbenchBackendEntryPoint createInstance(final ContextManager contextManager) {
    final Logger _logger_0 = (Logger) contextManager.getInstance("ExtensionProvided_factory__o_s_Logger__quals__Universal_1");
    final WorkbenchServicesProxy _workbenchServices_2 = (WorkbenchServicesProxyClientImpl) contextManager.getInstance("Type_factory__o_u_c_w_WorkbenchServicesProxyClientImpl__quals__j_e_i_Any_j_e_i_Default");
    final ErrorPopupPresenter _errorPopupPresenter_3 = (ErrorPopupPresenter) contextManager.getInstance("Type_factory__o_u_c_w_w_c_ErrorPopupPresenter__quals__j_e_i_Any_j_e_i_Default");
    final ClientMessageBus _bus_1 = (ClientMessageBus) contextManager.getInstance("Producer_factory__o_j_e_b_c_a_ClientMessageBus__quals__j_e_i_Any_j_e_i_Default");
    final WorkbenchBackendEntryPoint instance = new WorkbenchBackendEntryPoint(_logger_0, _bus_1, _workbenchServices_2, _errorPopupPresenter_3);
    registerDependentScopedReference(instance, _logger_0);
    registerDependentScopedReference(instance, _workbenchServices_2);
    registerDependentScopedReference(instance, _bus_1);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final WorkbenchBackendEntryPoint instance) {
    instance.init();
  }
}