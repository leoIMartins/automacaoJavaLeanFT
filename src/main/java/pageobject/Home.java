package pageobject;

import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.web.Browser;
import com.hp.lft.sdk.web.Link;
import com.hp.lft.sdk.web.XPathDescription;

public class Home extends ClasseBase {

	Link txtNinjaStore = browser.describe(Link.class, new XPathDescription("//*/a[text()='The Ninja Store']"));

	public Home(Browser browser) throws GeneralLeanFtException {
		super(browser);
	}

	public void verificaPaginaInicial() throws GeneralLeanFtException {
		txtNinjaStore.exists();
		txtNinjaStore.highlight();
	}
}
