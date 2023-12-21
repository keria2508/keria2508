package Java1.Ex9;

public class TestMain {
    public static void main(String[] args){
        Author ahTesk = new Author("Tan Ah Teek", "ahteck@nowhere.com","male" );
        System.out.println(ahTesk);
        ahTesk.setEmail("paulTan@nowhere.com");
        System.out.println("name is: " + ahTesk.getName());
        System.out.println("email is: " + ahTesk.getEmail());
        System.out.println("gender is: " + ahTesk.getGender());
    }
}
