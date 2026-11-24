import java.util.*;

public class Stack {

    int top = -1, max = 5, pop_value;
    int stack[] = new int[5];

    void push(int n) {

        if (top == max - 1) {
            System.out.println("Stack is full");
        }

        else {
            top++;
            stack[top] = n;
            System.out.println(n + " is Pushed!!");
            display();
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack is empty !");
        } else {
            pop_value = stack[top];
            top--;
            System.out.println(pop_value + " is Popped !!");
            display();
        }
    }

    void peak() {
        if (top == -1) {
            System.out.println("Stack is empty !");
        } else {
            System.out.println("Topmost Element is " + stack[top]+" at index " + top+"\n");
        }
    }

    void display() {
        System.out.println("Stack is .... ");
        if (top == -1) {
            System.out.println("Stack is empty !");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println("\t[" + stack[i] + "]");
            }
        }
        System.out.println("\n");  

    }

    public static void main (String [] args)
    {
        int n ; 

        Stack stack = new Stack();
        Scanner sc = new Scanner(System.in);
        int ch;
        do
        {

            System.out.println("####### MENU #######");
            System.out.println("1.PUSH\n2.POP\n3.Peak\n4.Display\n0.Exit");
            System.out.println("Enter the choice");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1: System.out.println("Enter the element for push");
                        n = sc.nextInt();
                        stack.push(n);
                        break;

                case 2:
                        stack.pop();
                        break;

                case 3: stack.peak();
                        break;

                case 4: stack.display();
                        break;

                default: System.out.println("Invalid choice");
            }

        } while(ch!=0);

        System.out.println("Exiting the program");

    }

        
       


    }
