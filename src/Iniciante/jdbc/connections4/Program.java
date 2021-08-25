package Iniciante.jdbc.connections4;

import Iniciante.jdbc.connections4.model.Dao.DaoFactory;
import Iniciante.jdbc.connections4.model.Dao.SellerDao;
import Iniciante.jdbc.connections4.model.entities.Department;
import Iniciante.jdbc.connections4.model.entities.Seller;

import java.sql.SQLOutput;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Department obj= new Department(1, "Book");
        System.out.println(obj);

        Seller seller= new Seller(21,"Bob","bob@gmail.com",new Date(),3000.0,obj);
        System.out.println(seller);

        System.out.println("=== Test1: seller findById ====");
        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller sellerFind =sellerDao.findById(3);
        System.out.println(sellerFind);

        System.out.println("\n === Teste 2: seller findByDepartment");
        Department department= new Department(2,null);
        List<Seller> list= sellerDao.findByDepartment(department);
        list.stream().forEach(System.out::println);

        System.out.println("\n === Teste 3:  findByDepartment");
        List<Seller> listAll=sellerDao.findAll();
        listAll.stream().forEach(System.out::println);

        System.out.println("\n Test 4 seller insert ======");
        Seller newSeller= new Seller(null,"Greg","greg@email.com",new Date(),4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("inserted new Seller id: "+newSeller.getId());

        System.out.println("\n Test 5 seller Update ======");
        seller = sellerDao.findById(1);
        seller.setName("Martha Waine");
        sellerDao.update(seller);
        System.out.println("Update data");


        System.out.println("\n Test 6 seller delete ======");
        System.out.println("Enter id for delete test:");
        int id=sc.nextInt();
        System.out.println(id);
        sellerDao.deleteById(id);
        System.out.println("Delete completed");
        sc.close();

    }

}
