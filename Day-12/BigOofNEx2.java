public class BigOofNEx2 {
    public static void main(String[] args) {

    }

    void Father() {
        payChildrenFees();
    }

    void payChildrenFees() {
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.println("Pay fee of child " + i);
        }
    }
}

/*
Time complexity of payChildrenFees() method is O(n)

Time complexity of Father() method is also O(n), because
    Father() contains payChildrenFees() method, which will take O(n)
 */
