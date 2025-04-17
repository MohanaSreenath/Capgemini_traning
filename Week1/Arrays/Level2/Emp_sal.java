import java.util.Scanner;
class Emp_sal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] salary = new int[10][2];
        for(int i=0;i<10;i++){
            salary[i][0] = sc.nextInt();
            salary[i][1] = sc.nextInt();
        }
        // in first row we have emp sal and in second row we have emp years worked
        //so we take emp years worked and if he wroked more than 5 years we give him 5% bonus
        //or if he worked less than 5 years we give him 2% bonus
        for(int i=0;i<10;i++){
            if(salary[i][1]>5){
                salary[i][0] = salary[i][0] + (salary[i][0]*5)/100;
            }
            else{
                salary[i][0] = salary[i][0] + (salary[i][0]*2)/100;
            }
        }
        //displaying the salary after bonus and years worked and increased salary
        for(int i=0;i<10;i++){
            System.out.println("Emp "+(i+1)+"  new salary is "+salary[i][0]+" and he worked "+salary[i][1]+" years");
        }


        sc.close();
    }    
}

    