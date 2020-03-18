package steps;

import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.web.Browser;
import com.hp.lft.sdk.web.BrowserFactory;
import com.hp.lft.sdk.web.BrowserType;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageobject.Home;
import pageobject.MenuPrincipal;
import pageobject.Produtos;

public class LeanFtStepDefinitions {

	Browser browser;
	Home home;
	MenuPrincipal menuPrincipal;
	Produtos produtos;
	
	public LeanFtStepDefinitions() throws GeneralLeanFtException {

	}

	@Dado("que o usuário acessa o sistema")
	public void que_o_usuário_acessa_o_sistema() throws GeneralLeanFtException {
		browser = BrowserFactory.launch(BrowserType.CHROME);
		browser.navigate("http://tutorialsninja.com/demo/index.php?route=common/home");
	}

	@Então("é exibida a tela inicial")
	public void é_exibida_a_tela_inicial() throws GeneralLeanFtException, InterruptedException {
		home = new Home(browser);
		home.verificaPaginaInicial();
	}

	@Dado("que o usuário seleciona o produto no menu")
	public void que_o_usuário_seleciona_o_produto_no_menu() throws GeneralLeanFtException, InterruptedException {
		menuPrincipal = new MenuPrincipal(browser);
		menuPrincipal.selecionaMenuPrincipal("Desktops");
		menuPrincipal.selecionaSubMenu("Mac");
	}

	@Dado("adiciona o produto ao carrinho")
	public void adicionaOProdutoAoCarrinho() throws GeneralLeanFtException {
	   produtos = new Produtos(browser);
	   produtos.adicionaProdutoAoCarrinho();
	}
	
	@Quando("seleciona o carrinho")
	public void seleciona_o_carrinho() throws GeneralLeanFtException {
		produtos = new Produtos(browser);
		produtos.clicaNoCarrinho();
	}
	
	@Quando("seleciona o botão Checkout")
	public void seleciona_o_botão_Checkout() throws GeneralLeanFtException {
		produtos = new Produtos(browser);
		produtos.clicaEmCheckout();
	}
}