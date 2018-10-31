class LazyProperty(val initializer: () -> Int) {
    var _lazy: Int? = null
        private set
    val lazy: Int
        get() {
            if (_lazy == null) {
                _lazy = initializer()
            }
            return _lazy ?: throw AssertionError("lazy was set to null by another thread")
        }
}
