package controller;
import java.util.*;
public class CalculateBMI{

	//Enter the code here....
	public static double Calculate(double height, double weight){
		return weight/(height*height);
	}
	static String Description(double bmi){
		if(bmi<18.5){
			String a = "Under Weight";
			return a;
		}
		else if(bmi>=18.5 && bmi<24.9){
			return "Normal";
		}
		else if(bmi>=25 && bmi<29.9){
			return "Over Weight";
		}
		else if(bmi>=30 && bmi<34.9){
			return "Obese";
		}
		else if(bmi > 35){
			return "Extremely Obese";
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double height = sc.nextDouble();
		double weight = sc.nextDouble();
		double bmi = Calculate(height, weight);
		String ans = Description(bmi);
		System.out.println(ans);
	}

}
