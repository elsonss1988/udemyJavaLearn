package Iniciante.jdbc.connections4.db;

import Iniciante.jdbc.connection_properties.exception.DbException;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Db {
    Connection conn=null;

    public Connection getConnection(){
        try{
            Properties props=loadProperties();
            String url=props.getProperty("url");
            conn=DriverManager.getConnection(url,props);
        }catch(SQLException e){
            throw new DbException("Error Connection"+e.getMessage());
        }
        return conn;
    }

    public void closeConnection(){
        try{ conn.close();
        }catch(SQLException e){
            throw new DbException(e.getMessage());
        }
    }

    public void closeStatement(Statement st){
        try{
            st.close();
        }catch(SQLException e){
            throw new DbException(e.getMessage());
        }
    }

    public void closeResultSet(ResultSet rs){
        try{
            rs.close();
        }catch (SQLException e){
            throw new DbException(e.getMessage());
        }
    }

    private Properties loadProperties(){
        try{
            FileInputStream fs= new FileInputStream("C:\\Users\\009262631\\Documents\\workspace-learn\\udemyJavaLearn\\src\\Iniciante\\jdbc\\connections2\\db.properties");
            Properties props= new Properties();
            props.load(fs);
            return props;
        }catch(IOException e){
            throw new DbException("Error load Properties: "+e.getMessage());
        }
    }
}
