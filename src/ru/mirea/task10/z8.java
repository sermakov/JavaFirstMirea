public class z8
{
    private String stroka;
    static boolean isz8(String str) {
        if (str.length() <= 1)  return true;

        if (str.charAt(0) != str.charAt(str.length() - 1))  return false;

        return isz8(str.substring(1, str.length() - 1));
    }
}