package classes;

public class UrlValidator {
    private static final int MAX_LENGTH = 2048;

    public static boolean isValid(String url){
        if(url == null || url.isBlank() || url.length() > MAX_LENGTH){
            return false;
        }

        return url.startsWith("http");
    }
}
