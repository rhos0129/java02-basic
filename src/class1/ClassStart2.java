package class1;

public class ClassStart2 {

    public static void main(String[] args) {

        // 이전 문제에 배열을 적용하여 학생이 추가되어도 코드 변경을 최소화 해보자.

        String[] studentNames = {"학생1", "학생2", "학생3", "학생4"};
        int[] studentAges = {15, 16, 17, 20};
        int[] studentGrade = {90, 80, 70, 60};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름:" + studentNames[i] + " 나이:" + studentAges[i] + " 성적:" + studentGrade[i]);
        }

        // 특정 학생의 데이터를 변경할 때 실수할 가능성이 매우 높다.
        // 이 코드는 컴퓨터가 볼 때는 아무 문제가 없지만, 사람이 관리하기에는 좋은 코드가 아니다.

    }

}
