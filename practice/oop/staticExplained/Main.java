package javaCourse.staticExplained;

public class Main {
    public static void main(String[] args){

            // static = Makes a variable or method belong to the class
            //          rather than any specific object.
            //          Commonly used for utility methods or shared resources

        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");
        Friend friend4 = new Friend("Sandy");

        System.out.println(friend1.name);
        System.out.println(friend1.numOfFriends);
        System.out.println(friend2.name);
        System.out.println(friend2.numOfFriends);
        System.out.println(friend3.name);
        System.out.println(Friend.numOfFriends);  // when calling a static method it's best to do so with the class itself
        System.out.println(Friend.numOfFriends);

        Friend.showFriends();  // to call a static method type the name of the class dot(.) then the name of the method

    }


}
