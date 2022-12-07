package org.example;

/**
 * second class with information about a human
 */
public class Unit {
    /**
     * class fields
     */
    private int id;
    private String  name;

    /**
     *
     * @param new_name
     */
    public Unit(String new_name){
        name=new_name;
        id=(int)(Math.random() * Math.pow(10,5));
    }

    /**
     * get variable function
     * @return field with id
     */
    public int getid(){
        return this.id;
    }

    /**
     * get variable function
     * @return field with name
     */
    public String getname(){
        return this.name;
    }
}