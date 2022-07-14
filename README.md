# issue 3898
### GitHub link
- https://github.com/firebase/firebase-android-sdk/issues/3898
### Prerequisite
- Add google-services.json
### Steps to reproduce
- Open app
- Check logs and find error `E/FirebaseMessaging: Topic sync or token retrieval failed on hard failure exceptions: java.util.concurrent.ExecutionException: java.io.IOException: SERVICE_NOT_AVAILABLE. Won't retry the operation.`
### Summary
- Retrieving token for Android 12 and above does not work.
- Code snippet: 
```
FirebaseMessaging.getInstance().token.addOnCompleteListener {
    if(it.isSuccessful) {
        println("->> token: ${it.result}")
        Toast.makeText(this, "Token: ${it.result}", Toast.LENGTH_LONG).show()
    } else {
        println("->> error: ${it.exception}")
        Toast.makeText(this, "Error: ${it.exception}", Toast.LENGTH_LONG).show()
    }
}
```
