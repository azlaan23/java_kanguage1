public class Array_2d_online_Q {
    public static void main(String[] args) {
//        public static Scanner scanner= new Scanner(System.in);
//
//        public static void main(String args[]){
//            int[] myIntArray = getIntegers(5);
//            printArray(myIntArray);
//            System.out.println("Average is "+getAverage(myIntArray));
//        }
//
//        public static int[] getIntegers(int number){
//            System.out.println("Please Enter "+number+" integer values");
//            int intArray[] = new int[number];
//            for(int i=0; i<number; i++){
//                intArray[i] = scanner.nextInt();
//            }
//            return intArray;
//        }
//
//        public static void printArray(int[] intArray){
//            for(int i=0; i<intArray.length; i++){
//                System.out.println(intArray[i]);
//            }
//        }
//
//        public static double getAverage(int[] intArray){
//            int sum = 0;
//            for(int i=0; i<intArray.length; i++){
//                sum += intArray[i];
//            }
//            return (double) sum / (double) intArray.length;
//        }
//
//    }
//
//}
//}



//Question no 2

//        public static Scanner scanner= new Scanner(System.in);
//
//        public static void main(String args[]){
//            int[] myIntArray = getIntegers(5);
//            sortArray(myIntArray);
//            printArray(myIntArray);
//        }
//
//        public static int[] getIntegers(int number){
//            System.out.println("Please Enter "+number+" integer values");
//            int intArray[] = new int[number];
//            for(int i=0; i<number; i++){
//                intArray[i] = scanner.nextInt();
//            }
//            return intArray;
//        }
//
//        public static void printArray(int[] intArray){
//            for(int i=0; i<intArray.length; i++){
//                System.out.println(intArray[i]);
//            }
//        }
//
//        public static void sortArray(int[] intArray){
//            boolean flag = true;
//            while(flag){
//                flag= false;
//                for(int i=0; i< intArray.length-1; i++){
//                    if(intArray[i] <= intArray[i+1]){
//                        int temp = intArray[i];
//                        intArray[i] = intArray[i+1];
//                        intArray[i+1] = temp;
//                        flag = true;
//                    }
//                }
//            }
//        }
//
//    }

//question no 3


//        Following is the Java code to check if your array contains any specific element.
//
//
//
//            public static void main(String args[]){
//                int[] myIntArray = {43,32,53,23,12,34,3,12,43,32};
//                int number = 326;
//                if(contains(myIntArray,number)){
//                    System.out.println("Number "+number+" is present in array.");
//                }else{
//                    System.out.println("Number "+number+" not found in array.");
//                }
//            }
//
//            public static boolean contains(int[] intArray, int number){
//                for(int i = 0; i < intArray.length; i++){
//                    if(intArray[i] == number){
//                        return true;
//                    }
//                }
//                return false;
//            }
//        }


//Question no 4

//        Following is the Java code to reverse the elements of an array by writing a self custom method.
//
//
//        public class ArrayReverse {
//
//            public static void main(String args[]) {
//                int[] myIntArray = { 43, 32, 53, 23, 12, 34, 3, 12, 43, 32 };
//                System.out.println("Original Array " + Arrays.toString(myIntArray));
//                // Reverse Array
//                int temp;
//                int ArraySize = myIntArray.length;
//                for (int i = 0; i < (ArraySize / 2); i++) {
//                    temp = myIntArray[i];
//                    myIntArray[i] = myIntArray[ArraySize - (i + 1)];
//                    myIntArray[ArraySize - (i + 1)] = temp;
//                }
//                System.out.println("Reversed Array " + Arrays.toString(myIntArray));
//            }
//
//        }
//

//qUESTION NO 5

//        1. Removing array element with custom method.
//
//        public class ArrayRemove {
//
//            public static void main(String args[]) {
//                int[] myIntArray = { 12, 13, 14, 15, 16 };
//                System.out.println("Original Array " + Arrays.toString(myIntArray));
//                int index = findIndexOf(myIntArray, 14);
//                int[] newIntArray = removeElement(myIntArray, index);
//                System.out.println("New Array " + Arrays.toString(newIntArray));
//            }
//
//            public static int[] removeElement(int[] intArray, int index) {
//                int[] myNewArray = new int[intArray.length - 1];
//                for (int i = 0; i < index; i++) {
//                    myNewArray[i] = intArray[i];
//                }
//                for (int i = index + 1; i < intArray.length; i++) {
//                    myNewArray[i - 1] = intArray[i];
//                }
//                return myNewArray;
//            }
//
//            public static int findIndexOf(int[] intArray, int element) {
//                for (int i = 0; i < intArray.length; i++) {
//                    if (intArray[i] == element)
//                        return i;
//                }
//                return -1;
//            }
//
//        }
//
//
//
//
//

//Question no 6
//        public class ArraySecondHighest {
//
//            public static void main(String args[]) {
//                int[] myIntArray = { 12, 13, 14, 15, 16, 89, 23, 1, 90, 100 };
//                Arrays.sort(myIntArray);
//                System.out.println("Second Highest "
//                        + myIntArray[myIntArray.length - 2]);
//            }
//
//        }


//queation no 7


//        public class ArrayCopy {
//
//            public static void main(String args[]) {
//                String[] myStringArray = { "Alice", "Bob", "Tim", "John", "Denice" };
//                System.out.println("Array " + Arrays.toString(myStringArray));
//                String[] newStringArray = copyArray(myStringArray);
//                System.out.println("Copied Array " + Arrays.toString(newStringArray));
//            }
//
//            public static String[] copyArray(String[] stringArray) {
//                String[] newStringArray = new String[stringArray.length];
//                for (int i = 0; i < stringArray.length; i++) {
//                    newStringArray[i] = stringArray[i];
//                }
//                return newStringArray;
//            }

//        }


//Qestiion no 7

//          public static void main(String args[]) {
//          String[] myStringArray = { "Alice", "Bob", "Tim", "John", "Tim",
//                    "Denice" };
//            for (int i = 0; i < myStringArray.length; i++) {
//                String toCompare = myStringArray[i];
//                for (int j = i + 1; j < myStringArray.length; j++) {
//                    if (toCompare.equals(myStringArray[j])) {
//                        System.out.println("Duplicate Name " + toCompare);
//                    }
//                }
//            }
//        }
//    }


//Question no 8


//        public static void main(String args[]) {
//            int[] myFirstArray = { 12, 42, 34, 19 };
//            int[] mySecondArray = { 12, 42, 34, 19 };
//            int[] myThirdArray = { 12, 42, 33, 19 };
//
//            if (checkEqual(myFirstArray, mySecondArray)) {
//                System.out.println("Array are equal");
//            } else {
//                System.out.println("Array not equal");
//            }
//
//            if (checkEqual(myFirstArray, myThirdArray)) {
//                System.out.println("Array are equal");
//            } else {
//                System.out.println("Array not equal");
//            }
//
//        }

//Questioon no 9
//        public class TheStack {
//
//            private String[] stackArray;
//            private int stackSize;
//            private int topOfStack = -1;
//
//            TheStack(int stackSize){
//                this.stackSize = stackSize;
//                stackArray = new String[this.stackSize];
//                Arrays.fill(stackArray, "-1");
//            }
//
//
//            //Push operation
//            public void push(String data){
//                if(topOfStack +1 < stackSize){
//                    topOfStack++;
//                    stackArray[topOfStack] = data;
//                    System.out.println("PUSH: New data element "+data+" is pushed into stack");
//                }else{
//                    System.out.println("Stack is full");
//                }
//            }
//
//            //Pop Operation
//            public String pop(){
//                if(topOfStack >= 0){
//                    System.out.println("POP: top data element "+stackArray[topOfStack]+" is removed from stack");
//                    stackArray[topOfStack] = "-1";
//                    return stackArray[topOfStack--];
//                }else{
//                    System.out.println("Sorry but the stack is empty");
//                    return "-1";
//                }
//            }
//
//            // Peek operation
//            public String peek() {
//                System.out.println("PEEK: " + stackArray[topOfStack] + " is at the top of the Stack.");
//                return stackArray[topOfStack];
//            }
//
//            // Using our Stack
//            public static void main(String[] args ) {
//
//                TheStack theStack = new TheStack(10);
//                theStack.push("5Balloons");
//                theStack.push("Programming");
//                theStack.push("Tutorials");
//                theStack.peek();
//                theStack.pop();
//                theStack.pop();
//                theStack.pop();
//
//            }
//
//        }


//Question  no 10

//
//        public class TheQueue {
//
//            private String[] queueArray;
//            private int queueSize;
//            private int currentIndex = -1;
//
//            TheQueue(int size) {
//                queueSize = size;
//                queueArray = new String[queueSize];
//                Arrays.fill(queueArray, "-1");
//            }
//
//            public void enqueue(String newElement) {
//                if (currentIndex + 1 < queueSize) {
//                    currentIndex++;
//                    queueArray[currentIndex] = newElement;
//                    System.out
//                            .println("Enqueue : " + newElement + " is added to queue");
//                } else {
//                    System.out.println("Queue is currently Full");
//                }
//            }
//
//            public String dequeue() {
//                if (currentIndex >= 0) {
//                    String toReturn = queueArray[0];
//                    System.out.println("Dequeue : " + queueArray[0]
//                            + " is removed from the queue");
//                    for (int i = 0; i < queueArray.length - 1; i++) {
//                        queueArray[i] = queueArray[i + 1];
//                    }
//                    return toReturn;
//                } else {
//                    System.out.println("Queue is currently empty");
//                    return "-1";
//                }
//            }
//
//            public static void main(String args[]) {
//                TheQueue queue = new TheQueue(10);
//                queue.enqueue("Java");
//                queue.enqueue("Programming");
//                queue.enqueue("Language");
//                queue.dequeue();
//                queue.dequeue();
//                queue.dequeue();
            }
//
        }
//
