package classes;

public class FileVerifier {

    public void verify(File file) {
        if (file == null || file.getSize() == 0) {
            throw new IllegalArgumentException(
                    "Downloaded file is missing or empty"
            );
        }
    }
}