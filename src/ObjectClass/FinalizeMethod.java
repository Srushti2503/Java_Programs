package ObjectClass;

public class FinalizeMethod {

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Cleanup before object is destroyed.");
        }

        public static void main(String[] args) {

            FinalizeMethod s = new FinalizeMethod();

            try {
                s.finalize();   // Only for demonstration
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }

}
