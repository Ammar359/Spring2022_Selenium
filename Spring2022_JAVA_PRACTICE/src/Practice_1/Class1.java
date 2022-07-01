package Practice_1;

public class Class1 {
    /**
     * GIT COMMANDS:
     * to check Java version command ----- >     java -version
     * ssh key is the way to make connection between local and remote machine. Always share public key rather than Private key
     * Command to make SSH Key ---- >  cat .ssh/id_rsa.pub
     * pwd ----> present working Directory.     cd -->> change directory     ---> to check the status ---> git status
     * To CLONE the repo ---> clone (repo name)
     * to add the directory ---->   git add (file name) or git add .(. means all files) ... ---> git commit -m "message" ----> git push(to push into remote)
     *
     */

    /**
     * BASICS:
     * What is Java?
     * Java is Multi-Purpose,Object oriented programming language. it is used to build web applications,mobile applications, games and much more
     *
     *  FEATURES:
     * Easy to use, write code once and run it on almost every platform, portable, Robust, Simple, Case Sensitive.
     * Entire project has to ERROR free to be run.
     *  JDK ( Java Development Kit)     JVM (Java Virtual Machine)   JRE( java Runtime Environemnt)
     */


    /**
     * JAVA SYNTAX:
     * 1.Package sct ----> package declaration statement.
     * 2.Public class ----> Public is the access modifier which tells compiler to access to class.and class is keyword to declare the class
     *
     * public static void main(String[] args){ --> any code inside the main method will be executed.
     *     System.out.printIn("Hello World");  ---> inside main method, we use PrintIn() to print a line of text on screen.
     * }                {} --> curly braces marks start and end of block of code.
     * 
     */

    /**
     * COMMENTS:
     * Single line Comments --------->  to declare, use  //
     * Multi Line Comments ---------->   statrs with /**  and ends with
     */

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello world" + "Today");
    }


}
