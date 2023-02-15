package Ejercicio_2;

public class MyStack 
{	
	char[] stack;
	int max;
	int top;
	
	public MyStack(int size) 
	{
		this.stack = new char[size];
		this.max = this.stack.length;
		this.top = 0;
	}
	
	public char push(char value) 
	{
		if(top == max) 
		{
			System.out.println("Fuera");
			return 0;
		} 
		else 
		{
			stack[top] = value;
			top++;
			return value;
		}
	}
	
	public char pop() 
	{
		char poppedValue;
		if(top == 0) 
		{
			System.out.println("Stack is empty");
			return 0;
		} 
		else 
		{
			poppedValue = stack[top-1];
			stack[top-1] = 0;
			top --;
			return poppedValue;
		}
	}
	
	public void flipString(String string) 
	{
		char[] array = string.toCharArray();
		for(int i=array.length-1; i>=0; i--)
		{
			push(array[i]);
		}
	}
	
	public void polindrome(String phrase)
	{
		phrase = phrase.toLowerCase();
		char[] phraseArray = phrase.toCharArray();
		phrase = arrayToString(phraseArray);
		
		flipString(phrase);
		String flipPhrase = arrayToString(stack);
		
		if(phrase.equals(flipPhrase))
		{
			System.out.println("Polindrome");
		}
		else
		{
			System.out.println(phrase);
			System.out.println(flipPhrase);
			System.out.println("Is not a polindrome");
		}
	}
	
	public String arrayToString(char[] phrase)
	{
		String finalPhrase = "";
		for(int i=0; i<phrase.length; i++)
		{
			if(phrase[i] == ' ')
			{
				continue;
			}
			else if(phrase[i] == 0)
			{
				continue;
			}
			else
			{
				finalPhrase+=phrase[i];
			}
		}
		return finalPhrase;
	}
}	
