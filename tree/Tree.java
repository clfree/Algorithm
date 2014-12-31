class Tree{
    private Node root;

    public void Tree(Node root){
    	this.root = root;
    }
    
    public void insert(Node parent, int data){
	if(parent != null)
	    if(data <= parent.leftChild.data){
	    	insert(parent.leftChild, data);
	    }else{
	    	insert(parent.rightChild, data);
	    }
	}else{
	    Node parent = new Node(data);
	}
    }

    public void inOrderTraverseTree(Node parent){
	//Recursion version
	if(parent != null){
	    System.out.println("The element is " + parent.data + "\n");
	    inOrderTraverseTree(parent.leftChild);
	    inOrderTraverseTree(parent.rightChild);
	}

    }






}
