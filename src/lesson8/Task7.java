package lesson8;
//        7. In the Example class, implement a couple of equals / hashCode methods in accordance with the rules for implementing
//        these methods (check details with your favorite search engine).
//        Both the first and last strings should participate in the comparison using the equals method and the hashcode calculation.

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

//public class Example {
//    private final String first, last;
//
//    public Example(String first, String last) {
//        this.first = first;
//        this.last = last;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        return false;
//    }
//
//    @Override
//    public int hashCode() {
//        return 0;
//    }
//
//    public static void main(String[] args) {
//        Set<Example> s = new HashSet<>();
//        s.add(new Example("Donald", "Duck"));
//        System.out.println(s.contains(new Example("Donald", "Duck")));
//    }
//}
public class Task7 {
        private final String first, last;

    public Task7(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task7 task7 = (Task7) o;
        return first.equals(task7.first) && last.equals(task7.last);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, last);
    }

    public static void main(String[] args) {
        Set<Task7> s = new HashSet<>();
        s.add(new Task7("Donald", "Duck"));
        System.out.println(s.contains(new Task7("Donald", "Duck")));
    }
}
