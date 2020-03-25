
import java.util.Arrays;

public class WildCardExample {

    public static void main(String[] args) {
        Course<Person> personCourse = new Course<Person>("일반인 과정", 5);
        personCourse.add(new Person("일반인"));
        personCourse.add(new Worker("직장인"));
        personCourse.add(new Student("학생"));
        personCourse.add(new HighStudent("고등학생"));

        Course<Worker> workerCourse = new Course<Worker>("직장인 과정", 5);
        workerCourse.add(new Worker("직장인"));

        Course<Student> studentCourse = new Course<Student>("학생 과정", 5);
        studentCourse.add(new Student("학생"));
        studentCourse.add(new HighStudent("고등학생"));

        Course<HighStudent> highStudentCourse = new Course<HighStudent>("고등학생 과정", 5);
        highStudentCourse.add(new HighStudent("고등학생"));

        registerCourse(personCourse);
        registerCourse(workerCourse);
        registerCourse(highStudentCourse);
        System.out.println();

        // 학생 과정 , 직장인 과정은 이렇게 나눠서 분기 할 수 있다.
        // 여기서 와일드카드 기법의 이점은, 타입 파라미터의 제한이 없이 유연하게 모든 클래스와 인터페이스 타입을
        // 매개 값으로 활용할 수 있는 점이 아닐까 생각한다.

        registerCourseStudent(studentCourse);
        registerCourseStudent(highStudentCourse);

        registerCourseWorker(personCourse);
        registerCourseWorker(workerCourse);
    }

    // Course<?> : 모든 클래스와 인터페이스를 파라미터로 받는데에 제한 없음
    // Course<? extends 상위타입> : 상위 타입이나 하위 타입만 파라미터로 받는다. 수강생은 Student와 HighStudent만 될 수 있다.
    // Course<? super 하위타입> : 수강생은 Worker와 Person만 될 수 있다.

    public static void registerCourse(Course<?> course) {
        System.out.println(course.getName() + Arrays.toString(course.getStudents()));
    }

    public static void registerCourseStudent(Course<? extends Student> course) {
        System.out.println(course.getName() + Arrays.toString(course.getStudents()));
    }

    public static void registerCourseWorker(Course<Worker> course) {
        System.out.println(course.getName() + Arrays.toString(course.getStudents()));
    }

} 
