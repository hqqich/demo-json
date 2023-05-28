package org.example.util;

import com.google.common.collect.Lists;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.example.entity.School;
import org.example.entity.SchoolDetail;
import org.example.entity.Student;
import org.example.entity.StudentScore;

/**
 * Created by ChenHao on 2023/5/28 is 14:48.
 *
 * @author tsinglink
 */

public class SchoolUtil {

	private static final SnowflakeIdWorker idWorker = new SnowflakeIdWorker(0, 0);


	public static School getSchoolData() {
		return new School(idWorker.nextId(), "沙雕大学", getSchoolDetail(), getStudents());
	}

	private static SchoolDetail getSchoolDetail() {
		return new SchoolDetail("安徽省会宁县");
	}

	private static List<Student> getStudents() {

		ArrayList<Student> Students = Lists.newArrayList();

		for (int i = 0; i < RandInfo.getAge(); i++) {
			Students.add(getStudent());
		}
		return Students;
	}

	public static Student getStudent() {

		return new Student(RandInfo.getFullName(), RandInfo.getAge(), getStudentScore());

	}

	public static StudentScore getStudentScore() {

		return new StudentScore(
				new BigDecimal(RandInfo.getRandomToStr(0d, 100d)),
				new BigDecimal(RandInfo.getRandomToStr(0d, 100d)),
				new BigDecimal(RandInfo.getRandomToStr(0d, 100d))
				);

	}


	public static List<School> getSchoolsData() {

		ArrayList<School> Schools = Lists.newArrayList();

		for (int i = 0; i < 10; i++) {
			Schools.add(getSchoolData());
		}

		return Schools;
	}


	public static void main(String[] args) {
		List<School> schoolsData = getSchoolsData();

		System.out.println(schoolsData);
	}

}
