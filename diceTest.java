import java.util.Scanner;

public class diceTest
{
  public static void main ( String[] args )
  {
  	Dice myCount = new Dice(0, 0);
  	
  	
  	// Static
  	int rollStatic = Dice.RollDice(3, 6);
  	
  	int numStaticCount = Dice.RollCount();
  	
  	System.out.printf("\nStatic Roll: %d\nStatic Cout: %d\n", rollStatic, numStaticCount);
  	
  	// Public 
  	
  	int numRoll = myCount.RollDice();
  	int numRoll2 = myCount.RollDice();
  	int numPublicCount = myCount.RollCountPublic();
  	
  	System.out.printf("\n1 Public Roll: %d\n2 Public Roll: %d\nPublic Count: %d\n", 
  						numRoll, numRoll2, numPublicCount);
              
  	
  }
}
