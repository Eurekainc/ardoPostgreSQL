/* 
 This source code (the "Generated Software") is generated by the OutSystems Platform 
 and is licensed by OutSystems (http://www.outsystems.com) to You solely for testing and evaluation 
 purposes, unless You and OutSystems have executed a specific agreement covering the use terms and 
 conditions of the Generated Software, in which case such agreement shall apply. 
*/

package outsystems.hubedition.extensibility.data.introspectionservice;

import java.text.*;
import java.util.*;
import outsystems.hubedition.extensibility.data.*;
import outsystems.hubedition.extensibility.data.databaseobjects.*;
import outsystems.hubedition.util.*;
import outsystems.hubedition.util.delegates.*;
import outsystems.runtimecommon.*;
import java.math.BigDecimal;
import outsystems.hubedition.extensibility.data.databaseobjects.IDatabaseInfo;
import outsystems.hubedition.extensibility.data.databaseobjects.ITableSourceInfo;
import outsystems.hubedition.extensibility.data.IDatabaseServices;
import outsystems.runtimecommon.OSTrace;


public abstract class BaseIntrospectionService implements IIntrospectionService {
    private int _queryTimeout;
    private IDatabaseServices _databaseServices;
    public static final TypeInformation<BaseIntrospectionService> TypeInfo = TypeInformation.get(BaseIntrospectionService.class);
    
    public int getQueryTimeout()
    {
        return _queryTimeout;
    }
    
    public void setQueryTimeout(int value)
    {
        _queryTimeout = value;
    }
    
    public IDatabaseServices getDatabaseServices()
    {
        return _databaseServices;
    }
    
    private void setDatabaseServices(IDatabaseServices value)
    {
        _databaseServices = value;
    }
    
    protected BaseIntrospectionService(IDatabaseServices databaseServices){
        setDatabaseServices( databaseServices );
    }
    
    public abstract Iterable<IDatabaseInfo> listDatabases() throws java.sql.SQLException;
    
    public abstract Iterable<ITableSourceInfo> listTableSources(IDatabaseInfo database, IsTableSourceToIgnore isTableSourceToIgnore) throws IntrospectionServiceException, java.sql.SQLException;
    
    public abstract Iterable<ITableSourceForeignKeyInfo> getTableSourceForeignKeys(ITableSourceInfo tableSource) throws IntrospectionServiceException, java.sql.SQLException;
    
    public abstract Iterable<ITableSourceColumnInfo> getTableSourceColumns(ITableSourceInfo tableSource) throws IntrospectionServiceException, java.sql.SQLException;
    
    protected final void logException(Exception e, String additionalMessage) {
        try {
            OSTrace.error((e != null ? ExceptionUtils.getExceptionTypeOrMessage(e) : "") + StringUtils.newLine + additionalMessage + 
                (e != null && !StringUtils.equals(LogUtils.getStackTrace(e), null) ? LogUtils.getStackTrace(e) : ""));
        }catch (Exception exceptionToHandle) {
        
    }
}
}