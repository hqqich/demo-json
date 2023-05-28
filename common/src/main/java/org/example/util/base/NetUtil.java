//package org.example.util.base;
//
//import java.net.Inet4Address;
//import java.net.InetAddress;
//import java.util.Collections;
//import java.util.LinkedHashSet;
//
///**
// * Created by ChenHao on 2023/5/28 is 15:21.
// *
// * @author tsinglink
// */
//
//public class NetUtil {
//
//
//
//	/**
//	 * 获得本机物理地址
//	 *
//	 * @return 本机物理地址
//	 * @since 5.7.3
//	 */
//	public static byte[] getLocalHardwareAddress() {
//		return getHardwareAddress(getLocalhost());
//	}
//
//
//	/**
//	 * 获取本机网卡IP地址，规则如下：
//	 *
//	 * <pre>
//	 * 1. 查找所有网卡地址，必须非回路（loopback）地址、非局域网地址（siteLocal）、IPv4地址
//	 * 2. 如果无满足要求的地址，调用 {@link InetAddress#getLocalHost()} 获取地址
//	 * </pre>
//	 * <p>
//	 * 此方法不会抛出异常，获取失败将返回{@code null}<br>
//	 * <p>
//	 * 见：https://github.com/dromara/hutool/issues/428
//	 *
//	 * @return 本机网卡IP地址，获取失败返回{@code null}
//	 * @since 3.0.1
//	 */
//	public static InetAddress getLocalhost() {
//		final LinkedHashSet<InetAddress> localAddressList = localAddressList(address -> {
//			// 非loopback地址，指127.*.*.*的地址
//			return false == address.isLoopbackAddress()
//					// 需为IPV4地址
//					&& address instanceof Inet4Address;
//		});
//
//		if (localAddressList== null || localAddressList.size() == 0) {
//			InetAddress address2 = null;
//			for (InetAddress inetAddress : localAddressList) {
//				if (false == inetAddress.isSiteLocalAddress()) {
//					// 非地区本地地址，指10.0.0.0 ~ 10.255.255.255、172.16.0.0 ~ 172.31.255.255、192.168.0.0 ~ 192.168.255.255
//					return inetAddress;
//				} else if (null == address2) {
//					address2 = inetAddress;
//				}
//			}
//
//			if (null != address2) {
//				return address2;
//			}
//		}
//
//		try {
//			return InetAddress.getLocalHost();
//		} catch (UnknownHostException e) {
//			// ignore
//		}
//
//		return null;
//	}
//
//}
