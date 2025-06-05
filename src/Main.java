// 함수 연습
public class Main {
    public static void printStudent(String name, int age) {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        System.out.println("**** 학생 정보 출력 ****");

        Main.printStudent("one", 35);
        printStudent("two", 22);
    }
}