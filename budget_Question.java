import java.util.*;

public class budget_calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner(System.in);
		int size = Scan.nextInt();
		//double sum = 0;
		double []a = new double[size];
		for(int i = 0; i < size; i++) {
			a[i] = Scan.nextDouble();
			//sum += a[i];
		}
		double budget = Scan.nextDouble();
		Scan.close();
		equals_budget A = new equals_budget();
		System.out.println(A.find_replace(a,budget)); 
	}

}
class equals_budget {
	double find_replace(double a[], double budget) {
		Arrays.sort(a);
		double ans = 0;
		for(int i = 0; i < a.length; i++) {
			if((a[i]*(a.length-i)) > budget)
			{
				 ans = budget/(a.length-i);
				 break;
			}
			budget = budget - a[i];
		}
		return ans;
	}
}
