package QUANLYSACH;

public class Document {
    protected String id;
    protected String name;
    protected int number;

    public Document(String id, String name, int number){
        this.id = id;
        this.name = name;
        this.number = number;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number = number;
    }

}
