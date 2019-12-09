public class TestStudent {

    public static void main(String[] args) {
        Student orawan = new Student();
        System.out.println("Opject = " + orawan);
        orawan.studentId = "614234021";
        orawan.studentName = "Orawan";
        orawan.major = "Comsci";
        orawan.faculty = "Science and Technology";
        orawan.showdata();
        orawan.enrollment();
        orawan.dropCourse();

        Student benz = new Student();
        benz.studentId = "614234011";
        benz.studentName = "Miss Benz";
        benz.major = "IT";
        benz.faculty = "Science and Technology";
        System.out.println("Objet = " + benz);
        benz.showdata();

        GraduateStudent man = new GraduateStudent();
        man.studyLevel = "Year2";
        man.thesisAdviser = "Barbie";
        man.thesisExamination();
        man.oralExamination();
    }
}
