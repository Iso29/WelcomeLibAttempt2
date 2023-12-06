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

-dontshrink

# Remove the keep rules for specific classes if you want them to be obfuscated
 -keep class com.example.welcomealphalib.Welcome {
      *;
 }

 -keep class com.example.welcomealphalib.WelcomeUtil {
      *;
 }

 -keep class com.example.welcomealphalib.Greating {
      *;
 }

# Add general keep rules for necessary components like Activities, Services, etc.
-keep public class * extends android.app.Activity
-keep public class * extends android.app.Service
-keep public class * extends android.content.BroadcastReceiver
-keep public class * extends android.content.ContentProvider

# Preserve annotations, interfaces, enums
-keepattributes *Annotation*, Signature
-keep public class * implements java.io.Serializable
-keep class **.R$* { *; }
-keepclasseswithmembers class * {
    native <methods>;
}

# Preserve custom views and their constructors
-keepclasseswithmembers class * {
    public <init>(android.content.Context);
    public <init>(android.content.Context, android.util.AttributeSet);
    public <init>(android.content.Context, android.util.AttributeSet, int);
}

# Preserve methods called via reflection
-keepclassmembers class * {
    *** *Field*(...);
    *** *Method*(...);
}

# The default rule for all other classes - they will be obfuscated
-dontwarn **

# General optimization and obfuscation settings
#-optimizationpasses 5
#-allowaccessmodification
#-repackageclasses ''