import java.util.ArrayList;

public class University {
    public Discipline math = new Discipline<Double>(Discipline.Subjects.MATH, "Math");
    public Discipline geometry = new Discipline<Double>(Discipline.Subjects.GEOMETRY, "Geometry");
    public Discipline english = new Discipline<Integer>(Discipline.Subjects.ENGLISH, "English");
    public Discipline history = new Discipline<Integer>(Discipline.Subjects.HISTORY, "History");
    ArrayList<Student> students= new ArrayList<>();
    ArrayList<Discipline> disciplines =new ArrayList<>();


    public  University(){
        disciplines.add(math);
        disciplines.add(geometry);
        disciplines.add(english);
        disciplines.add(history);
    }

    void showDisciplinesAndMarksForStudent( Student student){

        for (Discipline discipline : disciplines) {
            if(discipline.studentsMarks.containsKey(student)) System.out.println( discipline +" "+ discipline.studentsMarks.get(student));
        }

    }

}
