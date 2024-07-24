package com.group.libraryapp.dto.user.request;

public class UserCreateRequest {

    private String name; //이름 필수
    private Integer age; //나이 선택

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
