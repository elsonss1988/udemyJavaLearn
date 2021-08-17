package Iniciante.jdbc.connection_sql_operation.exception;

public class DbException extends RuntimeException{

    public DbException(){}
    public DbException(String message){
        super(message);
    }
}
