@file:JsModule("redux")
package redux

external fun <S, A> createStore(
        reducer: Reducer<S, A>,
        preloadedState: S,
        enhancer: Enhancer<S, dynamic, A> = definedExternally
): Store<S, A>

external interface Store<S, A> {
    fun getState(): S
    fun dispatch(action: A): A
    fun subscribe(listener: () -> Unit): () -> Unit
    fun replaceReducer(nextReducer: Reducer<S, A>)
}

external fun <S, A> combineReducers(reducers: dynamic): Reducer<S, A>
