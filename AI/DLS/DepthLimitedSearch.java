import java.util.ArrayList;
import java.util.Stack;

public class DepthLimitedSearch extends Abstract {

  Node sourceNode;
  Node goalNode;
  int depth = 0;
  int limit = 2;

  public DepthLimitedSearch(Node source, Node goalNode) {
    super(source, goalNode);
    this.sourceNode = source;
    this.goalNode = goalNode;
  }

  public boolean execute() {
    Stack<Node> nodeStack = new Stack<>();
    ArrayList<Node> visitedNodes = new ArrayList<>();
    nodeStack.add(sourceNode);

    depth = 0;

    while (!nodeStack.isEmpty()) {
      if (depth <= limit) {
        Node current = nodeStack.pop();
        if (current.equals(goalNode)) {
          System.out.print(visitedNodes);
          System.out.println("Goal node found");
          return true;
        } else {
          visitedNodes.add(current);
          nodeStack.add(current.getNextNode());
          depth++;

        }
      } else {
        System.out.println("Goal Node not found within depth limit");
        return false;
      }
    }

    return false;
  }
}