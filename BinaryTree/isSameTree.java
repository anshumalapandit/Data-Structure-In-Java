//Time Complexity Analysis
//The time complexity is O(n), where n is the number of nodes in the trees, as each node is visited once.
//The space complexity is O(h), where h is the height of the tree, due to the recursion stack.

public static boolean isSameTree(Node p, Node q) {
    // Base case: if both nodes are null, trees are identical up to this branch
    if (p == null && q == null) {
        return true;
    }

    // If one of the nodes is null (but not both), trees are not identical
    if (p == null || q == null) {
        return false;
    }

    // Condition to check if the current nodes' values are the same
    boolean cond1 = (p.data == q.data);

    // Recursively check if left subtrees are identical
    boolean cond2 = isSameTree(p.left, q.left);

    // Recursively check if right subtrees are identical
    boolean cond3 = isSameTree(p.right, q.right);

    // Trees are identical only if all conditions are true
    return cond1 && cond2 && cond3;
}
