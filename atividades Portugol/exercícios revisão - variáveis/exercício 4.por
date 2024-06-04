programa 
{
  funcao inicio() 
  {
   real n1, n2, n3, s, d
  
   escreva("Informe a primeira nota: \n")
   leia(n1)
   escreva("Informe a segunda nota: \n")
   leia(n2)
   escreva("Informe a tereira nota: \n")
   leia(n3)

  s = n1 * 2 + n2 * 3 + n3 * 6
  d = s / 11 

  limpa()

  escreva("A média é: ", d)
  }
}
