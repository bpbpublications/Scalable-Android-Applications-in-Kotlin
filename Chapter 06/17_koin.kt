import com.aimicor.example.myapplication.UserViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val myModule = module {
    single { UserRepository() }
    factory { UserService1(get()) }
    viewModel { UserViewModel(get()) }
}
