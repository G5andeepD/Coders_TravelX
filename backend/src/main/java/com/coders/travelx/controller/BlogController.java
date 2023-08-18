package com.coders.travelx.controller;


import com.coders.travelx.dto.BlogsShortDetaildto;
import com.coders.travelx.service.BlogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/blog")
public class BlogController {
    //get overall blogs recent
    //get by search
    //get full detail of one item

    @Autowired
    private BlogsService blogsService;

    @GetMapping("/all")
    public List<BlogsShortDetaildto> displayall() throws Exception {
        return blogsService.getAll();

    }




}
