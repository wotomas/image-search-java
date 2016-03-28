package info.kimjihyok.maven.unit;

import info.kimjihyok.maven.AppTest;
import info.kimjihyok.maven.utils.TestConstants;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.entity.StringEntity;
import org.apache.http.localserver.LocalTestServer;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpRequestHandler;
import org.junit.After;
import org.junit.Before;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by jkimab on 2016. 3. 28..
 */
public class CustomSearchTest extends AppTest {
    private LocalTestServer server = new LocalTestServer(null,null);
    private HttpRequestHandler handler = new HttpRequestHandler() {
        public void handle(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext) throws HttpException, IOException {
            //System.out.println("Should print JSON return");
            httpResponse.setEntity(new StringEntity(TestConstants.STRING_RESPONSE));
        }
    };

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public CustomSearchTest(String testName) {
        super(testName);
    }

    @Before
    public void setUp() throws Exception {
        super.setUp();
        server.start();
        server.register("/customsearch/*", handler);

        String serverURL = "http:/" + server.getServiceAddress() + "/customsearch/";
        //System.out.println("Server URL is: " + serverURL);
        CustomSearch.initialize(TestConstants.TEST_API, TestConstants.TEST_ENGINE_KEY, serverURL);
    }

    @After
    public void tearDown() throws Exception {
        super.tearDown();
        server.stop();
    }

    public void testApiKey() {
        assertEquals(TestConstants.TEST_API, CustomSearch.getApiKey());
    }

    public void testEngineKey() {
        assertEquals(TestConstants.TEST_ENGINE_KEY, CustomSearch.getSearchEngineKey());
    }

    public void testSearchResultSize() {
        assertEquals(10, CustomSearch.image("dog").size());
    }

    public void testSearchResultIsImage() {
        ArrayList<String> list = CustomSearch.image("dog");
        for(String url: list) {
            boolean result = true;
            for (String safe_string : TestConstants.SAFE_IMAGE_STRING) {
                if(url.contains(safe_string)) {
                    result = false;
                }
            }

            if(result) {
                assertFalse("Image returned URL(" + url + ") should contain .gif .png .jpg or .ashx", true);
            } else {
                System.out.println(url + " is safe");
            }
        }
    }
}