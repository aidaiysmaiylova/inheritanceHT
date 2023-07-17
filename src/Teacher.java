public class Teacher extends Person{
   private String educationCenterName;

    public Teacher(String name, String designation, String educationCenterName) {
        super(name, designation);
        this.educationCenterName = educationCenterName;
    }

    public String getEducationCenterName() {
        return educationCenterName;
    }

    public void setEducationCenterName(String educationCenterName) {
        this.educationCenterName = educationCenterName;
    }

    public void learn(){
        System.out.println("Lesson");
    }
    public void walk(){
        System.out.println("At school");
    }
    public void eat(){
        System.out.println("Sandwich");
    }
    public void teaching(){
        System.out.println("English");

        }
    }

