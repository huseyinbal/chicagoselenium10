package interviewQuestions;

public class intQuest1 {

    public static void multiply(int number, int limit) {

        int printNum = 0;
        for (int i = 0; i <limit; i++) {
            number= number * 2;
            System.out.print(number+ " ");
        }
       }

       public static void main(String[] args){


        multiply(2,5);
       }
}