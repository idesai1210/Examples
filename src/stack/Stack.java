package stack;

public class Stack <T>{
	
	int topOfStack;
	T[] stack;
	
	public Stack(){
		this.stack = ( T[] ) new Object[1];
	}
	
	
	public void push(T item){
		
		if(topOfStack == this.stack.length){
			resize(2 * topOfStack);
		}
		
		this.stack[topOfStack++] = item;
	}
	public T pop(){
		T item = null;
		if(isEmpty())
			return item;
		else{
			item = this.stack[--topOfStack];
			return item;
		}
	}
	
	public boolean isEmpty(){
		return (this.topOfStack == 0) ;
	}
	
	public int size(){
		return this.topOfStack;
	}
	public void resize(int capacity){
		T[] stackCopy = (T[]) new Object[capacity];
		
		for(int i = 0 ;i < this.stack.length;i++){
			stackCopy[i] = this.stack[i];
			
		}
		
		this.stack = stackCopy;
		
		
	}
	public void traverse(){
		for(int i = 0; i < topOfStack;i++){
			System.out.println(this.stack[i]);
		}
	}
	
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		System.out.println("Stack size: " + stack.size());
		stack.traverse();
		
		System.out.println("Element popped : " + stack.pop());
		System.out.println("Element popped : " + stack.pop());
		System.out.println("Stack size: " + stack.size());
		
		stack.traverse();
		
	}

}
