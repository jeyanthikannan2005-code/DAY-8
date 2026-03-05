import java.util.Scanner;
class WeekDays
{
	public static void main(String[] args)
	{
		System.out.println("Input:");
        System.out.println("1 -> Monday");
        System.out.println("2 -> Tuesday");
        System.out.println("3 -> Wednesady");
		System.out.println("4 -> Thursday");
        System.out.println("5-> Friday");
        System.out.println("6 -> Saturday");
		System.out.println("7 -> Sunday");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any one of 1/2/3/4/5/6/7 :");
		int day=sc.nextInt();
		switch(day)
		{
			case 1:
			{
				System.out.println("Marvelous Monday");
				break;
			}
			case 2:
			{
				System.out.println("Terrific Tuesday");
				break;
			}
			case 3:
			{
				System.out.println("Wonderful Wednesday");
				break;
			}
			case 4:
			{
				System.out.println("Thankful Thursday");
				break;
			}
			case 5:
			{
				System.out.println("Fantastic Friday");
				break;
			}
			case 6:
			{
				System.out.println("Soulful Saturday");
				break;
			}
			case 7:
			{
				System.out.println("Shining Sunday");
				break;
			}
			default:
			{
				System.out.println("RETRY WITH 1/2/3/4/5/6/7");
			}
		}
	}
}
			