import java.util.Scanner;
public class DownCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String message;
        System.out.println("\n\nNhap chuoi can viet thuong");
        message = sc.nextLine();
        //Khai bao chuoi can nhap
        // chuyen chuoi message thanh char
        char[] charArray = message.toCharArray();
        for(int i = 0; i < charArray.length;i++){
            if(charArray[i] >= 65 && charArray[i] <= 90){
                charArray[i] += 32;
            }
        }
        message = String.valueOf(charArray);
        System.out.println("Chuoi sau khi viet thuong: \n"+ message);
    }
}