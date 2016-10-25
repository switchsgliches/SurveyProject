//Class used to holding Survey questions and collecting Data. 
import java.util.Scanner;

public class Survey 
{

Scanner input = new Scanner(System.in);
	
	public String Question1()
	{
		//Question 1
		System.out.print("How much did you learn from this event? \n" +
			"A. None \n" +
			"B. A little \n" +
			"C. Quite a bit \n" +
			"D. A lot \n" +
			"Answer: ");
		String a1 = input.next();
		
		switch(a1)
		{
		case "A":
		case "a":  return "None";
		
		case "B":
		case "b": return "A little";

		case "C":
		case "c": return "Quite a bit";

		case "D":
		case "d": return "A lot";
		
		//could use this for input validation
		default: return "Invaild Input";
		}
	}
	
	public String Question2()
	{	
		//Question 2
		System.out.print("How much did you enjoy this event? \n" +
				"A. None \n" +
				"B. A little \n" +
				"C. Quite a bit \n" +
				"D. A lot \n" +
				"Answer: ");
		String a2 = input.next();
		
		switch(a2)
		{
		case "A":
		case "a":  return "None";
		
		case "B":
		case "b": return "A little";

		case "C":
		case "c": return "Quite a bit";

		case "D":
		case "d": return "A lot";
		
		//could use this for input validation
		default: return "Invaild Input";
		}
	}
	
	public String Question3()
	{
		System.out.print("Rate how much you liked each event: \n" +
				"Event one: A. Strongly dislike B. Dislike C. Neutral D. Like E. Strongly like \n" +
				"Answer: ");
		String a3 = input.next();
		
		switch(a3)
		{
		case "A":
		case "a":  return "Strongly dislike";
		
		case "B":
		case "b": return "Dislike";

		case "C":
		case "c": return "Neutral";

		case "D":
		case "d": return "Like";
		
		case "E":
		case "e": return "Strongly Like";
		
		//could use this for input validation
		default: return "Invaild Input";
		}
	}
	
	public String Question4()
	{
		System.out.print("Event two: A. Strongly dislike B. Dislike C. Neutral D. Like E. Strongly like \n" +
				"Answer: ");
		String a4 = input.next();
		
		switch(a4)
		{
		case "A":
		case "a":  return "Strongly dislike";
		
		case "B":
		case "b": return "Dislike";

		case "C":
		case "c": return "Neutral";

		case "D":
		case "d": return "Like";
		
		case "E":
		case "e": return "Strongly Like";
		
		//could use this for input validation
		default: return "Invaild Input";
		}
	}
	
	public String Question5()
	{
		System.out.print("Event three: A. Strongly dislike B. Dislike C. Neutral D. Like E. Strongly like \n" +
				"Answer: ");
		String a5 = input.next();
		
		switch(a5)
		{
		case "A":
		case "a":  return "Strongly dislike";
		
		case "B":
		case "b": return "Dislike";

		case "C":
		case "c": return "Neutral";

		case "D":
		case "d": return "Like";
		
		case "E":
		case "e": return "Strongly Like";
		
		//could use this for input validation
		default: return "Invaild Input";
		}
	}

	public String Question6()
	{
		System.out.print("Event four: A. Strongly dislike B. Dislike C. Neutral D. Like E. Strongly like \n" +
				"Answer: ");
		String a6 = input.next();
		
		switch(a6)
		{
		case "A":
		case "a":  return "Strongly dislike";
		
		case "B":
		case "b": return "Dislike";

		case "C":
		case "c": return "Neutral";

		case "D":
		case "d": return "Like";
		
		case "E":
		case "e": return "Strongly Like";
		
		//could use this for input validation
		default: return "Invaild Input";
		}
	}
	
	public String Question7()
	{
		//Question 7
		System.out.print("How likely are you to participate in this event again? \n" +
				"A. Not likely \n" +
				"B. Somewhat likely \n" +
				"C. Likely \n" +
				"D. Very likely /n" +
				"Answer: ");
		String a7 = input.next();
		
		switch(a7)
		{
		case "A":
		case "a":  return "Not likely";
		
		case "B":
		case "b": return "Somewhat likely";

		case "C":
		case "c": return "Likely";

		case "D":
		case "d": return "Very likely";
		
		//could use this for input validation
		default: return "Invaild Input";
		}
	}
	
	public String Question8()
	{
		System.out.print("How hard was it to understand each subject from the events? \n" +
				"Event one: A. Very Hard B. Somewhat Hard C. Fairly Easy D. Very Easy \n" +
				"Answer: ");
		String a8 = input.next();
		
		switch(a8)
		{
		case "A":
		case "a":  return "Very Hard";
		
		case "B":
		case "b": return "Somewhat Hard";

		case "C":
		case "c": return "Fairly Easy";

		case "D":
		case "d": return "Very Easy";
		
		//could use this for input validation
		default: return "Invaild Input";
		}
	}
	
	public String Question9()
	{
		System.out.print("Event two: A. Very Hard B. Somewhat hard C. Fairly Easy D. Very Easy \n" +
				"Answer: ");
		String a9 = input.next();
		
		switch(a9)
		{
		case "A":
		case "a":  return "Very Hard";
		
		case "B":
		case "b": return "Somewhat Hard";

		case "C":
		case "c": return "Fairly Easy";

		case "D":
		case "d": return "Very Easy";
		
		//could use this for input validation
		default: return "Invaild Input";
		}
	}
	
	public String Question10()
	{
		System.out.print("Event three: A. Very Hard B. Somewhat hard C. Fairly Easy D. Very Easy \n" +
				"Answer: ");
		String a10 = input.next();
		
		switch(a10)
		{
		case "A":
		case "a":  return "Very Hard";
		
		case "B":
		case "b": return "Somewhat Hard";

		case "C":
		case "c": return "Fairly Easy";

		case "D":
		case "d": return "Very Easy";
		
		//could use this for input validation
		default: return "Invaild Input";
		}
	}
	
	public String Question11()
	{
		System.out.print("Event four: A. Very Hard B. Somewhat hard C. Fairly Easy D. Very Easy \n" +
				"Answer: ");
		String a11 = input.next();
		
		switch(a11)
		{
		case "A":
		case "a":  return "Very Hard";
		
		case "B":
		case "b": return "Somewhat Hard";

		case "C":
		case "c": return "Fairly Easy";

		case "D":
		case "d": return "Very Easy";
		
		//could use this for input validation
		default: return "Invaild Input";
		}
	}
	
	public String Question12()
	{
		//Question 12
		System.out.print("All subjects were taught in an understandable way \n" +
				"A. Strongly Disagree \n" +
				"B. Disagree \n" +
				"C. Neutral \n" +
				"D. Agree \n" +
				"E. Strongly Agree \n" +
				"Answer: ");
		String a12 = input.next();
		
		switch(a12)
		{
		case "A":
		case "a":  return "Strongly Disagree";
				
		case "B":
		case "b": return "Disagree";

		case "C":
		case "c": return "Neutral";

		case "D":
		case "d": return "Agree";
				
		case "E":
		case "e": return "Strongly Agree";
				
		//could use this for input validation
		default: return "Invaild Input";
		}
	}
	
	public String Question13()
	{
		//Question 13
		System.out.print("Has you interest in Computer Science changed after this event? \n" +
				"A. Yes \n" +
				"B. No \n" +
				"Answer: ");
		String a13 = input.next();
		
		switch(a13)
		{
		case "A":
		case "a":  return "Yes";
				
		case "B":
		case "b": return "No";
				
		//could use this for input validation
		default: return "Invaild Input";
		}
	}
	
	public String Question14()
	{
		//Question 14
		System.out.print("How much did your interest change? \n" +
				"A. None \n" +
				"B. A little \n" +
				"C. Quite a bit \n" +
				"D. A lot \n" +
				"Answer: ");
		String a14 = input.next();
		
		switch(a14)
		{
		case "A":
		case "a":  return "None";
				
		case "B":
		case "b": return "A little";

		case "C":
		case "c": return "Quite a bit";

		case "D":
		case "d": return "A lot";
				
		//could use this for input validation
		default: return "Invaild Input";
		}
	}
}