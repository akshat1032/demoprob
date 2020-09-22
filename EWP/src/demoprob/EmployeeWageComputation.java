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
		
		for(int i = 0; i<20; i++) {
			
		//storing attendance
		int empAttendance = (int)(Math.floor(Math.random() * 10) % 2);
		
		//checking
		if (empAttendance == 1) {
			System.out.print("Employee present");
			int empCheck = (int)(Math.floor(Math.random() * 10)% 3);
			switch(empCheck) {
				case IS_FULL_TIME:
					System.out.print("(Full Time)\n");
					dailyWage = WAGE_PER_HOUR * HOUR_PER_DAY;
					monthlyWage = monthlyWage + dailyWage;
					break;
				case IS_PART_TIME:
					System.out.print("(Part Time)\n");
					partTimeWage = WAGE_PER_HOUR * PART_HOUR_PER_DAY;
					partTimeMonthlyWage = partTimeMonthlyWage + partTimeWage;
					break;
				default:
					System.out.println("\nWrong Data");
					continue;	
			}
		}
		else {
			System.out.println("Employee absent");
			}
		}
		System.out.println("Full Time Employee Monthly Wage : "+monthlyWage);
		System.out.println("Part Time Employee Monthly Wage : "+partTimeMonthlyWage);
	}

}
