import java.util.Arrays;

public class Strings1 {
    public static boolean valid_Anagram(String a,String b){
        char[] s=a.toCharArray();
        char[] t=b.toCharArray();
        Arrays.sort(s);
        Arrays.sort(t);
        return Arrays.equals(s,t);
    }
    public static void main(String[] args) {
        String a="anagram";
        String b="nagaram";
        System.out.println(a+" "+b);
        for (int i=0;i<=a.length()-1;i++){
            System.out.println(a.charAt(i));
        }
        System.out.println( valid_Anagram(a,b));
    }
}
