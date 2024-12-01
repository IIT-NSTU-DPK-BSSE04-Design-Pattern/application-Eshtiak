package delta;

// Common Interface
interface FileProcessor {
    void read(String filePath);
    void parse();
    void save(String outputPath);
}

// CSV Implementation
class CSVProcessor implements FileProcessor {
    @Override
    public void read(String filePath) {
        // Logic to read CSV file line by line
    }

    @Override
    public void parse() {
        // Logic to parse CSV data
    }

    @Override
    public void save(String outputPath) {
        // Save data to structured format
    }
}

// JSON Implementation
class JSONProcessor implements FileProcessor {
    @Override
    public void read(String filePath) {
        // Logic to read JSON file
    }

    @Override
    public void parse() {
        // Logic to parse JSON data
    }

    @Override
    public void save(String outputPath) {
        // Save data to structured format
    }
}

// XML Implementation
class XMLProcessor implements FileProcessor {
    @Override
    public void read(String filePath) {
        // Logic to read XML file
    }

    @Override
    public void parse() {
        // Logic to parse XML data
    }

    @Override
    public void save(String outputPath) {
        // Save data to structured format
    }
}

// Client Code
class DataProcessingPipeline {
    private FileProcessor processor;

    public DataProcessingPipeline(FileProcessor processor) {
        this.processor = processor;
    }

    public void process(String inputPath, String outputPath) {
        processor.read(inputPath);
        processor.parse();
        processor.save(outputPath);
    }
}
