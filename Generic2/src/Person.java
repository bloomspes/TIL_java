public class Person<T> {
    private String name;
    private T[] students;

    public Person(String name) {
        this.name = name;
        students = (T[]) (new Object[capacity]);
    }


    public String getName() { return  name; }
    public T[] getStudents() { return students; }

    // 배열에 비어있는 부분에 수강생을 추가해주는 메소드. append()와 같다.
    public void add(T t) {
        for (int i=0; i<students.length; i++) {
            if (students[i] == null) {
                students[i] = t;
                break;
            }
        }
    }

}