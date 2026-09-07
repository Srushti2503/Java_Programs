package ObjectClass;

public class ToStringMethod {

        String name;
        String age;

    ToStringMethod(String name, String age) {
            this.name = name;
            this.age = age;

        }

        // Overriding toString() method
        @Override
        public String toString() {
            return "Geeks object => {" +
                    "name='" + name + '\'' +
                    ", age='" + age + '\''+
                    '}'
                    ;
        }

        // Main Method
        public static void main(String[] args)
        {

            ToStringMethod g1 = new ToStringMethod("Geeks", "22");

            // printing the hashcode of the objects
            System.out.println(g1.toString());


        }
}


