package Chatchai;

/**@Chatchai Chairat 5907101010
 */


public class SubjectRecord {
	private String name , codename , grade;
	private int units ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCodename() {
		return codename;
	}
	public void setCodename(String codename) {
		this.codename = codename;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String string) {
		this.grade = string;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	public String toString(){
		return codename+" "+name+" "+units+" "+grade;
	}
	
	public static void main (String []args){
		SubjectRecord sr = new SubjectRecord() ;
		sr.setName("Data Structure");
		sr.setCodename("NC252");
		sr.setGrade("a");
		sr.setUnits(3);
	
				if(sr.getGrade().equals("A")){
					System.out.println("I'm so luck. I've got A.");
				}
				else{
					System.out.println("Oh , I'm not that lucky.");
				}
	}
}
