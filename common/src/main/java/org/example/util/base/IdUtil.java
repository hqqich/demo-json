//package org.example.util.base;
//
//import com.sun.xml.internal.ws.util.UtilException;
//
///**
// * Created by ChenHao on 2023/5/28 is 15:16.
// *
// * @author tsinglink
// */
//
//public class IdUtil {
//
//	/**
//	 * 获取机器ID，使用进程ID配合数据中心ID生成<br>
//	 * 机器依赖于本进程ID或进程名的Hash值。
//	 *
//	 * <p>
//	 * 此算法来自于mybatis-plus#Sequence
//	 * </p>
//	 *
//	 * @param datacenterId 数据中心ID
//	 * @param maxWorkerId  最大的机器节点ID
//	 * @return ID
//	 * @since 5.7.3
//	 */
//	public static long getWorkerId(long datacenterId, long maxWorkerId) {
//		final StringBuilder mpid = new StringBuilder();
//		mpid.append(datacenterId);
//		try {
//			mpid.append(RuntimeUtil.getPid());
//		} catch (UtilException igonre) {
//			//ignore
//		}
//		/*
//		 * MAC + PID 的 hashcode 获取16个低位
//		 */
//		return (mpid.toString().hashCode() & 0xffff) % (maxWorkerId + 1);
//	}
//
//
//	/**
//	 * 获取数据中心ID<br>
//	 * 数据中心ID依赖于本地网卡MAC地址。
//	 * <p>
//	 * 此算法来自于mybatis-plus#Sequence
//	 * </p>
//	 *
//	 * @param maxDatacenterId 最大的中心ID
//	 * @return 数据中心ID
//	 * @since 5.7.3
//	 */
//	public static long getDataCenterId(long maxDatacenterId) {
//
//		if(maxDatacenterId == Long.MAX_VALUE){
//			maxDatacenterId -= 1;
//		}
//		long id = 1L;
//		byte[] mac = null;
//		try{
//			mac = NetUtil.getLocalHardwareAddress();
//		}catch (UtilException ignore){
//			// ignore
//		}
//		if (null != mac) {
//			id = ((0x000000FF & (long) mac[mac.length - 2])
//					| (0x0000FF00 & (((long) mac[mac.length - 1]) << 8))) >> 6;
//			id = id % (maxDatacenterId + 1);
//		}
//
//		return id;
//	}
//
//
//}
