package Iniciante.jdbc.connections3;


import Iniciante.jdbc.connection_properties.exception.DbException;
import Iniciante.jdbc.connections.db.DB;
import Iniciante.jdbc.connections3.exception.DbIntegrityException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
    public static void main(String[] args) {
        Connection conn=null;
        Statement st=null;
        try{
            conn= DB.getConnection();
            st= conn.createStatement();

            conn.setAutoCommit(false);
            int rows1 =st.executeUpdate("UPDATE seller SET BaseSalary=2093 WHERE DepartmentId=1");
            int x=1;
//            if(x<2){
//                throw new SQLException("fake error");
//            }
            int rows2 =st.executeUpdate("UPDATE seller SET BaseSalary=3093 WHERE DepartmentId=2");
            conn.commit();

            System.out.println(rows1);
            System.out.println(rows2);

        }catch(SQLException e){
            try{
                conn.rollback();
                throw new DbIntegrityException(e.getMessage());
            }catch (SQLException e1){
                throw  new DbException(e.getMessage());
            }
        }finally{
            DB.closeConnection();
            DB.closeStatement(st);
        }

    }
}
