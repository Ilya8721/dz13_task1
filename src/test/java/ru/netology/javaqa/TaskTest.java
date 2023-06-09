package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskTest {


    @Test
    public void shouldTheQueryBeInSimpleTask1() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean expected = true;
        boolean actual = simpleTask.matches("Позвонить родителям");

        Assertions.assertEquals(actual, expected);
    }


    @Test
    public void shouldTheQueryBeInSimpleTask0() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean expected = false;
        boolean actual = simpleTask.matches("Купить апельсин");

        Assertions.assertEquals(actual, expected);
    }


    @Test
    public void shouldTheQueryBeInEpic1() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean expected = true;
        boolean actual = epic.matches("Яйца");

        Assertions.assertEquals(actual, expected);
    }


    @Test
    public void shouldTheQueryBeInEpic2() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб", "Яйца"};
        Epic epic = new Epic(55, subtasks);

        boolean expected = true;
        boolean actual = epic.matches("Яйца");

        Assertions.assertEquals(actual, expected);
    }


    @Test
    public void shouldTheQueryBeInEpic0() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean expected = false;
        boolean actual = epic.matches("Апельсин");

        Assertions.assertEquals(actual, expected);
    }


    @Test
    public void shouldTheQueryBeInMeeting1() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = true;
        boolean actual = meeting.matches("Выкатка 3й версии приложения");

        Assertions.assertEquals(actual, expected);
    }


    @Test
    public void shouldTheQueryBeInMeeting2() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = true;
        boolean actual = meeting.matches("Приложение НетоБанка");

        Assertions.assertEquals(actual, expected);
    }


    @Test
    public void shouldTheQueryBeInMeetingDouble() {
        Meeting meeting = new Meeting(
                555,
                "Приложение НетоБанка",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = true;
        boolean actual = meeting.matches("Приложение НетоБанка");

        Assertions.assertEquals(actual, expected);
    }


    @Test
    public void shouldTheQueryBeInMeeting0() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = false;
        boolean actual = meeting.matches("Купить апельсин");

        Assertions.assertEquals(actual, expected);
    }
}