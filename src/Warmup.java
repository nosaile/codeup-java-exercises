public class Warmup {


    private static String backwards = "";
    public static boolean isPalindrome(String isIt) {
        for (int i = (isIt.length() - 1); i >= 0; --i) {
            backwards = backwards + isIt.charAt(i);
        }
        return isIt.equals(backwards);
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("radar"));
    }
}