package Iniciante.generics.map;

import java.util.Map;
import java.util.TreeMap;

public class ProgramMap {
    public static void main(String[] args) {
        Map<String, String> cookies= new TreeMap<>();
        cookies.put("username","Maria");
        cookies.put("email","maria@gnail.com");
        cookies.put("phone","99711122");

        cookies.remove("email");
        //Over about phone key
        cookies.put("phone","99711123");
        System.out.println("Contains phone key? "+ cookies.containsKey("phone"));
        System.out.println("Size "+ cookies.size());
        System.out.println("All Cookies");
        for(String key: cookies.keySet()){
            System.out.println(key+" :  "+cookies.get(key));
        }
    }
}
