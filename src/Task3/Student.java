package Task3;

import java.util.ArrayList;

public class Student extends Person {
    ArrayList<String> currentCourses = new ArrayList<>();
    ArrayList<String> passedCourses = new ArrayList<>();

    public Student(String name, ArrayList passedCourses) {
        super(name);
        this.passedCourses = passedCourses;
    }

    @Override
    public boolean addCourse(String course) {
        if (!passedCourses.contains(course)) {
            currentCourses.add(course);
            return true;
        }
        return false;
    }
}
