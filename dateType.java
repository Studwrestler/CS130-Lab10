package lab10;

public class dateType {
	private int dMonth;
	private int dDay;
	private int dYear;
	
	public void setDate(int dMonth, int dDay, int dYear) {
		this.dMonth=dMonth;
		this.dDay=dDay;
		this.dYear=dYear;
	}
	public int getDay() {
		return this.dDay;
	}
	public int getMonth() {
		return this.dMonth;
	}
	public int getYear() {
		return this.dYear;
	}
	public void printDate() {
		System.out.println("The date is: "+this.dMonth+"/"+this.dDay+"/"+this.dYear);
	}
	public void DateType(int dMonth, int dDay, int dYear) {
		this.dMonth=1;
		this.dDay=1;
		this.dYear=1900;
	}
	public static void main(String[]args) {
		dateType d = new dateType();
		d.setDate(11, 10,2022);
		d.printDate();
	}

}
