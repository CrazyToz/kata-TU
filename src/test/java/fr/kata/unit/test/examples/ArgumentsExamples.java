package fr.kata.unit.test.examples;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

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

    // TODO : écrire un test qui vérifie que l'étudiant étudie le cours qui lui a été affecté

    @Test
    public void lesson_studied() {
        // GIVEN
        Student student = Mockito.mock(Student.class);
        Teacher teacher = new Teacher();

        // WHEN
        teacher.teachTo(student);

        // THEN
        ArgumentCaptor<Lesson> argumentCaptor = ArgumentCaptor.forClass(Lesson.class);
        Mockito.verify(student).study(argumentCaptor.capture());
        Lesson lesson = argumentCaptor.getValue();
        Assertions.assertThat(lesson.name).isEqualTo("Maths");
    }
}
