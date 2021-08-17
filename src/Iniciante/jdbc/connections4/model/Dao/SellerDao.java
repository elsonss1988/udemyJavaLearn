package Iniciante.jdbc.connections4.model.Dao;

import Iniciante.jdbc.connections4.model.entities.Department;
import Iniciante.jdbc.connections4.model.entities.Seller;

import java.util.List;

public interface SellerDao {
    void insert(Integer id);
    void update(Integer id);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
}
