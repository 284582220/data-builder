package com.yangguojun;

import com.yangguojun.config.SystemConfigUtils;
import com.yangguojun.entity.PigEntity;
import com.yangguojun.util.JsonUtil;
import com.yangguojun.util.MessageProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

import static com.yangguojun.util.PigEntityFactory.createPigEntity;

/**
 * Hello world!
 */
public class App {

    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) throws Exception {
        if (args == null) {
            log.info("系统启动");
            throw new Exception("入参不能为空");
        }
        String parma = args[0];
        int count = Integer.valueOf(parma);
        MessageProducer messageProducer = new MessageProducer(createProperties());
        for(int i=0; i<count*10000; i++){
            PigEntity pigEntity = createPigEntity();
            messageProducer.sendMessage("pig_info", null, JsonUtil.toJsonString(pigEntity));
        }

    }

    private static Properties createProperties() {
        Properties props = new Properties();
        props.put("bootstrap.servers", SystemConfigUtils.getProperty("kafka.bootstrap.servers"));
        props.put("retries", 3);
        props.put("batch.size", 1024*16);
        props.put("linger.ms", 1);
        props.put("buffer.memory", 33554432);
        return props;
    }
}
