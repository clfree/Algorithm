class Stack{
    int len = 100;

    int[] buffer = new int[len*3];

    // The array for the top pointer;
	
    int[] topArray = {-1, -1, -1};

    public int pop(int stackNum){
	// Check if it is empry
	if (topArray[stackNum] == -1){
	    System.out.println("The stack is empty!");
	    return -1;
	}else{
	    return buffer[topArray[stackNum]-- + stackNum*len];
	}
    }

    public void push(int stackNum, int item){
	// Check if it is full
	if (topArray[stackNum] == len-1){
	    System.out.println("The stack is full!");
	}else{
	    buffer[++topArray[stackNum] + stackNum*len] = item;
	}
    }	
    // Give the length of the array
    
    public static void main(String[] argv){
	System.out.println("Hello world!");
	Stack st = new Stack();

	st.push(1, 100);
	
	int num = st.pop(1);

	System.out.println("The num is " + num);

    }
}
