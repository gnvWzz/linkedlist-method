public class MyListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyList llnew = new MyList();
        MyList linked = new MyList();
        MyList jutil = new MyList();
        jutil.add("Nam");
        llnew.add(0, "Nam");
        System.out.println(llnew);
    }
}
