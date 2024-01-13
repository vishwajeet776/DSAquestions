public class Back_tracking1 {
    static int N;
//    sol output function
    void PrintSolution(int sol[][]){
        for (int i=0;i<N;i++){
            for (int j=0;j<N;j++)
                System.out.print(" "+sol[i][j]+" ");
                System.out.println();

        }
    }
//    to check if x,y is valid
    public static boolean is_safe(int maz[][],int x,int y){
        return (x>=0 && x<N && y>=0 && y<N && maz[x][y]==1);
    }
     boolean solve_maze(int maz[][]){
        int sol[][]=new int[N][N];
        if (solveMazeUtility(maz,0,0,sol)){
            System.out.println("solution does not ");
        }
        PrintSolution(sol);
        return true;
     }
     boolean solveMazeUtility(int maze[][],int x,int y,int sol[][]){
        if (x==N-1 && y==N-1 && maze[x][y]==1){
            sol[x][y]=1;
            return true;
        }
        if (is_safe(maze,x,y)){
            if (sol[x][y]==1){
                return false;
            }
            sol[x][y]=1;

            if (solveMazeUtility(maze,x+1,y,sol)){
                return true;
            }
            if (solveMazeUtility(maze,x,y+1,sol)){
                return true;
            }
         sol[x][y]=0;
            return false;
        }
        return false;
     }
    public static void main(String[] args) {
        Back_tracking1 rat= new Back_tracking1();
        int maz[][]={{1,0,0,0},{1,1,0,0},{0,1,0,0},{1,1,1,1}};
        N= maz.length;
        rat.solve_maze(maz);
    }
}
