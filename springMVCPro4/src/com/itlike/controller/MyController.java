package com.itlike.controller;

import com.itlike.domain.Pet;
import com.itlike.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MyController {
    @RequestMapping("testUpdate/{age}")
    public String testUpdate(@PathVariable Integer age, Model model) {
        System.out.println(age);

        //user的信息
        User user = new User();
        user.setName("xiaoxi");
        user.setAge(age);
        user.setGender(1);
        String[] hobby = new String[]{"篮球","桌球"};
        user.setHobby(hobby);
        model.addAttribute("user", user);
        Pet pet = new Pet();
        pet.setName("鼠");
        pet.setId(3);
        user.setPet(pet);

        //所有的兴趣爱好
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add("篮球");
        arrayList.add("足球");
        arrayList.add("桌球");
        model.addAttribute("allhobbys", arrayList);

        //所有的宠物
        ArrayList<Object> petList = new ArrayList<>();
        Pet pet1 = new Pet();
        pet1.setId(1);
        pet1.setName("狗");
        Pet pet2 = new Pet();
        pet2.setId(2);
        pet2.setName("猫");
        Pet pet3 = new Pet();
        pet3.setId(3);
        pet3.setName("鼠");
        petList.add(pet1);
        petList.add(pet2);
        petList.add(pet3);
        model.addAttribute("petList", petList);

        return "/result.jsp";
    }

    @RequestMapping("testUpdate2")
    public String testUpdate2(@Valid User user, BindingResult result, Model model) {
        System.out.println(user);
        //判断有没有错误信息
        if(result.getErrorCount() != 0) {
            List<FieldError> fieldErrors = result.getFieldErrors();
            for(FieldError fieldError : fieldErrors){
                System.out.println(fieldError.getField() + ":" + fieldError.getDefaultMessage());
            }

            //所有的兴趣爱好
            ArrayList<Object> arrayList = new ArrayList<>();
            arrayList.add("篮球");
            arrayList.add("足球");
            arrayList.add("桌球");
            model.addAttribute("allhobbys", arrayList);

            //所有的宠物
            ArrayList<Object> petList = new ArrayList<>();
            Pet pet1 = new Pet();
            pet1.setId(1);
            pet1.setName("狗");
            Pet pet2 = new Pet();
            pet2.setId(2);
            pet2.setName("猫");
            Pet pet3 = new Pet();
            pet3.setId(3);
            pet3.setName("鼠");
            petList.add(pet1);
            petList.add(pet2);
            petList.add(pet3);
            model.addAttribute("petList", petList);

            //回到原来的界面
            return "/result.jsp";
        }

        return "/result2.jsp";
    }

}
