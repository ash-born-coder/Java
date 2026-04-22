package javaCourse.staticExplained;

public class Friend {

    static int numOfFriends;  // rather than all friend objects having their copy of 'numOfFriends' they are all going to share one
    String name;

    Friend(String name){
        this.name = name;
        numOfFriends++;
    }
    static void showFriends() {
        System.out.println("You have " + numOfFriends + " total friends");  // here we don't have to type 'this.' when accessing the attribute since we are working with a static attribute

    }
}
