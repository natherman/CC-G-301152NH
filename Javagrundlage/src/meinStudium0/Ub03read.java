package meinStudium0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ub03read {

	public static void main(String[] args) {
//		Your code is reading input from the console using `BufferedReader` and converting the second input, which is a string representation of an age, to an integer. This approach is generally correct, but let's provide a complete example with proper handling of exceptions that might arise during input and parsing:
//
//		```java
//		import java.io.BufferedReader;
//		import java.io.IOException;
//		import java.io.InputStreamReader;
//
//		public class Main {
//		    public static void main(String[] args) {
		        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		        
		        try {
//		            // Reading the name
		            System.out.print("Enter your name: ");
		            String name = reader.readLine();
//		            
//		            // Reading the age
		            System.out.print("Enter your age: ");
		            String sAge = reader.readLine();
		            int nAge = Integer.parseInt(sAge);
//		            
//		            // Output the results
		            System.out.printf("Name: %s, Age: %d%n", name, nAge);
	        } catch (IOException e) {
		            System.err.println("An error occurred while reading input: " + e.getMessage());
		        } catch (NumberFormatException e) {
		            System.err.println("Invalid age format. Please enter a valid integer.");
		        }
	    }
}
		
//		```
//
//		### Explanation:
//		1. **Import Statements**:
//		   - Import the necessary classes for reading input and handling exceptions.
//
//		2. **BufferedReader Initialization**:
//		   - `BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));` initializes the reader to take input from the console.
//
//		3. **Reading Input**:
//		   - `String name = reader.readLine();` reads a line from the console and stores it in the `name` variable.
//		   - `String sAge = reader.readLine();` reads another line (expected to be the age as a string) and stores it in the `sAge` variable.
//		   - `int nAge = Integer.parseInt(sAge);` converts the string `sAge` to an integer `nAge`.
//
//		4. **Exception Handling**:
//		   - The `try` block contains the code that might throw an `IOException` or `NumberFormatException`.
//		   - `catch (IOException e)` handles any input/output errors that may occur.
//		   - `catch (NumberFormatException e)` handles cases where the age input is not a valid integer.
//
//		5. **Output**:
//		   - `System.out.printf("Name: %s, Age: %d%n", name, nAge);` prints the formatted output.
//
//		### Example Usage:
//		```
//		Enter your name: Alice
//		Enter your age: 30
//		Name: Alice, Age: 30
//		```
//
//		This code provides a complete example with robust input handling, ensuring the program handles potential exceptions gracefully.
//	}
		         
