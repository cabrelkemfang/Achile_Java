 public class PayrollSystemTest{
	  public static void main(String[] args){
		  piecework piecework=new piecework("jean","tagne","21-222-444",new Date(10,8,1991),15,32);
		  SalariedEmployee salariedEmployee =new SalariedEmployee("John", "Smith", "111-11-1111",new Date(10,10,1991), 800.00);
		  HourlyEmployee hourlyEmployee =new HourlyEmployee("Karen", "Price", "222-22-2222",new Date(10,12,1991), 16.75, 40); 
		  CommissionEmployee commissionEmployee =new CommissionEmployee("Sue", "Jones", "333-33-3333",new Date(10,8,1991), 10000, .06);
		  BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444",new Date(10,1,1991), 5000, .04, 300);
		  Employee[] employees=new Employee[5];  
          employees[0] = salariedEmployee;        
		  employees[1] = hourlyEmployee;          
		  employees[2] = commissionEmployee;   
		  employees[3] = basePlusCommissionEmployee;
          employees[4]=piecework;
           int currentmonth=8;		  
		  System.out.printf("Employees processed polymorphically:%n%n"); 
		  for(Employee currentEmployee : employees)
		  {
			  System.out.println( currentEmployee);
			   if (currentEmployee instanceof BasePlusCommissionEmployee)
			   {
				   BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
				    employee.setBaseSalary(1.10 * employee.getBaseSalary());
					 System.out.printf("new base salary with 10%% increase is: $%,.2f%n",employee.getBaseSalary()); 
			     }
				 if(currentEmployee.getbirthday().getmonth()==currentmonth)
					 System.out.printf("earned $%,.2f%n%n",currentEmployee.earnings()+100);
				 else
			     System.out.printf("earned $%,.2f%n%n",currentEmployee.earnings()); 
				 }
		   for(int j = 0; j < employees.length; j++)        
	  System.out.printf("Employee %d is a %s%n", j,employees[j].getClass().getName());
  }
 }