class ViewModelForFragmentB(
    savedStateHandle: SavedStateHandle,
    private val user: User = savedStateHandle.get<User>("user")
) : ViewModel() { /* ... */ }
