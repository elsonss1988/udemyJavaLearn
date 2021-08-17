package Iniciante.jdbc.connection_insert;

import Iniciante.jdbc.connection_properties.db.Db;
import Iniciante.jdbc.connection_properties.exception.DbException;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Connection conn=null;
        PreparedStatement st=null;
        try{
            conn= Db.getConnection();
            st= conn.prepareStatement(
                    "INSERT INTO seller"
                    +"(Name,Email,BirthDate,BaseSalary,DepartmentId)"
                    +"VALUES"
                    +"(?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            st.setString(1,"Carl Purple");
            st.setString(2,"carl@gmail.com");
            st.setDate(3,new java.sql.Date(sdf.parse("22/04/1985").getTime()));
            st.setDouble(4, 3000.0);
            st.setInt(5,4);

            int rowsAffected=st.executeUpdate();

            if(rowsAffected >0){
                ResultSet rs= st.getGeneratedKeys();
                while (rs.next()){
                    int id=rs.getInt(1);
                    System.out.println("Done! id= "+id);
                }
            }else{
                System.out.println("No rown affected!");
            }

            System.out.println("Done Rows affected: "+rowsAffected);
        }catch(SQLException e){
            throw new DbException(e.getMessage());
        }catch(ParseException e) {
            System.out.println("Erro no Parse"+e.getMessage());
        }
    }
}
