public class Person{
    private String idno;
    private String name;
    private int age;
    public Person(String idno, String name, int age){
        this.idno = idno;
        this.name = name;
        this.age = age;
    }
    public Person(){ //default const
    }
    public void setIdNo(String idno){
        this.idno = idno;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getIdno(){
        return idno;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String toString(){
        return idno + ", " + name + ", " + age;
    }
    public boolean equals(Object obj){
        if(obj instanceof Person){
            if (this.age == ((Person)obj).age && ((Person)obj).idno.equals(this.idno) && ((Person)obj).name.equals(this.name)){
                return true;
            }
        }
        return false;
    }
}
class Employee extends Person{
    private String department;
    private double salary;
    public Employee(){} //default const
    public Employee(String idno, String name, int age, String dep, double salary){
        super(idno, name, age);
        this.department = dep;
        setSalary(salary);
    }
    public void setSalary(double salary){
        try{
            if(salary<0)
                throw new IllegalArgumentException("Invalid Salary.");
            else
                this.salary = salary;
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    public String getDepartment(String department){
        return department;
    }
    public double getSalary(double salary){
        return salary;
    }
    public String toString(){
        return super.toString() + ", " + department + ", " + salary;
    }
    public boolean equals (Object obj){
        boolean check = false;
        if (obj instanceof Employee){
            if (this.salary == ((Employee)obj).salary && ((Employee)obj).department.equals(this.department)){
                check = true;
            }
        }
        return check;
    }
}