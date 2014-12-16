/* 
 This source code (the "Generated Software") is generated by the OutSystems Platform 
 and is licensed by OutSystems (http://www.outsystems.com) to You solely for testing and evaluation 
 purposes, unless You and OutSystems have executed a specific agreement covering the use terms and 
 conditions of the Generated Software, in which case such agreement shall apply. 
*/

package ardo.postgresql;

import outsystems.hubedition.extensibility.data.BaseProviderProperties;
import outsystems.hubedition.extensibility.data.IDatabaseProvider;
import outsystems.hubedition.util.TypeInformation;

/**
 *	Base implementation of a class to represent a set of properties that are specific to a database provider.
 */
public class ProviderProperties extends BaseProviderProperties {
    public static final TypeInformation<ProviderProperties> TypeInfo = TypeInformation.get(ProviderProperties.class);
    
    /**
	 *	Initializes a new instance of the ProviderProperties class.
	 *	@param	provider	The database provider.
	 */
    public ProviderProperties(IDatabaseProvider provider){
        super(provider);
    }
    
    /**
	 *	Gets the friendly name of the database provider
	 */
    public String getDisplayName() {
        return "PostgreSQL";
    }
    
    /**
	 *	Gets the friendly name of the database container (e.g. database, catalog, schema, ...), used for UI generation and messages displayed to the end-user. This implementation return "Database"
	 */
    public String getDatabaseContainerName() {
        return "Schema";
    }
}