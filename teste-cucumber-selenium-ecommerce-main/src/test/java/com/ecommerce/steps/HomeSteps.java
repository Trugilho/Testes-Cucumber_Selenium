package com.ecommerce.steps;

import com.ecommerce.pages.HomePage;
import com.ecommerce.util.Hooks;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;

public class HomeSteps {

	@Dado("^que um usuario acessa o site \"(.*)\"$")
	public void acessarSite(String url) {
		Hooks.navigateToULRChrome(url);
	}
	
	@E("^pesquisa pelo produto \"(.*)\"$")
	public void pesquisarProduto(String nomeProduto) {
		HomePage homePage = new HomePage();
		homePage.pesquisarProduto(nomeProduto);
	}
	
}