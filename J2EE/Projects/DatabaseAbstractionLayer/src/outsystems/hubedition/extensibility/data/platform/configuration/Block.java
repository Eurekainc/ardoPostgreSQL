/* 
 This source code (the "Generated Software") is generated by the OutSystems Platform 
 and is licensed by OutSystems (http://www.outsystems.com) to You solely for testing and evaluation 
 purposes, unless You and OutSystems have executed a specific agreement covering the use terms and 
 conditions of the Generated Software, in which case such agreement shall apply. 
*/

package outsystems.hubedition.extensibility.data.platform.configuration;

import java.nio.*;
import java.nio.charset.*;
import java.text.*;
import java.util.*;
import outsystems.hubedition.extensibility.data.*;
import outsystems.hubedition.extensibility.data.platform.*;
import outsystems.hubedition.util.*;
import outsystems.hubedition.util.delegates.*;
import java.math.BigDecimal;
import java.util.Map;


public class Block {
    public static final TypeInformation<Block> TypeInfo = TypeInformation.get(Block.class);
    private Tag conditionTag = Tag.getDefaultValue();
    private String val;
    private ArrayList<String> statements;
    
    public final void setTagValue(String tag, String val) {
        this.conditionTag = Tag.valueOf(tag);
        this.val = val;
        statements = new ArrayList<String>();
    }
    
    public final void addStatement(String statement) {
        statements.add(statement);
    }
    
    public final Tag getConditionTag()
    {
        return conditionTag;
    }
    
    public final String getValue()
    {
        return val;
    }
    
    public final ArrayList<String> getStatements()
    {
        return statements;
    }
    
    public String toString() {
        StringBuilder builder = new StringBuilder();
        int i = 0;
        for (String statement : statements) {
            builder.append("-- Statement #" + i++).append(StringUtils.newLine);
            builder.append(statement).append(StringUtils.newLine);
        }
        
        return getConditionTag() + " " + getValue() + "\n-- Statements: \n" + builder.toString();
    }
}
