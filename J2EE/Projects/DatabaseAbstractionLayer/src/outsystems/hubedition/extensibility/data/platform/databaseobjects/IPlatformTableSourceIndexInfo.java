/* 
 This source code (the "Generated Software") is generated by the OutSystems Platform 
 and is licensed by OutSystems (http://www.outsystems.com) to You solely for testing and evaluation 
 purposes, unless You and OutSystems have executed a specific agreement covering the use terms and 
 conditions of the Generated Software, in which case such agreement shall apply. 
*/

package outsystems.hubedition.extensibility.data.platform.databaseobjects;

import java.text.*;
import java.util.*;
import outsystems.hubedition.extensibility.data.*;
import outsystems.hubedition.extensibility.data.databaseobjects.*;
import outsystems.hubedition.extensibility.data.platform.*;
import outsystems.hubedition.util.*;
import outsystems.hubedition.util.delegates.*;
import java.math.BigDecimal;
import outsystems.hubedition.extensibility.data.databaseobjects.ITableSourceInfo;



/**
 *	Contains information about a table source index.
 */
public interface IPlatformTableSourceIndexInfo
{
    
    /**
	 *	Table source that owns the index.
	 *	@return	The table source.
	 */
    public ITableSourceInfo getTableSource();
    
    /**
	 *	Name that identifies the index.
	 *	@return	The name of the index.
	 */
    public String getName();
    
    /**
	 *	Columns used in the index.
	 *	@return	The columns affected by the index.
	 */
    public Iterable<IPlatformTableSourceColumnInfo> getColumns();
    
    /**
	 *	Returns true if the index is a unique index, false otherwise.
	 *	@return	True if this index is unique, False otherwise.
	 */
    public boolean isUnique();
    
    /**
	 *	Returns true if the index is a primary key index, false otherwise.
	 *	@return	True if this index is for primary key, False otherwise.
	 */
    public boolean isPrimaryKey();
}
