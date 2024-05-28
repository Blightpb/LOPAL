//matriz
public class Main {
public static void main(String[] args ) {
   int [] [] piolho = new int [3] [3];
   int i = 0;
   int j = 0;
   
   piolho [0][0] = 1;
   piolho [0][1] = 2;
   piolho [0][2] = 3;
   piolho [1][0] = 4;
   piolho [1][1] = 5;
   piolho [1][2] = 6;
   piolho [2][0] = 7;
   piolho [2][1] = 8;
   piolho [2][2] = 9;
  
     for (i = 0; i < 3; i++) {
       for (j = 0; j < 3; j++) {
       System.out.print ("|"+piolho [i][j] + " "); 
       }
       System.out.print ("|") ;
       System.out.println ();
     }
   }
}   