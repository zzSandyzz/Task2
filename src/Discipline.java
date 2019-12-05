import java.util.HashMap;

public class Discipline<T> {
    public enum Subjects {MATH, GEOMETRY, ENGLISH, HISTORY;}

    Subjects s;
    String name;
    HashMap<Student, T> studentsMarks = new HashMap<>();

    public Discipline(Subjects s, String name) {
        this.s = s;
        this.name = name;
    }

    public String toString() {

        return name;
    }

    public void showStudentsInGroup(University u, Discipline d) {

        for (Student st : studentsMarks.keySet()) {
            System.out.println(st.name);
        }

    }

    void addMark(Student s, T mark) {
        studentsMarks.put(s, mark);
    }

    void addStudentToDiscipline(Student s) {
        studentsMarks.put(s, null);

    }


}
