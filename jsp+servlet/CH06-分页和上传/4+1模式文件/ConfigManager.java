package com.whcs.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 项目名称：testPages   
 * 类名称：ConfigManager   
 * 类描述：获取属性文件database.properties
 * 创建人：Yegz  
 * 创建时间：2017年6月5日 下午3:21:50   
 * 修改人：Administrator   
 * 修改时间：2017年6月5日 下午3:21:50   
 * 修改备注：   
 * @version    
 *
 */
public class ConfigManager {
    private static Properties props = null;

    static {
        InputStream is = null;
        is = ConfigManager.class.getClassLoader().getResourceAsStream("database.properties");
        if (is == null)
            throw new RuntimeException("找不到数据库参数配置文件！");
        props = new Properties();
        try {
            props.load(is);
        } catch (IOException e) {
            throw new RuntimeException("数据库配置参数加载错误！", e);
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*
     * 将我们的属性文件读取进来之后，
     * 通过属性的Key进行获取value值
     */
    public static String getProperty(String key) {
        return props.getProperty(key);
    }
}
