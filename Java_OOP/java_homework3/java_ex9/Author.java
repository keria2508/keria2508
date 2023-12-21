package Java1.Ex9;

public class Author {
    private String name;
    private String email;
    private String gender;

    public Author(String name, String email, String string){
        this.name = name;
        this.email = email;
        this.gender = string;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getGender(){
        return gender;
    }
    
    public String toString(){
        return "Author[name = " + name + ", email = " + email + ", gender = " + gender + "]";
    }

}
