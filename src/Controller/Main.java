package Controller;

import Apps.ReverseString;
import Stack.StackX;

public class Main {
    public static void main(String[] args) {

        StackX stackX = new StackX(4);
        stackX.push(1);
        stackX.push(2);
        stackX.push(3);
        stackX.push(4);

        while (!stackX.isEmpty())
        {
            System.out.println(stackX.pop());
        }

        //---------------
        String s = "Java";
        StackX<Character> characterStackX = new StackX<>(s.length());
        ReverseString reverseString = new ReverseString(s);
        System.out.print(reverseString.reverse());

    }
}
