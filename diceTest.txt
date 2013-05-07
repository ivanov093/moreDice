import java.util.Scanner;

public class diceTest
{
  public static void main ( String[] args )
  {
  	Dice mydice_Roll = new Dice(0, 0);
  	
  	
  	// Static
  	int rollStatic = Dice.RollDice(12, 6);
  	
  	int numStaticCount = Dice.RollCount();
  	
  	System.out.printf("\nStatic Roll: %d\nStatic Cout: %d\n", rollStatic, numStaticCount);
  	
  	// Public 
  	
  	int numRoll = mydice_Roll.RollDice();
  	int numPublicCount = Dice.RollCountPublic();
  	
  	System.out.printf("\nPublic Roll: %d\nPublic Count: %d\n", numRoll, numPublicCount);
  	
  }
}
