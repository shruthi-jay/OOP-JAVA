package com.company;
// program on different types of input-output stream
//        DataInputStream
//        InputStreamReader
//        BufferedReader
//        BufferedWriter
//        FileInputStream
//        FileOutputStream
//        FileWriter
//        FileReader
import java.io.*;
public class Stream {
    public static void main(String[] args) {
        String file_name = "", content = "";
        int ch;
        // Data Input Stream
        try {
            System.out.println("\nData Input Stream");
            DataInputStream dis = new DataInputStream(System.in);//creating DataInputStream object
            System.out.println("Enter a number : ");
            int a = Integer.parseInt(dis.readLine());//Accepting data using DataInputStream
            System.out.println("square ofnumber  " + a + " is  = " + a * a);
            System.out.println("\n----------------------------------------");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Input Stream Reader
        try {
            System.out.println("\nInput Stream Reader");
            char[] buff = new char[1024];
            InputStreamReader is = new InputStreamReader(System.in);//creating InputStreamReader object
            System.out.println("Enter File Name");
            is.read(buff);//reading file name
            file_name = new String(buff).trim();
            System.out.println("File name : " + file_name);
            System.out.println("\n----------------------------------------");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Buffered Reader
        try {
            System.out.println("\nBuffered Reader");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//creating BufferedReader object
            System.out.println("Enter content of File");
            content = br.readLine();
            System.out.println("Content : " + content);
            System.out.println("\n----------------------------------------");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            //BufferedWriter
            System.out.println("\nBufferedWriter");
            FileWriter writer = new FileWriter("sample.txt");//Create an object for FileWriter and pass the file name in constructor
            BufferedWriter buffer = new BufferedWriter(writer);//creating BufferedWriter object
            //writing to file
            buffer.write("Bye");
            buffer.close();
            System.out.println("\nSuccessful");
            System.out.println("\n----------------------------------------");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // File Input / Output Stream
        try {
            System.out.println("\nFile Output Stream");
            FileOutputStream fos = new FileOutputStream(file_name);//creating FileOutputStream Object
            FileInputStream fis = new FileInputStream(file_name);//creating FileInputStream Object
            fos.write(content.getBytes());
            System.out.println(content + " has been updated in " + file_name);
            System.out.println("\n----------------------------------------");
            byte[] buff = new byte[1024];
            System.out.println("\nFile Input Stream");
            fis.read(buff);
            System.out.println("Content read from file " + new String(buff, 0, buff.length));
            System.out.println("\n----------------------------------------");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //file  writer
        try {
            System.out.println("\nfile  writer");
            File fl = new File("sample.txt");//file writer object
            String str = "Hello";
            FileWriter fw = new FileWriter(fl);//writing to file
            System.out.println("\ncontent written");//content of file is overwritten by the string :"Hello"
            fw.write(str);
            fw.close();
            System.out.println("\n----------------------------------------");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //file reader
        try {
            System.out.println("\nfile reader ");
            FileReader fr = new FileReader("sample.txt"); // reading the file
            while ((ch = fr.read()) != -1)
                System.out.print((char) ch);//printing all characters of file to console
            fr.close();
            System.out.println("\n----------------------------------------");
        } catch (IOException fe) {
            System.out.println("File not found");
        }
}}

ALGORITHM:
// Step 1: Start
// Step 2: Create a class and define main method and 
// inside main do following
// Step 3: DataInputStream
//  3.1: Open try and catch it with IOException
// 3.2: Create an object for Datainputstream and 
// initialize with system.in
// 3.3: Get an integer input using that object do a 
// simple manipulation and print it
// Step 4: InputStreamReader
// 4.1: Open try and catch it with IOException
// 4.2: Create an object for InputStreamReader 
// and initialize with system.in
// 4.3: Get a string as input using that object 
// which contains file name
// Step-5: BufferedReader
// 5.1: Open try and catch it with IOException
// 5.2: Create an object for BufferedReader and 
// initialize with system.in
// 26
// 5.3: Get a string as input using that object 
// which contains content that needs to be written on file
// Step 6 : BufferedWriter
// 6.1: Open try and catch it with IOException
// 6.2: Create an object for BufferedReader and 
// initialize with FileWriter object
//  6.3: Using write() ,write a message
// Step-7: FileInputStream and FileOutputStream
// 7.1: Open try and catch it with IOException
// 7.2: Create an object for FileOutputStream and 
// pass the file name in constructor
// 7.3: Write the content in file using that object
// 7.4: Create an object for FileInputStream and 
// pass the file name in constructor
// 7.5: Read the file content using that object
// Step-8: fileWriter
// 8.1:Open try and catch it with IOException
// 8.2: Create an object for FileWriter and pass the file 
// name in constructor
// 8.3:Use write(string) methord to write content to file
// Step 9: FileReader
// 9.1: Open try and catch it with IOException
// 9.2: Create an object for FileReader and pass the file 
// name in constructor
// 9.3 :Use read() to read each character and print to 
// console
// Step 10: Sto
