package org.example.entity;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by ChenHao on 2023/5/28 is 14:34.
 *
 * @author tsinglink
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class School {

    private Long id;

    private String name;

    private SchoolDetail schoolDetail;

    private List<Student> students;

}
