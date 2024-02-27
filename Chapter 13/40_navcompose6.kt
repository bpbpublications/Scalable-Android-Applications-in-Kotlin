class ViewModelForScreenB(
    savedStateHandle: SavedStateHandle,
    private val user: User? = savedStateHandle.getNavParamOrNull(ParamKeys.screenB)
) : ViewModel() { /* ... */ }
