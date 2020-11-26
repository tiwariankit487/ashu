package ashu;

public class employee {
private int id;
private String name;
private int salary;
private int age;
private String Gender;
public employee() {
	
}

public employee(int id,String name,int salary,int age,String gender) {
	this.age=age;
	this.Gender=gender;
	this.id=id;
	this.salary=salary;
	this.name=name;
	
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
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return Gender;
}
public void setGender(String gender) {
	Gender = gender;
}
public String toString() {
	return name+" "+" "+salary;
	
}


}
