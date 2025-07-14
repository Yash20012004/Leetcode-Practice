  //1290. Convert Binary Number in a Linked List to Integer
  // 1--0--1   1*(2^0)+0*(2^1)+1*(2^2) 
  // Tc O(n)+O(n)==O(n)
    public int getDecimalValue(ListNode head) {
        int len=-1;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        int num=0;
        temp=head;
        while(temp!=null){
            num+=temp.val*(Math.pow(2,len));
            len--;
            temp=temp.next;
        }
        return num;
    }
