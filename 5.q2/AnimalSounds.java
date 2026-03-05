import java.util.Scanner;
class AnimalSounds
{
	public static void main(String[] args)
	{
		System.out.println("Menu:");
        System.out.println("1 -> Dog");
        System.out.println("2 -> Cat");
        System.out.println("3 -> Cow");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the type of sound you hear 1/2/3 :");
		int sound=sc.nextInt();
		switch(sound)
		{
			case 1:
			{
				System.out.println("Dog Says boww");
				break;
			}
			case 2:
			{
				System.out.println("Cat Says Meow");
				break;
			}
			case 3:
			{
				System.out.println("Cow Says Moo");
				break;
			}
			default:
			{
				System.out.println("RETRY ONLY WITH THE SOUND 1/2/3");
			}
		}
		
	}
}
			