import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Task1();
        Task4();
        Task3();
        Task2();








    }

    public static void Task1() {
        String Text = "eeqryq8e7ryq8weryqw8e7ywq87erywq8eyq7e887rye8q7w";
        int n = 0;
        char number;
        for(int i = 0;i < Text.length(); i++){
            number = Text.charAt(i);
            if(number == '1' || number == '2' || number == '3' || number == '4' || number == '5' || number == '6' || number == '7' || number == '8' || number == '9' || number == '0') {
                n++;
            }
        }
        System.out.println("В тексте есть " + n + " цифр");
    }

    public static void Task4 () {
        String Text = "На ферме было 3    собаки, 20 гусей, 50 куриц, 10 коров, 5 коней";
        int max = 0, curmax = 0;
        for (char c : Text.toCharArray()) {
            if (c == ' ') {
                curmax++;
                if (curmax > max) max = curmax;
            } else curmax = 0;
        }
        System.out.println(max);
    }

    public static void Task3() {
        String x = "парам пам  пам        пам            пам";

        while (x.contains("  ")) {
            String replace = x.replace("  ", " ");
            x = replace;
        }
        System.out.println(x);
    }

    public static void Task2() {
        String a = "asd11as145361d";
        StringBuilder stringBuilder = new StringBuilder(a);


        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(a);
        m.find();
        String result = a.substring(m.start(), m.end());
        System.out.println(result);

        m.find();

        result = a.substring(m.start(), m.end());
        System.out.println(result);
    }
    public static String reverseString(String s) {
        String r = "level";
        for (int i = s.length() - 1; i >= 0; --i) r += s.charAt(i);
        return r;
    }
    public static Boolean isPalindrome(String s) {
        return s.equals(reverseString(s));
    }
}
