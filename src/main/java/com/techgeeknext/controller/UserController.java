package com.techgeeknext.controller;
import com.techgeeknext.repository.UserDeviceDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin()
public class UserController {

    @Autowired
    private UserDeviceDetailsRepository userDeviceDetailsRepository;

    //to get device id of user
    @RequestMapping(value = "/getdeviceid", method = RequestMethod.GET)
    public List<String> getId(){
        return userDeviceDetailsRepository.getDeviceId();
    }



}