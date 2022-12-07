package org.example;

/**
 * class with information about a human
 */
public class Man {
    /**
     * class fields
     */
    private int id;
    private String name;
    private String gender;
    private String birthday;
    private Unit field;
    private int salary;

    /**
     * class constructor
     * @param str line from file
     */
    public Man(String[] str){
        this.id =Integer.parseInt(str[0]);
        this.name=new String(str[1]);
        this.gender = new String(str[2]);
        this.birthday=new String(str[3]);
        this.field=new Unit(str[4]);
        this.salary=Integer.parseInt(str[5]);
    }

    /**
     * get variable function
     * @return calls the variable return function from the second class
     */
    public String getName(){
        return this.field.getname();
    }

    /**
     * get variable function
     * @return calls the variable return function from the second class
     */
    public int getid()
    {
        return this.field.getid();
    }

    /**
     * function for outputting information
     * @return line with information
     */
    public String toString() {
        return
                "id=" + id +
                        ", name='" + name + ' ' +
                        ", gender='" + gender + ' ' +
                        ", unit:id " + getid() + " name " + getName()+
                        ", salary=" + salary +
                        ", BirthDay='" + birthday + ' ';
    }
}