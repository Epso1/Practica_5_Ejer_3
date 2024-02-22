package com.example.practica_5_ejer_3.service;

import com.example.practica_5_ejer_3.model.DateModel;

public interface DateService {

   DateModel getCurrentDate();
   DateModel getDatePlusNDays(int n);

   void updateDate(DateModel newDate);

}
