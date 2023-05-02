package com.example.demo.controller.user;

import com.example.demo.dto.request.UserCreateRequest;
import com.example.demo.dto.request.UserUpdateRequest;
import com.example.demo.dto.response.UserResponse;
import com.example.demo.service.user.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;
    public UserController(UserService userService){
        this.userService=userService;
    }

    @PostMapping("/user")   //유저 생성
    public void SaveUser(@RequestBody UserCreateRequest request){
        userService.saveUser(request);

    }

    @DeleteMapping("/user") //유저 삭제
    public void DeleteUser(@RequestParam String name){
        userService.deleteUser(name);
    }

    @GetMapping("/user")    //전체 유저 조회
    public List<UserResponse> GetUser(){
        return userService.getUser();
    }

    @PutMapping("/user")    //유저 수정
    public void UpdateUser(@RequestBody UserUpdateRequest request){
        userService.updateUser(request);
    }


}