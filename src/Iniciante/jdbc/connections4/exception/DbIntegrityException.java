package Iniciante.jdbc.connections4.exception;

public class DbIntegrityException extends RuntimeException{
    public DbIntegrityException(String msg){
        super(msg);
    }
}
