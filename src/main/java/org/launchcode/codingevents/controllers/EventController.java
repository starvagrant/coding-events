package org.launchcode.codingevents.controllers;

import org.launchcode.codingevents.ProgrammingEvent;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("events")
public class EventController {

    @GetMapping
    public String displayAllEvents(Model model) {
        List<ProgrammingEvent> eventList = new ArrayList<>();
        eventList.add(new ProgrammingEvent("Kansas Linux Fest", "Annual Kansas Linux Conference", "klf200.jpg"));
        eventList.add(new ProgrammingEvent("Java Users Group", "Monthly Java Meetup", "jug200.png"));
        eventList.add(new ProgrammingEvent("Strange Loop", "Yearly St. Louis Tech Conference", "sl200.jpg"));
        model.addAttribute("events", eventList);


        return "events/index";
    }
}
