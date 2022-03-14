package com.assessment;
import java.util.*;

public class EmployeeApp {
	public EmployeeApp() {
		
	}
	
	public String findEmployeeById(int empId) throws EmpNotFoundException {
		if(EmployeeDb.db.containsKey(empId)){
			return  EmployeeDb.db.get(empId).getDetails();
		}
		else {
			throw new EmpNotFoundException("No user found with this id");
		}
			
		}
    public List<String> listOfAllEmployees(){
    	    List<String> employees=new ArrayList<>();
			for(Integer i:EmployeeDb.db.keySet()) {
			    String empDetail=EmployeeDb.db.get(i).getDetails();
			    employees.add(empDetail);
				}
			return employees;
		}
    
    public String createEmployee(Employee p) throws EmpExistsException {
    	if(EmployeeDb.db.containsKey(p.getId())) {
    		throw new EmpExistsException("Employee already Exist");
    	}
    	else {
    		EmployeeDb.db.put(p.getId(), p);
    		return "Person added";
    	}
    }
    public String updateDetails(Employee e) {
    	if(EmployeeDb.db.containsKey(e.getId())) {
    		e.setName(e.getName());
    		e.setCity(e.getCity());
    		return "Employee details is updated";
    	}else {
    		return "Employee not Found";
    	}
    }
    public String deleteEmployee(int empid) {
    	if(EmployeeDb.db.containsKey(empid)) {
    		EmployeeDb.db.remove(empid);
    		return "Employee details is deleted";
    	}else {
    		return "Employee not Found";
    	}
    }
}
