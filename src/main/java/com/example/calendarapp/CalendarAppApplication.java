package com.example.calendarapp;


import com.example.calendarapp.event.Meeting;
import com.example.calendarapp.event.Schedule;
import com.example.calendarapp.reader.EventCsvReader;

import java.io.IOException;
import java.util.List;

public class CalendarAppApplication {

    public static void main(String[] args) throws IOException {
        Schedule schedule = new Schedule();

        EventCsvReader csvReader = new EventCsvReader();
        String meetingCsvPath = "/data/meeting.csv";

        List<Meeting> meetings = csvReader.readMeetings(meetingCsvPath);
        meetings.forEach(schedule::add);

        schedule.printAll();
    }

}
