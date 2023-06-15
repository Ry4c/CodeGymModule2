package AccessModifier;

public class TestCircle {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("Doe");
        stu1.setClasses("C03");
        System.out.println(stu1.getName() + '\t'+ stu1.getClasses());
    }

}
