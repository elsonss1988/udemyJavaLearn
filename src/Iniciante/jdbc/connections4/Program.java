package Iniciante.jdbc.connections4;

import Iniciante.jdbc.connections4.model.Dao.DaoFactory;
import Iniciante.jdbc.connections4.model.Dao.SellerDao;
import Iniciante.jdbc.connections4.model.entities.Department;
import Iniciante.jdbc.connections4.model.entities.Seller;

import java.util.Date;

public class Program {

    public static void main(String[] args) {
        Department obj= new Department(1, "Book");
        System.out.println(obj);

        Seller seller= new Seller(21,"Bob","bob@gmail.com",new Date(),3000.0,obj);
        System.out.println(seller);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller sellerFind =sellerDao.findById(3);

        System.out.println(sellerFind);
    }

}
