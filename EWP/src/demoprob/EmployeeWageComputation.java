package demoprob;

public class EmployeeWageComputation {
	
	//constant
	public static final int WAGE_PER_HOUR = 20;
	public static final int HOUR_PER_DAY = 8;
	public static final int PART_HOUR_PER_DAY = 8;
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int WORKING_DAY_PER_MONTH = 20;
	
	public static void main(String[] args) {
		
		//variable
		double dailyWage = 0;
		double partTimeWage = 0;
		double monthlyWage = 0;
		double partTimeMonthlyWage = 0;
		
		//storing attendance
		int empAttendance = (int)(Math.floor(Math.random() * 10) % 2);
		
		//checking
		if (empAttendance == 1) {
			System.out.println("Employee present");
			int empCheck = (int)(Math.floor(Math.random() * 10)% 3);
			switch(empCheck) {
				case IS_FULL_TIME:
					dailyWage = WAGE_PER_HOUR * HOUR_PER_DAY;
					System.out.println("Full Time Employee Daily Wage : "+dailyWage);
					monthlyWage = dailyWage * WORKING_DAY_PER_MONTH;
					System.out.println("Full Time Employee Monthly Wage : "+monthlyWage);
					break;
				case IS_PART_TIME:
					partTimeWage = WAGE_PER_HOUR * PART_HOUR_PER_DAY;
					System.out.println("Part Time Employee Daily Wage : "+partTimeWage);
					partTimeMonthlyWage = partTimeWage * WORKING_DAY_PER_MONTH;
					System.out.println("Part Time Employee Monthly Wage : "+partTimeMonthlyWage);
					break;
				default:
					System.out.println("Insufficient data");	
			}
		}
		else {
			System.out.println("Employee absent");
		}
	}

}
