package ch07;
class Time{
	private int hour;
	
	public int getHour() {
		return hour;
	}		
	public void setHour(int hour) {
		if(hour < 0 || hour > 23) return;
		this.hour = hour;
	}
}
public class AccessModifierTest2{
	public static void main(String[] args) {
		Time t = new Time();
		//t.hour = 25; // Error 직접 접근 불가
		t.setHour(12);
		System.out.println(t.getHour());
	}
}