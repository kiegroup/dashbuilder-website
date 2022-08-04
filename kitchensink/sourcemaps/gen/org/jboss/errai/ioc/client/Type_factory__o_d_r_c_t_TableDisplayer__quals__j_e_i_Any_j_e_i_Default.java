package org.jboss.errai.ioc.client;

import com.google.gwt.user.client.ui.IsWidget;
import javax.enterprise.context.Dependent;
import org.dashbuilder.common.client.widgets.FilterLabelSet;
import org.dashbuilder.displayer.client.AbstractDisplayer;
import org.dashbuilder.displayer.client.AbstractGwtDisplayer;
import org.dashbuilder.displayer.client.Displayer;
import org.dashbuilder.displayer.client.DisplayerListener;
import org.dashbuilder.renderer.client.table.TableDisplayer;
import org.dashbuilder.renderer.client.table.TableDisplayer.View;
import org.dashbuilder.renderer.client.table.TableDisplayerView;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_r_c_t_TableDisplayer__quals__j_e_i_Any_j_e_i_Default extends Factory<TableDisplayer> { public Type_factory__o_d_r_c_t_TableDisplayer__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(TableDisplayer.class, "Type_factory__o_d_r_c_t_TableDisplayer__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { TableDisplayer.class, AbstractGwtDisplayer.class, AbstractDisplayer.class, Object.class, Displayer.class, DisplayerListener.class, IsWidget.class });
  }

  public TableDisplayer createInstance(final ContextManager contextManager) {
    final View _view_0 = (TableDisplayerView) contextManager.getInstance("Type_factory__o_d_r_c_t_TableDisplayerView__quals__j_e_i_Any_j_e_i_Default");
    final FilterLabelSet _filterLabelSet_1 = (FilterLabelSet) contextManager.getInstance("Type_factory__o_d_c_c_w_FilterLabelSet__quals__j_e_i_Any_j_e_i_Default");
    final TableDisplayer instance = new TableDisplayer(_view_0, _filterLabelSet_1);
    registerDependentScopedReference(instance, _view_0);
    registerDependentScopedReference(instance, _filterLabelSet_1);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}