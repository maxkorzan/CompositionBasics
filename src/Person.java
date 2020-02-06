import java.util.ArrayList;
import java.util.Collections;

public class Person {
    //composition has-a relationship
    private Job job;
    private Education education;


    public Person(){
//        this.job=new Job();
//        job.setSalary(1000L);


//        ArrayList<String> list = new ArrayList<>();
       // Collections.addAll(education.getSchoolsList(),"school 1","school 2","school 3","school 4","school 5","school 6","school 7","school 8","school 9","school 10");
        //System.out.println(list);
//
//        this.education = new Education();
//        education.setSchoolsList(list);

    }


//    public long getSalary() {
//        return job.getSalary();
//    }

    public ArrayList<String> getSchoolsList(){
        return education.getSchoolsList();
    }

    public void setSalaryforThisDude(Job job, int salary) {
        job.setSalary(salary);
        this.job = job;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }
}