class Solution {
    public void findLeafNode(TreeNode root, List<TreeNode> leaf) {
        if (root == null) return;

        findLeafNode(root.left, leaf);
        if (root.left == null && root.right == null) {
            leaf.add(root);
        }
        findLeafNode(root.right, leaf);
    }

    // helper to find LCA
    public TreeNode findLCA(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;

        TreeNode left = findLCA(root.left, p, q);
        TreeNode right = findLCA(root.right, p, q);

        if (left != null && right != null) return root;
        return (left != null) ? left : right;
    }

    // helper to find depth from root to a node
    public int findLevel(TreeNode root, TreeNode target, int level) {
        if (root == null) return -1;
        if (root == target) return level;

        int left = findLevel(root.left, target, level + 1);
        if (left != -1) return left;

        return findLevel(root.right, target, level + 1);
    }

    public int countPairs(TreeNode root, int distance) {
        List<TreeNode> leaf = new ArrayList<>();
        findLeafNode(root, leaf);
        int gp = 0;

        for (int i = 0; i <= leaf.size() - 2; i++) {
            for (int j = i + 1; j < leaf.size(); j++) {
                TreeNode first = leaf.get(i);
                TreeNode sec = leaf.get(j);

                TreeNode lca = findLCA(root, first, sec);
                int d1 = findLevel(lca, first, 0);
                int d2 = findLevel(lca, sec, 0);

                int curDistance = d1 + d2;

                if (curDistance <= distance) {
                    gp++;
                }
            }
        }
        return gp;
    }
}
