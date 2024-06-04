programa 
{
  funcao inicio() 
  {
   real a, l, p, v

  escreva("Informe os valores de altura e largura em centímetros\n")
   escreva("Qual a altura da caixa d'água?: \n")
   leia(a)

   escreva("Qual a largura?: \n")
   leia(l)

   escreva("Qual a profundidade?: \n")
   leia(p) 
   
   limpa()

   v = a * l * p

   escreva("O volume da caixa d'água é de ", v)




  }
}
