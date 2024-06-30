@RunWith(AndroidJUnit4::class)
class CustomButtonTest {

    @Rule
    @JvmField
    val composeTestRule = createComposeRule()

    @Test
    fun testButtonIsDisplayedAndClickable() {
        composeTestRule.setContent {
            // Your composable with a button (replace with your actual logic)
            Button(onClick = {}, text = "Click me")
        }

        // Find the button
        // Assert that the button is displayed and clickable
        composeTestRule.onNode(withText("Click me"))
            .assertIsDisplayed()
            .isClickable()
            .performClick() // Simulate a click
    }
}
