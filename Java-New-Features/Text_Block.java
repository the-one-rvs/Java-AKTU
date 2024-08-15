public class Text_Block {
    public static void main(String[] args) {
        String s = """
                <html>
                        <body>
                                <div style=" ">Text Block</div>
                        </body>
                </html>
                """;
        String ss = "Hello";
        String s1 = """
                Value of X=%s""";
        System.out.println(s1);
    }
}


//Annotations are the tag that represents some metadata associated with class, interface, method or variables. It indicates some extra information about that code and this information about the code which is being used by the compiler and JVM.
//@override : overrides the method in the new class.
//@SuppressWarnings : We want to ignore certain warnings.
//@SafeVarargs : acts on the warning related to varargs.
//@Deprecated : API not intended to use anymore.
//@FunctionInterfaces : If we intend a Single Abstract Method interface to be used in lambadas, we can use @FunctionInterfaces
//@Native : indicates annotated field is a constant that may be referenced from the native code.
//Type Annotations:
//After releasing Java SE 8, annotations can be applied to any type use.(means annotations can be used anywhere you use a type)
//@NonNull String str;
//Arrays <@NonNegative Integer> data;
//Repeating Annotations:
//They can repeatable in a same class but they have to start as @Repeatable in java.lang.annotation

//Java Module System Goals:
//1. Reliable Configuration
//2. Strong Encapsulation
//3. Scalable Java Platform
//4. Greater Platform Integrity
//5. Improved Performance

//Local Variable Type Inference (from Java 10 skip type declaration)
// var x = "Hello";
// var y = 32;
// var z = new Student();

//Records
//Special feature used to record feature to reduce the overhead or writing same type of code again and again

