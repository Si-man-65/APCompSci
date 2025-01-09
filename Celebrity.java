/**
 * Celebrity base class for the Celebrity game.
 * @author silasheyman
 * @version 1/9/2025
 */
public class Celebrity
{
    
	/**
	 * The clue to determine the celebrity
	 */
	private String clue;
	/**
	 * The answer or name of the celebrity.
	 */
	private String answer;
	/**
	 * Creates a Celebrity instance with the supplied answer and clue
	 * @param answer
	 * @param clue
	 */

	public Celebrity(String answerIn, String clueIn)
	{
        answer = answerIn;
        clue = clueIn;
	}

	/**
	 * Supplies the clue for the celebrity
	 * @return
	 */
	public String getClue()
	{
		return clue;
	}

	/**
	 * Supplies the answer for the celebrity.
	 * @return
	 */
	public String getAnswer()
	{
		return answer;
	}

	/**
	 * Updates the clue to the provided String.
	 * @param clue The new clue.
	 */
	public void setClue(String Newclue)
	{
		clue = Newclue;
	}

	/**
	 * Updates the answer to the provided String.
	 * @param answer The new answer.
	 */
	public void setAnswer(String Newanswer)
	{
		answer = Newanswer;
	}
	
	/**
	 * Provides a String representation of the Celebrity.
	 */
	@Override
	public String toString()
	{
		return "Celebrity:" + answer + ",Clue: " + clue;
	}
	
}