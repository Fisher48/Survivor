import java.io.*;
import java.util.*;

public class SearchFilesInDirectory {

    public static List<File> searchFiles(File path, List<File> files, int depth) {
        if (depth == 0) {
            return files;
        }
        File[] filesInDirectory = path.listFiles();
        if (filesInDirectory != null) {
            for (File file : filesInDirectory) {
                if (file.isFile()) {
                    files.add(file);
                } else if (file.isDirectory()) {
                    searchFiles(file, files, depth - 1);
                }
            }
        }
        return files;
    }

    public static List<File> search(File file, int depth) {
        List<File> files = new ArrayList<>();
        searchFiles(new File(String.valueOf(file)), files, depth);
        return files;
    }

}


