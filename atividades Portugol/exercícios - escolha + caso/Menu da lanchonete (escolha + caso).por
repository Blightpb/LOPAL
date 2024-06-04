programa 
{
  funcao inicio()
  {
    inteiro opcao, soma
    cadeia resposta
    
    escreva("olá, seja bem vindo(a) ao Top lanches, aqui está nosso menu:\n")
    escreva("1) hot-dog 3 salsichas \n")
    escreva("2) hot-dog 3 queijo \n")
    escreva("3) bauruzão \n")
    escreva("4) X-salada \n")
    escreva("5) X-egg \n")
    escreva("6) X-calabacon \n")
    escreva("7) X-frangão \n")
    escreva("8) X-churrascão \n")
    escreva("9) linguiça top \n")
    escreva("10) x-burguer \n\n")

    escreva("Escolha um sabor: ")
    leia(opcao)
    
    limpa()

    escolha (opcao)
    { 
      caso 1:
        escreva ("hot-dog 3 salsicha: 3 salsichas, tomate, batata palha, maionese e catchup. \n")  
        escreva ("Seu lanche ficou R$12.00 \n")
        pare
      caso 2: 
        escreva ("hot-dog 3 queijo: salsicha, bacon, calabresa, mussarela, catupiry, cheedar, tomate, batata palha, maionese e catchup. \n")
        escreva ("Seu lanche ficou R$12.00 \n")
        pare
      caso 3:
        escreva ("bauruzão: presunto, mussarela, cheedar, bacon, calabresa, tomate, batata palha, maionese e catchup. \n")
        escreva ("Seu lanche ficou R$12.00 \n")
        pare
      caso 4:
        escreva ("x-salada: hamburgão top, mussarela, cheedar, alface, tomate, maionese, catchup, batata palha. \n")
        escreva ("Seu lanche ficou R$12.00 \n")
        pare
      caso 5:
        escreva ("X-egg: hamburgão top, 2 ovos, mussarela, cheedar, tomate, maionese, catchup e batata palha. \n")
        escreva ("Seu lanche ficou R$12.00 \n")
        pare
      caso 6:
        escreva ("X-calabacon: hamburgão top, bacon, calabresa, mussarela, cheedar, tomate, maionese, catchup e batatab palha. \n")
        escreva ("Seu lanche ficou R$12.00 \n")
        pare
      caso 7:
        escreva ("X-frangão: 200g de peito de frango, mussarela, cheedar, tomate, maionese, catchup e batata palha. \n")
        escreva ("Seu lanche ficou R$12.00 \n")
        pare
      caso 8:
        escreva ("X-churrascão: 200g de carne bovina, mussarela, cheedar, tomate, maionese, catchup e batata palha. \n")
        escreva ("Seu lanche ficou R$12.00 \n")
        pare
      caso 9:
        escreva ("Linguiça top: linguiça, mussarela, cheedar, tomate, batata palha, maionese e catchup. \n")
        escreva ("Seu lanche ficou R$12.00 \n")
        pare
      caso 10:
        escreva ("X-burguer: Hamburguer, mussarela, catupiry,batata palha, catchup e molho. \n ")
        escreva ("Seu lanche ficou R$12.00 \n")
        pare
      caso contrario:
        escreva ("Esse lanche não existe.") 

    }  

    escreva("\nDeseja adicionar batata frita + cheedar + bacon + calabresa por apenas R$7.00 ? ")  
    leia (resposta) 

    soma = 12 + 7
    
    se (resposta == "sim") {
      escreva ("Seu pedido ao todo ficou: R$", soma, ".00 \n" )  
    }
    se (resposta == "não") {
      escreva ("seu pedido ao todo ficou R$12.00 \n")
    }
    
    escreva("qual será sua forma de pagamento? \n")
    escreva("11) Pix \n")
    escreva("12) cartão de débito \n")
    escreva("13) cartão de crédito \n")
    escreva("14) dinheiro \n\n")
    




  }
}

    