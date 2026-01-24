// ================= ZIG ZAG FUNCTION =================
    public static void zigzag(Node head) {

        if (head == null || head.next == null) return;

        // --------- 1. find middle ----------
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;

        // --------- 2. reverse second half ----------
        Node curr = mid.next;
        mid.next = null;

        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // --------- 3. zig zag merge ----------
        Node left = head;
        Node right = prev;

        Node nextL, nextR;

        while (left != null && right != null) {

            nextL = left.next;
            left.next = right;

            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }
