package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        ArrayList<String> courses1 = new ArrayList<>();
        ArrayList<String> courses2 = new ArrayList<>();
        courses1.add("Java 1.0");
        courses1.add("Computer Science");
        courses2.add("Algorithms");
        courses2.add("Computer Science");
        Student student1 = new Student("Rasmus", courses1);
        Student student2 = new Student("Jeppe", courses2);
        Teacher teacher1 = new Teacher("Signe", courses1);
        Teacher teacher2 = new Teacher("Tine", courses2);
        persons.add(student1);
        persons.add(student2);
        persons.add(teacher1);
        persons.add(teacher2);
        for (Person person : persons) {
            if(!person.addCourse("Java 1.0")){
                if(person instanceof Teacher){
                    System.out.println(person.getName() + " kan ikke undervise i dette fag.");
                }
                else if(person instanceof Student){
                    System.out.println(person.getName() + " har allerede bestået dette kursus.");
                }
            }
        }
    }
}
