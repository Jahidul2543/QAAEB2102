package io.izaan.class_107.inheritancedemo;

public class Nokia3600 extends Nokia1100 {

    public static void main(String[] args) {
        Nokia3600 nokia3600 = new Nokia3600();
        nokia3600.call();
    }

    public void camera(){
        System.out.println("Camera method in Nokia3600");
    }
    public void multiMedia(){
        System.out.println("multiMedia method in Nokia3600");
    }
}
