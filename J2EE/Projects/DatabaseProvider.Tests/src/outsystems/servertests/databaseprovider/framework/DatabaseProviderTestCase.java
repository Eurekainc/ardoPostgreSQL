/* 
 This source code (the "Generated Software") is generated by the OutSystems Platform 
 and is licensed by OutSystems (http://www.outsystems.com) to You solely for testing and evaluation 
 purposes, unless You and OutSystems have executed a specific agreement covering the use terms and 
 conditions of the Generated Software, in which case such agreement shall apply. 
*/

package outsystems.servertests.databaseprovider.framework;

import java.text.*;
import java.util.*;
import outsystems.hubedition.extensibility.data.*;
import outsystems.hubedition.extensibility.data.configurationservice.*;
import outsystems.hubedition.util.*;
import outsystems.hubedition.util.delegates.*;
import java.math.BigDecimal;
import outsystems.hubedition.extensibility.data.configurationservice.IRuntimeDatabaseConfiguration;
import outsystems.hubedition.extensibility.data.IDatabaseProvider;


public class DatabaseProviderTestCase extends BaseDatabaseProviderTest.BaseDatabaseProviderTestCase<IDatabaseProvider, IDatabaseServices> {
    public static final TypeInformation<DatabaseProviderTestCase> TypeInfo = TypeInformation.get(DatabaseProviderTestCase.class);
    public void initializeServices(IDatabaseProvider provider, IRuntimeDatabaseConfiguration runtimeConfiguration, IRuntimeDatabaseConfiguration bootstrapConfiguration, boolean runWithBootstrapServices) {
        
        setRuntimeServices( provider.getIntegrationDatabaseServices(runtimeConfiguration) );
        setBootstrapServices( provider.getIntegrationDatabaseServices(bootstrapConfiguration) );
        setRunWithBootstrapServices( runWithBootstrapServices );
    }
    public DatabaseProviderTestCase() {
        super(TypeInformation.get(IDatabaseProvider.class), TypeInformation.get(IDatabaseServices.class));
    }
}
