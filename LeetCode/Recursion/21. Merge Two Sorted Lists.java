    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return list1;
        }
        ListNode result = new ListNode();
        ListNode current = result;
        ListNode p1 = list1;
        ListNode p2 = list2;
        while (p1 != null || p2 != null) {
            if (p1 == null) {
                current.next = p2;
                p2 = p2.next;
            } else if (p2 == null) {
                current.next = p1;
                p1 = p1.next;
            } else if (p1.val <= p2.val) {
                current.next = p1;
                p1 = p1.next;
            } else {
                current.next = p2;
                p2 = p2.next;
            }
            current = current.next;
        }
        return result.next;
    }
