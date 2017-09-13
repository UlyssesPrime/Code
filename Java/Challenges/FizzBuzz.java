public class FizzBuzz{
  public static void main(String[] args){
    int i = 1;
    while (i != 101){
      if (i % 3 != 0 && i % 5 != 0){
        System.out.print(i + " ");
      }
      else if (i % 3 == 0 && i % 5 == 0){
        System.out.print("FizzBuzz ");
      }
      else if (i % 3 == 0 && i % 5 != 0){
        System.out.print("Fizz ");
      }
      else if (i % 3 != 0 && i % 5 == 0){
        System.out.print("Buzz ");
      }
      else {
        System.out.println("YOU FUCKED UP HERE IS A BUG!");
      }
      i++;
    }
  }
}
