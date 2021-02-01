package com.abhi.postgresintegration.controller;

import com.abhi.postgresintegration.entity.FloorRequest;
import com.abhi.postgresintegration.repo.FloorRequestRepo;
import com.abhi.postgresintegration.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    TestService testService;
    @PostMapping(value = "/post")
    public FloorRequest postData(@RequestBody FloorRequest floorRequest) {
       return  testService.postFloorRequest(floorRequest);
    }

    @GetMapping(value = "/get")
    public List<FloorRequest> postData() {
        return  testService.getFloorRequestByHotelId(23);
    }


    }
