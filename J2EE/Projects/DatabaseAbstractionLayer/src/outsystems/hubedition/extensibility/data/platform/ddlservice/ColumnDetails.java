/* 
 This source code (the "Generated Software") is generated by the OutSystems Platform 
 and is licensed by OutSystems (http://www.outsystems.com) to You solely for testing and evaluation 
 purposes, unless You and OutSystems have executed a specific agreement covering the use terms and 
 conditions of the Generated Software, in which case such agreement shall apply. 
*/

package outsystems.hubedition.extensibility.data.platform.ddlservice;

import java.text.*;
import java.util.*;
import outsystems.hubedition.extensibility.data.*;
import outsystems.hubedition.extensibility.data.databaseobjects.*;
import outsystems.hubedition.extensibility.data.platform.*;
import outsystems.hubedition.extensibility.data.platform.databaseobjects.*;
import outsystems.hubedition.util.*;
import outsystems.hubedition.util.delegates.*;
import outsystems.runtimecommon.*;
import java.math.BigDecimal;
import outsystems.hubedition.extensibility.data.platform.databaseobjects.IPlatformTableSourceColumnInfo;



final public class ColumnDetails implements Cloneable, IStructure
{
    public static final TypeInformation<ColumnDetails> TypeInfo = TypeInformation.get(ColumnDetails.class);
    public ColumnDetails(IPlatformTableSourceColumnInfo column, String defaultValue){
        Column = column;
        DefaultValue = defaultValue;
    }
    public IPlatformTableSourceColumnInfo Column;
    public String DefaultValue;
    
    public ColumnDetails clone()
    {
        try
        {
            ColumnDetails clone = (ColumnDetails) super.clone();
            return clone;
        }
        // this exception shouldn't occur, since we are implementing Cloneable
        // (clone() only throws it if the current class does not implement Cloneable)
        catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Unexpected CloneNotSupportedException while calling clone()");
        }
    }
    
    public ColumnDetails()
    {
    }
    
    public static ColumnDetails[] create(int count)
    {
        ColumnDetails[] array = new ColumnDetails[count];
        for (int i = 0; i < count; i++)
            array[i] = new ColumnDetails();
        return array;
    }
}
