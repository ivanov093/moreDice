public class Dice
{
  //static int count = 0;
  
  
  static int countPublic;
  static int countStatic;
  
  /*
  public int RollDice( int numberOfDice)
  {
  	int sumRolls = 0;
  	
  	for(int x = numberOfDice; x > 0 ; x--)
  	{
            int number = (((int)( Math.random() * 6 )) + 1);
  		sumRolls += number;
  		Dice.countPublic += 1;
        }
         
  	return sumRolls;
  }
  
  
  static int Roll_1_Dice()
  {
  	int number = (((int)( Math.random() * 6 )) + 1);
  	Dice.count += 1;
  	return number;
  }
  */
  
  
  
  // Prep ////////////////////////////////////////////////
  
  // constructor //
  public Dice (int startCount, int startPublicCount)
  {
  	countStatic = startCount;
  	countPublic = startPublicCount;
  }
  
  
  
  // dice with parameters //
  static int RollDice (int numberOfDice, int maxOfDice)
  {
  	int sumRolls = 0;
  	
  	for(int x = numberOfDice; x > 0 ; x--)
  	{
            int number = (((int)( Math.random() * maxOfDice )) + 1);
  		sumRolls += number;
  		Dice.countStatic += 1;
  		
        }
  	return sumRolls;
  }
  
  // keeps count for static RollDice //
  static int RollCount()
  {
  	return countStatic;
  }
  
  
  // dice  with no parameters //
  public int RollDice()
  {
  	int number = (((int)( Math.random() * 6 )) + 1);  
  	Dice.countPublic += 1;
  	return number;
  	
  }
  
  // kepps count for public 
  static int RollCountPublic()
  {
  	return countPublic;
  }
  
}
