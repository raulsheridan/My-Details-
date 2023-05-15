/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printstudentdetails;

/** distributed vcs - configure local Rep
 * s1:initialize versioning, .gitconfig, .gitiginor, commit 
 *print student details 3 - names , age 
 * user interactive - VIew class
 * @author 16474
 */
public class PrintStudentDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Student[] list = new Student[3]; //array of object is needed to be declaration
        // TODO code application logic here
        // code to print 3 students details 
        Student st1 = new Student(); // defining student one name & age
        st1.setName("Peter");
        st1.setAge(21);
        
        Student st2 = new Student();
        st2.setName("Divyansh");
        st2.setAge(19);
        
        Student st3 = new Student();
        st3.setName("omkar");
        st3.setAge(18);
        //array 
        list[0]=st1;
        list[1]=st2;
        list[2]=st3;
        for(int i=0; i<list.length; i++){
            System.out.println(list[i].getName() + " " + list[i].getAge());
        }
    }
    
}
