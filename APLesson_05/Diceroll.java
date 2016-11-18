public class Diceroll
{
	static int player;
	static int computer;
	static String winner;
	
	public static void main(String[]args)
	{
		player = (int)(Math.random()*6)+1;
		computer = (int)(Math.random()*6)+1;
		rollDice();
		System.out.println("You rolled a " + player);
		System.out.println("Computer rolled a " + computer);
		System.out.println("And the winner is " + winner);
	}
	
	public static void rollDice()
	{
		if (player > computer)
			winner = "you!";
		if (computer > player)
			winner = "Computer!";
	}
}