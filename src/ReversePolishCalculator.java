// Version: 20200917
// Handin done by:
//   <202004107> <A. Malthe Henriksen>
// Contributions:
//   <A. Malthe Henriksen> <Programmed>

import java.io.*;
import java.util.*;
public class ReversePolishCalculator {

    private Stack<Integer> stack;

    public ReversePolishCalculator() {
        stack = new Stack<>();
    }

    // Add any private fields you might need here
    public void push(int n) {
        // Implement your code here to handle stack push

        stack.push(n);
    }

    public void plus() {
        // Implement your code here to pop two elements and push their sum

        int el1 = stack.pop();
        int el2 = stack.pop();

        stack.push(el1 + el2);
    }

    public void minus() {
        // Implement your code here to pop two elements and push their difference
    }

    public void times() {
        // Implement your code here to pop two elements and push their product
    }

    public int read() {
        // Implement your code here to read the top element from the stack (without removing it)
        return 42;
    }
}