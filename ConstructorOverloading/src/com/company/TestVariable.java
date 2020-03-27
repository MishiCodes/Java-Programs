package com.company;

public class TestVariable {
    int distance = 100;
    String place = "Stockholm";
    TestVariable (int speed, String place){
        this.distance = speed;
    }
    TestVariable (){
        //Default Constructor
        distance = 300;
    }

    public static void main(String[] args) {
        TestVariable test = new TestVariable(500, "KTH");
        System.out.println("Distance: "+test.distance +" "+"Place: "+test.place);
        TestVariable test1 = new TestVariable();
        System.out.println("Distance: "+test1.distance +" "+"Place: "+test1.place);
    }
}
