package Iniciante.jdbc.connections4.model.Impl;

import Iniciante.jdbc.connection_properties.exception.DbException;
import Iniciante.jdbc.connection_sql_operation.db.Db;
import Iniciante.jdbc.connections4.model.Dao.SellerDao;
import Iniciante.jdbc.connections4.model.entities.Department;
import Iniciante.jdbc.connections4.model.entities.Seller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class SellerDaoJDBC implements SellerDao {

    private Connection conn;

    public SellerDaoJDBC(){}
    public SellerDaoJDBC(Connection conn){
        this.conn=conn;
    }
    @Override
    public void insert(Integer id) {

    }

    @Override
    public void update(Integer id) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Seller findById(Integer id) {
        PreparedStatement st =null;
        ResultSet rs =null;
        try{
            st=conn.prepareStatement(
                    "SELECT seller.*, department.Name as DepName "
                    +"FROM seller INNER JOIN department "
                    +"ON seller.DepartmentId=department.Id "
                    +"WHERE seller.Id=?"
            );
            st.setInt(1,id);
            rs=st.executeQuery();
            if(rs.next()){
                Department dep=instanceDepartment(rs);
                Seller obj=instanceSeller(rs,dep);

                return obj;
            }
            return null;
        }catch (SQLException e){
            throw new DbException(e.getMessage());
        }finally {
            Db.closeStatement(st);
            Db.closeResultSet(rs);
        }
    }

    private Seller instanceSeller(ResultSet rs, Department dep) throws SQLException {
        Seller obj=new Seller();
        obj.setId(rs.getInt("Id"));
        obj.setName(rs.getString("Name"));
        obj.setEmail(rs.getString("Email"));
        obj.setBaseSalary(rs.getDouble("BaseSalary"));
        obj.setBirthDate(rs.getDate("BirthDate"));
        obj.setDepartment(dep);
        return obj;
    }

    private Department instanceDepartment(ResultSet rs) throws SQLException {
        Department dep=new Department();
        dep.setId(rs.getInt("DepartmentId"));
        dep.setName(rs.getString("DepName"));
        Seller obj=new Seller();
        return dep;
    }

    @Override
    public List<Seller> findAll() {
        return null;
    }
}
