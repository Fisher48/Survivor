import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;

public class SearchFilesInDirectoryTest {

    @Test
    public void SampleTest(){
        File path = new File("D:\\Downloads");
        assertEquals(SearchFilesInDirectory.search(path,1),SearchFilesInDirectory.search(path,1));
    }

}