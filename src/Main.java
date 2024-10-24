import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Kien", 30, "HT");
        Student student1 = new Student("Nam", 26, "HN");
        Student student2 = new Student("Anh", 38, "HT" );
        Student student3 = new Student("Tung", 38, "HT" );
        Student[] students = {student, student1, student2, student3};
        Arrays.sort(students);
        for(Student st : students){
            System.out.println(st.toString());
        }

        Comparator<Student> ageComparator = new Comparator<>() {
            public int compare(Student s1, Student s2) {
                return s1.getAge() - s2.getAge();
            }
        };
        Arrays.sort(students, ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(Student st : students){
            System.out.println(st);
        }
    }
}
