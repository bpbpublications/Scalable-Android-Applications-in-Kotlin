class FragmentA : Fragment() {
    // Navigate to Fragment B and pass the User object as an argument
    fun navigateToFragmentB(user: User) {
        val action = FragmentADirections.actionFragmentAToFragmentB(user)
        findNavController().navigate(action)
    }
}
