
import java.util.Scanner;

public class Star {

	public static void main(String agrs[]) {
		int i,j,n;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number");
		n=in.nextInt();
        System.out.println("The Pattern is");
        i=1;
        while(i <=n)
        {
            for (j = 1; j <= n-i; j++)
            {
                    System.out.print("   ");
            }
            for (j = 1; j <= 2*i-1; j++)
                {
                    System.out.print(" * ");
                }
            i++;
            System.out.println("");
            }
            System.out.println();
in.close();
	
System.out.println("thank you");
System.out.println("Superb");
}
}
