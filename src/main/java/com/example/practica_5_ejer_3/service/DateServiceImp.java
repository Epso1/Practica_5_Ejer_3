package com.example.practica_5_ejer_3.service;

import com.example.practica_5_ejer_3.model.DateModel;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDate;

@Service
public class DateServiceImp implements DateService {

    @Override
    public DateModel getCurrentDate() {
        LocalDate currentDate = LocalDate.now();
        DateModel date = new DateModel();
        date.setDay(currentDate.getDayOfMonth());
        date.setMonth(currentDate.getMonthValue());
        date.setYear(currentDate.getYear());
        return date;
    }

    @Override
    public DateModel getDatePlusNDays(@PathVariable int n) {
        LocalDate futureDate = LocalDate.now().plusDays(n);
        DateModel dateModel = new DateModel();
        dateModel.setDay(futureDate.getDayOfMonth());
        dateModel.setMonth(futureDate.getMonthValue());
        dateModel.setYear(futureDate.getYear());
        return dateModel;
    }

    @Override
    public void updateDate(DateModel newDate) {
        // Cambiar la fecha del sistema no es recomendable y se necesitan permisos de administrador.
        // Sin embargo, si se quisiera hacer, se usaría el objeto newDate para cambiar la fecha del sistema.
        System.out.println("Error: El método de actualización de la fecha del sistema no está implementado.");
    }
}
