package ref;

public class Method1 {

    public static void main(String[] args) {

        // class1.ClassStart2 리펙토링

        Student student1 = new Student(); // x001
        initStudent(student1, "학생1", 15, 90);

        Student student2 = new Student(); // x002
        initStudent(student2, "학생2", 16, 80);

        printStudent(student1);
        printStudent(student2);

    }

    // 객체 초기화 - 참조값을 전달하므로 메서드 내부에서 값 변경 가능
    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    // 객체 출력 - 참조값을 전달하므로 메서드 내부에서 값 읽기 가능
    static void printStudent(Student student) {
        System.out.println("이름:" + student.name + " 나이:" + student.age + " 성적:" + student.grade);
    }

}
