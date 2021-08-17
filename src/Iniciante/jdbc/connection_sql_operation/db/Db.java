package Iniciante.jdbc.connection_sql_operation.db;



import Iniciante.jdbc.connection_sql_operation.exception.DbException;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Db {

    private static Connection conn=null;

    public static Connection getConnection(){
        if(conn==null) {
            try {
                Properties props = loadProperties();
                String url = props.getProperty("url");
                conn = DriverManager.getConnection(url, props);
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
        System.out.println("Connection Sucess");
        return conn;
    }

    public static void closeConnection(){
        if(conn!=null) {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    public static Properties loadProperties(){
        try{
            FileInputStream fs= new FileInputStream("C:\\Users\\009262631\\Documents\\workspace-learn\\udemyJavaLearn\\src\\Iniciante\\jdbc\\connection_properties\\db.properties");
            Properties props=new Properties();
            props.load(fs);
            return props;
        }catch(IOException e){
            throw new DbException(e.getMessage());
        }
    }

    public static void closeStatement(Statement st){
        if(st != null){
            try {
                st.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }
    public static void closeResultSet (ResultSet rs){
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }
}
