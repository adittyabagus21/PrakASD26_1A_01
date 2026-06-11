package P14_01.Percobaan1;

public class BinaryTree1 {
    Node1 root;

    public BinaryTree1() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Mahasiswa1 mahasiswa) {
        Node1 newNode = new Node1(mahasiswa);

        if (isEmpty()) {
            root = newNode;
        } else {
            Node1 current = root;
            Node1 parent  = null;

            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void addRekursif(Mahasiswa1 mahasiswa) {
        root = addRekursifHelper(root, mahasiswa);
    }

    public Node1 addRekursifHelper(Node1 current, Mahasiswa1 mahasiswa) {
        if (current == null) {
            return new Node1(mahasiswa);
        }
        if (mahasiswa.ipk < current.mahasiswa.ipk) {
            current.left  = addRekursifHelper(current.left,  mahasiswa);
        } else {
            current.right = addRekursifHelper(current.right, mahasiswa);
        }
        return current;
    }

    boolean find(double ipk) {
        boolean result = false;
        Node1 current = root;

        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node1 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder(Node1 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder(Node1 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    Node1 getSuccessor(Node1 del) {
        Node1 successor       = del.right;
        Node1 successorParent = del;

        while (successor.left != null) {
            successorParent = successor;
            successor       = successor.left;
        }

        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right      = del.right;
        }
        return successor;
    }

    void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }

        Node1  parent      = root;
        Node1  current     = root;
        boolean isLeftChild = false;

        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent      = current;
                current     = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parent      = current;
                current     = current.right;
                isLeftChild = false;
            }
        }

        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) parent.left  = null;
                    else             parent.right = null;
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) parent.left  = current.right;
                    else             parent.right = current.right;
                }
            } else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) parent.left  = current.left;
                    else             parent.right = current.left;
                }
            } else {
                Node1 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilInformasi();

                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) parent.left  = successor;
                    else             parent.right = successor;
                }
                successor.left = current.left;
            }
        }
    }
}
