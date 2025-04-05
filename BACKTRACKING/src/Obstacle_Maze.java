import java.util.ArrayList;
public class Obstacle_Maze {
    public static void main(String[] args){
        boolean[][] board = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        pathRestrictions("",board,0,0);
    }
    static void pathRestrictions(String p,boolean[][] maze,int r,int c){
        if(r==maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }

        maze[r][c]=false;

        if(r<maze.length-1){
            pathRestrictions(p+'D',maze,r+1,c);
        }
        if(r>0){
            pathRestrictions(p+'u',maze,r-1,c);
        }
        if(c>0){
            pathRestrictions(p+'L',maze,r,c-1);
        }
        if(c<maze[0].length-1){
            pathRestrictions(p+'R',maze,r,c+1);
        }

        //Here the function gets over so remove the changes made by the function
        maze[r][c]=true;

    }
}
