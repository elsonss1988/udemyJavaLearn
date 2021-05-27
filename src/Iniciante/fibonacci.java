package Iniciante;

public class fibonacci {
    public static void main(String[] args) {
        Integer n = 5;
        fibonacci a= new fibonacci();
        a.fibona(5);


    }

    public int fibona(Integer n) {

        System.out.println("Called");
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fibona(n - 1) + fibona(n - 2);
    }
}