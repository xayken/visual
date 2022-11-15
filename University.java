package visual;

import javax.swing.JOptionPane;

public class University {
	
	
	
	ArrayList<Department> departments = new ArrayList<Department>();
	
	public String getString(String message) {
		
		return JOptionPane.showInputDialog(message);
		
	}
	
	public int getINT (String message) {
		
		return Integer.parseInt(JOptionPane.showInputDialog(message));
		
	}
	
	public void newDepartment() {
		Department dept = new Department();
		dept.deptID = getINT("Deparment ID");
		dept.title = getString("Title");
		dept.students = new ArrayList<students>();
		dept.courses = new ArrayList<Course>();
		this.departments.add(dept);
		JOptionPane.showMessageDialog(null, "Department saved");
		
	}
	
	public void newStudent(int deptID) {
		
	for(Department d : departments) {
		
		if(d.deptID == deptID) {
			
			d.addStudent(new Student(
					getINT("Student ID"),
			        getString("Name"),
			        getstring("Surname"),
			        deptID));
		}
	}
	
		
	}
	
	
	public void newCourse (int deptID) {
		
		for(Department d : departments) {
			
			if(d.deptID == deptID) {
				
				d.addCourse(new Course(getINT("Course ID"),
				                       getstring("Title"),
				                       deptID));
			}
			
		}
		
		
	}
	
	public void getDepartments() {
		
		string output = "";
		for(Department d : departments) {
			
			output+= d.deptID+" "+d.title+" "+d.students.size()+" "+d.courses.size()+"\n";
			
		}
				
		JOptionPane.showMessageDialog(null, output);
	}
	
	
	public void getDepartment(int deptID) {
		
		String output = " ";
		for(Department d : departments) {
			
			if(d.deptsID == deptID+" "+
			                d.title+" "+
					        d.students.size()+" "+
			                d.courses.size()+"\n";
			
		}
		
		JOptionPane.showMessageDialog(null, output);
		
	}
	
	
	public void getStudents() {
		
		string output = " ";
		for(Department d : departments) {
			
			for(students s : d.students) {
				
				output+= s.name+" "+
				         s.surname+" "+
						 s.stuID+" "+
				         d.title+"\n";
				
			}
		
			
		}
		
		JOptionPane.showMessageDialog(null, output);
		
		
	}
	
	public void getStudents(int deptID) {
		
		
		string output = " ";
		for(Department d : departments) {
			
			if(d.deptID == deptID) {
				
				for(Student s : d.students) {
					
					output+= "Students in"+d.title+"department \n";
					output+= s.name+" "+
					         s.stuID+" "+
							 s.surname+"\n";
					
				}
				
			}
			
		}
		
		JOptionPane.showMessageDialog(null, output);
		
	}
	
	
	public void getCourses() {
		
		string output = " ";
		
		for(Department d : departments) {
			
			
			if(d.deptID = deptID) {
				
				output+= "Courses in"+d.title+"department: \n";
				
				for(Course c : d.courses) {
					
					output+= c.courseID+" "+
					         c.title+"\n";
					
				}
				
			}
			
		}
		
		JOptionPane.showMessageDialog(null, output);
		
	}
			
	
	

	public static void main(String[] args) {
		
		
		University univ = new University();
		
		univ.newDepartment();
		univ.newDepartment();
		
		univ.newCourse(11);
		univ.newCourse(11);
		
		univ.newStudent(11);
		univ.newStudent(11);
		
		univ.newCourse(22);
		univ.newCourse(22);
		
		univ.newStudent(22);
		univ.newStudent(22);
		
		univ.getCourses();
		univ.getCourses(11);
		
		univ.getStudents();
		univ.getStudents(22);
		

	}

}
