package com.yeahsir.controller;

import com.yeahsir.entity.Pet;
import com.yeahsir.service.IPetService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * Created by Yegz on 2017/9/14.
 */
@Controller
@RequestMapping("/pet")
public class PetController {
    private static Logger logger = Logger.getLogger(PetController.class);
    @Resource
    IPetService petService;

    @RequestMapping("/getPetInfo")
    public String getPetInfo(@RequestParam Integer id, Model model){
        Pet pet = petService.selectByPrimaryKey(id);
        model.addAttribute("pet", pet);
        return "showPetInfo";
    }
}
