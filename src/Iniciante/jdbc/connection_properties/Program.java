package Iniciante.jdbc.connection_properties;



import Iniciante.jdbc.connection_properties.db.Db;

import java.sql.Connection;

public class Program {
    public static void main(String[] args) {
        Connection conn= Db.getConnection();
        Db.closeConnection();
    }
}
