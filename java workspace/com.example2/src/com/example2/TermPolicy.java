package com.example2;
import java.util.Scanner;

public class TermPolicy extends LifeInsurance {
	
	int duration;
	
	public int getDuration() {
		return duration;
	
}
	public void setDuration(int duration) {
		this.duration = duration;
		
	}
	public void getTermPolicyDetails() {
		System.out.println("Enter the term policy details>>");
		Scanner scanner = new Scanner(System.in);
		duration = scanner.nextInt();
		TermPolicy termPolicy =new TermPolicy();
		termPolicy.setDuration(duration);
		getTermPolicyInformation(termPolicy);
	}
	private void getTermPolicyInformation(TermPolicy termPolicy) {
		System.out.println("Term Policy duration duration is.."+termPolicy.getDuration());
		
	}
	
	
	}

	

