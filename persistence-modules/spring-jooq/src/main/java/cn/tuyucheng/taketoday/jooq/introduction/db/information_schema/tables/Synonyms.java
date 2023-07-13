/*
 * This file is generated by jOOQ.
 */
package cn.tuyucheng.taketoday.jooq.introduction.db.information_schema.tables;


import cn.tuyucheng.taketoday.jooq.introduction.db.information_schema.InformationSchema;
import cn.tuyucheng.taketoday.jooq.introduction.db.information_schema.tables.records.SynonymsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Synonyms extends TableImpl<SynonymsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.SYNONYMS</code>
     */
    public static final Synonyms SYNONYMS = new Synonyms();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SynonymsRecord> getRecordType() {
        return SynonymsRecord.class;
    }

    /**
     * The column <code>INFORMATION_SCHEMA.SYNONYMS.SYNONYM_CATALOG</code>.
     */
    public final TableField<SynonymsRecord, String> SYNONYM_CATALOG = createField(DSL.name("SYNONYM_CATALOG"), SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SYNONYMS.SYNONYM_SCHEMA</code>.
     */
    public final TableField<SynonymsRecord, String> SYNONYM_SCHEMA = createField(DSL.name("SYNONYM_SCHEMA"), SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SYNONYMS.SYNONYM_NAME</code>.
     */
    public final TableField<SynonymsRecord, String> SYNONYM_NAME = createField(DSL.name("SYNONYM_NAME"), SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SYNONYMS.SYNONYM_FOR</code>.
     */
    public final TableField<SynonymsRecord, String> SYNONYM_FOR = createField(DSL.name("SYNONYM_FOR"), SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SYNONYMS.SYNONYM_FOR_SCHEMA</code>.
     */
    public final TableField<SynonymsRecord, String> SYNONYM_FOR_SCHEMA = createField(DSL.name("SYNONYM_FOR_SCHEMA"), SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SYNONYMS.TYPE_NAME</code>.
     */
    public final TableField<SynonymsRecord, String> TYPE_NAME = createField(DSL.name("TYPE_NAME"), SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SYNONYMS.STATUS</code>.
     */
    public final TableField<SynonymsRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SYNONYMS.REMARKS</code>.
     */
    public final TableField<SynonymsRecord, String> REMARKS = createField(DSL.name("REMARKS"), SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SYNONYMS.ID</code>.
     */
    public final TableField<SynonymsRecord, Integer> ID = createField(DSL.name("ID"), SQLDataType.INTEGER, this, "");

    private Synonyms(Name alias, Table<SynonymsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Synonyms(Name alias, Table<SynonymsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.SYNONYMS</code> table reference
     */
    public Synonyms(String alias) {
        this(DSL.name(alias), SYNONYMS);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.SYNONYMS</code> table reference
     */
    public Synonyms(Name alias) {
        this(alias, SYNONYMS);
    }

    /**
     * Create a <code>INFORMATION_SCHEMA.SYNONYMS</code> table reference
     */
    public Synonyms() {
        this(DSL.name("SYNONYMS"), null);
    }

    public <O extends Record> Synonyms(Table<O> child, ForeignKey<O, SynonymsRecord> key) {
        super(child, key, SYNONYMS);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Synonyms as(String alias) {
        return new Synonyms(DSL.name(alias), this);
    }

    @Override
    public Synonyms as(Name alias) {
        return new Synonyms(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Synonyms rename(String name) {
        return new Synonyms(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Synonyms rename(Name name) {
        return new Synonyms(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<String, String, String, String, String, String, String, String, Integer> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
