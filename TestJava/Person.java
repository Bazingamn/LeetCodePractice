package TestJava;

public class Person {
    private String name;
    private String gender;
    private Integer age;


    public static void main(String[] args) {
        Integer x = new Integer(123);
        Integer y = new Integer(123);
        System.out.println(x==y);

        Integer m = Integer.valueOf(123);
        Integer n = Integer.valueOf(123);
        System.out.println(m==n);
    }

}

