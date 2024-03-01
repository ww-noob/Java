import java.util.Scanner;

/**
 * java study process
 *
 * @author wang wei
 * date 2024/2/29
 */
public class ReverseInteger {
    public static void main(String[] args){
        System.out.println("Please input a integer");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(reverse(a));
    }
    public static int reverse(int a){
        int result=0;
        while (a!=0){
            int number = a%10;
            a = a/10;
            if(result>Integer.MAX_VALUE/10||(result==Integer.MAX_VALUE/10&&number>Integer.MAX_VALUE%10))
                return 0;
            if(result<Integer.MIN_VALUE/10||(result==Integer.MIN_VALUE/10&&number<Integer.MIN_VALUE%10))
                return 0;
            result=result*10+number;
        }
        return result;
    }
}
