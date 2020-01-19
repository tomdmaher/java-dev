public class InterestCalculator
{
    public static void main(String[] args)
    {
        double initialBalance = 10000;
        System.out.println("The initial balance is £" + initialBalance);
        
        double currentBalance;
        currentBalance = withInterestOn (initialBalance);
        System.out.println("year1 £" + currentBalance);
        
        currentBalance = withInterestOn (currentBalance);
        System.out.println("year2 £" + currentBalance);
        
        currentBalance = withInterestOn (currentBalance);
        System.out.println("year3 £" + currentBalance);        
    }
    
    public static double withInterestOn(double balance)
    {
        double interest = balance * 0.05;
        return balance + interest;
    }
}