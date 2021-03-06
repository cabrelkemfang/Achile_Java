 public class PayrollSystemTest{
	  public static void main(String[] args){
		  piecework piecework=new piecework("jean","tagne","21-222-444",15,32);
		  SalariedEmployee salariedEmployee =new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
		  HourlyEmployee hourlyEmployee =new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40); 
		  CommissionEmployee commissionEmployee =new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06);
		  BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300);
		  System.out.println("Employees processed individually:"); 
		  System.out.printf("%s salariedEmployee earned;%f",salariedEmployee, salariedEmployee.earnings()); 
		  System.out.printf("%s: hourlyEmployee earned %f",hourlyEmployee, hourlyEmployee.earnings()); 
		  System.out.printf("%s commision earned:%f",commissionEmployee, commissionEmployee.earnings());
		  System.out.printf("%s basePlusCommissionEmployee earned %f",basePlusCommissionEmployee, basePlusCommissionEmployee.earnings());
		  System.out.printf("%s piecework %f",piecework, piecework.earnings());
		  Employee[] employees=new Employee[5];  
          employees[0] = salariedEmployee;        
		  employees[1] = hourlyEmployee;          
		  employees[2] = commissionEmployee;   
		  employees[3] = basePlusCommissionEmployee;
          employees[4]=piecework;		  
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
			     System.out.printf("earned $%,.2f%n%n",currentEmployee.earnings()); 
				 }
		
  }
 }