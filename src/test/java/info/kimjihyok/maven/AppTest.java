package info.kimjihyok.maven;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    @Before
    @Override
    public void setUp() throws Exception {
        System.out.println("AppTest: Test Setup Beginning!");
    }

    @After
    @Override
    public void tearDown() throws Exception {
        System.out.println("AppTest: Test Setup Tearing Down!");
    }
}
