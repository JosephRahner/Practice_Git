public class HelloWorld2{
    
    //main method is the starting point of any Java app
    
    public static void main(String[] args){
        
        

            System.out.println("Hello " + String.join(" ",args) + ". Nice work processing the arguments");
    }// end of main
}// end of class

//The java class path = Path used to find directories and JAR archives containing class files. Elements of the class path are separated by a platform-specific character specified in the path.separator property.
//The java home = Installation directory for Java Runtime Environment (JRE)
// the java version = JRE version number
//Your operating system architecture = os.arch
//Your operating system version = os.version
//The current working directory = user.dir
//The user home directory = user.home
//The user account name = user.name