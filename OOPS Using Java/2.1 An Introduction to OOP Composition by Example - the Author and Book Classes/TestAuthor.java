public class TestAuthor {
    public static void main(String[] args) {

        Author author = new Author("author", "ahteck@nowhere.com", 'd');
        System.out.println(author);
        author.setEmail("haha@nowhere.com");
        System.out.println("name is: " + author.getName());     
        System.out.println("email is: " + author.getEmail());   
        System.out.println("gender is: " + author.getGender()); 
    }
}
