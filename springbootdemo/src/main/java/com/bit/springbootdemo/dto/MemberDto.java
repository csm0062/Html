package com.bit.springbootdemo.dto;

import lombok.Getter;
import lombok.Setter;
//데이터를 받아오는 클래스/또는 화면으로 보내주려는
@Getter
@Setter
public class MemberDto {
    private long id;
    private String username;
    private String password;
}
