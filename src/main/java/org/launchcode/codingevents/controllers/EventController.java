package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

    @GetMapping
    public String getEvents(Model model) {
        List<String> events = new ArrayList<>();
        events.add("Kansas Linux Fest");
        events.add("Java Users Group");
        events.add("Strange Loop");
        model.addAttribute("events", events);
        return "events/index";
    }
}
