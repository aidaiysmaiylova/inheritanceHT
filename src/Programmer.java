public class Programmer extends Person{
    private String nameCompany;

    public Programmer(String name, String designation, String nameCompany) {
        super(name, designation);
        this.nameCompany = nameCompany;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public void learn(){
        System.out.println("Programming");
    }
    public void walk(){
        System.out.println("At park");
    }
    public void eat(){
        System.out.println("Coffee"+"Easy food");
    }
    public void coding(){
        System.out.println("Java");

    }
}
