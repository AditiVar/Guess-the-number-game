import java.util.Scanner;
import java.util.Random;

class Game{
    private int guessnumber=1;
    private int number;
    private int uno;
    Scanner sc = new Scanner(System.in);
    Game(){
        Random rand = new Random();
        int upperbond=101;
        number=rand.nextInt(upperbond);
    }
    public void getno(){
            uno=sc.nextInt();
    }
    public void iscorrect(){
        System.out.println("System Generated number!!");
        System.out.println("Now its your Turn to Guess the number");
        getno();
        while(number!=uno){
            if(number<uno){
                System.out.println("Number is smaller than generated number.");
                System.out.println("Try Again to guess !!");
                this.guessnumber++;
            }
            else{
                System.out.println("Number is greater than generated number.");
                System.out.println("Try Again to guess !!");
                this.guessnumber++;
            }
            getno();
        }
        System.out.println("Generated Number : "+number);
        System.out.println("Number of guesses by you to reach the generated number : "+guessnumber);
    }
}
public class guessthenumber {
    public static void main(String[] args){
        Game ob=new Game();
        ob.iscorrect();
    }
}
