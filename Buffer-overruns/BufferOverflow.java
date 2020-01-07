

public class BufferOverflow
{
    public static void main(String[] args)
    {
        int imprntData =1;
        int[]  _buffer = new int[10];

        for (int j =0; j < 15; j++)
            _buffer[j] = 7;

        System.out.println("after_buffer_overrun ");
        System.out.println("Important_data  = "+imprntData);
    }
}

/*
    In the above Code buffer has 10 elements but loop attempts to write 15 elements,
    which can result in a buffer overflow,
    In this code results in an ArrayIndexOutOfBoundsException.
*/
