//Author aaron newman, jon comisky
//8/30/2020
//410pairexercise

package javaapplication1;
import java.io.BufferedReader;
import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class JavaApplication1 {

    public static void main(String[] args) throws IOException {
    		//input console and reader
        Console con = System.console();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        File myObj = new File("file.txt");
        if (myObj.createNewFile()) { //create file or if already exists print out
            System.out.println("File created: " + myObj.getName());
        } else {
            System.out.println("File already exists.");
        }
        FileWriter myWriter = new FileWriter("file.txt");
//write to file
        List<int[]> lstNum = new ArrayList<int[]>(); 
        System.out.println("Please Enter Numbers 1 2 3, q to quit");

        line = reader.readLine();//"12 2 -3";//con.readLine();
        while (!line.startsWith("q")) {//until q is typed writing and seperating the lines
            myWriter.write(line + System.lineSeparator());
            //writing to file and seperating items in line 
            String[] items = line.split(" "); 
            int[] nums = new int[items.length];
            for (int i = 0; i < items.length; i++) {
                nums[i] = Integer.parseInt(items[i]);
            }

            lstNum.add(nums);
            line = reader.readLine();//"q";//con.readLine();
        }
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
        System.out.println("The Result:");
//loop for every line and functions
        for (int i = 0; i < lstNum.size(); i++) {
            int[] numbers = lstNum.get(i);
            System.out.println("Line " + i);
            System.out.println(numbers.length + " Numbers");

            int smallest = numbers[0];
            int largest = numbers[0];
            int sum = smallest;

            for (int j = 1; j < numbers.length; j++) {
                if (numbers[j] > largest) {
                    largest = numbers[j];
                } else if (numbers[j] < smallest) {
                    smallest = numbers[j];
                }
                sum += numbers[j];
            } //print out results
            System.out.println("Smallest is: " + smallest);
            System.out.println("Largest is: " + largest);
            System.out.println("Sum is: " + sum);
            if (sum < 0) {
                System.out.println("LOSS");
            } else if (sum > 0) {
                System.out.println("PROFIT");
            } else {
                System.out.println("BREAKEVEN");
            }

        }

        //part2
        System.out.println("Second Section:");
        lstNum = new ArrayList<int[]>();
        int sum = 0;
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            line = myReader.nextLine();
            String[] items = line.split(" ");
            int[] nums = new int[items.length];
            for (int i = 0; i < items.length; i++) {
                nums[i] = Integer.parseInt(items[i]);
                sum += nums[i];
            }

            lstNum.add(nums);
        }

        System.out.println("The Result: ");
        System.out.println("The number of lines: " + lstNum.size());
        int smallest = lstNum.get(0)[0];
        int smallestLine = 0;
        int largest = lstNum.get(0)[0];
        int largersLine = 0;

        for (int i = 0; i < lstNum.size(); i++) {
            int[] numbers = lstNum.get(i);

            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] > largest) {
                    largest = numbers[j];
                    largersLine = i;
                }
                if (numbers[j] < smallest) {
                    smallest = numbers[j];
                    smallestLine = i;
                }
            }
        }
        System.out.println("Smallest value is: " + smallest + " in Line: " + smallestLine);
        System.out.println("Largest value is: " + largest + " in Line: " + largersLine);
        System.out.println("Sum is: " + sum);
        if (sum < 0) {
            System.out.println("LOSS");
        } else if (sum > 0) {
            System.out.println("PROFIT");
        } else {
            System.out.println("BREAKEVEN");
        }

    }

}

