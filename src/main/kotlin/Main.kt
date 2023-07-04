import io.reactivex.rxjava3.core.Observable

fun main(args: Array<String>) {
    test()
}

fun test() {
    val observable = Observable.just("hello", "world")
    observable.subscribe { d -> println(d) }
}
