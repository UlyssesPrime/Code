import java.util.Scanner;
public class RockPaperScissors {
  public static void main(String[] args){
    System.out.println("What will you throw? Your options are Rock, Paper, Scissors, Lizard, and Spock.");
    Scanner in = new Scanner(System.in);
    String pThrow = in.nextLine();
    String cThrow = " ";
    double gThrow = 0.0;
    if (gThrow >= 0 && gThrow < 0.2){
      cThrow = "Rock";
    }
    else if (gThrow >= 0.2 && gThrow < 0.4){
      cThrow = "Paper";
    }
    else if (gThrow >= 0.4 && gThrow < 0.6){
      cThrow = "Scissors";
    }
    else if (gThrow >= 0.6 && gThrow < 0.8){
      cThrow = "Lizard";
    }
    else if (gThrow >= 0.8 && gThrow < 1){
      cThrow = "Spock";
    }
    else {
      System.out.print("BUG ALERT");
      cThrow = "ERROR";
    }
    System.out.println("The computer threw: " + cThrow);
  }
}
