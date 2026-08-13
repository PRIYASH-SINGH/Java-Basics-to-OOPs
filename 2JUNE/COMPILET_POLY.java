
class COMPILET_POLY
{
    int add(int x, int y)
    {
        return x + y;
    }

    int add(int x, int y, int z)
    {
        return x + y + z;
    }

    public static void main(String args[])
    {
        COMPILET_POLY calc = new COMPILET_POLY();
        System.out.println(calc.add(50, 100));
        System.out.println(calc.add(10, 20, 30));
    }
} // COMPILE TIME POLYMORPHISM, THERE CAN BE N NO. OF METHODS WITH SAME NAME AND DIFFERENT PARAMETERS
// THE COMPILER MATCHES THE ARGUMENT LIST FROM METHOD CALL TO WHICH METHOD IT SHOULD CALL

