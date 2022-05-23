
import java.util.Scanner;

/**
 * @author zkc
 * @create 2022-05-17
 *
 * 实现一个计算器，具有加减乘除功能，并且能够循环接受新的数据，通过用户交互实现。
 * 实现思路：1、写4个方法
 *         2、利用循环+switch进行用户交互（计算完成后按q退出循环）
 *         3、传递需要操作的两个数（数据和操作符之间需要空格隔开）
 *         4、输出结果
 */
public class Caculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextFloat()) {
            float num1 = scanner.nextFloat();
            String operator = scanner.next();
            float num2 = scanner.nextFloat();
            switch (operator) {
                case "+":
                    System.out.println(add(num1, num2));
                    break;
                case "-":
                    System.out.println(minus(num1, num2));
                    break;
                case "*":
                    System.out.println(multiply(num1, num2));
                    break;
                case "/":
                    System.out.println(divide(num1, num2));
                    break;
            }
            System.out.println("Press 'q' to quit！");
        }
        scanner.close();
    }

    public static float add(float i, float j){
        return i + j;
    }

    public static float minus(float i, float j){
        return i - j;
    }

    public static float multiply(float i, float j){
        return i * j;
    }

    public static float divide(float i, float j){
        return i / j;
    }
}
