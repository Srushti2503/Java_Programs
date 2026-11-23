package String;

public class ImmutableClass {

}
    final class School {

        private String name;

        public School(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

      final class Student {

        private final String name;
        private final School school;

        public Student(String name, School school) {
            this.name = name;

            // Defensive copy
            this.school = new School(school.getName());
        }

        public String getName() {
            return name;
        }

        // Defensive copy
        public School getSchool() {
            return new School(school.getName());
        }
    }

