package com.test.dataskills;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
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
        List<UserAddress> userAddress = new ArrayList<>();
        appUser.setUserAddress(userAddress);


        appUser.setFirstName(input.getFirstName());
        appUser.setLastName(input.getLastName());

        input.getAddresses().stream().forEach((address)->{
            UserAddress ad = new UserAddress();
            ad.setAddress(address);
            appUser.getUserAddress().add(ad);
        });
        return appRepository.save(appUser);
    }

//    @Autowired
//    private AddressRepo addressRepo;
//    @PostMapping("/addr")
//    public UserAddress saveAddress(@RequestBody Input input){
//        UserAddress userAddress = new UserAddress();
//        userAddress.setAppUserAddressId(appRepository.findByFirstName(input.getFirstName()).getAppuserid());
//        userAddress.setAddress(input.getAddress());
//        return addressRepo.save(userAddress);
//    }
}
