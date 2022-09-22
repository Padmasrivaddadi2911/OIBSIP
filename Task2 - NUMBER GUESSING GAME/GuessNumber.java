import java.util.Random;
import java.util.*;
public class GuessNumber {
     public static void guessNum() {
   
     Scanner sc=new Scanner(System.in);
     
     Random random = new Random();
     
     int rand_num = random.nextInt(100);
     rand_num+=1;
     int guess,play_again;
     
          int attempts=0,points=0;
         
          System.out.println("\nWELCOME TO GUESSING NUMBER GAME!");
          System.out.println("\nLets Start!");
         
          while( attempts<3 ){
         
          System.out.println("\nGuess the Number: ");
          guess=sc.nextInt();
         
          if(guess>rand_num) {
             System.out.println("\nNumber is less than "+guess);
             }
         
          else if(guess<rand_num) {
             System.out.println("\nNumber is greater than "+guess);
             }
         
          else {
             points+=100-25*(attempts);
             System.out.println("\nYour guess is correct!!");
             System.out.println("\nThe number is "+guess);
             System.out.println("\nYour score: "+points);
             System.out.println("\nDo you want to play again? if Yes press 1 ");
         play_again=sc.nextInt();
         
         if(play_again==1) {
        guessNum();
        }
         
         else {
        System.out.println("\nThank you!! Visit Again...");
         break;
         }  
    }
 attempts+=1;
 }
     if(attempts==3) {
   
    points=0;
    System.out.println("\nYou are out of chances!");
    System.out.println("\nYour score: "+points);
    System.out.println("\nThe number is "+rand_num);
    System.out.println("\nDo you want to play again? if Yes press 1 else press 2!");
    play_again=sc.nextInt();
   
    if(play_again==1) {
   
    guessNum();
    }
    else {
   
    System.out.println("Thank You!! Visit Again...");
    }
     }
     sc.close();
   
     }
      public static void main(String args[]) {
     guessNum();
      }
}