// 수강생이 될 수 있는 타입은 4가지 클래스 이다.
// Person의 하위 클래스로 Worker와 Student가 있고, Student의 하위 클래스로 HighStudent가 있다.
// 메인 클래스에는 와일드카드 타입 매개 변수로 수강생을 조회하는 프로그램을 만든다.

public class Course<T> {
    private String name;
    private T[] students;

    public Course(String name, int capacity) {
        this.name = name;
        students = (T[]) (new Object[capacity]);
    }

    public String getName() { return  name; }
    public T[] getStudents() { return students; }
    public void add(T t) {
        for (int i=0; i<students.length; i++) {
            if (students[i] == null) {
                students[i] = t;
                break;
            }
        }
    }

} 
