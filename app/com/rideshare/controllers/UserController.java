package com.rideshare.controllers;

import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by thisararanawaka on 7/13/17.
 */
public class UserController extends Controller {
    public Result test(){
        return ok("Rideshare Backend");
    }


    public static void main(String[] args) {

    }
}
