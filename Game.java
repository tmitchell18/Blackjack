/**
Titan Mitchell
2327159
tmitchell@chapman.edu
CPSC 231 - 01
Game.java is a file designed to have a player play against a computer in blackjack.
*/

import java.util.Scanner;

public class Game
{
  /**
  * main()
  * type void
  *@param none
  * Allows for player to continuosly play Blackjack until they choose not to
  */
  public static void main(String[] args)
  {
    Scanner kb = new Scanner(System.in);
    //each player is dealt 2 cards

    System.out.println("Would you like to play Blackjack?(1/2)");
    int user = kb.nextInt();
    boolean game = false;

    //get input from user
    while(user == 1)
    {
      Deck d1 = new Deck();
      Player p1 = new Player(1);
      Player comp1 = new Player(2);
      //clear hands
      p1.getList().clear();
      comp1.getList().clear();
      for(int i = 0; i < 2; ++i)
      {
        p1.collect(d1.deal());
        comp1.collect(d1.deal());
      }
      //deal out 2 cards to each player

      p1.printCards();
      System.out.println("\n");


      //hit or stand option
      //computer goes first
      if(comp1.sumCards() <= 10)
      {
        comp1.hitPlayer(d1);
        //comp1.printCards();
        System.out.println("\n");
        game = comp1.hasLost();
        if(game == true)
        {
          break;
        }
      }
      //check if player has ace
      for(int i = 0; i < p1.getList().size(); ++i)
      {
        Card check = p1.getList().remove();
        if(check.getValue() == 14)
        {
          System.out.println("Would you like the ace to be worth 1 or 14?");
          int value = kb.nextInt();
          check.setValue(value);
        }
        p1.collect(check);
      }
      //player choice
      System.out.println("Would you like to hit(1) or stand(2)?");
      int choice = kb.nextInt();
      while(choice == 1)
      {
        p1.hitPlayer(d1);
        //remove most recent card if an ace and change the value
        Card ace = p1.getList().remove(0);
        if(ace.getValue() == 14)
        {
          System.out.println("Would you like the ace to be worth 1 or 14?");
          int value = kb.nextInt();
          ace.setValue(value);
        }
        p1.collect(ace);
        p1.printCards();
        System.out.println("\n");

        //determining winner
        game = p1.hasLost();
        if(game == true)
        {
          break;
        }
        System.out.println("Would you like to hit(1) or stand(2)?");
        choice = kb.nextInt();
      }

      System.out.println("Player Points: " +p1.sumCards());
      System.out.println("Computer Points: " +comp1.sumCards());
      System.out.println("\n");
      //check if comp won but doesn't have more than 21
      if(comp1.sumCards() > p1.sumCards() && comp1.hasLost() == false)
      {
        System.out.println("The computer wins!");
      }
      //check if comp won but doesn't have more than 21
      else if(comp1.sumCards() > p1.sumCards() && comp1.hasLost() == true)
      {
        System.out.println("You win!");
      }
      //check if player won but doesn't have more than 21
      else if(p1.sumCards() > comp1.sumCards() && p1.hasLost() == false)
      {
        System.out.println("You win!");
      }
      //check if player won but doesn't have more than 21 
      else if(p1.sumCards() > comp1.sumCards() && p1.hasLost() == true)
      {
        System.out.println("The computer wins!");
      }
      else
      {
        System.out.println("It's a tie!");
      }

      System.out.println("Would you like to play Blackjack?(1/2)");
      user = kb.nextInt();
      //get input from user
    }


  }
}
