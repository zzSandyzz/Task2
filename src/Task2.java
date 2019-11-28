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

        pasha.addStudentToDiscipline(Discipline.ENGLISH);

        System.out.println("English students:");
        Discipline.ENGLISH.showStudentsInGroup(uni, Discipline.ENGLISH);

        System.out.println("math students:");
        Discipline.ENGLISH.showStudentsInGroup(uni, Discipline.MATH);

        System.out.println("pasha's disciplines and marks");
        pasha.showDisciplinesForStudent();

        pasha.addMark(Discipline.ENGLISH, 5.0);
        pasha.addMark(Discipline.GEOMETRY, 3.0);

        System.out.println("pasha's disciplines and marks");
        pasha.showDisciplinesForStudent();


         //AtomicSub submarine = new AtomicSub();
          //submarine.swim();

    }
}
