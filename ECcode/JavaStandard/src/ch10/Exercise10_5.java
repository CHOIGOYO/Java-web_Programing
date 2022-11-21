package ch10;

import java.util.Calendar;

class Exercise10_5 {
	static int getDaydiff (String yyyymmdd1, String yyyymmdd2) {
		int diff = 0;
		
		try {
			int year1 = Integer.parseInt(yyyymmdd1.substring(0,4));
			int mont1 = Integer.parseInt(yyyymmdd1.substring(4,6)) -1;
			int day1 = Integer.parseInt(yyyymmdd1.substring(6,8));
			int year2 = Integer.parseInt(yyyymmdd1.substring(0,4));
			int mont2 = Integer.parseInt(yyyymmdd1.substring(4,6)) -1;
			int day2 = Integer.parseInt(yyyymmdd1.substring(6,8));
			Calendar date1 = Calendar.getInstance();
			Calendar date2 = Calendar.getInstance();
			date1.clear();
			date2.clear();
			date1.set(year1,mont1,day1);
			date2.set(year2,mont2,day2);
			
			diff = (int) ((date1.getTimeInMillis()) - (date2.getTimeInMillis())/(24*60*60*1000f));
	    } catch (Exception e) {
			diff = 0;
		}
		return diff;
	}
	public static void main(String[] args) {
	System.out.println(getDaydiff("20010103", "20010101"));	
	System.out.println(getDaydiff("20010103", "20010103"));	
	System.out.println(getDaydiff("20010103", "200103"));	
	}
}
	
