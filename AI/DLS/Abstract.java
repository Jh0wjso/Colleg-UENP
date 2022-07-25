public abstract class Abstract {

   Node sourceNode;
   Node goalNode;

   public Abstract(Node sourceNode, Node goalNode){
       this.sourceNode = sourceNode;
       this.goalNode = goalNode;
   }

   public abstract boolean execute();

}