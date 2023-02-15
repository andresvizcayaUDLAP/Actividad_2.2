package Ejercicio_2;

public class MyQueue 
{
	char[] queue;
	int max;
	int tail;
	
	public MyQueue(int size) 
	{
		this.queue = new char[size];
		this.max = this.queue.length;
		this.tail = 0;
	}
	
	public char insert(char value) 
	{
		if(tail == max) 
		{
			System.out.println("Fuera");
			return 0;
		}
		else
		{
			queue[tail] = value;
			tail++;
			return value;
		}
	}
	
	public char delete()
	{
		if(tail==0)
		{
			System.out.println("#");
			return 0;
		}
		else
		{
			char deletedValue = queue[0];
			queue[0] = 0;
			moveValues();
			tail--;
			return deletedValue;
		}
	}
	
	public void moveValues()
	{
		char value = 0;
		for(int i = 0; i<tail; i++)
		{
			value = queue[i+1];
			queue[i] = value;
		}
	}

}
