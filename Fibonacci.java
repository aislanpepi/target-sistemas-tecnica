public class Fibonacci {
    public static boolean checkFibonacci(int n){
        int i = 0;
        while(true){
            i++;
            if(fibonacci(i) > n) return false;
            if(fibonacci(i) < n) continue;
            if (fibonacci(i) == n) return true;
        }
    }

    public static int fibonacci(int num){
        if (num <= 0) return -999;
        if(num == 1) return 0;
        if (num == 2) return 1;
        return fibonacci(num-1) + fibonacci(num-2);
    }

    public static void main(String[] args){
        int n = 2583;
        if(checkFibonacci(n)) System.out.println("Yes. The fibonacci sequence contain " + n);
        else System.out.println("No. The Fibonacci sequence doesn't contain " + n);
    }
}
