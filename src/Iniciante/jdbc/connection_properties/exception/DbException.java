package Iniciante.jdbc.connection_properties.exception;

public class DbException extends RuntimeException{

    public DbException(){}
    public DbException(String message){
        super(message);
    }
}
