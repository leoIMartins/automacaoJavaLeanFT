package pageobject;

import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.web.Browser;
import com.hp.lft.sdk.web.Link;
import com.hp.lft.sdk.web.XPathDescription;

public class MenuPrincipal extends ClasseBase{

	public MenuPrincipal(Browser browser) throws GeneralLeanFtException {
		super(browser);
	}
	
	Link menuDesktops = browser.describe(Link.class, new XPathDescription("//*/a[text()='Desktops']"));
	Link subMenuMac = browser.describe(Link.class, new XPathDescription("//*/a[text()='Mac (1)']"));
	
	public void selecionaMenuPrincipal(String categoria) throws GeneralLeanFtException {
		if(categoria == "Desktops") {
			menuDesktops.highlight();
			menuDesktops.click();
		}
	}
	
	public void selecionaSubMenu(String tipo) throws GeneralLeanFtException {
		if(tipo == "Mac") {
			subMenuMac.highlight();
			subMenuMac.click();
		}
	}
}
