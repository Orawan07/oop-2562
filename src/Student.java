public class Student {

    protected String studentId;
    protected String studentName;
    protected String faculty;
    protected String major;

    public void enrollment() {
        System.out.println("enrollment");
    }

    public void payment() {
        System.out.println("payment");
    }

    public void addCourse() {
        System.out.println("addCourse");
    }

    public void dropCourse() {
        System.out.println("dropCourse");
    }

    public void showdata(){
        System.out.println("ID : "+studentId);
        System.out.println("Name : "+studentName);
        System.out.println("Major : "+major);
        System.out.println("Faculty : "+faculty);
   
    }
    public static void main(String[] args) {
        Student orawan = new Student();
        System.out.println("Opject = "+orawan);
        orawan.studentId = "614234021";
        orawan.studentName = "Orawan";
        orawan.major = "Comsci";
        orawan.faculty = "Science and Technogogy";
        
    }
}

    
