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
 *	Generates the SQL functions required by the applications to perform simple queries.
 */
public interface IDMLFunctions
{
    
    /**
	 *	Gets the associated DML service.
	 */
    public IDMLService getDMLService();
    
    /**
	 *	Returns a DML expression that computes the absolute value (unsigned magnitude) of a decimal number.
	 *	@param	n	A string representing a decimal number.
	 *	@return	A DML expression that evaluates to a Decimal.
	 */
    public String abs(String n);
    
    /**
	 *	Returns a DML expression that computes the decimal number 'n' rounded to the zero fractional digits.
	 *	@param	n	DML expression of type Decimal that evaluates to the decimal number to round
	 *	@return	A DML expression that evaluates to a Decimal.
	 */
    public String round(String n);
    
    /**
	 *	Returns a DML expression that computes the square root of the decimal number 'n'.
	 *	@param	n	DML expression of type Decimal that evaluates to a decimal number
	 *	@return	A DML expression that evaluates to a Decimal.
	 */
    public String sqrt(String n);
    
    /**
	 *	Returns a DML expression that computes the decimal number 'n' truncated to integer removing the decimal part of 'n'.
	 *	@param	n	DML expression of type Decimal that evaluates to the decimal number to truncate
	 *	@return	A DML expression that evaluates to a Decimal.
	 */
    public String trunc(String n);
    
    /**
	 *	Returns a DML expression that concatenates two strings: 't1' and 't2'.
	 *	@param	t1	A DML expression that evaluates to Text.
	 *	@param	t2	A DML expression that evaluates to Text.
	 *	@return	A DML expression that evaluates to Text.
	 */
    public String concat(String t1, String t2);
    
    /**
	 *	Returns a DML expression that searches an expression for another expression and returns its starting position if found. Returns -1 if the search expression is empty or cannot be found.
	 *	@param	t	A DML expression that evaluates to Text.
	 *	@param	search	A DML expression that evaluates to Text.
	 *	@return	A DML expression that evaluates to an Integer.
	 */
    public String index(String t, String search);
    
    /**
	 *	Returns a DML expression that computes the number of characters in a string.
	 *	@param	t	A DML expression that evaluates to Text.
	 *	@return	A DML expression that evaluates to an Integer.
	 */
    public String length(String t);
    
    /**
	 *	Returns a DML expression that replaces all occurrences of a specified string value with another string value.
	 *	@param	t	A DML expression that evaluates to Text.
	 *	@param	search	A DML expression that evaluates to Text, to search for.
	 *	@param	replace	A DML expression that evaluates to Text, to replace all occurrences with.
	 *	@return	A DML expression that evaluates to Text.
	 */
    public String replace(String t, String search, String replace);
    
    /**
	 *	Returns a DML expression that computes a substring beginning at start zero-based position and with length characters.
	 *	@param	t	A DML expression that evaluates to Text.
	 *	@param	start	A DML expression that evaluates to an Integer, containing the start index.
	 *	@param	length	A DML expression that evaluates to an Integer, containing the length of the text to return.
	 *	@return	A DML expression that evaluates to Text.
	 */
    public String substr(String t, String start, String length);
    
    /**
	 *	Returns a DML expression that converts a string to lowercase.
	 *	@param	t	A DML expression that evaluates to Text.
	 *	@return	A DML expression that evaluates to Text.
	 */
    public String toLower(String t);
    
    /**
	 *	Returns a DML expression that converts a string to uppercase.
	 *	@param	t	A DML expression that evaluates to Text.
	 *	@return	A DML expression that evaluates to Text.
	 */
    public String toUpper(String t);
    
    /**
	 *	Returns a DML expression that removes all leading and trailing white spaces from a string.
	 *	@param	t	A DML expression that evaluates to Text.
	 *	@return	A DML expression that evaluates to Text.
	 */
    public String trim(String t);
    
    /**
	 *	Returns a DML expression that removes all trailing white spaces from a string.
	 *	@param	t	A DML expression that evaluates to Text.
	 *	@return	A DML expression that evaluates to Text.
	 */
    public String trimEnd(String t);
    
    /**
	 *	Returns a DML expression that removes all leading white spaces from a string.
	 *	@param	t	A DML expression that evaluates to Text.
	 *	@return	A DML expression that evaluates to Text.
	 */
    public String trimStart(String t);
    
    /**
	 *	Returns a DML expression that adds days to a DateTime and returns a valid DataTime.
	 *	@param	dt	A DML expression that evaluates to a DateTime.
	 *	@param	n	A DML expression that evaluates to a Integer.
	 *	@return	A DML expression that evaluates to a DateTime.
	 */
    public String addDays(String dt, String n);
    
    /**
	 *	Returns a DML expression that adds days to a DateTime and returns a valid DataTime.
	 *	@param	dt	A DML expression that evaluates to a DateTime.
	 *	@param	n	A DML expression that evaluates to a Integer.
	 *	@return	A DML expression that evaluates to a DateTime.
	 */
    public String addHours(String dt, String n);
    
    /**
	 *	Returns a DML expression that adds minutes to a DateTime and returns a valid DateTime.
	 *	@param	dt	A DML expression that evaluates to a DateTime.
	 *	@param	n	A DML expression that evaluates to an Integer.
	 *	@return	A DML expression that evaluates to a DateTime.
	 */
    public String addMinutes(String dt, String n);
    
    /**
	 *	Returns a DML expression that adds months to a DateTime and returns a valid DateTime.
	 *	@param	dt	A DML expression that evaluates to a DateTime.
	 *	@param	n	A DML expression that evaluates to an Integer.
	 *	@return	A DML expression that evaluates to a DateTime.
	 */
    public String addMonths(String dt, String n);
    
    /**
	 *	Returns a DML expression that adds seconds to a DateTime and returns a valid DateTime.
	 *	@param	dt	A DML expression that evaluates to a DateTime.
	 *	@param	n	A DML expression that evaluates to an Integer.
	 *	@return	A DML expression that evaluates to a DateTime.
	 */
    public String addSeconds(String dt, String n);
    
    /**
	 *	Returns a DML expression that adds years to a DateTime and returns a valid DateTime.
	 *	@param	dt	A DML expression that evaluates to a DateTime.
	 *	@param	n	A DML expression that evaluates to an Integer.
	 *	@return	A DML expression that evaluates to a DateTime.
	 */
    public String addYears(String dt, String n);
    
    /**
	 *	Returns a DML expression that creates a new DateTime given a Date and a Time.
	 *	@param	d	A DML expression that evaluates to a Date.
	 *	@param	t	A DML expression that evaluates to a Time.
	 *	@return	A DML expression that evaluates to a DateTime.
	 */
    public String buildDateTime(String d, String t);
    
    /**
	 *	Returns a DML expression that computes the day of a DateTime.
	 *	@param	dt	A DML expression that evaluates to a DateTime.
	 *	@return	A DML expression that evaluates to an Integer.
	 */
    public String day(String dt);
    
    /**
	 *	Returns a DML expression that computes the week day of a DateTime, ranging from 0 (Sunday) to 6 (Saturday).
	 *	@param	dt	A DML expression that evaluates to a DateTime.
	 *	@return	A DML expression that evaluates to an Integer.
	 */
    public String dayOfWeek(String dt);
    
    /**
	 *	Returns a DML expression that computes how many days have passed between two DateTimes. Returns zero if the two dates are the same, a positive integer if dt1 is smaller than dt2, and a negative number otherwise.
	 *	@param	dt1	First DML expression that evaluates to a DateTime.
	 *	@param	dt2	Second DML expression that evaluates to a DateTime.
	 *	@return	A DML expression that evaluates to an Integer.
	 */
    public String diffDays(String dt1, String dt2);
    
    /**
	 *	Returns a DML expression that computes how many hours have passed between two DateTimes. Returns zero if the two dates and hours are the same, a positive integer if dt1 is smaller than dt2, and a negative number otherwise.
	 *	@param	dt1	First DML expression that evaluates to a DateTime.
	 *	@param	dt2	Second DML expression that evaluates to a DateTime.
	 *	@return	A DML expression that evaluates to an Integer.
	 */
    public String diffHours(String dt1, String dt2);
    
    /**
	 *	Returns a DML expression that computes how many minutes have passed between two DateTimes. Returns zero if the two dates, hours and minutes are the same, a positive integer if dt1 is smaller than dt2, and a negative number otherwise.
	 *	@param	dt1	A DML expression that evaluates to a DateTime.
	 *	@param	dt2	A DML expression that evaluates to a DateTime.
	 *	@return	A DML expression that evaluates to an Integer.
	 */
    public String diffMinutes(String dt1, String dt2);
    
    /**
	 *	Returns a DML expression that computes how many seconds have passed between two DateTimes. Returns zero if the two dates, hours, minutes, and seconds are the same, a positive integer if dt1 is smaller than dt2, and a negative number otherwise.
	 *	@param	dt1	A DML expression that evaluates to a DateTime.
	 *	@param	dt2	A DML expression that evaluates to a DateTime.
	 *	@return	A DML expression that evaluates to an Integer.
	 */
    public String diffSeconds(String dt1, String dt2);
    
    /**
	 *	Returns a DML expression that computes the hour part of a DateTime.
	 *	@param	dt	A DML expression that evaluates to a DateTime.
	 *	@return	A DML expression that evaluates to an Integer.
	 */
    public String hour(String dt);
    
    /**
	 *	Returns a DML expression that computes the minute part of a DateTime.
	 *	@param	dt	A DML expression that evaluates to a DateTime.
	 *	@return	A DML expression that evaluates to an Integer.
	 */
    public String minute(String dt);
    
    /**
	 *	Returns a DML expression that computes the month part of a DateTime.
	 *	@param	dt	A DML expression that evaluates to a DateTime.
	 *	@return	A DML expression that evaluates to an Integer.
	 */
    public String month(String dt);
    
    /**
	 *	Returns a DML expression that computes a new date from a year, month, and day.
	 *	@param	y	A DML expression that evaluates to an Integer.
	 *	@param	m	A DML expression that evaluates to an Integer.
	 *	@param	d	A DML expression that evaluates to an Integer.
	 *	@return	A DML expression that evaluates to a Date.
	 */
    public String newDate(String y, String m, String d);
    
    /**
	 *	Returns a DML expression that computes a new DateTime from a year, month, day, hour, minute, and second.
	 *	@param	y	A DML expression that evaluates to an Integer.
	 *	@param	mo	A DML expression that evaluates to an Integer.
	 *	@param	d	A DML expression that evaluates to an Integer.
	 *	@param	h	A DML expression that evaluates to an Integer.
	 *	@param	m	A DML expression that evaluates to an Integer.
	 *	@param	s	A DML expression that evaluates to an Integer.
	 *	@return	A DML expression that evaluates to DateTime.
	 */
    public String newDateTime(String y, String mo, String d, String h, String m, String s);
    
    /**
	 *	Returns a DML expression that computes a new Time from an hour, minute, and second.
	 *	@param	h	A DML expression that evaluates to an Integer.
	 *	@param	m	A DML expression that evaluates to an Integer.
	 *	@param	s	A DML expression that evaluates to an Integer.
	 *	@return	A DML expression that evaluates to Time.
	 */
    public String newTime(String h, String m, String s);
    
    /**
	 *	Returns a DML expression that computes the seconds part of a DateTime.
	 *	@param	dt	A DML expression that evaluates to a DateTime.
	 *	@return	A DML expression that evaluates to an Integer.
	 */
    public String second(String dt);
    
    /**
	 *	Returns a DML expression that computes the year part of a DateTime.
	 *	@param	dt	A DML expression that evaluates to a DateTime.
	 *	@return	A DML expression that evaluates to an Integer.
	 */
    public String year(String dt);
    
    /**
	 *	Returns a DML expression that converts a Boolean expression to an Integer. The expression evaluates into 1 if the boolean is True, or 0 if False.
	 *	@param	b	A DML expression that evaluates to a Boolean.
	 *	@return	A DML expression that evaluates to an Integer.
	 */
    public String booleanToInteger(String b);
    
    /**
	 *	Returns a DML expression that converts a Boolean in its textual representation: True or False.
	 *	@param	b	A DML expression that evaluates to Boolean.
	 *	@return	A DML expression that evaluates to Text.
	 */
    public String booleanToText(String b);
    
    /**
	 *	Returns a DML expression that converts a DateTime to a Date, by dropping the Time component.
	 *	@param	dt	A DML expression that evaluates to a DateTime.
	 *	@return	A DML expression that evaluates to a Date.
	 */
    public String dateTimeToDate(String dt);
    
    /**
	 *	Returns a DML expression that converts a DateTime to its textual representation, using a specified format.
	 *	@param	dt	A DML expression that evaluates to a DateTime.
	 *	@param	dateFormat	Date format used to serialize the date component of the text value (e.g. YYYY-MM-DD).
	 *	@return	A DML expression that evaluates to Text.
	 */
    public String dateTimeToText(String dt, String dateFormat);
    
    /**
	 *	Returns a DML expression that converts a DateTime to a Time, by dropping the Date component.
	 *	@param	dt	A DML expression that evaluates to a DateTime.
	 *	@return	A DML expression that evaluates to a Time.
	 */
    public String dateTimeToTime(String dt);
    
    /**
	 *	Returns a DML expression that converts a Date to a DateTime, by adding an empty Time component (00:00:00).
	 *	@param	d	A DML expression that evaluates to a Date.
	 *	@return	A DML expression that evaluates to a DateTime.
	 */
    public String dateToDateTime(String d);
    
    /**
	 *	Returns a DML expression that converts a Date to its textual representation, using a specified format.
	 *	@param	d	A DML expression that evaluates to a Date.
	 *	@param	dateFormat	Date format used to serialize the date component of the text value (e.g. YYYY-MM-DD).
	 *	@return	A DML expression that evaluates to Text.
	 */
    public String dateToText(String d, String dateFormat);
    
    /**
	 *	Returns an SQL expression that converts a Decimal to a Boolean. A Decimal value of 0.0 is False, all other values are True.
	 *	@param	d	A DML expression that evaluates to a Decimal.
	 *	@return	A DML expression that evaluates to Boolean.
	 */
    public String decimalToBoolean(String d);
    
    /**
	 *	Returns a DML expression that converts a Decimal to an Integer.
	 *	@param	d	A DML expression that evaluates to a Decimal.
	 *	@return	A DML expression that evaluates to a Boolean.
	 */
    public String decimalToInteger(String d);
    
    /**
	 *	Returns a DML expression that converts a Decimal to its textual representation.
	 *	@param	d	A DML expression that evaluates to a Decimal.
	 *	@return	A DML expression that evaluates to a Decimal.
	 */
    public String decimalToText(String d);
    
    /**
	 *	Returns a DML expression that converts an EntityReference to an Integer.
	 *	@param	er	A DML expression that evaluates to an Integer.
	 *	@return	A DML expression that evaluates to an Integer.
	 */
    public String entityRefIntegerToInteger(String er);
    
    /**
	 *	Returns a DML expression that converts an EntityReference to its textual representation.
	 *	@param	er	A DML expression that evaluates to Text.
	 *	@return	A DML expression that evaluates to Text.
	 */
    public String entityRefTextToText(String er);
    
    /**
	 *	Returns a DML expression that converts an Integer to a Boolean. A Decimal value of 0 is False, all other values are True.
	 *	@param	i	A DML expression that evaluates to an Integer.
	 *	@return	A DML expression that evaluates to a Boolean.
	 */
    public String integerToBoolean(String i);
    
    /**
	 *	Returns a DML expression that converts an Integer to a Decimal.
	 *	@param	i	A DML expression that evaluates to an Integer.
	 *	@return	A DML expression that evaluates to a decimal.
	 */
    public String integerToDecimal(String i);
    
    /**
	 *	Returns a DML expression that converts an Integer to an (untyped) Entity Identifier/Reference.
	 *	@param	i	A DML expression that evaluates to an Integer.
	 *	@return	A DML expression that evaluates to an Integer.
	 */
    public String integerToEntityRefInteger(String i);
    
    /**
	 *	Returns a DML expression that converts an Integer to its textual representation.
	 *	@param	i	A DML expression that evaluates to an Integer.
	 *	@return	A DML expression that evaluates to Text.
	 */
    public String integerToText(String i);
    
    /**
	 *	Returns a DML expression that computes a Null Date (1900-01-01).
	 *	@return	A DML expression that evaluates to a Date.
	 */
    public String nullDate();
    
    /**
	 *	Returns a DML expression that returns a Null Entity Numeric Identifier/Reference.
	 *	@return	A DML expression that evaluates to an Integer.
	 */
    public String nullIdentifier();
    
    /**
	 *	Returns a DML expression that computes a Null Entity Text Identifier/Reference.
	 *	@return	A DML expression that evaluates to Text.
	 */
    public String nullTextIdentifier();
    
    /**
	 *	Returns a DML expression that converts Text to a Date.
	 *	@param	t	A DML expression that evaluates to Text.
	 *	@param	dateFormat	Date format used to serialize the date component of the text value (e.g. YYYY-MM-DD).
	 *	@return	A DML expression that evaluates to a Date.
	 */
    public String textToDate(String t, String dateFormat);
    
    /**
	 *	Returns a DML expression that converts Text to a DateTime.
	 *	@param	t	A DML expression that evaluates to Text.
	 *	@param	dateFormat	Date format used to serialize the date component of the text value (e.g. YYYY-MM-DD).
	 *	@return	A DML expression that evaluates to a DateTime.
	 */
    public String textToDateTime(String t, String dateFormat);
    
    /**
	 *	Returns a DML expression that converts Text to a Decimal.
	 *	@param	t	A DML expression that evaluates to Text.
	 *	@return	A DML expression that evaluates to a Decimal.
	 */
    public String textToDecimal(String t);
    
    /**
	 *	Returns a DML expression that converts Text to an (untyped) Entity Identifier/Reference.
	 *	@param	t	A DML expression that evaluates to Text.
	 *	@return	A DML expression that evaluates to Text.
	 */
    public String textToEntityRefText(String t);
    
    /**
	 *	Returns a DML expression that converts Text to an Integer.
	 *	@param	t	A DML expression that evaluates to Text.
	 *	@return	A DML expression that evaluates to an Integer.
	 */
    public String textToInteger(String t);
    
    /**
	 *	Returns a DML expression that converts Text to Time.
	 *	@param	t	A DML expression that evaluates to Text.
	 *	@return	A DML expression that evaluates to Time.
	 */
    public String textToTime(String t);
    
    /**
	 *	Returns a DML expression that converts a Time to a DateTime, by adding an empty Date component (1900-01-01).
	 *	@param	t	A DML expression that evaluates to Time.
	 *	@return	A DML expression that evaluates to DateTime.
	 */
    public String timeToDateTime(String t);
    
    /**
	 *	Returns a DML expression that converts a Time to its text value in the format hh:mm:ss.
	 *	@param	t	A DML expression that evaluates to Time.
	 *	@return	A DML expression that evaluates to Text.
	 */
    public String timeToText(String t);
    
    /**
	 *	Returns a DML expression that returns trueReturn if value is True, otherwise, it returns falseReturn.
	 *	@param	value	A DML expression that evaluates to Boolean
	 *	@param	trueReturn	A DML expression that evaluates to a specific type
	 *	@param	falseReturn	A DML expression that evaluates to the same type as trueReturn
	 *	@return	A DML expression that evaluates to the same type of trueReturn and falseReturn
	 */
    public String ifElse(String value, String trueReturn, String falseReturn);
    
}