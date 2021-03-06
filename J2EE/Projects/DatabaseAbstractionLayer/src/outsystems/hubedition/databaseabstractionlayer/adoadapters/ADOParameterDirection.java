/* 
 This source code (the "Generated Software") is generated by the OutSystems Platform 
 and is licensed by OutSystems (http://www.outsystems.com) to You solely for testing and evaluation 
 purposes, unless You and OutSystems have executed a specific agreement covering the use terms and 
 conditions of the Generated Software, in which case such agreement shall apply. 
*/

package outsystems.hubedition.databaseabstractionlayer.adoadapters;

public class ADOParameterDirection {
	
	  	 public static final int Input = 0;
	  	 public static final int Output = 1;
	     
	     public static String toString(int value)
	     {     	
	         if (value == Input)
	             return "Input";
	         if (value == Output)
	             return "Output";

	         return null;
	     }
	     
	     public static int parse(String value) {
	         if (value.equals("Input"))
	             return Input;
	         if (value.equals("Output"))
	             return Output;

	         throw new IllegalArgumentException("Unknown constant for type CommandType: " + value);
	     }
	     
	     public static int parse(String value, boolean ignoreCase) {
	         if (!ignoreCase) return parse(value);
	         if (value.equalsIgnoreCase("Input"))
	             return Input;
	         if (value.equalsIgnoreCase("Output"))
	             return Output;
	         
	         throw new IllegalArgumentException("Unknown constant for type CommandType: " + value);
	     }
	     public static String[] getNames()
	     {
	         return new String[] {
	             "Input",
	             "Output"};
	     }
}
