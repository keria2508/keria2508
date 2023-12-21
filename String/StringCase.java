import java.util.Scanner;
public  class StringCase {
    public static void main(String[] args){
        String name = "vuthanhtung";
        System.out.println("\n\nChuoi ban dau: " + name);
        // tạo hai chuỗi con firstLetter và remainingLetters
        // chuỗi firstLetter chứa chữ cái đầu tiên của  name
        String firstLetter = name.substring(0, 1);
        // chuỗi remainingLetters chứa phần còn lại của name
        String remainingLetters = name.substring(1, name.length());

        //sử dụng phương thức toUpperCase() để chuyển đổi firstLetter thành chữ in hoa
        firstLetter = firstLetter.toUpperCase();

        //sau khi chuyển đổi thì gộp chúng lại
        name = firstLetter + remainingLetters;
        System.out.println("Chuoi sau khi doi: " + name);
    }

}