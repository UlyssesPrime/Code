import java.util.Scanner;
public class RockPaperScissors {
  public static void main(String[] args){
    System.out.println("What will you throw? Your options are Rock, Paper, or Scissors.");
    Scanner in = new Scanner(System.in);
    String pThrow = in.nextLine();
    String cThrow = " ";
    double gThrow = Math.random();
    if (gThrow >= 0 && gThrow < 0.339999999999999999999999999999){
      cThrow = "Rock";
    }
    else if (gThrow >= 0.34 && gThrow < 0.669999999999999999999999999999999999){
      cThrow = "Paper";
    }
    else if (gThrow >= 0.67 && gThrow < 1){
      cThrow = "Scissors";
    }
    else {
      System.out.print("BUG ALERT");
      cThrow = "ERROR";
    }
    String winLose;
    if (pThrow.toLowerCase().equals(cThrow.toLowerCase())){
      winLose = "You tied!";
    }
    else if(pThrow.toLowerCase().equals("rock") && cThrow.equals("Paper")){
      winLose = "You lose!";
    }
    else if(pThrow.toLowerCase().equals("paper") && cThrow.equals("Scissors")){
      winLose = "You lose!";
    }
    else if(pThrow.toLowerCase().equals("scissors") && cThrow.equals("Rock")){
      winLose = "You lose!";
    }
    else if(pThrow.toLowerCase().equals("rock") && cThrow.equals("Scissors")){
      winLose = "You win!";
    }
    else if(pThrow.toLowerCase().equals("paper") && cThrow.equals("Rock")){
      winLose = "You win!";
    }
    else if(pThrow.toLowerCase().equals("scissors") && cThrow.equals("Paper")){
      winLose = "You win!";
    }
    else{
      winLose = "ERROR!";
    }
    System.out.println("The computer threw: " + cThrow);
    System.out.println(winLose);
  }
}
