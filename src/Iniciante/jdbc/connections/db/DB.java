package Iniciante.jdbc.connections.db;

import Iniciante.jdbc.connections.exception.DbException;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DB {
    private static Connection conn=null;

    public static Connection getConnection(){
        if(conn==null){
        try {
            Properties props = loadProperties();
            String url = props.getProperty("url");
            conn = DriverManager.getConnection(url,props);
        }catch(SQLException e){
            throw new DbException(e.getMessage());
        }
        }
        return conn;
    }

    public static void  closeConnection(){
        try{
            conn.close();
        }catch(SQLException e){
            throw new DbException("Erro para fechar conexao "+e.getMessage());
        }
    }

    private static Properties loadProperties() {
        try {
            FileInputStream fs = new FileInputStream("C:\\Users\\009262631\\Documents\\workspace-learn\\udemyJavaLearn\\src\\Iniciante\\jdbc\\connections\\db.properties");
            Properties props = new Properties();
            props.load(fs);
            return props;
        } catch (IOException e) {
            throw new DbException(e.getMessage());
        }
    }

    public static void closeStatement(Statement st){
        try{
            st.close();
        }catch(SQLException e){
            throw new DbException(e.getMessage());
        }
    }

    public static void closeResult(ResultSet rs){
        try{
            rs.close();
        }catch(SQLException e){
            throw new DbException(e.getMessage());
        }
    }
}

