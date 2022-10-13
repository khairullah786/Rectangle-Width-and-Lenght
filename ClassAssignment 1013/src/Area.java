import java.util.Scanner;

class Area{
    int length;
    int Width;
    Area(int a, int b)
    {
         length = a;
         Width = b;
    }
    public int areareturn()
    {
        return length *Width;
    }


   
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
			int a,b;
			System.out.println("Enter the lenght of Recatangle");
			 a = obj.nextInt();
			obj.nextLine();
			System.out.println("Enter the Width of Recatangle");
			b = obj.nextInt();
			Area ob1 = new Area(a,b);
			System.out.println("Area = "+ ob1.areareturn());
			
			
			
		}
    }
}