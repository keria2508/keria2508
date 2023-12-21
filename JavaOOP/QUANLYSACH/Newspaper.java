package QUANLYSACH;

public class Newspaper extends Document{
    private int dayIssue;
    public Newspaper (String id, String name, int number, int dayIssue){
        super(id, name, number);
        this.dayIssue = dayIssue;
    }
    public int getDayIssue(){
        return dayIssue;
    }
    public void setDayIssue(int dayIssue){
        this.dayIssue = dayIssue;
    }
    @Override
    public String toString(){
        return "Newspapaer {" + ", dayIssue= '" + dayIssue + '\'' + ", id='" + id + '\'' + ", name='" + name + '\'' + ", number='" + number + '\'' + '}';

    }
}
