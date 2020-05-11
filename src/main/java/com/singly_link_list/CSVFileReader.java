package com.singly_link_list;
import com.opencsv.CSVReader;

import java.io.FileReader;

public class CSVFileReader {
    public static void main(String[] args)
    {
        CSVReader reader = null;
        try
        {
            reader = new CSVReader(new FileReader("src/main/resources/sample.csv"));
            String [] nextLine;
            while ((nextLine = reader.readNext()) != null)
            {
                for(String token : nextLine)
                {
                    System.out.print(token);
                }
                System.out.print("\n");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
