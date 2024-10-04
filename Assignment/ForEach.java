import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + '}';
    }
}

class Utils {
    public static void addAll(Collection<Student> target, Collection<? extends Student> source) {
        target.addAll(source);
    }

    public static void forEach(Collection<Student> collection, Consumer<Student> action) {
        for (Student student : collection) {
            action.accept(student);
        }
    }
}

public class ForEach {
    public static void main(String[] args) {
        Collection<Student> students = new ArrayList<>();
        Collection<Student> newStudents = List.of(new Student("Alice", 20), new Student("Bob", 22));

        Utils.addAll(students, newStudents);
        
        System.out.println("Students: ");
        Utils.forEach(students, student -> System.out.println(student));
    }
}
