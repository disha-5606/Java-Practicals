// import java.util.scanner;

// public class even_odd {
//     public static void main(String[] args) {

//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Enter a number: ");
//         int num = scanner.nextInt();

//         if(num % 2 == 0)
//         {
//             System.out.println(num + " is even.");
//         } 
//         else 
//         {
//             System.out.println(num + " is odd.");
//         }
//         scanner.close();
//     }
// }



public class even_odd {
    public static void main(String[] args) {

       int [] numbers = {2, 3, 4, 5, 6};

       int count = 0;

        for(int num : numbers) {
            if(num % 2 == 0)
            {  
               count++;
           
            } 
       
        }
        System.out.println("Count of even numbers: " + count);
       
}
}