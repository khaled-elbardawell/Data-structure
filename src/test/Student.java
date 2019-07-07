
package test;

public class Student {
    private int id_std , mid_std , final_std , total_std;
    private String firstname_std , lastname_std , grade_std;
    public static DoubleLinkedList dll=new DoubleLinkedList();
    public Student( int id_std ,int mid_std ,int final_std ,int total_std ,String firstname_std ,String lastname_std ,String grade_std  ){
        this.id_std=id_std;
        this.firstname_std=firstname_std;
        this.lastname_std=lastname_std;
        this.mid_std=mid_std;
        this.final_std=final_std;
        this.total_std=total_std;
        this.grade_std=grade_std;
        
    }
    
    public int getId(){
        return id_std;
    }
    public int getmid(){
        return mid_std;
    }
    public int getfinal(){
        return final_std;
    }
    public int gettotal(){
        return total_std;
    }
    public String getFirstName(){
        return firstname_std;
    }
    public String getLastName(){
        return lastname_std;
    }
    public String getGrade(){
        return grade_std;
    }
    public int Total(int mid,int finall){
        int tol=0;
        tol=mid+finall;
        return tol;
    }
}
