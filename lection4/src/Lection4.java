import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lection4 {
    public static void main(String[] attrs) {
        List<Student> studentList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во студентов:");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.println("Введите имя, группу, курс и оценки(математика, русский язык, английский язык, физ.культура)" +
                    " студента:");
            studentList.add(new Student(sc.next(), sc.next(),
                    sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
        while(true) {
            System.out.println("Введите номер операции:");
            System.out.println("1 - отчисление 2 - список студентов");
            switch (sc.nextInt()) {
                case 1:
                    expell(studentList);
                    break;
                case 2:
                    System.out.print("Введите номер курса: ");
                    printStudents(studentList, sc.nextInt());
                    break;
                default:
                    System.out.println("Неизвестный номер операции");
                    break;
            }
        }
    }

    public static void expell(List<Student> students) {
        System.out.println("Отчислены:");
        List<Student> expelledStudents = students.stream()
                .filter(student -> student.getAverage() < 3)
                .peek(student -> System.out.println(student.name + " " + student.group + "-"
                        + student.course))
                .toList();

        students.removeAll(expelledStudents);
        students.forEach(Student::nextYear);
    }

    public static void printStudents(List<Student> students, int course) {
        students.stream()
                .filter(student -> student.course == course)
                .forEach(student -> System.out.println(student.name + " " + student.group + "-"
                + student.course));
    }
}
