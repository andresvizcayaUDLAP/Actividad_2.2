package Ejercicio_2;

public class Main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MyQueue myQueue = new MyQueue(10);
		myQueue.insert('h');
		myQueue.insert('o');
		myQueue.insert('l');
		myQueue.insert('a');
		myQueue.insert('f');
		myQueue.insert('s');
		myQueue.delete();
		myQueue.delete();
		
		for(int i = 0; i<myQueue.tail; i++) 
		{
			System.out.println(myQueue.queue[i]);
		}
		
		System.out.println();
		
		MyStack myStack = new MyStack(30);
		myStack.push('h');
		myStack.push('o');
		myStack.push('l');
		myStack.push('a');
		myStack.push('f');
		myStack.push('s');
		myStack.pop();
		myStack.pop();
		
		for(int i = 0; i<myStack.top; i++) 
		{
			System.out.println(myStack.stack[i]);
		}
		
		System.out.println();
		
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.pop();
		
		myStack.flipString("hola");
		
		for(int i = 0; i<myStack.top; i++) 
		{
			System.out.println(myStack.stack[i]);
		}
		
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.pop();
		
		myStack.polindrome("anita lava la tina");
		
		
	}
	
	

}
