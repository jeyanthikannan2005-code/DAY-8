import java.util.Scanner;
class ColorMeaning
{
	public static void main(String[] args)
	{
		System.out.println("Menu:");
        System.out.println("1 -> Red");
        System.out.println("2 -> Green");
        System.out.println("3 -> Blue");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number 2 to access Green :");
		int color=sc.nextInt();
		switch(color)
		{
			case 1:
			{
				System.out.println("Red means Fire");
				break;
			}
			case 2:
			{
				System.out.println("Green means Nature");
				break;
			}
			case 3:
			{
				System.out.println("Blue means Water");
				break;
			}
			default:
			{
				System.out.println("RETRY ONLY WITH NUMBER 2");
			}
		}
		
	}
}
			