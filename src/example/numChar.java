package example;

import java.util.ArrayList;


public class numChar {
    private static final String[] num2 = {"a","b","c"};
    private static final String[] num3 = {"d","e","f"};
    private static final String[] num4 = {"g","h","i"};
    private static final String[] num5 = {"j","k","l"};
    private static final String[] num6 = {"m","n","o"};
    private static final String[] num7 = {"p","q","r","s"};
    private static final String[] num8 = {"t","u","v"};
    private static final String[] num9 = {"w","x","y","z"};

    private static final ArrayList<String[]> numIndex = new ArrayList<>();

    static {
        numIndex.add(num2);
        numIndex.add(num3);
        numIndex.add(num4);
        numIndex.add(num5);
        numIndex.add(num6);
        numIndex.add(num7);
        numIndex.add(num8);
        numIndex.add(num9);
    }


    public String[] checkNum(char num){
        int index = Integer.parseInt(String.valueOf(num));
        return numIndex.get(index-2);
    }
}
