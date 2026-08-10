package dact.code.generator.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MultiFileReader {

    /**
     * Lists all file paths inside a target directory.
     */
    public List<String> listFilesInDirectory(String directoryPath) {
        try (Stream<Path> stream = Files.list(Paths.get(directoryPath))) {
            return stream
                .filter(file -> !Files.isDirectory(file)) // Filter out subfolders
                .map(Path::toString)
                .collect(Collectors.toList());
        } catch (IOException e) {
            return new ArrayList<>();
        }
    }

    /**
     * Reads the full text of a given file path.
     */
    public String readFileContent(String filePath) {
        try {
            return new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            return "// Error reading file: " + e.getMessage();
        }
    }
}