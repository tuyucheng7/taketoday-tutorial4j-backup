/*
 * This file is generated by jOOQ.
 */
package cn.tuyucheng.taketoday.jooq.introduction.db.information_schema;


import cn.tuyucheng.taketoday.jooq.introduction.db.DefaultCatalog;
import cn.tuyucheng.taketoday.jooq.introduction.db.information_schema.tables.Catalogs;
import cn.tuyucheng.taketoday.jooq.introduction.db.information_schema.tables.Collations;
import cn.tuyucheng.taketoday.jooq.introduction.db.information_schema.tables.ColumnPrivileges;
import cn.tuyucheng.taketoday.jooq.introduction.db.information_schema.tables.Columns;
import cn.tuyucheng.taketoday.jooq.introduction.db.information_schema.tables.Constants;
import cn.tuyucheng.taketoday.jooq.introduction.db.information_schema.tables.Constraints;
import cn.tuyucheng.taketoday.jooq.introduction.db.information_schema.tables.CrossReferences;
import cn.tuyucheng.taketoday.jooq.introduction.db.information_schema.tables.Domains;
import cn.tuyucheng.taketoday.jooq.introduction.db.information_schema.tables.FunctionAliases;
import cn.tuyucheng.taketoday.jooq.introduction.db.information_schema.tables.FunctionColumns;
import cn.tuyucheng.taketoday.jooq.introduction.db.information_schema.tables.Help;
import cn.tuyucheng.taketoday.jooq.introduction.db.information_schema.tables.InDoubt;
import cn.tuyucheng.taketoday.jooq.introduction.db.information_schema.tables.Indexes;
import cn.tuyucheng.taketoday.jooq.introduction.db.information_schema.tables.KeyColumnUsage;
import cn.tuyucheng.taketoday.jooq.introduction.db.information_schema.tables.Locks;
import cn.tuyucheng.taketoday.jooq.introduction.db.information_schema.tables.QueryStatistics;
import cn.tuyucheng.taketoday.jooq.introduction.db.information_schema.tables.ReferentialConstraints;
import cn.tuyucheng.taketoday.jooq.introduction.db.information_schema.tables.Rights;
import cn.tuyucheng.taketoday.jooq.introduction.db.information_schema.tables.Roles;
import cn.tuyucheng.taketoday.jooq.introduction.db.information_schema.tables.Schemata;
import cn.tuyucheng.taketoday.jooq.introduction.db.information_schema.tables.Sequences;
import cn.tuyucheng.taketoday.jooq.introduction.db.information_schema.tables.SessionState;
import cn.tuyucheng.taketoday.jooq.introduction.db.information_schema.tables.Sessions;
import cn.tuyucheng.taketoday.jooq.introduction.db.information_schema.tables.Settings;
import cn.tuyucheng.taketoday.jooq.introduction.db.information_schema.tables.Synonyms;
import cn.tuyucheng.taketoday.jooq.introduction.db.information_schema.tables.TableConstraints;
import cn.tuyucheng.taketoday.jooq.introduction.db.information_schema.tables.TablePrivileges;
import cn.tuyucheng.taketoday.jooq.introduction.db.information_schema.tables.TableTypes;
import cn.tuyucheng.taketoday.jooq.introduction.db.information_schema.tables.Tables;
import cn.tuyucheng.taketoday.jooq.introduction.db.information_schema.tables.Triggers;
import cn.tuyucheng.taketoday.jooq.introduction.db.information_schema.tables.TypeInfo;
import cn.tuyucheng.taketoday.jooq.introduction.db.information_schema.tables.Users;
import cn.tuyucheng.taketoday.jooq.introduction.db.information_schema.tables.Views;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InformationSchema extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA</code>
     */
    public static final InformationSchema INFORMATION_SCHEMA = new InformationSchema();

    /**
     * The table <code>INFORMATION_SCHEMA.CATALOGS</code>.
     */
    public final Catalogs CATALOGS = Catalogs.CATALOGS;

    /**
     * The table <code>INFORMATION_SCHEMA.COLLATIONS</code>.
     */
    public final Collations COLLATIONS = Collations.COLLATIONS;

    /**
     * The table <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES</code>.
     */
    public final ColumnPrivileges COLUMN_PRIVILEGES = ColumnPrivileges.COLUMN_PRIVILEGES;

    /**
     * The table <code>INFORMATION_SCHEMA.COLUMNS</code>.
     */
    public final Columns COLUMNS = Columns.COLUMNS;

    /**
     * The table <code>INFORMATION_SCHEMA.CONSTANTS</code>.
     */
    public final Constants CONSTANTS = Constants.CONSTANTS;

    /**
     * The table <code>INFORMATION_SCHEMA.CONSTRAINTS</code>.
     */
    public final Constraints CONSTRAINTS = Constraints.CONSTRAINTS;

    /**
     * The table <code>INFORMATION_SCHEMA.CROSS_REFERENCES</code>.
     */
    public final CrossReferences CROSS_REFERENCES = CrossReferences.CROSS_REFERENCES;

    /**
     * The table <code>INFORMATION_SCHEMA.DOMAINS</code>.
     */
    public final Domains DOMAINS = Domains.DOMAINS;

    /**
     * The table <code>INFORMATION_SCHEMA.FUNCTION_ALIASES</code>.
     */
    public final FunctionAliases FUNCTION_ALIASES = FunctionAliases.FUNCTION_ALIASES;

    /**
     * The table <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS</code>.
     */
    public final FunctionColumns FUNCTION_COLUMNS = FunctionColumns.FUNCTION_COLUMNS;

    /**
     * The table <code>INFORMATION_SCHEMA.HELP</code>.
     */
    public final Help HELP = Help.HELP;

    /**
     * The table <code>INFORMATION_SCHEMA.IN_DOUBT</code>.
     */
    public final InDoubt IN_DOUBT = InDoubt.IN_DOUBT;

    /**
     * The table <code>INFORMATION_SCHEMA.INDEXES</code>.
     */
    public final Indexes INDEXES = Indexes.INDEXES;

    /**
     * The table <code>INFORMATION_SCHEMA.KEY_COLUMN_USAGE</code>.
     */
    public final KeyColumnUsage KEY_COLUMN_USAGE = KeyColumnUsage.KEY_COLUMN_USAGE;

    /**
     * The table <code>INFORMATION_SCHEMA.LOCKS</code>.
     */
    public final Locks LOCKS = Locks.LOCKS;

    /**
     * The table <code>INFORMATION_SCHEMA.QUERY_STATISTICS</code>.
     */
    public final QueryStatistics QUERY_STATISTICS = QueryStatistics.QUERY_STATISTICS;

    /**
     * The table <code>INFORMATION_SCHEMA.REFERENTIAL_CONSTRAINTS</code>.
     */
    public final ReferentialConstraints REFERENTIAL_CONSTRAINTS = ReferentialConstraints.REFERENTIAL_CONSTRAINTS;

    /**
     * The table <code>INFORMATION_SCHEMA.RIGHTS</code>.
     */
    public final Rights RIGHTS = Rights.RIGHTS;

    /**
     * The table <code>INFORMATION_SCHEMA.ROLES</code>.
     */
    public final Roles ROLES = Roles.ROLES;

    /**
     * The table <code>INFORMATION_SCHEMA.SCHEMATA</code>.
     */
    public final Schemata SCHEMATA = Schemata.SCHEMATA;

    /**
     * The table <code>INFORMATION_SCHEMA.SEQUENCES</code>.
     */
    public final Sequences SEQUENCES = Sequences.SEQUENCES;

    /**
     * The table <code>INFORMATION_SCHEMA.SESSION_STATE</code>.
     */
    public final SessionState SESSION_STATE = SessionState.SESSION_STATE;

    /**
     * The table <code>INFORMATION_SCHEMA.SESSIONS</code>.
     */
    public final Sessions SESSIONS = Sessions.SESSIONS;

    /**
     * The table <code>INFORMATION_SCHEMA.SETTINGS</code>.
     */
    public final Settings SETTINGS = Settings.SETTINGS;

    /**
     * The table <code>INFORMATION_SCHEMA.SYNONYMS</code>.
     */
    public final Synonyms SYNONYMS = Synonyms.SYNONYMS;

    /**
     * The table <code>INFORMATION_SCHEMA.TABLE_CONSTRAINTS</code>.
     */
    public final TableConstraints TABLE_CONSTRAINTS = TableConstraints.TABLE_CONSTRAINTS;

    /**
     * The table <code>INFORMATION_SCHEMA.TABLE_PRIVILEGES</code>.
     */
    public final TablePrivileges TABLE_PRIVILEGES = TablePrivileges.TABLE_PRIVILEGES;

    /**
     * The table <code>INFORMATION_SCHEMA.TABLE_TYPES</code>.
     */
    public final TableTypes TABLE_TYPES = TableTypes.TABLE_TYPES;

    /**
     * The table <code>INFORMATION_SCHEMA.TABLES</code>.
     */
    public final Tables TABLES = Tables.TABLES;

    /**
     * The table <code>INFORMATION_SCHEMA.TRIGGERS</code>.
     */
    public final Triggers TRIGGERS = Triggers.TRIGGERS;

    /**
     * The table <code>INFORMATION_SCHEMA.TYPE_INFO</code>.
     */
    public final TypeInfo TYPE_INFO = TypeInfo.TYPE_INFO;

    /**
     * The table <code>INFORMATION_SCHEMA.USERS</code>.
     */
    public final Users USERS = Users.USERS;

    /**
     * The table <code>INFORMATION_SCHEMA.VIEWS</code>.
     */
    public final Views VIEWS = Views.VIEWS;

    /**
     * No further instances allowed
     */
    private InformationSchema() {
        super("INFORMATION_SCHEMA", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            Catalogs.CATALOGS,
            Collations.COLLATIONS,
            ColumnPrivileges.COLUMN_PRIVILEGES,
            Columns.COLUMNS,
            Constants.CONSTANTS,
            Constraints.CONSTRAINTS,
            CrossReferences.CROSS_REFERENCES,
            Domains.DOMAINS,
            FunctionAliases.FUNCTION_ALIASES,
            FunctionColumns.FUNCTION_COLUMNS,
            Help.HELP,
            InDoubt.IN_DOUBT,
            Indexes.INDEXES,
            KeyColumnUsage.KEY_COLUMN_USAGE,
            Locks.LOCKS,
            QueryStatistics.QUERY_STATISTICS,
            ReferentialConstraints.REFERENTIAL_CONSTRAINTS,
            Rights.RIGHTS,
            Roles.ROLES,
            Schemata.SCHEMATA,
            Sequences.SEQUENCES,
            SessionState.SESSION_STATE,
            Sessions.SESSIONS,
            Settings.SETTINGS,
            Synonyms.SYNONYMS,
            TableConstraints.TABLE_CONSTRAINTS,
            TablePrivileges.TABLE_PRIVILEGES,
            TableTypes.TABLE_TYPES,
            Tables.TABLES,
            Triggers.TRIGGERS,
            TypeInfo.TYPE_INFO,
            Users.USERS,
            Views.VIEWS);
    }
}
