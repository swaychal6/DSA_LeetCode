package backtracking;

import java.util.ArrayList;
import java.util.List;

public class MazeProblem {
    public static void main(String[] args) {

//        System.out.println(count(3, 3));
//        path("", 3, 3);
//        System.out.println(listOfPaths("",3,3));;
//        pathDiagonal("",3,3);

        boolean board[][]={
                {true,true,true},
                {true,false,true},
                {false,true,true}};
        pathRestriction("",board,0,0);
    }

    static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }

        int left = count(r - 1, c);
        int right = count(r, c - 1);
        return left + right;
    }


    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
        }

        if (r > 1) {
            path(p + "D", r - 1, c);
        }

        if (c > 1) {
            path(p + "R", r, c - 1);
        }
    }

    static ArrayList<String> listOfPaths(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> allList=new ArrayList<>();

        if (r > 1) {
            allList.addAll(listOfPaths(p + "D", r - 1, c));
        }

        if (c > 1) {
            allList.addAll( listOfPaths(p + "R", r, c - 1));
        }

        return allList;
    }


    static void pathDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
        }

        if(r>1&& c>1){
            pathDiagonal(p + "D", r - 1, c-1);
        }

        if (r > 1) {
            pathDiagonal(p + "V", r - 1, c);
        }

        if (c > 1) {
            pathDiagonal(p + "H", r, c - 1);
        }
    }


    static void pathRestriction(String p,boolean [][]maze, int r, int c) {
        if (r == maze.length-1 && c == maze[0].length-1) {
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        if (r< maze.length-1) {
            pathRestriction(p + 'D', maze,r + 1, c);
        }

        if (c < maze[0].length-1) {
            pathRestriction(p + 'R', maze,r, c + 1);
        }
    }

}
