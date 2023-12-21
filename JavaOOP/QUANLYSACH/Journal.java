package QUANLYSACH;

public class Journal extends Book{
    private int numberIssue;
    private int monthIssue;

    public Journal (String id, String name, int number, int numberIssue, int monthIssue)
    {
        super(id, name, number, name, monthIssue);
        this.numberIssue = numberIssue;
        this.monthIssue = monthIssue;
    }
    public int getNumberIssue(){
        return numberIssue;
    }
    public void setNumberIssue(int numberIssue)
    {
        this.numberIssue = numberIssue;
    }
    public int getMonthIssue(){
        return monthIssue;
    }
    public int setMonthIssue(int monthIssue){
        return this.monthIssue = monthIssue;
    }
    @Override
    public String toString(){
        return "Journal {" + ", numberIssue= '" + numberIssue + '\'' +", monthIssue='" + monthIssue + '\'' + ", id='" + id + '\'' + ", name='" + name + '\'' + ", number='" + number + '\'' + '}';
    }
}
