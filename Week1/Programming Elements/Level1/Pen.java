class Pen{
    public static void main(String[] args){
        int pens = 14,students = 3;
        int pensPerStudent = pens/students;
        System.out.println("Pens per student is "+pensPerStudent + " and the remaining pen not distributed is "+pens%students);
    }
}