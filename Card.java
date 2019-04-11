/**
Titan Mitchell
2327159
tmitchell@chapman.edu
CPSC 231 - 01
Card.java is a file designed to be the basis behind designing a
unique card.
*/

public class Card
{
  /**
  m_value
  int type
  */
  public int m_value;
  /**
  m_suit
  int type
  */
  public int m_suit;
  //constructor
  /**
  * Card()
  *@param int suit represents the suit value of the card
  *@param int value representing the value of the card
  * sets member variable for each unique card
  */
  public Card(int suit, int value)
  {
    m_suit = suit;
    m_value = value;
  }
  //getters
  /**
	* Returns value of m_suit
	* @return
	*/
  public int getSuit()
  {
    return m_suit;
  }
  /**
	* Returns value of m_vale
	* @return
	*/
  public int getValue()
  {
    return m_value;
  }
  /**
	* Sets new value of m_suit
	* @param
	*/
  public void setSuit(int suit)
  {
    m_suit = suit;
  }
  /**
	* Sets new value of m_value
	* @param
	*/
  public void setValue(int value)
  {
    m_value = value;
  }
  /**
  * Prints out suit and value of cards in a phrase
  */
  public void toSentence()
  {
    if(this.m_suit == 1)
    {
      if(this.m_value == 11)
      {
        System.out.println("Jack of Spades");
      }
      else if(this.m_value == 12)
      {
        System.out.println("Queen of Spades");
      }
      else if(this.m_value == 13)
      {
        System.out.println("King of Spades");
      }
      else if(this.m_value == 14)
      {
        System.out.println("Ace of Spades");
      }
      else
      {
        System.out.println(this.m_value+ " of Spades");
      }
    }
    else if(this.m_suit == 2)
    {
      if(this.m_value == 11)
      {
        System.out.println("Jack of Hearts");
      }
      else if(this.m_value == 12)
      {
        System.out.println("Queen of Hearts");
      }
      else if(this.m_value == 13)
      {
        System.out.println("King of Hearts");
      }
      else if(this.m_value == 14)
      {
        System.out.println("Ace of Hearts");
      }
      else
      {
        System.out.println(this.m_value+ " of Hearts");
      }
    }
    else if(this.m_suit == 3)
    {
      if(this.m_value == 11)
      {
        System.out.println("Jack of Clubs");
      }
      else if(this.m_value == 12)
      {
        System.out.println("Queen of Clubs");
      }
      else if(this.m_value == 13)
      {
        System.out.println("King of Clubs");
      }
      else if(this.m_value == 14)
      {
        System.out.println("Ace of Clubs");
      }
      else
      {
        System.out.println(this.m_value+ " of Clubs");
      }
    }
    else
    {
      if(this.m_value == 11)
      {
        System.out.println("Jack of Diamonds");
      }
      else if(this.m_value == 12)
      {
        System.out.println("Queen of Diamonds");
      }
      else if(this.m_value == 13)
      {
        System.out.println("King of Diamonds");
      }
      else if(this.m_value == 14)
      {
        System.out.println("Ace of Diamonds");
      }
      else
      {
        System.out.println(this.m_value+ " of Diamonds");
      }
    }
  }
}
