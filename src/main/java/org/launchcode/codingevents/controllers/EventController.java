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
        Map<String, String> events = new HashMap<>();
        events.put("Kansas Linux Fest", "Annual Kansas Linux Conference");
        events.put("Java Users Group", "Monthly Java Meetup");
        events.put("Strange Loop", "Yearly St. Louis Tech Conference");
        List<ProgrammingEvent> eventList = new ArrayList<>();
        for(String key : events.keySet()) {
            eventList.add(new ProgrammingEvent(key, events.get(key)));
        }
        model.addAttribute("events", eventList);

        return "events/index";
    }
}
