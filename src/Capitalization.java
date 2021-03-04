import java.nio.charset.StandardCharsets;

public class Capitalization {
    public static void main(String[] args) {
        System.out.println(capitalizeString("mon, mot 21"));
    }
    public static String capitalizeString(String str) {
        String retStr = str;
        try { // We can face index out of bound exception if the string is null
            retStr = str.substring(0, 1).toUpperCase() + str.substring(1, str.indexOf(" "))+str.substring(str.indexOf(" "),str.indexOf(" ")+1).toUpperCase();

        }catch (Exception e){}
        return retStr;
    }
}
