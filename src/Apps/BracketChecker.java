package Apps;

import Stack.StackX;

public class BracketChecker {
    private String input;

    public BracketChecker(String input) {
        this.input = input;
    }

    public void check()
    {
        int strSize = input.length();
        StackX<Character> stackX = new StackX<>(strSize);

        for (int i = 0; i < strSize; i++)
        {
            char ch = input.charAt(i);

            switch (ch)
            {
                case '{':
                case '(':
                case '[':
                       stackX.push(ch);
                       break;
                case '}':
                case ')':
                case ']':
                    if (!stackX.isEmpty()) {
                        char chx = stackX.pop();
                        if ((ch == '}' && chx != '{') || (ch == ']' && chx != '[') || (ch == ')' && chx != '('))
                        {
                            System.out.println("Error "+ch+" at pos " + i);
                        }
                    }
                    else System.out.println("not enough elements");
                    break;
                default: break;

            }
        }

    }
}
