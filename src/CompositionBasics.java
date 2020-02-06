import java.util.Collections;

public class CompositionBasics {
    public static void main(String[] args) {
        Person bobby = new Person();
//        System.out.println(bobby.getSalary());
//        System.out.println(bobby.getSchoolsList());
        Job j = new Job();
        j.setRole("Teacher");
        j.setSalary(10);
        j.setId(225);
        bobby.setJob(j);
        System.out.println(bobby.getJob().getSalary());





    }
}