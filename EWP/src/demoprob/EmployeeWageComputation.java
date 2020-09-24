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
		int empAttendance = 0;
		
<<<<<<< HEAD
		for(int i = 0; i<20; i++) {
			
		//storing attendance
		int empAttendance = (int)(Math.floor(Math.random() * 10) % 2);
		
		//checking
		if (empAttendance == 1) {
<<<<<<< HEAD
			System.out.println("Employee present");
<<<<<<< HEAD
=======
			System.out.print("Employee present");
>>>>>>> a83bba9642ad9564269679c5019e7a49a5ddcd29
=======
>>>>>>> bc0df13ded08e228838d97b413221fcafe22df6c
			int empCheck = (int)(Math.floor(Math.random() * 10)% 3);
			switch(empCheck) {
				case IS_FULL_TIME:
					System.out.print("(Full Time)\n");
					for(int i = 0; i<20; i++) {
						
						empAttendance = (int)(Math.floor(Math.random() * 10) % 2);
						
						if (empAttendance == 1) {
							System.out.print("Employee present\n");
							dailyWage = WAGE_PER_HOUR * HOUR_PER_DAY;
							monthlyWage = monthlyWage + dailyWage;
						}
						else {
							System.out.print("Employee absent\n");
						}
					}
					break;
				case IS_PART_TIME:
					System.out.print("(Part Time)\n");
					for(int i = 0; i<20; i++) {
						
						empAttendance = (int)(Math.floor(Math.random() * 10) % 2);
						
						if (empAttendance == 1) {
							System.out.print("Employee present\n");
							partTimeWage = WAGE_PER_HOUR * PART_HOUR_PER_DAY;
							partTimeMonthlyWage = partTimeMonthlyWage + partTimeWage;
						}
						else {
							System.out.print("Employee Absent\n");
						}
					}
					break;
				default:
<<<<<<< HEAD
<<<<<<< HEAD
					System.out.println("Insufficient data");	
=======
			int empCheck = (int)(Math.floor(Math.random() * 10) % 3);
			if (empCheck == IS_PART_TIME) {
				partTimeWage = WAGE_PER_HOUR * PART_HOUR_PER_DAY;
				System.out.println("Part Time Employee Daily Wage : "+partTimeWage);
			}
			else if (empCheck == IS_FULL_TIME){
				dailyWage = WAGE_PER_HOUR * HOUR_PER_DAY;
				System.out.println("Full Time Employee Daily Wage : "+dailyWage);
>>>>>>> 952c5db2d102fd8ae712b294e8cbfc6d3b28ce7f
			}
			else {
				System.out.println("Wrong Data");
=======
					System.out.println("\nWrong Data");
					continue;	
>>>>>>> a83bba9642ad9564269679c5019e7a49a5ddcd29
			}
		}
		else {
			System.out.println("Employee absent");
=======
					System.out.println("\nWrong Data");	
>>>>>>> bc0df13ded08e228838d97b413221fcafe22df6c
			}
		System.out.println("Full Time Employee Monthly Wage : "+monthlyWage);
		System.out.println("Part Time Employee Monthly Wage : "+partTimeMonthlyWage);
	}

}
