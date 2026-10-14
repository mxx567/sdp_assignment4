package classes;

public class File {
    private final String name;
    private final String data;

    public File(String name, String data) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("File name cannot be empty");
        }
        if (data == null) {
            throw new IllegalArgumentException("File data cannot be null");
        }

        this.name = name;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public String getData() {
        return data;
    }

    public int getSize() {
        return data.length();
    }
}
