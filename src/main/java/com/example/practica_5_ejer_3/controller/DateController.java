package com.example.practica_5_ejer_3.controller;

import com.example.practica_5_ejer_3.model.DateModel;
import com.example.practica_5_ejer_3.service.DateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/date")
public class DateController {

    private final DateService dateService;

    @Autowired
    public DateController(DateService dateService) {
        this.dateService = dateService;
    }

    @GetMapping
    public ResponseEntity<DateModel> getCurrentDate() {
        DateModel date = dateService.getCurrentDate();
        return new ResponseEntity<>(date, HttpStatus.OK);
    }

    @GetMapping("/{n}")
    public ResponseEntity<DateModel> getDatePlusNDays(@PathVariable int n) {
      DateModel date = dateService.getDatePlusNDays(n);
      return new ResponseEntity<>(date, HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<DateModel> updateSystemDate(@RequestBody DateModel newDateModel) {
        // Si se quisiera cambiar la fecha del sistema,
        // habría que pasar un objeto DateModel a esta función.

        dateService.updateDate(newDateModel);
        return new ResponseEntity<>(newDateModel,HttpStatus.OK);
    }
}