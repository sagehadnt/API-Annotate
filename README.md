# API-Annotate
A single annotation for annotating externally-consumed elements in your libraries.

## What? Why?
IDEs like IntelliJ helpfully flag up unused elements. But if you're writing a library, often you'll have lots of externally-facing functions and properties
that aren't consumed inside the project at all. The IDE will give a false positive warning on these, which can lead to real unused functions getting ignored
and never cleared up.

If you annotate your externally-consumed elements with `@API`, you can instruct your IDE to suppress warnings on those annotated elements by
following these steps:

**IntelliJ**:
 1. On the element with the warning, open the actions menu (Alt+Enter by default)
 2. Select "suppress unused warning if annotated by com.sagehadnt.apiannotate.API"

## Why not SuppressWarnings("unused")?
Because that doesn't tell the reader *why* we're suppressing those warnings. Having a dedicated annotation makes it unambiguous. The reader doesn't
have to waste mental effort figuring out what the writer was trying to do.

Also, I'd argue it's just cleaner:

```kotlin
@SuppressWarnings("unused")
fun info(msg: String) { /* ... */ }

@API
fun info(msg: String) { /* ... */ }
```
