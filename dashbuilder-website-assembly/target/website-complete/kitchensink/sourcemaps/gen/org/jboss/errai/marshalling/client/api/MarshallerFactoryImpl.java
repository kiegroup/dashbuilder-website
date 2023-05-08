package org.jboss.errai.marshalling.client.api;

import com.google.gwt.core.shared.GWT;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import javax.enterprise.context.Dependent;
import org.jboss.errai.marshalling.client.marshallers.BigDecimalMarshaller;
import org.jboss.errai.marshalling.client.marshallers.BigIntegerMarshaller;
import org.jboss.errai.marshalling.client.marshallers.BooleanMarshaller;
import org.jboss.errai.marshalling.client.marshallers.ByteMarshaller;
import org.jboss.errai.marshalling.client.marshallers.CharacterMarshaller;
import org.jboss.errai.marshalling.client.marshallers.ClientClassMarshaller;
import org.jboss.errai.marshalling.client.marshallers.DateMarshaller;
import org.jboss.errai.marshalling.client.marshallers.DoubleMarshaller;
import org.jboss.errai.marshalling.client.marshallers.FloatMarshaller;
import org.jboss.errai.marshalling.client.marshallers.IntegerMarshaller;
import org.jboss.errai.marshalling.client.marshallers.LinkedHashSetMarshaller;
import org.jboss.errai.marshalling.client.marshallers.LinkedListMarshaller;
import org.jboss.errai.marshalling.client.marshallers.LinkedMapMarshaller;
import org.jboss.errai.marshalling.client.marshallers.ListMarshaller;
import org.jboss.errai.marshalling.client.marshallers.LongMarshaller;
import org.jboss.errai.marshalling.client.marshallers.MapMarshaller;
import org.jboss.errai.marshalling.client.marshallers.ObjectMarshaller;
import org.jboss.errai.marshalling.client.marshallers.OptionalMarshaller;
import org.jboss.errai.marshalling.client.marshallers.PriorityQueueMarshaller;
import org.jboss.errai.marshalling.client.marshallers.QualifyingMarshallerWrapper;
import org.jboss.errai.marshalling.client.marshallers.QueueMarshaller;
import org.jboss.errai.marshalling.client.marshallers.SQLDateMarshaller;
import org.jboss.errai.marshalling.client.marshallers.SetMarshaller;
import org.jboss.errai.marshalling.client.marshallers.ShortMarshaller;
import org.jboss.errai.marshalling.client.marshallers.SortedMapMarshaller;
import org.jboss.errai.marshalling.client.marshallers.SortedSetMarshaller;
import org.jboss.errai.marshalling.client.marshallers.StringBufferMarshaller;
import org.jboss.errai.marshalling.client.marshallers.StringBuilderMarshaller;
import org.jboss.errai.marshalling.client.marshallers.StringMarshaller;
import org.jboss.errai.marshalling.client.marshallers.TimeMarshaller;
import org.jboss.errai.marshalling.client.marshallers.TimestampMarshaller;
@Dependent public class MarshallerFactoryImpl implements MarshallerFactory {
  private Map<String, Marshaller> marshallers = new HashMap<String, Marshaller>();
  abstract class Marshaller_for_java_lang_Throwable implements GeneratedMarshaller { }
  abstract class Marshaller_for_java_lang_ArithmeticException implements GeneratedMarshaller { }
  abstract class Marshaller_for_java_io_IOException implements GeneratedMarshaller { }
  abstract class Marshaller_for_java_lang_IllegalArgumentException implements GeneratedMarshaller { }
  abstract class Marshaller_for_java_util_EmptyStackException implements GeneratedMarshaller { }
  abstract class Marshaller_for_java_lang_ArrayStoreException implements GeneratedMarshaller { }
  abstract class Marshaller_for_java_lang_ClassCastException implements GeneratedMarshaller { }
  abstract class Marshaller_for_java_util_ConcurrentModificationException implements GeneratedMarshaller { }
  abstract class Marshaller_for_java_lang_IndexOutOfBoundsException implements GeneratedMarshaller { }
  abstract class Marshaller_for_java_lang_NegativeArraySizeException implements GeneratedMarshaller { }
  abstract class Marshaller_for_java_lang_NullPointerException implements GeneratedMarshaller { }
  abstract class Marshaller_for_java_lang_StringIndexOutOfBoundsException implements GeneratedMarshaller { }
  abstract class Marshaller_for_java_lang_UnsupportedOperationException implements GeneratedMarshaller { }
  abstract class Marshaller_for_java_lang_AssertionError implements GeneratedMarshaller { }
  abstract class Marshaller_for_java_lang_RuntimeException implements GeneratedMarshaller { }
  abstract class Marshaller_for_java_lang_StackTraceElement implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataset_sort_DataSetSort implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataset_sort_ColumnSort implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_uberfire_workbench_model_NamedPosition implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataset_group_DataSetGroup implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataprovider_DefaultProviderType implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataset_events_DataSetModifiedEvent implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_shared_model_GlobalSettings implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataset_group_GroupStrategy implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataset_filter_LogicalExprFilter implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataset_impl_DataSetLookupBuilderImpl implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_shared_model_DataSetContent implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_shared_model_RuntimeModel implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataset_group_ColumnGroup implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_navigation_impl_NavItemImpl implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_uberfire_workbench_events_NotificationEvent implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataset_filter_CoreFunctionFilter implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataset_group_Interval implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_uberfire_workbench_model_impl_ContextDefinitionImpl implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataset_date_TimeAmount implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_uberfire_ext_layout_editor_api_editor_LayoutComponentPart implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataset_date_Month implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataset_filter_LogicalExprType implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_uberfire_ext_layout_editor_api_editor_LayoutTemplate_erraiD_Style implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_uberfire_workbench_events_NotificationEvent_erraiD_NotificationType implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_uberfire_mvp_impl_ForcedPlaceRequest implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_uberfire_ext_layout_editor_api_editor_LayoutColumn implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_uberfire_workbench_model_impl_PerspectiveDefinitionImpl implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_displayer_DisplayerSettings implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataset_group_AggregateFunctionType implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_uberfire_ext_layout_editor_api_editor_LayoutComponent implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_navigation_layout_LayoutTemplateContext implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataset_impl_DataSetMetadataImpl implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_jboss_errai_common_client_PageRequest implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataset_date_Quarter implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_displayer_ColumnSettings implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataset_def_DataSetDef implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_external_model_ComponentParameter implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataset_def_ExternalDataSetDef implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataset_def_DataColumnDef implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataset_filter_CoreFunctionType implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_uberfire_workbench_model_impl_PartDefinitionImpl implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataset_events_DataSetPushingEvent implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataset_def_StaticDataSetDef implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataset_ColumnType implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataset_impl_DataSetBuilderImpl implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_shared_event_UpdatedGlobalSettingsEvent implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_uberfire_ext_layout_editor_api_editor_LayoutRow implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataprovider_ExternalProviderType implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_shared_event_UpdatedRuntimeModelEvent implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_uberfire_workbench_model_ContextDisplayMode implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_shared_model_DataSetContentType implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_external_model_ExternalComponent implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataset_filter_DataSetFilter implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataset_events_DataSetStaleEvent implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_displayer_impl_TableDisplayerSettingsBuilderImpl implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_navigation_layout_LayoutTemplateInfo implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_uberfire_ext_layout_editor_api_editor_LayoutTemplate implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataset_date_DayOfWeek implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataset_group_DateIntervalType implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataset_impl_DataColumnImpl implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_navigation_layout_LayoutNavigationRef implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataset_events_DataSetDefRegisteredEvent implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_navigation_event_NavTreeChangedEvent implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataset_DataSetLookup implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_uberfire_mvp_impl_DefaultPlaceRequest implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataset_group_GroupFunction implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataset_sort_SortedList implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_navigation_layout_LayoutNavigationRefType implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataset_impl_DataSetImpl implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_uberfire_workbench_model_impl_PanelDefinitionImpl implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataprovider_StaticProviderType implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataset_events_DataSetDefRemovedEvent implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_navigation_impl_NavTreeImpl implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_shared_event_RemovedRuntimeModelEvent implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataset_events_DataSetDefModifiedEvent implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataset_exception_DataSetLookupException implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_shared_model_RuntimeServiceResponse implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataset_backend_EditDataSetDef implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataset_date_TimeInstant implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataset_events_DataSetPushOkEvent implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_navigation_layout_LayoutRecursionIssue implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_navigation_impl_NavGroupImpl implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataset_date_TimeFrame implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_navigation_impl_NavDividerImpl implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_uberfire_workbench_model_CompassPosition implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataset_sort_SortOrder implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_displayer_Mode implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_navigation_NavItem_erraiD_Type implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_shared_model_DashbuilderRuntimeMode implements GeneratedMarshaller { }
  abstract class Marshaller_for_org_dashbuilder_dataset_date_TimeInstant_erraiD_TimeMode implements GeneratedMarshaller { }
  public MarshallerFactoryImpl() {
    final ObjectMarshaller java_lang_Object = new ObjectMarshaller();
    marshallers.put("java.lang.Object", java_lang_Object);
    final BigDecimalMarshaller java_math_BigDecimal = new BigDecimalMarshaller();
    marshallers.put("java.math.BigDecimal", java_math_BigDecimal);
    final QualifyingMarshallerWrapper<Map> java_util_Map = new QualifyingMarshallerWrapper(new MapMarshaller(), MapMarshaller.class);
    marshallers.put("java.util.Map", java_util_Map);
    marshallers.put("java.util.AbstractMap", java_util_Map);
    marshallers.put("java.util.HashMap", java_util_Map);
    marshallers.put("java.util.Collections$SynchronizedMap", java_util_Map);
    marshallers.put("java.util.Collections$EmptyMap", java_util_Map);
    marshallers.put("java.util.Collections$UnmodifiableMap", java_util_Map);
    marshallers.put("java.util.Collections$SingletonMap", java_util_Map);
    final QualifyingMarshallerWrapper<AbstractMap> java_util_AbstractMap = new QualifyingMarshallerWrapper(new MapMarshaller(), MapMarshaller.class);
    marshallers.put("java.util.AbstractMap", java_util_AbstractMap);
    final QualifyingMarshallerWrapper<HashMap> java_util_HashMap = new QualifyingMarshallerWrapper(new MapMarshaller(), MapMarshaller.class);
    marshallers.put("java.util.HashMap", java_util_HashMap);
    final BooleanMarshaller java_lang_Boolean = new BooleanMarshaller();
    marshallers.put("java.lang.Boolean", java_lang_Boolean);
    final DateMarshaller java_util_Date = new DateMarshaller();
    marshallers.put("java.util.Date", java_util_Date);
    final FloatMarshaller java_lang_Float = new FloatMarshaller();
    marshallers.put("java.lang.Float", java_lang_Float);
    final ByteMarshaller java_lang_Byte = new ByteMarshaller();
    marshallers.put("java.lang.Byte", java_lang_Byte);
    final QualifyingMarshallerWrapper<LinkedHashMap> java_util_LinkedHashMap = new QualifyingMarshallerWrapper(new LinkedMapMarshaller(), LinkedMapMarshaller.class);
    marshallers.put("java.util.LinkedHashMap", java_util_LinkedHashMap);
    final QualifyingMarshallerWrapper<SortedMap> java_util_SortedMap = new QualifyingMarshallerWrapper(new SortedMapMarshaller(), SortedMapMarshaller.class);
    marshallers.put("java.util.SortedMap", java_util_SortedMap);
    marshallers.put("java.util.TreeMap", java_util_SortedMap);
    marshallers.put("java.util.Collections$SynchronizedSortedMap", java_util_SortedMap);
    marshallers.put("java.util.Collections$UnmodifiableSortedMap", java_util_SortedMap);
    final QualifyingMarshallerWrapper<TreeMap> java_util_TreeMap = new QualifyingMarshallerWrapper(new SortedMapMarshaller(), SortedMapMarshaller.class);
    marshallers.put("java.util.TreeMap", java_util_TreeMap);
    final DoubleMarshaller java_lang_Double = new DoubleMarshaller();
    marshallers.put("java.lang.Double", java_lang_Double);
    final BigIntegerMarshaller java_math_BigInteger = new BigIntegerMarshaller();
    marshallers.put("java.math.BigInteger", java_math_BigInteger);
    final SQLDateMarshaller java_sql_Date = new SQLDateMarshaller();
    marshallers.put("java.sql.Date", java_sql_Date);
    final StringMarshaller java_lang_String = new StringMarshaller();
    marshallers.put("java.lang.String", java_lang_String);
    final LinkedHashSetMarshaller java_util_LinkedHashSet = new LinkedHashSetMarshaller();
    marshallers.put("java.util.LinkedHashSet", java_util_LinkedHashSet);
    final StringBuilderMarshaller java_lang_StringBuilder = new StringBuilderMarshaller();
    marshallers.put("java.lang.StringBuilder", java_lang_StringBuilder);
    final IntegerMarshaller java_lang_Integer = new IntegerMarshaller();
    marshallers.put("java.lang.Integer", java_lang_Integer);
    final TimestampMarshaller java_sql_Timestamp = new TimestampMarshaller();
    marshallers.put("java.sql.Timestamp", java_sql_Timestamp);
    final SetMarshaller java_util_Set = new SetMarshaller();
    marshallers.put("java.util.Set", java_util_Set);
    marshallers.put("java.util.AbstractSet", java_util_Set);
    marshallers.put("java.util.HashSet", java_util_Set);
    marshallers.put("java.util.Collections$SynchronizedSet", java_util_Set);
    marshallers.put("java.util.Collections$UnmodifiableSet", java_util_Set);
    marshallers.put("java.util.Collections$SingletonSet", java_util_Set);
    marshallers.put("java.util.Collections$EmptySet", java_util_Set);
    final SetMarshaller java_util_AbstractSet = new SetMarshaller();
    marshallers.put("java.util.AbstractSet", java_util_AbstractSet);
    final SetMarshaller java_util_HashSet = new SetMarshaller();
    marshallers.put("java.util.HashSet", java_util_HashSet);
    final LinkedListMarshaller java_util_LinkedList = new LinkedListMarshaller();
    marshallers.put("java.util.LinkedList", java_util_LinkedList);
    final LongMarshaller java_lang_Long = new LongMarshaller();
    marshallers.put("java.lang.Long", java_lang_Long);
    final ClientClassMarshaller java_lang_Class = new ClientClassMarshaller();
    marshallers.put("java.lang.Class", java_lang_Class);
    final ListMarshaller java_util_List = new ListMarshaller();
    marshallers.put("java.util.List", java_util_List);
    marshallers.put("java.util.AbstractList", java_util_List);
    marshallers.put("java.util.ArrayList", java_util_List);
    marshallers.put("java.util.Vector", java_util_List);
    marshallers.put("java.util.Stack", java_util_List);
    marshallers.put("java.util.Collections$SynchronizedRandomAccessList", java_util_List);
    marshallers.put("java.util.Collections$SynchronizedList", java_util_List);
    marshallers.put("java.util.Collections$SingletonList", java_util_List);
    marshallers.put("java.util.Collections$EmptyList", java_util_List);
    marshallers.put("java.util.Collections$UnmodifiableRandomAccessList", java_util_List);
    marshallers.put("java.util.Collections$UnmodifiableList", java_util_List);
    marshallers.put("java.util.Arrays$ArrayList", java_util_List);
    final ListMarshaller java_util_AbstractList = new ListMarshaller();
    marshallers.put("java.util.AbstractList", java_util_AbstractList);
    final ListMarshaller java_util_ArrayList = new ListMarshaller();
    marshallers.put("java.util.ArrayList", java_util_ArrayList);
    final ListMarshaller java_util_Vector = new ListMarshaller();
    marshallers.put("java.util.Vector", java_util_Vector);
    final ListMarshaller java_util_Stack = new ListMarshaller();
    marshallers.put("java.util.Stack", java_util_Stack);
    final QueueMarshaller java_util_Queue = new QueueMarshaller();
    marshallers.put("java.util.Queue", java_util_Queue);
    marshallers.put("java.util.AbstractQueue", java_util_Queue);
    final QueueMarshaller java_util_AbstractQueue = new QueueMarshaller();
    marshallers.put("java.util.AbstractQueue", java_util_AbstractQueue);
    final ShortMarshaller java_lang_Short = new ShortMarshaller();
    marshallers.put("java.lang.Short", java_lang_Short);
    final OptionalMarshaller java_util_Optional = new OptionalMarshaller();
    marshallers.put("java.util.Optional", java_util_Optional);
    final CharacterMarshaller java_lang_Character = new CharacterMarshaller();
    marshallers.put("java.lang.Character", java_lang_Character);
    final StringBufferMarshaller java_lang_StringBuffer = new StringBufferMarshaller();
    marshallers.put("java.lang.StringBuffer", java_lang_StringBuffer);
    final TimeMarshaller java_sql_Time = new TimeMarshaller();
    marshallers.put("java.sql.Time", java_sql_Time);
    final SortedSetMarshaller java_util_SortedSet = new SortedSetMarshaller();
    marshallers.put("java.util.SortedSet", java_util_SortedSet);
    marshallers.put("java.util.TreeSet", java_util_SortedSet);
    marshallers.put("java.util.Collections$UnmodifiableSortedSet", java_util_SortedSet);
    marshallers.put("java.util.Collections$SynchronizedSortedSet", java_util_SortedSet);
    final SortedSetMarshaller java_util_TreeSet = new SortedSetMarshaller();
    marshallers.put("java.util.TreeSet", java_util_TreeSet);
    final PriorityQueueMarshaller java_util_PriorityQueue = new PriorityQueueMarshaller();
    marshallers.put("java.util.PriorityQueue", java_util_PriorityQueue);
  }

  private boolean putMarshaller(String fqcn, Marshaller m) {
    marshallers.put(fqcn, m);
    return true;
  }

  private boolean loadMarshaller0(String a0) {
    switch (a0) {
      case "java.lang.Throwable": return putMarshaller(a0, GWT.create(Marshaller_for_java_lang_Throwable.class));
      case "java.lang.ArithmeticException": return putMarshaller(a0, GWT.create(Marshaller_for_java_lang_ArithmeticException.class));
      case "java.io.IOException": return putMarshaller(a0, GWT.create(Marshaller_for_java_io_IOException.class));
      case "java.lang.IllegalArgumentException": return putMarshaller(a0, GWT.create(Marshaller_for_java_lang_IllegalArgumentException.class));
      case "java.util.EmptyStackException": return putMarshaller(a0, GWT.create(Marshaller_for_java_util_EmptyStackException.class));
      case "java.lang.ArrayStoreException": return putMarshaller(a0, GWT.create(Marshaller_for_java_lang_ArrayStoreException.class));
      case "java.lang.ClassCastException": return putMarshaller(a0, GWT.create(Marshaller_for_java_lang_ClassCastException.class));
      case "java.util.ConcurrentModificationException": return putMarshaller(a0, GWT.create(Marshaller_for_java_util_ConcurrentModificationException.class));
      case "java.lang.IndexOutOfBoundsException": return putMarshaller(a0, GWT.create(Marshaller_for_java_lang_IndexOutOfBoundsException.class));
      case "java.lang.NegativeArraySizeException": return putMarshaller(a0, GWT.create(Marshaller_for_java_lang_NegativeArraySizeException.class));
      case "java.lang.NullPointerException": return putMarshaller(a0, GWT.create(Marshaller_for_java_lang_NullPointerException.class));
      case "java.lang.StringIndexOutOfBoundsException": return putMarshaller(a0, GWT.create(Marshaller_for_java_lang_StringIndexOutOfBoundsException.class));
      case "java.lang.UnsupportedOperationException": return putMarshaller(a0, GWT.create(Marshaller_for_java_lang_UnsupportedOperationException.class));
      case "java.lang.AssertionError": return putMarshaller(a0, GWT.create(Marshaller_for_java_lang_AssertionError.class));
      case "java.lang.RuntimeException": return putMarshaller(a0, GWT.create(Marshaller_for_java_lang_RuntimeException.class));
      case "java.lang.StackTraceElement": return putMarshaller(a0, GWT.create(Marshaller_for_java_lang_StackTraceElement.class));
      case "org.dashbuilder.dataset.sort.DataSetSort": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataset_sort_DataSetSort.class));
      case "org.dashbuilder.dataset.sort.ColumnSort": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataset_sort_ColumnSort.class));
      case "org.uberfire.workbench.model.NamedPosition": return putMarshaller(a0, GWT.create(Marshaller_for_org_uberfire_workbench_model_NamedPosition.class));
      case "org.dashbuilder.dataset.group.DataSetGroup": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataset_group_DataSetGroup.class));
      case "org.dashbuilder.dataprovider.DefaultProviderType": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataprovider_DefaultProviderType.class));
      case "org.dashbuilder.dataset.events.DataSetModifiedEvent": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataset_events_DataSetModifiedEvent.class));
      case "org.dashbuilder.shared.model.GlobalSettings": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_shared_model_GlobalSettings.class));
      case "org.dashbuilder.dataset.group.GroupStrategy": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataset_group_GroupStrategy.class));
      case "org.dashbuilder.dataset.filter.LogicalExprFilter": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataset_filter_LogicalExprFilter.class));
      case "org.dashbuilder.dataset.impl.DataSetLookupBuilderImpl": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataset_impl_DataSetLookupBuilderImpl.class));
      case "org.dashbuilder.shared.model.DataSetContent": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_shared_model_DataSetContent.class));
      case "org.dashbuilder.shared.model.RuntimeModel": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_shared_model_RuntimeModel.class));
      case "org.dashbuilder.dataset.group.ColumnGroup": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataset_group_ColumnGroup.class));
      case "org.dashbuilder.navigation.impl.NavItemImpl": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_navigation_impl_NavItemImpl.class));
      case "org.uberfire.workbench.events.NotificationEvent": return putMarshaller(a0, GWT.create(Marshaller_for_org_uberfire_workbench_events_NotificationEvent.class));
      case "org.dashbuilder.dataset.filter.CoreFunctionFilter": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataset_filter_CoreFunctionFilter.class));
      case "org.dashbuilder.dataset.group.Interval": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataset_group_Interval.class));
      case "org.uberfire.workbench.model.impl.ContextDefinitionImpl": return putMarshaller(a0, GWT.create(Marshaller_for_org_uberfire_workbench_model_impl_ContextDefinitionImpl.class));
      case "org.dashbuilder.dataset.date.TimeAmount": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataset_date_TimeAmount.class));
      case "org.uberfire.ext.layout.editor.api.editor.LayoutComponentPart": return putMarshaller(a0, GWT.create(Marshaller_for_org_uberfire_ext_layout_editor_api_editor_LayoutComponentPart.class));
      case "org.dashbuilder.dataset.date.Month": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataset_date_Month.class));
      case "org.dashbuilder.dataset.filter.LogicalExprType": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataset_filter_LogicalExprType.class));
      case "org.uberfire.ext.layout.editor.api.editor.LayoutTemplate$Style": return putMarshaller(a0, GWT.create(Marshaller_for_org_uberfire_ext_layout_editor_api_editor_LayoutTemplate_erraiD_Style.class));
      case "org.uberfire.workbench.events.NotificationEvent$NotificationType": return putMarshaller(a0, GWT.create(Marshaller_for_org_uberfire_workbench_events_NotificationEvent_erraiD_NotificationType.class));
      case "org.uberfire.mvp.impl.ForcedPlaceRequest": return putMarshaller(a0, GWT.create(Marshaller_for_org_uberfire_mvp_impl_ForcedPlaceRequest.class));
      case "org.uberfire.ext.layout.editor.api.editor.LayoutColumn": return putMarshaller(a0, GWT.create(Marshaller_for_org_uberfire_ext_layout_editor_api_editor_LayoutColumn.class));
      case "org.uberfire.workbench.model.impl.PerspectiveDefinitionImpl": return putMarshaller(a0, GWT.create(Marshaller_for_org_uberfire_workbench_model_impl_PerspectiveDefinitionImpl.class));
      case "org.dashbuilder.displayer.DisplayerSettings": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_displayer_DisplayerSettings.class));
      case "org.dashbuilder.dataset.group.AggregateFunctionType": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataset_group_AggregateFunctionType.class));
      case "org.uberfire.ext.layout.editor.api.editor.LayoutComponent": return putMarshaller(a0, GWT.create(Marshaller_for_org_uberfire_ext_layout_editor_api_editor_LayoutComponent.class));
      case "org.dashbuilder.navigation.layout.LayoutTemplateContext": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_navigation_layout_LayoutTemplateContext.class));
      case "org.dashbuilder.dataset.impl.DataSetMetadataImpl": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataset_impl_DataSetMetadataImpl.class));
      case "org.jboss.errai.common.client.PageRequest": return putMarshaller(a0, GWT.create(Marshaller_for_org_jboss_errai_common_client_PageRequest.class));
      case "org.dashbuilder.dataset.date.Quarter": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataset_date_Quarter.class));
      case "org.dashbuilder.displayer.ColumnSettings": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_displayer_ColumnSettings.class));
      case "org.dashbuilder.dataset.def.DataSetDef": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataset_def_DataSetDef.class));
      case "org.dashbuilder.external.model.ComponentParameter": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_external_model_ComponentParameter.class));
      case "org.dashbuilder.dataset.def.ExternalDataSetDef": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataset_def_ExternalDataSetDef.class));
      case "org.dashbuilder.dataset.def.DataColumnDef": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataset_def_DataColumnDef.class));
      case "org.dashbuilder.dataset.filter.CoreFunctionType": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataset_filter_CoreFunctionType.class));
      case "org.uberfire.workbench.model.impl.PartDefinitionImpl": return putMarshaller(a0, GWT.create(Marshaller_for_org_uberfire_workbench_model_impl_PartDefinitionImpl.class));
      case "org.dashbuilder.dataset.events.DataSetPushingEvent": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataset_events_DataSetPushingEvent.class));
      case "org.dashbuilder.dataset.def.StaticDataSetDef": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataset_def_StaticDataSetDef.class));
      case "org.dashbuilder.dataset.ColumnType": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataset_ColumnType.class));
      case "org.dashbuilder.dataset.impl.DataSetBuilderImpl": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataset_impl_DataSetBuilderImpl.class));
      case "org.dashbuilder.shared.event.UpdatedGlobalSettingsEvent": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_shared_event_UpdatedGlobalSettingsEvent.class));
      case "org.uberfire.ext.layout.editor.api.editor.LayoutRow": return putMarshaller(a0, GWT.create(Marshaller_for_org_uberfire_ext_layout_editor_api_editor_LayoutRow.class));
      case "org.dashbuilder.dataprovider.ExternalProviderType": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataprovider_ExternalProviderType.class));
      case "org.dashbuilder.shared.event.UpdatedRuntimeModelEvent": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_shared_event_UpdatedRuntimeModelEvent.class));
      case "org.uberfire.workbench.model.ContextDisplayMode": return putMarshaller(a0, GWT.create(Marshaller_for_org_uberfire_workbench_model_ContextDisplayMode.class));
      case "org.dashbuilder.shared.model.DataSetContentType": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_shared_model_DataSetContentType.class));
      case "org.dashbuilder.external.model.ExternalComponent": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_external_model_ExternalComponent.class));
      case "org.dashbuilder.dataset.filter.DataSetFilter": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataset_filter_DataSetFilter.class));
      case "org.dashbuilder.dataset.events.DataSetStaleEvent": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataset_events_DataSetStaleEvent.class));
      case "org.dashbuilder.displayer.impl.TableDisplayerSettingsBuilderImpl": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_displayer_impl_TableDisplayerSettingsBuilderImpl.class));
      case "org.dashbuilder.navigation.layout.LayoutTemplateInfo": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_navigation_layout_LayoutTemplateInfo.class));
      case "org.uberfire.ext.layout.editor.api.editor.LayoutTemplate": return putMarshaller(a0, GWT.create(Marshaller_for_org_uberfire_ext_layout_editor_api_editor_LayoutTemplate.class));
      case "org.dashbuilder.dataset.date.DayOfWeek": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataset_date_DayOfWeek.class));
      case "org.dashbuilder.dataset.group.DateIntervalType": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataset_group_DateIntervalType.class));
      case "org.dashbuilder.dataset.impl.DataColumnImpl": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataset_impl_DataColumnImpl.class));
      case "org.dashbuilder.navigation.layout.LayoutNavigationRef": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_navigation_layout_LayoutNavigationRef.class));
      case "org.dashbuilder.dataset.events.DataSetDefRegisteredEvent": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataset_events_DataSetDefRegisteredEvent.class));
      case "org.dashbuilder.navigation.event.NavTreeChangedEvent": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_navigation_event_NavTreeChangedEvent.class));
      case "org.dashbuilder.dataset.DataSetLookup": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataset_DataSetLookup.class));
      case "org.uberfire.mvp.impl.DefaultPlaceRequest": return putMarshaller(a0, GWT.create(Marshaller_for_org_uberfire_mvp_impl_DefaultPlaceRequest.class));
      case "org.dashbuilder.dataset.group.GroupFunction": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataset_group_GroupFunction.class));
      case "org.dashbuilder.dataset.sort.SortedList": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataset_sort_SortedList.class));
      case "org.dashbuilder.navigation.layout.LayoutNavigationRefType": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_navigation_layout_LayoutNavigationRefType.class));
      case "org.dashbuilder.dataset.impl.DataSetImpl": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataset_impl_DataSetImpl.class));
      case "org.uberfire.workbench.model.impl.PanelDefinitionImpl": return putMarshaller(a0, GWT.create(Marshaller_for_org_uberfire_workbench_model_impl_PanelDefinitionImpl.class));
      case "org.dashbuilder.dataprovider.StaticProviderType": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataprovider_StaticProviderType.class));
      case "org.dashbuilder.dataset.events.DataSetDefRemovedEvent": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataset_events_DataSetDefRemovedEvent.class));
      case "org.dashbuilder.navigation.impl.NavTreeImpl": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_navigation_impl_NavTreeImpl.class));
      case "org.dashbuilder.shared.event.RemovedRuntimeModelEvent": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_shared_event_RemovedRuntimeModelEvent.class));
      case "org.dashbuilder.dataset.events.DataSetDefModifiedEvent": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataset_events_DataSetDefModifiedEvent.class));
      case "org.dashbuilder.dataset.exception.DataSetLookupException": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataset_exception_DataSetLookupException.class));
      case "org.dashbuilder.shared.model.RuntimeServiceResponse": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_shared_model_RuntimeServiceResponse.class));
      case "org.dashbuilder.dataset.backend.EditDataSetDef": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataset_backend_EditDataSetDef.class));
      case "org.dashbuilder.dataset.date.TimeInstant": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataset_date_TimeInstant.class));
      case "org.dashbuilder.dataset.events.DataSetPushOkEvent": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataset_events_DataSetPushOkEvent.class));
      case "org.dashbuilder.navigation.layout.LayoutRecursionIssue": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_navigation_layout_LayoutRecursionIssue.class));
      case "org.dashbuilder.navigation.impl.NavGroupImpl": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_navigation_impl_NavGroupImpl.class));
      case "org.dashbuilder.dataset.date.TimeFrame": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataset_date_TimeFrame.class));
      case "org.dashbuilder.navigation.impl.NavDividerImpl": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_navigation_impl_NavDividerImpl.class));
      case "org.uberfire.workbench.model.CompassPosition": return putMarshaller(a0, GWT.create(Marshaller_for_org_uberfire_workbench_model_CompassPosition.class));
      case "org.dashbuilder.dataset.sort.SortOrder": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataset_sort_SortOrder.class));
      case "org.dashbuilder.displayer.Mode": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_displayer_Mode.class));
      case "org.dashbuilder.navigation.NavItem$Type": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_navigation_NavItem_erraiD_Type.class));
      case "org.dashbuilder.shared.model.DashbuilderRuntimeMode": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_shared_model_DashbuilderRuntimeMode.class));
      case "org.dashbuilder.dataset.date.TimeInstant$TimeMode": return putMarshaller(a0, GWT.create(Marshaller_for_org_dashbuilder_dataset_date_TimeInstant_erraiD_TimeMode.class));
      default: return false;
    }
  }

  public Marshaller getMarshaller(String a0) {
    if (a0 == null) {
      return null;
    }
    Marshaller m = marshallers.get(a0);
    if (m != null) {
      return m;
    } else if (loadMarshaller0(a0)) {
      return marshallers.get(a0);
    }
    return null;
  }

  public void registerMarshaller(String a0, Marshaller a1) {
    marshallers.put(a0, a1);
  }
}