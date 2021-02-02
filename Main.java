import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a number to count down or up from: ");

    int num = s.nextInt();

    if (num >= 0)
    {
      int c = num;
      while (c >= 0)
      {
        System.out.println(c--);
      }
    }
    else if (num <= 0)
    {
      int d = num;
      while (d <= 0)
      {
      System.out.println(d++);
      }
    }
    System.out.println("Blast off!");
  }
}