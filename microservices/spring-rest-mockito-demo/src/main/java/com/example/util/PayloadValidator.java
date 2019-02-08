package com.example.util;

/**
 * Created by irichiez on 4/16/17.
 */

import com.example.model.ToDo;

public class PayloadValidator {

    public static boolean validateCreatePayload(ToDo toDo){
        if (toDo.getId() > 0){
            return false;
        }
        return true;
    }

}
