package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by ChenHao on 2023/5/28 is 14:37.
 *
 * @author tsinglink
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Student {

    private String name;

    private Integer age;

    private StudentScore studentScore;

}
