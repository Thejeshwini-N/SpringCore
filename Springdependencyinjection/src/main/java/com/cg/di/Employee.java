package com.cg.di;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//import javax.annotation.PostConstruct;
public class Employee implements InitializingBean, DisposableBean{
          private int empId;
          private String name;
          private float salary;
          private Department department;
      
          public int getEmpId() {
  			return empId;
  		}
          public void setEmpId(int empId) {
  			this.empId = empId;
  		}
		public Department getDepartment() {
			return department;
		}
		public void setDepartment(Department department) {
			this.department = department;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public float getSalary() {
			return salary;
		}
		public void setSalary(float salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary +" , department = "+ department + "]";
		}
		public Employee(int empId, String name, float salary,Department department) {
			super();
			this.empId = empId;
			this.name = name;
			this.salary = salary;
			this.department = department;
		}
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		 
	//	@PostConstruct
	
	  public void init() {
		  System.out.println("Employee Added....."); 
		  }
	 
		
    //    @PreDestroy
        public void destroy()
        {
        	System.out.println("Employee Removed.....");
        }
		public void afterPropertiesSet() throws Exception {
			// TODO Auto-generated method stub
			
		}
}




















