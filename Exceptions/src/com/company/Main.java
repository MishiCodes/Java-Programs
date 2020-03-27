package com.company;

public class Main {


        public static void main(String[] args) {
            String s = null;
            for(int i=0; i<10; i++){
                try{
                    System.out.println(s.length());
                }
                catch(NullPointerException e){
                    System.out.println("The exception is "+e);
                }
            }

        }
    }

