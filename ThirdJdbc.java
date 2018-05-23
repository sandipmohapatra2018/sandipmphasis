package com.may19;
import java.sql.*;  
class ThirdJdbc
{  
public static void main(String args[])throws Exception{  
Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con=DriverManager.getConnection
("jdbc:oracle:thin:@localhost:1521:xe","system","1234");  
con.setAutoCommit(false);  
 Statement stmt=con.createStatement();  
stmt.addBatch("insert into  mphasisstudent values(190,'abhi','bang')");  
stmt.addBatch("insert into mphasisstudent values(191,'umesh','hyd')");  
stmt.addBatch("delete from mphasisstudent where empnp=101");  
stmt.executeBatch();
 con.commit();  
con.close();  
}}  