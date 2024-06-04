programa {

  funcao inicio() {
    real maior = 0, indice
    real numero, i, n[8]

para(i = 0; i < 8; i++){
    escreva("Qual o valor do índice ",i,": ?\n")
    leia(n[i])
    }

para(i = 0; i < 8; i++){
  se(n[i] > maior){
    
    maior = n[i]
    indice = i
  }
}

escreva("O maior valor é ",maior) 
escreva(" e ele se encontra na posição ",indice)

  }
}
