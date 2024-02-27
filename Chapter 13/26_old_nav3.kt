class FragmentB : Fragment() {
    // Retrieve the User object from the arguments
    private val args: FragmentBArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Access the User object
        val user: User = args.user
    }
}
