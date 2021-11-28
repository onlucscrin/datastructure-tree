package com.prolearning.datastructure.string;

public class S925LongPressedName {
    public static void main(String args[]){
        System.out.println("***********************S925LongPressedName***********************");

        System.out.println("***********************S925LongPressedName***********************");
    }
    public boolean isLongPressedName(String name, String typed) {
        for(int i=0, j=0;i<name.length();i++) {
            char chl = name.charAt(i);
            char chR = typed.charAt(j);
            System.out.println(" chl :"+ chl+ ", chR : "+ chR);
            if(chl!=chR) {
                while(j+1<typed.length() && chl!=chR){
                    j++;
                    chR = typed.charAt(j);
                }
                if(chl!=chR)
                    return false;
            }
        }
        return true;
    }
}
