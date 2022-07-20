public class QueueAsMyLinkedList<E>
{
	MyLinkedList<E> theQueue;
	private int counter = 0;
	private int waittime;
	private int avg_time = 3;
    
	public QueueAsMyLinkedList()
	{
		theQueue = new MyLinkedList<E>();
	}
	
	public String toString()
	{
		return theQueue.toString();
	}
	
	public void enqueue(E newElement)
    {  
		theQueue.append(newElement);
		counter++;
    }
	
	public int getCounter()
	{
		return counter;
	}
	
	/*public  E dequeue()
    {  
		E temp = null;
		boolean isDone = false;
		
		temp = theQueue.getFirst();
		if (temp != null)
		{
			isDone=theQueue.delete(temp);
		}
		if (isDone)
			return temp;
		else
			return null;
	}*/
	
	public void dequeue()
	{		
		if(theQueue.getFirst() == null)
		{
			return;
		}
		else
		{
			theQueue.removeFirst();
			counter--;
		}
	}
	
	public int waitTime()
	{
		waittime = avg_time * counter;
		return waittime;
	}
}