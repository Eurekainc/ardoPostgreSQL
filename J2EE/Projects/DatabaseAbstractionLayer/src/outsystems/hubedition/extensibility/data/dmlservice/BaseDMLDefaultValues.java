/* 
 This source code (the "Generated Software") is generated by the OutSystems Platform 
 and is licensed by OutSystems (http://www.outsystems.com) to You solely for testing and evaluation 
 purposes, unless You and OutSystems have executed a specific agreement covering the use terms and 
 conditions of the Generated Software, in which case such agreement shall apply. 
*/

package outsystems.hubedition.extensibility.data.dmlservice;

import java.text.*;
import java.util.*;
import outsystems.hubedition.extensibility.data.*;
import outsystems.hubedition.util.*;
import outsystems.hubedition.util.delegates.*;
import java.math.BigDecimal;


/**
 *	Base implementation of a contract for generating default values for simple queries.
 */
public abstract class BaseDMLDefaultValues implements IDMLDefaultValues {
    private IDMLService _dMLService;
    public static final TypeInformation<BaseDMLDefaultValues> TypeInfo = TypeInformation.get(BaseDMLDefaultValues.class);
    
    protected BaseDMLDefaultValues(IDMLService dmlService){
        setDMLService( dmlService );
    }
    
    /**
	 *	This property represents the associated DML service.
	 */
    public final IDMLService getDMLService()
    {
        return _dMLService;
    }
    
    /**
	 *	This property represents the associated DML service.
	 */
    private final void setDMLService(IDMLService value)
    {
        _dMLService = value;
    }
    
    /**
	 *	Gets a DML expression that returns the NULL value. This implementation always returns NULL.
	 *	@return	DML expression
	 */
    public String getNull()
    {
        return "NULL";
    }
    
    /**
	 *	Gets a DML expression that returns the default value for Text elements. This implementation always returns &#39;&#39;.
	 *	@return	DML expression of type Text
	 */
    public String getText()
    {
        return "''";
    }
    
    /**
	 *	Gets a DML expression that returns the default value for Boolean elements. This implementation always returns zero.
	 *	@return	DML expression of type Boolean
	 */
    public String getBoolean()
    {
        return "0";
    }
    
    /**
	 *	Gets a DML expression that returns the default value for Integer elements. This implementation always returns zero.
	 *	@return	DML expression of type Integer
	 */
    public String getInteger()
    {
        return "0";
    }
    
    /**
	 *	Gets a DML expression that returns the default value for Long elements. This implementation always returns zero.
	 *	@return	DML expression of type Long
	 */
    public String getLongInteger()
    {
        return "0";
    }
    
    
    /**
	 *	Gets a DML expression that returns the default value for Decimal elements. This implementation always returns zero.
	 *	@return	DML expression of type Decimal
	 */
    public String getDecimal()
    {
        return "0";
    }
    
    /**
	 *	Gets a DML expression that returns the default value for Date elements. This implementation uses the textToDate with the value &#39;1900-01-01&#39;
	 *	@return	DML expression of type Date
	 */
    public String getDate()
    {
        return getDMLService().getFunctions().textToDate("'1900-01-01'", "yyyy-MM-dd");
    }
    
    /**
	 *	Gets a DML expression that returns the default value for Time elements. This implementation uses the textToTime with the value &#39;00:00:00&#39;
	 *	@return	DML expression of type Time
	 */
    public String getTime()
    {
        return getDMLService().getFunctions().textToTime("'00:00:00'");
    }
    
    /**
	 *	Gets a DML expression that returns the default value for DateTime elements. This implementation uses the textToDateTime with the value &#39;1900-01-01 00:00:00&#39;
	 *	@return	DML expression of type DateTime
	 */
    public String getDateTime()
    {
        return getDMLService().getFunctions().textToDateTime("'1900-01-01 00:00:00'", "yyyy-MM-dd");
    }
    
    /**
	 *	Gets a DML expression that returns the default value for BinaryData elements. This implementation always returns NULL.
	 *	@return	DML expression of type BinaryData
	 */
    public String getBinaryData()
    {
        return "NULL";
    }
}
