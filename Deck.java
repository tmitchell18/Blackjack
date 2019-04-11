/**
Titan Mitchell
2327159
tmitchell@chapman.edu
CPSC 231 - 01
Deck.java is a file designed to hold card objects. The deck object
is made to a Linkedlist of cards that is of length 52 because
that is the ideal size of a deck and has methods to obtain
attributes of the deck.
*/
import java.util.LinkedList;
import java.util.Random;

public class Deck
{
  //using cards create a deck
  //deck is an array
  /**
  m_aList
  Card type
  */
  private LinkedList<Card> m_aList = new LinkedList<Card>();
  //default constructor
  /**
  * Deck()
  * sets default of any Deck created to hold 52 cards
  * creates a linked list that holds type card and creates
  * 4 unique suits and 13 unique cards to ultimately create
  * 1 full deck of cards
  */
  public Deck()
  {
    for(int i = 0; i < 4; ++i)
    {
      for(int j = 2; j < 15; ++j)
      {
        Card c = new Card(i, j);
        m_aList.add(c);
      }
    }
  }
  //getters
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
	* Sets new value of m_aList
	* @param
	*/
  public void setList(LinkedList<Card> bList)
  {
    m_aList = bList;
  }
  //methods
  //method to remove card in a random fashion
  /**
  * deal()
  * type Card
  * Creates "r" which is a random number and removes a card
  * of index "r". Thus dealing out the cards randomly.
  */
  public Card deal()
  {
    Random randNum = new Random();
    int r = randNum.nextInt(m_aList.size());
    // System.out.println(r);
    while(!m_aList.isEmpty())
    {
      //how to get information from knowing which card /location
      return m_aList.remove(r);
    }
    return null;
  }
}
