import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import java.util.*;

public class SearchFilesInDirectoryTest {

    @Test
    public void SampleTest(){
        File path = new File("D:\\Downloads");
        List<File> list = new ArrayList<>();
        assertEquals(SearchFilesInDirectory.searchFiles(path,list,2),SearchFilesInDirectory.searchFiles(path,list,2));
    }

}