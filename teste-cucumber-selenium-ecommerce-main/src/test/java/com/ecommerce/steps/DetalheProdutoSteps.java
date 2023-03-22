package com.ecommerce.steps;

import com.ecommerce.pages.DetalheProdutoPage;

//import com.everis.pages.ResultadoPesquisaPage;
import io.cucumber.java.pt.E;
//import io.cucumber.java.pt.Quando;

public class DetalheProdutoSteps {

	@E("^aumenta a quantidade produto$")
	public void aumentarQuantidadeProduto() {
		DetalheProdutoPage detalheProdutoPage = new DetalheProdutoPage();
		detalheProdutoPage.aumentarQuantidadeProduto();
	}
}