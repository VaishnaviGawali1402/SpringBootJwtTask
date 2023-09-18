package com.techgeeknext.controller;

import com.techgeeknext.model.UserDevice;
import com.techgeeknext.model.UserDto;
import com.techgeeknext.repository.UserDeviceDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserDeviceController {
    @Autowired
    private UserDeviceDetailsRepository userDeviceDetailsRepository;

    @RequestMapping(value ="/regi",method = RequestMethod.POST)
    public void registerUserDevice(@RequestBody UserDevice userDevice){
        userDeviceDetailsRepository.save(userDevice);
    }



}
