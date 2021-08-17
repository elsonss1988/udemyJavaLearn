package Iniciante.jdbc.connections2.exception;

public class DbException extends RuntimeException{
    public DbException(){}
    public DbException(String message){
        super(message);
    }
}
