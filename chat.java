import java.util.Scanner;

class chat {

    Scanner sc = new Scanner(System.in);

    void searched() {
        System.out.println("search here");
        String search = sc.nextLine();
        if (search.toLowerCase().contains("hi")) {
            System.out.println("Hello, How can i help you");
        } else if (search.toLowerCase().contains("java")) {
            System.out.println(
                    "Java is a high-level, general-purpose programming language originally developed by Sun Microsystems (now owned by Oracle Corporation) in 1995. It was designed to be platform-independent, meaning that Java programs can run on any device or operating system that has a Java Virtual Machine (JVM) installed. This \"write once, run anywhere\" principle has contributed to Java's popularity and widespread use.");
        } else if (search.toLowerCase().contains(" why")) {
            System.out.println(
                    "Java is known for its simplicity, object-oriented features, robustness, and security. It's extensively used in various domains, including web development (through frameworks like Spring and JavaServer Faces), enterprise applications, mobile development (Android apps are primarily written in Java), scientific computing, and big data processing (through technologies like Apache Hadoop and Apache Spark).");
        } else if (search.toLowerCase().contains("blasting")) {
            System.out.println(
                    "It seems like you're referring to \"blasting\" in the context of computer programming or technology. If you're talking about \"blasting\" as in sending a large amount of data or information, there are several ways to do it, depending on what you're trying to achieve:");
        } else if (search.toLowerCase().contains("pass without study")) {
            System.out.println(
                    "Short-Term Gain, Long-Term Pain: Sure, you might be able to squeak by without studying for a particular test, but you're missing out on an opportunity to truly understand the material. This can come back to bite you later when more advanced concepts build on what you should have learned earlier.");
        }
        searched();
    }

    public static void main(String[] args) {
        chat obj = new chat();
        obj.searched();
    }

}