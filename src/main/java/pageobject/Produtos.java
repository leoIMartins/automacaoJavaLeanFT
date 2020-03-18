package pageobject;

import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.web.Browser;
import com.hp.lft.sdk.web.Button;
import com.hp.lft.sdk.web.ButtonDescription;
import com.hp.lft.sdk.web.WebElement;
import com.hp.lft.sdk.web.WebElementDescription;
import com.hp.lft.sdk.web.XPathDescription;

public class Produtos extends ClasseBase {

	public Produtos(Browser browser) throws GeneralLeanFtException {
		super(browser);
	}
	
	Button btnAddToCart = browser.describe(Button.class, new ButtonDescription.Builder()
			.buttonType("button")
			.name(" Add to Cart")
			.tagName("BUTTON").build());

	Button btnCarrinho = browser.describe(Button.class, new XPathDescription("//*/div[@id='cart']/button"));
	
	WebElement btnCheckout1 = browser.describe(WebElement.class, new WebElementDescription.Builder()
			.innerText("Checkout")
			.tagName("STRONG").build());
	
	Button btnCheckout2 = browser.describe(Button.class, new ButtonDescription.Builder()
			.buttonType("")
			.name("Checkout")
			.tagName("A").build());
	
	public void adicionaProdutoAoCarrinho() throws GeneralLeanFtException {
		btnAddToCart.highlight();
		btnAddToCart.click();
	}
	
	public void clicaNoCarrinho() throws GeneralLeanFtException {
		btnCarrinho.highlight();
		btnCarrinho.click();
	}
	
	public void clicaEmCheckout() throws GeneralLeanFtException {
		btnCheckout1.highlight();
		btnCheckout1.click();
		btnCheckout2.highlight();
		btnCheckout2.click();
	}
}
