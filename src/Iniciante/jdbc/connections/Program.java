package Iniciante.jdbc.connections;


import Iniciante.jdbc.connections.exception.DbException;
import Iniciante.jdbc.connections.db.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program {
    public static void main(String[] args) {
        Connection conn=null;
        PreparedStatement st=null;
        try{
            conn= DB.getConnection();
            st= conn.prepareStatement(
                    "UPDATE seller "
                    +"SET BaseSalary=BaseSalary+ ?"
                    +"WHERE"
                    +"(DepartmentId= ?)");
            st.setDouble(1,200.0);
            st.setInt(2,2);
            int rowsAffected =st.executeUpdate();
            System.out.println(rowsAffected);

        }catch(SQLException e){
            throw new DbException(e.getMessage());
        }finally{
            DB.closeConnection();
            DB.closeStatement(st);
        }

    }
}
