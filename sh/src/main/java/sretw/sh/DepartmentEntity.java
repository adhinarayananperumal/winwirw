package sretw.sh;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="ddd")
public class DepartmentEntity implements Serializable {
 
  private static final long serialVersionUID = 1L;
   
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String name;
   
  public DepartmentEntity(){
  }
  
  
 
  



public int getId() {
	return id;
}







public void setId(int id) {
	this.id = id;
}







public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public List<EmployeeEntity> getEmployees() {
	return employees;
}



public void setEmployees(List<EmployeeEntity> employees) {
	this.employees = employees;
}



public DepartmentEntity(Integer id, String name) {
    super();
    this.id = id;
    this.name = name;
  }
   
  @OneToMany(mappedBy="department",cascade=CascadeType.PERSIST)
    private List<EmployeeEntity> employees = new ArrayList<EmployeeEntity>();
   
  //Setters and Getters
   
  @Override
  public String toString() {
    return "DepartmentVO [id=" + id + ", name=" + name + "]";
  }
}