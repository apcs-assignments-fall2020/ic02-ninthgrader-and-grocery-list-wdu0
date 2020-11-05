public class NinthGrader extends Student{
    
    // constructor
    public NinthGrader(String a, String b) {
        super(a, b, 2024);
    }

    public NinthGrader() {
        super();
    }

    // doSomething()
    public void doSomething() {
        System.out.println(this.getFirstName() + " is doing physics' homework.");
    }

    // toString()
    public String toString() {
        String str = this.getFirstName() + " " + this.getLastName() + ", " + this.getClassYear();
        return str;
    }

    
}