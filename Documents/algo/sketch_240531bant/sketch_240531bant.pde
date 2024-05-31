
int[] initBoard(int arrayLength, int totalBomb) {
  int [] board = new int [arrayLength];// initialise un tableau de N length

  //Boucle while qui permet de
  while (totalBomb != 0) { 
    int ran = (int)random(board.length);// génère un nombre aléatoire entre 0 et la longueurde l'array
      
    if (board[ran] == 0) {// condition qui vérifie que la case du tableau n'est pas déjà utilisée
      board[ran] = 99;
      totalBomb--;
    }
  }
  return board;
}

void setup() {
   println(initBoard(10, 3));// longueur de l'array et nombre de bombes à placer
}
