package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import play.db.ebean.Model;


@Entity  
@Table(name="cp_employeetest ")  
public class Employee extends Model{
	
	@Id  
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pk_id ") 
    public Long cp_employee_id ;  
	public String name;
	public String user_code;
	public String sex;
	public Date created_datetime;
	
	public static Finder<Long,Employee> find = new Finder(  
            Long.class, Employee.class  
    );  
	
	public static void delete(Long id) {  
	      find.ref(id).delete();  
	}  

}
