import java.util.Scanner;
public class StringName {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String name;
        System.out.println("\n\nNhap chuoi vao can in hoa");
        name = scan.nextLine();
        // Khai bao 1 mang, sau do su dung phuong thuc toCharArray()
        // de chuyen doi name thanh 1 mang kieu char
        char[] charArray = name.toCharArray();
        for(int i = 0; i < charArray.length; i++){
            if(charArray[i] >= 97 && charArray[i] <= 122){
                charArray[i] -= 32;
            }
        }
        name = String.valueOf(charArray);
        System.out.println("Chuoi sau khi doi: \n" + name);

    }
}