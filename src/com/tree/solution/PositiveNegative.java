package com.tree.solution;

import java.util.Calendar;
import java.util.Date;

public class PositiveNegative {
	public static void main(String[] args) {

		final Calendar today = Calendar.getInstance();
		int currentMonthCount = 0;
		int orderCreationMonthCount = 0;
		Long loyaltyStartDate = 1564313722000L;
		Calendar loyaltyDate = Calendar.getInstance();
		
		System.out.println("loyaltyDate1 : " +loyaltyDate.getTime());
		
		loyaltyDate.setTime(new Date(loyaltyStartDate));
		
		System.out.println("loyaltyDate2 : " +loyaltyDate.getTime());
		
		loyaltyDate.add(Calendar.MONTH, 1);
		
		System.out.println("loyaltyDate3 : " +loyaltyDate.getTime());
		
		loyaltyDate.add(Calendar.MILLISECOND, -((int)19800000));
		
		System.out.println("loyaltyDate4 : " +loyaltyDate.getTime());

		while (!loyaltyDate.after(today) || loyaltyDate.equals(today)){
			System.out.println("enter");
			loyaltyDate.add(Calendar.MONTH, 1);
			currentMonthCount++;
		}
		
		
		Calendar referenceDate = Calendar.getInstance();
		referenceDate.setTime(new Date(loyaltyStartDate));
		System.out.println("referenceDate1: : " +referenceDate.getTime());
		referenceDate.add(Calendar.MONTH, 1);
		
		System.out.println("referenceDate2: : " +referenceDate.getTime());
		
		referenceDate.add(Calendar.MILLISECOND, -((int)19800000));
		
		System.out.println("referenceDate3: : " +referenceDate.getTime());
		Calendar createdAt = Calendar.getInstance();
		createdAt.setTime(new Date(1576931485000L));
		
		System.out.println("createdAt: : " +createdAt.getTime());
		while (!referenceDate.after(createdAt) || referenceDate.equals(createdAt)) {
			referenceDate.add(Calendar.MONTH, 1);
			System.out.println("enter1");
			orderCreationMonthCount++;
        }
		
		
		Calendar lastUpdatedMonthExpiry = Calendar.getInstance();
		lastUpdatedMonthExpiry.setTime(new Date(loyaltyStartDate));
		lastUpdatedMonthExpiry.add(Calendar.MONTH, (8+1));
		
		final Calendar today2 = Calendar.getInstance();
		
		if(today2.before(lastUpdatedMonthExpiry)) {
			System.out.println("lastUpdatedMonthExpiry");
	    } 
		
		System.out.println("status : "+resetYearlyLoyaltyCounter(15,15));
		
		System.out.println("currentMonthCount : "+currentMonthCount
				+" orderCreationMonthCount :"+orderCreationMonthCount
				+" lastUpdatedMonthExpiry : "+lastUpdatedMonthExpiry.getTime());
		
    }
	
	private static boolean resetYearlyLoyaltyCounter(int monthCount, int loyaltyOrderCountLastUpdatedMonth) {
		final int year = 12;
		if((monthCount < year && loyaltyOrderCountLastUpdatedMonth < year) ) {
			return false;
		} else if(loyaltyOrderCountLastUpdatedMonth < year && monthCount >= year) {
			return true;
		}
		loyaltyOrderCountLastUpdatedMonth -= year;
		monthCount -= year;
		System.out.println("loyaltyOrderCountLastUpdatedMonth test : "+loyaltyOrderCountLastUpdatedMonth);
		System.out.println("monthCount test : "+monthCount);
		return resetYearlyLoyaltyCounter(monthCount, loyaltyOrderCountLastUpdatedMonth);
		
	}
	
}
