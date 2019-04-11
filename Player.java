/**
Titan Mitchell
2327159
tmitchell@chapman.edu
CPSC 231 - 01
Player.java is a file designed to hold Card and Deck objects.
The Player object contains a LinkedList because it needs the ability
to go from 0 to around 5 or 6 cards while starting with 2. The object is
essentially a person playing the game and the Player object has
methods to attain attributes of the Player.
*/
import java.util.LinkedList;

public class Player
{
  /**
  * m_aList
  * Card Type
  */
  private LinkedList<Card> m_aList;
  /**
  * m_playerNum
  * Int type
  */
  private int m_playerNum;

  //constructor
  /**
  * Player()
  * sets any Player created to have a player number and
  * creates an empty linked list that acts as the player's
  * hand / deck.
  */
  public Player(int playerNum)
  {
    m_playerNum = playerNum;
    m_aList = new LinkedList<Card>();
  }
  //getters
  /**
	* Returns value of m_aList
	* @return
	*/
  public LinkedList<Card> getList()
  {
    return m_aList;
  }
  /**
	* Returns value of m_playerNum
	* @return
	*/
  public int getPlayerNum()
  {
    return m_playerNum;
  }
  //setters
  /**
	* Sets new value of m_aList
	* @param
	*/
  public void setDeck(LinkedList<Card> bList)
  {
    m_aList = bList;
  }
  /**
	* Sets new value of m_playerNum
	* @param
	*/
  public void setPlayerNum(int n)
  {
    m_playerNum = n;
  }
  //methods
  //collect method
  /**
  * collect()
  * type void
  *@param Card c representing a single card
  * Adds the input card to the player's deck.
  */
  public void collect(Card c)
  {
    this.m_aList.add(c);
  }
  //hit method
  /**
  * hitPlayer()
  * type void
  *@param Deck d representing a deck
  * deals a card to the player
  */
  public void hitPlayer(Deck d)
  {
    Card c = d.deal();
    this.collect(c);
  }
  //print cards
  /**
  * printCards()
  * type void
  *@param none
  * prints out the player's hand of cards
  */
  public void printCards()
  {
    System.out.println("Your hand: ");
    for(int i = 0; i < this.m_aList.size(); ++i)
    {
      Card c1 = this.m_aList.remove();
      c1.toSentence();
      this.collect(c1);
    }
  }
  //add cards
  /**
  * sumCards()
  * type int
  *@param none
  * adds up all the cards in the player's hand
  *@return
  */
  public int sumCards()
  {
    int totalValue = 0;
    for(int i = 0; i < this.m_aList.size(); ++i)
    {
      //get card
      Card c1 = this.m_aList.remove();
      if(c1.getValue() == 11 || c1.getValue() == 12 || c1.getValue() == 13)
      {
        totalValue += 10;
      }
      else
      {
        totalValue += c1.getValue();
      }
      //put card back in deck
      this.collect(c1);
    }
    return totalValue;
  }
  //hasLost method
  /**
  * hasLost()
  * type boolean
  *@param none
  * checks to see if the player's hand adds up to more than 21
  */
  public boolean hasLost()
  {
    int totalValue = this.sumCards();
    if(totalValue > 21)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
}
