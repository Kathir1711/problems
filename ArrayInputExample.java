class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class MaximumTwinSum {
    public static void main(String[] args) {
        // Example usage
        ListNode head1 = new ListNode(5);
        head1.next = new ListNode(4);
        head1.next.next = new ListNode(2);
        head1.next.next.next = new ListNode(1);

        ListNode head2 = new ListNode(4);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(2);
        head2.next.next.next = new ListNode(3);

        ListNode head3 = new ListNode(1);
        head3.next = new ListNode(10);

        System.out.println(maxTwinSum(head1)); 
        System.out.println(maxTwinSum(head2));
        System.out.println(maxTwinSum(head3)); 
    }

    public static int maxTwinSum(ListNode head) {
        int maxTwinSum = 0;
        ListNode current = head;
        int[] twinValues = new int[11]; // Assuming 1 <= Node.val <= 105

        while (current != null) {
            int twinIndex = twinIndex(current.val);
            twinValues[twinIndex] += current.val;
gk
gou
yio 
gbbnbvsg
ggn
            if (twinValues[twinIndex] > maxTwinSum) {
                maxTwinSum = twinValues[twinIndex];
            }

            current = current.next;
        }

        return maxTwinSum;
    }

    private static int twinIndex(in
        return 10 - valu
        
    }
}
