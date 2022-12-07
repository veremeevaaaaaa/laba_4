package org.example;
import java.io.FileReader;
import java.util.ArrayList;
import au.com.bytecode.opencsv.*;


public class Main {
    public static void main (String[] args) throws Exception {
        ArrayList<Man> information= new ArrayList<>();
        CSVReader reader = new CSVReader(new FileReader("C:\\Users\\vikly\\Downloads\\foreign_names\\foreign_names.csv"), ';' ,'"' , 1);
        if(reader==null)throw new RuntimeException("reading error");
        String[] nextLine = reader.readNext();
        while ((nextLine) != null) {
            Man newLine = new Man(nextLine);
            information.add(newLine);
            nextLine = reader.readNext();
        }

        for (int i = 0;i < information.size();i++)
        {
            System.out.println(information.get(i).toString());
        }
    }
}