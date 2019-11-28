import java.util.HashMap;

class Student {
    String name;
    HashMap<Discipline, Double> studentsMarks=new HashMap<>();

    public Student(String name){
        this.name  = name;

    }

    void showDisciplinesForStudent(){

        for (Discipline discipline : studentsMarks.keySet()) {
            System.out.println(discipline +" " + studentsMarks.get(discipline));
        }

    }

    void addStudentToDiscipline(Discipline discipline){
        studentsMarks.put(discipline, null);

    }

    void addMark(Discipline d, double mark){
        studentsMarks.put(d, mark);
    }

}
