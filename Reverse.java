import java.util.Arrays;

public class Reverse {
    public static String reverseString(String s){
        char[] stringAr = s.toCharArray();
        char[] reverse = new char[stringAr.length];
        int count = 0;
        for(int i = stringAr.length-1;i >= 0;i--){
            reverse[count] = stringAr[i];
            count++;
        }
        return Arrays.toString(reverse);
    }

    public static void main (String[] args){
        String s = "Aislan";
        System.out.println(reverseString(s));
    }
}
