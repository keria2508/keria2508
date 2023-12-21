package DANCU;

public class Person {
    private String fullName;
    private int age;
    private String job;
    private String nationID;

    public Person(String fullName, int age, String job, String nationID){
        this.fullName = fullName;
        this.age = age;
        this.job = job;
        this.nationID = nationID;
    }
    public String getFullName(){
        return fullName;
    }
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getJob(){
        return job;
    }
    public void setJob(String job){
        this.job = job;
    }
    public String getNationID(){
        return nationID;
    }
    public void setNationID(String nationID){
        this.nationID = nationID;
    }
    public String toString(){
        return "Person {" + ", fullName='" + fullName + '\'' + ", age='" + age + '\'' + ", job='" + job + '\'' + ", nationID='" + nationID + '\'' + '}';
    }
}