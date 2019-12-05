
import java.util.Comparator;

import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {
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

        for (Stationery st : newbieKit) {
            System.out.println(st.toString());
        }


        University uni = new University();
        Student pasha = new Student("PASHA");
        Student katya = new Student("KATYA");

        uni.students.add(pasha);
        uni.english.addStudentToDiscipline(pasha);


        System.out.println("English students:");
        uni.english.showStudentsInGroup(uni, uni.english);

        System.out.println("math students:");
        uni.math.showStudentsInGroup(uni, uni.math);

        System.out.println("pasha's disciplines and marks");

        uni.showDisciplinesAndMarksForStudent(pasha);

        uni.english.addMark(pasha, 5.0);
        uni.history.addMark(pasha, 4);

        System.out.println("pasha's disciplines and marks");
        uni.showDisciplinesAndMarksForStudent(pasha);

        uni.geometry.addMark(katya, Double.POSITIVE_INFINITY);

        System.out.println("katya's disciplines and marks");
        uni.showDisciplinesAndMarksForStudent(katya);

        System.out.println("geometry students: ");
        uni.geometry.showStudentsInGroup(uni, uni.geometry);

        AtomicSub submarine = new AtomicSub();
        submarine.swim();

    }
}
