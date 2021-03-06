/* 
 This source code (the "Generated Software") is generated by the OutSystems Platform 
 and is licensed by OutSystems (http://www.outsystems.com) to You solely for testing and evaluation 
 purposes, unless You and OutSystems have executed a specific agreement covering the use terms and 
 conditions of the Generated Software, in which case such agreement shall apply. 
*/

package outsystems.javaservertests.databaseprovider.introspectionservice;

import java.text.*;
import java.util.*;
import linqbridge.linq.*;
import org.junit.*;
import outsystems.hubedition.extensibility.data.*;
import outsystems.hubedition.extensibility.data.databaseobjects.*;
import outsystems.hubedition.extensibility.data.introspectionservice.*;
import outsystems.hubedition.extensibility.data.platform.databaseobjects.*;
import outsystems.hubedition.util.*;
import outsystems.hubedition.util.delegates.*;
import outsystems.runtimecommon.*;
import outsystems.servertests.databaseprovider.framework.*;
import java.math.BigDecimal;
import linqbridge.linq.LinqMethods;
import outsystems.hubedition.extensibility.data.configurationservice.IRuntimeDatabaseConfiguration;
import outsystems.hubedition.extensibility.data.databaseobjects.IDatabaseInfo;
import outsystems.hubedition.extensibility.data.databaseobjects.IDatabaseObjectFactory;
import outsystems.hubedition.extensibility.data.databaseobjects.IDataTypeInfo;
import outsystems.hubedition.extensibility.data.databaseobjects.ITableSourceColumnInfo;
import outsystems.hubedition.extensibility.data.databaseobjects.ITableSourceForeignKeyInfo;
import outsystems.hubedition.extensibility.data.databaseobjects.ITableSourceInfo;
import outsystems.hubedition.extensibility.data.DBDataType;
import outsystems.hubedition.extensibility.data.DBDataTypeExtensions;
import outsystems.hubedition.extensibility.data.dmlservice.IDMLIdentifiers;
import outsystems.hubedition.extensibility.data.dmlservice.IDMLService;
import outsystems.hubedition.extensibility.data.IDatabaseServices;
import outsystems.hubedition.extensibility.data.introspectionservice.IIntrospectionService;
import outsystems.hubedition.extensibility.data.introspectionservice.IntrospectionServiceExtensions;
import outsystems.hubedition.extensibility.data.platform.databaseobjects.IPlatformDataTypeInfo;
import outsystems.hubedition.extensibility.data.platform.databaseobjects.IPlatformTableSourceColumnInfo;
import outsystems.junit.framework.DashboardTestFixture;
import outsystems.junit.framework.IterativeTestCase;
import outsystems.junit.framework.JUnitTestAdapter;
import outsystems.junit.framework.TestDetails;
import outsystems.runtimecommon.CollectionsExtensions;
import outsystems.runtimecommon.Constants;
import outsystems.runtimecommon.StringUtilities;
import outsystems.servertests.databaseprovider.framework.BaseDatabaseProviderTest;
import outsystems.servertests.databaseprovider.framework.DashboardTest;
import outsystems.servertests.databaseprovider.framework.DatabaseProviderTest;
import outsystems.servertests.databaseprovider.framework.DatabaseProviderTestCase;
import outsystems.testscommon.AssertUtils;


@org.junit.runner.RunWith(outsystems.junit.logic.DashboardTestRunner.class)
@DashboardTestFixture(testKind=DashboardTest.DashboardTestKind)
public class IntrospectionServiceTests extends DatabaseProviderTest<TestConfiguration> {
    public static final TypeInformation<IntrospectionServiceTests> TypeInfo = TypeInformation.get(IntrospectionServiceTests.class);
    
    
    public static class ExpectedTableSource implements ITableSourceInfo {
        private IDatabaseInfo _database;
        private String _name;
        private String _qualifiedName;
        public static final TypeInformation<ExpectedTableSource> TypeInfo = TypeInformation.get(ExpectedTableSource.class);
        
        public ExpectedTableSource(String name){
            setDatabase( null );
            setName( name );
            setQualifiedName( null );
        }
        
        
        public final IDatabaseInfo getDatabase()
        {
            return _database;
        }
        
        
        private final void setDatabase(IDatabaseInfo value)
        {
            _database = value;
        }
        
        
        public final String getName()
        {
            return _name;
        }
        
        
        private final void setName(String value)
        {
            _name = value;
        }
        
        
        public final String getDisplayName()
        {
            return getName();
        }
        
        
        public final String getQualifiedName()
        {
            return _qualifiedName;
        }
        
        
        private final void setQualifiedName(String value)
        {
            _qualifiedName = value;
        }
        
        
        public final boolean equalsObj(ITableSourceInfo other) {
            return StringUtilities.equalsIgnoreCase(getName(), other.getName());
        }
        
        
        public boolean equals(Object obj) {
            ExpectedTableSource other = ClassUtils.safeCast(obj, IntrospectionServiceTests.ExpectedTableSource.class);
            return (other != null) && equalsObj(other);
        }
        
        
        public int hashCode() {
            return getName().hashCode();
        }
    }
    
    
    public static class ExpectedColumnInfo implements IPlatformTableSourceColumnInfo {
        private ITableSourceInfo _tableSource;
        private String _name;
        private IPlatformDataTypeInfo _dataType;
        private boolean _isMandatory;
        private boolean _isPrimaryKey;
        private boolean _isAutoGenerated;
        private Object _defaultValue;
        public static final TypeInformation<ExpectedColumnInfo> TypeInfo = TypeInformation.get(ExpectedColumnInfo.class);
        
        public ExpectedColumnInfo(String name, IPlatformDataTypeInfo dataType, boolean isMandatory, boolean isPrimaryKey, boolean isAutoGenerated){
            this(name, dataType, isMandatory, isPrimaryKey, isAutoGenerated, null);
        }
        
        public ExpectedColumnInfo(String name, IPlatformDataTypeInfo dataType, boolean isMandatory, boolean isPrimaryKey, boolean isAutoGenerated, Object defaultValue){
            setTableSource( null );
            setName( name );
            setDataType$IPlatformTableSourceColumnInfo( dataType );
            setIsMandatory( isMandatory );
            setIsPrimaryKey( isPrimaryKey );
            setIsAutoGenerated( isAutoGenerated );
            setDefaultValue( defaultValue );
        }
        
        
        public final ITableSourceInfo getTableSource()
        {
            return _tableSource;
        }
        
        
        public final void setTableSource(ITableSourceInfo value)
        {
            _tableSource = value;
        }
        
        
        public final String getName()
        {
            return _name;
        }
        
        
        private final void setName(String value)
        {
            _name = value;
        }
        
        
        public final IPlatformDataTypeInfo getDataType()
        {
            return _dataType;
        }
        
        
        public final void setDataType$IPlatformTableSourceColumnInfo(IPlatformDataTypeInfo value)
        {
            _dataType = value;
        }
        
        
        public final boolean isMandatory()
        {
            return _isMandatory;
        }
        
        
        public final void setIsMandatory(boolean value)
        {
            _isMandatory = value;
        }
        
        
        public final boolean isPrimaryKey()
        {
            return _isPrimaryKey;
        }
        
        
        public final void setIsPrimaryKey(boolean value)
        {
            _isPrimaryKey = value;
        }
        
        
        public final boolean isAutoGenerated()
        {
            return _isAutoGenerated;
        }
        
        
        public final void setIsAutoGenerated(boolean value)
        {
            _isAutoGenerated = value;
        }
        
        
        public final Object getDefaultValue()
        {
            return _defaultValue;
        }
        
        
        public final void setDefaultValue(Object value)
        {
            _defaultValue = value;
        }
        
        
    }
    
    
    public static class ExpectedDataTypeInfo implements IPlatformDataTypeInfo {
        private DBDataType _type;
        private String _sqlDataType;
        private int _length;
        private int _decimals;
        public static final TypeInformation<ExpectedDataTypeInfo> TypeInfo = TypeInformation.get(ExpectedDataTypeInfo.class);
        
        public ExpectedDataTypeInfo(DBDataType type){
            this(type, 0, 0);
        }
        
        public ExpectedDataTypeInfo(DBDataType type, int length){
            this(type, length, 0);
        }
        
        public ExpectedDataTypeInfo(DBDataType type, int length, int decimals){
            setType( type );
            setSqlDataType( "" );
            setLength( length );
            setDecimals( decimals );
        }
        
        
        public final DBDataType getType()
        {
            return _type;
        }
        
        
        public final void setType(DBDataType value)
        {
            _type = value;
        }
        
        
        public final String getSqlDataType()
        {
            return _sqlDataType;
        }
        
        
        private final void setSqlDataType(String value)
        {
            _sqlDataType = value;
        }
        
        
        public final int getLength()
        {
            return _length;
        }
        
        
        public final void setLength(int value)
        {
            _length = value;
        }
        
        
        public final int getDecimals()
        {
            return _decimals;
        }
        
        
        private final void setDecimals(int value)
        {
            _decimals = value;
        }
        
        
        public final boolean isEquivalent(IDataTypeInfo other) {
            return StringUtils.equals(getSqlDataType(), other.getSqlDataType());
        }
    }
    
    
    public static class ExpectedForeignKeyInfo implements ITableSourceForeignKeyInfo {
        private ITableSourceInfo _tableSource;
        private String _name;
        private String _columnName;
        private ITableSourceInfo _referencedTableSource;
        private String _referencedColumnName;
        private boolean _isCascadeDelete;
        public static final TypeInformation<ExpectedForeignKeyInfo> TypeInfo = TypeInformation.get(ExpectedForeignKeyInfo.class);
        
        public ExpectedForeignKeyInfo(ITableSourceInfo tableSource, String name, String columnName, ITableSourceInfo referencedTableSource, String referencedColumnName){
            setTableSource( tableSource );
            setName( name );
            setColumnName( columnName );
            setReferencedTableSource( referencedTableSource );
            setReferencedColumnName( referencedColumnName );
        }
        
        
        public final ITableSourceInfo getTableSource()
        {
            return _tableSource;
        }
        
        
        private final void setTableSource(ITableSourceInfo value)
        {
            _tableSource = value;
        }
        
        
        public final String getName()
        {
            return _name;
        }
        
        
        private final void setName(String value)
        {
            _name = value;
        }
        
        
        public final String getColumnName()
        {
            return _columnName;
        }
        
        
        private final void setColumnName(String value)
        {
            _columnName = value;
        }
        
        
        public final ITableSourceInfo getReferencedTableSource()
        {
            return _referencedTableSource;
        }
        
        
        private final void setReferencedTableSource(ITableSourceInfo value)
        {
            _referencedTableSource = value;
        }
        
        
        public final String getReferencedColumnName()
        {
            return _referencedColumnName;
        }
        
        
        private final void setReferencedColumnName(String value)
        {
            _referencedColumnName = value;
        }
        
        
        public final boolean isCascadeDelete()
        {
            return _isCascadeDelete;
        }
        
        
        private final void setIsCascadeDelete(boolean value)
        {
            _isCascadeDelete = value;
        }
    }
    
    private static final int UNCHECKED_LENGTH = -1;
    private static final int UNCHECKED_DECIMALS = -1;
    
    private static final ExpectedTableSource tableIntrospectionTestTable = new ExpectedTableSource("IntrospecTbl" + getMachineName());
    private static final ExpectedTableSource viewIntrospectionViewOverTestTable = new ExpectedTableSource("IntrospecView" + getMachineName());
    private static final ExpectedTableSource tableSelect = new ExpectedTableSource("SELECT" + getMachineName());
    private static final ExpectedTableSource viewFrom = new ExpectedTableSource("FROM" + getMachineName());
    private static final ExpectedTableSource tableForeignKeysTable = new ExpectedTableSource("ForeignKeysTable" + getMachineName());
    
    // We are deliberately not testing the DBDataType.DATE and DBDataType.TIME types because there isn't much support for this concepts (at least separated from DATETIME) in different database vendors
    
    private static final ExpectedColumnInfo colId = new ExpectedColumnInfo("ID", new ExpectedDataTypeInfo(DBDataType.INTEGER), true, true, true);
    private static final ExpectedColumnInfo colDbText = new ExpectedColumnInfo("DBTEXT", new ExpectedDataTypeInfo(DBDataType.TEXT, 255), true, false, false);
    private static final ExpectedColumnInfo colDbInteger = new ExpectedColumnInfo("DBINTEGER", new ExpectedDataTypeInfo(DBDataType.INTEGER), false, false, false);
    private static final ExpectedColumnInfo colDbLongInteger = new ExpectedColumnInfo("DBLONGINTEGER", new ExpectedDataTypeInfo(DBDataType.LONGINTEGER), false, false, false);
    private static final ExpectedColumnInfo colDbDecimal = new ExpectedColumnInfo("DBDECIMAL", new ExpectedDataTypeInfo(DBDataType.DECIMAL, 28, Constants.DecimalDecimals), false, false, false);
    private static final ExpectedColumnInfo colDbBoolean = new ExpectedColumnInfo("DBBOOLEAN", new ExpectedDataTypeInfo(DBDataType.BOOLEAN), false, false, false);
    private static final ExpectedColumnInfo colDbDateTime = new ExpectedColumnInfo("DBDATETIME", new ExpectedDataTypeInfo(DBDataType.DATE_TIME), false, false, false);
    private static final ExpectedColumnInfo colDbBinaryData = new ExpectedColumnInfo("DBBINARYDATA", new ExpectedDataTypeInfo(DBDataType.BINARY_DATA), false, false, false);
    
    private static final ExpectedColumnInfo[] expectedColumns = { colId, colDbText, colDbInteger, colDbLongInteger, colDbDecimal, colDbBoolean, colDbDateTime, colDbBinaryData };
    
    private static final ExpectedForeignKeyInfo fkInstrospectionId = new ExpectedForeignKeyInfo(tableForeignKeysTable,
    "FK_FKT_IspecTbl" + getMachineName(), "INTROSPECTIONID", tableIntrospectionTestTable, "ID");
    private static final ExpectedForeignKeyInfo fkSelectId = new ExpectedForeignKeyInfo(tableForeignKeysTable,
    "FK_FKT_Select" + getMachineName(), "SELECTID", tableSelect, "TEXTID");
    
    private static final ExpectedForeignKeyInfo[] expectedForeignKeys = { fkInstrospectionId, fkSelectId };
    
    private String[] bootstrappedTableName = { tableIntrospectionTestTable.getName(), viewIntrospectionViewOverTestTable.getName(), tableSelect.getName(), viewFrom.getName(), tableForeignKeysTable.getName() };
    
    public static String getDatabaseIdentifier(IDatabaseServices services) {
        return services.getDMLService().getIdentifiers().escapeIdentifier(services.getDatabaseConfiguration().getDatabaseIdentifier());
    }
    
    @IterativeTestCase(iteratorType=ServerOnlyTestConfiguration.class)
    @TestDetails(Description="Validates that current database is returned in the list of databases, by looking for the database name associated with the current IDatabaseConfiguration.", TestIssue="622296", Feature="Database Abstraction Layer", CreatedBy="rls")
    public final void testListDatabasesFindCurrentDatabase(DatabaseProviderTestCase tc) throws IntrospectionServiceException, InvalidDatabaseObjectIdentifierException, java.sql.SQLException {
        IDatabaseServices databaseServices = tc.getServices();
        Iterable<IDatabaseInfo> databases = databaseServices.getIntrospectionService().listDatabases();
        final RefParmHolder<IDatabaseInfo> currentDBInfo = new RefParmHolder<IDatabaseInfo>(databaseServices.getObjectFactory().createDatabaseInfo(getDatabaseIdentifier(databaseServices)));
        Assert.assertNotNull("Current database (" + currentDBInfo.getVal().getIdentifier() + ") not found in the list.", LinqMethods.firstOrDefault(TypeInformation.get(IDatabaseInfo.class), databases, (IDatabaseInfo db) -> {
    return db.equalsObj(currentDBInfo.getVal());
}));
    }
    
    
    @IterativeTestCase(iteratorType=ServerOnlyTestConfiguration.class)
    @TestDetails(Description="Validates that all the table sources created by the bootstrap script appear in the list.", TestIssue="622296", Feature="Database Abstraction Layer", CreatedBy="rls")
    public final void testListTableSourcesFindAllExpectedTableSources(DatabaseProviderTestCase tc) throws IntrospectionServiceException, InvalidDatabaseObjectIdentifierException, java.sql.SQLException {
        IDatabaseServices databaseServices = tc.getServices();
        IDatabaseInfo db = databaseServices.getObjectFactory().createDatabaseInfo(getDatabaseIdentifier(databaseServices));
        Iterable<ITableSourceInfo> tableSources = IntrospectionServiceExtensions.listTableSourcesWithoutFilter(databaseServices.getIntrospectionService(), db);
        for (String tableSourceNameIter : bootstrappedTableName) {
            final RefParmHolder<String> tableSourceName = new RefParmHolder<String>(tableSourceNameIter);
            Assert.assertNotNull("Table source named '" + tableSourceName.getVal() + "' not found in the database", LinqMethods.firstOrDefault(TypeInformation.get(ITableSourceInfo.class), tableSources, (ITableSourceInfo ts) -> {
    return StringCompareUtils.compare(ts.getName(),tableSourceName.getVal(),StringComparison.InvariantCultureIgnoreCase) == 0;
}));
        }
    }
    
    
    @IterativeTestCase(iteratorType=ServerOnlyTestConfiguration.class)
    @TestDetails(Description="Validates that all the ListTableSources can receive a filter.", TestIssue="629873", Feature="Database Abstraction Layer", CreatedBy="rfe")
    public final void testListTableSourcesFilter(DatabaseProviderTestCase tc) throws IntrospectionServiceException, InvalidDatabaseObjectIdentifierException, java.sql.SQLException {
        IDatabaseServices databaseServices = tc.getServices();
        IDatabaseInfo db = databaseServices.getObjectFactory().createDatabaseInfo(getDatabaseIdentifier(databaseServices));
        final RefParmHolder<String> tableToFilter = new RefParmHolder<String>(tableIntrospectionTestTable.getName());
        // We'll ignore the tableIntrospectionTestTable
        
        Iterable<ITableSourceInfo> tableSources = databaseServices.getIntrospectionService().listTableSources(db,
            (String tableName) -> {
                return StringCompareUtils.compare(tableName,tableToFilter.getVal(),StringComparison.InvariantCultureIgnoreCase) == 0;
            });
        
        Assert.assertFalse("Table source named '" + tableToFilter.getVal() + "' was not filtered during the ListTableSources", LinqMethods.any(tableSources, (ITableSourceInfo ts) -> {
    return StringCompareUtils.compare(ts.getName(),tableToFilter.getVal(),StringComparison.InvariantCultureIgnoreCase) == 0;
}));
        
        java.util.Iterator<String> tableSourceNameIter = (LinqMethods.except(Arrays.asList(bootstrappedTableName), CollectionsExtensions.toEnumerable(TypeInformation.String, tableToFilter.getVal()))).iterator();
        try {
            while (tableSourceNameIter.hasNext()) {
                final RefParmHolder<String> tableSourceName = new RefParmHolder<String>(tableSourceNameIter.next());
                Assert.assertTrue("Table source named '" + tableSourceName.getVal() + "' not found in the database", LinqMethods.any(tableSources, (ITableSourceInfo ts) -> {
    return StringCompareUtils.compare(ts.getName(),tableSourceName.getVal(),StringComparison.InvariantCultureIgnoreCase) == 0;
}));
            }
        } finally {
            CollectionUtils.dispose(tableSourceNameIter);
        }
    }
    
    
    @IterativeTestCase(iteratorType=ServerOnlyTestConfiguration.class)
    @TestDetails(Description="Validates that it is possible to query all the table sources by using their qualified name. This test depends on the IExecutionService.ExecuteScalar().", TestIssue="622296", Feature="Database Abstraction Layer", CreatedBy="rls")
    public final void testListTableSourcesValidateAllQualifiedNames(DatabaseProviderTestCase tc) throws Exception {
        IDatabaseServices databaseServices = tc.getServices();
        IDatabaseInfo db = databaseServices.getObjectFactory().createDatabaseInfo(getDatabaseIdentifier(databaseServices));
        Iterable<ITableSourceInfo> tableSources = IntrospectionServiceExtensions.listTableSourcesWithoutFilter(databaseServices.getIntrospectionService(), db);
        java.util.Iterator<ITableSourceInfo> tableSourceIter = (tableSources).iterator();
        try {
            ITableSourceInfo tableSource;
            while (tableSourceIter.hasNext()) {
                tableSource = tableSourceIter.next();
                if (tableSource.getQualifiedName().toLowerCase(java.util.Locale.ROOT).endsWith(getMachineName().toLowerCase(java.util.Locale.ROOT)))
                {
                    SQLExecutor sqlExecutor = new SQLExecutor(databaseServices);
                    String sql = "SELECT COUNT(*) FROM " + tableSource.getQualifiedName();
                    Scalar result = sqlExecutor.executeScalar(sql);
                    Assert.assertTrue("Error counting the rows of table source '" + tableSource.getName() + "' using the SQL: " + sql, result.<Integer>value(TypeInformation.Integer) >= 0);
                }
            }
        } finally {
            CollectionUtils.dispose(tableSourceIter);
        }
    }
    
    
    @IterativeTestCase(iteratorType=ServerOnlyTestConfiguration.class)
    @TestDetails(Description="Validates that from all the IDatabaseInfo.Identifierdentifier of the current introspection service it is possible to obtain an instance of a IDatabaseInfoInfo that is equivalent to the one where the qualified name was retrieved from by using the Equals() method.", TestIssue="622296", Feature="Database Abstraction Layer", CreatedBy="rls")
    public final void testCreateDatabaseInfoFromQualifiedName(DatabaseProviderTestCase tc) throws IntrospectionServiceException, InvalidDatabaseObjectIdentifierException, java.sql.SQLException {
        IDatabaseServices databaseServices = tc.getServices();
        Iterable<IDatabaseInfo> databases = databaseServices.getIntrospectionService().listDatabases();
        java.util.Iterator<IDatabaseInfo> databaseIter = (databases).iterator();
        try {
            IDatabaseInfo database;
            while (databaseIter.hasNext()) {
                database = databaseIter.next();
                IDatabaseInfo inferredDatabase = databaseServices.getObjectFactory().createDatabaseInfo(database.getIdentifier());
                boolean equals = database.equalsObj(inferredDatabase);
                Assert.assertTrue("The inferred IDatabaseInfo is not equal to the original IDatabaseInfo for database with qualifiedName: " + database.getIdentifier(), equals);
            }
        } finally {
            CollectionUtils.dispose(databaseIter);
        }
    }
    
    
    @IterativeTestCase(iteratorType=ServerOnlyTestConfiguration.class)
    @TestDetails(Description="Validates that from all ITableSourceInfo.QualifiedName of the current database it is possible to obtain an instance of a ITableSourceInfo that is equivalent to the one where the qualified name was retrieved from by using the Equals() method.", TestIssue="622296", Feature="Database Abstraction Layer", CreatedBy="rls")
    public final void testCreateTableSourceInfoFromQualifiedName(DatabaseProviderTestCase tc) throws IntrospectionServiceException, InvalidDatabaseObjectIdentifierException, java.sql.SQLException {
        IDatabaseServices databaseServices = tc.getServices();
        IDatabaseInfo db = databaseServices.getObjectFactory().createDatabaseInfo(getDatabaseIdentifier(databaseServices));
        Iterable<ITableSourceInfo> tableSources = IntrospectionServiceExtensions.listTableSourcesWithoutFilter(databaseServices.getIntrospectionService(), db);
        java.util.Iterator<ITableSourceInfo> tableSourceIter = (tableSources).iterator();
        try {
            ITableSourceInfo tableSource;
            while (tableSourceIter.hasNext()) {
                tableSource = tableSourceIter.next();
                if (tableSource.getQualifiedName().toLowerCase(java.util.Locale.ROOT).endsWith(getMachineName().toLowerCase(java.util.Locale.ROOT)))
                {
                    ITableSourceInfo inferredTableSource = databaseServices.getObjectFactory().createTableSourceInfo(tableSource.getQualifiedName());
                    boolean equals = tableSource.equalsObj(inferredTableSource);
                    Assert.assertTrue("The inferred ITableSourceInfo is not equal to the original ITableSourceInfo for table source with qualified name: " + tableSource.getQualifiedName(), equals);
                }
            }
        } finally {
            CollectionUtils.dispose(tableSourceIter);
        }
    }
    
    
    @IterativeTestCase(iteratorType=ServerOnlyTestConfiguration.class)
    @TestDetails(Description="Validates that the list of columns matches the ones defined in the bootstrap script for a given table and validates all the column contents.", TestIssue="622296", Feature="Database Abstraction Layer", CreatedBy="rls")
    public final void testGetTableSourceDetailsWithColumnsForTable(DatabaseProviderTestCase tc) throws IntrospectionServiceException, InvalidDatabaseObjectIdentifierException, java.sql.SQLException {
        IDatabaseServices databaseServices = tc.getServices();
        validateTableSourceColumns(databaseServices, tableIntrospectionTestTable.getName(), false);
    }
    
    
    @IterativeTestCase(iteratorType=ServerOnlyTestConfiguration.class)
    @TestDetails(Description="Validates that the list of columns matches the ones defined in the bootstrap script for a given view and validates all the column contents.", TestIssue="622296", Feature="Database Abstraction Layer", CreatedBy="rls")
    public final void testGetTableSourceDetailsWithColumnsForView(DatabaseProviderTestCase tc) throws IntrospectionServiceException, InvalidDatabaseObjectIdentifierException, java.sql.SQLException {
        IDatabaseServices databaseServices = tc.getServices();
        validateTableSourceColumns(databaseServices, viewIntrospectionViewOverTestTable.getName(), true);
    }
    
    
    @IterativeTestCase(iteratorType=ServerOnlyTestConfiguration.class)
    @TestDetails(Description="Validates that the list of foreign keys matches the ones defined in the bootstrap script for a given table and validates all the foreign key contents.", TestIssue="622296", Feature="Database Abstraction Layer", CreatedBy="rls")
    public final void testGetTableSourceDetailsWithForeignKeys(DatabaseProviderTestCase tc) throws IntrospectionServiceException, InvalidDatabaseObjectIdentifierException, java.sql.SQLException {
        IDatabaseServices databaseServices = tc.getServices();
        
        assertForeignKeys(Arrays.asList(expectedForeignKeys),
            databaseServices.getIntrospectionService().getTableSourceForeignKeys(getTableSourceInfo(databaseServices, tableForeignKeysTable.getName())));
    }
    
    
    private final void validateTableSourceColumns(IDatabaseServices databaseServices, String tableSourceName, boolean isView) throws IntrospectionServiceException, InvalidDatabaseObjectIdentifierException, java.sql.SQLException {
        assertColumns(Arrays.asList(expectedColumns),
            databaseServices.getIntrospectionService().getTableSourceColumns(getTableSourceInfo(databaseServices, tableSourceName)), isView);
    }
    
    
    public static ITableSourceInfo getTableSourceInfo(IDatabaseServices databaseServices, String tableName) throws IntrospectionServiceException, InvalidDatabaseObjectIdentifierException, java.sql.SQLException {
        return getTableSourceInfo(databaseServices, tableName, true);
    }
    
    
    public static ITableSourceInfo getTableSourceInfo(IDatabaseServices databaseServices, final String tableName, boolean assertExists) throws IntrospectionServiceException, InvalidDatabaseObjectIdentifierException, java.sql.SQLException {
        IDatabaseInfo db = databaseServices.getObjectFactory().createDatabaseInfo(getDatabaseIdentifier(databaseServices));
        
        ITableSourceInfo result = LinqMethods.firstOrDefault(TypeInformation.get(ITableSourceInfo.class), IntrospectionServiceExtensions.listTableSourcesWithoutFilter(databaseServices.getIntrospectionService(), db), (ITableSourceInfo ts) -> {
    return StringUtilities.equalsIgnoreCase(ts.getName(), tableName);
});
        
        if (assertExists)
        {
            Assert.assertNotNull("Table source named '" + tableName + "' not found in the database", result);
        }
        
        return result;
    }
    
    private static String columnPropertyMustMatch(String tableSource, String columnName, String propertyName) {
        return "Table Source: " + tableSource + " Column: " + columnName + " Property: " + propertyName + " introspected value doesn't match";
    }
    
    
    public static void assertColumns(Iterable<ExpectedColumnInfo> expectedColumns, Iterable<ITableSourceColumnInfo> obtainedColumns, boolean isView) {
        
        Assert.assertNotNull("Obtained columns for table source are null.", obtainedColumns);
        String tableSourceName = LinqMethods.first(TypeInformation.get(ITableSourceColumnInfo.class), obtainedColumns).getTableSource().getName();
        
        Assert.assertEquals("Number of columns retrieved for table source '" + tableSourceName + "' doesn't match the expected value.", (Object) (LinqMethods.count(ExpectedColumnInfo.TypeInfo, expectedColumns)), (Object) (LinqMethods.count(TypeInformation.get(ITableSourceColumnInfo.class), obtainedColumns)));
        java.util.Iterator<ExpectedColumnInfo> ecIter = (expectedColumns).iterator();
        try {
            while (ecIter.hasNext()) {
                final RefParmHolder<ExpectedColumnInfo> ec = new RefParmHolder<ExpectedColumnInfo>(ecIter.next());
                ITableSourceColumnInfo obtainedColumn = LinqMethods.firstOrDefault(TypeInformation.get(ITableSourceColumnInfo.class), obtainedColumns, (ITableSourceColumnInfo col) -> {
    return StringUtilities.equalsIgnoreCase(col.getName(), ec.getVal().getName());
});
                Assert.assertNotNull("Couldn't find column '" + ec.getVal().getName() + "' from table source '" + tableSourceName + "'", obtainedColumn);
                
                Assert.assertEquals(columnPropertyMustMatch(tableSourceName, ec.getVal().getName(), "IsMandatory"), (Object) (ec.getVal().isMandatory()), (Object) (obtainedColumn.isMandatory()));
                
                if (!isView)
                {
                    Assert.assertEquals(columnPropertyMustMatch(tableSourceName, ec.getVal().getName(), "IsPrimaryKey"), (Object) (ec.getVal().isPrimaryKey()), (Object) (obtainedColumn.isPrimaryKey()));
                    Assert.assertEquals(columnPropertyMustMatch(tableSourceName, ec.getVal().getName(), "IsAutoGenerated"), (Object) (ec.getVal().isAutoGenerated()), (Object) (obtainedColumn.isAutoGenerated()));
                }
                
                Assert.assertEquals(columnPropertyMustMatch(tableSourceName, ec.getVal().getName(), "DataType.Type"), (Object) (ec.getVal().getDataType().getType()), (Object) (obtainedColumn.getDataType().getType()));
                
                if (DBDataTypeExtensions.hasLength(obtainedColumn.getDataType().getType()) && ec.getVal().getDataType().getLength() != UNCHECKED_LENGTH)
                {
                    Assert.assertEquals(columnPropertyMustMatch(tableSourceName, ec.getVal().getName(), "DataType.Length"), (Object) (ec.getVal().getDataType().getLength()), (Object) (obtainedColumn.getDataType().getLength()));
                }
                
                if (DBDataTypeExtensions.hasDecimals(obtainedColumn.getDataType().getType()) && ec.getVal().getDataType().getDecimals() != UNCHECKED_DECIMALS)
                {
                    Assert.assertEquals(columnPropertyMustMatch(tableSourceName, ec.getVal().getName(), "DataType.Decimals"), (Object) (ec.getVal().getDataType().getDecimals()), (Object) (obtainedColumn.getDataType().getDecimals()));
                }
            }
        } finally {
            CollectionUtils.dispose(ecIter);
        }
    }
    
    
    public static void assertColumns(Iterable<ExpectedColumnInfo> expectedColumns, Iterable<ITableSourceColumnInfo> obtainedColumns) {
        assertColumns(expectedColumns, obtainedColumns, false);
    }
    
    
    public static void assertForeignKeys(Iterable<ExpectedForeignKeyInfo> expectedForeignKeys, Iterable<ITableSourceForeignKeyInfo> obtainedForeignKeys) {
        
        Assert.assertNotNull("ForeignKeys for table source are null.", obtainedForeignKeys);
        String tableSourceName = LinqMethods.first(TypeInformation.get(ITableSourceForeignKeyInfo.class), obtainedForeignKeys).getTableSource().getName();
        
        Assert.assertEquals("Number of foreign keys retrieved for table source '" + tableSourceName + "' doesn't match the expected value.", (Object) (LinqMethods.count(ExpectedForeignKeyInfo.TypeInfo, expectedForeignKeys)), (Object) (LinqMethods.count(TypeInformation.get(ITableSourceForeignKeyInfo.class), obtainedForeignKeys)));
        
        java.util.Iterator<ExpectedForeignKeyInfo> efkIter = (expectedForeignKeys).iterator();
        try {
            while (efkIter.hasNext()) {
                final RefParmHolder<ExpectedForeignKeyInfo> efk = new RefParmHolder<ExpectedForeignKeyInfo>(efkIter.next());
                Assert.assertNotNull("Expected information for foreign key '" + efk.getVal().getName() + "' from table source '" + tableSourceName + "' doesn't match any foreign key information retrieved from the database", LinqMethods.firstOrDefault(TypeInformation.get(ITableSourceForeignKeyInfo.class), obtainedForeignKeys, (ITableSourceForeignKeyInfo fk) -> {
    return StringUtilities.equalsIgnoreCase(fk.getName(), efk.getVal().getName()) && 
        StringUtilities.equalsIgnoreCase(fk.getColumnName(), efk.getVal().getColumnName()) && 
        StringUtilities.equalsIgnoreCase(fk.getReferencedTableSource().getName(), efk.getVal().getReferencedTableSource().getName()) && 
        StringUtilities.equalsIgnoreCase(fk.getReferencedColumnName(), efk.getVal().getReferencedColumnName());
}));
            }
        } finally {
            CollectionUtils.dispose(efkIter);
        }
    }
    public IntrospectionServiceTests() {
        super(TestConfiguration.TypeInfo);
    }
}
