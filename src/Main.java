public class Main {
    public static void main(String[] args) {
        Teacher teacher=new Teacher("Clara","Teacher","Language Academy");
        System.out.println(teacher+" "+teacher.getEducationCenterName());
        teacher.learn();teacher.walk();teacher.eat();teacher.teaching();
        System.out.println();

        Dancer dancer=new Dancer("Jyldyz","Dancer","EDG");
        System.out.println(dancer+" "+dancer.getGroupName());
        dancer.learn();dancer.walk();dancer.eat();dancer.dancing();
        System.out.println();

        Programmer programmer=new Programmer("Aliyar","Programmer","UNIQUE TECH");
        System.out.println(programmer+" "+programmer.getNameCompany());
        programmer.learn();programmer.walk();programmer.eat();programmer.coding();


    }
}