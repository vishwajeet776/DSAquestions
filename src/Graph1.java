import java.util.ArrayList;

public class Graph1 {
   static class edge{
        int scr;
        int dst;
        edge(int s,int d){
            this.scr=s;
            this.dst=d;
        }
    }
    public static void createGraph(ArrayList<edge> graph[]){
        for (int i=0;i< graph.length-1;i++){
            graph[i]=new ArrayList<edge>();
        }
        graph[0].add(new edge(0,1));
        graph[0].add(new edge(0,2));

    }
    public static void main(String[] args) {

    }
}
