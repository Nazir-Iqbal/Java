import java.util.*;


class Student{
    String Name;
    int age;
    public Student() {
    }
    public Student(String name) {
        Name = name;
    }
    public String getName() {
        return Name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        Name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [Name=" + Name + ", age=" + age + "]";
    }
}

class Demo{

    public static void main(String[] args){
        // optional class
        List<String> names = Arrays.asList("Nazir","Nitin","Ram","Mohit");

        List<String> ans = names.stream()
                            .map(String::toUpperCase) // method reference
                            .toList();
        System.out.println(ans);
        ans.forEach(System.out::println); // method reference


        List<Student> students = new ArrayList<>();

        // students = names.stream()
        //                 .map(name -> new Student(name))
        //                 .toList();

        students = names.stream()
                        .map(Student::new) // constructor reference
                        .toList();

        System.out.println(students);
    }

}