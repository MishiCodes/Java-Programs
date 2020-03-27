package com.company;

public class TextPost extends Post{
    private String text;
    @Override
    public void display(){
        //super.display();
        System.out.println("This is Text");
        System.out.println(text);
    }

}
