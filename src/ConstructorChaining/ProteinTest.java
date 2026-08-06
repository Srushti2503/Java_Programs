package ConstructorChaining;

class Protein
{
    private String gender;
    private int need;
    private String source;

    Protein()
    {
        this("female", 46);
        System.out.println("Protein requirement for children above 9 years old: 36 gm/day");
    }
    Protein(String s, int need)
    {
        this("male" , 56 , "milk");
        System.out.println("Protein requirement for women: 46 gm/day");
    }
    Protein(String gender, int need, String source)
    {
        this.gender = gender;
        this.need = need;
        this.source = source;
        System.out.println("Protein requirement for men: 56 gm/day");
    }
}
public class ProteinTest {
    public static void main(String[] args)
    {
        Protein p1 = new Protein();
        Protein p2 = new Protein("female",46);
        Protein p3 = new Protein("male", 56, "milk");
    }
}
