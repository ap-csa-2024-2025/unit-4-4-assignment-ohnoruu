import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    //Problem 1
    String sentence = sc.nextLine().toLowerCase();
    int count = 0;
    for (int i = 0; i < sentence.length()-1; i++){
      if (sentence.substring(i, i+1).equals("p")){
        if (sentence.substring(i+1, i+2).equals("a") || sentence.substring(i+1, i+2).equals("e") || sentence.substring(i+1, i+2).equals("i")|| sentence.substring(i+1, i+2).equals("o") || sentence.substring(i+1, i+2).equals("u")){
          count++;
          //System.out.println(count);
        }
      }
    }
    System.out.println("Contains p followed by a vowel " + count + " times.");

    //Problem 2
    String sentence2 = sc.nextLine().toLowerCase();
    String newSentence = "";
    for (int n = 0; n < sentence2.length(); n++){
      if (!(sentence2.substring(n, n+1).equals("e") || sentence2.substring(n, n+1).equals("t") || sentence2.substring(n, n+1).equals("a") || sentence2.substring(n, n+1).equals("i") || sentence2.substring(n, n+1).equals("o"))){
        newSentence += sentence2.substring(n,n+1);
        //System.out.println(newSentence);
      }
    }
    System.out.println(newSentence);

    //Problem 3
    System.out.println("Enter two strings: ");
    String input1 = sc.nextLine();
    String input2 = sc.nextLine();
    String output = "";
    if (input1.length()==input2.length()){
      for (int i1 = input1.length()-1; i1 >= 0; i1--){
        String reverse1 = input1.substring(i1,i1+1);
        String reverse2 = input2.substring(i1,i1+1);
        output += (reverse2+reverse1);
      }
      System.out.println(output);
    } else {
      System.out.println("error");
    }
  }
}
