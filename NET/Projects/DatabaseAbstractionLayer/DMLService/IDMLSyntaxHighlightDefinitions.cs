/* 
 This source code (the "Generated Software") is generated by the OutSystems Platform 
 and is licensed by OutSystems (http://www.outsystems.com) to You solely for testing and evaluation 
 purposes, unless You and OutSystems have executed a specific agreement covering the use terms and 
 conditions of the Generated Software, in which case such agreement shall apply. 
*/

using System.Collections.Generic;

namespace OutSystems.HubEdition.Extensibility.Data.DMLService {

    /// <summary>
    /// Defines a set of fragments (e.g. keywords, operators) of the database-specific dialect 
    /// that can be used to provide syntax highlighting in SQL statements
    /// </summary>
    public interface IDMLSyntaxHighlightDefinitions {

        /// <summary>
        /// Gets the associated <see cref="IDMLService"/>.
        /// </summary>
        IDMLService DMLService { get; }

        /// <summary>
        /// Returns a set of reserved keywords (e.g. SELECT, FROM, JOIN)
        /// </summary>
        IEnumerable<string> Keywords { get; }

        /// <summary>
        /// Returns a set of function names (e.g. MAX, ROUND, UPPER))
        /// </summary>
        IEnumerable<string> Functions { get; }

        /// <summary>
        /// Returns a set of operators (e.g. +, LIKE, EXISTS)
        /// </summary>
        IEnumerable<string> Operators { get; }

        /// <summary>
        /// Returns a set of data types (e.g. INTEGER, CHAR, NVARCHAR)
        /// </summary>
        IEnumerable<string> DataTypes { get; }
        
    }
}