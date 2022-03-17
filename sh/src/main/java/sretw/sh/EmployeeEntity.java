package sretw.sh;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table (name="employee111")
public class EmployeeEntity implements Serializable 
{
  private static final long serialVersionUID = 1L;
 
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
   
  @NotEmpty
  private String firstName;
  private String lastName;
  private String email;
   
  @NotNull
  @ManyToOne
  private DepartmentEntity department;
   
  

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public DepartmentEntity getDepartment() {
	return department;
}

public void setDepartment(DepartmentEntity department) {
	this.department = department;
}

public EmployeeEntity() {}
    
    public EmployeeEntity(String name, DepartmentEntity department) {
        this.firstName = name;
        this.department = department;
    }
      
    public EmployeeEntity(String name) {
        this.firstName = name;
    }
 
  //Setters and Getters
 
  @Override
  public String toString() {
    return "EmployeeVO [id=" + id + ", firstName=" + firstName
        + ", lastName=" + lastName + ", email=" + email
        + ", department=" + department + "]";
  }
}