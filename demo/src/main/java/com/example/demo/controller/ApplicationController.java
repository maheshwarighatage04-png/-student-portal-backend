package com.example.demo.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.example.demo.model.Application;
import com.example.demo.service.ApplicationService;

@RestController
@RequestMapping("/api/applications")
@CrossOrigin("*")
public class ApplicationController {

    private final ApplicationService appService;

    public ApplicationController(ApplicationService appService) {
        this.appService = appService;
    }

    @PostMapping
    public Application saveApplication(@RequestBody Application application) {
        return appService.saveApplication(application);
    }

    @GetMapping
    public List<Application> getAll() {
        return appService.getAll();
    }

    @PatchMapping("/{id}")
    public Application updateStatus(@PathVariable String id, @RequestParam String status) {
        return appService.updateStatus(id, status);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id) {
        appService.delete(id);
        return "Deleted";
    }
}
