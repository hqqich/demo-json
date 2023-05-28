//package org.example.util.base;
//
//import java.util.concurrent.ThreadLocalRandom;
//
///**
// * Created by ChenHao on 2023/5/28 is 15:19.
// *
// * @author tsinglink
// */
//
//public class RandomUtil {
//
//    /**
//     * 获取随机数生成器对象<br>
//     * ThreadLocalRandom是JDK 7之后提供并发产生随机数，能够解决多个线程发生的竞争争夺。
//     *
//     * <p>
//     * 注意：此方法返回的{@link ThreadLocalRandom}不可以在多线程环境下共享对象，否则有重复随机数问题。
//     * 见：https://www.jianshu.com/p/89dfe990295c
//     * </p>
//     *
//     * @return {@link ThreadLocalRandom}
//     * @since 3.1.2
//     */
//    public static ThreadLocalRandom getRandom() {
//        return ThreadLocalRandom.current();
//    }
//
//    /**
//     * 获得随机数
//     *
//     * @return 随机数
//     * @see ThreadLocalRandom#nextLong()
//     * @since 3.3.0
//     */
//    public static long randomLong() {
//        return getRandom().nextLong();
//    }
//
//    /**
//     * 获得指定范围内的随机数 [0,limit)
//     *
//     * @param limit 限制随机数的范围，不包括这个数
//     * @return 随机数
//     * @see ThreadLocalRandom#nextLong(long)
//     */
//    public static long randomLong(long limit) {
//        return getRandom().nextLong(limit);
//    }
//
//
//
//    /**
//     * 获得指定范围内的随机数[min, max)
//     *
//     * @param min 最小数（包含）
//     * @param max 最大数（不包含）
//     * @return 随机数
//     * @see ThreadLocalRandom#nextLong(long, long)
//     * @since 3.3.0
//     */
//    public static long randomLong(long min, long max) {
//        return getRandom().nextLong(min, max);
//    }
//
//}
