package Graph;

public class Main {
    public static void main(String[] args) {
       
      /*   myGraph.addVertex("A");

        myGraph.printGraph();
        */
        // Graph myGraph = new Graph();

        // myGraph.addVertex("A");
        // myGraph.addVertex("B");
        // myGraph.addVertex("C");
        // myGraph.printGraph();

       /*  System.out.println("\nGraph before addEdge():");
        myGraph.printGraph();


        myGraph.addEdge("A", "B");


        System.out.println("\nGraph after addEdge():");
        myGraph.printGraph();*/
/* 
        myGraph.addEdge("A","B");
        myGraph.addEdge("A","C");
        myGraph.addEdge("B","C");
        myGraph.printGraph();

        myGraph.removeEdge("A", "C");
        myGraph.printGraph();
        
*/
        Graph myGraph = new Graph();

        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addVertex("D");

        myGraph.addEdge("A", "B");
        myGraph.addEdge("A", "C");
        myGraph.addEdge("A", "D");
        myGraph.addEdge("B", "D");
        myGraph.addEdge("C", "D");


        System.out.println("\nGraph before removeVertex():");
        myGraph.printGraph();

        myGraph.removeVertex("D");

        System.out.println("\nGraph after removeVertex():");
        myGraph.printGraph();

    }
}
