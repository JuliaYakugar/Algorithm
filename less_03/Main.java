package less_03;

public class Main {

    public static void main(String[] args) {
        MyList newMyList = new MyList();
        
        newMyList.add(78);
        newMyList.add(22);
        newMyList.add(7);
        newMyList.add(4);
        newMyList.add(89);
        newMyList.add(44);
        newMyList.add(2);

        newMyList.printList();

        newMyList.revert();
        System.out.println();

        newMyList.printList();
    }
}
