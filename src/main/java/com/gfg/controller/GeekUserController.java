package com.gfg.controller;  
import org.springframework.beans.factory.annotation.Autowired;   
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.bind.annotation.RestController;

import com.gfg.model.GeekUserRecord;
import com.gfg.service.GeekUserService;

import java.util.List;  
@RestController  
public class GeekUserController 
{  
    @Autowired  
    private GeekUserService userService;   
    @RequestMapping("/")  
    public List<GeekUserRecord> getAllUser()
    {  
        return userService.getAllGeekUsers();  
    }     
    @RequestMapping(value="/add-geekuser", method=RequestMethod.POST)  
    public void addUser(@RequestBody GeekUserRecord userRecord)
    {  
        userService.addGeekUser(userRecord);  
    }  
    
}  
