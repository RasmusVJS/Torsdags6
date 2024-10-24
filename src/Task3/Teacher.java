package Task3;

import java.util.ArrayList;

public class Teacher extends Person {
    ArrayList<String> currentCourses = new ArrayList<>();
    ArrayList<String> canTeach = new ArrayList<>();

    public Teacher(String name, ArrayList canTeach) {
        super(name);
        this.canTeach = canTeach;
    }

    @Override
    public boolean addCourse(String course) {
        if (canTeach.contains(course)) {
            currentCourses.add(course);
            return true;
        }
        return false;
    }
}
