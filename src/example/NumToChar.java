package example;

import java.util.ArrayList;
import java.util.List;

public class NumToChar {
    public List<String> sayCharacterFrom(String str){
        //定义数据集
        final numChar ntc = new numChar();
        //定义结果
        ArrayList<String> result = new ArrayList<>();

        //先检测长度 长度为0或大于2返回空值
        if((str.length() == 0) || (str.length() > 2)){
            return result;
        }else{
            //长度不大于2时判断长度是1还是2
            switch (str.length()){
                case 2:
                    //获取第一个数字对应的数组
                    String[] arr_1 = ntc.checkNum(str.charAt(0));
                    for(String char_1 : arr_1){
                        //获取第二个数字对应的数组
                        String[] arr_2 = ntc.checkNum(str.charAt(1));
                        for(String char_2 : arr_2){
                            //向结果中写入结果
                            result.add(char_1 + char_2);
                        }
                    }
                    break;

                case 1:
                    //获取对应的数组
                    String[] arr = ntc.checkNum(str.charAt(0));
                    for(String char_2 : arr){
                        //向结果中写入结果
                        result.add(arr + char_2);
                    }
                    break;
            }
            return result;
        }
    }
}
