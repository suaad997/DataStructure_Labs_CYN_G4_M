package Graph;

public class Main {
    public static void main(String[] args) {
        AdjacencyList adjList= new AdjacencyList(3);
        adjList.addEdges(0,1);
        adjList.addEdges(1,2);
        adjList.addEdges(0,2);
        adjList.display();
    }

}
