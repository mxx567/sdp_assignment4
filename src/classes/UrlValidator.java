package classes;

public class UrlValidator {
    private static final int MAX_LENGTH = 2048;

    public boolean isValid(String url){
        if(url == null || url.isBlank() || url.length() > MAX_LENGTH){
            return false;
        }

        String path = java.net.URI.create(url).getPath();

        if (path == null || path.endsWith("/")) {
            return false;
        }

        String fileName = path.substring(path.lastIndexOf('/') + 1);
        int dot = fileName.lastIndexOf('.');

        return dot > 0 && dot < fileName.length() - 1;
    }
}
