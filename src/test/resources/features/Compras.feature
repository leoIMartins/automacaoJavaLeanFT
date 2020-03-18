#language: pt

Funcionalidade: Comprar produto
  Como um consumidor
  Eu quero comprar um produto
  Para que eu possa trabalhar

  Contexto: 
    Dado que o usuário acessa o sistema
    Então é exibida a tela inicial

  Cenario: Compar Mac
    Quando que o usuário seleciona o produto no menu
    E adiciona o produto ao carrinho
    E seleciona o carrinho
		E seleciona o botão Checkout