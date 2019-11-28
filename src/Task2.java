import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;

public class Task2 {
    public static void main (String[] args){
        {
            Comparator<Stationery> comp = new StationaryPriceComparator();
            TreeSet<Stationery> newbieKit = new TreeSet<Stationery>(comp);

            Pen stabilo = new Pen();
            Notebook spiralBook = new Notebook();

            newbieKit.add(stabilo);
            newbieKit.add(spiralBook);

            for (Stationery st : newbieKit) {
                System.out.println(st.toString());
            }
        }
        {
            Comparator<Stationery> comp = new TitleComparator();
            TreeSet<Stationery> newbieKit = new TreeSet<Stationery>(comp);

            Pen stabilo = new Pen();
            Notebook spiralBook = new Notebook();

            newbieKit.add(stabilo);
            newbieKit.add(spiralBook);

            for (Stationery st : newbieKit) {
                System.out.println(st.toString());
            }
        }
        Comparator<Stationery> comp = new PriceAndTitleComparator();
        TreeSet<Stationery> newbieKit = new TreeSet<Stationery>(comp);

        Pen stabilo = new Pen();
        Notebook spiralBook = new Notebook();

        newbieKit.add(stabilo);
        newbieKit.add(spiralBook);

        for(Stationery st: newbieKit){
            System.out.println(st.toString());
        }

       // Discipline d = Discipline.ENGLISH;
      //  HashMap<Discipline, String> teachers = new HashMap<>();
      //  teachers.put(Discipline.HISTORY, "овца");

      University uni = new University();
        Student pasha = new Student("PASHA");

        uni.students.add(pasha);
        uni.english.addStudentToDiscipline(pasha);
       // pasha.addStudentToDiscipline(Discipline.ENGLISH);

        System.out.println("English students:");
        uni.english.showStudentsInGroup(uni, uni.english);

        System.out.println("math students:");
        uni.math.showStudentsInGroup(uni, uni.math);

        System.out.println("pasha's disciplines and marks");

        uni.showDisciplinesAndMarksForStudent(pasha);
       // pasha.showDisciplinesForStudent();

       // pasha.addMark(Discipline.ENGLISH, 5.0);
       // pasha.addMark(Discipline.GEOMETRY, 3.0);
        uni.english.addMark(pasha,5);
        uni.history.addMark(pasha,4);
        System.out.println("pasha's disciplines and marks");
        uni.showDisciplinesAndMarksForStudent(pasha);

         //AtomicSub submarine = new AtomicSub();
          //submarine.swim();

    }
}
