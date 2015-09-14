import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Maria
 * on 18.08.2015.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(checkString(scanner.next().toCharArray()));
        scanner.close();
    }

    public static String checkString(char[] s) {
        int l = s.length;
        char[] values = new char[l];
        for (int i = 0; i < l; i++) {
            if (isLetter(s[i])){
                    //&& isLetter(s[l - 1 - i])) {
                values[i] = s[l - 1 - i];
            } else {
                values[i] = s[i];
            }

        }

        return new String(values);
    }

    public static boolean isLetter(Character ch) {
    //   Pattern p = Pattern.compile("[\\w&&[^_&&[^\\d]]]");
       Pattern p = Pattern.compile("[a-zA-ZА-Яа-я]");
        Matcher m = p.matcher(ch.toString());
        return m.matches();

    }

}
