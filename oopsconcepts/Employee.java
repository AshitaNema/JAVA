package oopsconcepts;
//Shadowing problem
//Acc to industry stds the local variables names and instance variables names should be same as shown below:-
//the local variables values are given t local variables itself this problem is called shadowing problem
//shadowing proble is solved using "this" keyword while assigning local var to instance var.
public class Employee {
	private int empid;
	private String name;
	private int salary;
	//constructor
	public Employee(int empid, String name, int salary){
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpid(){
		return empid;
	}
	public String getName(){
		return name;
	}
	public int getSalary(){
		return salary;
	}

}
