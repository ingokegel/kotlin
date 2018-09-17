// TARGET_BACKEND: JVM
// IGNORE_BACKEND: JS, JS_IR, NATIVE
// WITH_RUNTIME

// FILE: A.kt
package a
import b.*

class A {
    fun foo() = ok

    companion object : B()
}

fun box(): String {
    return A().foo()
}

// FILE: B.kt
package b

open class B {
    @JvmField protected val ok = "OK"
}
