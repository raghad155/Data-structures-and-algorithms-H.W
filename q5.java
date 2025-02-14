String serialize(Node root) {
    if (root == null) {
        return "#";
    }
    return root.data + "," + serialize(root.left) + "," + serialize(root.right);
}

Node deserialize(String data) {
    String[] values = data.split(",");
    return deserializeHelper(values);
}

int index = 0;

Node deserializeHelper(String[] values) {
    if (index >= values.length || values[index].equals("#")) {
        index++;
        return null;
    }
    Node root = new Node(Integer.parseInt(values[index++]));
    root.left = deserializeHelper(values);
    root.right = deserializeHelper(values);
    return root;
}

// استخدام التسلسل وفك التسلسل
String serialized = serialize(tree.root);
System.out.println("Serialized: " + serialized);
Node deserializedRoot = deserialize(serialized);