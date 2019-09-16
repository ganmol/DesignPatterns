package facade;

import java.sql.Connection;

public class MySqlHelper {
	
	public static Connection getMySqlDBConnection(){
		//get MySql DB connection using connection parameters
		return null;
	}
	
	public void generateMySqlPDFReport(String tableName, Connection con){
		//get data from table and generate pdf report
		System.out.println("PDF report from SQL ");

	}
	
	public void generateMySqlHTMLReport(String tableName, Connection con){
		//get data from table and generate pdf report
		System.out.println("HTML report from SQL ");
	}
}