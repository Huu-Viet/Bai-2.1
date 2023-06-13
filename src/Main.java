import java.text.Normalizer;

public class Main {
    public static String removeAccent(String s) {
        String str = Normalizer.normalize(s, Normalizer.Form.NFD);
        str = str.replaceAll("\\p{M}", "");
        return str;
    }
    public static void main(String[] args) {
        String input = "Chuyển thành chuỗi không dấu";
        String output = removeAccent(input);
        System.out.println(output);
    }
}