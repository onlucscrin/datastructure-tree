package com.prolearning.java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

class user{
    String userName;
    String pwd;
    user(String userName, String pwd){
        this.userName = userName;
        this.pwd = pwd;
    }
}
public class Predicates {
     public static void main(String args[]){
       System.out.println("********************Predicates****************");
         Predicate<Integer> p = (Integer a)->{
             if(a>0)
                 return false;
             return true;
         };
       System.out.println("check 23: " + p.test(23));
       System.out.println("check 23: " + p.test(-23));

       Predicate<Integer> p2 = p.or(p);
       Predicate<Integer> p3 = p.and(p2);
       System.out.println("Predicates or: "+ p2.test(-2));
         System.out.println("Predicates and : "+ p3.test(2));

         String[] names={"Durga","",null,"Ravi","","Shiva",null};
         removeNullEmptyString(names);
         authenticate();
       System.out.println("********************Predicates****************");

    }
    public static void removeNullEmptyString(String[] args){
         Predicate<String> isNullEmpty = (String s)->{
             if(s=="" || s==null)
                 return true;
             return false;
         };
         for(int i=0;i<args.length;i++){
             System.out.println(" Arguments :" + args[i] + ", is null or empty :" + isNullEmpty.test(args[i]));
         }
    }

    public static void authenticate(){
         String name = "vinutha";
         String pwd = "vinutha";
         user user1 = new user("vinutha","vinutha");
         user user2 = new user(name, pwd);

         Predicate<user> userPredicate = (user) -> {return  user.userName=="vinutha" && user.pwd=="vinutha";} ;

         System.out.println(userPredicate.test(user1));
        System.out.println(userPredicate.test(user2));
    }
}
