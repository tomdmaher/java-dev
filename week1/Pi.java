public class Pi
	{
		public static void main (String[] args)
			{
				double pi;
				double denominator = 3;
				
				pi = 1 - 1/denominator;
				System.out.print(pi);
        				
        				denominator = denominator + 2;
        				System.out.print(pi);
        				pi = pi + (1/denominator);
        				System.out.print(pi);
        				denominator = denominator + 2;
        				System.out.print(pi);
        				pi = pi - (1/denominator);
        				System.out.print(pi);
        				denominator = denominator + 2;
        				System.out.print(pi);
        				pi = pi + (1/denominator);
        				System.out.println(pi);
					
				
			}
}