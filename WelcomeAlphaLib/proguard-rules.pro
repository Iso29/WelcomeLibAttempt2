# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile
# Keep the entry point to the library



#-keep public class com.example.welcomealphalib.Welcome {
#    public *;
#    public static*;
#}
#new
# Allow obfuscation for other classes

#for which you want to generate this report
#-printusage <output-dir>/usage.txt

-dontshrink
-keep class com.example.welcomealphalib.Welcome {
    public static *;
    public *;
}

-keep class com.example.welcomealphalib.WelcomeUtil {
    public static *;
    public *;
}

# General optimization and obfuscation settings
#-optimizationpasses 5
#-allowaccessmodification
#-repackageclasses ''