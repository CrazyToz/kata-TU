package fr.kata.unit.test.examples;

public class ArgumentsExamples {

    static class Lesson {
        private final String name;

        public Lesson(String name) {
            this.name = name;
        }
    }

    static class Student {
        public void study(Lesson lesson) {
            // do stuff
        }
    }

    static class Teacher {
        public void teachTo(Student student) {
            Lesson lesson = new Lesson("Maths");
            student.study(lesson);
        }
    }

    // TODO : écrire un test qui vérifie que l'étudiant étudie bien le cours qui lui a été affecté, c.a.d Maths
}
