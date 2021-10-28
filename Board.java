//MLT 10/28/21
//working with Tanisha Wasan
// https://github.com/wasantan23/battleboard
//Board class to be a template for the layout of each board (with ships or guesses)

public class Board {
  private int numRows;
  private int numCols;
  private char[][] field; //a field on the board 
  
  /* Default Constructor for the board - with defined 10 rows and 10 cols */
  public Board() {
    numRows = 10;
    numCols = 10;
    field = new char[numRows][numCols];
  }
  
  
  //getters & setters
  
  //print the board to the console
  public void printBlankBoard() {
    //print top row
    
    for (int r=0;r<numRows;r++) {
      // print boudary board
      System.out.print(" 1 ");
      //next, for loop to print cols
        for (int c=0;c<numCols; c++) {
          System.out.print("  |");
        } //end of col loop
      System.out.print(" \n "); //end the row
    }//end row loop
  } //close print board method
  
    
  //print the field (within the board) to the console
  public void printField() {
    //print top row
    
    for (int r=0;r<numRows;r++) {
      // print boudary board
      System.out.print(" 1 ");
      //next, for loop to print cols
        for (int c=0;c<numCols; c++) {
          System.out.print("  |");
        } //end of col loop
      System.out.print(" \n "); //end the row
    }//end row loop
  }//close printfield
    
    
    //public void 
    
  } //close class
    
  
  
