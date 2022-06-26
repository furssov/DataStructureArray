package Apps;

import Stack.StackX;

import java.util.Locale;

public class ReverseString {
    private String input;
    private String output;

    public ReverseString(String input) {
        this.input = input;
    }

    public String reverse()
    {
        int size = input.length();
        StackX<Character> stackX = new StackX<Character>(size);

        for (int i = 0; i < size; i++)
        {
            stackX.push(input.charAt(i));
        }
             output = "";
        while (!stackX.isEmpty())
        {
            output = output + stackX.pop();
        }
        return output.toLowerCase(Locale.ROOT);
    }
}
