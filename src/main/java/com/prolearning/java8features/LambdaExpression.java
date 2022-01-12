package com.prolearning.java8features;

public class LambdaExpression {
    public static void main(String args[]){
        System.out.println("********************LambdaExpression****************");
        Runnable r = ()-> {
            System.out.println("Here you go ");
        };
        r.run();
        System.out.println("********************LambdaExpression****************");
    }
}
