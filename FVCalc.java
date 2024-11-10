// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		
	int money = Integer.parseInt(args[0]);
	double rate = Double.parseDouble(args[1]);
	int year = Integer.parseInt(args[2]);
	int futureValue = (int)(money * Math.pow(rate/100 + 1, year));

	System.out.println("After " + year + " years, a " + "$" + money + " " + "saved " + "at " + rate + "% " + "will " + "yield " + "$" + futureValue );


	}
}