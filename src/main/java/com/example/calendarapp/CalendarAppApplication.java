package com.example.calendarapp;


import com.example.calendarapp.event.Meeting;
import com.example.calendarapp.event.Schedule;
import com.example.calendarapp.event.Todo;

import java.time.ZonedDateTime;
import java.util.HashSet;

public class CalendarAppApplication {

    public static void main(String[] args) {
        Schedule schedule = new Schedule();
        HashSet<String> participants = new HashSet<>();
        participants.add("reenta.kim");

        Meeting meeting1 = new Meeting(
                1, "meeting1", ZonedDateTime.now(), ZonedDateTime.now().plusHours(1),
                participants, "meetingRoomA", "스터디"
        );

        schedule.add(meeting1);

        Todo todo1 = new Todo(
                2, "todo1", ZonedDateTime.now().plusHours(3), ZonedDateTime.now().plusHours(4),
                "할 일 적기"
        );
        schedule.add(todo1);

        Todo todo2 = new Todo(
                3, "todo2", ZonedDateTime.now().plusHours(5), ZonedDateTime.now().plusHours(4),
                "할 일 적기222"
        );
        schedule.add(todo2);
//        list.forEach(Event::print);

//        schedule.printBy(EventType.TO_DO);

        schedule.printAll();
    }

}
