/**
    Title: 5100 Assignment2
    Author: Mingdi gao
 **/
public class assignment2 {
    // Questions 1
    private void findNumberOfCharacters(String inputString, char c) {
        char[] inputChar = inputString.toCharArray();
        int count = 0;
        for (char s : inputChar) {
            if (s == c) {
                count++;
            }
        }
        System.out.println('"' + inputString + '"' + " has " + count + " '" + c + "'");
    }

    // Questions 2
    private void findMaxAndMinInArray(int[] inputArray) {
        if (inputArray == null) {
            System.out.println("Input Array is Null");
            return;
        }
        int max = inputArray[0];
        int min = inputArray[0];
        for (int number : inputArray) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println("Max is " + max + " and Min is " + min);

    }

    // Questions 3
    private int addDigits(int input) {
        while (input >= 10) {
            input = addDigitsHelper(input);
        }
        System.out.println(input);
        return input;
    }
    // Questions 3
    private int addDigitsHelper(int inputDigit) {
        int result = 0;
        while (inputDigit > 0) {
            result += inputDigit % 10;
            inputDigit = (inputDigit - inputDigit % 10) / 10;
        }
        return result;
    }

    // Question 4
    public double socialSecurityTax(Employee employee) {
        double tax = 0;
        if (employee.salary <= 8900) {
            tax = employee.salary * 0.062;
        }
        else {
            tax = 106800 * 0.062;
        }
        return tax;
    }

    // Question 4
    public static double insuranceCoverage(Employee employee) {
        double rate = 0;
        if (employee.age < 35) {
            rate = employee.salary * 0.03;
        }
        else if (employee.age <= 50) {
            rate = employee.salary * 0.04;
        }
        else if (employee.age < 60) {
            rate = employee.salary * 0.05;
        }
        else {
            rate = employee.salary * 0.06;
        }
        return rate;
    }

    // Question 4
    public void sortSalary(Employee e1, Employee e2, Employee e3) {
        Employee lowest = e1;
        Employee middle = e2;
        Employee highest = e3;
        Employee temp = null;
        if (lowest.salary > middle.salary) {
            temp = middle;
            middle = lowest;
            lowest = temp;
        }
        if (lowest.salary > highest.salary) {
            temp = highest;
            highest = lowest;
            lowest = temp;
        }
        if (middle.salary > highest.salary) {
            temp = highest;
            highest = middle;
            middle = highest;
        }
        System.out.println(lowest.name);
        System.out.println(middle.name);
        System.out.println(highest.name);
    }
    /**
     * I have written some code below. What I want is to swap two Employee objects.
     * One is Jenny and one is John. But after running it, I got the result below:
     * Before: a=Jenny
     * Before: b=John
     * After: a=Jenny
     * After: b=John
     * There is no change after swap()! Do you know the reason why my swap failed?
     * Write your understanding of the reason and explain it.
     */
    /*
     write your understanding here.
     Your Answer:
      Because Java is "Pass By Value",
      which means the parameters "Employee x and y" in method swap() are just COPYs of the reference of a/b.
      The value of x/y in swap() doesn't affect a/b in main() method.
    */

    public static void main(String[] args) {
        assignment2 testObj = new assignment2();
        testObj.findNumberOfCharacters("North", 'r');  // Test of Question 1
        testObj.findMaxAndMinInArray(new int[]{3, 5, 7, 1, 4, 32, 15}); // Test of Question 2
        testObj.addDigits(12345); // Test of Question 3

    }
}

class Employee{
    int age;
    double salary;
    String name;
}
