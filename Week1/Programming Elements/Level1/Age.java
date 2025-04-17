import java.util.Scanner; //import Scanner module to take input from the user
// declaring class below same with the file name
class Age{
	public static void main(String[] args){
		//creating the fucntion to take input 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you age");
		//taking input of cyear of birth here
		int year_birth = sc.nextInt();
		System.out.println("Enter the current year");
		//taking current year of person as input here
		int current_year = sc.nextInt();
		//calculating the age here
		int age = current_year-year_birth;
		//Display result
		System.out.println("Your age is "+age);
		sc.close();
		}
	}
		