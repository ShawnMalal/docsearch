import static org.junit.Assert.*;
import org.junit.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.beans.Transient;
import java.io.IOException;

public class TestDocSearch {
	@Test 
	public void testIndex() throws URISyntaxException, IOException {
    Handler h = new Handler("./written_2/");
    URI rootPath = new URI("http://localhost/");
    assertEquals("There are 224 total files to search.", h.handleRequest(rootPath));
	}
	@Test 
	public void testSearch() throws URISyntaxException, IOException {
    Handler h = new Handler("./written_2/");
    URI rootPath = new URI("http://localhost/search?q=hello");
    String expect = "Found 2 paths: ./written_2/travel_guides/berlitz1/WhereToHongKong.txt ./written_2/travel_guides/berlitz1/WhereToItaly.txt";
    }
    @Test 
	public void testSearch1() throws URISyntaxException, IOException {
    Handler h = new Handler("./written_2/");
    URI rootPath = new URI("http://localhost/search?q=");
    String expect = "Found 4 paths: ./written_2/travel_guides/berlitz1/WhereToFrance.txt ./written_2/travel_guides/berlitz2/Budapest-WhereoGo.txt ./written_2/travel_guides/berlitz2/California-WhereToGo.txt ./written_2/travel_guides/berlitz2/Nepal-WhereToGo.txt";
}
}




