# Add project specific ProGuard rules here

# -dontobfuscate
-optimizationpasses 5

# Remove Log.d messages
-assumenosideeffects class android.util.Log {
    public static int d(...);
}