class Employee{
    private int empid;                  // variables are declare as private

    public void setEmpid(int eid){
        empid=eid;
    }

    public int getEmpid(){
        return empid;
    }

    // use both setter and getter method
    
}
class Company {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmpid(101);
        System.out.println(e.getEmpid());
    }
}  