import java.util.ArrayList;
import java.util.HashMap;

public enum Discipline {
    MATH, GEOMETRY, ENGLISH, HISTORY;


    public void showStudentsInGroup( University u,Discipline d){

        for(Student st: u.students){
           if(st.studentsMarks.containsKey(d)) System.out.println(st.name);
        }

    }



}
