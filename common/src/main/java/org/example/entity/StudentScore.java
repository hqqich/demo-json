package org.example.entity;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by ChenHao on 2023/5/28 is 14:38.
 *
 * @author tsinglink
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class StudentScore {

	private BigDecimal yuWen;

	private BigDecimal shuXue;

	private BigDecimal yinYu;

}
