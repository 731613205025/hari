/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse;

/**
 *
 * @author Student
 */
public class Reverse {

    /**
     * @param args the command line arguments
     */
    public static int main(String[] args, long input) {
        // TODO code application logic here
        
    long reversedNum = 0;

    long input_long = input;

    while (input_long != 0)
    {
        reversedNum = reversedNum * 10 + input_long % 10;
        input_long = input_long / 10;
    }

    if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE)
    {
        throw new IllegalArgumentException();
    }
    return (int)reversedNum;
}
    }

