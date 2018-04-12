import java.util.*;
public class Hangman{
  public static String wordChooser(String[] words){
    String out = "";
    int rando = (int) Math.random() * 100;
    int divNum = rando/words.length;
    int num = 0;
    int lastNum = 0;
    int i = 0;
    num = 1;
    while (i == 0){
      if ((divNum * num) > rando && rando > lastNum){
        out = words[num];
        i = 1;
      }
      lastNum = divNum * num;
      num++;
    }
    return out;
  }
  public static boolean checkAns (String word, char letter){
    boolean correct = false;
    for (int i = 0; i < word.length(); i++){
      if (word.charAt(i) == letter){
        correct = true;
      }
    }
    return correct;
  }
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    char guess = ' ';
    String strGuess = " ";
    int strikes = 7;
    int rightLets = 0;
    String [] words = {"airman", "burglary", "purse", "trash"};
    String gameWord = wordChooser(words);
    System.out.println(gameWord);
    System.out.println("Welcome to Hangman!");
    while (strikes != 0 && rightLets != gameWord.length()){
      System.out.println("You have " + strikes + " tries left. Please enter a letter.");
      strGuess = in.nextLine();
      strikes = 10;
    }
    if (rightLets == gameWord.length()){
      System.out.println("Congratulations! You Won! The word was: " + gameWord);
    }
    else if (strikes == 0){
      System.out.println("You lost! The man has been hanged.");
    }
  }

}
