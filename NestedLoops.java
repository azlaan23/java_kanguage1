import java.sql.SQLOutput;

public class NestedLoops {
    public static void main(String[] args) {
//        Question 1
////        for (int i = 1; i <= 5; i++) {
////            for (int j = 1; j <= i; j++) {
////                System.out.print(j + " ");
////        }
////            System.out.println();
////
////    }
////
////}
////}
//
// Question 2
////        for (int i = 5; i >= 1; i--) {
////            for (int j = 5; j >= i; j--) {
////                System.out.print(j + " ");
////            }
////            System.out.println();
////        }
////    }
////}
//
//
//Question no 3
//
//        for (int i = 1; i <= 5; i++) {
//            for (int j =5; j >= i; j--) {
//                System.out.print(j + " " );
//
//            }
//            System.out.println();
//        }
//    }
//}
//
//Question no 4
//
//        for (int i = 5; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j +" ");
//
//            }
//            System.out.println();
//        }
//    }
//}


        for (int i = 1; i <= 10; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
















