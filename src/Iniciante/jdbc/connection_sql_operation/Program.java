package Iniciante.jdbc.connection_sql_operation;



import Iniciante.jdbc.connection_properties.exception.DbException;
import Iniciante.jdbc.connection_sql_operation.db.Db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
    public static void main(String[] args) {
        Connection conn=null;
        Statement st=null;
        ResultSet rs=null;

        try{
            conn = Db.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery("Select * from department");
            while(rs.next()){
                System.out.println(rs.getInt("Id")+" "+rs.getString("Name"));
            }
        }catch(SQLException e){
            throw new DbException(e.getMessage());
        }finally {
            Db.closeStatement(st);
            Db.closeResultSet(rs);
            Db.closeConnection();
        }
    }
}
