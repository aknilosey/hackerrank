private static int max = Integer.MIN_VALUE;
static int height(Node root) {
    count(root);
    return max;
}

private static int counter = 0;
static void count(Node node) {
    if (node.left != null) {
        counter++;
        count(node.left);
        counter--;
    }
    if (node.right != null) {
        counter++;
        count(node.right);
        counter--;
    }
    max = Math.max(max, counter);
}