package Iniciante.jdbc.connections4.model.Dao;

import Iniciante.jdbc.connection_insert.db.Db;
import Iniciante.jdbc.connections4.model.Impl.SellerDaoJDBC;

public class DaoFactory {
    public  static SellerDao createSellerDao(){
        return new SellerDaoJDBC(Db.getConnection());
    }
}
