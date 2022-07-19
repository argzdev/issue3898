# issue 3898
### GitHub link
- https://github.com/firebase/firebase-android-sdk/issues/3898
### Prerequisite
- Add google-services.json
### Steps to reproduce
- Open app
- Check logs and find error `E/FirebaseMessaging: Topic sync or token retrieval failed on hard failure exceptions: java.util.concurrent.ExecutionException: java.io.IOException: SERVICE_NOT_AVAILABLE. Won't retry the operation.`
### Summary
- Enabling `DebugAppCheckProviderFactory` in Android 6 to 9. Works properly for Android 10 to 12.
