package app;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Kalitko.Evgeny
 *
 */
public class Main {
	
	public static void main(String[] args) {
		int maxTreeDepth = getMaxTreeDepth(NodeImpl.testCase01());
		System.out.println(maxTreeDepth);
	}
	
	
	public static int getMaxTreeDepth(Node arbitraryNode) {
		return getTreeDepth(arbitraryNode);
	}

	public static int getTreeDepth(Node node) {
		while (node.getParent() != null) {
			node = node.getParent();
		}
		List<Node> level = node.getChildren();
		int depth = 0;
		while (level.size() > 0) {
			List<Node> nextLevel = new ArrayList<>();
			for (Node child : level) {
				nextLevel.addAll(child.getChildren());
			}
			level = nextLevel;
			depth++;
		}
		return depth;
	}

}
