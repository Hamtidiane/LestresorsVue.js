

void demineur(){
  int[] board = new int [10];
  int nbBombes= 3;
  int bombe=99;
  
  

 while (nbBombes!=0) {
   
  int aleatoire1 = (int)random(board.length);
  
  //println(aleatoire);
  if (board[aleatoire] == 0) {
  }
  
  nbBombes--;
  //println(nbBombes);
  //println(board[aleatoire]);
  println(aleatoire + " Alea");
  
  
  if(board[aleatoire]!=99){
    board[aleatoire]=bombe;
  
  };
  //println(board[aleatoire] + " bord");
 }
 
 for(int i = 0; i<board.length; i++){
    println(board[i]);
  }
}

void setup(){
  demineur();
}
