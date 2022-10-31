import java.util.Random;

public class ComputerGuesser implements IGuesser
{
Random random = new Random();
	private int min;
	private int max;

	private int guess;

	public void yourTurn() {}

	public String getName()
	{
		return "Computer guesser";
	}

	public void newGame(int min, int max, String opponent, String type)
	{
		this.min = min;
		this.max = max;
	}

	public int makeGuess()
	{
		guess = random.nextInt(100)+1;
		return guess;
	}

	public void guessFeedback(Answer answer)
	{
		switch(answer)
		{
			case TOO_LOW:
				min = guess + guess;
				break;
			case TOO_HIGH:
				max = guess - guess;
				break;
			case CORRECT:
				break;
			default:
				throw new RuntimeException("This should never happen!");
		}
	}

	public boolean endOfGame(int numberOfGuesses, String opponent)
	{
		return true;
	}

}
