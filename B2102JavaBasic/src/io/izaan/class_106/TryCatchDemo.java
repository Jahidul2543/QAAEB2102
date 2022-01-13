package io.izaan.class_106;

public class TryCatchDemo {
    public static void main(String[] args) {
        int a = 2;
        int b = 0;
        // Which line or lines of code may have problem??? Can we identify???
        try {
            int result = a / b;
        }
        catch (ArithmeticException exception){
            exception.printStackTrace();
            String str = exception.getMessage();
            System.out.println(str);
        }
        // connect db -> Problems - Credentials, internet problem, Database server might be down.
        //System.out.println(result);
        System.out.println("This is last line");
    }
}
