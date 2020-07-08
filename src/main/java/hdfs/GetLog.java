package hdfs;


import constant.SeasonEnum;
import org.apache.commons.math3.util.Pair;
import org.apache.http.impl.cookie.DateUtils;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Create by GuoJF on 2019/5/19
 */
public class GetLog {
    public static void main(String[] args) throws SchedulerException {



//        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
//        QuartzManager quartzManager = new QuartzManager();
//
//        quartzManager.setScheduler(scheduler);
//
//        quartzManager.addJob("testJob01", "Group01", "Group01", "Group01", LogJob.class, "30 */1 * * * ?");
        System.out.println(SeasonEnum.SPRING.getSeq());
        Integer first = 156;
        Integer second = 156;
        if (first.equals(second)) {

        } else {

        }
        BigDecimal a = new BigDecimal("1.0");
        BigDecimal b = new BigDecimal("0.9");
        BigDecimal c = new BigDecimal("0.8");

        System.out.println(b.subtract(a));
        String str = "1,2,3,,,";
        String[] strs = str.split(",",0);
        System.out.println(strs.length);


        List<Pair<String, Double>> pairArrayList = new ArrayList(3);
        pairArrayList.add(new Pair("version", 6.19));
        pairArrayList.add(new Pair("version", 10.24));
        pairArrayList.add(new Pair("version", 13.14));
        Map<String, String> map = pairArrayList.stream().collect(
                // 生成的 map 集合中只有一个键值对:{version=13.14}
                 Collectors.toMap(Pair::getKey, Pair::getKey, (v1, v2) -> {
                     return v2+"";
                 }));
        System.out.println(map);
        System.out.println(Instant.now());
//        System.out.println(DateUtils.parseDate(""));

    }




}
