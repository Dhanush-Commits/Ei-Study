// Use the post, comment, like, and observers in the demo class
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Post post = new Post("Initial Post Content");
        Comment comment = new Comment("Initial Comment Content");
        Like like = new Like(0);

        Observer user1 = new RegularUser("User1");
        Observer user2 = new VIPUser("User2");

        post.addObserver(user1);
        post.addObserver(user2);
        comment.addObserver(user1);
        comment.addObserver(user2);
        like.addObserver(user1);
        like.addObserver(user2);

        post.setContent("Updated Post Content");
        comment.setContent("Updated Comment Content");
        like.setCount(10);
    }
}