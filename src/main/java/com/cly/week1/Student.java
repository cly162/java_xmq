package com.cly.week1;

import lombok.*;

import java.util.List;

/**
 * @ClassName Student
 * @Description TODO
 * @Author 29180
 * @Date 2020/10/15
 **/

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Student {
    private  String id;
    private  String studentName;
    private  String gender;
    private  Phone phone;
    private List<Book> bookList;
}
