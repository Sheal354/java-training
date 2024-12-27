public class Student {
    String name;
    String group;
    int course;
    int mathGrade;
    int russianGrade;
    int englishGrade;
    int peGrade;

    Student(String name, String group, int course, int mathGrade, int russianGrade, int englishGrade, int peGrade) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.mathGrade = mathGrade;
        this.russianGrade = russianGrade;
        this.englishGrade = englishGrade;
        this.peGrade = peGrade;
    }

    public double getAverage() {
        return (double) (mathGrade + russianGrade + englishGrade + peGrade) / 4;
    }

    public void nextYear() {
        course++;
    }
}
