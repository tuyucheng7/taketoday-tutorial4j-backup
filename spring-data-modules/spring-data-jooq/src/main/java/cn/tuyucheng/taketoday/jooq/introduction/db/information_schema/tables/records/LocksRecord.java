/*
 * This file is generated by jOOQ.
 */
package cn.tuyucheng.taketoday.jooq.introduction.db.information_schema.tables.records;


import cn.tuyucheng.taketoday.jooq.introduction.db.information_schema.tables.Locks;
import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class LocksRecord extends TableRecordImpl<LocksRecord> implements Record4<String, String, Integer, String> {

	private static final long serialVersionUID = 1L;

	/**
	 * Setter for <code>INFORMATION_SCHEMA.LOCKS.TABLE_SCHEMA</code>.
	 */
	public void setTableSchema(String value) {
		set(0, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.LOCKS.TABLE_SCHEMA</code>.
	 */
	public String getTableSchema() {
		return (String) get(0);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.LOCKS.TABLE_NAME</code>.
	 */
	public void setTableName(String value) {
		set(1, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.LOCKS.TABLE_NAME</code>.
	 */
	public String getTableName() {
		return (String) get(1);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.LOCKS.SESSION_ID</code>.
	 */
	public void setSessionId(Integer value) {
		set(2, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.LOCKS.SESSION_ID</code>.
	 */
	public Integer getSessionId() {
		return (Integer) get(2);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.LOCKS.LOCK_TYPE</code>.
	 */
	public void setLockType(String value) {
		set(3, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.LOCKS.LOCK_TYPE</code>.
	 */
	public String getLockType() {
		return (String) get(3);
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	@Override
	public Row4<String, String, Integer, String> fieldsRow() {
		return (Row4) super.fieldsRow();
	}

	@Override
	public Row4<String, String, Integer, String> valuesRow() {
		return (Row4) super.valuesRow();
	}

	@Override
	public Field<String> field1() {
		return Locks.LOCKS.TABLE_SCHEMA;
	}

	@Override
	public Field<String> field2() {
		return Locks.LOCKS.TABLE_NAME;
	}

	@Override
	public Field<Integer> field3() {
		return Locks.LOCKS.SESSION_ID;
	}

	@Override
	public Field<String> field4() {
		return Locks.LOCKS.LOCK_TYPE;
	}

	@Override
	public String component1() {
		return getTableSchema();
	}

	@Override
	public String component2() {
		return getTableName();
	}

	@Override
	public Integer component3() {
		return getSessionId();
	}

	@Override
	public String component4() {
		return getLockType();
	}

	@Override
	public String value1() {
		return getTableSchema();
	}

	@Override
	public String value2() {
		return getTableName();
	}

	@Override
	public Integer value3() {
		return getSessionId();
	}

	@Override
	public String value4() {
		return getLockType();
	}

	@Override
	public LocksRecord value1(String value) {
		setTableSchema(value);
		return this;
	}

	@Override
	public LocksRecord value2(String value) {
		setTableName(value);
		return this;
	}

	@Override
	public LocksRecord value3(Integer value) {
		setSessionId(value);
		return this;
	}

	@Override
	public LocksRecord value4(String value) {
		setLockType(value);
		return this;
	}

	@Override
	public LocksRecord values(String value1, String value2, Integer value3, String value4) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached LocksRecord
	 */
	public LocksRecord() {
		super(Locks.LOCKS);
	}

	/**
	 * Create a detached, initialised LocksRecord
	 */
	public LocksRecord(String tableSchema, String tableName, Integer sessionId, String lockType) {
		super(Locks.LOCKS);

		setTableSchema(tableSchema);
		setTableName(tableName);
		setSessionId(sessionId);
		setLockType(lockType);
	}
}
