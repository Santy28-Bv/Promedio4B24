public class factorialrecursivo {

    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    public static void main(String[] args) {
        int result = factorial(6);
        System.out.println(result); 
    }
}