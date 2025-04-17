import java.util.Scanner;
class Emp_sal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        int year_of_joining = sc.nextInt();
        int current_year = 2025;
        int years_of_service = current_year - year_of_joining;
        if (years_of_service > 5){
            System.out.println(salary + (salary * 0.05));
        }else{
            System.out.println(salary);
        }
    }
}