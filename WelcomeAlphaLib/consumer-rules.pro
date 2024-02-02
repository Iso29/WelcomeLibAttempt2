-dontshrink

# Remove the keep rules for specific classes if you want them to be obfuscated
# -keep class com.example.welcomealphalib.Welcome {
#      *;
# }
#
 -keep class com.example.welcomealphalib.WelcomeUtil {
      *;
 }
#
# -keep class com.example.welcomealphalib.Greating {
#      *;
# }
#
#  -keep class com.example.welcomealphalib.GreatingUtil {
#       *;
#  }

  # Keep the class name and public constructors of GreatingUtil
  -keep public class com.example.welcomealphalib.GreatingUtil {
      public <init>();
  }

  # Keep public methods of GreatingUtil that library users need to access
  -keepclassmembers class com.example.welcomealphalib.GreatingUtil {
      public void greatIso();
  }

  # Assuming you want to keep the Greating class entirely unobfuscated
  -keep class com.example.welcomealphalib.Greating { *; }