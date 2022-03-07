package com.Assessment.Users_WS.services;

import java.util.ArrayList;

import com.Assessment.Users_WS.models.Gender;
import com.Assessment.Users_WS.models.Response;
import com.Assessment.Users_WS.repositories.GenderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenderService {

    @Autowired
    GenderRepository repository;

    public Response getAllGenders() {
        Response response = new Response();
        try {
            ArrayList<Gender> gendersList = (ArrayList<Gender>) repository.findAll();
            response.setGendersList(gendersList);
            ErrorFalseMessageSingleton s = ErrorFalseMessageSingleton.getInstance();
            response.setCode(s.getCode());
            response.setError(s.isError());
            response.setMessage(s.getMessage());
            return response;
        } catch (Exception e) {
            response.setCode(400);
            response.setError(true);
            response.setMessage("There was an error in the database");
            return response;
        }
    }

}
