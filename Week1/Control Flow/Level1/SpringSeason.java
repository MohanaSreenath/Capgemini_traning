import java.util.Scanner;
class SpringSeason{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        if(month==3 && day>=20 && day<=31){
            System.out.println("Its a Spring Season");
        }
        else if(month==4 && day>=1 && day<=20){
            System.out.println("Its a Spring Season");
        }
        else{
            System.out.println("Its not a Spring Season");
        }
    }
}