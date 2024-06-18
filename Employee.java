package arraylist;

public class Employee implements Comparable<Employee> {

	private String ename;
	
	public Employee(String ename)
	{
		this.ename=ename;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
	@Override
	public String toString() {
		return "Employee [ename=" + ename + "]";
	}

	public int compareTo(Employee e)
	{
		return this.ename.compareTo(e.ename);
	}
}
