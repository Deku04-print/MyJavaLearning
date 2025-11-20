package Methods;

public class Friends {
    public static void main(String[] args){
        
        MyFriends frnd1=new MyFriends("Patric");
        MyFriends frnd2=new MyFriends("Harsh");
        MyFriends frnd3=new MyFriends("Spongebob");
        MyFriends frnd4=new MyFriends("Thor");

      frnd1.display();
      frnd2.display();
      frnd3.display();
      frnd4.display();
      MyFriends.Calc();
    }
}

class MyFriends{
    String name;
    static int friendsnum=0;
    MyFriends(String Name) {

        this.name = Name;
        friendsnum++;

    }

    void display(){
        System.out.println("Your friend is :"+this.name);
    }
    static void Calc(){
        System.out.println("The total number of friends :"+friendsnum);
    }
}