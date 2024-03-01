import java.util.Scanner;

/**
 * java study process
 *
 * @author wang wei
 * date 2024/3/1
 */
public class StringToInteger {
    public static void main(String[] args) {
        System.out.println("Please input a string:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(Stoi(s));
    }

    public static int Stoi(String s) {
        int result = 0;
        int index = 0;
        int sign = 1;

        //去除前面的空格
        while (index < s.length() && s.charAt(index) == ' ')
            index++;
        if (s.charAt(index) == '-') {
            sign = 0;
            index++;
        }
        while (index < s.length()) {
            System.out.println(s.charAt(index));
            if(s.charAt(index)==' ')
            {
                index++;
                continue;
            }
            int num = s.charAt(index) - '0';
            if (num >= 0 && num <= 9)
                if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && num > Integer.MAX_VALUE % 10))
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                else
                    result = result * 10 + num;
            index++;
        }
            if(sign==0)
                return-result;
            else
                return result;
    }
}
