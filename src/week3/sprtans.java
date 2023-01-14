package week3;

import java.util.List;
import java.util.Map;

public class sprtans {
    public static void main(String[] args) {
        List<Map<String, Object>> spartans = officeHr.getSpartans();

        spartans.forEach((k)-> {
            if ((Integer)k.get("id")<6){
                System.out.println(k);
            }
        } );
        System.out.println("-------------------");
        for (Map<String, Object> spartan : spartans) {
           if( spartan.get("gender").equals("Male")){
               System.out.println(spartan);
           }
        }


    }


    }
