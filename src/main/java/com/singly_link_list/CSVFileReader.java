package com.singly_link_list;
import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.Scanner;

public class CSVFileReader {

    public static void main(String[] args)
    {
        System.out.println("Enter element to search and put in link list : ");
        Scanner sc = new Scanner(System.in);
        String item = sc.next();

        LinkList<String> linkList = new LinkList<>();
        CSVReader reader = null;
        try
        {
            reader = new CSVReader(new FileReader("src/main/resources/sample.csv"));
            String [] nextLine;
            while ((nextLine = reader.readNext()) != null)
            {
                for(String token : nextLine)
                {
                    linkList.add(token);
                }
                System.out.print("\n");
            }
            linkList.toString();
            linkList.remove(item);
            linkList.toString();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
