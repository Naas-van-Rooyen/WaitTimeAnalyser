import java.util.*;

public class WaitTimeAnalyser
{
	
	public static void main(String []args)
	{		
		QueueAsMyLinkedList<Person> queue1 = new QueueAsMyLinkedList<>();
	
		System.out.println(queue1);
	
		queue1.enqueue(new Person("Dave"));
	
		System.out.println(queue1);
	
		queue1.enqueue(new Person("Jen"));
		queue1.enqueue(new Person("Frank"));
		queue1.enqueue(new Person("Carl"));
		
		System.out.println(queue1);
		
		queue1.enqueue(new Person("Peter"));
		queue1.enqueue(new Person("Anne"));
		queue1.enqueue(new Person("Jessica"));
		
		for(int i = 0; i < 100; i++)
		{
			System.out.print("_");
		}
		
		System.out.print("\nWait time Analyser");
			
		Scanner sc1 = new Scanner(System.in);

		System.out.print("\nCheck queue(y/n)? ");
		
		String choice1 = sc1.nextLine();
					
		if(choice1.equals("y"))
		{
			System.out.println("\nCurrent queue: " + queue1);
			System.out.println("There are currently " + queue1.getCounter() + " people in the queue");
			System.out.println("Your estimated wait time is: " + queue1.waitTime() + " minutes");
			
			Scanner sc2 = new Scanner(System.in);
			System.out.print("Do you want to enter the queue now(y/n)? ");
			String choice2 = sc2.nextLine();
			
			if(choice2.equals("n"))
			{
				queue1.dequeue();
				queue1.dequeue();

				System.out.println("\nCurrent queue: " + queue1);
				System.out.println("There are currently " + queue1.getCounter() + " people in the queue");
				System.out.println("Your estimated wait time is: " + queue1.waitTime() + " minutes");
				System.out.println("Congratulations! You have skipped the long queue!");
			}
			else
			{
				System.out.println("Unfortunately you have entered the long queue. Good luck!");

			}
		}
		else
		{
			System.out.println("Understood. Have a nice day.");
		}
		
	}
	
}