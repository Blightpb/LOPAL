
/*  Descrição:
 * 
 * 	Este exemplo ilustra o uso do laço "faca-enquanto", simulando uma eleição entre 
 * 	dois candidatos. O exemplo ilustra também o uso do comando "escolha" para contabilizar
 * 	os votos de cada candidato.
 * 	
 *  Autor: Leandro Gaudio Rosa
 * 	
 */

programa
{
	funcao inicio()
	{
		inteiro candidato_a= 0, candidato_b = 0
		inteiro brancos = 0, nulos = 0, total_votos = 0, voto, numero
		real porcentagem_candidato_a, porcentagem_candidato_b, porcentagem_brancos, porcentagem_nulos
    cadeia pcandidato, scandidato, resposta
		
		limpa()
    escreva ("Quantos candidatos irão participar? ")
    leia(numero)
    escreva("escreva o nome do primeiro participante: ")
    leia(pcandidato)
    escreva("escreva o nome do segundo candidato: ")
    leia(scandidato)


    faca
    {

			escreva("Escolha seu candidato ou tecle zero para encerrar\n\n")
			escreva("  1 -> " , pcandidato )
			escreva("\n  2 -> " , scandidato)
			escreva("\n  3 -> branco\n")
			
			escreva("\nQualquer número diferente de 0, 1, 2 e 3 anulará o seu voto\n")
			escreva("Digite seu voto: ")
			
			leia(voto)
			limpa()

			escolha (voto)
			{
				caso 0:
					escreva ("Votação encerrada!\n")
				pare
				
				caso 1: 
			 		candidato_a = candidato_a + 1 // Soma um voto para o candidato A
			 	pare
			 	
			 	caso 2: 
			 		candidato_b = candidato_b + 1 // Soma um voto para o candidado B
			 	pare
			 	
			 	caso 3: 
			 		brancos = brancos + 1 
			 	pare
			 	
			 	caso contrario:
			 		nulos = nulos + 1 
			}			 
    }
		 enquanto(voto != 0)
		total_votos = candidato_a + candidato_b + brancos + nulos
		
		se (total_votos > 0)
		{ 
			porcentagem_candidato_a = (candidato_a * 100.0) / total_votos  
			porcentagem_candidato_b = (candidato_b * 100.0) / total_votos
			porcentagem_brancos = (brancos * 100.0) / total_votos
			porcentagem_nulos = (nulos * 100.0) / total_votos

			escreva("\n")
			
			escreva("Total de votos: ", total_votos, "\n\n")
			escreva("Candidato A: " , candidato_a, " voto(s). ", porcentagem_candidato_a, " % do total\n" )
			escreva("Candidato B: ", candidato_b, " voto(s). ", porcentagem_candidato_b, " % do total\n" )
			escreva("Brancos: ", brancos, " voto(s). ", porcentagem_brancos, " % do total\n")
			escreva("Nulos: ", nulos, " voto(s). ", porcentagem_nulos, " % do total\n")

      escreva("\nDeseja realizar um novo voto?\n")
      leia (resposta)

      se ( resposta == "sim") {
        inicio()
      }

      se ( resposta == "não") {
      escreva (" Obrigada por votar")
      }
    } 
  }       
} 


