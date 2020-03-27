package com.company;

import java.io.*;

public class Main {
    static String filename = "file.pages";
    static String backupPoem = "There's an old song\n" +
            "my grandfather used to sing\n" +
            "that has the question,\n" +
            "'Or would you rather be a fish?'\n" +
            "In the same song\n" +
            "is the same question\n" +
            "but with a mule and a pig,\n" +
            "but the one I hear sometimes\n" +
            "in my head is the fish one.\n" +
            "Just that one line.\n" +
            "Would you rather be a fish?\n" +
            "As if the rest of the song\n" +
            "didn't have to be there.";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        String line;

        try
        {
            reader = new BufferedReader(new FileReader(new File("file.pages")));

            while ((line = reader.readLine()) != null)
            {
                System.out.println(line);
            }
        }
        catch (Exception e)
        {
            System.out.println("Error!");
            System.out.println(e);
            System.out.println();
            System.out.println("Printing a backup poem instead: ");
            System.out.println(backupPoem);
        }
        finally
        {
            if (reader != null)  //rerader == null --> false
            {
                reader.close();
            }
        }
    }
}
