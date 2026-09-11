//Problem Statement 
//Program 4 : Write a prograam to find all friends of a user in a social networking application using BFS graph traversal.
//Task : 1.Models the social network as an undirected graph
//2.Takes a starting user
//3.Uses BFS to find all reachable users.
//4.Prints each reachable user along with thier distance (number of hops) from the stating user.
//You may assume a sample network is given in the program (adjacency list or similar).Handle the case where user has no friends.
import java.util.*;
public class BFS {
    public static void main(String[] args) {
        Map<Integer , List<Integer>> graph = new HashMap<>();

        addEdge(graph,1,2);    
        addEdge(graph,1,3);
        
        
    }
    
}
