/* 
 This source code (the "Generated Software") is generated by the OutSystems Platform 
 and is licensed by OutSystems (http://www.outsystems.com) to You solely for testing and evaluation 
 purposes, unless You and OutSystems have executed a specific agreement covering the use terms and 
 conditions of the Generated Software, in which case such agreement shall apply. 
*/

package outsystems.hubedition.extensibility.data.platform.configuration;

import java.net.*;
import java.text.*;
import java.util.*;
import outsystems.hubedition.extensibility.data.*;
import outsystems.hubedition.extensibility.data.configurationservice.*;
import outsystems.hubedition.extensibility.data.platform.*;
import outsystems.hubedition.http.*;
import outsystems.hubedition.util.*;
import outsystems.hubedition.util.delegates.*;
import java.math.BigDecimal;
import outsystems.hubedition.extensibility.data.configurationservice.AuthenticationType;
import outsystems.hubedition.extensibility.data.configurationservice.IRuntimeDatabaseConfiguration;
import outsystems.hubedition.extensibility.data.platform.IPlatformDatabaseProvider;


public interface IPlatformDatabaseConfiguration extends IEquatable<IPlatformDatabaseConfiguration>
{
    
    /**
	 *	Gets the database provider. It provides information about the database, and access to its services.
	 *	@return	The database provider.
	 */
    public IPlatformDatabaseProvider getPlatformDatabaseProvider();
    
    /**
	 *	This property indicates if the plugin implements the IElevatedUserConfiguration interface, meaning that it has operations that require elevated privileges user. When true, the caller (e.g. Configuration Tool) will ask the user for credentials, and use them in operations that require elevated user permissions.
	 *	@return	True if it implements elevated privileges operations, False otherwise.
	 */
    public boolean isImplementsElevatedPrivilegesOperations();
    
    /**
	 *	Indicates the current state of the Configuration, if the property is true, then IntegratedAuthenticationMode is set
	 *	@return	The authentication type of the configuration.
	 */
    public AuthenticationType getAuthenticationMode();
    
    /**
	 *	Gets the object that compacts all the needed configuration parameters to be used in runtime.
	 *	@param	source	Specifies the component that will use the configuration (e.g. service or application).
	 *	@param	userType	Specifies to what user the configuration will refer to.
	 *	@return	The configuration that allows services or applications to access the database as the specified user.
	 */
    public IRuntimeDatabaseConfiguration runtimeDatabaseConfiguration(Source source, User userType);
    
    /**
	 *	Indicates the current state of the Configuration, if the property is true, then Advanced Configuration mode is set.
	 *	@return	True if Advanced Configuration mode is set. False otherwise.
	 */
    public boolean isAdvancedConfigurationMode();
    
    /**
	 *	Indicates the current state of the Configuration, if the property is true, then Advanced Configuration mode is set.
	 *	@param	value	True if Advanced Configuration mode is set. False otherwise.
	 */
    public void setAdvancedConfigurationMode(boolean value);
    
    /**
	 *	Contextual text to help the user understand what does the Advanced configuration consist of.
	 *	@return	The contextual help for advanced mode.
	 */
    public String getContextualHelpForAdvancedMode();
    
    /**
	 *	Contextual text to help the user understand what does the Basic configuration consist of.
	 *	@return	The contextual help for basic mode.
	 */
    public String getContextualHelpForBasicMode();
    
    /**
	 *	This property returns the credentials for the admin user.
	 *	@return	The admin authentication credentials.
	 */
    public PasswordAuthentication getAdminAuthenticationCredential();
    
    /**
	 *	This property returns the credentials for the runtime user.
	 *	@return	The runtime authentication credentials.
	 */
    public PasswordAuthentication getRuntimeAuthenticationCredential();
    
    /**
	 *	This property returns the credentials for the log user.
	 *	@return	The log authentication credentials.
	 */
    public PasswordAuthentication getLogAuthenticationCredential();
    
}
