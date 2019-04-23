package com.yangguojun.util;

import com.yangguojun.entity.PigEntity;

import java.util.Random;

public class PigEntityFactory {

    private static final String sources = "0123456789";
    private static final String NAME_SOURCES = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static PigEntity createPigEntity() {
        long fnumbe = createRandom();
        long earno = createRandom();
        long breeding = createRandom();
        String breeding_name = createNameRandom("breeding_");
        int parity = createRandom2(10000);
        long farm_id = createRandom();
        long master_org_id = createRandom();
        long lanid = createRandom();
        String lanname = createNameRandom("lan_");
        long sheid = createRandom();
        String shename = createNameRandom("lan_");
        long louid = createRandom();
        String louname = createNameRandom("lan_");
        String estatus = createNameRandom();
        int pignum = createRandom2(100);
        PigEntity pig = new PigEntity(fnumbe, earno,breeding, breeding_name, parity, farm_id, master_org_id, lanid, lanname, sheid, shename, louid, louname, estatus, pignum);
        System.out.println(pig);
        return pig;
    }


    private static long createRandom() {
        long result;
        Random rand = new Random();
        StringBuffer flag = new StringBuffer();
        for (int j = 0; j < 19; j++) {
            flag.append(sources.charAt(rand.nextInt(9)) + "");
        }
        result = Long.valueOf(flag.toString());
        return result;
    }

    private static String createNameRandom() {
        Random rand = new Random();
        StringBuffer flag = new StringBuffer();
        for (int j = 0; j < 10; j++) {
            flag.append(NAME_SOURCES.charAt(rand.nextInt(25)) + "");
        }
        return flag.toString();
    }

    private static String createNameRandom(String prefix) {
        Random rand = new Random();
        StringBuffer flag = new StringBuffer(prefix);
        for (int j = 0; j < 10; j++) {
            flag.append(NAME_SOURCES.charAt(rand.nextInt(25)) + "");
        }
        return flag.toString();
    }

    private static int createRandom2(int maxNum) {
        Random random = new Random();
        return random.nextInt(maxNum);
    }




}
