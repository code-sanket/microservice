package com.sanket.marksheet_service.service;

import com.sanket.marksheet_service.entity.Marks;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MarksService {

    static List<Marks> marksList = new ArrayList<>();

    @PostConstruct
    List<Marks> populateList(){
        marksList.add(new Marks("1", 23L , 34L , 45L , 32L));
        marksList.add(new Marks("2", 23L , 34L , 45L , 32L));
        marksList.add(new Marks("3", 23L , 34L , 45L , 32L));
        marksList.add(new Marks("4", 23L , 34L , 45L , 32L));
        marksList.add(new Marks("5", 23L , 34L , 45L , 32L));

        return marksList;
    }

    public Marks getMarks(String id){
        for(Marks marks : marksList){
            if(marks.getId().equals(id)){
                return marks;
            }
        }
        return null;
    }




}
