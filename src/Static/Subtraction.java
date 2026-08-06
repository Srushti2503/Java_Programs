/* Since static method cannot access directly the non-static members but if we create the object of
the class within the static method, In this case, we can access non-static members within the static
method. Let’s see an example based on the static method.*/

package Static;

public class Subtraction {
    int a = 40;
    int b = 50;

    // Declaration of instance method.
    void sub()
    {
        int y = a-b;
        System.out.println("Subtraction of two number y = " +y);
    }
    // Declaration of static method
    static void subtract()
    {
        // creating the object of the class within a static area to call instance members.
        Subtraction st = new Subtraction();
        st.sub();
    }
    public static void main(String[] args)
    {
        subtract(); // calling static method.
    }
}
