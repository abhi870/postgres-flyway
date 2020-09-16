package com.test.dataskills;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class AppController {

    @Autowired
    private AppRepository appRepository;

    @GetMapping("/get")
    public AppUser getuser(@RequestParam String firstName){
        AppUser appUser = appRepository.findByFirstName(firstName);
        return appUser;
    }

    @GetMapping("/delete")
    public void deleteUser(@RequestParam String firstName){
         appRepository.deleteByFirstName(firstName);
    }

    @GetMapping("save")
    public AppUser saveUser(@RequestBody Input input){
        AppUser appUser = new AppUser();
        appUser.setAppuserid(new Long(1));
        appUser.setFirstName(input.getFirstName());
        appUser.setLastName(input.getLastName());
        return appRepository.save(appUser);
    }
}
