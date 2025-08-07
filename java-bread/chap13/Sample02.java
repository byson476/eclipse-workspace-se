package chap13;

import java.text.DecimalFormat;

public class Sample02 {
	public static void main(String[] args) {
		/*
		int myMoney = -5000;
		System.out.println(myMoney);
		//DecimalFormat df = new DecimalFormat("#,###.##");
		DecimalFormat df = new DecimalFormat("##,###,###.00");
		System.out.println(df.format(myMoney));
		*/
		/*
		double myMoney = 50000000;
		System.out.println(myMoney);
		DecimalFormat df1 = new DecimalFormat("##,###,##0");
		DecimalFormat df2 = new DecimalFormat("0.0#E0");
		System.out.println(df1.format(myMoney));
		System.out.println(df2.format(myMoney));
		*/
		/*
		double myMoney1 = 2000000;
		double myMoney2 = -50000000;
		DecimalFormat df = new DecimalFormat("(수익)##,###,##0;(손실)##,###,##0");
		System.out.println(df.format(myMoney1));
		System.out.println(df.format(myMoney2));
		*/
		double myMoney = 5000000;
		double lossMoney = 3000000;
		double amount = lossMoney/myMoney;
		DecimalFormat df1 = new DecimalFormat("##,###,##0");
		DecimalFormat df2 = new DecimalFormat("##0%");	
		System.out.println("월금 : " + df1.format(myMoney));
		System.out.println("손실 : " + df1.format(lossMoney));
		System.out.println("손실률: " + df2.format(amount));
	}
}
