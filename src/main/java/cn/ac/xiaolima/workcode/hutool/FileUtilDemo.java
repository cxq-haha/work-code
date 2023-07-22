package cn.ac.xiaolima.workcode.hutool;

import cn.hutool.core.io.FileUtil;

import java.io.File;

public class FileUtilDemo {
    public static void main(String[] args) {
        File testFile = new File("C:\\Users\\19795\\Desktop\\version.txt");
        String type = FileUtil.getType(testFile);
        System.out.println("type : " + type);
    }
}
