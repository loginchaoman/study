import java.util.Scanner; //导包
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int x = sc.nextInt();
        System.out.println(x);
        System.out.println("请输入二个整数:");
        int y = sc.nextInt();
        System.out.println(y);
        System.out.println("相加得");
        System.out.println(x+y);
        int max = (x > y) ? x:y;
        System.out.println("最大值：" + max);
    }
}
