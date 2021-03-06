/* 
 This source code (the "Generated Software") is generated by the OutSystems Platform 
 and is licensed by OutSystems (http://www.outsystems.com) to You solely for testing and evaluation 
 purposes, unless You and OutSystems have executed a specific agreement covering the use terms and 
 conditions of the Generated Software, in which case such agreement shall apply. 
*/

package ardo.postgresql.introspection;

import java.sql.ResultSet;
import java.sql.SQLException;

import outsystems.hubedition.extensibility.data.IDatabaseServices;
import outsystems.hubedition.extensibility.data.databaseobjects.ITableSourceForeignKeyInfo;
import outsystems.hubedition.extensibility.data.databaseobjects.ITableSourceInfo;
import outsystems.hubedition.util.TypeInformation;

/**
 *	Contains information about a table source foreign key.
 */
public class TableSourceForeignKeyInfo implements ITableSourceForeignKeyInfo {
    private ITableSourceInfo _tableSource;
    private String _name;
    private String _columnName;
    private ITableSourceInfo _referencedTableSource;
    private String _referencedColumnName;
    private boolean _isCascadeDelete;
    public static final TypeInformation<TableSourceForeignKeyInfo> TypeInfo = TypeInformation.get(TableSourceForeignKeyInfo.class);
    
    /**
	 *	Initializes a new instance of the TableSourceForeignKeyInfo class.
	 *	@param	tableSource	The table source.
	 *	@param	name	The name.
	 *	@param	columnName	Name of the column.
	 *	@param	referencedTableSource	The referenced table source.
	 *	@param	referencedColumnName	Name of the referenced column.
	 *	@param	isCascadeDelete	if set to true [is cascade delete].
	 */
    public TableSourceForeignKeyInfo(ITableSourceInfo tableSource, String name, String columnName, ITableSourceInfo referencedTableSource, String referencedColumnName, boolean isCascadeDelete){
        setTableSource( tableSource );
        setName( name );
        setColumnName( columnName );
        setReferencedTableSource( referencedTableSource );
        setReferencedColumnName( referencedColumnName );
        setIsCascadeDelete( isCascadeDelete );
    }
    
    /**
	 *	Table source that owns the foreign key.
	 */
    public final ITableSourceInfo getTableSource() {
        return _tableSource;
    }
    
    /**
	 *	Table source that owns the foreign key.
	 */
    private final void setTableSource(ITableSourceInfo value) {
        _tableSource = value;
    }
    
    /**
	 *	Name that identifies the foreign key constraint.
	 */
    public final String getName() {
        return _name;
    }
    
    /**
	 *	Name that identifies the foreign key constraint.
	 */
    private final void setName(String value) {
        _name = value;
    }
    
    /**
	 *	Name of the column.
	 */
    public final String getColumnName() {
        return _columnName;
    }
    
    /**
	 *	Name of the column.
	 */
    private final void setColumnName(String value) {
        _columnName = value;
    }
    
    /**
	 *	Table source that owns the referenced column.
	 */
    public final ITableSourceInfo getReferencedTableSource() {
        return _referencedTableSource;
    }
    
    /**
	 *	Table source that owns the referenced column.
	 */
    private final void setReferencedTableSource(ITableSourceInfo value) {
        _referencedTableSource = value;
    }
    
    /**
	 *	Name of the referenced column.
	 */
    public final String getReferencedColumnName() {
        return _referencedColumnName;
    }
    
    /**
	 *	Name of the referenced column.
	 */
    private final void setReferencedColumnName(String value) {
        _referencedColumnName = value;
    }
    
    /**
	 *	Returns True if the delete rule of the foreign key is CASCADE DELETE.
	 */
    public final boolean isCascadeDelete() {
        return _isCascadeDelete;
    }
    
    /**
	 *	Returns True if the delete rule of the foreign key is CASCADE DELETE.
	 */
    private final void setIsCascadeDelete(boolean value) {
        _isCascadeDelete = value;
    }

	public static ITableSourceForeignKeyInfo create(IDatabaseServices services, ITableSourceInfo tableSource, ResultSet res) throws SQLException {
		String name = res.getString("constraint_name");
		String column_name = res.getString("source_column_name");
		boolean isCascadeDelete = "DELETE".equals(res.getString("delete_rule").toUpperCase());
		String referencedColumnName = res.getString("dest_column_name");
		
		ITableSourceInfo referencedTableSource = new TableSourceInfo(services, tableSource.getDatabase(), res.getString("dest_table_name"));
		
		return new TableSourceForeignKeyInfo(tableSource, name, column_name, referencedTableSource, referencedColumnName, isCascadeDelete);
	}
    
}
