/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.records;


import edu.java.domain.jooq.information_schema.tables.Triggers;

import java.beans.ConstructorProperties;
import java.time.OffsetDateTime;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record17;
import org.jooq.Row17;
import org.jooq.impl.TableRecordImpl;


/**
 * The table <code>information_schema.triggers</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class TriggersRecord extends TableRecordImpl<TriggersRecord> implements Record17<String, String, String, String, String, String, String, Integer, String, String, String, String, String, String, String, String, OffsetDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.triggers.trigger_catalog</code>.
     */
    public void setTriggerCatalog(@Nullable String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.triggers.trigger_catalog</code>.
     */
    @Nullable
    public String getTriggerCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.triggers.trigger_schema</code>.
     */
    public void setTriggerSchema(@Nullable String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.triggers.trigger_schema</code>.
     */
    @Nullable
    public String getTriggerSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.triggers.trigger_name</code>.
     */
    public void setTriggerName(@Nullable String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.triggers.trigger_name</code>.
     */
    @Nullable
    public String getTriggerName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.triggers.event_manipulation</code>.
     */
    public void setEventManipulation(@Nullable String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.triggers.event_manipulation</code>.
     */
    @Nullable
    public String getEventManipulation() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.triggers.event_object_catalog</code>.
     */
    public void setEventObjectCatalog(@Nullable String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.triggers.event_object_catalog</code>.
     */
    @Nullable
    public String getEventObjectCatalog() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.triggers.event_object_schema</code>.
     */
    public void setEventObjectSchema(@Nullable String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.triggers.event_object_schema</code>.
     */
    @Nullable
    public String getEventObjectSchema() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.triggers.event_object_table</code>.
     */
    public void setEventObjectTable(@Nullable String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.triggers.event_object_table</code>.
     */
    @Nullable
    public String getEventObjectTable() {
        return (String) get(6);
    }

    /**
     * Setter for <code>information_schema.triggers.action_order</code>.
     */
    public void setActionOrder(@Nullable Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema.triggers.action_order</code>.
     */
    @Nullable
    public Integer getActionOrder() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>information_schema.triggers.action_condition</code>.
     */
    public void setActionCondition(@Nullable String value) {
        set(8, value);
    }

    /**
     * Getter for <code>information_schema.triggers.action_condition</code>.
     */
    @Nullable
    public String getActionCondition() {
        return (String) get(8);
    }

    /**
     * Setter for <code>information_schema.triggers.action_statement</code>.
     */
    public void setActionStatement(@Nullable String value) {
        set(9, value);
    }

    /**
     * Getter for <code>information_schema.triggers.action_statement</code>.
     */
    @Nullable
    public String getActionStatement() {
        return (String) get(9);
    }

    /**
     * Setter for <code>information_schema.triggers.action_orientation</code>.
     */
    public void setActionOrientation(@Nullable String value) {
        set(10, value);
    }

    /**
     * Getter for <code>information_schema.triggers.action_orientation</code>.
     */
    @Nullable
    public String getActionOrientation() {
        return (String) get(10);
    }

    /**
     * Setter for <code>information_schema.triggers.action_timing</code>.
     */
    public void setActionTiming(@Nullable String value) {
        set(11, value);
    }

    /**
     * Getter for <code>information_schema.triggers.action_timing</code>.
     */
    @Nullable
    public String getActionTiming() {
        return (String) get(11);
    }

    /**
     * Setter for
     * <code>information_schema.triggers.action_reference_old_table</code>.
     */
    public void setActionReferenceOldTable(@Nullable String value) {
        set(12, value);
    }

    /**
     * Getter for
     * <code>information_schema.triggers.action_reference_old_table</code>.
     */
    @Nullable
    public String getActionReferenceOldTable() {
        return (String) get(12);
    }

    /**
     * Setter for
     * <code>information_schema.triggers.action_reference_new_table</code>.
     */
    public void setActionReferenceNewTable(@Nullable String value) {
        set(13, value);
    }

    /**
     * Getter for
     * <code>information_schema.triggers.action_reference_new_table</code>.
     */
    @Nullable
    public String getActionReferenceNewTable() {
        return (String) get(13);
    }

    /**
     * Setter for
     * <code>information_schema.triggers.action_reference_old_row</code>.
     */
    public void setActionReferenceOldRow(@Nullable String value) {
        set(14, value);
    }

    /**
     * Getter for
     * <code>information_schema.triggers.action_reference_old_row</code>.
     */
    @Nullable
    public String getActionReferenceOldRow() {
        return (String) get(14);
    }

    /**
     * Setter for
     * <code>information_schema.triggers.action_reference_new_row</code>.
     */
    public void setActionReferenceNewRow(@Nullable String value) {
        set(15, value);
    }

    /**
     * Getter for
     * <code>information_schema.triggers.action_reference_new_row</code>.
     */
    @Nullable
    public String getActionReferenceNewRow() {
        return (String) get(15);
    }

    /**
     * Setter for <code>information_schema.triggers.created</code>.
     */
    public void setCreated(@Nullable OffsetDateTime value) {
        set(16, value);
    }

    /**
     * Getter for <code>information_schema.triggers.created</code>.
     */
    @Nullable
    public OffsetDateTime getCreated() {
        return (OffsetDateTime) get(16);
    }

    // -------------------------------------------------------------------------
    // Record17 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row17<String, String, String, String, String, String, String, Integer, String, String, String, String, String, String, String, String, OffsetDateTime> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row17<String, String, String, String, String, String, String, Integer, String, String, String, String, String, String, String, String, OffsetDateTime> valuesRow() {
        return (Row17) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<String> field1() {
        return Triggers.TRIGGERS.TRIGGER_CATALOG;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return Triggers.TRIGGERS.TRIGGER_SCHEMA;
    }

    @Override
    @NotNull
    public Field<String> field3() {
        return Triggers.TRIGGERS.TRIGGER_NAME;
    }

    @Override
    @NotNull
    public Field<String> field4() {
        return Triggers.TRIGGERS.EVENT_MANIPULATION;
    }

    @Override
    @NotNull
    public Field<String> field5() {
        return Triggers.TRIGGERS.EVENT_OBJECT_CATALOG;
    }

    @Override
    @NotNull
    public Field<String> field6() {
        return Triggers.TRIGGERS.EVENT_OBJECT_SCHEMA;
    }

    @Override
    @NotNull
    public Field<String> field7() {
        return Triggers.TRIGGERS.EVENT_OBJECT_TABLE;
    }

    @Override
    @NotNull
    public Field<Integer> field8() {
        return Triggers.TRIGGERS.ACTION_ORDER;
    }

    @Override
    @NotNull
    public Field<String> field9() {
        return Triggers.TRIGGERS.ACTION_CONDITION;
    }

    @Override
    @NotNull
    public Field<String> field10() {
        return Triggers.TRIGGERS.ACTION_STATEMENT;
    }

    @Override
    @NotNull
    public Field<String> field11() {
        return Triggers.TRIGGERS.ACTION_ORIENTATION;
    }

    @Override
    @NotNull
    public Field<String> field12() {
        return Triggers.TRIGGERS.ACTION_TIMING;
    }

    @Override
    @NotNull
    public Field<String> field13() {
        return Triggers.TRIGGERS.ACTION_REFERENCE_OLD_TABLE;
    }

    @Override
    @NotNull
    public Field<String> field14() {
        return Triggers.TRIGGERS.ACTION_REFERENCE_NEW_TABLE;
    }

    @Override
    @NotNull
    public Field<String> field15() {
        return Triggers.TRIGGERS.ACTION_REFERENCE_OLD_ROW;
    }

    @Override
    @NotNull
    public Field<String> field16() {
        return Triggers.TRIGGERS.ACTION_REFERENCE_NEW_ROW;
    }

    @Override
    @NotNull
    public Field<OffsetDateTime> field17() {
        return Triggers.TRIGGERS.CREATED;
    }

    @Override
    @Nullable
    public String component1() {
        return getTriggerCatalog();
    }

    @Override
    @Nullable
    public String component2() {
        return getTriggerSchema();
    }

    @Override
    @Nullable
    public String component3() {
        return getTriggerName();
    }

    @Override
    @Nullable
    public String component4() {
        return getEventManipulation();
    }

    @Override
    @Nullable
    public String component5() {
        return getEventObjectCatalog();
    }

    @Override
    @Nullable
    public String component6() {
        return getEventObjectSchema();
    }

    @Override
    @Nullable
    public String component7() {
        return getEventObjectTable();
    }

    @Override
    @Nullable
    public Integer component8() {
        return getActionOrder();
    }

    @Override
    @Nullable
    public String component9() {
        return getActionCondition();
    }

    @Override
    @Nullable
    public String component10() {
        return getActionStatement();
    }

    @Override
    @Nullable
    public String component11() {
        return getActionOrientation();
    }

    @Override
    @Nullable
    public String component12() {
        return getActionTiming();
    }

    @Override
    @Nullable
    public String component13() {
        return getActionReferenceOldTable();
    }

    @Override
    @Nullable
    public String component14() {
        return getActionReferenceNewTable();
    }

    @Override
    @Nullable
    public String component15() {
        return getActionReferenceOldRow();
    }

    @Override
    @Nullable
    public String component16() {
        return getActionReferenceNewRow();
    }

    @Override
    @Nullable
    public OffsetDateTime component17() {
        return getCreated();
    }

    @Override
    @Nullable
    public String value1() {
        return getTriggerCatalog();
    }

    @Override
    @Nullable
    public String value2() {
        return getTriggerSchema();
    }

    @Override
    @Nullable
    public String value3() {
        return getTriggerName();
    }

    @Override
    @Nullable
    public String value4() {
        return getEventManipulation();
    }

    @Override
    @Nullable
    public String value5() {
        return getEventObjectCatalog();
    }

    @Override
    @Nullable
    public String value6() {
        return getEventObjectSchema();
    }

    @Override
    @Nullable
    public String value7() {
        return getEventObjectTable();
    }

    @Override
    @Nullable
    public Integer value8() {
        return getActionOrder();
    }

    @Override
    @Nullable
    public String value9() {
        return getActionCondition();
    }

    @Override
    @Nullable
    public String value10() {
        return getActionStatement();
    }

    @Override
    @Nullable
    public String value11() {
        return getActionOrientation();
    }

    @Override
    @Nullable
    public String value12() {
        return getActionTiming();
    }

    @Override
    @Nullable
    public String value13() {
        return getActionReferenceOldTable();
    }

    @Override
    @Nullable
    public String value14() {
        return getActionReferenceNewTable();
    }

    @Override
    @Nullable
    public String value15() {
        return getActionReferenceOldRow();
    }

    @Override
    @Nullable
    public String value16() {
        return getActionReferenceNewRow();
    }

    @Override
    @Nullable
    public OffsetDateTime value17() {
        return getCreated();
    }

    @Override
    @NotNull
    public TriggersRecord value1(@Nullable String value) {
        setTriggerCatalog(value);
        return this;
    }

    @Override
    @NotNull
    public TriggersRecord value2(@Nullable String value) {
        setTriggerSchema(value);
        return this;
    }

    @Override
    @NotNull
    public TriggersRecord value3(@Nullable String value) {
        setTriggerName(value);
        return this;
    }

    @Override
    @NotNull
    public TriggersRecord value4(@Nullable String value) {
        setEventManipulation(value);
        return this;
    }

    @Override
    @NotNull
    public TriggersRecord value5(@Nullable String value) {
        setEventObjectCatalog(value);
        return this;
    }

    @Override
    @NotNull
    public TriggersRecord value6(@Nullable String value) {
        setEventObjectSchema(value);
        return this;
    }

    @Override
    @NotNull
    public TriggersRecord value7(@Nullable String value) {
        setEventObjectTable(value);
        return this;
    }

    @Override
    @NotNull
    public TriggersRecord value8(@Nullable Integer value) {
        setActionOrder(value);
        return this;
    }

    @Override
    @NotNull
    public TriggersRecord value9(@Nullable String value) {
        setActionCondition(value);
        return this;
    }

    @Override
    @NotNull
    public TriggersRecord value10(@Nullable String value) {
        setActionStatement(value);
        return this;
    }

    @Override
    @NotNull
    public TriggersRecord value11(@Nullable String value) {
        setActionOrientation(value);
        return this;
    }

    @Override
    @NotNull
    public TriggersRecord value12(@Nullable String value) {
        setActionTiming(value);
        return this;
    }

    @Override
    @NotNull
    public TriggersRecord value13(@Nullable String value) {
        setActionReferenceOldTable(value);
        return this;
    }

    @Override
    @NotNull
    public TriggersRecord value14(@Nullable String value) {
        setActionReferenceNewTable(value);
        return this;
    }

    @Override
    @NotNull
    public TriggersRecord value15(@Nullable String value) {
        setActionReferenceOldRow(value);
        return this;
    }

    @Override
    @NotNull
    public TriggersRecord value16(@Nullable String value) {
        setActionReferenceNewRow(value);
        return this;
    }

    @Override
    @NotNull
    public TriggersRecord value17(@Nullable OffsetDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    @NotNull
    public TriggersRecord values(@Nullable String value1, @Nullable String value2, @Nullable String value3, @Nullable String value4, @Nullable String value5, @Nullable String value6, @Nullable String value7, @Nullable Integer value8, @Nullable String value9, @Nullable String value10, @Nullable String value11, @Nullable String value12, @Nullable String value13, @Nullable String value14, @Nullable String value15, @Nullable String value16, @Nullable OffsetDateTime value17) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TriggersRecord
     */
    public TriggersRecord() {
        super(Triggers.TRIGGERS);
    }

    /**
     * Create a detached, initialised TriggersRecord
     */
    @ConstructorProperties({ "triggerCatalog", "triggerSchema", "triggerName", "eventManipulation", "eventObjectCatalog", "eventObjectSchema", "eventObjectTable", "actionOrder", "actionCondition", "actionStatement", "actionOrientation", "actionTiming", "actionReferenceOldTable", "actionReferenceNewTable", "actionReferenceOldRow", "actionReferenceNewRow", "created" })
    public TriggersRecord(@Nullable String triggerCatalog, @Nullable String triggerSchema, @Nullable String triggerName, @Nullable String eventManipulation, @Nullable String eventObjectCatalog, @Nullable String eventObjectSchema, @Nullable String eventObjectTable, @Nullable Integer actionOrder, @Nullable String actionCondition, @Nullable String actionStatement, @Nullable String actionOrientation, @Nullable String actionTiming, @Nullable String actionReferenceOldTable, @Nullable String actionReferenceNewTable, @Nullable String actionReferenceOldRow, @Nullable String actionReferenceNewRow, @Nullable OffsetDateTime created) {
        super(Triggers.TRIGGERS);

        setTriggerCatalog(triggerCatalog);
        setTriggerSchema(triggerSchema);
        setTriggerName(triggerName);
        setEventManipulation(eventManipulation);
        setEventObjectCatalog(eventObjectCatalog);
        setEventObjectSchema(eventObjectSchema);
        setEventObjectTable(eventObjectTable);
        setActionOrder(actionOrder);
        setActionCondition(actionCondition);
        setActionStatement(actionStatement);
        setActionOrientation(actionOrientation);
        setActionTiming(actionTiming);
        setActionReferenceOldTable(actionReferenceOldTable);
        setActionReferenceNewTable(actionReferenceNewTable);
        setActionReferenceOldRow(actionReferenceOldRow);
        setActionReferenceNewRow(actionReferenceNewRow);
        setCreated(created);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised TriggersRecord
     */
    public TriggersRecord(edu.java.domain.jooq.information_schema.tables.pojos.Triggers value) {
        super(Triggers.TRIGGERS);

        if (value != null) {
            setTriggerCatalog(value.getTriggerCatalog());
            setTriggerSchema(value.getTriggerSchema());
            setTriggerName(value.getTriggerName());
            setEventManipulation(value.getEventManipulation());
            setEventObjectCatalog(value.getEventObjectCatalog());
            setEventObjectSchema(value.getEventObjectSchema());
            setEventObjectTable(value.getEventObjectTable());
            setActionOrder(value.getActionOrder());
            setActionCondition(value.getActionCondition());
            setActionStatement(value.getActionStatement());
            setActionOrientation(value.getActionOrientation());
            setActionTiming(value.getActionTiming());
            setActionReferenceOldTable(value.getActionReferenceOldTable());
            setActionReferenceNewTable(value.getActionReferenceNewTable());
            setActionReferenceOldRow(value.getActionReferenceOldRow());
            setActionReferenceNewRow(value.getActionReferenceNewRow());
            setCreated(value.getCreated());
            resetChangedOnNotNull();
        }
    }
}
