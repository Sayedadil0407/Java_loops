public class Loops {
    public static void main(String[] args) 
    {
         /*for (int i = 0; i < 10; i++)
        {
            if (i == 5) break;
            System.out.println(i);
        }*/
    

       /*  for (int i = 0, j =10; i<j;i++,j--)
        {
            System.out.println(i+" "+j);
        }
    */
        
        /*for (int i = 1; i < 6; i++){
            for (int s = 5; s>=i;s--){
                System.out.print("*");
            }
            for (int j = i; j<6-i ;j++){
                System.out.print(" ");

            }
            System.out.println();

        }*/

        /* int [] arr = {10,20,30,40};
        for (int i =0; i < arr.length; i++){   
            System.out.println(arr[i]);}
        */

           /*  for (int i = 1; i<=100; i++){
                if (i%3 == 0){
                    continue;
                    
                }
                if (i == 50){
                    break;}
                System.out.println(i);
            }*/


        /*int n = 1234;
        int sum = 0;
        while (n>0){
            int digit = n%10;
            sum = sum + digit;
             n=n/10;}
        System.out.println(sum);

*/

       /*  for (int i =1;i<=4;i++){
            for (int j =1; j<=5;j++){
                if (i ==1 || j==1 || i == 4 || j ==5){
                    System.out.print("*"); }
                    else {
                        System.out.print(" ");
                    }
            }
            System.out.println(); */

            /* for (int i = 1;i <=4;i++){
                for (int j = 4;j>=i;j--){
                    System.out.print("*");
                }
                System.out.println();
            } */
            
                for (int i = 1; i <=4;i++){
                    for (int s =1;s<=4-i;s++){
                        System.out.print(" ");
                    }
                    for (int j =1;j<=i;j++){
                        System.out.print("*");
                    
                    }
                    System.out.println();
                }


        }
        }



        

