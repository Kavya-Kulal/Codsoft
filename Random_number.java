import java.io.*;
import java.util.Random;
class Random_number
{
		
	public  int game(int rand)throws Exception
	
	 {
		int i=1;
		DataInputStream in=new DataInputStream(System.in);
		while(i<=10)
		{
		System.out.println("Enter you guessed number 1 to 100");
		int num=Integer.parseInt(in.readLine());
		
		int diff=Math.abs(num-rand);
			System.out.println(i+"- attempt");
			if(diff==0)
			{
				System.out.println("Wow wonderful. you win the game in "+i+" th attempt");
				
				break;
				
			}
			else if(diff<20)
			{
				System.out.println("You are very close to the number!");
			}
			else if(diff<40)
			{
				System.out.println("you are getting warm ");
			}
			else if(diff<60)
			{
				System.out.println("you are not quite there yet,but you're getting warmer!");
			}
			else if(diff<80)
			{
				System.out.println("you're far away from the number .Try again!");
			}
			else
			{
				System.out.println("You're very, very far from the number .Keep trying!");
			}
			i++;
			
			
		}
		
		System.out.println("Generated Number is");
		 System.out.println(rand); 
		 
		return 10-i;
	 }
	 public static void main(String[] args) throws Exception
	 {
		 DataInputStream in=new DataInputStream(System.in);
		 boolean playagain=true;
		System.out.println("----------------------------------------NUMBER GUESSING GAME------------------------------------------"); 
			System.out.println("   Total 2 round ,each round has maximum 10 ponits\n ");
		
		System.out.println("    You have ten attempts to win the game. If your guessed number is wrong, we will give a hint on each attempt ");	
		System.out.println("   Score is like (10-no of attempt)\n maximum score is 20");
			while(playagain)
			{

			 int f=1,score=0;
			 Random_number r=new Random_number();
			 Random ran=new Random();
			
				while(f<=2)
				{
					System.out.println("**************ROUND -  "+f+"************************");
					int rand=ran.nextInt(100);
			
					int s= r.game(rand);
					
					score+=s;	
						
				
				f++;
				}
			System.out.println("     Your score is  "+score+" out of twenty");
			System.out.println("Do you want to play again(y/n)");
			String answer=in.readLine();
			playagain = answer.equalsIgnoreCase("Y");
			}
			
		
		
	 }
		
		
		
		
	
	
	
		
		
}
	
			
			
			
			
				
				
			
				
			
				
				
	
