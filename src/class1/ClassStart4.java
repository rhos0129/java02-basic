package class1;

public class ClassStart4 {

    public static void main(String[] args) {

        Student student1 = new Student(); // x001
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;
        System.out.println("student1 = " + student1); // class1.Student@b4c966a

        Student student2 = new Student(); // x002
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;
        System.out.println("student2 = " + student2); // class1.Student@1d81eb93

        // 배열에 객체 저장
        Student[] students = new Student[2]; // x005
        students[0] = student1; // x001
        students[1] = student2; // x002
        System.out.println("students = " + students); // [Lclass1.Student;@7291c18f
        System.out.println("students[0] = " + students[0]); // class1.Student@b4c966a (student1과 동일)
        System.out.println("students[1] = " + students[1]); // class1.Student@1d81eb93 (student2와 동일)

        System.out.println("이름:" + students[0].name + " 나이:" + students[0].age + " 성적:" + students[0].grade);
        System.out.println("이름:" + students[1].name + " 나이:" + students[1].age + " 성적:" + students[1].grade);

        // 변수에는 인스턴스 자체가 들어있는 것이 아니라 인스턴스의 위치를 가리키는 참조값이 들어있을 뿐이다.
        // 따라서 대입( = )시에 인스턴스가 복사되는 것이 아니라 참조값만 복사된다.

    }
}
