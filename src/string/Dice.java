package string;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {

//        dice("", 4);
//        System.out.println(diceList("",4));
        diceFace("",4,5);
    }

    private static void dice(String p, int target) {

        if (target == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i);
        }
    }

//    suppose dice is not 6 face dice it is more than 6 lets assume dice is of 8 face or 7 face
    private static void diceFace(String p, int target,int face) {

        if (target == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= face && i <= target; i++) {
            diceFace(p + i, target - i,face);
        }
    }

    private static ArrayList<String> diceList(String p, int target) {

        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> allList = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            allList.addAll(diceList(p + i, target - i));
        }

        return allList;
    }
}
