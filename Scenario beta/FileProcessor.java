package beta;

public interface FileProcessor {
    void read(String filePath);
    void parse();
    void save(String outputPath);
}
