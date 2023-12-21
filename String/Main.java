
public  class Main {
    public static void main(String[] args){
        String line = "V u T h a n h T u n g";
        System.out.println("\n\nChuoi ban dau " + line);
        line = line.replaceAll(" ", "");
        System.out.println("Chuoi sau khi xoa khoang trang " + line);
    }
}