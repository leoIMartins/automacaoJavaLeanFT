package runners;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import com.hp.lft.sdk.*;

import unittesting.*;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "com.hp.lft.cucumberv4.CucumberReporter" }, 
				glue = "steps",
				//tags = {"@funcionais" },
				monochrome = true,
				snippets = SnippetType.CAMELCASE,
				dryRun = false,
				strict = false,
				features = "src/test/resources/features")
public class LeanFtTest extends UnitTestClassBase {

	public LeanFtTest() {
		// Change this constructor to private if you supply your own public constructor
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		instance = new LeanFtTest();
		globalSetup(LeanFtTest.class);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		globalTearDown();
	}

	@Test
	public void test() throws GeneralLeanFtException {
	}
}