public class CharString {
    public static void main(String[] args){
        char ch = 'tung';
        String str = Character.toString(ch);// Su dung phuong thuc toString()
        System.out.println("Chuoi la: " + str);
        String str2 = String.valueOf(ch);// Su dung phuong thuc String.valueOf()
        System.out.println("Chuoi la " + str2);
    }
}