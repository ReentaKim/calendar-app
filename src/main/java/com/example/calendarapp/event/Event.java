package com.example.calendarapp.event;

public interface Event {
    void print();

    boolean supports(EventType type);
}
